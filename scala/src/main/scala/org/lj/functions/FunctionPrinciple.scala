package org.lj.functions

object FunctionPrinciple {
  def main(args: Array[String]): Unit = {
    print(sum(1, 2))
  }

  //使用了return,必须指定返回类型,否则ideal报错
  def sum(a: Int, b: Int) {
    sum2()
  }

  def sum2() {
    if (true) {
      1
    } else {
      '2'
    }
  }
}
