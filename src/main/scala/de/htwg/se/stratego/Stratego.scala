package de.htwg.se.stratego

import com.google.inject.Guice

import de.htwg.se.stratego.controller.controllerComponent.{ControllerInterface}

import scala.io.StdIn.readLine

object Stratego {

  val injector = Guice.createInjector(new StrategoModule)
  val controller = injector.getInstance(classOf[ControllerInterface])

  def main(args: Array[String]): Unit = {
    var input = ""
    do {
      input = readLine()
    } while (!input.equals("q"))
  }
}
