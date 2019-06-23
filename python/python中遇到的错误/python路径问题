## python路径问题
在运行程序的时候出现过这种错误：
```
(unicode error) 'unicodeescape' codec can't decode bytes in position 2-3: truncated \UXXXXXXXX escape (PythonApplication1.py, line 2)
```
举个例子，在文件中我传入的文件路径是这样的
```python
sys.path.append('c:\Users\mshacxiang\VScode_project\web_ddt')
```
原因分析：在windows系统当中读取文件路径可以使用\,但是在python字符串中\有转义的含义，如\t可代表TAB，\n代表换行，所以我们需要采取一些方式使得\不被解读为转义字符。目前有3个解决方案

1、在路径前面加r，即保持字符原始值的意思。
```python
sys.path.append(r'c:\Users\mshacxiang\VScode_project\web_ddt')
```
2、替换为双反斜杠
```python
sys.path.append('c:\\Users\\mshacxiang\\VScode_project\\web_ddt')
```
3、替换为正斜杠
```python
sys.path.append('c:/Users/mshacxiang/VScode_project/web_ddt')
```
