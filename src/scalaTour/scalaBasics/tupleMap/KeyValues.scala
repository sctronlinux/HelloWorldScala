package scalaTour.scalaBasics.tupleMap

object KeyValues {
  def main(args: Array[String]) {
    val stud2 = Map(15 -> "Russel", 16 -> "Mark", 17 -> "Steve")

    stud2.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + stud2(i))
    }
  }
}