package main

import shared.SharedMessages

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}

object MainJS extends js.JSApp {

  def main(): Unit = {
    g.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
  }

}