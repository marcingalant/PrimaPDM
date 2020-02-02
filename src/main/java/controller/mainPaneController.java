package controller;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import Model.application.SaveRingNoCoatingToExcel;
import Model.main.Main;
import javafx.stage.FileChooser;

public class mainPaneController {

	//Wszystkie przyciski
	 	@FXML
	    private MenuBar mainMenu;

	    @FXML
	    private Menu menuFile;

	    @FXML
	    private MenuItem newProject;

	    @FXML
	    private MenuItem openProject;

	    @FXML
	    private Menu saveDrawingTo;

	    @FXML
	    private MenuItem saveToPDF;

	    @FXML
	    private MenuItem saveToPNG;

	    @FXML
	    private Menu saveParametersTo;

	    @FXML
	    private MenuItem saveToExcel;

	    @FXML
	    private MenuItem saveToSQL;

	    @FXML
	    private MenuItem printDrawing;

	    @FXML
	    private MenuItem exportProject;

	    @FXML
	    private MenuItem closeApplication;

	    @FXML
	    private Menu menuEdit;

	    @FXML
	    private MenuItem editDrawing;

	    @FXML
	    private MenuItem editBOM;

	    @FXML
	    private MenuItem editTechnology;

	    @FXML
	    private Menu menuTechnology;

	    @FXML
	    private MenuItem ringCalculation;

	    @FXML
	    private MenuItem createBOM;

	    @FXML
	    private MenuItem createTechnology;

	    @FXML
	    private MenuItem reingProperties;

	    @FXML
	    private MenuItem costCalculation;

	    @FXML
	    private Menu menuSettings;

	    @FXML
	    private MenuItem graphics;

	    @FXML
	    private MenuItem materialData;

	    @FXML
	    private Menu menuHelp;

	    @FXML
	    private MenuItem about;

	    @FXML
	    private ToolBar mainToolBar;

	    @FXML
	    private Button zoomIn;

	    @FXML
	    private Button zoomOut;

	    @FXML
	    private ComboBox<?> zoomValue;

	    @FXML
	    private TabPane drawingPane;

	    @FXML
	    private Tab ppPane;

	    @FXML
	    private ScrollPane panelPP;

	    @FXML
	    private Tab wgPane;

	    @FXML
	    private Tab koloPane;

	    @FXML
	    private Tab owalPane;

	    @FXML
	    private Tab powlokaPane;

	    @FXML
	    private ToolBar bottomToolBar;

	    @FXML
	    private HBox hBoxBottomToolBar;

	    @FXML
	    private ProgressBar progressBar1;

	    
    
    public ScrollPane getPanelPP() {
			return panelPP;
		}

		public void setPanelPP(ScrollPane panelPP) {
			this.panelPP = panelPP;
		}

	public static Stage stage2 = new Stage();

    
    public Stage getStage2() {
		return stage2;
	}

	public void setStage2(Stage stage2) {
		this.stage2 = stage2;
	}

	public void initialize()
    {
    	
    }
    
    //metody
	@FXML
    public void chooseProject() throws Exception
    {
    	    Model.main.windowInitializer.getChooseProjectStage().show();  
    }
    
    @FXML
    public void showGraphicsSettings()
    {
    	Model.main.windowInitializer.getGraphicsSettingsStage().show();
    }
    
    @FXML
	private void saveDrawingToPng(ActionEvent event) throws IOException 
	 {
		 FileChooser fileChooser = new FileChooser();
		 FileChooser.ExtensionFilter extFilter = 
                 new FileChooser.ExtensionFilter("png files (*.png)", "*.png");
		 fileChooser.getExtensionFilters().add(extFilter);
		 File file = fileChooser.showSaveDialog(Model.main.windowInitializer.getMainPaneControler().getStage2());
		 try 
		 {
            
             ImageIO.write(Model.main.Main.getSealingRingNoCoatingController().getRenderedImage(), "png", file);
         } 
		 catch (IOException ex) 
		 {
             ex.printStackTrace();
         
		 }
		 
	}
    
    public void saveDrawingtoPdF(ActionEvent event) throws IOException 
    {
    	FileChooser fileChooser = new FileChooser();
		 FileChooser.ExtensionFilter extFilter = 
                new FileChooser.ExtensionFilter("pdf files (*.pdf)", "*.pdf");
		 fileChooser.getExtensionFilters().add(extFilter);
		 File filepng =  new File("temp.png");
		 
		 ImageIO.write(Model.main.Main.getSealingRingNoCoatingController().getRenderedImage(), "png", filepng);
		 File file = fileChooser.showSaveDialog(Model.main.windowInitializer.getMainPaneControler().getStage2());
		 try 
		 {
           
           
			 
			    final String IMAGE = "temp.png";
                String DEST ="";
                		
			     DEST+=file.getAbsolutePath();
			     System.out.println(DEST);
                //
			    PdfDocument pdfDoc = new PdfDocument(new PdfWriter(DEST));
               
                Document doc = new Document(pdfDoc, new PageSize(PageSize.A4).rotate());
                Image img = new Image(ImageDataFactory.create(IMAGE));
                doc.setMargins(0, 0, 0, 0);
                
                doc.add(img);
                doc.close();
                file.getParentFile().mkdirs();
            
        } 
		 catch (IOException ex) 
		 {
            ex.printStackTrace();
        
		 }
    	
    }

	public void saveRingToExcel(ActionEvent event) throws IOException
	{
		FileChooser fileChooser = new FileChooser();
		 FileChooser.ExtensionFilter extFilter = 
                new FileChooser.ExtensionFilter("xlsx files (*.xlsx)", "*.xlsx");
		 fileChooser.getExtensionFilters().add(extFilter);
		 File file = fileChooser.showSaveDialog(Model.main.windowInitializer.getMainPaneControler().getStage2());
		 try 
		 {
			 SaveRingNoCoatingToExcel saveNoCoating = new  SaveRingNoCoatingToExcel();
			 saveNoCoating.saveToExcel();
           
        } 
		 catch (IOException ex) 
		 {
            ex.printStackTrace();
        
		 }
	}
    
    
}
