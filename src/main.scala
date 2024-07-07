import org.scalajs.dom.*
import canvas.grid.drawGrid

val size = 400

@main
def main =
  val mainContainer = document.getElementById("main")

  val canvas = document
    .createElement("canvas")
    .asInstanceOf[HTMLCanvasElement]
  canvas.height = size
  canvas.width = size
  canvas.style.background = "#000"
  mainContainer.appendChild(canvas)

  drawGrid(canvas)

