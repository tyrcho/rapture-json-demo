case class Person(name: String, age: Int)

object Person {

  import upickle.default.{macroRW, ReadWriter => RW}

  implicit def rw: RW[Person] = macroRW
}