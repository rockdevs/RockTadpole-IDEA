package az.rock.ide.view.page.screen.main

import az.rock.ide.view.ui.frame.GMainFrame
import az.rock.ide.view.ui.icon.enums.GIconBar
import javax.imageio.ImageIO
import javax.swing._
import java.io.File
import java.io.IOException
import az.rock.ide.view.state.model.MainState

object MainGScreen {
  private val STATE = MainState.factory
}

class MainGScreen(val header: String) extends GMainFrame(header) {
  final private val mainBlock = new MainBlock

  override def postConst() = {
    this.add(this.mainBlock)
  }

  override def componentInitializer() = {
    this.initIcon()
    this.mainBlock.init()
  }

  private def initIcon() = try this.setIconImage(ImageIO.read(new File(GIconBar.MAIN_ICON.path)))
  catch {
    case e: IOException =>
      JOptionPane.showMessageDialog(new JFrame("Error"), "Init Application Icon exception")
  }
}