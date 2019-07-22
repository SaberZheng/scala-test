package com.ecut.entity

/**
  * @author Amy
  * @date 2019-07-22 11:57
  */
class Student(override var id: String, override var name: String, agec: Int) extends Person {
  private var _age = agec

  //get 方法
  def age = _age

  //set 方法
  def age_=(newValue: Int): Unit = _age = newValue

  override def toString = s"Student($id, $name, $age)"
}


