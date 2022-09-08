package az.rock
package ide.view.page.screen.intro

import ide.view.page.lib.panel.{GPanel, GSimplePanel}

import az.rock.ide.view.ui.button.GSimpleButton
import az.rock.ide.view.ui.icon.enums.GIconBar

import java.awt.BorderLayout
import javax.swing.JScrollPane
import java.awt._

class IntroWestPanel extends GPanel{
  private val buttonPanel : GPanel = new GSimplePanel()
  private val scrollPane : JScrollPane = new JScrollPane()
  private var mavenProjectBtn : GSimpleButton = new GSimpleButton("Maven Project",GIconBar.MAVEN)
  private var javaProjectBtn : GSimpleButton = new GSimpleButton("Java Project",GIconBar.JAVA)
  private var scalaProjectBtn : GSimpleButton = new GSimpleButton("Scala Project",GIconBar.SCALA)


  {
    this.buttonPanel.setLayout(new GridLayout(20, 1, 0, 0))
    this.buttonPanel.add(this.mavenProjectBtn)
    this.buttonPanel.add(this.javaProjectBtn)
    this.buttonPanel.add(this.scalaProjectBtn)
    this.scrollPane.add(this.buttonPanel)
    this.add(this.scrollPane)
  }

  override def componentInitializer(): Unit = {

  }

  override def postConst(): Unit = {

  }
}
