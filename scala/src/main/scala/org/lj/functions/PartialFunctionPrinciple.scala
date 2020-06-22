package org.lj.functions

/*
* 偏函数
* 继承一个 PartialFunction 特质
* 适合满足一定条件的数据处理 类似于map+filter
* */
object PartialFunctionPrinciple {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, "hello")
    //输入值为Any,返回值为Int
    val partialFunction = new PartialFunction[Any, Int] {
      //如果返回为true,才会执行apply方法,否则过滤
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      override def apply(v1: Any): Int = v1.asInstanceOf[Int] + 1

    }
    //偏函数不支持 map
    val list2 = list.collect(partialFunction)
    println("list2:" + list2)

    println("=============================")

    //由于每次都需要实现特质中的方法,略显麻烦,所以有简写
    //直接{} ,模式匹配
    val list3 = list.collect { case i: Int => i + 1 }
    println("list3:" + list3)
  }
}
