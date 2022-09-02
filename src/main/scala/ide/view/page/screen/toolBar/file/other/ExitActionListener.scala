package az.rock
package ide.view.page.screen.toolBar.file.other

import ide.view.ui.frame.GFrame

import java.awt.event.{ActionEvent, ActionListener}

class ExitActionListener(panel: GFrame) extends ActionListener{
  override def actionPerformed(e: ActionEvent): Unit = {
    panel.dispose()
  }
}
