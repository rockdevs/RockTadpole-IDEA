package az.rock
package ide.view.page.screen.intro

import ide.view.page.lib.panel.{GPanel, GSimplePanel}

import az.rock.ide.view.page.screen.toolBar.file.other.{ExitActionListener, GActionListener}
import az.rock.ide.view.ui.button.GSimpleButton
import az.rock.ide.view.ui.frame.GFrame
import az.rock.ide.view.ui.icon.enums.GIconBar

import java.awt.BorderLayout
import javax.swing.JScrollPane
import java.awt.*
import java.awt.event.{ActionEvent, ActionListener}

class IntroWestPanel(frame:GFrame) extends GPanel{

  private var owner : GFrame = null;
  private val buttonPanel : GPanel = new GSimplePanel()
  private var scrollPane : JScrollPane = null
  private var mavenProjectBtn : GSimpleButton = new GSimpleButton("Maven Project",GIconBar.MAVEN)
  private var javaProjectBtn : GSimpleButton = new GSimpleButton("Java Project",GIconBar.JAVA)
  private var scalaProjectBtn : GSimpleButton = new GSimpleButton("Scala Project",GIconBar.SCALA)

  {
    this.owner = frame
  }

  {
    this.buttonPanel.setLayout(new GridLayout(20, 1, 0, 0))
    this.buttonPanel.add(this.mavenProjectBtn)
    this.buttonPanel.add(this.javaProjectBtn)
    this.buttonPanel.add(this.scalaProjectBtn)
    this.scrollPane = new JScrollPane(this.buttonPanel)
    this.add(this.scrollPane)
  }


  {
    this.javaProjectBtn.addActionListener(new ClosePanelActionListener(this.owner))
  }

  override def componentInitializer(): Unit = {

  }

  override def postConst(): Unit = {

  }
}

class ClosePanelActionListener(panel: GFrame) extends GActionListener(panel:GFrame){

}