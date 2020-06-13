package org.lj

import scala.util.control.Breaks._

/*
* 1.scala放弃使用continue 和 break,作者认为不符合函数式编程风格
* 2.breakable(高级函数) 和 break方法(用作抛异常) 实现java的break
* 3.使用守卫实现continue
*
* */
object ContinueAndBreak {
  def main(args: Array[String]): Unit = {
    breakDemo
    continueDemo
  }

  //实现break
  def breakDemo() = {
    //高级函数,里面传代码块,一般用{}
    breakable {
      for (i <- 1 to 10) {
        if (i == 5) {
          break()
        }
        println(i)
      }
    }
  }

  //实现continue
  def continueDemo() = {
    for (i <- 1 to 10 if (i < 5)) {
      println(i)
    }
  }
}


