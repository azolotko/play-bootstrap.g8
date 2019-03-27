package modules

import com.google.inject.AbstractModule
import config.{ApplicationConfig, ApplicationConfigProvider}

class ApplicationConfigModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[ApplicationConfig])
      .toProvider(classOf[ApplicationConfigProvider])
      .asEagerSingleton()
  }
}
