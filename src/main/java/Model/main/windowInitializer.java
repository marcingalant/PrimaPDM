package Model.main;

import java.io.IOException;

import controller.mainPaneController;
import controller.sealingRingNoCoatingController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class windowInitializer {
	
	
	public static Stage chooseProjectStage = new Stage();
	
	public static Stage chooseRingStage = new Stage();
	
	public static Stage sealingRingNoCoatingStage = new Stage ();
	
	public static Stage graphicsSettingsStage = new Stage();
	
	public static sealingRingNoCoatingController sealingRingNoCoatingController;
	
	public static Stage getChooseProjectStage() {
		return chooseProjectStage;
	}

	public static void setChooseProjectStage(Stage chooseProjectStage) {
		windowInitializer.chooseProjectStage = chooseProjectStage;
	}

	public static Stage getChooseRingStage() {
		return chooseRingStage;
	}

	public static void setChooseRingStage(Stage chooseRingStage) {
		windowInitializer.chooseRingStage = chooseRingStage;
	}

	public static Stage getSealingRingNoCoatingStage() {
		return sealingRingNoCoatingStage;
	}

	public static void setSealingRingNoCoatingStage(Stage sealingRingNoCoatingStage) {
		windowInitializer.sealingRingNoCoatingStage = sealingRingNoCoatingStage;
	}

	public static mainPaneController mainPaneControler;

	public static  mainPaneController getMainPaneControler() {
		return mainPaneControler;
	}

	public void setMainPaneControler(mainPaneController mainPaneControler) {
		this.mainPaneControler = mainPaneControler;
	}

	public static Stage getGraphicsSettingsStage() {
		return graphicsSettingsStage;
	}

	public static void setGraphicsSettingsStage(Stage graphicsSettingsStage) {
		windowInitializer.graphicsSettingsStage = graphicsSettingsStage;
	}

	public static sealingRingNoCoatingController getSealingRingNoCoatingController() {
		return sealingRingNoCoatingController;
	}

	public static void setSealingRingNoCoatingController(sealingRingNoCoatingController sealingRingNoCoatingController) {
		windowInitializer.sealingRingNoCoatingController = sealingRingNoCoatingController;
	}
	
	
	
}
