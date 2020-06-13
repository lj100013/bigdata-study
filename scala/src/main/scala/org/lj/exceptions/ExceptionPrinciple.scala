package org.lj.exceptions

/*
* 1.异常采用 模式匹配捕获
* 2.越具体的异常放在前面,放在后面编译器也不会报错(java会报错误)
* 3.抛异常 throw new Exception("xxx"),方法返回值为Nonthing
* 4.异常不分运行时异常和编译时异常
*
* */
object ExceptionPrinciple {
  def main(args: Array[String]): Unit = {
    catchException
    try {
      throwException()
    } catch {
      case e: Exception => {
        e.printStackTrace()
        println("调用别的方法抛出的异常需要捕获,否则程序无法执行")
      }
    }
    println("主函数正常执行")
  }

  //捕获异常
  def catchException = {

    try {
      val a = 1 / 0
    } catch {
      case e: ArithmeticException => {
        println(e.toString)
      }
      case e: Exception => {
        println(e.toString)
      }
    } finally {
      //一般用于释放资源
      println("释放资源")
    }
    println("程序继续执行")
  }

  def throwException() = {
    throw new Exception("抛出异常")
    1
  }
}
