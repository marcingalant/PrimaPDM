package Model.drawing;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

import com.itextpdf.kernel.color.Color;

import controller.sealingRingNoCoatingController;

public class DrawRingNoCoatingDimensions {
	int scale=10;
	int lineThick=5;
	int lineDim=2;
	int forceArrow =10; 
	int textDist=2;
	int tolDist=1;
	Font Nom = new Font ("Calibri", scale*5);
	Font tol = new Font ("Calibri", scale*3);
	Color c2 = Color.WHITE;
	
	public void drawDimensions()
	{
	
	
	Canvas drawFrame = new Canvas(scale*297,scale*210);
	GraphicsContext gc4 = drawFrame.getGraphicsContext2D();
		drawShapes(gc4);
	}
	
	public void drawShapes(GraphicsContext gc4) 
	{
		
		//OBSZAR A
		
		// Wymiar œrednicy
		gc4.setLineWidth(lineDim);
		gc4.strokeLine(scale*30, scale*50, scale*30, scale*18);
		gc4.strokeLine(scale*90, scale*50, scale*90, scale*18);
		gc4.strokeLine(scale*30, scale*20, scale*90, scale*20);
		
		gc4.fillPolygon(new double[] {scale*30 , scale*33, scale*33}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
		gc4.fillPolygon(new double[] {scale*90 , scale*87, scale*87}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
		
		gc4.setFont(Nom);
		gc4.setTextAlign(TextAlignment.RIGHT);
		    
		gc4.fillText("\u00D8"+Model.main.Main.getSealingRingNoCoatingController().getDiameterNom().getText(), scale*60, scale*19-textDist);
		gc4.setFont(tol);
		gc4.setTextAlign(TextAlignment.LEFT);
		
		gc4.fillText("\u00B1"+"0,006", scale*60, scale*19-scale*2); 
		
		//Wymiar gruboœci promieniowej
		
		gc4.strokeLine(scale*35, scale*50, scale*35, scale*27);
		gc4.strokeLine(scale*26, scale*30, scale*60, scale*30);
		gc4.fillPolygon(new double[] {scale*30 , scale*27, scale*27}, new double[] {scale*30, scale*30-scale/2, scale*30+scale/2} ,3);
		gc4.fillPolygon(new double[] {scale*35 , scale*38, scale*38}, new double[] {scale*30, scale*30-scale/2, scale*30+scale/2} ,3);
		gc4.setFont(Nom);
		gc4.setTextAlign(TextAlignment.RIGHT);
		gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getThicknessNom().getText(), scale*48, scale*28);
		gc4.setFont(tol);
		gc4.setTextAlign(TextAlignment.LEFT);
		gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getThicknessTolMax().getText(), scale*49, scale*29-scale*3);
		gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getThicknessTolMin().getText(), scale*49, scale*29);
		
