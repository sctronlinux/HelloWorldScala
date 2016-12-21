package scalaTour.scalaBasics.tupleMap

object StringConversion {
  def main(args: Array[String]) {
    val student = new Tuple3(12, "Rob", "IT")
 
    println("Concatenated String: " + student.toString())
  }
}