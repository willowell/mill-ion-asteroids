package desktop

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import core.MyGdxGame

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
@main def runGame() =
  val config = Lwjgl3ApplicationConfiguration()

  config.setForegroundFPS(60)
  config.setTitle("My GDX Game")
  
  Lwjgl3Application(MyGdxGame(), config)
