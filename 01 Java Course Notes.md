# 一、Java 概述

## 1. 什么是Java？

1995年，James Gosling 研制了 Java。

- Java 是一种编程语言
- Java 是一种平台

---

- 1）针对 PC：**Java SE**

  **Java SE 平台 = JRE + Tools & Tool APIs**

  **JRE = JVM + Java API + 其他组件**

![image-20210327100655627](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327100655627.png)

- 2）针对嵌入式设备和移动设备：**Java ME**

  对 Java SE进行语言精简，对运行环境进行优化；
  
  配置（Configuration）：从内存、处理器、网络等方面对运行时环境的规约（常见：CLDC和CDC）；
  
  轮廓（Profile）：扩充configuration，形成可用的API集合，应用程序针对特定profile编写；

- 3）针对企业级和高端服务器：Java EE

  参考：[Java Concept Map](https://www.oracle.com/technetwork/topics/newtojava/java-technology-concept-map-150250.pdf)

---

## 2. Java 的特性

### 1）简单性

语法和语义比较单纯，基本语法沿用继承C和C++；

忽略了 C++ 的复杂特性：

- 指针
- 多重继承
- 运算符重载
- goto
- 内存管理（Java 设计了自动内存回收机制）

提供了功能丰富的可重用类库，简化了编程工作量。

---

### 2）面向对象

Java是纯面向对象语言，更全面的支持面向对象。

本质上，Java的面向对象能力与C++相同。主要不同点在于多重继承，在Java 中，取而代之的是更简单的接口概念。与C++相比，Java提供了更丰富的运行时自省功能。

- 通过封装、继承和多态来提供灵活性、模块化和可重用性；
- 封装性：Java对象有模块化性质和信息隐藏能力；
- 继承性：单继承，通过接口实现多重继承的效果；
- 多态性：在继承的基础上，通过重写、向上转型（上塑造型）、动态绑定实现多态。

---

### 3）分布式

Java 有一个丰富的例程库， 用于处理像HTTP 和FIT 之类的TCP/IP 协议。Java 应用程序能够通过URL 打开和访问网络上的对象， 其便捷程度就好像访问本地文件一样。

- 数据分布
  - 通过Java的URL类可以访问网上的各类信息资源，访问方式完全类似于对本地文件的访问。
- 操作分布
  - Java程序（字节码）可以被传输并在互联网上的客户机上运行（例如网页中的Applet）；
  - 将计算从服务器分布至客户机，避免网络拥挤，提高系统效率；

---

### 4）健壮性

Java 和C++ 最大的不同在于Java 采用的指针模型可以消除重写内存和损坏数据的可能性。

Java 编译器能够检测许多在其他语言中仅在运行时才能够检测出来的问题。

- 自动垃圾收集：内存管理对程序员透明；
- 异常处理机制：在编译时发现部分意外；
- 强类型语言：编译时须经严格的类型检查。

---

### 5）安全性

Java 适用于网络/ 分布式环境。为了达到这个目标， 在安全方面投入了很大精力。使用Java 可以构建防病毒、防篡改的系统。

从一开始，Java 就设计成能够防范各种攻击，其中包括：

- 类装载器
- 字节码验证器：确保代码遵循下列规则
  - 不存在伪造的引用；
  - 未违反访问权限；
  - 严格遵循对象访问规范来访问对象；
  - 用合适的参数调用方法；
  - 没有栈溢出（蠕虫和病毒常用的攻击手段）；

  - 破坏自己的进程空间之外的内存。

---

### 6）体系结构中立

编译器生成一个**体系结构中立的目标文件格式**，这是一种编译过的代码（**标准的独立于硬件平台的中间语言**）， 只要有Java 运行时系统， 这些编译后的代码可以在许多处理器上运行。Java 编译器通过**生成与特定的计算机体系结构无关的字节码**指令来实现这一特性。精心设计的字节码不仅可以很容易地在任何机器上解释执行， 而且还可以动态地翻译成本地机器代码。

 为“虚拟机” 生成代码， 解释虚拟机指令比全速运行机器指令慢很多。然而， 虚拟机有一个选项，可以将执行最频繁的字节码序列翻译成机器码，这一过程被称为**即时编译**。

Java 虚拟机还有一些其他的优点。它可以检测指令序列的行为， 从而增强其安全性。

![image-20210327103942995](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327103942995.png)

---

### 7）可移植性

与C 和C++ 不同，Java 规范中没有“ 依赖具体实现” 的地方基本教据类型的大小以及有关运算都做了明确的说明。

在Java 中， **数据类型具有固定的大小**， 这消除了代码移植时令人头痛的主要问题。**二进制数据以固定的格式进行存储和传输**， 消除了字节顺序的困扰。**字符串是用标准的Unicode 格式存储的**。

---

### 8）解释型

Java 解释器可以在任何移植了解释器的机器上执行Java 字节码。由于链接是一个增量式且轻量级的过程， 所以， 开发过程也变得更加快捷， 更加具有探索性。

---

### 9）高性能

尽管对解释后的字节码性能已经比较满意， 但在有些场合下还需要更加高效的性能。字节码可以（在运行时刻）动态地翻译成对应运行这个应用的特定CPU 的机器码。

现在的**即时编译器**已经非常出色， 以至于成了传统编译器的竞争对手。在某些情况下， 甚至超越了传统编译器， 原因是**它们含有更多的可用信息**。即时编译器可以监控经常执行哪些代码并优化这些代码以提高速度。**更为复杂的优化是消除函数调用（即“内联”）**。即时编译器知道哪些类已经加载。基于当前加载的类集， 如果特定的函数不会被覆盖，就可以使用内联。必要时，还可以撤销优化。

---

### 10）多线程

多线程可以带来更好的交互响应和实时行为。

我们不再追求更快的处理器， 而是着眼于获得更多的处理器， 而且要让它们一直保持工作。

Java是第一个支持并发程序设计的主流语言。并发程序设计绝非易事，不过Java 在这方面表现很出色， 可以很好地管理这个工作。

---

###  11）动态性

从各种角度看， **Java 与C或C++相比更加具有动态性**。它能够适应不断发展的环境库中**可以自由地添加新方法和实例变量， 而对客户端却没有任何影响**。

当需要将某些代码添加到正在运行的程序中时， 动态性将是一个非常重要的特性。一个很好的例子是： 从Internet 下载代码， 然后在浏览器上运行。如果使用C 或C++，这确实难度很大，但Java这样的**动态语言可以很容易地实现运行程序的演进**。

---

## 3. Java applet 与 Internet

在网页中运行的Java程序称为**applet**。要使用applet，需要启用Java的Web浏览器执行字节码，不需要安装任何软件。任何时候只要访问包含applet的网页都会得到程序的最新版本。最重要的是，要感谢虚拟机的安全性，它让我们不必再担心来自恶意代码的攻击。

---

## 4. Java语法机制概述

与C++一致的语法机制：

- 数据类型
- 表达式
- 程序流控制
- 结构化异常处理
  …

与C++不同的语法机制：

- 类
- 接口(Interface)
- 程序包(Package)
- 取消指针

---
类的定义与C++的主要区别：
- Java不支持多重继承，通过接口实现多重继承的效果；
- Java引入了abstract和final关键字；
- abstract：定义抽象类（不能直接产生实例对象）；
- final：定义类不能作为父类被继承；

接口：
- 一种抽象类，其中只能出现静态常量或抽象方法定义；
- 主要目的：实现多重继承功能（类通过实现多个接口来实现多重继承）；

程序包：
- 一系列相关类或接口的集合；
- Java的可重用类库的组织方式，如**java.lang**，**java.util**等；

- 用户可自定义程序包；

- 通过**import**语句将程序包引入应用程序。

取消指针：
- 通过**new操作符**进行所有动态内存请求；
- 通过**new**操作符得到的引用，**不能通过直接修改它的值来指向另一内存地址**。

---

## 5. Java虚拟机

定义：一种在真实计算机上通过软件仿真实现的虚构机器。

- Java SE 平台 = JRE + Tools & Tool APIs
- JRE = JVM + Java API + 其他组件

### 1）Java 虚拟机规范
JVM 规范定义了一组抽象的逻辑组件，包括：
- **指令集**
- **寄存器组**：程序计数器、栈顶指针等
- **.class** 文件的格式
- 栈结构：提供各种参数等
- **存储区**：存放字节码的方法代码、符号表
- **垃圾收集器**

下载：[JVM](https://docs.oracle.com/javase/specs/)

---

### 2）Java 运行系统

各平台厂商对JVM的具体实现：
- JVM 需针对不同的软硬件平台做专门实现
- 实现要求：**必须符合JVM规范**（使得所有**运行系统能够执行统一格式的字节码**）

运行系统的类型


- Java Application — Java解释器

- Java Applet — Java兼容的Web浏览器

运行系统的组成

- 类装载器
- 字节码验证器
- 解释器
- 即时编译器
- 运行支持库

![image-20210327112119099](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327112119099.png)

---

## 6. Java Hello World

![image-20210327120921925](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327120921925.png)

主类：
- 与源文件名称相同的类，通常定义为public class
- 每个源文件中至多有一个public class

主类中的 main()方法声明
- `public static void main(String[] args){…}`
- 是Java程序入口点

源文件扩展名必须是 **.java**

编译
- `javac HelloWord.java`
- 生成 HelloWorld.class

执行
- `java HelloWorld`

---

# 二、面向对象

面向对象程序设计是使用“对象”设计程序的编程范式；

- 对象是由数据字段、方法及它们之间的交互组成的数据结构。

允许根据问题来描述问题，而不是根据运行解决方案的计算机来描述问题。

![image-20210327145309062](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327145309062.png)

---

## 1. 面向对象基本原则

**Alan Kay (1980年，Alan Kay研制了Smalltalk) 的OOP五大原则**：

- 一切皆对象；
- 程序是一系列对象的组合，对象间通过消息传递进行联系；
- 每个对象都有自身内存空间，可容纳其他对象；
- 每个对象都有一种类型；
- 同一类型的所有对象都能够接收相同的消息；
- 面向对象方法的核心概念：抽象、对象、类、封装、继承和多态。

**面向对象编程的主要特点**：

- **封装性**：实现模块化和信息隐藏，有利于程序的可移植性；
- **继承性**：定义对象之间的层次关系，下层对象继承了上层对象的特性，可以实现程序代码重用，并且有效地组织整个程序’
- **多态性**：使得在程序运行时，对象的一种接口可以提供多种不同的操作，提高程序的灵活性。

---

### 1） 抽象

**抽象是一种设计技术**：用以说明一个实体的本质方面，而忽略或掩盖其非本质方面。

**抽象是一种工具**：用以将复杂现象简化到可以分析、实验或者可以理解的程度。

抽象的作用

- 简化：识别重要细节，忽略无关细节

- 过滤问题空间中模型的无关侧面

  ![image-20210327145856976](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327145856976.png)

- 抽象是OOP的基础
  - 单个实体可能有多种抽象
  - OOP过程需要确定将哪些属性和行为包括在给定的抽象中
  
- 抽象是对象与类联系的关键
  
  - 通过在抽象基础上对抽象结果的组织来联系

---

### 2）对象

- 对象是：
  - 问题空间中可以明确标识的**实体**；
  - 问题空间的实体或概念在解空间中的**抽象表示**。

- 对象的组成：

  - **对象** = 状态（特征、数据、属性）+ 行为（动作、操作、服务）（+ 标识，Booch）；
  - **状态**：具有当前值的数据域（Java：**成员变量**）；
  - **行为**：用于设置或改变对象的状态，或对外提供一种服务（Java：**方法**）。

- 状态与行为之间的关系：
  - 对内：只有方法能操作成员变量；
  - 对外：方法是对象与外部环境（其他对象）交互、通信的接口。

- 对象之间通过**发送消息**进行交互与通信

  - 消息通过对方法的调用来实现；
  - 消息的组成：
    - 接收消息的对象
    - 方法名称
    - 方法参数

  - **消息由发送者对象编写，由接收者对象解释**

  - 消息可以：

    - 引起接收者状态变化

    - 返回结果

- 如何产生有用的对象
  - 确定可能向对象发出的**请求**；
    - 在屏幕上画图
    - ......
  - 由对象的接口（interface）定义这些请求。

- 接口确定了对特定对象所能发出的请求，或对象接收消息的方式：
- 对象如何与类联系：通过在抽象基础上对抽象结果的组织来联系；
- 接口是“组织”的依据之一。

---

### 3）类

In OOP, a class is an extensible program-code-template for creating objects, providing initial values for state (member variables) and implementations of behavior (member functions, methods). [wiki](http://en.wikipedia.org)

**在面向对象程序设计中，类是一个可扩展的程序代码模板，用于创建一类对象并为对象提供成员变量初始值和方法实现**。

类与对象的关系：

- 类是同种对象的集合与抽象
- 类描述对象的共同的数据特征和行为特征
- 类的实例化就是对象

---

### 4）封装

定义：把数据和方法包装进类中，并对具体实现进行隐藏。

- 类是基本的封装单元，一个类的所有对象实例有相同的封装特性；
- “具体实现”包括：对象的数据域、方法实现以及非接口方法的定义等；
- 对数据的完全隐藏是对象的理想结构，现实中使用public、protected、private关键字实现4种隐藏能力（访问权限）。

意义

- **模块化**：不同对象代码间相对独立，对象可以在系统中方便移动；
- **保证数据对象的一致性**：通过隐藏对象变量和方法实现，防止绕过接口更改变量；
- **易于维护**：对私有变量和私有方法的更改，不会影响到调用对象接口的其他程序，提高了程序的可移植性。

---

### 5）继承

现实世界中的对象间关系：

- 包含（has a）：对象A是对象B的组成部分；
- 关联：对象A中保存对象B的一个引用而非对象B本身；
- 继承（is a）：对象A是对象B的特例，抽象 → 具体。

---

含义：**描述子类与父类之间的关系**。

- 子类：从某个特定类派生出来的类；
- 父类：派生出某个特定类的类；
- 关系：
  - 子类**继承父类**的变量和方法
  - 子类可以**增加**新的变量和方法
  - 子类可以**重写(Override)**继承来的方法

**继承关系可以有多层，子类要继承它所有父类的方法与状态**。

一个类可以用 `extends` 关键字显式地继承另一个类。

如果没有显式地继承其他类，则隐含继承java.lang.Object类：

- Java.lang包中的Object类是最顶层的类，所有其他的类都是它直接或间接的子类；
- Object类型的变量可以指向任意类型的对象（upcasting）；
- Object类提供了所有Java对象都需要的行为（方法）。

---

继承的优点：

- 重用父类中的代码；
- 将一般行为与特殊行为分离；
  - 一般行为包含在父类中；
  - 从父类继承得到的特定子类，实现特殊行为的具体细节（**新变量、新方法、重写父类方法**）。

---

### 6）多态

泛指能够创建多于一种形式的变量、方法和对象的能力。

形式：

- **编译时多态**：通过方法重载（overloading）实现；
- **运行时多态**：通过方法重写、向上转型和动态绑定，达到“**对外一个接口，内部多种实现**”。

编译时多态：

- 一个类中定义多个名称相同但参数不同的方法

运行时多态：
- 以继承为基础；
- 改变从父类继承的行为（方法重写，overriding）；
- 将子类对象当作父类对象看待（向上转型，upcasting）；
- 在运行时确定接收消息的对象的类型及其行为（动态绑定，dynamic binding）。

---

# 三、Java语言基础

## 1. 标识符、关键字与数据类型

关键字 `final` 表示这个变量只能被赋值，一旦被赋值后，就不能再更改。例如：`final double CM_PER_INCH = 3.33;`  。

- **类常量**：希望某个常量可以在一个类中的多个方法中使用，通常将这些常量称为类常量。可以使用关键字 `static final` 设置一个类常量。通常，类常量的定义位于main方法的外部。

- 标识符用来对变量、类和方法进行命名
- 命名规则：
  - 一个由字母、“_”、“$” 和数字组成的不限长度的序列；
  - 以字母，”_”（下划线）或”$”起始；
  - 不能以数字起始；
  - 不能是Java关键字；
  - 不能是true、false或null；
  - 大小写敏感；

**E.g.: username，user_name，_sys_varl，$change**

---

- 风格约定
  - **不使用“_”、“$”作为标识符的第一个字符**；
  - **类名、接口名**：所有单词首字母大写，其余字母小写；
  - **变量名、方法名**：首单词小写，其余单词的首字母大写，如 **anyVariableWorld**；
  - **常量名完全大写，由“_”分隔**；
  - <font color=red>**方法名使用动词，类名和接口名使用名词，变量名尽量有含义**。</font>

---

- // 注释一行
- /* 注释一行或多行 */
- /** 可用javadoc命令转化为HTML文件 */

---
**关键字**

![image-20210327153628113](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327153628113.png)

`const` 和 `goto` 是C++的关键字，Java虽然将其保留为关键字，但Java尚未使用它们；`true`,  `false` 和 `null` 虽然不是关键字，但也被Java保留，不能用作标志符。

---

**数据类型**

- 类型的意义
  - 限定变量和表达式的取值范围
  - 限定在特定值上能够执行的操作
  - 确定运算符的意义

- **基本数据类型**
  - 逻辑型：boolean（boolean truth = true;）
  - 文本型：char（char  mychar=‘Q’;）
  - 整型：byte, short, int, long
  - 浮点型：double, float

- **复合数据类型（引用类型）**
    - 类
    - 接口
    - 数组
    - 枚举类型（J2SE 5.0）

---

- Unicode：国际标准字符集

  - 是一套字符编码系统，可支持各类文字的字符；
  - 支持的字符编码范围为0x0000至0x10FFFF；
  - Unicode的实现方式：Unicode转换格式（Unicode Transformation Format，简称为UTF）。
    - 一个字符的Unicode编码是确定的，但对Unicode编码的实现方式有所不同；
    - 目前通用的实现方式：UTF-16小端序（LE）、UTF-16大端序（BE）和UTF-8。

  |         | **ASCII**     | **Unicode**           |
  | ------- | ------------- | --------------------- |
  | **A-Z** | **0x41-0x5a** | **0x0041-0x005a**     |
  | **a-z** | **0x61-0x7a** | **0x0061-0x007a**     |
  | **0-9** | **0x30-0x39** | **0x0030-0x0039**     |
  | 汉字……  | **——**        | **0x4E00–0x9FFF** |


---
Java中的转义字符序列表示

![image-20210327154301599](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327154301599.png)

---

**变量**

变量的分类

- 从语言机制上划分：数据类型分基本类型和引用类型，相应地，变量类型也分基本类型和引用类型；
- 根据作用域划分：
  - 成员变量
  - 局部变量
  - 方法参数
  - catch语句块入口参数（异常处理参数）

引用类型变量的声明与引用

- 基本类型变量在声明时，直接分配数据空间，例如：
  - int a;
  - a = 12;
- 引用类型变量在声明时，不直接分配数据空间，而仅仅分配引用空间，必须经过实例化，才能开辟数据空间，例如：
  - Date  today;
  - today = new Date( ); //实例化
  - ![image-20210327165544423](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327165544423.png)
  - ![image-20210327165652829](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327165652829.png)

变量的作用域

- 局部变量：从声明变量的位置开始，到包含该变量的代码块结束为止
- 类成员变量：至少包括整个类
- 方法参数：所在方法的内部
- catch语句块入口参数：catch语句块

变量的初始化

- 对象的成员变量的默认初始值（系统自动初始化）

  ![image-20210327170018050](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327170018050.png)

- <font color=red>**局部变量必须在使用前手动赋初始值，若局部变量未初始化就使用，编译器报错**</font>。

---

注意事项：

- Java中布尔值与整型值之间不能相互转换；
- String 不是基本数据类型，是类；（String greeting=“Good Morning! ”;）
- **String对象表示的字符串不能修改，如需修改字符串，应使用StringBuilder类**。
- **StringBuffer类与StringBuilder类相似，也是可修改类；其执行效率低于StringBuilder类，但线程安全**。
- ![image-20210327160248281](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327160248281.png)
- 整型常量默认为int类型
  - byte或short类型的常量与int类型常量的形式相同；
  - long类型的常量后应加 L 或 l 。
  - ![image-20210327160411369](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327160411369.png)
- ![image-20210327160449721](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327160449721.png)
- 浮点型常量
  - **浮点型常量默认为double类型**；
  - **float类型的常量后必须加 F 或 f** ；
  - **double类型的常量后可以加 D 或 d** ；
  - 浮点型常量的表达方法：
    - E或e：   科学记数法    	   6.02e23
    - F或f：	表示float类型	    6.02e23F
    - D或d：   表示double 型	   2.718D
  - NaN是无序的；
  - 除了NaN之外的浮点数集合中的所有元素都是有序的；
  - 浮点数0.0和-0.0也需特别注意。

---

```java
public class P15_CharConst {
    public static void main(String[] args){
        //String c1 = "CYB";
        char c1 = 'Q';
        char c2 = 'Q';
        char c3 = '\u0051';
        char c4 = 0x0051;
        System.out.println(c1+";" + c2+";" + c3+";" + c4+";" + '\121');
    }
}
```

输出：`CYB;Q;Q;Q;Q`

---

```java
class Date{
	int day;
	int month;
	int year;
	void setDate( int a, int b, int c){... }
} // Java用class创建新的类型（复合数据类型）
```



---

## 2.表达式与语句

将运算符与操作数按照特定规则连接起来，就构成了通常意义的表达式。Java运算符与C语言的不同之处：

- Java的类型限制比C严格，运算符的操作对象的类型会受到更多限制；
- **Java不提供指针运算符**；
- Java增加了：
  - **类型测试运算符 instanceof**
  - **字符串运算符 +**
  - **零填充的右移 >>>**

---

运算符

![image-20210327171915874](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327171915874.png)

- 一元算术运算符：`+, -, ++, --`
  - 能够将byte/short/char类型的操作数自动提升为int型；
  - 位运算符～也具有类似的类型转换效果。

- 二元算术运算中的自动类型转换
  - 检查两个操作数的类型 `(type1,type2)`：
  - if `(double,*)` 或 `(*,double)`，then * → double；
  - else if `(float,*)` 或 `(*,float)`，then * → float；
  - else if `(long,*)` 或 `(*,long)`，then * → long；
  - else `(*,*)` → `(int,int)`。

注意：

- 即使两个操作数全是byte型或short型，运算结果也是int型；
- 整型之间的 / 运算和 % 运算中除数为0时会产生异常；
- % 的操作数可以为浮点数：9.5%3=0.5
- 只有当被除数为负数时，余数才是负数：-7%3=-1	20%-13=7；
- `+` 运算可以连接字符串：
  String  salutation = “Dr. ”;
  String name = “Pete ” + “Seymour” ;
  String title = salutation + name ;
  则title 值：Dr. Pete Seymour
  

---

关系运算符

- 计算操作数之间的关系并得到boolean结果
- 数值型的关系运算符遵循与二元算术运算符相同的自动类型转换规则
- 测试对象的等价性
  - **“==”和”!=”比较的是对象的引用而非对象的内容**
  - **比较对象的内容是否相等——重写equals()方法**
    - 所有对象都拥有从Object类继承的equals()方法
    - **equals()方法默认也是比较对象的引用**
    - **需要对equals()方法进行重写，以比较对象内容**
    - 多数Java类库都通过重写equals()实现了对于对象内容的比较。

---

逻辑运算符

- &, |			称为**不短路**与、或
- &&, ||		称为**短路**与、或
- 短路：在逻辑表达式计算过程中，**一旦部分运算结果能够确定整个表达式的值，则不再计算表达式的余下部分**。

---

位运算符

- 右移运算符>>和>>>
`>>`：带符号右移
1010 … >> 2 → 111010 …
`>>>`：无符号右移，以 0 填充

- 当逻辑运算符与位运算符相同时，根据操作数判定是何种运算（&、|、^）。

---

赋值运算符及赋值中的类型转换

![image-20210327182757760](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327182757760.png)

虚线表示有可能损失精度：

- int n = 123456789;
- float f = n; // f is 1.23456792E8

---

强制类型转换

- 将较大范围类型的操作数值转换为较小范围类型的操作数值时，需要强制类型转换

- 一般形式：**`(type) expression`**
  例：`(float)x/2`

- 对强制类型转换的限制：
  - 整型与浮点型可以相互转换
  - **基本类型和数组、对象等引用类型之间不能互相转换**
  - **逻辑型与整型之间不能互相转换**
  - **逻辑型与浮点型之间不能互相转换**
- 截尾和舍入
  - 由float/double类型向int/long类型强制转换时，执行截尾操作；
  - 要得到舍入结果，需使用 `java.lang.Math` 的 `round()` 方法。

---

运算符的优先级与结合方向

![image-20210327183828873](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327183828873.png)

---

## 3.程序控制流



![image-20210327190627244](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327190627244.png)

---

Java SE 5.0后的for循环新形式：

将一个集合作为一个整体放入for循环中，在for循环中可将集合中的元素进行逐个处理，例：

```java
String[] names = {”Wang”,”Zhang”,”Li”,”Wu”};
	for(String option: names) {
	System.out.println(option);
	}
```

在循环条件中不要使用浮点值来比较值是否相等，否则可能导致不精确的循环次数和结果

```java
double item=1, sum=0;

while(item!=0){
sum+=item;
item-=0.2;
}
```

---

if-else

逻辑型与整型之间不能相互转换，循环与分支条件必须得到一个逻辑型的值，不能像C那样接受整型：

- C：		int x=3; if(x){…}
- Java：	**int x=3; if(x!=0){…}**

条件运算符  ?:  是if-else的一种紧缩格式表达

---

switch

- switch整型表达式的值必须是int兼容的类型，即byte, short, char或int；
- 不论执行哪个分支，程序都会继续执行直至遇到break语句或到达整个switch语句末尾才结束switch语句。

---

跳转语句

- **break [label]**
  从switch语句、循环语句中跳出。
- **continue[label]**
  跳过标号循环体的其余部分，不带label 跳过最内层循环的剩余语句。
- **label: statement**

---

## 4. 数组

![image-20210327191806357](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327191806357.png)

数组的声明

![image-20210327191824242](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327191824242.png)

数组的创建：

![image-20210327191905687](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327191905687.png)

数组的初始化

![image-20210327192052058](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327192052058.png)

数组的访问

![image-20210327193024272](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327193024272.png)

数组的复制

![image-20210327193159114](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327193159114.png)

![image-20210327193217845](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327193217845.png)

![image-20210327193254448](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327193254448.png)

多维数组

![image-20210327193351895](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327193351895.png)

![image-20210327193600283](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210327193600283.png)

---

## 5. 注意事项

- 关键字 `strictfp` 可以对类进行标记，以使得这个类中的所有方法都要使用严格的浮点计算，而不进行截断。
- 在 Math 类中，包含了各种各样的数学函数。在编写不同类别的程序时，可能需要的换函数也不同。
  - 幂运算：Math.pow(x, a);
  - π常量和e常量的近似值：Math.PI，Math.E
  - 若想省略Math.，则只需要在源文件的顶部加上代码：`import static java.lang.Math.*;`

- 强制类型转换：x += 3.5;，如果x为int类型，则该语句会强制将结果转化为int类型，故相当于：(int)(x+3.5);。

- 自增、自减运算符的前缀形式和后缀形式：前缀形式会先完成自增运算，后缀形式会使用变量原来的值。

- 短路方式的逻辑与和逻辑或：&&、||，拖过第一个操作数已经能够确定表达式的值，第二个操作数就不比计算了。

- Java支持三元运算符：`condition ? expr1:expr2`；

- += 是右结合运算符，所以表达式：`a += b += c` 等价于：`a += (b += c)`。

- 不可变字符串修改：String类没有提供用于修改字符串的方法，如果希望修改可以通过拼接的方法，比如：

  ```java
  String greeting = "Help!";
  greeting = greeting.substring(0,3) + "p!!!";
  ```

  该方法虽然效率不高，但是，不可变字符串有一个优点：编译器可以让字符串共享。

- 检测/比较字符串是否相等：

  ```java
  String s = "hello";
  String t = "java";
  
   // 区分大小写比较字符串
  s.equals(t);
  // 不区分大小写
  s.equalsIgnoreCase(t);
  ```

- 空串与 Null 串

  ```java
  // 比较空串与Null串
  String str = "world";
  if(str != null && str.length() != 0){   
  }
  ```

- 构建字符串（使用StringBuilder类快速并且节省空间）

```java
// 构建字符串
StringBuilder builder = new StringBuilder();
// 需要添加内容时，使用append() 方法
builder.append(s);
builder.append(t);
// 转换为字符串
String completeString = builder.toString();
```

- 读取输入：Scanner类

  ```java
  // 读取输入
  // step1: 构造一个Scanner对象，并与标准输入流 System.in 关联
  Scanner in = new Scanner(System.in);
  // step2: 使用Scanner类的各种方法实现输入操作
  System.out.println("What's your last name?");
  // 使用该方法是因为在输入行中可能包含空格
  String name = in.nextLine();
  System.out.println("What's your first name?");
  // 读取一个单词（以空格作为分隔符）
  String firstName = in.next();
  System.out.println("How old are u?");
  // 读取一个整数
  int age = in.nextInt();
  System.out.println("What's your hight?");
  // 读取浮点数
  Double hight = in.nextDouble();
  // 输出结果
  System.out.println(name + ", " + firstName + ", " + age + ", " + hight);
  ```

- 读取密码：Console对象

- 格式化输出

  ```java
          // 格式化输出
          float f1 = 3.1415926535f;
          double f2 = 3.1415926535;
          // printf 与 c语言相同
          System.out.printf("%8.4f", f1);
  
          // 使用多个参数
          String name = "Neo";
          int age = 23;
          System.out.printf("Hello, %s. Next year, you'll be %d!", name, age);
  ```

- 流程控制语句：注意case！

- 大数值 BigInteger和BigDecimal两个类。

  ```java
          // 大数值
          BigInteger a = BigInteger.valueOf(100);
          BigDecimal b = BigDecimal.valueOf(50);
          // 运算
          BigInteger c = a.add(a);
          BigInteger d = c.multiply(BigInteger.valueOf(2));
  ```

- 数组初始化与增强循环

  ```java
  // 数组
  int[] names = new int [10];
  for(int i = 0; i < 10; i++){
        names[i] = i;
  }
  
  // 增强循环 for each
  int[] arry = {1,2,3,4,5,6,7,8,9,10};
  // 重新初始化数组 arry
  arry = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  for (int ele:arry){
         System.out.println(ele);
  }
  ```

- 数组拷贝

  ```java
          // 数组拷贝
          int[] anonymous = {21,22,23,24,25};
          arry = anonymous;
  
          int[] luckyNumbers = arry;
          luckyNumbers[0] = 12; // 修改数组元素
  
          // copyOf方法
          // 第二个位置参数指定新数组的长度，通常用来改变数组的大小，多于元素用0填充
          int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
          
          int[] y = new int[100];
  ```

- 数组排序：Arrays.sort(arry)，优化了快速排序算法。

- 多维数组：

  ```java
          // 多维数组
          double [][] balences;
          int years = 12; salary = 25;
          balences = new double[years][salary];
          
          int [][] magicSquare = {
                  {16, 3, 2, 13},
                  {5, 10, 11, 8},
                  {9, 6, 7, 12},
                  {4, 15, 14, 1}
          };
  ```

  ---

# 四、对象与类（面向对象）



Java是完全面向对象的。**面向对象的程序是由对象组成的，每个对象包含对用户公开的特定功能部分和隐藏的实现部分**。只要对象能够满足要求，就不必关心其功能的具体实现过程。

传统的结构化程序设计通过设计一系列的过程（即算法）来求解问题。一旦确定了这些过程，就要开始考虑存储数据的方式。这决定了程序员的工作方式：首先要确定如何操作数据，然后再决定如何组织数据，以便于数据操作。而OOP却调换了这个次序，**将数据放在第一位，然后再考虑操作数据的算法**。



![image-20210406141010168](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406141010168.png)

## 1.OOP概述

### 1）类

在OOP中，类是一个可扩展的程序代码模板，用于创建一类对象并为对象提供成员变量初始值和方法实现。

**类是将同一类对象都具有的数据和行为进行封装所形成的复合数据类型**。

- 类是同种对象的集合与抽象；
- 定义和描述了一类对象的共同的数据特征和行为特征；
- 类是创建对象的一种模板，对象是类的具体实例。

**类（class）**是构造对象的模板或蓝图。由类构造（construct）对象的过程称为创建类的**实例（instance）**。

用Java编写的所有代码都位于某个类的内部。

**封装（encapsulation，有时称为数据隐藏）**是与对象有关的一个重要概念。封装将数据和行为组合在一个包中，并对对象的使用者隐藏了数据的实现方式。对象中的数据称为**实例域（instance field）**，操纵数据的过程称为**方法（method）**。对于每个特定的类实例（对象）都有一组特定的实例域值。这些值的集合就是这个对象的当前状态（state）。

**实现封装的关键在于绝对不能让类中的方法直接地访问其他类的实例域**。程序仅通过对象的方法与对象数据进行交互。封装给对象赋予了“黑盒”特征，这是提高重用性和可靠性的关键。

OOP的另一个原则是可以通过扩展一个类来建立另外一个新的类——**继承（inheritance）**。在Java中，所有的类都源自于一个“神通广大的超类”——Object。扩展后的新类具有所扩展的类的全部属性和方法。

### 2）对象

要使用OOP，一定要清楚对象的三个主要特性：

- 对象的行为（behavior）
- 对象的状态（state）
- 对象标识（identity）

同一个类的所有对象实例，由于支持相同的行为而具有家族式的相似性。**对象的行为是可调用的方法定义的**。

每个对象都保存着描述当前特征的信息。这就是对象的状态。对象的状态可能会随着时间而发生改变，但这种改变不会是自发的，**对象状态的改变必须通过调用方法实现**。

每个对象都有一个唯一的身份（identity）。作为一个类的实例，每个对象的标识永远是不同的，状态常常也存在着差异。

类之间常见的关系如表4-1所示，常用UML（Unified Modeling Language，统一建模语言）绘制类图，用来描述类之间的关系。

![image-20210406144648911](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406144648911.png)

类用矩形表示，类之间的关系用带有各种修饰的箭头表示。

---

### 3）OOP三个关键特点

- 封装 (Encapsulation)
- 将对象的数据与操作数据的方法相结合，通过方法来保护对象的数据与实现细节。
- 继承 (Inheritance)
  - 子类是父类的特例，继承父类的状态和行为
  - Java只支持单继承，多继承须通过接口实现
- 多态(Polymorphism)
  - 编译时多态：overloading
  - 运行时多态：“对外一个接口，内部多种实现”
    - 重写（overriding）
    - 向上转型（upcasting）
    - 动态绑定（dynamic binding）

---

## 2. 使用预定义类

在Java中并非所有类都具有面向对象特征。例如Math类只需要知道方法名和参数，而不必要了解它的具体实现过程，所有类都是如此。但Math类只封装了功能，它不需要也不必隐藏数据。由于没有数据，因此也不必担心生成对象以及初始化实例域。

在Java中，使用构造器（constructor）构造新实例。构造器是一种特殊的方法，用来构造并初始化对象。

构造器的名字应该与类名相同。因此Date类的构造器名为Date。要想构造一个Date对象，需要在构造器前面加上new操作符，如下所示：

```java
new Date()
```

这个表达式构造了一个对象。这个对象被初始化为当前的日期和时间。Date类有一个toString方法：

```java
String s = new Date().toString();
```

为了让构造的对象多次使用，可以将对象存放在一个变量中：

```java
Date birthday = new Date();
```

![image-20210406150028895](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406150028895.png)

```java
Date deadline;
deadline = birthday;
```

![image-20210406150315483](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406150315483.png)

**一个对象变量并没有实际包含一个对象，而仅仅引用一个对象**。

Java中，**任何对象变量的值都是对存储在另外一个地方的一个对象的引用**。**new操作符的返回值也是一个引用**！

---

### 1）LocalDate类

Date类的实例有一个状态，即特定的时间点。

时间是用距离一个固定时间点的毫秒数（可正可负）表示的——纪元（epoch），它是UTC（Coordinated Universal Time，协调世界时）时间1970年1月1日00:00:00。与GMT（Greeniwich Mean Time，格林威治时间）一样，是一种科学标准时间。

Java类库分别包含了两个时间相关的类：一个是用来表示时间点的Date类；另一个是用来表示大家熟悉的日历表示法的LocalDate类。

不要使用构造器来构造LocalDate类的对象，而应该使用静态工厂（factory method）方法代表你调用构造器：

```java
LocalDate.now()
```

构造一个特定日期的对象：

```java
LocalDate newYearEve = LocalDate.of(2021, 4, 6);
```

一旦构建了该对象，则可使用以下方法：

```java
int year = newYearEve.getYear();
int month = newYearEve.getMonthValue();
int day = newYearEve.getDayOfMonth();
```

plusDays方法会得到一个新的LocalDate，即新日期对象是距当前对象指定**天数**的一个新日期：

```java
LocalDate aThousandDaysLater = newYearEve.plusDays(1000);
```

该方法调用之后，并不会改变原对象。类似的还有toUpperCase，这个字符串仍保持不变，但会返回一个将字符串大写的新字符串！

---

## 3. 用户自定义类

一个完整的程序是若干类的组合，其中只有一个类有main方法，没有的称为主力类（workhorse class），只有实例域和实例方法。

```java
类定义 = 类声明 + 类体
类体由以下4部分组成
  成员变量声明
  构造方法声明
  成员方法声明
  初始化程序块
```

```java
[public][abstract|final] class 类名 [extends 父类名] [implements 接口名列表] {…}
```

- `public`：用来声明任意类均可访问该类。

- `缺省（非public）`：只有与该类在同一包中的类可访问该类一个Java源文件中至多只能有一个public类，该类的类名应与该源文件的文件名相同。

- `abstract`：声明该类为抽象类。

- `final`：声明该类不能被继承。
- `extends`：表示该类从父类继承得到。
- 父类名可以是用户自定义的类，也可以是Java预定义的类。
- `implements`：该类实现了接口名列表中的所有接口。

以一个简单的Employee类为例：

![image-20210406161712337](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406161712337.png)

![image-20210406161747492](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406161747492.png)

![image-20210406161810810](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406161810810.png)

在这个程序中，构造了一个Employee数组，并填入了三个雇员对象；然后，使用raiseSalary方法将每个雇员的薪水提高5%；最后调用方法将每个雇员的信息打印出来。

原文件名与public类的名字必须相同，在一个源文件中，只能有一个公有类，但是可以有任意数目的非公有类。

编译代码，编译器将在目录下创建两个类文件：EmployeeTest.class和Employee.class。

将程序中包含main方法的类名提供给字节码解释器，以便启动这个程序：

```java
java EmployeeTest
```

这个类包含一个构造器和四个方法：

![image-20210406162653268](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406162653268.png)

这个类的所有方法都被标记为 public。**关键字public意味着任何类的任何方法都可以调用这些方法**。

注意在Employee类的实例中有三个实例域用来存放将要操作的数据：

![image-20210406162827563](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406162827563.png)

关键字private确保只有Employee类自身的方法能够访问这些实例域，而其他类的方法不能偶读写这些域。

**构造器总是伴随着new操作符的执行被调用，而不能对一个已经存在的对象调用构造器来达到重新设置实例域的目的**。

需要记住：

- 构造器与类同名；
- 每个类可以有一个以上的构造器；
- 构造器可以有0个、1个或多个参数；
- 构造器没有返回值；
- 构造器总是伴随着new操作一起调用。

---

可以将实例域定义为final。构建对象时必须初始化这样的域，在后面的操作中，不能够再对它进行修改。例如：

```java
class Employee
{
    private final String name;
}
```

final 修饰符大都应用于**基本（primitive）**类型域或**不可变（immutable）**类的域（如果类中的每个方法都不会改变其对象，这种类就是不可变的类）。

---

## 4. 静态域与静态方法

**静态域（static）**

如果将域定义为static，每个类中只有一个这样的域。而每一个对象对于所有的实例域都有自己的一份拷贝。例如，给每一个雇员赋予唯一的标识码。添加一个实例域id和一个静态域nextId：

![image-20210406165446325](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406165446325.png)

现在，每一个雇员对象都有一个自己的id域，但这个类的所有实例将共享一个nextId域。静态域nextId属于类，不属于任何独立的对象。

**静态常量**

![image-20210406165859022](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406165859022.png)

使用Math.PI可以获得这个常量。

### 1）静态方法

静态方法是一种不能向对象实施操作的方法。以下两种情况下使用静态方法：

- 一个方法不需要访问对象状态，其所需参数都是通过显式参数提供；
- 一个方法只需要访问类的静态域。

---

### 2）工厂方法

静态方法还有另外一种常见的用途。类似LocalDate和NumberFormat的类使用静态工厂方法（factory method）来构造对象。

![image-20210406170434409](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406170434409.png)

---

### 3）main方法

注意，不需要适用对象调用静态方法！main方法不对任何对象进行操作。Employee类的main方法永远不会执行！

---

## 5. 方法参数

参数传递的两种方式：

- 按值调用（call by value）：方法接收的是调用者提供的值。
- 按引用调用（call by reference）：方法接收的是调用者提供的变量地址。

**一个方法可以修改传递引用所对应的变量值，而不能修改传递值调用所对应的变量值**。

**Java总是采用按值调用**！——方法得到的是所有参数值的一个拷贝，方法不能修改传递给它的任何参数变量的内容。

以下调用，percent的值不变：

```java
double percent = 10;
harry.raiseSalary(percent);
```

另一种情况，假定一个方法视图将一个参数值增加至3倍：

```java
public static void tripleValue(double x){
    x = 3 * x; // doesn't work
}
```

然后调用这个方法：

```java
double percent = 10;
tripleValue(percent);
```

调用这个方法之后percent还是10，对值参数的修改并没有保存，调用之后，参数变量x不再使用。

![image-20210406172014341](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406172014341.png)

这说明，一个方法不可能修改一个基本数据类型的参数。而对象引用作为参数就可以很容易地利用下面这个方法实现将一个雇员的薪金提高两倍的操作。

```java
public static void tripleSalary(Employee x){
    x.raiseSalary(200); // works
}
```

![image-20210406172352136](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406172352136.png)

**方法得到的是对象引用的拷贝，对象引用及其他的拷贝同时引用同一个对象**。

---

Java中方法参数的使用：

- 一个方法不能修改一个基本数据类型的参数；
- 一个方法可以改变一个对象参数的状态；
- 一个方法不能让对象参数引用一个新的对象。

---

## 6. 对象构造

**重载（overloading）**：如果多个方法有相同名字、不同的参数，便产生了重载。

**默认域初始化**：如果在构造器中没有显式地给域赋予初始值，那么就会被自动地赋为默认值：数值为0、布尔值为False、对象引用为null。

**无参数的构造器**：其状态会设置为适当的默认值。

![image-20210406174235280](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406174235280.png)

**调用另一个构造器**：this关键字参数，这样对公共的构造器代码部分只编写一次即可。

![image-20210406174507293](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406174507293.png)

初始化块：在一个类的声明中，可以包含多个代码块。只要构造类的对象，这些块就会被执行。

![image-20210406174703056](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210406174703056.png)

---

## 7. 包

Java允许使用包（package）将类组织起来。借助于包可以方便地组织自己的代码，并将自己的代码与别人提供的代码库分开管理。

标准的Java库分布在多个包中，包括java.lang、java.util和java.net等。所有标准的Java包具有一个层次结构，所有标准的Java包都处于java和javax包层次中。

两种方式访问另一个包中的共有类：

1. 在每个类名之前添加完整的包名：

   ```java
   java.time.LocalDate today = java.time.LocalDate.now();
   ```

   

2. 使用import语句：

```java
import java.util.*;
import java.time.LocalDate;
```

---

## 8. 类路径

---

## 9. 文档注释

---

## 10. 类设计技巧

1. 一定要保证数据私有
2. 一定要对数据初始化
3. 不要再类中使用过多的基本类型
4. 不是所有的域都需要独立的域访问器和域更改器
5. 将职责过多的类进行分解
6. 类名和方法名应该能够体现它们的职责
7. 优先使用不可变的类

---

## Summary

类定义 = 类声明+类体

类体由以下四部分组成：

- 成员变量声明
- 构造方法声明
- 成员方法声明
- 初始化程序块

### 类声明

```java
[public][abstract|final] class 类名 [extends 父类名] [implements 接口名列表] {…}
```

- public：用来声明任意类均可访问该类。
- 缺省（非public）：只有与该类在同一包中的类可访问该类。
- **一个java源文件中至多只能有一个public类**，该类的类名与该文件的文件名相同。
- abstract：声明该类为抽象类。
- final：声明该类不能被继承。
- extends：表示该类从父类继承得到。
- 父类名可以是用户自定义的类，也可以是Java预定义的类。
- implements：该类实现了接口名列表中的所有接口。

---

### 成员变量声明

```java
[public|protected|private][static][final][transient][volatile] 类型  变量名;
```

- public|protected|private：成员变量的访问权限。

- static：**限制该成员变量为类变量**（无static：该成员变量为实例变量）。

- final：**用于声明一个常量，该常量的值在程序中不能修改**。

- transient：声明一个暂时性变量。

- volatile：禁止编译器通过保存多线程共享变量的多个拷贝来提高效率。

显式初始化：成员变量声明中可以包含简单的赋值表达式，这种在声明成员变量时对变量的显式赋值称为显式初始化。

---

### 成员方法声明

```java
[public|protected|private][static][final|abstract][native][synchronized] 返回类型 方法名([参数列表]) [throws 异常类型列表] { [语句块] }
```

- public, protected, private, static：与成员变量类似
- abstract：声明该方法是抽象方法，无方法体
- final：声明方法不能被重写
- native：本地方法
- synchronized：多线程访问共享数据
- throws：抛出异常的列表（第六章）
- 在方法声明时，还有以下问题需要注意：
  - 可变长参数列表
  - 形如：类型…参数名
  - Java将可变长参数作为数组对待
  - 可变长参数只能作为方法参数列表中最后一个参数
- 若局部变量名与类的成员变量名相同，则类的成员变量被隐藏，需使用this将该成员变量显露出来。

---

### 构造方法声明

```java
[public|protected|private] 类名 ( [参数列表] ) { [语句块] }
```

构造方法的特点

- 构造方法的名称必须与类名相同
- 构造方法没有返回值，这与返回值为void不同
- 构造方法在创建一个对象时调用，调用时必须使用关键字new

```java
class Circle{
	private double radius;
    
	public Circle(double r){ radius=r; }
}
```

缺省构造方法：对于没有定义构造方法的类，Java编译器会自动加入一个特殊的构造方法，该构造方法没有参数且方法体为空，称为缺省构造方法。

- 用缺省构造方法初始化对象时，对象的成员变量初始化为默认值。
- 若类中已定义了构造方法，则编译器不再向类中加入缺省构造方法。

```java
class Bird {
	int i;
	// public Bird(int j){ i=j; }
}

class DefaultConstructor {
	public static void main(String[] args) {
		Bird nc = new Bird(); // 缺省构造方法
	}
}
```

第三行的构造方法被注释，只存在缺省构造方法，故此程序正确。如果去掉第三行注释符，因为提供了构造方法，不再插入缺省构造方法，则此时第七行将出现编译错误。

---

### 访问控制权限

权限修饰符：public | protected | private | (default/package)。

包：**相关类与接口的一个集合，提供了类的命名空间的管理和访问保护**。

包机制的好处：

- 容易根据所需的功能找到相应的类和接口；
- 每个包都提供独立的命名空间，不同包中的同名类之间不会冲突；
- 同一个包中的类之间有比较宽松的访问权限控制。

包的定义

- package pkg1[.pkg2[.pkg3…]]
- 包分隔符”.”相当于目录分隔符
- 从源文件编译出的.class文件应放在包存储路径中

包定义语句在每个源程序中只能有一条，即一个类只能属于一个包。

包定义语句必须在程序代码的第一行（除注释之外）。

包成员：包中的类和接口。

包成员的访问方法：

- 第1步: `import pkg1[.pkg2[.pkg3 …]].(类名|*)`；
- `pkg1[.pkg2[.pkg3 …]]` 表示包层次，对应于文件目录；
- “类名”指明所要引入的类；
- 通配符*表示引入该包中的所有类。

**使用包成员**：使用短名（类名）引用包成员；使用长名（“包名.类名”）引用包成员（过于繁琐，一般仅当两个包中含有同名类时，为区分同名类才使用）。

![image-20210413191320664](C:\Users\34123\AppData\Roaming\Typora\typora-user-images\image-20210413191320664.png)



---

# 5. 继承







