package org.lj.functions

/*
* 1.方法和函数底层的运行机制几乎相同,都是为了完成一段功能的代码块,函数是scala中的一等公民相当于java面向对象编程中的对象,使函数更灵活,运用更广泛
* 2.函数可以当成参数传递,不再依赖对象,类,接口等,方法随时可以转函数
* 3.函数的定义 def 函数名([参数名:参数类型,没有参数可以不用小括号]):[返回类型]={xxx}
* 4.函数的返回
*      使用了return必须指定返回类型,否则开发工具会报错
		   使用了return,未指定对应返回类型(默认Unit),直接返回()
		   不指定返回类型以最后一行的类型,类型推导
		   if else 中返回类型不一致,可以不用声明返回值(自我测试编译器自动添加为Any了),或者声明返回值为Any
* 5.函数、方法、类、 可以无限嵌套(方法后跟$1 $2...),语法糖
* 6.函数参数
*   	可以给参数指定默认值
	    函数参数三个,调用传两个,从左到右默认覆盖
	    可以指定参数名赋值
	    参数默认是val中的,函数中无法修改参数
	    支持可变参数,可变参数只能写到后边(存在可变参数,就不能有默认赋值的参数,ideal会报错)
*
* 7.递归是动态的,编译器无法自动推断返回值
* 8.没有返回值的函数称之为过程 (返回值为Unit)
* 9.惰性函数  layz修饰,用的时候再调用,类似于单例模式中的懒汉模式, 只能用val修饰
* */
object FunctionPrinciple {
  def main(args: Array[String]): Unit = {
    method2Function
    println()

    println(returnaWithoutType)
    println()

    paramWithMuable("lj", 25, "可变参数1", "可变参数2")
    println()

    paramValueIsImmuable("lj")
    println()

    val a = lazyFunction("执行懒汉函数")
    println("执行主函数")
    println(a)
    println()
  }

  //方法转函数
  def method2Function(): Unit = {
    val a = new Method().say(_)
    a("方法转函数")
  }

  //返回,不知道返回类型,编译器默认为Unit
  def returnaWithoutType(): Unit = {
    return "使用return,函数返回类型未指定,返回()"
  }

  //不定长度参数(指定放到最后一个参数),
  def paramWithMuable(name: String, age: Int, c: String*): Unit = {
    println(s"name:${name},age:${age}")
    for (d <- c) {
      println(d)
    }
  }

  //参数默认val修饰,不能手动写var声明
  def paramValueIsImmuable(name: String): Unit = {
    //    name="lyz"
  }

  def lazyFunction(desc: String): String = {
    return desc
  }
}

class Method {
  def say(a: String): Unit = {
    println(a)
  }
}

