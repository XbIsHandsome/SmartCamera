#!D:\Software\Anaconda3
import cv2
import os
import sys
import datetime
import xml.etree.ElementTree as ET

'''
    此脚本未测试
    说明：这个脚本用来将识别摄像头中出现的多个人脸，并将出现过的标签输出到xml中
         使用这个脚本前先上传需要识别的人脸模型文件和csv文件，并先运行parseXML生成合并后的识别模型
    用法：python rf.py <semester> <week> <class_course_id> <during_time>
    参数：semester 课程学期
         week 课程周数
         class_course_id 课程ID
         during_time 上课时长(分钟数)
    输出：attend.xml
    存储结构：
    ~/src/
    .
    |-- rf.py

    ~/model_path/
    .
    |-- model.xml

    ~/result/
    .
    |-- attend.xml
    |-- template.xml

    xml文件结构：
    <data>
        <semester> </semester>
        <week> </week>
        <class_course_id> </class_course_id>
        <attends>
            <label> </label>
            <label> </label>
            <label> </label>
            ...
            <label> </label>
        <attends>
    </data>

'''


def face_rec(during_time):
    # 模型路径
    model_path = 'F:/python/model/model.xml'
    # 分类器路径
    cascade_path = 'F:/python/haarcascades/haarcascade_frontalface_alt2.xml'
    model = cv2.face.LBPHFaceRecognizer_create()
    model.read(model_path)

    camera = cv2.VideoCapture(0)
    face_cascade = cv2.CascadeClassifier(cascade_path)

    start_time = datetime.datetime.now()
    minutes = 0

    attends = set()

    while minutes < during_time:
        ret, frame = camera.read()
        faces = face_cascade.detectMultiScale(frame, 1.3, 5)

        for (x, y, w, h) in faces:
            gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
            roi = gray[y:y + h, x:x + w]
            try:
                roi = cv2.resize(roi, (200, 200), interpolation=cv2.INTER_LINEAR)
                params = model.predict(roi)
                print("Label: %s, Confidence: %.2f" % (params[0], params[1]))
                if params[1] <= 50:
                    attends.add(params[0])
            except:
                continue

        cv2.waitKey(100)
        minutes = (datetime.datetime.now() - start_time).minute

    return attends


def make_xml(semester, week, class_course_id, attends):
    # 结果XML模版路径
    template_xml_path = 'F:/python/result/template.xml'
    # 结果输出路径
    result_path = 'F:/python/result/'

    template = ET.parse(template_xml_path)
    template_root = template.getroot()
    template_semester = template_root.find('semester')
    template_week = template_root.find('week')
    template_class_course_id = template_root.find('class_course_id')
    template_attends = template_root.find('attends')

    template_semester.text = semester
    template_week.text = week
    template_class_course_id.text = class_course_id

    for label in attends:
        attend = ET.Element("label")
        attend.text = label
        template_attends.append(attend)

    template.write(result_path + '/result.xml')


if __name__ == '__main__':
    if len(sys.argv) != 5:
        print("usage: python rf.py <semester> <week> <class_course_id> <during_time>")
        sys.exit(1)
    SEMESTER = sys.argv[1]
    WEEK = sys.argv[2]
    CLASS_COURSE_ID = sys.argv[3]
    DURING_TIME = sys.argv[4]

    if not isinstance(SEMESTER, int):
        print("semester must be INT")
        sys.exit(1)
    if not isinstance(WEEK, int):
        print("week must be INT")
        sys.exit(1)
    if not isinstance(CLASS_COURSE_ID, int):
        print("class_course_id must be INT")
        sys.exit(1)
    if not isinstance(DURING_TIME, int):
        print("during_time must be INT")
        sys.exit(1)

    attends = face_rec(DURING_TIME)
    make_xml(SEMESTER, WEEK, CLASS_COURSE_ID, attends)
