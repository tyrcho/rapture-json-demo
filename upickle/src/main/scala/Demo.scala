import upickle.default._

object Demo extends App {
  println(write(List(1, 2, 3, 4)))
  println(write(Map(1 -> 2, 3 -> 4)))
  println(write(Person("aa", 2)))
  private val endpointJS: String = write(Endpoint(1, 100, Map(5 -> 1)))
  println(endpointJS)
  println(read[Endpoint](endpointJS))
  val problem = Problem(0, 0, endpoints = Vector(Endpoint(1, 100, Map(5 -> 1))))
  val problemJS = write(problem)
  println(problemJS)
  println(read[Problem](problemJS))
}
