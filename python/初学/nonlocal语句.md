##Nonlocal语句

在内嵌函数中如何修改闭包中的变量呢？这时候就到了nonlocal出场了。

Python3 中引进了nonlocal语句，它和global语句差不多，不过就是global语句是应用于全局模块作用域，nonlocal 应用于嵌套函数内作用域中的一个名称。
在声明nonlocal名称的时候，它必须存在于该嵌套函数的作用域中，并且不能由def中的第一次赋值创建。
使用如下


```Python
import tkinter
import tkinter.messagebox


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

