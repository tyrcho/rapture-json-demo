import rapture._
import rapture.data.Serializer
import rapture.json._
import rapture.json.jsonBackends.jawn._

object BiggerDemo extends App {
//  implicit val ser = implicitly[Serializer[Endpoint,Json]]

  val problem = Problem(0, 0)
  val js = Json(problem)

  val string = js.toString
  println(string)

  val p = Json.parse(string).as[Problem]
  println(p)


}


case class Problem(
                    caches: Int,
                    cacheCapacity: Int,
                    videoSizes: Vector[Int] = Vector.empty,
                    endpoints: Vector[Endpoint] = Vector.empty,
                    reqs: Vector[Request] = Vector.empty)

case class Video(id: Int, size: Int)

case class Endpoint(id: Int, latency: Int, serverLatencies: Map[Int, Int])

case class Request(videoId: Int, endpointId: Int, count: Int)
