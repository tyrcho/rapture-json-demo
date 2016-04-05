import rapture._
import core._, json._
import jsonBackends.jawn._
import formatters.humanReadable._

object Demo extends App {

  val ad = Address("26 place du Carnaval", "Lille", "59000")
  val michel = Person("Michel", 36, List(ad))

  val js = Json(michel)

  val string = js.toString
  println(string)

  val p = Json.parse(string).as[Person]
  println(p)

  case class Person(name: String, age: Int, addresses: List[Address] = Nil)

  case class Address(street: String, city: String, postCode: String)

}
