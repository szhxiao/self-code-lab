# 第 18 章 Java I/O 系统

## 18.1 File 类

File 类既能代表一个特定文件的名称，又能代表一个目录下的一组文件的名称。

### 18.1.1 目录列表器

查看目录列表：

-   使用 File 对象，调用不带参数的 list()方法
-   使用 File 对象，添加目录过滤器

### 18.1.2 目录实用工具

### 18.1.3 目录的检查及创建

可以用 File 对象来创建新的目录或尚不存在的整个目录路径。

## 18.2 输入和输出

**流**代表任何有能力产出数据的数据源对象或有能力接收数据的接收端对象，屏蔽了实际的 I/O 设备中处理数据的细节。

Java 类库中的 I/O 类分成输入和输出两部分。

### 18.2.1 InputStream 类型

InputStream 的作用是表示那些**从不同数据源产生输入的类**。

InputStream 类型：

| 类                      | 功能                                                | 使用                                                                                                                                        |
| ----------------------- | --------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| ByteArrayInputStream    | 允许将内存的缓冲区当作 InputStream 使用             | 构造器参数：缓冲区，字节将从中取出; 作为数据源：将其与 FilterInputStream 对象相连以提供有用接口                                             |
| StringBufferInputStream | 将 String 转换成 InputStream                        | 构造器参数：字符串；作为数据源：将其与 FilterInputStream 对象相连以提供有用接口                                                             |
| FileInputStream         | 用于从文件中读取信息                                | 构造器参数：字符串，表示文件名、文件或 FileDescriptor 对象；作为数据源：将其与 FilterInputStream 对象相连以提供有用接口                     |
| PipedInputStream        | 产生用于写入相关 PipedOutputStream 的数据           | 构造器参数：PipedOutputStream ;作为多线程中数据源：将其与 FilterInputStream 对象相连以提供有用接口                                          |
| SequenceInputStream     | 将两个或多个 InputStream 对象转换成单一 InputStream | 构造器参数：两个 InputStream 对象或一个容纳 InputStream 对象的容器 Enumeration; 作为数据源：将其与 FilterInputStream 对象相连以提供有用接口 |
| FilterInputStream       | 抽象类，作为装饰器的接口                            |                                                                                                                                             |

### 18.2.2 OutputStream 类型

决定输出所要去往的目标：字节数组、文件或管道。

OutputStream 类型：

| 类                    | 功能                                                                       | 使用                                                                                                                         |
| --------------------- | -------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| ByteArrayOutputStream | 在内存中创建缓冲区，所有送往流的数据都要放置在此缓冲区                     | 构造器参数：缓冲区初始化尺寸；用于指定数据目的地：将其与 FilterOutputStream 对象相连以提供有用接口                           |
| FileOutputStream      | 用于将信息写至文件                                                         | 构造器参数：字符串，表示文件名、文件或 FileDescriptor 对象；指定数据目的地：将其与 FilterOutputStream 对象相连以提供有用接口 |
| PipedOutputStream     | 任何写入其中的信息都会自动作为相关 PipedInputStream 的输出，实现管道化概念 | 构造器参数：PipedInputStream;指定用于多线程的数据目的地：将其与 FilterOutputStream 对象相连以提供有用接口                    |
| FilterOutputStream    | 抽象类，作为装饰器的接口                                                   |                                                                                                                              |

## 18.3 添加属性和有用的接口

FilterInputStream 和 FilterOutputStream 是用来提供装饰器类接口以控制特定输入流和输出流的两个类。

### 18.3.1 通过 FilterInputStream 从 InputStream 读取数据

FilterInputStream 类型：

| 类                    | 功能                                                                 | 使用                                                                                              |
| --------------------- | -------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| DataInputStream       | 与 DataOutputStream 搭配使用，可以按照可移植方式从流读取基本数据类型 | 构造器参数：InputStream;包含用于读取基本类型数据的全部接口                                        |
| BufferedInputStream   | 防止每次读取时都进行实际写操作，代表“使用缓冲区”                     | 构造器参数：InputStream，可以指定缓冲区大小；本质上不提供接口，只不过是向进程中添加缓冲区所必需的 |
| LineNumberInputStream | 跟踪输入流中的行号，可调用 getLineNumber()和 setLineNumber()         | 构造器参数：InputStream;仅增加了行号，可能要与接口对象搭配使用                                    |
| PushbackInputStream   | 具有“能弹出一个字节的缓冲区”，可以将读到的最后一个字符回退           | 构造器参数：InputStream;通常作为编译器的扫描器                                                    |

### 18.3.2 通过 FilterOutputStream 向 OutputStream 写入

| 类                   | 功能                                                                  | 使用                                                        |
| -------------------- | --------------------------------------------------------------------- | ----------------------------------------------------------- |
| DataOutputStream     | 与 DataInputStream 搭配使用，可以按照可移植方式向流中写入基本类型数据 | 构造器参数：OutputStream;包含用于写入基本类型数据的全部接口 |
| PrintStream          | 用于产生格式化输出                                                    | 构造器参数：OutputStream;可以指示是否在每次换行时清空缓冲区 |
| BufferedOutputStream | 避免每次发送数据时都要时行实际的写操作，代表“使用缓冲区”              | 构造器参数：OutputStream;可以指定缓冲区大小                 |

