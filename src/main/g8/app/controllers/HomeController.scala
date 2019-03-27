package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents,
                               indexTemplate: views.html.index)
    extends AbstractController(cc) {

  def index() = Action { _ =>
    Ok(indexTemplate())
  }
}
