package com.ecut.entity

/**
  * @author Amy
  * @date 2019-07-19 17:13
  */
//构造函数可以通过提供如下默认值来使用可选参数：
class Person(idc: String="", namec: String="") {

  private var _id = idc

  private var _name = namec

  //get 方法
  def id = _id

  //set 方法
  def id_=(newValue: String): Unit = _id = newValue

  //get 方法
  def name = _name

  //set 方法
  def name_=(newValue: String): Unit = _name = newValue

  override def toString = s"Student($id, $name)"
}