## 18.4 Reader 和 Writer 对象

### 18.4.1 数据的来源和去处

### 18.4.2 更改流的行为

### 18.4.3 未发生变化的类

## 18.5 自我独立的类：RandomAccessFile

RandomAccessFile 适用于由大小已知的记录组成的文件，可以使用 seek()将记录从一处转移到另一处，然后读取或修改记录。

## 18.6 I/O 流的典型使用方式

### 18.6.1 缓冲输入文件

```java
public static String read(String filename) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(filename));
    String s;
    StringBuilder sb = new StringBuilder();
    while((s = in.readLine()) != null) {
        sb.append(s + "\n");
    }
    in.close();
    return sb.toString();
}
```

### 18.6.2 从内存输入

```java
StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.java"));
int c;
while((c = in.read()) != -1) {
    System.out.print((char)c);
}
```

### 18.6.3 格式化的内存输入

```java
DataInputStream in = new DataInputStream(new ByteArrayInputStream(
            BufferedInputFile.read("FormattedMemoryInput.java").getBytes()));
while(true) {
    System.out.print((char)in.readByte());
}
```

### 18.6.4 基本的文件输出

FileWriter 对象可以向文件写入数据。

```java
static String file = "BasicFileOutput.txt";
// 读操作
BufferedReader in = new BufferedReader(new StringReader(
            BufferedInputFile.read("BasicFileOutput.java")));
// 写操作
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

String s;
while((s = in.readLine()) != null) {
    out.println(s);
}
out.close();
```

### 18.6.5 存储和恢复数据

PrintWriter 可以对数据进行格式化，便于人们阅读。为了输出可供一个流恢复的数据，需要用 DataOutputStream 写入数据，并用 DataInputStream 恢复数据。

使用 DataOutputStream 写入数据，Java 保证可以使用 DataInputStream 准确地读取数据，无论读写的平台多么不同。

### 18.6.6 读写随机访问文件

### 18.6.7 管道流

## 18.7 文件读写的实用工具

## 18.8 标准 I/O

标准 I/O 的意义在于可以很容易地把程序串联起来，一个程序的标准输出可以成为另一个的标准输入。

### 18.8.1 从标准输入中读取

通常使用 readLine()一次一行地读取输入，将 System.in 包装成 BufferedReader 来使用。

### 18.8.2 将 System.out 转换成 PrintWriter

### 18.8.3 标准 I/O 重定向

## 18.9 进程控制

## 18.10 新 I/O

java.nio.\*包中引入了新的 Java I/O 类库，目的在于提高速度。

速度的提高来自于所使用的结构更接近于操作系统执行 I/O 的方式：**通道和缓冲器**。我们只和缓冲器交互，并把缓冲器派送到通道，通道要么从缓冲器获得数据，要么向缓冲器发送数据。

### 18.10.1 转换数据

### 18.10.2 获取基本类型

ByteBuffer 具有可以从其所容纳的字节中产生出各种不同基本类型值的方法。

向 ByteBuffer 插入基本类型数据的最简单方法是：利用 asCharBuffer()、asShortBuffer()等方法获得该缓冲器上的视图，然后使用视图的 put()方法。

### 18.10.3 视图缓冲器

视图缓冲器可以让我们通过某个特定的基本数据类型的视窗查看其底层的 ByteBuffer。

不同的机器可能会使用不同的字节排序方法来存储数据：

-   **big endian**(高位优先)：将最重要的字节存放在地址最低的存储器单元。
-   **little endian**(低位优先)：将最重要的字节放在地址最高的存储器单元。

### 18.10.4 用缓冲器操纵数据

### 18.10.5 缓冲器的细节

我们问题以操纵 ByteBuffer 为目标，它可以和通道进行交互。

### 18.10.6 内存映射文件

内存映射文件允许创建和修改因为太大而无法放入内存的文件。有了内存映射文件，就可以假定整个文件都放在内存中，而且可以完全把它当作非常大的数组来访问。

### 18.10.7 文件加锁

文件加锁机制允许我们同步访问某个作为共享资源的文件。

-   tryLock()是非阻塞式的，设法获取锁，如果不能获得将直接从方法调用返回
-   lock()是阻塞式的，阻塞进程直至锁可以获得，或调用 lock()的线程中断，或调用 lock()的通道关闭。

## 18.11 压缩

### 18.11.1 用 GZIP 进行简单压缩

GZIP 适合对单个数据流进行压缩。

### 18.11.2 用 ZIP 进行多文件保存

### 18.11.3 Java 档案文件

=======
## 18.12 对象序列化

### 18.12.1 寻找类

### 18.12.2 序列化控制

1. transient(瞬时)关键字

2. Externalizable 的替代方法

### 18.12.3 使用持久性

### 18.13 XML

### 18.14 Preferences

Preferences 是一个键－值集合，存储在一个节点层次结构中。
