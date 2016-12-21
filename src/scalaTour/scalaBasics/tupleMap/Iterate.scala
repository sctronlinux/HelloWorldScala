package scalaTour.scalaBasics.tupleMap

/**
 * Tuple.productIterator() method iterates through all the elements of the tuple.
 */
object Iterate {
  def main(args: Array[String]) {
    val names = ("John", "Smith", "Anderson", "Steve", "Rob")

    names.productIterator.foreach { i => println("Value = " + i) }
  }
}