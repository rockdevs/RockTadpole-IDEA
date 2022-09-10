package az.rock
package ide.view.ui.frame

import java.awt.{BorderLayout, Dimension}

abstract class MonoGFrame(name:String) extends GFrame(name:String){

  {
    this.setSize(new Dimension(700,600));
    this.setLayout(new BorderLayout());
    this.setLocationRelativeTo(null)
  }
}
