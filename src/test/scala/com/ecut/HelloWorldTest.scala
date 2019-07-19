package com.ecut

import org.scalatest.funsuite.AnyFunSuite

/**
  * @author Amy
  * @date 2019-07-19 15:11
  */
class HelloWorldTest extends AnyFunSuite{
  test("HelloWorld.sayHello") {
    assert(HelloWorld.sayHello("Hello Scala" ) === "Hello Scala")
  }
}
