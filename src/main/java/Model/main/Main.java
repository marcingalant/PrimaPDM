package Model.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import Model.main.windowInitializer;

import controller.sealingRingNoCoatingController;
import controller.mainPaneController;
public class Main extends Application {
	private static sealingRingNoCoatingController sealingRingNoCoatingController;
	private static mainPaneController mainPaneController;
	
	
	public static sealingRingNoCoatingController getSealingRingNoCoatingController() {
		return sealingRingNoCoatingController;
	}

	public static void setSealingRingNoCoatingController(sealingRingNoCoatingController sealingRingNoCoatingController) {
		Main.sealingRingNoCoatingController = sealingRingNoCoatingController;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		FXMLLoader loader1 = new FXMLLoader(Main.class.getResource("/View/main/mainPane.fxml"));
		BorderPane mainPane = (BorderPane)loader1.load();
	    Scene scene = new Scene(mainPane); 
	    primaryStage.setScene(scene);
	   	primaryStage.show();  
	    Model.main.windowInitializer.mainPaneControler=loader1.getController();
	   	
	   	Parent chooseProject = FXMLLoader.load(getClass().getResource("/View/main/chooseProject.fxml"));  
        Scene chooseProjectScene = new Scene(chooseProject);
        Stage chooseProjectStage = Model.main.windowInitializer.getChooseProjectStage();
        chooseProjectStage.setScene(chooseProjectScene);
        chooseProjectStage.initModality(Modality.APPLICATION_MODAL);
         
        Parent chooseRing = FXMLLoader.load(getClass().getResource("/View/main/chooseRing.fxml"));
 	   	Scene chooseRingScene = new Scene(chooseRing);
        Stage chooseRingStage = Model.main.windowInitializer.getChooseRingStage();
        chooseRingStage.setScene(chooseRingScene);
        chooseRingStage.initModality(Modality.APPLICATION_MODAL);
        Model.main.windowInitializer.setChooseRingStage(chooseRingStage);
       
        FXMLLoader sealingRingNoCoating = new FXMLLoader(Main.class.getResource("/View/rings/sealingRingNoCoating.fxml"));   
        VBox box1 = (VBox)sealingRingNoCoating.load();
        sealingRingNoCoatingController = sealingRingNoCoating.getController();
        Scene sealingRingNoCoatingScene = new Scene(box1);
        Stage sealingRingNoCoatingStage = Model.main.windowInitializer.getSealingRingNoCoatingStage();
        sealingRingNoCoatingStage.setScene(sealingRingNoCoatingScene);
        sealingRingNoCoatingStage.initModality(Modality.APPLICATION_MODAL);
        Model.main.windowInitializer.setSealingRingNoCoatingStage(sealingRingNoCoatingStage);  
    	   	        
    	Parent graphicsSettings = FXMLLoader.load(getClass().getResource("/View/main/graphicsSettings.fxml"));
 	   	Scene graphicsSettingsScene = new Scene(graphicsSettings);
        Stage graphicsSettingsStage = Model.main.windowInitializer.getGraphicsSettingsStage();
        graphicsSettingsStage.setScene(graphicsSettingsScene);
        graphicsSettingsStage.initModality(Modality.APPLICATION_MODAL);
        Model.main.windowInitializer.setGraphicsSettingsStage(graphicsSettingsStage);
        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
