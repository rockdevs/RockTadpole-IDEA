package az.rock.ide.view.ui.icon.enums;

public enum GIconBar {
    MAIN_ICON("src/main/java/az/rock/ide/view/ui/icon/png/R.png"),
    ANY_TYPE("src/main/java/az/rock/ide/view/ui/icon/png/any_type.png"),
    UNDO("src/main/java/az/rock/ide/view/ui/icon/png/undo_dark.png"),
    REDO("src/main/java/az/rock/ide/view/ui/icon/png/redo_dark.png"),
    CUT("src/main/java/az/rock/ide/view/ui/icon/png/menu-cut_dark.png"),
    COPY("src/main/java/az/rock/ide/view/ui/icon/png/copyOfFolder.png"),
    COMPARE_WITH("src/main/java/az/rock/ide/view/ui/icon/png/compare4MiddleBottom_dark.png"),
    ADD(""),
    INSTALL("src/main/java/az/rock/ide/view/ui/icon/png/install_dark.png"),
    COMPILE("src/main/java/az/rock/ide/view/ui/icon/png/compile.png"),
    EXECUTE("src/main/java/az/rock/ide/view/ui/icon/png/execute_dark.png"),
    PERSONS("src/main/java/az/rock/ide/view/ui/icon/png/cwmAccess_dark.png"),
    DESKTOP("src/main/java/az/rock/ide/view/ui/icon/png/desktop_dark.png"),
    GREEN("src/main/java/az/rock/ide/view/ui/icon/png/green.png"),
    RESTART("src/main/java/az/rock/ide/view/ui/icon/png/restart_dark.png"),
    DEBUG("src/main/java/az/rock/ide/view/ui/icon/png/restartDebugger_dark.png"),
    RED("src/main/java/az/rock/ide/view/ui/icon/png/red.png"),
    STOP("src/main/java/az/rock/ide/view/ui/icon/png/cvs_global.png"),
    ADD_FOLDER(""),
    RESUME("src/main/java/az/rock/ide/view/ui/icon/png/resume_dark.png"),
    TEST("src/main/java/az/rock/ide/view/ui/icon/png/TestExecutionStatus.png"),
    UPDATE("src/main/java/az/rock/ide/view/ui/icon/png/ideUpdate_dark.png"),
    GIT("src/main/java/az/rock/ide/view/ui/icon/png/github_dark.png"),
    GITLAB("src/main/java/az/rock/ide/view/ui/icon/png/gitlab.png"),
    PLUGIN_GIT("src/main/java/az/rock/ide/view/ui/icon/png/pluginIcon.png"),
    REVIEW("src/main/java/az/rock/ide/view/ui/icon/png/review.png"),
    REVIEW_REJECTED("src/main/java/az/rock/ide/view/ui/icon/png/reviewRejected.png"),
    TIMELINE("src/main/java/az/rock/ide/view/ui/icon/png/timeline.png"),
    ADD_FOLDER_DARK(""),
    ARCHIVE(""),
    BALLOON_WARN_DARK(""),
    COLORS(""),
    CANCEL_DARK(""),
    COMMIT(""),
    EDIT_DARK(""),
    EXPORT_DARK(""),
    INSTALL_DARK(""),
    SAVE("src/main/java/az/rock/ide/view/ui/icon/png/save.png"),
    CONFIG_FOLDER("src/main/java/az/rock/ide/view/ui/icon/png/configFolder.png"),
    FORCE_REFRESH("src/main/java/az/rock/ide/view/ui/icon/png/forceRefresh_dark.png"),
    SETTINGS("src/main/java/az/rock/ide/view/ui/icon/png/settings.png"),
    FOLDER("src/main/java/az/rock/ide/view/ui/icon/png/folder.png"),
    COMPILER("src/main/java/az/rock/ide/view/ui/icon/png/compiledClassesFolder.png")
    ;

    private final String path;
    GIconBar(String path) {
        this.path = path;
    }

    public String path() {
        return path;
    }
}
