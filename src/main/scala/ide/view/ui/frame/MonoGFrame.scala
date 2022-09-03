package az.rock
package ide.view.ui.frame

import java.awt.{BorderLayout, Dimension}

abstract class MonoGFrame extends GFrame{
  def this(name:String) = {
    this()
    this.setName(name)
  }

  {
    this.setSize(new Dimension(700,600));
    this.setLayout(new BorderLayout());
    this.setLocationRelativeTo(null)
  }
}
