package Model.drawing;

import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import controller.sealingRingNoCoatingController;

public class drawFrame {
	int scale=10;
	
	public void drawRing()
	{
	
	
	Canvas drawFrame = new Canvas(scale*297,scale*210);
	GraphicsContext gc = drawFrame.getGraphicsContext2D();
	drawShapes(gc);
	   
	}
    public void drawShapes(GraphicsContext gc)
	{
    	//ustawienia
    	 Font f1 = new Font ("Calibri", scale*2-2);
	     Font f2 = new Font ("Calibri", scale*3);
	     Font f3 = new Font ("Calibri", scale*4);
	     Font f4 = new Font ("Calibri", scale*5);
	     Font index = new Font("Calibri", 1.5*scale);
    	gc.setLineWidth(5);
    	//ramka woko³o
    	gc.strokeRect(scale*10, scale*10, scale*277, scale*190);
    	//ramka g³ówna
    	gc.strokeRect(scale*117, scale*160, scale*170, scale*40);
    	gc.strokeLine(scale*117, scale*170, scale*287, scale*170);
    	gc.strokeLine(scale*117, scale*180, scale*257, scale*180);
    	gc.strokeLine(scale*117, scale*190, scale*257, scale*190);
    	gc.strokeLine(scale*117, scale*190, scale*257, scale*190);
    	gc.strokeLine(scale*162, scale*170, scale*162, scale*200);
    	gc.strokeLine(scale*177, scale*170, scale*177, scale*200);
    	gc.strokeLine(scale*205, scale*170, scale*205, scale*200);
    	gc.strokeLine(scale*222, scale*170, scale*222, scale*180);
    	gc.strokeLine(scale*242, scale*170, scale*242, scale*180);
    	gc.strokeLine(scale*257, scale*170, scale*257, scale*190);
    	gc.strokeLine(scale*257, scale*190, scale*287, scale*190);
    	gc.strokeLine(scale*257, scale*170, scale*257, scale*170);
    	gc.strokeLine(scale*232, scale*180, scale*232, scale*190);
    	gc.strokeLine(scale*248, scale*190, scale*248, scale*200);
    	gc.strokeLine(scale*202, scale*160, scale*202, scale*170);
    	
    	//ramka parametrów g³ównych
    	
    	gc.strokeLine(scale*207, scale*130, scale*287, scale*130);
    	gc.strokeLine(scale*207, scale*130, scale*207, scale*160);
    	gc.strokeLine(scale*207, scale*140, scale*287, scale*140);
    	gc.strokeLine(scale*207, scale*150, scale*287, scale*150);
    	gc.strokeLine(scale*257, scale*130, scale*257, scale*160);
    	
    	//etykiety pól ramki
    	gc.setFont(f2);
    	
    	gc.fillText("Nazwa pierœcienia", scale*119, scale*162+scale);
    	gc.fillText("Kod pó³produktu", scale*203, scale*162+scale);
    	gc.fillText("Sporz¹dzi³", scale*118, scale*172+scale);
    	gc.fillText("Sprawdzi³", scale*118, scale*182+scale);
    	gc.fillText("Zatwierdzi³", scale*118, scale*192+scale);
    	gc.fillText("Podpis", scale*163, scale*172+scale);
    	gc.fillText("Podpis", scale*163, scale*182+scale);
    	gc.fillText("Podpis", scale*163, scale*192+scale);
    	
    	gc.fillText("Data", scale*178, scale*172+scale);
    	gc.fillText("Data", scale*178, scale*182+scale);
    	gc.fillText("Data", scale*178, scale*192+scale);
    	
    	gc.fillText("Materia³", scale*206, scale*172+scale);
    	gc.fillText("Przekrój ISO", scale*223, scale*172+scale);
    	gc.fillText("Gr. tech.", scale*243, scale*172+scale);
    	
    	gc.fillText("Norma materia³owa", scale*206, scale*182+scale);
    	gc.fillText("WTO", scale*233, scale*182+scale);
    	
    	gc.fillText("Wersja", scale*206, scale*192+scale);
    	gc.fillText("Indeks PP", scale*249, scale*192+scale);
    	
    	//etykiery ramki parametrów
    	gc.setFont(f3);
    	
    	gc.fillText("Si³a sprê¿ystoœci styczna", scale*208, scale*136);
    	gc.fillText("Pokrycie", scale*208, scale*146);
    	gc.fillText("Owalizacja", scale*208, scale*156);
    	
    	//Wartoœci pól
    	
    	//kody
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getPPname().getText(), scale*118, scale*168);
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getPPcode().getText(), scale*203, scale*168);
    	gc.setFont(f4);
    	//autorzy
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getDesignedBy().getText(), scale*118, scale*178);
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getChceckedBy().getText(), scale*118, scale*188);
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getApprovedBy().getText(), scale*118, scale*198);
    	//daty
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getDesignedByDateDay().getText()+"/"+Model.main.Main.getSealingRingNoCoatingController().getDesignedByDateMonth().getText()+"/"+Model.main.Main.getSealingRingNoCoatingController().getDesignedByDateYear().getText(), scale*178, scale*178);
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getCheckedByDateDay().getText()+"/"+Model.main.Main.getSealingRingNoCoatingController().getCheckedByDateMonth().getText()+"/"+Model.main.Main.getSealingRingNoCoatingController().getCheckedByDateYear().getText(), scale*178, scale*188);
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getApprovedByDateDay().getText()+"/"+Model.main.Main.getSealingRingNoCoatingController().getApprovedByDateMonth().getText()+"/"+Model.main.Main.getSealingRingNoCoatingController().getApprovedByDateYear().getText(), scale*178, scale*198);
    	
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getEtoVersion().getText(), scale*206, scale*198);
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getEto().getText(), scale*248, scale*198);
    	
    	//wartoœci pó³ ramki parametrów
    	gc.setTextAlign(TextAlignment.CENTER);
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getfMin().getText() + " - " + Model.main.Main.getSealingRingNoCoatingController().getfMax().getText() + " N" , scale*272, scale*137);
    	gc.fillText(Model.main.Main.getSealingRingNoCoatingController().getOvalityMin().getText() + " - " + Model.main.Main.getSealingRingNoCoatingController().getOvalityMax().getText() , scale*272, scale*157);
	}
    


}
