package az.rock
package ide.view.page.screen.intro

import ide.view.state.State
import ide.view.state.model.IntroState
import ide.view.ui.frame.{GFrame, GMainFrame}

import az.rock.ide.view.page.screen.intro.IntroWestPanel
import az.rock.ide.view.page.lib.panel.{GPanel, GSimplePanel}
import az.rock.ide.view.ui.frame.MonoGFrame

import java.awt.{BorderLayout, Dimension}

class IntroGScreen(name:String) extends MonoGFrame(name:String) {
  private var STATE: State[IntroState] = null
  private val  westPanel : GPanel = new IntroWestPanel()
  private val mainPanel : GPanel = new IntroMainPanel

  
  {
    this.setDefaultCloseOperation(3)
  }
  {
    this.westPanel.init()
    this.mainPanel.init()
  }
  {
    this.add(this.westPanel,BorderLayout.WEST)
    this.add(this.mainPanel,BorderLayout.CENTER)
  }

  override def postConst() : Unit = {
    
  }

  override def componentInitializer() : Unit = {

  }

}