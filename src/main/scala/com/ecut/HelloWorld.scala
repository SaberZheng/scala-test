package com.ecut

/**
  * @author Amy
  * @date 2019-07-19 10:47
  */
object HelloWorld {

  def sayHello(s: String): String = {
    "Hello " + s
  }

  //def关键字定义方法
  def add(a: Int, b: Int): Int ={
    //匿名函数
    val add = (x: Int, y: Int) => x + y
    add(a,b)
  }
}
