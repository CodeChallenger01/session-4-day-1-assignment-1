package com.knoldus

class CapitalizeCharacter {

  /*capitalizingCharacter method is used to capitalize a specific character*/
  def capitalizingCharacter(stringList: List[String], character: Char): List[String] = {
    try {
      if (stringList.isEmpty) throw new NullPointerException("List of String is Empty")
      else if (character.isUpper) stringList
      else {
        val listAfterCapitalizing: List[String] = stringList.map { string =>
          string.map { char =>
            if (char == character) char.toUpper
            else char
          }
        }
        listAfterCapitalizing
      }
    }
    catch {
      case ex: NullPointerException => Nil
    }
  }
}
