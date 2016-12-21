package scalaTour.scalaBasics.tupleMap

/**
 * Concatenating Maps
 */
object ConcatMaps {
  def main(args: Array[String]) {
    val stud1 = Map(12 -> "Reena", 13 -> "Micheal", 14 -> "Peter")
    val stud2 = Map(15 -> "Russel", 16 -> "Mark", 17 -> "Steve")

    var student = stud1 ++ stud2
    println("stud1 ++ stud2 : " + student)

    val stu = stud1.++(stud2)
    println("stud1.++(stud2)) : " + stu)

  }
}