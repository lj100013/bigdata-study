package org.lj

/*
/ object 编译后底层生成两个对象 HelloScala.class   HelloScala$.class
  HelloScala.class 调用 HelloScala$.class自身的 静态 单例 对象 module$
    public static final  MODULE$;
    private HelloScala$() { MODULE$ = this; --构造方法私有,无法new 进行实例化
*/
object HelloScala {
  def main(args: Array[String]): Unit = {
    println("helle scala")
  }
}
