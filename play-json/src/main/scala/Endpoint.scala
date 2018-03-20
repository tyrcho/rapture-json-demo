import play.api.libs.json.Json.format

case class Endpoint(id: Int, latency: Int, serverLatencies: Map[Int, Int])

object Endpoint{
  // this import is needed to convert Map[Int,Int] <-> JSON String
  import MapJson._

  implicit val fmt = format[Endpoint]

}