#!D:\Software\Anaconda3
import cv2
import os
import sys
import datetime

'''
    此脚本未测试
    说明：这个脚本用来将识别摄像头中出现的多个人脸
         使用这个脚本前先上传需要识别的人脸模型文件和csv文件，并先运行parseXML生成合并后的识别模型
    用法：python rf.py <during_time>
    参数：during_time 上课时长(分钟数)
    输出：
    存储结构：
    ~/src/
    .
    |-- rf.py

    ~/model_path/
    .
    |-- model.xml
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


if __name__ == '__main__':
    if len(sys.argv) != 2:
        print("usage: python rf.py <during_time>")
        sys.exit(1)
    DURING_TIME = sys.argv[1]

    if not isinstance(DURING_TIME, int):
        print("during_time must be INT")
        sys.exit(1)

    attends = face_rec(DURING_TIME)
    for attend in attends:
        print(attend, end=',')
