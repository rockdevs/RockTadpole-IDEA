package az.rock.ide.engine.project;

import az.rock.ide.engine.terminal.abstracts.ApplicationExecutor;
import lombok.Getter;

import java.io.File;
import java.util.UUID;

@Getter
public class ProjectModel {
    private String projectName = "";
    private File directory;
    private ApplicationExecutor applicationExecutor;
    //FRAME CONTAINER FRAME UUID
    private UUID processUUID;

    public ProjectModel(String projectName,File directory,ApplicationExecutor executor){
        this.projectName = projectName;
        this.directory = directory;
        this.applicationExecutor = executor;
    }

    public ProjectModel(){}
    public void setProcessUUID(UUID processUUID) {
        this.processUUID = processUUID;
    }
}
