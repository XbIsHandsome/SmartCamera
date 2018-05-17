此文件夹用于存放运行在Jetson-TK1上的python脚本和文件结构示例
文件结构

~/python/
.
|-- haarcascades 哈尔级联分类器
|
|-- model 存放人脸识别所用模型文件
|   |-- model.xml
|   |-- 1.xml
|   ...
|   |-- n.xml 一个班n个人的每个人的识别模型文件
|   |-- at.csv 1~n.xml 对应的标签(ID)
|
|-- result.xml 存放上课识别结果(到课情况)
|
|-- src 存放python脚本文件
|   |-- mergeXML.py 合并多个单独的识别模型到一个文件里
|   |-- rf.py 识别多个人脸，生成到课情况文件
