# 学生管理系统
## 1.2学生管理系统实现思路
- 1、定义学生类
- 2、主界面的代码编写
- 3、添加学生的代码编写
- 4、查看学生的代码编写
- 5、删除学生的代码编写
- 6、修改学生的代码编写

## 1.3 定义学生类
- 学生类
    - Student
- 成员变量
    - 学号：sid
    - 姓名：name
    - 年龄：age
    - 居住地：address
- 构造方法
    - 无参构造方法
    - 带四个参数的构造方法
- 成员方法
    - 每个成员对应给出的get/set方法
    
## 1.4 主界面的编写
- 思路
    - 用输出语句完成主界面的编写
    - 用Scanner实现键盘录入数据
    - 用switch语句完成操作的选择
    - 用循环完成再次回到主界面
    
## 1.5 添加学生的代码编写
- 思路
    - 用键盘录入选择添加学生
    - 定义一个方法，用于添加学生
        - 显示提示信息，提示要输入何种信息
        - 键盘录入学生对象所需要的数据
        - 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        - 将学生对象添加到集合中（保存）
        - 给出添加成功提示
        
## 1.6 查看学生的代码编写
- 思路
    - 定义一个方法用于查看学生信息
        - 显示表头信息
        - 将集合中数据取出按照对应格式显示学生信息，年龄显示补充"岁"
    - 调用方法
    
## 1.7 删除学生信息代码
- 思路
    - 用键盘记录选择删除学生信息
    - 定义一个方法，用于删除学生信息
        - 显示提示信息
        - 键盘录入要删除的学生学号
        - 遍历集合将对应学生对象从集合中删除
        - 给出删除成功提示
        
## 1.8 修改学生信息代码
- 思路
    - 用键盘记录选择修改学生信息
    - 定义一个方法，用于修改学生信息
        - 显示提示信息
        - 键盘录入要修改的学生信息
        - 遍历集合将对应学生信息修改
        - 给出修改成功信息