package az.rock
package ide.view.page.screen.toolBar.file.newFile

import ide.view.page.lib.panel.GPanel

abstract class InnerQueuePanel extends GPanel with Comparable[InnerQueuePanel]{
  override def compareTo(o: InnerQueuePanel): Int = {
    1
  }
}
