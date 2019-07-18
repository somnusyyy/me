1.global关键字用来在函数或其他局部作用域中使用全局变量。但是如果不修改全局变量也可以不使用global关键字。


```PYTHON
gcount = 0

def global_test():
    gcount+=1
    print (gcount)
global_test()

#以上代码会报错：第一行定义了全局变量，在内部函数中又对外部函数进行了引用并修改，
#那么python会认为它是一个局部变量，有因为内部函数没有对其gcount进行定义和赋值，所以报错。
 
gcount = 0
 
def global_test():
    global  gcount
    gcount+=1
    print (gcount)
global_test()

```

2、 nonlocal声明的变量不是局部变量,也不是全局变量,而是外部嵌套函数内的变量

```PYTHON
def make_counter():
    count = 0
    def counter():
        nonlocal count
        count += 1
        return count
    return counter
        
def make_counter_test():
  mc = make_counter()
  print(mc())
  print(mc())
  print(mc())
  
make_counter_test()
```

　以上输出为：

1

2

3
