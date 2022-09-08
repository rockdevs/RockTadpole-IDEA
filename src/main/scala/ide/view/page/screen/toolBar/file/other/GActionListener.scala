package az.rock
package ide.view.page.screen.toolBar.file.other

import ide.view.ui.frame.GFrame

import java.awt.event.{ActionEvent, ActionListener}

class GActionListener (panel: GFrame) extends ActionListener{
  private var panelActionListener : GFrame = null
  {
    this.panelActionListener = panel;
  }
  override def actionPerformed(e: ActionEvent): Unit = {
    println("DISPOSE")
    panel.dispose()
  }
}
