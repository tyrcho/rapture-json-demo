object Demo extends App {

  import play.api.libs.json.Json._

  implicit val fmt = format[Person]

  stringify(toJson(List(1, 2, 3, 4)))
  stringify(toJson(Map(1 -> 2, 3 -> 4)))
  val pj = stringify(toJson(Person("aa", 2)))
  println(pj)
  println(parse(pj).as[Person])


  case class Request(videoId: Int, endpointId: Int, count: Int)


  val problem = Problem(0, 0, endpoints = Vector(Endpoint(1, 100, Map(5 -> 1))))
  val problemString = stringify(toJson(problem))
  println(problemString)
  println(parse(problemString).as[Problem])


}
