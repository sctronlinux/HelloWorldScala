package scalaTutorials.mixinClassComposition

import scalaTutorials.mixinClassComposition.RichIterator

/**
 * http://docs.scala-lang.org/tutorials/tour/mixin-class-composition
 */
object StringIteratorTest {
  def main(args: Array[String]) {
    class Iter extends StringIterator(args(0)) with RichIterator
    val iter = new Iter
    iter foreach println
  }
}