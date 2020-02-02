package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import controller.mainPaneController;
public class chooseProjectController {

    @FXML
    private Button back;

    @FXML
    private Button next;
    
    public static Stage stage3 = new Stage();

    
    public Stage getStage3() {
		return stage3;
	}

	public void setStage3(Stage stage3) {
		this.stage3 = stage3;
	}

	public void initialize()
    {
    	
    }

    public void chooseRing() throws IOException
    {
    		
    		
    		Model.main.windowInitializer.getChooseRingStage().show();
    		Model.main.windowInitializer.getChooseProjectStage().hide();
	        
    }
    
    public void backToProject()
    {
    
    }
    
    
}
