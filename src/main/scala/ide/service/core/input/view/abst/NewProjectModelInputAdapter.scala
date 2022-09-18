package az.rock
package ide.service.core.input.view.abst

import az.rock.ide.service.core.input.ServiceInputAdapter

trait NewProjectModelInputAdapter extends ServiceInputAdapter{
  def live(value:String):String;
}
