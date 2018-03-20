import play.api.libs.json.Json.format

case class Problem(
                    caches: Int,
                    cacheCapacity: Int,
                    videoSizes: Vector[Int] = Vector.empty,
                    endpoints: Vector[Endpoint] = Vector.empty)

object Problem {
  implicit val fmt = format[Problem]
}