package az.rock.ide.common.lang;

public class MessageProvider {
    private static Language language = Language.EN;

    public static String get(String code){
        return code;
    }

    public static String fail(){
        return "FAIL";
    }

    public static String success(){
        return "SUCCESS";
    }

}
