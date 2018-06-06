#### Base Review



##### key words

* private、protected、public和default的区别

|           | 包內  | 同包  | 子类   |  包外 |  
| :------   |:-----:|:-----:|:-----:|:-----:|     
| public    | √     | √     | √     | √     | 
| protected | √     | √     | √     | ×     |
| default   | √     | √     | ×     | ×     |
| private   | √     | ×     | ×     | ×     |


* transient关键词
    * 仅实现Serializable接口的对象，如果属性被transient关键词休息，则对象实例在被序列化后，被transient修饰的属性，无法被序列化
    * 如果实现Externalizable接口的对象，实现了writeExternal 和 readExternal方法，则被实现的属性即使被transient修饰，也能被序列化
