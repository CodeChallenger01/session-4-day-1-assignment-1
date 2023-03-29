package com.knoldus

object Driver extends App {
  val capitalizeObj = new CapitalizeCharacter
  val stringList: List[String] = List("My", "name", "is", "Michael", "Scott")
  val character: Char = 'a'
  val updatedList: List[String] = capitalizeObj.capitalizingCharacter(stringList, character)
  println(updatedList)
}
