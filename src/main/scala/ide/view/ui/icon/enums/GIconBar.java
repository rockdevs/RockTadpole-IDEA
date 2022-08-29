package az.rock.ide.view.ui.icon.enums;
//src/main/scala/ide/view/ui/icon/png/add.png
public enum GIconBar {
    MAIN_ICON("src/main/scala/ide/view/ui/icon/png/R.png"),
    ANY_TYPE("src/main/scala/ide/view/ui/icon/png/any_type.png"),
    UNDO("src/main/scala/ide/view/ui/icon/png/undo_dark.png"),
    REDO("src/main/scala/ide/view/ui/icon/png/redo_dark.png"),
    CUT("src/main/scala/ide/view/ui/icon/png/menu-cut_dark.png"),
    COPY("src/main/scala/ide/view/ui/icon/png/copyOfFolder.png"),
    COMPARE_WITH("src/main/scala/ide/view/ui/icon/png/compare4MiddleBottom_dark.png"),
    ADD(""),
    INSTALL("src/main/scala/ide/view/ui/icon/png/install_dark.png"),
    COMPILE("src/main/scala/ide/view/ui/icon/png/compile.png"),
    EXECUTE("src/main/scala/ide/view/ui/icon/png/execute_dark.png"),
    PERSONS("src/main/scala/ide/view/ui/icon/png/cwmAccess_dark.png"),
    DESKTOP("src/main/scala/ide/view/ui/icon/png/desktop_dark.png"),
    GREEN("src/main/scala/ide/view/ui/icon/png/green.png"),
    RESTART("src/main/scala/ide/view/ui/icon/png/restart_dark.png"),
    DEBUG("src/main/scala/ide/view/ui/icon/png/restartDebugger_dark.png"),
    RED("src/main/scala/ide/view/ui/icon/png/red.png"),
    STOP("src/main/scala/ide/view/ui/icon/png/cvs_global.png"),
    ADD_FOLDER(""),
    RESUME("src/main/scala/ide/view/ui/icon/png/resume_dark.png"),
    TEST("src/main/scala/ide/view/ui/icon/png/TestExecutionStatus.png"),
    UPDATE("src/main/scala/ide/view/ui/icon/png/ideUpdate_dark.png"),
    GIT("src/main/scala/ide/view/ui/icon/png/github_dark.png"),
    GITLAB("src/main/scala/ide/view/ui/icon/png/gitlab.png"),
    PLUGIN_GIT("src/main/scala/ide/view/ui/icon/png/pluginIcon.png"),
    REVIEW("src/main/scala/ide/view/ui/icon/png/review.png"),
    REVIEW_REJECTED("src/main/scala/ide/view/ui/icon/png/reviewRejected.png"),
    TIMELINE("src/main/scala/ide/view/ui/icon/png/timeline.png"),
    ADD_FOLDER_DARK(""),
    ARCHIVE(""),
    BALLOON_WARN_DARK(""),
    COLORS(""),
    CANCEL_DARK(""),
    COMMIT(""),
    EDIT_DARK(""),
    EXPORT_DARK(""),
    INSTALL_DARK(""),
    SAVE("src/main/scala/ide/view/ui/icon/png/save.png"),
    CONFIG_FOLDER("src/main/scala/ide/view/ui/icon/png/configFolder.png"),
    FORCE_REFRESH("src/main/scala/ide/view/ui/icon/png/forceRefresh_dark.png"),
    SETTINGS("src/main/scala/ide/view/ui/icon/png/settings.png"),
    FOLDER("src/main/scala/ide/view/ui/icon/png/folder.png"),
    COMPILER("src/main/scala/ide/view/ui/icon/png/compiledClassesFolder.png")
    ;

    private final String path;
    GIconBar(String path) {
        this.path = path;
    }

    public String path() {
        return path;
    }
}
