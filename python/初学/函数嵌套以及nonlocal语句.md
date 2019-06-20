1、闭包的概念：

闭包(closure)是函数式编程的重要的语法结构。如果在一个内部函数里，对在外部作用域(但不是在全局作用域）的变量进行引用，
那么内部函数就被认为是 closure。定义在外部函数内的但由内部函数引用或者使用的变量被称为自由变量。closures 在函数式编程中是一个重要的概念
实际就是函数嵌套

```Python
import tkinter
import tkinter.messagebox


2、Nonlocal语句

前面讲了闭包，那我们在内嵌函数中如何修改闭包中的变量呢？这时候就到了nonlocal出场了。

Python3 中引进了nonlocal语句，它和global语句差不多，不过就是global语句是应用于全局模块作用域，nonlocal 应用于嵌套函数内作用域中的一个名称。
在声明nonlocal名称的时候，它必须存在于该嵌套函数的作用域中，并且不能由def中的第一次赋值创建。
使用如下

def outer(x):
    init=x
    def inn(y):
        nonlocal init#Nonlocal允许内嵌的函数来修改闭包变量。

        init = x+ y
        return init
    return inn

def main():
    tes=outer(5)#传入第一个参数为x
    print(tes(5))#传入第二个参数为y
    print(test(2))

if __name__ == '__main__':
    main()
```

