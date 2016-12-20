package scalaTutorials.mixinClassComposition

import scalaTutorials.mixinClassComposition.AbsIterator


trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit) { while (hasNext) f(next) }
}