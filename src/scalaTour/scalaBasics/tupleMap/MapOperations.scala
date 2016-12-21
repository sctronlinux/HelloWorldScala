package scalaTour.scalaBasics.tupleMap

object MapOperations {
  def main(args: Array[String]) {
    val student = Map(12 -> "Reena", 13 -> "Micheal", 14 -> "Peter")

    val marks: Map[String, Int] = Map()

    println("Keys : " + student.keys)
    println("Values : " + student.values)
    println("Check if student is empty : " + student.isEmpty)
    println("Check if marks is empty : " + marks.isEmpty)
  }
}