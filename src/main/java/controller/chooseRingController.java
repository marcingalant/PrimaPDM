package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import controller.chooseProjectController;

public class chooseRingController {

    @FXML
    private Button backToChooseProject;

    @FXML
    private Button next;
    
    public void initialize ()
    {
    	
    }
    
    public void backToChooseProject()
    {
    	Model.main.windowInitializer.getChooseRingStage().hide();
    	Model.main.windowInitializer.getChooseProjectStage().show();
    	
    }

    public void chooseRing()
    {
    	Model.main.windowInitializer.getChooseRingStage().hide();
    	Model.main.windowInitializer.getSealingRingNoCoatingStage().show();	
    }
    
}
