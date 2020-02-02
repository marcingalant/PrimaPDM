package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class graphicsSettingsController {

    @FXML
    private Button graphicsCancel;

    @FXML
    private Button graphicsOK;

    
    public void initialize()
    {
    	
    }
    
    public void cancelGraphicsSettings()
    {
    	Model.main.windowInitializer.getGraphicsSettingsStage().hide();
    }
    
    public void setGraphicsSettings()
    {
    	Model.main.windowInitializer.getGraphicsSettingsStage().hide();
    }
}
