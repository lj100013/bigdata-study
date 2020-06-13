package org.lj

/*
* 伴生类与伴生对象
* 	1.伴生对象相当于存放静态变量和静态方法的地方(没有用static修改,用的是静态的单例(构造方法用private修饰,外界无法实例化)对象module$去调用方法或者属性)
*	  2.同一个包下,伴生类与伴生对象必须在同一个源文件中,否则编译会报错(推测应该是会生成两个 类名.class 的文件冲突),不同的包下不会报错
*	  3.伴生对象的apply()方法,实例化对象，不需要new 一个对象,直接 类名()实例化
*	  4.可以用作程序入口
*
* */

object AccompanyObject {
  def main(args: Array[String]): Unit = {
    val a = new A("lj")
    val b = new A("lyz")

    //通过伴生对象创建
    val c = A("lcj")
    println("创建对象个数:" + A.num)

  }
}

class A(name: String) {
  println("创建对象:" + name)
  A.join()

}

object A {
  var num = 0

  def join(): Unit = {
    num += 1
  }

  //创建对象
  def apply(name: String): A = new A(name)
}
