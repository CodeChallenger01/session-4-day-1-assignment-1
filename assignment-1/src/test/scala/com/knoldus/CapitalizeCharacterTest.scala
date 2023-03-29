package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CapitalizeCharacterTest extends AnyFlatSpec with Matchers {

  val capitalizeObj = new CapitalizeCharacter

  "it" should "match with empty List if empty list is pass as a parameter" in {
    val stringList: List[String] = List().empty
    val character: Char = 'a'
    val updatedList: List[String] = capitalizeObj.capitalizingCharacter(stringList, character)
    val expectedOutput: List[String] = List()
    updatedList shouldBe expectedOutput
  }

  "it" should "match with List after Changing character to UpperCase" in {
    val stringList: List[String] = List("My", "name", "is", "Michael", "Scott")
    val character: Char = 'a'
    val updatedList: List[String] = capitalizeObj.capitalizingCharacter(stringList, character)
    val expectedOutput: List[String] = List("My", "nAme", "is", "MichAel", "Scott")
    updatedList shouldBe expectedOutput
  }

  "it" should "match with List after passing c character and Changing character to UpperCase" in {
    val stringList: List[String] = List("My", "name", "is", "Michael", "Scott")
    val character: Char = 'c'
    val updatedList: List[String] = capitalizeObj.capitalizingCharacter(stringList, character)
    val expectedOutput: List[String] = List("My", "name", "is", "MiChael", "SCott")
    updatedList shouldBe expectedOutput
  }

  "it" should "not match with Other List after Changing character" in {
    val stringList: List[String] = List("My", "name", "is", "Michael", "Scott")
    val character: Char = 'a'
    val updatedList: List[String] = capitalizeObj.capitalizingCharacter(stringList, character)
    val expectedOutput: List[String] = List("My", "naMe", "iS", "MiChAel", "SCott")
    assert(updatedList != expectedOutput)
  }

  "it" should "return same result if given character is in uppercase" in {
    val stringList: List[String] = List("My", "name", "is", "Michael", "Scott")
    val character: Char = 'A'
    val returnSameList: List[String] = capitalizeObj.capitalizingCharacter(stringList, character)
    val expectedOutput: List[String] = List("My", "name", "is", "Michael", "Scott")
    assert(returnSameList == expectedOutput)
  }

  "it" should "return same result if given character is special character " in {
    val stringList: List[String] = List("My", "n@me", "is", "Mich@el", "Scott")
    val character: Char = '@'
    val returnSameList: List[String] = capitalizeObj.capitalizingCharacter(stringList, character)
    val expectedOutput: List[String] = List("My", "n@me", "is", "Mich@el", "Scott")
    assert(returnSameList == expectedOutput)
  }

}