		//Wymiar wysokoœci
		gc4.strokeLine(scale*90, scale*50, scale*107, scale*50);
		gc4.strokeLine(scale*90, scale*56, scale*107, scale*56);
		gc4.strokeLine(scale*105, scale*60, scale*105, scale*30);
		gc4.fillPolygon(new double[] {scale*105 , scale*105-scale/2, scale*105+scale/2}, new double[] {scale*50, scale*47, scale*47} ,3);
		gc4.fillPolygon(new double[] {scale*105 , scale*105-scale/2, scale*105+scale/2}, new double[] {scale*56, scale*59, scale*59} ,3);
		gc4.setFont(Nom);
		gc4.save();
		gc4.translate(scale*103,scale*35);
		gc4.rotate(270);
		gc4.setTextAlign(TextAlignment.RIGHT);
		gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getHeightNom().getText(), 0, 0);
		gc4.setTextAlign(TextAlignment.LEFT);
		gc4.setFont(tol);
		gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getHeightMin().getText(), 0, scale);
		gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getHeightMax().getText(), 0, -scale*2);
		gc4.restore();
		
		//wymiar szczeliny
		
		gc4.strokeLine(scale*58, scale*46, scale*58, scale*63);
		gc4.strokeLine(scale*62, scale*46, scale*62, scale*63);
		gc4.strokeLine(scale*54, scale*61, scale*90, scale*61);
		gc4.fillPolygon(new double[] {scale*58 , scale*55, scale*55}, new double[] {scale*61, scale*61-scale/2, scale*61+scale/2} ,3);
		gc4.fillPolygon(new double[] {scale*62 , scale*65, scale*65}, new double[] {scale*61, scale*61-scale/2, scale*61+scale/2} ,3);
		gc4.setFont(Nom);
		gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getGapMin().getText() + " - " +Model.main.Main.getSealingRingNoCoatingController().getGapMax().getText() , scale*67, scale*60);
		
		//Bicie
		gc4.strokeLine(scale*20, scale*35, scale*30, scale*35);
		gc4.fillPolygon(new double[] {scale*30 , scale*27, scale*27}, new double[] {scale*35, scale*35-scale/2, scale*35+scale/2} ,3);
		gc4.strokeRect(scale*14,scale*32, scale*6, scale*6);
		gc4.setTextAlign(TextAlignment.CENTER);
		gc4.fillText("A", scale*17, scale*37-scale/2);
		gc4.strokeRect(scale*60,scale*27, scale*22, scale*6);
		gc4.strokeLine(scale*66, scale*27, scale*66, scale*33);
		gc4.strokeLine(scale*76, scale*27, scale*76, scale*33);
		gc4.fillText("A", scale*79, scale*32-scale/2);
		gc4.save();
		gc4.translate(scale*64,scale*29);
		gc4.rotate(45);
		gc4.strokePolygon(new double[] {scale*0 , -scale*1, scale*1}, new double[] {-scale*2, 0, 0} ,3);
		gc4.strokeLine(0, 0, 0, scale*4);
		gc4.restore();
		gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getCircularity().getText(), scale*71, scale*32-scale/2);
		
		
		
		//Chropowatoœci
		//górna
		gc4.strokePolygon(new double[] {scale*75 , scale*72, scale*78}, new double[] {scale*50, scale*46, scale*46} ,3);
		gc4.strokeLine(scale*78, scale*46, scale*81, scale*42);
		gc4.setTextAlign(TextAlignment.RIGHT);
		gc4.fillText("Ra "+Model.main.Main.getSealingRingNoCoatingController().getRaUp().getText(), scale*77, scale*44);
		
		//dolna
		gc4.strokePolygon(new double[] {scale*40 , scale*37, scale*43}, new double[] {scale*56, scale*60, scale*60} ,3);
		gc4.strokeLine(scale*37, scale*60, scale*34, scale*64);
		gc4.setTextAlign(TextAlignment.LEFT);
		gc4.fillText("Ra "+Model.main.Main.getSealingRingNoCoatingController().getRaDown().getText(), scale*37, scale*64);
		
		//wewnêtrzna
		gc4.save();
		gc4.translate(scale*35, scale*43);
		gc4.rotate(270);
		gc4.strokePolygon(new double[] {scale*0 , scale*-3, scale*3}, new double[] {scale*0, scale*4, scale*4} ,3);
		gc4.strokeLine(scale*-3, scale*4, scale*-6, scale*8);
		gc4.setTextAlign(TextAlignment.LEFT);
		gc4.fillText("Ra "+Model.main.Main.getSealingRingNoCoatingController().getRaIn().getText(), -scale*3, scale*8);
		gc4.restore();
		
		//zewnêtrzna
		gc4.save();
		gc4.translate(scale*30, scale*53);
		gc4.rotate(270);
		gc4.strokePolygon(new double[] {scale*0 , scale*-3, scale*3}, new double[] {scale*0, -scale*4, -scale*4} ,3);
		gc4.strokeLine(scale*3, -scale*4, scale*6, -scale*8);
		gc4.setTextAlign(TextAlignment.RIGHT);
		gc4.fillText("Ra "+Model.main.Main.getSealingRingNoCoatingController().getRaOut().getText(), 3* scale, -scale*5.5);
		gc4.restore();
		
		//do uzupe³nienia - chropowatoœci w rogu
		
		//sto¿ek
		if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRing().isSelected() )
		{
		gc4.strokeLine(scale*180-scale/4, scale*90,scale*180 ,scale*23);
		gc4.strokeLine(scale*185, scale*50, scale*188, scale*24);
		gc4.strokeArc(scale*140, scale*25, scale*80, scale*80, 92, -32, ArcType.OPEN);
		gc4.fillPolygon(new double[] {scale*180 , scale*177, scale*177}, new double[] {scale*25, scale*25-scale/2, scale*25+scale/2} ,3);
		
		gc4.save();
		gc4.translate(scale*188,scale*26);
		gc4.rotate(13);
		gc4.fillPolygon(new double[] {0 , scale*3, scale*3}, new double[] {-scale/6, -scale/6-scale/2, -scale/6+scale/2} ,3);
		gc4.setTextAlign(TextAlignment.RIGHT);
		gc4.rotate(14);
			if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingAlfaMinNom().getText().isEmpty())
				{
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingAlfaNom().getText() + "\u00B0" , scale*15, -scale*3);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.setFont(tol);
				gc4.fillText("\u00B1" + Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingAlfaTol().getText(), scale*15, -scale*5);
				}
			else {
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingAlfaNom().getText() + "\u00B0" + Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingAlfaMinNom().getText() +"'"  , scale*15, -scale*3);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.setFont(tol);
				gc4.fillText("\u00B1" + Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingAlfaTol().getText(), scale*15, -scale*5);
				}
		gc4.restore();
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLapped().isSelected())
		{
			gc4.strokeLine(scale*180-scale/4, scale*90,scale*180 ,scale*23);
			gc4.strokeLine(scale*185, scale*50, scale*188, scale*24);
			gc4.strokeArc(scale*140, scale*25, scale*80, scale*80, 92, -32, ArcType.OPEN);
			gc4.fillPolygon(new double[] {scale*180 , scale*177, scale*177}, new double[] {scale*25, scale*25-scale/2, scale*25+scale/2} ,3);
			gc4.save();
			gc4.translate(scale*188,scale*26);
			gc4.rotate(13);
			gc4.fillPolygon(new double[] {0 , scale*3, scale*3}, new double[] {-scale/6, -scale/6-scale/2, -scale/6+scale/2} ,3);
			gc4.setTextAlign(TextAlignment.RIGHT);
			gc4.rotate(14);
			if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedAlfaMinNom().getText().isEmpty())
				{
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedAlfaNom().getText() + "\u00B0" , scale*15, -scale*3);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.setFont(tol);
				gc4.fillText("\u00B1" + Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedAlfaTol().getText(), scale*15, -scale*5);
				}
			else
				{
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedAlfaNom().getText() + "\u00B0" + Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedAlfaMinNom().getText() +"'"  , scale*15, -scale*3);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.setFont(tol);
				gc4.fillText("\u00B1" + Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedAlfaTol().getText(), scale*15, -scale*5);
				}
						
			gc4.restore();
			
			//³ysinka
			
			gc4.strokeLine(scale*180, scale*90, scale*163,scale*90);
			gc4.strokeLine(scale*180, scale*85, scale*163,scale*85);
			gc4.strokeLine(scale*165, scale*94, scale*165, scale*55);
			gc4.fillPolygon(new double[] {scale*165 , scale*165-scale/2, scale*165+scale/2}, new double[] {scale*90, scale*93, scale*93} ,3);
			gc4.fillPolygon(new double[] {scale*165 , scale*165-scale/2, scale*165+scale/2}, new double[] {scale*85, scale*82, scale*82} ,3);
			gc4.save();
			gc4.translate(scale*165, scale*75);
			gc4.rotate(270);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedLappingMin().getText() + " - " +Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedLappingMax().getText() , 5*scale, -2*scale);
			gc4.restore();
		}
		
		if(Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamfers().isSelected())
		{
			gc4.strokeLine(scale*180, scale*55, scale*158, scale*55);
			gc4.strokeLine(scale*185, scale*50, scale*158, scale*50);
			gc4.strokeLine(scale*160, scale*59, scale*160, scale*25);
			gc4.fillPolygon(new double[] {scale*160 , scale*160-scale/2, scale*160+scale/2}, new double[] {scale*50, scale*47, scale*47} ,3);
			gc4.fillPolygon(new double[] {scale*160 , scale*160-scale/2, scale*160+scale/2}, new double[] {scale*55, scale*58, scale*58} ,3);
			gc4.save();
			gc4.translate(scale*160,scale*45);
			gc4.rotate(270);
			gc4.setTextAlign(TextAlignment.RIGHT);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamferNom().getText(), scale*6, -2*scale);
			gc4.setTextAlign(TextAlignment.LEFT);
			gc4.setFont(tol);
			gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamferTol().getText(), scale*6, -4*scale);
			gc4.setFont(Nom);
			gc4.fillText(" x "+Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamferAlfa().getText()+"\u00B0", scale*11, -2*scale);
			gc4.restore();
			//fazka goetze
			gc4.strokeLine(scale*184, scale*51, scale*168, scale*51);
			gc4.strokeLine(scale*170, scale*55, scale*170, scale*25);
			gc4.fillPolygon(new double[] {scale*170 , scale*170-scale/2, scale*170+scale/2}, new double[] {scale*50, scale*47, scale*47} ,3);
			gc4.fillPolygon(new double[] {scale*170 , scale*170-scale/2, scale*170+scale/2}, new double[] {scale*51, scale*54, scale*54} ,3);
			gc4.save();
			gc4.translate(scale*170, scale*40);
			gc4.rotate(270);
			gc4.fillText("0 - " + Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamferGoetze().getText(), scale*6, scale*-2);
			gc4.restore();			
			
		}
		
		//trapez
		
		//dwustronny
		if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected())
		{
			//k¹t
			gc4.strokeLine(scale*190, scale*50, scale*138,scale*44);
			gc4.strokeLine(scale*190, scale*90, scale*138,scale*96);
			gc4.strokeArc(scale*135, scale*30, scale*30, scale*80, 140, 80, ArcType.OPEN);	
			gc4.save();
			gc4.translate(scale*138+scale/2, scale*44);
			gc4.rotate(12);
			gc4.fillPolygon(new double[] {0 , 0-scale/2, scale/2}, new double[] {0, scale*3, scale*3} ,3);
			gc4.restore();
			gc4.save();
			gc4.translate(scale*138+scale/2, scale*96);
			gc4.rotate(-12);
			gc4.fillPolygon(new double[] {0 , -scale/2, +scale/2}, new double[] {scale*0, -scale*3, -scale*3} ,3);
			gc4.restore();
			gc4.save();
			gc4.translate(scale*135, scale*65);
			gc4.rotate(270);
			gc4.setTextAlign(TextAlignment.RIGHT);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getKeystoneAlfaNom().getText()+"\u00B0", 0, -scale);
			gc4.setTextAlign(TextAlignment.LEFT);
			gc4.setFont(tol);
			gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getKeystoneAlfaTol().getText()+"'", 0, -3*scale);
			gc4.restore();
			gc4.setTextAlign(TextAlignment.LEFT);
			//wysokoœæ pomiaru
			gc4.strokeLine(scale*180, scale*90, scale*180, scale*102);
			gc4.strokeLine(scale*210, scale*102, scale*210, scale*88);
			gc4.strokeLine(scale*180, scale*100, scale*210, scale*100);
			gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*100, scale*100-scale/2, scale*100+scale/2} ,3);
			gc4.fillPolygon(new double[] {scale*210 , scale*207, scale*207}, new double[] {scale*100, scale*100-scale/2, scale*100+scale/2} ,3);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getKeystoneMeasurementDistance().getText(), scale*195, scale*98);
			
			//wysokoœæ trapezu
			gc4.strokeLine(scale*210, scale*88, scale*272, scale*88);
			gc4.strokeLine(scale*210, scale*52, scale*272, scale*52);
			gc4.strokeLine(scale*270, scale*88, scale*270, scale*52);
			gc4.fillPolygon(new double[] {scale*270 , scale*270-scale/2, scale*270+scale/2}, new double[] {scale*88, scale*85, scale*85} ,3);
			gc4.fillPolygon(new double[] {scale*270 , scale*270-scale/2, scale*270+scale/2}, new double[] {scale*52, scale*55, scale*55} ,3);
			gc4.save();
			gc4.translate(scale*270, scale*70);
			gc4.setTextAlign(TextAlignment.RIGHT);
			gc4.rotate(270);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getKeystoneHeightNom().getText(), scale*0, -2* scale);
			gc4.setTextAlign(TextAlignment.LEFT);
			gc4.setFont(tol);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getKeystoneHeightTolMin().getText(), scale, -scale);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getKeystoneHeightTolMax().getText(), scale, -4*scale);
			gc4.restore();
			
			
			//pó³ka
			gc4.strokeLine(scale*180, scale*50, scale*180, scale*43);
			gc4.strokeLine(scale*190, scale*50, scale*190, scale*43);
			gc4.strokeLine(scale*176, scale*45, scale*214, scale*45);
			gc4.fillPolygon(new double[] {scale*180 , scale*177, scale*177}, new double[] {scale*45, scale*45-scale/2, scale*45+scale/2} ,3);
			gc4.fillPolygon(new double[] {scale*190 , scale*193, scale*193}, new double[] {scale*45, scale*45-scale/2, scale*45+scale/2} ,3);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getKeystoneHalfSurfaceMin().getText() + " - "+ Model.main.Main.getSealingRingNoCoatingController().getKeystonehalfSurfaceMax().getText(), scale*194, scale*44);
			
			
			
		}
		
		//jednostronny
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected())
		{
			//k¹t
			gc4.strokeLine(scale*190, scale*50, scale*138,scale*44);
			gc4.strokeLine(scale*190, scale*90, scale*132,scale*90);
			gc4.strokeArc(scale*133+scale/2, scale*30, scale*30, scale*110, 133, 50, ArcType.OPEN);	
			gc4.save();
			gc4.translate(scale*138+scale/2, scale*44);
			gc4.rotate(15);
			gc4.fillPolygon(new double[] {0 , 0-scale/2, scale/2}, new double[] {0, scale*3, scale*3} ,3);
			gc4.restore();
			gc4.save();
			gc4.translate(scale*133+scale/2, scale*90);
			gc4.rotate(0);
			gc4.fillPolygon(new double[] {0 , -scale/2, +scale/2}, new double[] {scale*0, -scale*3, -scale*3} ,3);
			gc4.restore();
			gc4.save();
			gc4.translate(scale*135, scale*65);
			gc4.rotate(275);
			gc4.setTextAlign(TextAlignment.RIGHT);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getHakfKeystoneAlfaNom().getText()+"\u00B0", 0, -scale);
			gc4.setTextAlign(TextAlignment.LEFT);
			gc4.setFont(tol);
			gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneAlfaTol().getText()+"'", 0, -3*scale);
			gc4.restore();
			
			//odl pomiaru
			gc4.strokeLine(scale*180, scale*90, scale*180, scale*102);
			gc4.strokeLine(scale*210, scale*102, scale*210, scale*90);
			gc4.strokeLine(scale*180, scale*100, scale*210, scale*100);
			gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*100, scale*100-scale/2, scale*100+scale/2} ,3);
			gc4.fillPolygon(new double[] {scale*210 , scale*207, scale*207}, new double[] {scale*100, scale*100-scale/2, scale*100+scale/2} ,3);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneMeasureDistance().getText(), scale*195, scale*98);
			
			//wysokoœæ trapezu
			gc4.strokeLine(scale*210, scale*90, scale*272, scale*90);
			gc4.strokeLine(scale*210, scale*52, scale*272, scale*52);
			gc4.strokeLine(scale*270, scale*90, scale*270, scale*52);
			gc4.fillPolygon(new double[] {scale*270 , scale*270-scale/2, scale*270+scale/2}, new double[] {scale*90, scale*87, scale*87} ,3);
			gc4.fillPolygon(new double[] {scale*270 , scale*270-scale/2, scale*270+scale/2}, new double[] {scale*52, scale*55, scale*55} ,3);
			gc4.save();
			gc4.translate(scale*270, scale*70);
			gc4.setTextAlign(TextAlignment.RIGHT);
			gc4.rotate(270);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneHeightNom().getText(), scale*0, -2* scale);
			gc4.setTextAlign(TextAlignment.LEFT);
			gc4.setFont(tol);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneHeightTolMin().getText(), scale, -scale);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneHeightTolMax().getText(), scale, -4*scale);
			gc4.restore();
			
			//pó³ka
			gc4.strokeLine(scale*180, scale*50, scale*180, scale*43);
			gc4.strokeLine(scale*190, scale*50, scale*190, scale*43);
			gc4.strokeLine(scale*176, scale*45, scale*214, scale*45);
			gc4.fillPolygon(new double[] {scale*180 , scale*177, scale*177}, new double[] {scale*45, scale*45-scale/2, scale*45+scale/2} ,3);
			gc4.fillPolygon(new double[] {scale*190 , scale*193, scale*193}, new double[] {scale*45, scale*45-scale/2, scale*45+scale/2} ,3);
			gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneFlatSurfaceMin().getText() + " - "+ Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneFlatSurfaceMax().getText(), scale*194, scale*44);
			
		}
		
		//*************
		//TY£ GÓRA DLA PROSTEJ
		//*************
		
		//DLA PROSTEJ 
		
		
		if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected())
		{
			
					
			//faza du¿a
			if(Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
			{	
				//pó³ka
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*18);
				gc4.strokeLine(scale*224, scale*50, scale*224, scale*18);
				gc4.strokeLine(scale*180, scale*20, scale*224, scale*20);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*19);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferFlatNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferFlatTolMin().getText(), scale, 0);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferFlatTolMax().getText(), scale, -3*scale);
				gc4.restore();
				
				//k¹t
				gc4.strokeLine(scale*240, scale*67, scale*250, scale*75);
				gc4.strokeArc(scale*231, scale*59, scale*20, scale*20, -90, 57, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*240, scale*79);
				gc4.rotate(-5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {0, 0-scale/2, 0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*249.5, scale*74.5);
				gc4.rotate(45);
				gc4.fillPolygon(new double[] {scale*0 , scale*0-scale/2, scale*0+scale/2}, new double[] {scale*0, scale*3, scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*250, scale*81);
				gc4.rotate(-35);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferAlfaNom().getText() + "\u00B0", 0, 0);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getUpChamferAlfaTol().getText() + "\u00B0", 0, -2*scale);
				gc4.restore();
				
				//goetze
				
				gc4.strokeLine(scale*224, scale*50, scale*252, scale*50);
				gc4.strokeLine(scale*224, scale*51, scale*252, scale*51);
				gc4.strokeLine(scale*250, scale*55, scale*250, scale*30);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*50, scale*47, scale*47} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*51, scale*54, scale*54} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*45);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("0 - "+ Model.main.Main.getSealingRingNoCoatingController().getUpChamferGoetze().getText(), 0,-scale*1);
				gc4.restore();
				
			}
			//zgarniacz
			
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
			{
				//pó³ka
				
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*18);
				gc4.strokeLine(scale*224, scale*50, scale*224, scale*18);
				gc4.strokeLine(scale*180, scale*20, scale*224, scale*20);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*19);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelFlatNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelFlatTolMin().getText(), scale, 0);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelFlatTolMax().getText(), scale, -3*scale);
				gc4.restore();
				
				//wysokoœæ zgarniacza
				gc4.strokeLine(scale*240, scale*90, scale*252, scale*90);
				gc4.strokeLine(scale*240, scale*66, scale*252, scale*66);
				gc4.strokeLine(scale*250, scale*114, scale*250, scale*63);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*90, scale*93, scale*93} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*66, scale*63, scale*63} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*100);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelNom().getText(), scale*0, -scale*2);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.setFont(tol);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelTolmin().getText(), scale*0, -scale*1);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelTolMax().getText(), scale*0, -scale*4);
				gc4.restore();
				
				//k¹t alfa
				gc4.strokeLine(scale*224, scale*50, scale*222, scale*35);
				gc4.strokeArc(scale*192, scale*37, scale*60, scale*60, 97, -45, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*222, scale*37);
				gc4.rotate(-3);
				gc4.fillPolygon(new double[] {scale*0 , scale*-3, scale*-3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*224, scale*37);
				gc4.rotate(5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.save();
				gc4.translate(scale*227, scale*35);
				gc4.rotate(20);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelAlfaMin().getText() + "\u00B0"+" - "+ Model.main.Main.getSealingRingNoCoatingController().getUpBevelAlfaMax().getText()+"\u00B0", 0, 0);
				gc4.restore();
				
				//k¹t beta
				gc4.strokeLine(scale*240, scale*66, scale*255, scale*68);
				gc4.strokeLine(scale*240, scale*66, scale*255, scale*66);
				gc4.strokeArc(scale*193, scale*36, scale*60, scale*60, -10, 40, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*253, scale*66);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, scale*-3, scale*-3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*253, scale*67);
				gc4.rotate(5);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, scale*3, scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*255, scale*62);
				gc4.rotate(77);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelBetaMin().getText() + "\u00B0" + " - " + Model.main.Main.getSealingRingNoCoatingController().getUpBevelBetaMax().getText() +"\u00B0", 0, 0);
				gc4.restore();
				
				//promieñ		
				
				//do uzupe³nienia
								
			}
			//fazka ma³a
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
			{
				//fazka
				gc4.strokeLine(scale*236, scale*50, scale*262, scale*50);
				gc4.strokeLine(scale*240, scale*55, scale*262, scale*55);
				gc4.strokeLine(scale*260, scale*58, scale*260, scale*20);			
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*50, scale*47, scale*47} ,3);
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*54, scale*57, scale*57} ,3);
				gc4.save();
				gc4.translate(scale*260, scale*35);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.rotate(270);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferTil().getText(), 0, -3*scale);
				gc4.setFont(Nom);
				gc4.fillText("x "+Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferAlfa().getText(), 7*scale, -scale);
				gc4.restore();
				
				//goetze
				gc4.strokeLine(scale*236, scale*50, scale*252, scale*50);
				gc4.strokeLine(scale*236, scale*51, scale*252, scale*51);
				gc4.strokeLine(scale*250, scale*55, scale*250, scale*30);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*50, scale*47, scale*47} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*51, scale*54, scale*54} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*45);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("0 - "+ Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferGoetze().getText(), 0,-scale*1);
				gc4.restore();
				
			}
			
			//********************
			//TY£ DÓ£ DLA PROSTEJ
			//********************
			
			//faza du¿a
			
			if(Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
			{
				//pó³ka
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*122);
				gc4.strokeLine(scale*224, scale*90, scale*224, scale*122);
				gc4.strokeLine(scale*180, scale*120, scale*224, scale*120);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*117);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferFlatNom().getText(), 0, scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferFlatTolMin().getText(), scale, 2*scale);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferFlatTolMax().getText(), scale, -scale);
				gc4.restore();
				
				//k¹t
				gc4.strokeLine(scale*240, scale*73, scale*250, scale*65);
				gc4.strokeArc(scale*231, scale*61, scale*20, scale*20, 90, -57, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*240, scale*61);
				gc4.rotate(5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {0, 0-scale/2, 0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*249.5, scale*65.5);
				gc4.rotate(315);
				gc4.fillPolygon(new double[] {scale*0 , scale*0-scale/2, scale*0+scale/2}, new double[] {scale*0, -scale*3, -scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*250, scale*59);
				gc4.rotate(35);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferAlfa().getText() + "\u00B0", 0, 3*scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getDownChamferAlfaTol().getText() + "\u00B0", 0, 2*scale);
				gc4.restore();
				
				//goetze
				
				gc4.strokeLine(scale*224, scale*90, scale*252, scale*90);
				gc4.strokeLine(scale*224, scale*89, scale*252, scale*89);
				gc4.strokeLine(scale*250, scale*85, scale*250, scale*110);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*90, scale*93, scale*93} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*89, scale*86, scale*86} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*110);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("0 - "+ Model.main.Main.getSealingRingNoCoatingController().getDownChamferGoetze().getText(), 0,-scale*1);
				gc4.restore();
			}
			
			//zgarniacz
			
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
			{

				//pó³ka
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*122);
				gc4.strokeLine(scale*224, scale*90, scale*224, scale*122);
				gc4.strokeLine(scale*180, scale*120, scale*224, scale*120);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*117);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelFlatNom().getText(), 0, scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelFlatTolMin().getText(), scale, 2*scale);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelFlatTolMax().getText(), scale, -scale);
				gc4.restore();
				
				//wysokoœæ zgarniacza
				gc4.strokeLine(scale*240, scale*50, scale*252, scale*50);
				gc4.strokeLine(scale*240, scale*74, scale*252, scale*74);
				gc4.strokeLine(scale*250, scale*26, scale*250, scale*77);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*50, scale*47, scale*47} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*74, scale*79, scale*79} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*35);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelNom().getText(), scale*0, -scale*2);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.setFont(tol);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelTolMin().getText(), scale*0, -scale*1);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelTolMax().getText(), scale*0, -scale*4);
				gc4.restore();
				
				//k¹t alfa
				gc4.strokeLine(scale*224, scale*90, scale*222, scale*105);
				gc4.strokeArc(scale*192, scale*43, scale*60, scale*60, -97, 45, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*222, scale*103);
				gc4.rotate(3);
				gc4.fillPolygon(new double[] {scale*0 , scale*-3, scale*-3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*224, scale*103);
				gc4.rotate(-5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.save();
				gc4.translate(scale*227, scale*107);
				gc4.rotate(-20);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelAlfaMin().getText() + "\u00B0"+" - "+ Model.main.Main.getSealingRingNoCoatingController().getDownBevelAlfaMax().getText()+"\u00B0", 0, 0);
				gc4.restore();
				
				//k¹t beta
				gc4.strokeLine(scale*240, scale*74, scale*255, scale*72);
				gc4.strokeLine(scale*240, scale*74, scale*255, scale*74);
				gc4.strokeArc(scale*193, scale*44, scale*60, scale*60, 10, -40, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*253, scale*74);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, scale*3, scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*253, scale*73);
				gc4.rotate(-5);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, -scale*3, -scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*257, scale*78);
				gc4.rotate(-77);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelBetaMin().getText() + "\u00B0" + " - " + Model.main.Main.getSealingRingNoCoatingController().getDownBevelBetaMax().getText() +"\u00B0", 0, 0);
				gc4.restore();
				
				//promieñ		
				
				//do uzupe³nienia
			}
			
			//fazka ma³a
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
			{
				//fazka
				gc4.strokeLine(scale*236, scale*90, scale*262, scale*90);
				gc4.strokeLine(scale*240, scale*85, scale*262, scale*85);
				gc4.strokeLine(scale*260, scale*82, scale*260, scale*120);			
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*90, scale*93, scale*93} ,3);
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*86, scale*83, scale*83} ,3);
				gc4.save();
				gc4.translate(scale*260, scale*110);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.rotate(270);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamferNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamferTol().getText(), 0, -3*scale);
				gc4.setFont(Nom);
				gc4.fillText("x "+Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamferAlfa().getText(), 7*scale, -scale);
				gc4.restore();
				
				//goetze		
				gc4.strokeLine(scale*236, scale*90, scale*252, scale*90);
				gc4.strokeLine(scale*236, scale*89, scale*252, scale*89);
				gc4.strokeLine(scale*250, scale*85, scale*250, scale*110);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*90, scale*93, scale*93} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*89, scale*86, scale*86} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*110);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("0 - "+ Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamferGoetze().getText(), 0,-scale*1);
				gc4.restore();
			
			}
			
		}
		
		//**********************
		//TY£ GÓRA DLA TRAPEZ 1
		//**********************
		
		else if (Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected())
		{	
			if(Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
			{	
				//pó³ka
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*18);
				gc4.strokeLine(scale*224, scale*54, scale*224, scale*18);
				gc4.strokeLine(scale*180, scale*20, scale*224, scale*20);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*19);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferFlatNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferFlatTolMin().getText(), scale, 0);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferFlatTolMax().getText(), scale, -3*scale);
				gc4.restore();
				
				//k¹t
				gc4.strokeLine(scale*240, scale*67, scale*250, scale*75);
				gc4.strokeArc(scale*231, scale*59, scale*20, scale*20, -90, 57, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*240, scale*79);
				gc4.rotate(-5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {0, 0-scale/2, 0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*249.5, scale*74.5);
				gc4.rotate(45);
				gc4.fillPolygon(new double[] {scale*0 , scale*0-scale/2, scale*0+scale/2}, new double[] {scale*0, scale*3, scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*250, scale*81);
				gc4.rotate(-35);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferAlfaNom().getText() + "\u00B0", 0, 0);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getUpChamferAlfaTol().getText() + "\u00B0", 0, -2*scale);
				gc4.restore();
	
				
			}
			//zgarniacz
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
			{
				//pó³ka
				
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*18);
				gc4.strokeLine(scale*224, scale*54, scale*224, scale*18);
				gc4.strokeLine(scale*180, scale*20, scale*224, scale*20);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*19);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelFlatNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelFlatTolMin().getText(), scale, 0);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelFlatTolMax().getText(), scale, -3*scale);
				gc4.restore();
				
				//wysokoœæ zgarniacza
				gc4.strokeLine(scale*240, scale*90, scale*252, scale*90);
				gc4.strokeLine(scale*240, scale*66, scale*252, scale*66);
				gc4.strokeLine(scale*250, scale*114, scale*250, scale*63);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*90, scale*93, scale*93} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*66, scale*63, scale*63} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*100);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelNom().getText(), scale*0, -scale*2);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.setFont(tol);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelTolmin().getText(), scale*0, -scale*1);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelTolMax().getText(), scale*0, -scale*4);
				gc4.restore();
				
				//k¹t alfa
				gc4.strokeLine(scale*224, scale*54, scale*222, scale*35);
				gc4.strokeArc(scale*192, scale*37, scale*60, scale*60, 97, -45, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*222, scale*37);
				gc4.rotate(-3);
				gc4.fillPolygon(new double[] {scale*0 , scale*-3, scale*-3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*224, scale*37);
				gc4.rotate(5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.save();
				gc4.translate(scale*227, scale*35);
				gc4.rotate(20);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelAlfaMin().getText() + "\u00B0"+" - "+ Model.main.Main.getSealingRingNoCoatingController().getUpBevelAlfaMax().getText()+"\u00B0", 0, 0);
				gc4.restore();
				
				//k¹t beta
				gc4.strokeLine(scale*240, scale*66, scale*255, scale*68);
				gc4.strokeLine(scale*240, scale*66, scale*255, scale*66);
				gc4.strokeArc(scale*193, scale*36, scale*60, scale*60, -10, 35, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*253, scale*66);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, scale*-3, scale*-3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*253, scale*67);
				gc4.rotate(5);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, scale*3, scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*255, scale*65);
				gc4.rotate(77);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelBetaMin().getText() + "\u00B0" + " - " + Model.main.Main.getSealingRingNoCoatingController().getUpBevelBetaMax().getText() +"\u00B0", 0, 0);
				gc4.restore();
				
				//promieñ		
				
				//do uzupe³nienia
								
			}
			//fazka ma³a
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
			{
				//fazka
				gc4.strokeLine(scale*236, scale*55, scale*262, scale*55);
				gc4.strokeLine(scale*240, scale*60, scale*262, scale*60);
				gc4.strokeLine(scale*260, scale*63, scale*260, scale*20);			
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*55, scale*52, scale*52} ,3);
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*60, scale*63, scale*63} ,3);
				gc4.save();
				gc4.translate(scale*260, scale*40);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.rotate(270);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferTil().getText(), 0, -3*scale);
				gc4.setFont(Nom);
				gc4.fillText("x "+Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferAlfa().getText(), 7*scale, -scale);
				gc4.restore();
				
								
			}
			
			//*********************
			//TY£ DÓ£ DLA TRAPEZ 1
			//*********************
			
			//faza du¿a
			if(Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
			{
				//pó³ka
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*122);
				gc4.strokeLine(scale*224, scale*90, scale*224, scale*122);
				gc4.strokeLine(scale*180, scale*120, scale*224, scale*120);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*117);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferFlatNom().getText(), 0, scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferFlatTolMin().getText(), scale, 2*scale);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferFlatTolMax().getText(), scale, -scale);
				gc4.restore();
				
				//k¹t
				gc4.strokeLine(scale*240, scale*73, scale*250, scale*65);
				gc4.strokeArc(scale*231, scale*61, scale*20, scale*20, 90, -57, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*240, scale*61);
				gc4.rotate(5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {0, 0-scale/2, 0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*249.5, scale*65.5);
				gc4.rotate(315);
				gc4.fillPolygon(new double[] {scale*0 , scale*0-scale/2, scale*0+scale/2}, new double[] {scale*0, -scale*3, -scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*250, scale*59);
				gc4.rotate(35);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferAlfa().getText() + "\u00B0", 0, 3*scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getDownChamferAlfaTol().getText() + "\u00B0", 0, 2*scale);
				gc4.restore();
				
				//goetze
				
				gc4.strokeLine(scale*224, scale*90, scale*252, scale*90);
				gc4.strokeLine(scale*224, scale*89, scale*252, scale*89);
				gc4.strokeLine(scale*250, scale*85, scale*250, scale*110);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*90, scale*93, scale*93} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*89, scale*86, scale*86} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*110);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("0 - "+ Model.main.Main.getSealingRingNoCoatingController().getDownChamferGoetze().getText(), 0,-scale*1);
				gc4.restore();
			}
			
			//zgarniacz
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
			{

				//pó³ka
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*122);
				gc4.strokeLine(scale*224, scale*90, scale*224, scale*122);
				gc4.strokeLine(scale*180, scale*120, scale*224, scale*120);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*117);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelFlatNom().getText(), 0, scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelFlatTolMin().getText(), scale, 2*scale);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelFlatTolMax().getText(), scale, -scale);
				gc4.restore();
				
				//wysokoœæ zgarniacza
				gc4.strokeLine(scale*240, scale*55, scale*252, scale*55);
				gc4.strokeLine(scale*240, scale*74, scale*252, scale*74);
				gc4.strokeLine(scale*250, scale*26, scale*250, scale*77);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*55, scale*52, scale*52} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*74, scale*77, scale*77} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*35);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelNom().getText(), scale*0, -scale*2);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.setFont(tol);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelTolMin().getText(), scale*0, -scale*1);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelTolMax().getText(), scale*0, -scale*4);
				gc4.restore();
				
				//k¹t alfa
				gc4.strokeLine(scale*224, scale*90, scale*222, scale*105);
				gc4.strokeArc(scale*192, scale*43, scale*60, scale*60, -97, 45, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*222, scale*103);
				gc4.rotate(3);
				gc4.fillPolygon(new double[] {scale*0 , scale*-3, scale*-3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*224, scale*103);
				gc4.rotate(-5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.save();
				gc4.translate(scale*227, scale*107);
				gc4.rotate(-20);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelAlfaMin().getText() + "\u00B0"+" - "+ Model.main.Main.getSealingRingNoCoatingController().getDownBevelAlfaMax().getText()+"\u00B0", 0, 0);
				gc4.restore();
				
				//k¹t beta
				gc4.strokeLine(scale*240, scale*74, scale*255, scale*72);
				gc4.strokeLine(scale*240, scale*74, scale*255, scale*74);
				gc4.strokeArc(scale*193, scale*44, scale*60, scale*60, 10, -40, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*253, scale*74);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, scale*3, scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*253, scale*73);
				gc4.rotate(-5);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, -scale*3, -scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*257, scale*78);
				gc4.rotate(-77);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelBetaMin().getText() + "\u00B0" + " - " + Model.main.Main.getSealingRingNoCoatingController().getDownBevelBetaMax().getText() +"\u00B0", 0, 0);
				gc4.restore();
				
				//promieñ		
				
				//do uzupe³nienia
			}
			
			//fazka ma³a
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
			{
				//fazka
				gc4.strokeLine(scale*236, scale*90, scale*262, scale*90);
				gc4.strokeLine(scale*240, scale*85, scale*262, scale*85);
				gc4.strokeLine(scale*260, scale*82, scale*260, scale*120);			
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*90, scale*93, scale*93} ,3);
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*86, scale*83, scale*83} ,3);
				gc4.save();
				gc4.translate(scale*260, scale*110);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.rotate(270);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamferNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamferTol().getText(), 0, -3*scale);
				gc4.setFont(Nom);
				gc4.fillText("x "+Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamferAlfa().getText(), 7*scale, -scale);
				gc4.restore();
				
				//goetze		
				gc4.strokeLine(scale*236, scale*90, scale*252, scale*90);
				gc4.strokeLine(scale*236, scale*89, scale*252, scale*89);
				gc4.strokeLine(scale*250, scale*85, scale*250, scale*110);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*90, scale*93, scale*93} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*89, scale*86, scale*86} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*110);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("0 - "+ Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamferGoetze().getText(), 0,-scale*1);
				gc4.restore();
			
			}
			
			
		}
		
		//*********************
		//TY£ GÓRA DLA TRAPEZ 2
		//**********************
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected())
	
		{
		
			System.out.println("lol");
			if(Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
			{	
				//pó³ka        
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*18);
				gc4.strokeLine(scale*224, scale*54, scale*224, scale*18);
				gc4.strokeLine(scale*180, scale*20, scale*224, scale*20);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*19);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferFlatNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferFlatTolMin().getText(), scale, 0);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferFlatTolMax().getText(), scale, -3*scale);
				gc4.restore();
				
				//k¹t
				gc4.strokeLine(scale*240, scale*67, scale*250, scale*75);
				gc4.strokeArc(scale*231, scale*59, scale*20, scale*20, -90, 57, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*240, scale*79);
				gc4.rotate(-5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {0, 0-scale/2, 0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*249.5, scale*74.5);
				gc4.rotate(45);
				gc4.fillPolygon(new double[] {scale*0 , scale*0-scale/2, scale*0+scale/2}, new double[] {scale*0, scale*3, scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*250, scale*81);
				gc4.rotate(-35);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpChamferAlfaNom().getText() + "\u00B0", 0, 0);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getUpChamferAlfaTol().getText() + "\u00B0", 0, -2*scale);
				gc4.restore();
			
			}
				else if(Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
				{
					//pó³ka
					
					gc4.strokeLine(scale*180, scale*90, scale*180, scale*18);
					gc4.strokeLine(scale*224, scale*54, scale*224, scale*18);
					gc4.strokeLine(scale*180, scale*20, scale*224, scale*20);
					gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
					gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*20, scale*20-scale/2, scale*20+scale/2} ,3);
					gc4.save();
					gc4.translate(scale*200, scale*19);
					gc4.setTextAlign(TextAlignment.RIGHT);
					gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelFlatNom().getText(), 0, -scale);
					gc4.setFont(tol);
					gc4.setTextAlign(TextAlignment.LEFT);
					gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelFlatTolMin().getText(), scale, 0);
					gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelFlatTolMax().getText(), scale, -3*scale);
					gc4.restore();
					
					//wysokoœæ zgarniacza
					gc4.strokeLine(scale*240, scale*85, scale*252, scale*85);
					gc4.strokeLine(scale*240, scale*66, scale*252, scale*66);
					gc4.strokeLine(scale*250, scale*114, scale*250, scale*63);
					gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*85, scale*88, scale*88} ,3);
					gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*66, scale*63, scale*63} ,3);
					gc4.save();
					gc4.translate(scale*250, scale*100);
					gc4.rotate(270);
					gc4.setTextAlign(TextAlignment.RIGHT);
					gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelNom().getText(), scale*0, -scale*2);
					gc4.setTextAlign(TextAlignment.LEFT);
					gc4.setFont(tol);
					gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelTolmin().getText(), scale*0, -scale*1);
					gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelTolMax().getText(), scale*0, -scale*4);
					gc4.restore();
					
					//k¹t alfa
					gc4.strokeLine(scale*224, scale*54, scale*222, scale*35);
					gc4.strokeArc(scale*192, scale*37, scale*60, scale*60, 97, -45, ArcType.OPEN);
					gc4.save();
					gc4.translate(scale*222, scale*37);
					gc4.rotate(-3);
					gc4.fillPolygon(new double[] {scale*0 , scale*-3, scale*-3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
					gc4.restore();
					gc4.save();
					gc4.translate(scale*224, scale*37);
					gc4.rotate(5);
					gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
					gc4.restore();
					gc4.setTextAlign(TextAlignment.LEFT);
					gc4.save();
					gc4.translate(scale*227, scale*35);
					gc4.rotate(20);
					gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelAlfaMin().getText() + "\u00B0"+" - "+ Model.main.Main.getSealingRingNoCoatingController().getUpBevelAlfaMax().getText()+"\u00B0", 0, 0);
					gc4.restore();
					
					//k¹t beta
					gc4.strokeLine(scale*240, scale*66, scale*255, scale*68);
					gc4.strokeLine(scale*240, scale*66, scale*255, scale*66);
					gc4.strokeArc(scale*193, scale*36, scale*60, scale*60, -10, 35, ArcType.OPEN);
					gc4.save();
					gc4.translate(scale*253, scale*66);
					gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, scale*-3, scale*-3} ,3);
					gc4.restore();
					gc4.save();
					gc4.translate(scale*253, scale*67);
					gc4.rotate(5);
					gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, scale*3, scale*3} ,3);
					gc4.restore();
					gc4.save();
					gc4.translate(scale*255, scale*65);
					gc4.rotate(77);
					gc4.setTextAlign(TextAlignment.RIGHT);
					gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpBevelBetaMin().getText() + "\u00B0" + " - " + Model.main.Main.getSealingRingNoCoatingController().getUpBevelBetaMax().getText() +"\u00B0", 0, 0);
					gc4.restore();
					
					//promieñ		
					
					//do uzupe³nienia
				}	
				//fazka ma³a
				else if(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
				{
					//fazka
					gc4.strokeLine(scale*236, scale*55, scale*262, scale*55);
					gc4.strokeLine(scale*240, scale*60, scale*262, scale*60);
					gc4.strokeLine(scale*260, scale*63, scale*260, scale*20);			
					gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*55, scale*52, scale*52} ,3);
					gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*60, scale*63, scale*63} ,3);
					gc4.save();
					gc4.translate(scale*260, scale*40);
					gc4.setTextAlign(TextAlignment.RIGHT);
					gc4.rotate(270);
					gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferNom().getText(), 0, -scale);
					gc4.setFont(tol);
					gc4.setTextAlign(TextAlignment.LEFT);
					gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferTil().getText(), 0, -3*scale);
					gc4.setFont(Nom);
					gc4.fillText("x "+Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferAlfa().getText(), 7*scale, -scale);
					gc4.restore();
					
									
				}
			
			//********************
			//TY£ DÓ£ DLA TRAPEZ 2
			//*********************
			
			//faza du¿a
			if(Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
			{
				//pó³ka
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*122);
				gc4.strokeLine(scale*224, scale*86, scale*224, scale*122);
				gc4.strokeLine(scale*180, scale*120, scale*224, scale*120);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*117);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferFlatNom().getText(), 0, scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferFlatTolMin().getText(), scale, 2*scale);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferFlatTolMax().getText(), scale, -scale);
				gc4.restore();
				
				//k¹t
				gc4.strokeLine(scale*240, scale*73, scale*250, scale*65);
				gc4.strokeArc(scale*231, scale*61, scale*20, scale*20, 90, -57, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*240, scale*61);
				gc4.rotate(5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {0, 0-scale/2, 0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*249.5, scale*65.5);
				gc4.rotate(315);
				gc4.fillPolygon(new double[] {scale*0 , scale*0-scale/2, scale*0+scale/2}, new double[] {scale*0, -scale*3, -scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*250, scale*59);
				gc4.rotate(35);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownChamferAlfa().getText() + "\u00B0", 0, 3*scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getDownChamferAlfaTol().getText() + "\u00B0", 0, 2*scale);
				gc4.restore();
				
			}
			
			//zgarniacz
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
			{

				//pó³ka
				gc4.strokeLine(scale*180, scale*90, scale*180, scale*122);
				gc4.strokeLine(scale*224, scale*86, scale*224, scale*122);
				gc4.strokeLine(scale*180, scale*120, scale*224, scale*120);
				gc4.fillPolygon(new double[] {scale*180 , scale*183, scale*183}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.fillPolygon(new double[] {scale*224 , scale*221, scale*221}, new double[] {scale*120, scale*120-scale/2, scale*120+scale/2} ,3);
				gc4.save();
				gc4.translate(scale*200, scale*117);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelFlatNom().getText(), 0, scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelFlatTolMin().getText(), scale, 2*scale);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelFlatTolMax().getText(), scale, -scale);
				gc4.restore();
				
				//wysokoœæ zgarniacza
				gc4.strokeLine(scale*240, scale*55, scale*252, scale*55);
				gc4.strokeLine(scale*240, scale*74, scale*252, scale*74);
				gc4.strokeLine(scale*250, scale*26, scale*250, scale*77);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*55, scale*52, scale*52} ,3);
				gc4.fillPolygon(new double[] {scale*250 , scale*250-scale/2, scale*250+scale/2}, new double[] {scale*74, scale*77, scale*77} ,3);
				gc4.save();
				gc4.translate(scale*250, scale*35);
				gc4.rotate(270);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelNom().getText(), scale*0, -scale*2);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.setFont(tol);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelTolMin().getText(), scale*0, -scale*1);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelTolMax().getText(), scale*0, -scale*4);
				gc4.restore();
				
				//k¹t alfa
				gc4.strokeLine(scale*224, scale*86, scale*222, scale*105);
				gc4.strokeArc(scale*192, scale*43, scale*60, scale*60, -97, 45, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*222, scale*103);
				gc4.rotate(3);
				gc4.fillPolygon(new double[] {scale*0 , scale*-3, scale*-3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*224, scale*103);
				gc4.rotate(-5);
				gc4.fillPolygon(new double[] {scale*0 , scale*3, scale*3}, new double[] {scale*0, scale*0-scale/2, scale*0+scale/2} ,3);
				gc4.restore();
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.save();
				gc4.translate(scale*227, scale*107);
				gc4.rotate(-20);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelAlfaMin().getText() + "\u00B0"+" - "+ Model.main.Main.getSealingRingNoCoatingController().getDownBevelAlfaMax().getText()+"\u00B0", 0, 0);
				gc4.restore();
				
				//k¹t beta
				gc4.strokeLine(scale*240, scale*74, scale*255, scale*72);
				gc4.strokeLine(scale*240, scale*74, scale*255, scale*74);
				gc4.strokeArc(scale*193, scale*44, scale*60, scale*60, 10, -40, ArcType.OPEN);
				gc4.save();
				gc4.translate(scale*253, scale*74);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, scale*3, scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*253, scale*73);
				gc4.rotate(-5);
				gc4.fillPolygon(new double[] {0 , 0-scale/2, 0+scale/2}, new double[] {0, -scale*3, -scale*3} ,3);
				gc4.restore();
				gc4.save();
				gc4.translate(scale*257, scale*78);
				gc4.rotate(-77);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getDownBevelBetaMin().getText() + "\u00B0" + " - " + Model.main.Main.getSealingRingNoCoatingController().getDownBevelBetaMax().getText() +"\u00B0", 0, 0);
				gc4.restore();
				
				//promieñ		
				
				//do uzupe³nienia
			}
			
			//fazka ma³a
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
			{
				//fazka
				gc4.strokeLine(scale*236, scale*85, scale*262, scale*85);
				gc4.strokeLine(scale*240, scale*80, scale*262, scale*80);
				gc4.strokeLine(scale*260, scale*77, scale*260, scale*120);			
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*85, scale*88, scale*88} ,3);
				gc4.fillPolygon(new double[] {scale*260 , scale*260-scale/2, scale*260+scale/2}, new double[] {scale*80, scale*77, scale*77} ,3);
				gc4.save();
				gc4.translate(scale*260, scale*110);
				gc4.setTextAlign(TextAlignment.RIGHT);
				gc4.rotate(270);
				gc4.fillText(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferNom().getText(), 0, -scale);
				gc4.setFont(tol);
				gc4.setTextAlign(TextAlignment.LEFT);
				gc4.fillText("\u00B1"+Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferTil().getText(), 0, -3*scale);
				gc4.setFont(Nom);
				gc4.fillText("x "+Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamferAlfa().getText(), 7*scale, -scale);
				gc4.restore();
							
			}
		}
	}
}
