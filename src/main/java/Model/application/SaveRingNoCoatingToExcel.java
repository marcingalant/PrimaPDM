package Model.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SaveRingNoCoatingToExcel 
{
	public void saveToExcel() throws IOException
	{
		//Tworzenei pliku
			File file = new File("template1.xlsx");
	      FileInputStream fIP = new FileInputStream(file);
	      
	   
	      XSSFWorkbook workbook = new XSSFWorkbook(fIP);
	      
	      if(file.isFile() && file.exists()) {
	         System.out.println("openworkbook.xlsx file open successfully.");
	      } else {
	         System.out.println("Error to open openworkbook.xlsx file.");
	      }
	      XSSFSheet spreadsheet = workbook.getSheetAt(0);
	      XSSFRow row = spreadsheet.createRow((short) 2);
	     //Dodawanie danych
	     //obszar A
	      row.createCell(0).setCellValue(1);
	      
	      row.createCell(1).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getEto().getText());
	      row.createCell(2).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getEtoVersion().getText());
	      row.createCell(3).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getDiameterNom().getText());
	      //row4 do uzupe³nienia
	      row.createCell(5).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getThicknessNom().getText());
	      row.createCell(6).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getThicknessTolMin().getText());
	      row.createCell(7).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getThicknessTolMax().getText());
	      row.createCell(8).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHeightNom().getText());
	      row.createCell(9).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHeightMin().getText());
	      row.createCell(10).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHeightMax().getText());
	      row.createCell(11).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getGapMin().getText());
	      row.createCell(12).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getGapMax().getText());
	      row.createCell(13).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getCircularity().getText());
	      row.createCell(14).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getRaUp().getText());
	      row.createCell(15).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getRaDown().getText());
	      row.createCell(16).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getRaOut().getText());
	      row.createCell(17).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getRaIn().getText());
	      row.createCell(18).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getRaGeneral().getText());
	      
	      //obszar B
	      //row 19 do uzupe³nienia
	      
	      
	      //obszar c
	      
	      //row 20 do uzupe³nienia
	      row.createCell(20).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getFrontType());
	      
	      row.createCell(21).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamferNom().getText());
	   
	      row.createCell(22).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamferTol().getText());
	      row.createCell(23).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamferAlfa().getText());
	      row.createCell(24).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamferGoetze().getText());
	      
	      if(Model.main.Main.getSealingRingNoCoatingController().getFrontType().equals("SA"))
	      {
	    	  row.createCell(25).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingAlfaNom().getText());
	    	  row.createCell(26).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingAlfaMinNom().getText());
	    	  row.createCell(27).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingAlfaTol().getText());
	      }
	      
	      else if(Model.main.Main.getSealingRingNoCoatingController().getFrontType().equals("DA"))
	      {
	    	  row.createCell(25).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedAlfaNom().getText());
	    	  row.createCell(26).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedAlfaMinNom().getText());
	    	  row.createCell(27).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedAlfaTol().getText());
	    	  row.createCell(28).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedLappingMin().getText());
	    	  row.createCell(29).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLappedLappingMax().getText());
	    	     	  
	    	  
	      }
	      row.createCell(30).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getMidType());
	      
	      if(Model.main.Main.getSealingRingNoCoatingController().getMidType().equals("J"))
	      {
	      row.createCell(31).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHakfKeystoneAlfaNom().getText());
	      row.createCell(32).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneAlfaTol().getText());
	      row.createCell(33).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneHeightNom().getText());
	      row.createCell(34).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneHeightTolMin().getText());
	      row.createCell(35).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneHeightTolMax().getText());
	      row.createCell(36).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneMeasureDistance().getText());
	      row.createCell(37).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneFlatSurfaceMin().getText());
	      row.createCell(38).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystoneFlatSurfaceMax().getText());
	      	      
	      }
	      else if(Model.main.Main.getSealingRingNoCoatingController().getMidType().equals("J"))
	      {
	      row.createCell(31).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getKeystoneAlfaNom().getText());
	      row.createCell(32).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getKeystoneAlfaTol().getText());
	      row.createCell(33).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getKeystoneHeightNom().getText());
	      row.createCell(34).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getKeystoneHeightTolMin().getText());
	      row.createCell(35).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getKeystoneHeightTolMax().getText());
	      row.createCell(36).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getKeystoneMeasurementDistance().getText());
	      row.createCell(37).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getKeystoneHalfSurfaceMin().getText());
	      row.createCell(38).setCellValue(Model.main.Main.getSealingRingNoCoatingController().getKeystonehalfSurfaceMax().getText());
	      	      
	      }
	   
	      
	      
	      
	      FileOutputStream out = new FileOutputStream(new File("temp.xlsx"));
	      workbook.write(out);
	      out.close();
	      System.out.println("typesofcells.xlsx written successfully");
	}

}
