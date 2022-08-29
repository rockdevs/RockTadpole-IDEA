package az.rock.ide.common.exception;

import az.rock.ide.common.lang.MessageProvider;

public class GException extends Exception{
    public GException(String code){
        super(MessageProvider.get(code));
    }

    public GException(){
        super(MessageProvider.fail());
    }
}
