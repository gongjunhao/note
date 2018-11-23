### JVM

#### 内存模型

![jvm内存模型](https://github.com/gongjunhao/note/blob/master/asset/pic/JVM%E5%86%85%E5%AD%98%E6%A8%A1%E5%9E%8B.png)

#### 参数

* 标准参数
    ```
    -d32	  使用 32 位数据模型 (如果可用)
        -d64	  使用 64 位数据模型 (如果可用)
        -server	  选择 "server" VM
                      默认 VM 是 server,
                      因为您是在服务器类计算机上运行。
    
    
        -cp <目录和 zip/jar 文件的类搜索路径>
        -classpath <目录和 zip/jar 文件的类搜索路径>
                      用 : 分隔的目录, JAR 档案
                      和 ZIP 档案列表, 用于搜索类文件。
        -D<名称>=<值>
                      设置系统属性
        -verbose:[class|gc|jni]
                      启用详细输出
        -version      输出产品版本并退出
        -version:<值>
                      警告: 此功能已过时, 将在
                      未来发行版中删除。
                      需要指定的版本才能运行
        -showversion  输出产品版本并继续
        -jre-restrict-search | -no-jre-restrict-search
                      警告: 此功能已过时, 将在
                      未来发行版中删除。
                      在版本搜索中包括/排除用户专用 JRE
        -? -help      输出此帮助消息
        -X            输出非标准选项的帮助
        -ea[:<packagename>...|:<classname>]
        -enableassertions[:<packagename>...|:<classname>]
                      按指定的粒度启用断言
        -da[:<packagename>...|:<classname>]
        -disableassertions[:<packagename>...|:<classname>]
                      禁用具有指定粒度的断言
        -esa | -enablesystemassertions
                      启用系统断言
        -dsa | -disablesystemassertions
                      禁用系统断言
        -agentlib:<libname>[=<选项>]
                      加载本机代理库 <libname>, 例如 -agentlib:hprof
                      另请参阅 -agentlib:jdwp=help 和 -agentlib:hprof=help
        -agentpath:<pathname>[=<选项>]
                      按完整路径名加载本机代理库
        -javaagent:<jarpath>[=<选项>]
                      加载 Java 编程语言代理, 请参阅 java.lang.instrument
        -splash:<imagepath>
                      使用指定的图像显示启动屏幕
    ```
    
* X参数(非标准化的参数在将来的版本中可能会改变。所有的这类参数都以-X开始，并且可以用java -X来检索)
    ```
    -Xmixed           混合模式执行 (默认)
        -Xint             仅解释模式执行
        -Xbootclasspath:<用 : 分隔的目录和 zip/jar 文件>
                          设置搜索路径以引导类和资源
        -Xbootclasspath/a:<用 : 分隔的目录和 zip/jar 文件>
                          附加在引导类路径末尾
        -Xbootclasspath/p:<用 : 分隔的目录和 zip/jar 文件>
                          置于引导类路径之前
        -Xdiag            显示附加诊断消息
        -Xnoclassgc       禁用类垃圾收集
        -Xincgc           启用增量垃圾收集
        -Xloggc:<file>    将 GC 状态记录在文件中 (带时间戳)
        -Xbatch           禁用后台编译
        -Xms<size>        设置初始 Java 堆大小
        -Xmx<size>        设置最大 Java 堆大小
        -Xss<size>        设置 Java 线程堆栈大小
        -Xprof            输出 cpu 配置文件数据
        -Xfuture          启用最严格的检查, 预期将来的默认值
        -Xrs              减少 Java/VM 对操作系统信号的使用 (请参阅文档)
        -Xcheck:jni       对 JNI 函数执行其他检查
        -Xshare:off       不尝试使用共享类数据
        -Xshare:auto      在可能的情况下使用共享类数据 (默认)
        -Xshare:on        要求使用共享类数据, 否则将失败。
        -XshowSettings    显示所有设置并继续
        -XshowSettings:all
                          显示所有设置并继续
        -XshowSettings:vm 显示所有与 vm 相关的设置并继续
        -XshowSettings:properties
                          显示所有属性设置并继续
        -XshowSettings:locale
                          显示所有与区域设置相关的设置并继续
    ```
* XX参数（到目前为止最多的），它们同样不是标准的，甚至很长一段时间内不被列出来（参考[【Java HotSpot VM Options】](https://www.oracle.com/technetwork/java/javase/tech/vmoptions-jsp-140102.html)）
    - 行为参数
    - 垃圾回收参数
    - 性能参数
    - 调试参数
    > 对于布尔类型的参数，我们有”+”或”-“，然后才设置JVM选项的实际名称。例如，-XX:+<name>用于激活<name>选项，而-XX:-<name>用于注销选项。
    > 对于需要非布尔值的参数，如string或者integer，我们先写参数的名称，后面加上”=”，最后赋值。例如，  -XX:<name>=<value>给<name>赋值<value>。
    

* Some options 

参数          | 默认值         | 描述
------------ | :-------------: | ------------
-XX:+PrintFlagsFinal | -   | 打印所有flag
-XX:+PrintCompilation | -  | 打印编译信息
-XX:+PrintGCDetails | -    | 打印垃圾回收信息
-XX:+CITime         | -    | 打印编译时间统计信息
-XX:+PrintCommandLineFlags | - |打印出那些已经被用户或者JVM设置过的详细的XX参数的名称和值

* 内存调优

参数          | 默认值         | 描述
------------ | :-------------: | ------------
-XX:InitialHeapSize| jvm内置 | 初始化堆内存大小 128m 简写：-Xms128m
-XX:MaxHeapSize| jvm内置 | 指定最大堆内存大小 2g  简写-Xmx2g
-XX:+HeapDumpOnOutOfMemoryError |- |JVM在发生内存溢出时自动的生成堆内存快照
-XX:HeapDumpPath|JVM的启动目录下名为java_pid<pid>.hprof 的文件里|堆内存快照生成路径,堆内存快照文件有可能很庞大
-XX:OnOutOfMemoryError | null| 当内存溢发生时，我们甚至可以可以执行一些指令 比如-XX:OnOutOfMemoryError ="sh ~/cleanup.sh"
-XX:PermSize | jvm内置 |  设置永久代初始大小 单位 b kb m g
-XX:MaxPermSize | jvm内置| 设置永久代大小的最大值 单位 b kb m g
-XX:InitialCodeCacheSize |jvm内置|设置代码缓存初始大小 用来存储已编译方法生成的本地代码
-XX:ReservedCodeCacheSize|jvm内置|设置保留代码缓存大小 保留已编译的本地代码大小 谨慎自定义，如果空间过小会导致jvm切换到interpreted-only模式，JIT编译器被停用，性能运行速度会降低一个数量级
-XX:+UseCodeCacheFlushing |+|避免当代码缓存被填满的时候JVM切换到interpreted-only 模式。当代码缓存被填满时让JVM放弃一些编译代码






