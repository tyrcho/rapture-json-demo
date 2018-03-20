
case class Endpoint(id: Int, latency: Int, serverLatencies: Map[Int, Int])

object Endpoint {

  import upickle.default.{macroRW, ReadWriter => RW}

  implicit def rw: RW[Endpoint] = macroRW
}