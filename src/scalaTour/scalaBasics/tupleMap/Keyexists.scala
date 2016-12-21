package scalaTour.scalaBasics.tupleMap

object Keyexists {
  def main(args: Array[String]) {
    val stud2 = Map(15 -> "Russel", 16 -> "Mark", 17 -> "Steve")

    if (stud2.contains(15)) {
      println("Student Id 15 exists with value :" + stud2(15))
    } else {
      println("Student Id with 15 does not exist")
    }
    if (stud2.contains(16)) {
      println("Student Id 16  exists with value :" + stud2(16))
    } else {
      println("Student Id 16 does not exist")
    }
    if (stud2.contains(17)) {
      println("Student Id 17  exists with value :" + stud2(17))
    } else {
      println("Student Id 17 does not exist")
    }
    if (stud2.contains(18)) {
      println("Student Id 18  exists with value :" + stud2(18))
    } else {
      println("Student Id 18 does not exist")
    }

  }
}