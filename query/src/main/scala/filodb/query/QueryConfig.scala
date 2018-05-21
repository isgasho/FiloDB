package filodb.query

import scala.concurrent.duration.FiniteDuration

import com.typesafe.config.Config
import net.ceedubs.ficus.Ficus._

class QueryConfig(queryConfig: Config) {
  lazy val askTimeout = queryConfig.as[FiniteDuration]("ask-timeout")
  lazy val staleSampleAfterMs = queryConfig.getDuration("stale-sample-after").toMillis
}