#!D:/Software/Anaconda3/python.exe
import xml.etree.ElementTree as ET
import pandas
import sys
import os

'''
    说明：这个脚本用来将多个人的人脸训练模型文件合并到一个文件里
    用法：mergeXML <model_path>
    参数：model_path: 训练文件和csv文件所在路径
    输出：model.xml 合并后的识别模型文件
    存储结构：
    ~/src/
    .
    |-- mergeXML.py

    ~/model_path/
    .
    |-- at.csv
    |-- 0.xml
    |-- 1.xml
    |-- 2.xml
    ...
    |-- n.xml
    |-- model.xml

    csv文件结构：
    file_name_1;label_1
    file_name_2;label_2
    ...
    file_name_n;label_n
'''


def read_models(model_path):
    data = []

    data = pandas.read_csv(model_path + '/at.csv', ';', header=None)
    for index, row in data.iterrows():
        csv_data.append([row[0], row[1]])
    return data


def merge_models(model_path, template, csv_data):
    template_root = template.getroot()
    template_lbph = template_root.find('opencv_lbphfaces')
    template_histograms = template_lbph.find('histograms')
    template_labels = template_lbph.find('labels')
    template_labels_rows = template_labels.find('rows')
    template_labels_data = template_labels.find('data')
    labels = ''
    count = 0

    for file_name, label in csv_data:
        print(file_name, label)
        indi = ET.parse(model_path + '/' + file_name)
        indi_root = indi.getroot()
        indi_lbph = indi_root.find('opencv_lbphfaces')
        indi_histograms = indi_lbph.find('histograms')

        for vector in indi_histograms:
            template_histograms.append(vector)
            count += 1
            labels += str(label) + ' '

    template_labels_rows.text = str(count)
    template_labels_data.text = labels


if __name__ == '__main__':
    if len(sys.argv) != 2:
        print("usage: python mergeXML.py <model_path>")
        sys.exit(1)
    MODEL_PATH = sys.argv[1]
    # MODEL_PATH = 'F:/python/model/'

    template_xml_path = 'F:/python/model/template.xml'

    template = ET.parse(template_xml_path)

    csv_data = read_models(MODEL_PATH)
    merge_models(MODEL_PATH, template, csv_data)

    template.write(MODEL_PATH+'/model.xml')
    print('New model wrote to %smodel.xml' % MODEL_PATH)
