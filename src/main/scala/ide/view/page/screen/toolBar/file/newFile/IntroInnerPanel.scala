package az.rock
package ide.view.page.screen.toolBar.file.newFile

import ide.view.page.lib.label.GElementLabel
import ide.view.page.lib.panel.{GPanel, GSimplePanel}
import ide.view.page.screen.toolBar.file.newFile.InnerQueuePanel

import java.awt.*
import javax.swing.*
import javax.swing.border.*
class IntroInnerPanel extends InnerQueuePanel {

  private val nameLabel : JLabel = new GElementLabel("Name")
  private val versionLabel : JLabel = new GElementLabel("Version")
  private val locationLabel : JLabel = new GElementLabel("Location")
  private val gitLabel : JLabel = new GElementLabel("Git repository?")
  private val sdkLabel : JLabel = new GElementLabel("SDK")

  /**
   * Name Location JDK Version, Git repo
   */

    private def factoryFlowPane(label:JLabel,textBox:JTextField) : GPanel = {
      val panel = new GSimplePanel()
      panel.setLayout(new GridLayout(1,1))
      panel.setBorder(new EmptyBorder(10, 20, 10, 10));
      textBox.setPreferredSize(new Dimension(500,30))
      panel.add(label)
      panel.add(textBox)
      panel
    }


  override def postConst(): Unit = {
    this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS))
    this.add(this.factoryFlowPane(this.nameLabel,new JTextField()))
    this.add(this.factoryFlowPane(this.locationLabel,new JTextField()))
    this.add(this.factoryFlowPane(this.sdkLabel,new JTextField()))
    this.add(this.factoryFlowPane(this.versionLabel,new JTextField()))
  }

  override def componentInitializer(): Unit = {
    
  }
}
