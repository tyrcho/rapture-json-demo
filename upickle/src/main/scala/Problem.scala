
case class Problem(
                    caches: Int,
                    cacheCapacity: Int,
                    videoSizes: Vector[Int] = Vector.empty,
                    endpoints: Vector[Endpoint] = Vector.empty)

object Problem {

  import upickle.default.{macroRW, ReadWriter => RW}

  implicit def rw: RW[Problem] = macroRW
}