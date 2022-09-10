package az.rock
package ide.view.page.screen.toolBar.file.newFile

import ide.view.page.lib.panel.GPanel
import ide.view.page.screen.toolBar.file.newFile.{ClosePanelActionListener, IntroInnerPanel}
import ide.view.page.screen.toolBar.file.newFile.InnerQueuePanel
import ide.view.state.State
import ide.view.state.model.IntroState
import ide.view.ui.button.{GButton, GSimpleButton}
import ide.view.ui.frame.{GFrame, MonoGFrame}

import az.rock.ide.view.page.screen.toolBar.file.other.GActionListener

import java.awt.event.{ActionEvent, ActionListener}
import java.awt.{BorderLayout, Dimension, FlowLayout}
import java.util.PriorityQueue
import javax.swing.{JButton, JPanel}

class NewProjectPanel(name:String) extends MonoGFrame(name:String){
  private var STATE: State[IntroState] = null

  private var panels: PriorityQueue[GPanel] = new PriorityQueue[GPanel]()


  private var buttonPanel : JPanel = new JPanel()
  private var nextButton : GButton = new GSimpleButton("Next")
  private var previewButton : GButton = new GSimpleButton("Preview")
  private var cancelButton : GButton = new GSimpleButton("Cancel")


  {
    this.panels.add(new IntroInnerPanel)
    this.panels.add(new IntroInnerPanel)
    this.panels.add(new IntroInnerPanel)

    this.buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT))
    this.buttonPanel.add(this.cancelButton)
    this.buttonPanel.add(this.previewButton)
    this.buttonPanel.add(this.nextButton)

    cancelButton.addActionListener(new ClosePanelActionListener(this))
  }


  override def postConst(): Unit = {
    this.add(this.panels.peek(),BorderLayout.NORTH)
    this.add(this.buttonPanel,BorderLayout.SOUTH)
  }

  override def componentInitializer(): Unit = {
    this.panels.peek().init()
  }
}


class ClosePanelActionListener(panel: GFrame) extends GActionListener(panel:GFrame){

}
