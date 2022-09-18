package az.rock
package ide.view.page.screen.intro

import az.rock.ide.view.ui.button._
import java.awt.{BorderLayout, Component, ComponentOrientation, Dimension, GridBagLayout, GridLayout}
import javax.swing.{BorderFactory, Box, BoxLayout, SwingConstants}
import az.rock.ide.view.ui.icon.enums.GIconBar
import az.rock.ide.view.ui.panel.GSimplePanel

class IntroMainPanel extends GSimplePanel{

  /**
   * Variable Declaration
   */
  private val buttonsPanel : GSimplePanel = new GSimplePanel
  private val openProject : GButton = new GSquareButton("Open Project",GIconBar.FOLDER)
  private val newProject : GButton = new GSquareButton("New Project",GIconBar.ANY_TYPE)
  private val getRepository : GButton = new GSquareButton("Github",GIconBar.GIT)

  {
    import javax.swing.SwingConstants
    openProject.setVerticalTextPosition(SwingConstants.BOTTOM)
    openProject.setHorizontalTextPosition(SwingConstants.CENTER)

    newProject.setVerticalTextPosition(SwingConstants.BOTTOM)
    newProject.setHorizontalTextPosition(SwingConstants.CENTER)

    getRepository.setVerticalTextPosition(SwingConstants.BOTTOM)
    getRepository.setHorizontalTextPosition(SwingConstants.CENTER)
  }

  override def componentInitializer(): Unit = {
    {
      this.openProject.setAlignmentX(Component.CENTER_ALIGNMENT)
      this.newProject.setAlignmentX(Component.CENTER_ALIGNMENT)
      this.getRepository.setAlignmentX(Component.CENTER_ALIGNMENT)
    }


    //IntroMainPanel Initializer
    {
      this.setLayout(new BorderLayout())
      this.buttonsPanel.add(this.newProject)
      this.buttonsPanel.add(this.openProject)
      this.buttonsPanel.add(this.getRepository)
      this.buttonsPanel.setLayout(new GridBagLayout())
      this.add(this.buttonsPanel,BorderLayout.CENTER)
    }
  }

  override def postConst(): Unit = super.postConst()




}
