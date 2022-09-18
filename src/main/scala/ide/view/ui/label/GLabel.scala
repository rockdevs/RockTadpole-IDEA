package az.rock
package ide.view.ui.label

import java.awt.Font
import javax.swing.JLabel

class GLabel(text: String) extends JLabel(text:String) {
  {
    this.setFont(new Font("Helvetica",Font.PLAIN,16))
  }
}
