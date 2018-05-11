#!D:\Software\Anaconda3
import cv2
import os
import sys

'''
	此脚本未完成
    说明：这个脚本用来将识别摄像头中出现的多个人脸，并将出现过的标签输出到csv中
         使用这个脚本前先上传需要识别的人脸模型文件和csv文件，并先运行parseXML生成合并后的识别模型
    用法：python rf.py
    参数：
    输出：attend.csv 
    存储结构：
    ~/src/
    .
    |-- rf.py
    
    ~/model_path/
    .
    |-- model.xml
    
    ~/result/
    .
    |-- <date_time>.csv
    
    csv文件结构：
    
    
'''


def face_rec():
    model = cv2.face.LBPHFaceRecognizer_create()
    model.read('mymodel.xml')

    camera = cv2.VideoCapture(1)
    face_cascade = cv2.CascadeClassifier(
        'F:/python/haarcascades/haarcascade_frontalface_alt2.xml')
    while True:
        ret, frame = camera.read()
        faces = face_cascade.detectMultiScale(frame, 1.3, 5)
        for (images, labels, w, h) in faces:
            cv2.rectangle(frame, (images, labels), (images + w, labels + h), (255, 0, 0), 2)
            gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
            roi = gray[labels:labels + h, images:images + w]
            try:
                roi = cv2.resize(roi, (200, 200), interpolation=cv2.INTER_LINEAR)
                params = model.predict(roi)
                print("Label: %s, Confidence: %.2f" % (params[0], params[1]))
                if params[1] <= 80:
                    cv2.putText(frame, names[params[0]], (images, labels-20), cv2.FONT_HERSHEY_SIMPLEX, 1, 255, 2)
            except:
                continue
        cv2.imshow('face', frame)
        if cv2.waitKey(1) & 0xff == 27:
            break

    cv2.destroyAllWindows()


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("usage: python rf.py <model_path> <>")
        sys.exit(1)

    if len(sys.argv) == 3:
        out_dir = sys.argv[2]
