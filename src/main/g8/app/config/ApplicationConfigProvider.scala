package config

import com.typesafe.config.ConfigFactory
import javax.inject.Provider
import javax.naming.ConfigurationException
import play.api.Logger
import pureconfig._
import pureconfig.generic.ProductHint
import pureconfig.generic.auto._

class ApplicationConfigProvider extends Provider[ApplicationConfig] {
  private val logger: Logger = Logger(getClass)

  implicit def hint: ProductHint[ApplicationConfig] =
    ProductHint(ConfigFieldMapping(CamelCase, KebabCase).withOverrides())

  override def get: ApplicationConfig = {
    val rawConfig = ConfigFactory.load()

    loadConfig[ApplicationConfig](rawConfig) match {
      case Left(errors) =>
        throw new ConfigurationException(
          s"unable to load application configuration: \$errors")

      case Right(appConfig) =>
        logger.info("loaded application configuration")
        appConfig
    }
  }
}
