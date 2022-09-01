package az.rock
package ide.view.page.screen.toolBar

import az.rock.ide.view.page.lib.panel.{GPanel, GSimplePanel}

import java.awt.{BorderLayout, Dimension, FlowLayout}
import javax.swing.{BoxLayout, JLabel, JSeparator, JTextField}

class IntroInnerPanel extends InnerQueuePanel {

  private val nameLabel : JLabel = new JLabel("Name")
  private val versionLabel : JLabel = new JLabel("Version")
  private val locationLabel : JLabel = new JLabel("Location")
  private val gitLabel : JLabel = new JLabel("Git repository?")
  private val sdkLabel : JLabel = new JLabel("SDK")
  /**
   * Name Location JDK Version, Git repo
   */

    private def factoryFlowPane(label:JLabel,textBox:JTextField) : GPanel = {
      val panel = new GSimplePanel()
      panel.setLayout(new FlowLayout(FlowLayout.LEFT))
      textBox.setPreferredSize(new Dimension(550,30))
      panel.add(label)
      panel.add(new JSeparator())
      panel.add(textBox)
      panel
    }


  override def postConst(): Unit = {
    this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS))
    this.add(this.factoryFlowPane(this.nameLabel,new JTextField()))
    this.add(this.factoryFlowPane(this.locationLabel,new JTextField()))
    this.add(this.factoryFlowPane(this.sdkLabel,new JTextField()))
    this.add(this.factoryFlowPane(this.versionLabel,new JTextField()))
    this.add(this.factoryFlowPane(this.gitLabel,new JTextField()))
  }

  override def initializer(): Unit = {
    
  }
}
