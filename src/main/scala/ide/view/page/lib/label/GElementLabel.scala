package az.rock
package ide.view.page.lib.label

import java.awt.Font

class GElementLabel(text: String) extends GLabel(text:String) {
  {
    this.setFont(new Font("Helvetica",Font.PLAIN,16))
  }
}
