package az.rock
package ide.ws.core.api.input.view.abst

import az.rock.ide.ws.core.api.input.ServiceInputAdapter

trait NewProjectModelInputAdapter extends ServiceInputAdapter{
  def live(value:String):String;
}
