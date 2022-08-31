package az.rock
package ide.view.page.screen.toolBar

import ide.view.page.lib.panel.GPanel

import az.rock.ide.view.state.State
import az.rock.ide.view.state.model.IntroState
import az.rock.ide.view.ui.button.{GButton, GSimpleButton}
import az.rock.ide.view.ui.frame.GFrame

import java.awt.{BorderLayout, Dimension, FlowLayout}
import java.util.PriorityQueue
import javax.swing.{JButton, JPanel}

class NewProjectPanel extends GFrame{
  private var STATE: State[IntroState] = null

  private var panels: PriorityQueue[GPanel] = new PriorityQueue[GPanel]()


  private var buttonPanel : JPanel = new JPanel()
  private var nextButton : GButton = new GSimpleButton("Next")
  private var cancelButton : GButton = new GSimpleButton("Cancel")

  {
    this.panels.add(new IntroInnerPanel)
    this.panels.add(new IntroInnerPanel)
    this.panels.add(new IntroInnerPanel)

    this.buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT))
    this.buttonPanel.add(this.nextButton)
    this.buttonPanel.add(this.cancelButton)
  }


  override def postConst(): Unit = {
    this.setSize(new Dimension(700,600));
    this.setLayout(new BorderLayout());
    this.setLocationRelativeTo(null)
    this.setLayout(new BorderLayout())
    this.add(this.panels.peek(),BorderLayout.NORTH)
    this.add(this.buttonPanel,BorderLayout.SOUTH)
  }

  override def initializer(): Unit = {
    this.panels.peek().init()
  }
}
