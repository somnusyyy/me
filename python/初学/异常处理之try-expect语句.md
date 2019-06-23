Python中检测处理异常是非常重要的，这可以增加代码的健壮性，我们在写python程序的时候，会可能会遇到一些不可预料的情况，一旦遇到这些情况，运行时程序便可能会崩溃。

比如：读写文件时候文件打开错误或者文件写入错误，写爬虫时网络请求失败，返回错误404.再或者函数处理一些不确定参数时候，都可以用到异常捕获。

异常可以通过 try 语句来检测. 任何在 try 语句块里的代码都会被监测, 检查有无异常发生。

try 语句有两种主要形式: try-except 和 try-finally . 这两个语句是互斥的, 也就是说你只能使用其中的一种 . 
一个 try 语句可以对应一个或多个 except 子句 , 但只能对应一个finally 子句, 或是一个 try-except-finally 复合语句.

### try-except 语句
最常见的 try-except 语句语法如下所示，它由try块和except块 (try_suite 和 except_suite )组成, 也可以有一个可选的错误原因。首先尝试执行 try 子句, 如果没有错误,
忽略所有的 except 从句继续执行，如果发生异常, 解释器将在这一串处理器(except 子句)中查找匹配的异常。

```python
def main():
    try:
        with open('C:\\Users\\大帅哥\\source\\repos\\text1.txt','r',encoding='utf-8') as f:
            print(f.read())
    except FileNotFoundError:
        print('无法打开指定的文件!')
    except LookupError:
        print('指定了未知的编码!')
    except UnicodeDecodeError:
        print('读取文件时解码错误!')


if __name__=='__main__':
    main()

```
