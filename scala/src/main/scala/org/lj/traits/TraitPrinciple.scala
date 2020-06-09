package org.lj.traits

/*
*  desc: trait相当于java中的 抽象类和接口的结合,scala中没有接口的说法
*        编译器编译过后会生成两个A.class(java中的接口,声明的方法)  A$class.class (已经实现了的静态方法方法)
*        A.class
*              public abstract void sayHi();
*              public abstract void sayHello();
*         A$class.class
*              public static void sayHello(A $this)
*                 {
*                    Predef..MODULE$.println("Hello...");
*                  }
*
* */
object TraitPrinciple {
  def main(args: Array[String]): Unit = {
    new TraitPrinciple().sayHi
    new TraitPrinciple().sayHello
    //    println("hh")
  }
}

class TraitPrinciple extends A {
  override def sayHi(): Unit = println("Hi...")
}

trait A {
  def sayHi

  def sayHello: Unit = {
    println("Hello...")
  }
}
