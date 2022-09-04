package az.rock
package ide.view.page.screen.intro

import ide.view.page.lib.panel.GSimplePanel

import az.rock.ide.view.ui.button.GSimpleButton

import java.awt.{BorderLayout, Component, ComponentOrientation, GridBagLayout, GridLayout}
import javax.swing.{BorderFactory, Box, BoxLayout, SwingConstants}
class IntroMainPanel extends GSimplePanel{

  /**
   * Variable Declaration
   */
  private val buttonsPanel : GSimplePanel = new GSimplePanel
  private val openProject : GSimpleButton = new GSimpleButton("Open Project")
  private val newProject : GSimpleButton = new GSimpleButton("New Project")
  private val getRepository : GSimpleButton = new GSimpleButton("Remote Repository")
  private val layout : Box = Box.createVerticalBox()

  override def componentInitializer(): Unit = {
    {
      this.openProject.setAlignmentX(Component.CENTER_ALIGNMENT)
      this.newProject.setAlignmentX(Component.CENTER_ALIGNMENT)
      this.getRepository.setAlignmentX(Component.CENTER_ALIGNMENT)
    }


    //IntroMainPanel Initializer
    {
      this.setLayout(new BorderLayout())
      this.layout.add(this.newProject)
      this.layout.add(this.openProject)
      this.layout.add(this.getRepository)
      this.buttonsPanel.add(layout)
      this.add(this.buttonsPanel,BorderLayout.CENTER)
    }
  }

  override def postConst(): Unit = super.postConst()




}
