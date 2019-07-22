package com.ecut

import com.ecut.entity.Student
import org.scalatest.funsuite.AnyFunSuite
/**
  * @author Amy
  * @date 2019-07-19 15:11
  */
class HelloWorldTest extends AnyFunSuite {

  test("HelloWorld.sayHello") {
    assert(HelloWorld.sayHello("Scala") === "Hello Scala")
  }

  test("HelloWorld.add") {
    assert(HelloWorld.add(8, 2) === 10)
  }

  test("StudentTest"){
    val stu= new Student("1","Amy",22)
    println(stu.age)
    stu.id_=("1")
    stu.name_=("Amanda")
    println(stu)
  }
}
