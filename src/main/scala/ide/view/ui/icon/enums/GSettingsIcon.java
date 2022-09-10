package az.rock.ide.view.ui.icon.enums;

public enum GSettingsIcon  {
    SETTINGS("src/main/scala/ide/view/ui/icon/png/settings_dark.png"),
    LEFT("src/main/scala/ide/view/ui/icon/png/arrowCollapse_dark.png"),
    RIGHT("src/main/scala/ide/view/ui/icon/png/arrowExpand_dark.png")
    ;

    private final String path;
    GSettingsIcon(String path) {
        this.path = path;
    }

    public String path() {
        return path;
    }
}
