package scalaTutorials.mixinClassComposition

import scalaTutorials.mixinClassComposition.AbsIterator


class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext = i < s.length()
  def next = { val ch = s charAt i; i += 1; ch }
}