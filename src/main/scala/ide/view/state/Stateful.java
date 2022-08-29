package az.rock.ide.view.state;

public  class Stateful <T extends State>{
    private final T stateModel;
    public Stateful(T stateModel){
        this.stateModel = stateModel;

    }
}
