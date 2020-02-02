package Model.drawing;

import javafx.scene.image.Image;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.paint.ImagePattern;

public class DrawRingNoCoatingSectionC {
	int scale=10;
	int lineThick=5;
	int lineThin=2;
	int forceArrow =10; 
	Font f1 = new Font ("Calibri", scale*6);
	private static final String PatternURL = "file:pattern1.png";
	Image Pattern1 = new Image(PatternURL);
	public void drawSectionC()
	{
	
	
	Canvas drawFrame = new Canvas(scale*297,scale*210);
	GraphicsContext gc3 = drawFrame.getGraphicsContext2D();
		drawShapes(gc3);
	}
	public void drawShapes(GraphicsContext gc3) {
		// TODO Auto-generated method stub
		
		gc3.setLineWidth(lineThick);
		gc3.beginPath();
		gc3.moveTo(scale*190, scale*90);
		
		//**********************
		//1. OBSZAR Z KREŒLENIEM
		//**********************
		
		//PRZÓD
		
		if(Model.main.Main.getSealingRingNoCoatingController().getSimpleRing().isSelected())
		{
			gc3.lineTo(scale*180, scale*90);
			gc3.lineTo(scale*180, scale*50);
			gc3.lineTo(scale*190, scale*50);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRing().isSelected())
		{	
			gc3.lineTo(scale*180, scale*90);
			gc3.lineTo(scale*185, scale*50);
			gc3.lineTo(scale*190, scale*50);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamfers().isSelected())
		{
			
			gc3.lineTo(scale*184, scale*90);
			gc3.lineTo(scale*184, scale*89);
			gc3.lineTo(scale*180, scale*85);
			gc3.lineTo(scale*180, scale*55);
			gc3.lineTo(scale*184, scale*51);
			gc3.lineTo(scale*184,  scale*50);
			gc3.lineTo(scale*190, scale*50);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLapped().isSelected())
		{
			gc3.lineTo(scale*180, scale*90);
			gc3.lineTo(scale*180, scale*85);
			gc3.lineTo(scale*185, scale*50);
			gc3.lineTo(scale*190, scale*50);
		}
		
		//TY£ GORA
		
		//przypadek dla prostej
		if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected())
		{
			if(Model.main.Main.getSealingRingNoCoatingController().getUpNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*50);
				gc3.lineTo(scale*240, scale*70);
			}
			else if (Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*236,scale*50);
				gc3.lineTo(scale*236, scale*51);
				gc3.lineTo(scale*240, scale*55);
				gc3.lineTo(scale*240, scale*70);
			}
			else if (Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
			{
				gc3.lineTo(scale*224,scale*50);
				gc3.lineTo(scale*224, scale*51);
				gc3.lineTo(scale*240, scale*67);
				gc3.lineTo(scale*240, scale*70);
			}
			else if (Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
			{
				gc3.lineTo(scale*224, scale*50);
				gc3.lineTo(scale*226, scale*63);
				gc3.quadraticCurveTo(scale*226, scale*65, scale*228, scale*65);
				gc3.lineTo(scale*240, scale*66);
				gc3.lineTo(scale*240, scale*70);
			}
			
		}
		//przypadek dla tr1
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected())
		{
		
			if(Model.main.Main.getSealingRingNoCoatingController().getUpNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*55);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*236, scale*55);
				gc3.lineTo(scale*240, scale*60);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
			{
				gc3.lineTo(scale*224, scale*54);
				gc3.lineTo(scale*240, scale*67);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
			{
				gc3.lineTo(scale*224, scale*54);
				gc3.lineTo(scale*226, scale*63);
				gc3.quadraticCurveTo(scale*226, scale*65, scale*228, scale*65);
				gc3.lineTo(scale*240, scale*66);
				gc3.lineTo(scale*240, scale*70);
			}
			
			
		}
		//przypadek dla tr2
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected())
		{
		
			if(Model.main.Main.getSealingRingNoCoatingController().getUpNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*55);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*236, scale*55);
				gc3.lineTo(scale*240, scale*60);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
			{
				gc3.lineTo(scale*224, scale*54);
				gc3.lineTo(scale*240, scale*67);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
			{
				gc3.lineTo(scale*224, scale*54);
				gc3.lineTo(scale*226, scale*63);
				gc3.quadraticCurveTo(scale*226, scale*65, scale*228, scale*65);
				gc3.lineTo(scale*240, scale*66);
				gc3.lineTo(scale*240, scale*70);
			}
		}
		
		//TY£ DÓ£
		//przypadek dla prostej
		if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected())
		{
			if(Model.main.Main.getSealingRingNoCoatingController().getDownNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*240, scale*85);
				gc3.lineTo(scale*236, scale*89);
				gc3.lineTo(scale*236, scale*90);
				gc3.lineTo(scale*190, scale*90);
				
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
			{
				gc3.lineTo(scale*240, scale*73);
				gc3.lineTo(scale*224, scale*89);
				gc3.lineTo(scale*224, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
			
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
			{
				gc3.lineTo(scale*240, scale*74);
				gc3.lineTo(scale*228, scale*75);
				gc3.quadraticCurveTo(scale*226, scale*75, scale*226, scale*77);
				gc3.lineTo(scale*224, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
		}
		
		//przypadek dla tr1
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected())
		{
			if(Model.main.Main.getSealingRingNoCoatingController().getDownNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*240, scale*85);
				gc3.lineTo(scale*236, scale*89);
				gc3.lineTo(scale*236, scale*90);
				gc3.lineTo(scale*190, scale*90);
				
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
			{
				gc3.lineTo(scale*240, scale*73);
				gc3.lineTo(scale*224, scale*89);
				gc3.lineTo(scale*224, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
			
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
			{
				gc3.lineTo(scale*240, scale*74);
				gc3.lineTo(scale*228, scale*75);
				gc3.quadraticCurveTo(scale*226, scale*75, scale*226, scale*77);
				gc3.lineTo(scale*224, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
		}
			//przypadek dla tr2
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected())
		{
				if(Model.main.Main.getSealingRingNoCoatingController().getDownNone().isSelected())
				{
					gc3.lineTo(scale*240, scale*85);
					gc3.lineTo(scale*190, scale*90);
				}
				else if(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected()) 
				{
					gc3.lineTo(scale*240, scale*80);
					gc3.lineTo(scale*236, scale*85);
					gc3.lineTo(scale*190,scale*90);
					
				}
				else if(Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected()) 
				{
					gc3.lineTo(scale*240, scale*73);
					gc3.lineTo(scale*224, scale*86);
					gc3.lineTo(scale*190,scale*90);
				}
				else if(Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
				{
					
					gc3.lineTo(scale*240, scale*74);
					gc3.lineTo(scale*228, scale*75);
					gc3.quadraticCurveTo(scale*226, scale*75, scale*226, scale*77);
					gc3.lineTo(scale*224, scale*86);
					gc3.lineTo(scale*190, scale*90);
				}
		}
		
		gc3.stroke();
		gc3.closePath();
		gc3.setFill(new ImagePattern(Pattern1, 2, 2, 2, 2, true));
		gc3.fill();
		
		//**********************
		//2. POWTÓRZENIE - KONTUR
		//**********************
		
		if(Model.main.Main.getSealingRingNoCoatingController().getSimpleRing().isSelected())
		{
			gc3.lineTo(scale*180, scale*90);
			gc3.lineTo(scale*180, scale*50);
			gc3.lineTo(scale*190, scale*50);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRing().isSelected())
		{	
			gc3.lineTo(scale*180, scale*90);
			gc3.lineTo(scale*185, scale*50);
			gc3.lineTo(scale*190, scale*50);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamfers().isSelected())
		{
			
			gc3.lineTo(scale*184, scale*90);
			gc3.lineTo(scale*184, scale*89);
			gc3.lineTo(scale*180, scale*85);
			gc3.lineTo(scale*180, scale*55);
			gc3.lineTo(scale*184, scale*51);
			gc3.lineTo(scale*184,  scale*50);
			gc3.lineTo(scale*190, scale*50);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLapped().isSelected())
		{
			gc3.lineTo(scale*180, scale*90);
			gc3.lineTo(scale*180, scale*85);
			gc3.lineTo(scale*185, scale*50);
			gc3.lineTo(scale*190, scale*50);
		}
		
		//TY£ GORA
		
		//przypadek dla prostej
		if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected())
		{
			if(Model.main.Main.getSealingRingNoCoatingController().getUpNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*50);
				gc3.lineTo(scale*240, scale*70);
			}
			else if (Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*236,scale*50);
				gc3.lineTo(scale*236, scale*51);
				gc3.lineTo(scale*240, scale*55);
				gc3.lineTo(scale*240, scale*70);
			}
			else if (Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
			{
				gc3.lineTo(scale*224,scale*50);
				gc3.lineTo(scale*224, scale*51);
				gc3.lineTo(scale*240, scale*67);
				gc3.lineTo(scale*240, scale*70);
			}
			else if (Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
			{
				gc3.lineTo(scale*224, scale*50);
				gc3.lineTo(scale*226, scale*63);
				gc3.quadraticCurveTo(scale*226, scale*65, scale*228, scale*65);
				gc3.lineTo(scale*240, scale*66);
				gc3.lineTo(scale*240, scale*70);
			}
			
		}
		//przypadek dla tr1
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected())
		{
		
			if(Model.main.Main.getSealingRingNoCoatingController().getUpNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*55);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*236, scale*55);
				gc3.lineTo(scale*240, scale*60);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
			{
				gc3.lineTo(scale*224, scale*54);
				gc3.lineTo(scale*240, scale*67);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
			{
				gc3.lineTo(scale*224, scale*54);
				gc3.lineTo(scale*226, scale*63);
				gc3.quadraticCurveTo(scale*226, scale*65, scale*228, scale*65);
				gc3.lineTo(scale*240, scale*66);
				gc3.lineTo(scale*240, scale*70);
			}
			
			
		}
		//przypadek dla tr2
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected())
		{
		
			if(Model.main.Main.getSealingRingNoCoatingController().getUpNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*55);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*236, scale*55);
				gc3.lineTo(scale*240, scale*60);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
			{
				gc3.lineTo(scale*224, scale*54);
				gc3.lineTo(scale*240, scale*67);
				gc3.lineTo(scale*240, scale*70);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
			{
				gc3.lineTo(scale*224, scale*54);
				gc3.lineTo(scale*226, scale*63);
				gc3.quadraticCurveTo(scale*226, scale*65, scale*228, scale*65);
				gc3.lineTo(scale*240, scale*66);
				gc3.lineTo(scale*240, scale*70);
			}
		}
		
		//TY£ DÓ£
		//przypadek dla prostej
		if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected())
		{
			if(Model.main.Main.getSealingRingNoCoatingController().getDownNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*240, scale*85);
				gc3.lineTo(scale*236, scale*89);
				gc3.lineTo(scale*236, scale*90);
				gc3.lineTo(scale*190, scale*90);
				
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
			{
				gc3.lineTo(scale*240, scale*73);
				gc3.lineTo(scale*224, scale*89);
				gc3.lineTo(scale*224, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
			
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
			{
				gc3.lineTo(scale*240, scale*74);
				gc3.lineTo(scale*228, scale*75);
				gc3.quadraticCurveTo(scale*226, scale*75, scale*226, scale*77);
				gc3.lineTo(scale*224, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
		}
		
		//przypadek dla tr1
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected())
		{
			if(Model.main.Main.getSealingRingNoCoatingController().getDownNone().isSelected())
			{
				gc3.lineTo(scale*240, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
			{
				gc3.lineTo(scale*240, scale*85);
				gc3.lineTo(scale*236, scale*89);
				gc3.lineTo(scale*236, scale*90);
				gc3.lineTo(scale*190, scale*90);
				
			}
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
			{
				gc3.lineTo(scale*240, scale*73);
				gc3.lineTo(scale*224, scale*89);
				gc3.lineTo(scale*224, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
			
			else if(Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
			{
				gc3.lineTo(scale*240, scale*74);
				gc3.lineTo(scale*228, scale*75);
				gc3.quadraticCurveTo(scale*226, scale*75, scale*226, scale*77);
				gc3.lineTo(scale*224, scale*90);
				gc3.lineTo(scale*190, scale*90);
			}
		}
			//przypadek dla tr2
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected())
		{
				if(Model.main.Main.getSealingRingNoCoatingController().getDownNone().isSelected())
				{
					gc3.lineTo(scale*240, scale*85);
					gc3.lineTo(scale*190, scale*90);
				}
				else if(Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected()) 
				{
					gc3.lineTo(scale*240, scale*80);
					gc3.lineTo(scale*236, scale*85);
					gc3.lineTo(scale*190,scale*90);
					
				}
				else if(Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected()) 
				{
					gc3.lineTo(scale*240, scale*73);
					gc3.lineTo(scale*224, scale*86);
					gc3.lineTo(scale*190,scale*90);
				}
				else if(Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
				{
					
					gc3.lineTo(scale*240, scale*74);
					gc3.lineTo(scale*228, scale*75);
					gc3.quadraticCurveTo(scale*226, scale*75, scale*226, scale*77);
					gc3.lineTo(scale*224, scale*86);
					gc3.lineTo(scale*190, scale*90);
				}
		}
		
		gc3.stroke();
		gc3.closePath();
		
		//****************************
		//3. POZOSTA£E LINIE PRZEKROJU
		//****************************
		
		
		gc3.strokeLine(scale*190, scale*50, scale*270, scale*50);
		gc3.strokeLine(scale*190, scale*90, scale*270, scale*90);
		
		//góra dla prostej
		
		if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
		{
			gc3.strokeLine(scale*234, scale*51, scale*270, scale*51);
			gc3.strokeLine(scale*240, scale*55, scale*270, scale*55);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
		{
			gc3.strokeLine(scale*224, scale*51, scale*270, scale*51);
			gc3.strokeLine(scale*240, scale*67, scale*270, scale*67);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
		{
			
			gc3.strokeLine(scale*240, scale*66, scale*270, scale*66);
		}
		
		//góra dla tr 1
		
		if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpNone().isSelected())
		{
			gc3.strokeLine(scale*240, scale*55, scale*270, scale*55);
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
		{
			gc3.strokeLine(scale*236, scale*55, scale*270, scale*55);
			gc3.strokeLine(scale*240, scale*60, scale*270, scale*60);
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
		{
			gc3.strokeLine(scale*224, scale*54, scale*270, scale*54);
			gc3.strokeLine(scale*240, scale*67, scale*270, scale*67);
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
		{
			gc3.strokeLine(scale*224, scale*54, scale*270, scale*54);
			gc3.strokeLine(scale*240, scale*66, scale*270, scale*66);
		}
		
		//góra dla trapez 2
		
		if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpNone().isSelected())
		{
			gc3.strokeLine(scale*240, scale*55, scale*270, scale*55);
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpSmallChamfer().isSelected())
		{
			gc3.strokeLine(scale*236, scale*55, scale*270, scale*55);
			gc3.strokeLine(scale*240, scale*60, scale*270, scale*60);
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpBigChamfer().isSelected())
		{
			gc3.strokeLine(scale*224, scale*54, scale*270, scale*54);
			gc3.strokeLine(scale*240, scale*67, scale*270, scale*67);
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getUpBevel().isSelected())
		{
			gc3.strokeLine(scale*224, scale*54, scale*270, scale*54);
			gc3.strokeLine(scale*240, scale*66, scale*270, scale*66);
		}
		
		//dó³ dla prostej
		if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
		{
			gc3.strokeLine(scale*236, scale*89, scale*270, scale*89);
			gc3.strokeLine(scale*240, scale*85, scale*270, scale*85);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
		{
			gc3.strokeLine(scale*224, scale*89, scale*270, scale*89);
			gc3.strokeLine(scale*240, scale*73, scale*270, scale*73);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
		{
			
			gc3.strokeLine(scale*240, scale*74, scale*270, scale*74);
		}
		
		//dó³ dla tr 1
		if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
		{
			gc3.strokeLine(scale*236, scale*89, scale*270, scale*89);
			gc3.strokeLine(scale*240, scale*85, scale*270, scale*85);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
		{
			gc3.strokeLine(scale*224, scale*89, scale*270, scale*89);
			gc3.strokeLine(scale*240, scale*73, scale*270, scale*73);
		}
		else if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
		{
			
			gc3.strokeLine(scale*240, scale*74, scale*270, scale*74);
		}
		
		//dó³ dla tr 2
		if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownNone().isSelected())
		{
			gc3.strokeLine(scale*240, scale*85, scale*270, scale*85);
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownSmallChamfer().isSelected())
		{
			gc3.strokeLine(scale*236, scale*85, scale*270, scale*85);
			gc3.strokeLine(scale*240, scale*80, scale*270, scale*80);
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownBigChamfer().isSelected())
		{
			gc3.strokeLine(scale*224, scale*86, scale*270, scale*86);
			gc3.strokeLine(scale*240, scale*73, scale*270, scale*73);
		}
		
		else if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected() && Model.main.Main.getSealingRingNoCoatingController().getDownBevel().isSelected())
		{
			gc3.strokeLine(scale*224, scale*86, scale*270, scale*86);
			gc3.strokeLine(scale*240, scale*74, scale*270, scale*74);
		}
		
		//uciêcie przekroju
		
		
		//do uzupe³nienia
		
		
	}
}
