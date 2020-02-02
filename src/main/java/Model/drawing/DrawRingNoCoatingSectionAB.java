package Model.drawing;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class DrawRingNoCoatingSectionAB
{
	int scale=10;
	int lineThick=5;
	int lineThin=2;
	int forceArrow =10; 
	Font f1 = new Font ("Calibri", scale*6);
	public void drawSectionAB()
	{
	
	
	Canvas drawFrame = new Canvas(scale*297,scale*210);
	GraphicsContext gc2 = drawFrame.getGraphicsContext2D();
		drawShapes(gc2);
	}

    public void drawShapes(GraphicsContext gc2)
	{
	
    //OBSZAR A	
    gc2.setLineWidth(lineThick);
    gc2.strokeOval(scale*30, scale*80, scale*60, scale*60);
	gc2.strokeOval(scale*35, scale*85, scale*50, scale*50);
	gc2.setFill(Color.WHITE);
	
	gc2.fillRect(scale*58, scale*134, scale*4, scale*10);
	gc2.setFill(Color.BLACK);
	gc2.strokeLine(scale*58, scale*135-1, scale*58, scale*140-1);
	gc2.strokeLine(scale*62, scale*135-1, scale*62, scale*140-1);
	gc2.setLineWidth(lineThin);
	gc2.setLineDashes(scale*6, scale, scale*1, scale);
	gc2.strokeLine(scale*60, scale*75, scale*60, scale*145);
	gc2.strokeLine(scale*25, scale*110, scale*95, scale*110);
	gc2.setLineDashes(null);
	
	gc2.strokeLine(scale*15, scale*140, scale*58, scale*140);
	gc2.strokeLine(scale*62, scale*140, scale*105, scale*140);
	
	gc2.fillPolygon(new double []{scale*33,  scale*33,scale*38}, new double[]{scale*139, scale*141, scale*140},3 );
	gc2.fillPolygon(new double []{scale*87,  scale*87,scale*82}, new double[]{scale*139, scale*141, scale*140},3 );
	
	gc2.setFont(f1);
	gc2.fillText("Ft", scale*20, scale*138);
	gc2.fillText("Ft", scale*90, scale*138);
	
	//OBSZAR B
	
	gc2.setLineWidth(lineThick);
	gc2.strokeRect(scale*30, scale*50, scale*60, scale*6);
	gc2.strokeLine(scale*58, scale*50, scale*58, scale*56);
	gc2.strokeLine(scale*62, scale*50, scale*62, scale*56);
	gc2.setLineWidth(lineThin);
	gc2.setLineDashes(scale*6, scale, scale*1, scale);
	gc2.strokeLine(scale*60, scale*47, scale*60, scale*58);
	gc2.setLineDashes(null);
	
	
	
	
	}
    
    
}
