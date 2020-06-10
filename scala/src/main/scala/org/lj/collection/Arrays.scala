package org.lj.collection

/*
* 数组相关的使用
* 1.数组属于集合中的序列,序列分为索引序列(底层为数组)和线性序列(底层为链表)
* 2.数组有可变数组和不可变数组,不可变是长度不能改变,可以改变其中的值
*   可变数组效率高,不可变数组需要改变时,需要重新创建或者拷贝,可以很方便的在原集合上进行增删改查
*   不可变数组线程安全,无需支持可变,更节省空间和时间开销
*
*
* */
object Arrays {

  def main(args: Array[String]): Unit = {
    mutableArrayCreate
  }

  /*
  * 不可变数组的创建
  * */
  def mutableArrayCreate(): Unit = {
    //方式1.指定数组类型和长度
    val a = new Array[String](3)
    a.foreach(println _)
    //方式2. 直接赋值
    val b = Array(1, 2, 3)
    b.foreach(println _)
  }

}
