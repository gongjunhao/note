#### Base Review



##### key words

* private、protected、public和default的区别

|           | 包內  | 同包  | 子类   |  包外 |  
| :------   |:-----:|:-----:|:-----:|:-----:|     
| public    | √     | √     | √     | √     | 
| protected | √     | √     | √     | ×     |
| default   | √     | √     | ×     | ×     |
| private   | √     | ×     | ×     | ×     |

* static 关键词
    * 可以修饰类，变量，方法，静态方法和静态变量在类加载的过程中读入内存（事实上是方法区）常驻内存。**static变量所指向的内存引用，如果不把它设置为null，GC是永远不会回收这个对象的**
    * 被static修饰的类： 一般为静态内部类
    * 被static修的代码块：类加载时自动执行一次，一般用于配置文件加载
    * 被static修饰的变量：类加载时初始化，Class级别属性，全局只有一份不会随着实例增加了增多，获取赋值：类.属性名即可，不需要实例化。
    * 被static修饰的方法：类级别方法，在类第一次加载的时候被加载到内存中；静态方法只能调用静态变量和静态方法


* transient关键词
    * 仅实现Serializable接口的对象，如果属性被transient关键词休息，则对象实例在被序列化后，被transient修饰的属性，无法被序列化
    * 如果实现Externalizable接口的对象，实现了writeExternal 和 readExternal方法，则被实现的属性即使被transient修饰，也能被序列化
    
* volatile关键词
    * 保证共享变量线程可见，无法保证原子性
    * 线程执行时，先把变量从主内存，拷贝到工作内存（线程内存），操作完后写回主内存，如果多线程情况下共享一个变量不使用volatile修饰，可能导致数据异常。


* abstract
* enum
* final
* finally
* instanceof
* native
* strictfp
* synchronized


* 集合类
* 并发包
* IO/NIO
* JVM
* 内存模型
* 泛型
* 异常
* 反射

