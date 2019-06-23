
pip install requests 


报的错误信息如下：
Requirement already satisfied: requests in c:\users\大帅哥\appdata\local\programs\python\python37-32\lib\site-packages (2.21.0)
Requirement already satisfied: urllib3<1.25,>=1.21.1 in c:\users\大帅哥\appdata\local\programs\python\python37-32\lib\site-packages (from requests) (1.24.1)
Requirement already satisfied: idna<2.9,>=2.5 in c:\users\大帅哥\appdata\local\programs\python\python37-32\lib\site-packages (from requests) (2.8)
Requirement already satisfied: chardet<3.1.0,>=3.0.2 in c:\users\大帅哥\appdata\local\programs\python\python37-32\lib\site-packages (from requests) (3.0.4)
Requirement already satisfied: certifi>=2017.4.17 in c:\users\大帅哥\appdata\local\programs\python\python37-32\lib\site-packages (from requests) (2019.3.9)
解决办发:

    加上更新参数

pip install requests   --upgrade
