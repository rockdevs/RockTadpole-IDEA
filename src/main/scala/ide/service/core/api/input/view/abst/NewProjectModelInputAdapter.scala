package az.rock
package ide.service.core.api.input.view.abst

import az.rock.ide.service.core.api.input.ServiceInputAdapter

trait NewProjectModelInputAdapter extends ServiceInputAdapter{
  def live(value:String):String;
}
