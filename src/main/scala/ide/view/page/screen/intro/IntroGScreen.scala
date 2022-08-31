package az.rock
package ide.view.page.screen.intro

import ide.view.state.State
import ide.view.state.model.IntroState
import ide.view.ui.frame.{GFrame, GMainFrame}

import az.rock.ide.view.page.screen.intro.IntroWestPanel
import az.rock.ide.view.page.lib.panel.GPanel

import java.awt.{BorderLayout, Dimension}

class IntroGScreen() extends GFrame("RockTadpole-IDEA") {
  private var STATE: State[IntroState] = null
  private val  westPanel : GPanel = new IntroWestPanel()


  override def postConst() = {
    this.setVisible(true);
    this.setSize(new Dimension(700,600));
    this.setLayout(new BorderLayout());
    this.add(this.westPanel,BorderLayout.WEST);
    this.setLocationRelativeTo(null)
  }

  override def initializer() = {
    this.westPanel.init();
  }
}