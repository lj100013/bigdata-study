package org.lj.classes

class ClassPrincieple(var inName: String) {

  var name: String = inName
  //val 修饰无法修改
  private var address: String = "hh"
  var age: Int = _
  var salary: Double = _
  var phone = null

  def this(aname: String, age: Int) = {
    this(aname)
  }
}

object ClassPrincieple {
  def main(args: Array[String]): Unit = {
    val people = new ClassPrincieple("kj", 10)
    println(people.name)
    println(people.address)
    println(people.age)
    println(people.salary)

  }
}
