package az.rock
package ide.view.page.screen.intro

import ide.view.state.State
import ide.view.state.model.IntroState
import ide.view.ui.frame.{GFrame, GMainFrame}

import az.rock.ide.view.page.screen.intro.IntroWestPanel
import az.rock.ide.view.page.lib.panel.{GPanel, GSimplePanel}
import az.rock.ide.view.ui.frame.MonoGFrame

import java.awt.{BorderLayout, Dimension}

class IntroGScreen() extends MonoGFrame("Open Project") {
  private var STATE: State[IntroState] = null
  private val  westPanel : GPanel = new IntroWestPanel()
  private val mainPanel : GPanel = new IntroMainPanel

  

  override def postConst() : Unit = {

  }

  override def componentInitializer() : Unit = {

    {
      this.add(this.westPanel,BorderLayout.WEST)
      this.add(this.mainPanel,BorderLayout.CENTER)
    }
    
    this.westPanel.init();
  }

}