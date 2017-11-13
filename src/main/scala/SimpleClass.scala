package com.derekkaknes.sbt

class SimpleClass(val greeting: String) {
  def this() = this("Hello World!")
  def greet(): Unit = println(greeting)
}
