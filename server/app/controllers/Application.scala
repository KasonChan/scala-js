package controllers

import com.typesafe.config.ConfigFactory
import play.api.mvc._
import shared.SharedMessages

object Application extends Controller {

  def index = Action {
    // Specify the configuration file and read different types of values
    val configsConf = ConfigFactory.load("configs.conf")
    val sandbox = configsConf.getConfig("sandbox")
    val magic = sandbox.getStringList("configs.magic").toArray().mkString("")
    println(magic)
    Ok(views.html.index(SharedMessages.itWorks + " " + magic))
  }

}
