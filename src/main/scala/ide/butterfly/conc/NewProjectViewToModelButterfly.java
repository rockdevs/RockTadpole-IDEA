package az.rock.ide.butterfly.conc;

import az.rock.ide.butterfly.abst.AbstractNewProjectViewToModelButterfly;
import az.rock.ide.common.log.Logger;
import az.rock.ide.ws.core.api.input.view.conc.NewProjectModelInputPort;

public class NewProjectViewToModelButterfly  implements AbstractNewProjectViewToModelButterfly {
    private final NewProjectModelInputPort newProjectModelInputPort = new NewProjectModelInputPort();

    @Override
    public String live(String value) {
        Logger.spec("ButterFly ...");
        return this.newProjectModelInputPort.live(value);
    }
}
