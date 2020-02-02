package controller;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;


import javafx.embed.swing.SwingFXUtils;

import java.awt.image.RenderedImage;

import Model.drawing.*;

public class sealingRingNoCoatingController {

	
	//**KONTROLKI**
	
	@FXML
    private TextField DiameterNom;

    @FXML
    private ComboBox<?> DiameterTol;

    @FXML
    private TextField thicknessNom;

    @FXML
    private TextField thicknessTolMin;

    @FXML
    private TextField thicknessTolMax;

    @FXML
    private TextField heightNom;

    @FXML
    private TextField heightMin;

    @FXML
    private TextField heightMax;

    @FXML
    private TextField gapMin;

    @FXML
    private TextField gapMax;

    @FXML
    private TextField raOut;

    @FXML
    private TextField raIn;

    @FXML
    private TextField raUp;

    @FXML
    private TextField raDown;

    @FXML
    private TextField raGeneral;

    @FXML
    private TextField circularity;

    @FXML
    private RadioButton simpleRing;

    @FXML
    private RadioButton simpleRingChamfers;
    
    
    @FXML
    private TextField SimpleRingChamferNom;

    @FXML
    private TextField SimpleRingChamferTol;

    @FXML
    private TextField SimpleRingChamferAlfa;

    @FXML
    private TextField SimpleRingChamferGoetze;

    @FXML
    private RadioButton taperFacedRing;

    @FXML
    private RadioButton taperFacedRingLapped;

    @FXML
    private TextField taperFacedRingAlfaNom;
    
    @FXML
    private TextField taperFacedRingAlfaMinNom;

    @FXML
    private TextField taperFacedRingAlfaTol;

    @FXML
    private TextField taperFacedRingLappedAlfaNom;
    
    @FXML
    private TextField taperFacedRingLappedAlfaMinNom;

    @FXML
    private TextField taperFacedRingLappedAlfaTol;

    @FXML
    private TextField taperFacedRingLappedLappingMin;

    @FXML
    private TextField taperFacedRingLappedLappingMax;

    @FXML
    private RadioButton Straight;

    @FXML
    private RadioButton halfKeystone;

    @FXML
    private TextField hakfKeystoneAlfaNom;

    @FXML
    private TextField halfKeystoneAlfaTol;

    @FXML
    private TextField halfKeystoneHeightNom;

    @FXML
    private TextField halfKeystoneHeightTolMin;

    @FXML
    private TextField halfKeystoneHeightTolMax;

    @FXML
    private TextField halfKeystoneMeasureDistance;

    @FXML
    private TextField halfKeystoneFlatSurfaceMin;

    @FXML
    private TextField halfKeystoneFlatSurfaceMax;

    @FXML
    private TextField keystoneAlfaNom;

    @FXML
    private TextField keystoneAlfaTol;

    @FXML
    private TextField keystoneHeightNom;

    @FXML
    private TextField keystoneHeightTolMin;
    
    @FXML
    private TextField keystoneHeightTolMax;

    @FXML
    private TextField keystoneMeasurementDistance;

    @FXML
    private TextField keystoneHalfSurfaceMin;

    @FXML
    private TextField keystonehalfSurfaceMax;

    @FXML
    private RadioButton keystone;

    @FXML
    private RadioButton upNone;

    @FXML
    private RadioButton upSmallChamfer;

    @FXML
    private RadioButton upBigChamfer;

    @FXML
    private RadioButton upBevel;

    @FXML
    private TextField upSmallChamferNom;

    @FXML
    private TextField upSmallChamferTil;

    @FXML
    private TextField upSmallChamferAlfa;

    @FXML
    private TextField upSmallChamferGoetze;

    @FXML
    private TextField upChamferFlatNom;

    @FXML
    private TextField upChamferFlatTolMin;

    @FXML
    private TextField upChamferFlatTolMax;

    @FXML
    private TextField upChamferAlfaNom;

    @FXML
    private TextField upChamferAlfaTol;

    @FXML
    private TextField upChamferGoetze;

    @FXML
    private TextField upBevelFlatNom;

    @FXML
    private TextField upBevelFlatTolMin;

    @FXML
    private TextField upBevelFlatTolMax;

    @FXML
    private TextField upBevelAlfaMin;

    @FXML
    private TextField upBevelAlfaMax;

    @FXML
    private TextField upBevelBetaMin;

    @FXML
    private TextField upBevelBetaMax;

    @FXML
    private TextField upRadius;
    
    @FXML
    private TextField upBevelNom;

    @FXML
    private TextField upBevelTolmin;

    @FXML
    private TextField UpBevelTolMax;

    @FXML
    private RadioButton downNone;

    @FXML
    private RadioButton downSmallChamfer;

    @FXML
    private RadioButton downBigChamfer;

    @FXML
    private RadioButton downBevel;

    @FXML
    private TextField downSmallChamferNom;

    @FXML
    private TextField downSmallChamferTol;

    @FXML
    private TextField downSmallChamferAlfa;

    @FXML
    private TextField downSmallChamferGoetze;

    @FXML
    private TextField downChamferFlatNom;

    @FXML
    private TextField downChamferFlatTolMin;

    @FXML
    private TextField downChamferFlatTolMax;

    @FXML
    private TextField downChamferAlfa;

    @FXML
    private TextField downChamferAlfaTol;

    @FXML
    private TextField downChamferGoetze;
    
    @FXML
    private TextField downBevelFlatNom;

    @FXML
    private TextField downBevelFlatTolMin;

    @FXML
    private TextField downBevelFlatTolMax;

    @FXML
    private TextField downBevelAlfaMin;

    @FXML
    private TextField downBevelAlfaMax;

    @FXML
    private TextField downBevelBetaMin;

    @FXML
    private TextField downBevelBetaMax;

    @FXML
    private TextField downBevelRadius;
    
    @FXML
    private TextField downBevelNom;

    @FXML
    private TextField downBevelTolMin;

    @FXML
    private TextField downBevelTolMax;
    
    @FXML
    private TextField designedBy;

    @FXML
    private TextField designedByDateDay;

    @FXML
    private TextField designedByDateMonth;

    @FXML
    private TextField designedByDateYear;

    @FXML
    private TextField chceckedBy;

    @FXML
    private TextField approvedBy;

    @FXML
    private TextField checkedByDateDay;

    @FXML
    private TextField checkedByDateMonth;

    @FXML
    private TextField checkedByDateYear;

    @FXML
    private TextField approvedByDateDay;

    @FXML
    private TextField approvedByDateMonth;

    @FXML
    private TextField approvedByDateYear;

    @FXML
    private TextField eto;

    @FXML
    private TextField etoVersion;

    @FXML
    private TextArea PPcode;

    @FXML
    private TextField PPname;


    @FXML
    private TextField fMin;

    @FXML
    private TextField fMax;

    @FXML
    private TextField ovalityMin;

    @FXML
    private TextField ovalityMax;

    @FXML
    private ComboBox<?> phosphate;
    
    //gettery i settery
	
	public TextField getDiameterNom() {
		return DiameterNom;
	}

	public void setDiameterNom(TextField diameterNom) {
		DiameterNom = diameterNom;
	}

	public ComboBox<?> getDiameterTol() {
		return DiameterTol;
	}

	public void setDiameterTol(ComboBox<?> diameterTol) {
		DiameterTol = diameterTol;
	}

	public TextField getThicknessNom() {
		return thicknessNom;
	}

	public void setThicknessNom(TextField thicknessNom) {
		this.thicknessNom = thicknessNom;
	}

	public TextField getThicknessTolMin() {
		return thicknessTolMin;
	}

	public void setThicknessTolMin(TextField thicknessTolMin) {
		this.thicknessTolMin = thicknessTolMin;
	}

	public TextField getThicknessTolMax() {
		return thicknessTolMax;
	}

	public void setThicknessTolMax(TextField thicknessTolMax) {
		this.thicknessTolMax = thicknessTolMax;
	}

	public TextField getHeightNom() {
		return heightNom;
	}

	public void setHeightNom(TextField heightNom) {
		this.heightNom = heightNom;
	}

	public TextField getHeightMin() {
		return heightMin;
	}

	public void setHeightMin(TextField heightMin) {
		this.heightMin = heightMin;
	}

	public TextField getHeightMax() {
		return heightMax;
	}

	public void setHeightMax(TextField heightMax) {
		this.heightMax = heightMax;
	}

	public TextField getGapMin() {
		return gapMin;
	}

	public void setGapMin(TextField gapMin) {
		this.gapMin = gapMin;
	}

	public TextField getGapMax() {
		return gapMax;
	}

	public void setGapMax(TextField gapMax) {
		this.gapMax = gapMax;
	}

	public TextField getRaOut() {
		return raOut;
	}

	public void setRaOut(TextField raOut) {
		this.raOut = raOut;
	}

	public TextField getRaIn() {
		return raIn;
	}

	public void setRaIn(TextField raIn) {
		this.raIn = raIn;
	}

	public TextField getRaUp() {
		return raUp;
	}

	public void setRaUp(TextField raUp) {
		this.raUp = raUp;
	}

	public TextField getRaDown() {
		return raDown;
	}

	public void setRaDown(TextField raDown) {
		this.raDown = raDown;
	}

	public TextField getRaGeneral() {
		return raGeneral;
	}

	public void setRaGeneral(TextField raGeneral) {
		this.raGeneral = raGeneral;
	}

	public TextField getCircularity() {
		return circularity;
	}

	public void setCircularity(TextField circularity) {
		this.circularity = circularity;
	}

	public RadioButton getSimpleRing() {
		return simpleRing;
	}

	public void setSimpleRing(RadioButton simpleRing) {
		this.simpleRing = simpleRing;
	}

	public RadioButton getSimpleRingChamfers() {
		return simpleRingChamfers;
	}

	public void setSimpleRingChamfers(RadioButton simpleRingChamfers) {
		this.simpleRingChamfers = simpleRingChamfers;
	}

	public RadioButton getTaperFacedRing() {
		return taperFacedRing;
	}

	public void setTaperFacedRing(RadioButton taperFacedRing) {
		this.taperFacedRing = taperFacedRing;
	}

	public RadioButton getTaperFacedRingLapped() {
		return taperFacedRingLapped;
	}

	public void setTaperFacedRingLapped(RadioButton taperFacedRingLapped) {
		this.taperFacedRingLapped = taperFacedRingLapped;
	}

	public TextField getTaperFacedRingAlfaNom() {
		return taperFacedRingAlfaNom;
	}

	public void setTaperFacedRingAlfaNom(TextField taperFacedRingAlfaNom) {
		this.taperFacedRingAlfaNom = taperFacedRingAlfaNom;
	}

	public TextField getTaperFacedRingAlfaTol() {
		return taperFacedRingAlfaTol;
	}

	public void setTaperFacedRingAlfaTol(TextField taperFacedRingAlfaTol) {
		this.taperFacedRingAlfaTol = taperFacedRingAlfaTol;
	}

	public TextField getTaperFacedRingLappedAlfaNom() {
		return taperFacedRingLappedAlfaNom;
	}

	public void setTaperFacedRingLappedAlfaNom(TextField taperFacedRingLappedAlfaNom) {
		this.taperFacedRingLappedAlfaNom = taperFacedRingLappedAlfaNom;
	}

	public TextField getTaperFacedRingLappedAlfaTol() {
		return taperFacedRingLappedAlfaTol;
	}

	public void setTaperFacedRingLappedAlfaTol(TextField taperFacedRingLappedAlfaTol) {
		this.taperFacedRingLappedAlfaTol = taperFacedRingLappedAlfaTol;
	}

	public TextField getTaperFacedRingLappedLappingMin() {
		return taperFacedRingLappedLappingMin;
	}

	public void setTaperFacedRingLappedLappingMin(TextField taperFacedRingLappedLappingMin) {
		this.taperFacedRingLappedLappingMin = taperFacedRingLappedLappingMin;
	}

	public TextField getTaperFacedRingLappedLappingMax() {
		return taperFacedRingLappedLappingMax;
	}

	public void setTaperFacedRingLappedLappingMax(TextField taperFacedRingLappedLappingMax) {
		this.taperFacedRingLappedLappingMax = taperFacedRingLappedLappingMax;
	}

	public RadioButton getStraight() {
		return Straight;
	}

	public void setStraight(RadioButton straight) {
		Straight = straight;
	}

	public RadioButton getHalfKeystone() {
		return halfKeystone;
	}

	public void setHalfKeystone(RadioButton halfKeystone) {
		this.halfKeystone = halfKeystone;
	}

	public TextField getHakfKeystoneAlfaNom() {
		return hakfKeystoneAlfaNom;
	}

	public void setHakfKeystoneAlfaNom(TextField hakfKeystoneAlfaNom) {
		this.hakfKeystoneAlfaNom = hakfKeystoneAlfaNom;
	}

	public TextField getHalfKeystoneAlfaTol() {
		return halfKeystoneAlfaTol;
	}

	public void setHalfKeystoneAlfaTol(TextField halfKeystoneAlfaTol) {
		this.halfKeystoneAlfaTol = halfKeystoneAlfaTol;
	}

	public TextField getHalfKeystoneHeightNom() {
		return halfKeystoneHeightNom;
	}

	public void setHalfKeystoneHeightNom(TextField halfKeystoneHeightNom) {
		this.halfKeystoneHeightNom = halfKeystoneHeightNom;
	}

	public TextField getHalfKeystoneHeightTolMin() {
		return halfKeystoneHeightTolMin;
	}

	public void setHalfKeystoneHeightTolMin(TextField halfKeystoneHeightTolMin) {
		this.halfKeystoneHeightTolMin = halfKeystoneHeightTolMin;
	}

	public TextField getHalfKeystoneHeightTolMax() {
		return halfKeystoneHeightTolMax;
	}

	public void setHalfKeystoneHeightTolMax(TextField halfKeystoneHeightTolMax) {
		this.halfKeystoneHeightTolMax = halfKeystoneHeightTolMax;
	}

	public TextField getHalfKeystoneMeasureDistance() {
		return halfKeystoneMeasureDistance;
	}

	public void setHalfKeystoneMeasureDistance(TextField halfKeystoneMeasureDistance) {
		this.halfKeystoneMeasureDistance = halfKeystoneMeasureDistance;
	}

	public TextField getHalfKeystoneFlatSurfaceMin() {
		return halfKeystoneFlatSurfaceMin;
	}

	public void setHalfKeystoneFlatSurfaceMin(TextField halfKeystoneFlatSurfaceMin) {
		this.halfKeystoneFlatSurfaceMin = halfKeystoneFlatSurfaceMin;
	}

	public TextField getHalfKeystoneFlatSurfaceMax() {
		return halfKeystoneFlatSurfaceMax;
	}

	public void setHalfKeystoneFlatSurfaceMax(TextField halfKeystoneFlatSurfaceMax) {
		this.halfKeystoneFlatSurfaceMax = halfKeystoneFlatSurfaceMax;
	}

	public TextField getKeystoneAlfaNom() {
		return keystoneAlfaNom;
	}

	public void setKeystoneAlfaNom(TextField keystoneAlfaNom) {
		this.keystoneAlfaNom = keystoneAlfaNom;
	}

	public TextField getKeystoneAlfaTol() {
		return keystoneAlfaTol;
	}

	public void setKeystoneAlfaTol(TextField keystoneAlfaTol) {
		this.keystoneAlfaTol = keystoneAlfaTol;
	}

	public TextField getKeystoneHeightNom() {
		return keystoneHeightNom;
	}

	public void setKeystoneHeightNom(TextField keystoneHeightNom) {
		this.keystoneHeightNom = keystoneHeightNom;
	}

	public TextField getKeystoneHeightTolMin() {
		return keystoneHeightTolMin;
	}

	public void setKeystoneHeightTolMin(TextField keystoneHeightTolMin) {
		this.keystoneHeightTolMin = keystoneHeightTolMin;
	}

	public TextField getKeystoneMeasurementDistance() {
		return keystoneMeasurementDistance;
	}

	public void setKeystoneMeasurementDistance(TextField keystoneMeasurementDistance) {
		this.keystoneMeasurementDistance = keystoneMeasurementDistance;
	}

	public TextField getKeystoneHalfSurfaceMin() {
		return keystoneHalfSurfaceMin;
	}

	public void setKeystoneHalfSurfaceMin(TextField keystoneHalfSurfaceMin) {
		this.keystoneHalfSurfaceMin = keystoneHalfSurfaceMin;
	}

	public TextField getKeystonehalfSurfaceMax() {
		return keystonehalfSurfaceMax;
	}

	public void setKeystonehalfSurfaceMax(TextField keystonehalfSurfaceMax) {
		this.keystonehalfSurfaceMax = keystonehalfSurfaceMax;
	}

	public RadioButton getKeystone() {
		return keystone;
	}

	public void setKeystone(RadioButton keystone) {
		this.keystone = keystone;
	}

	public RadioButton getUpNone() {
		return upNone;
	}

	public void setUpNone(RadioButton upNone) {
		this.upNone = upNone;
	}

	public RadioButton getUpSmallChamfer() {
		return upSmallChamfer;
	}

	public void setUpSmallChamfer(RadioButton upSmallChamfer) {
		this.upSmallChamfer = upSmallChamfer;
	}

	public RadioButton getUpBigChamfer() {
		return upBigChamfer;
	}

	public void setUpBigChamfer(RadioButton upBigChamfer) {
		this.upBigChamfer = upBigChamfer;
	}

	public RadioButton getUpBevel() {
		return upBevel;
	}

	public void setUpBevel(RadioButton upBevel) {
		this.upBevel = upBevel;
	}

	public TextField getUpSmallChamferNom() {
		return upSmallChamferNom;
	}

	public void setUpSmallChamferNom(TextField upSmallChamferNom) {
		this.upSmallChamferNom = upSmallChamferNom;
	}

	public TextField getUpSmallChamferTil() {
		return upSmallChamferTil;
	}

	public void setUpSmallChamferTil(TextField upSmallChamferTil) {
		this.upSmallChamferTil = upSmallChamferTil;
	}

	public TextField getUpSmallChamferAlfa() {
		return upSmallChamferAlfa;
	}

	public void setUpSmallChamferAlfa(TextField upSmallChamferAlfa) {
		this.upSmallChamferAlfa = upSmallChamferAlfa;
	}

	public TextField getUpSmallChamferGoetze() {
		return upSmallChamferGoetze;
	}

	public void setUpSmallChamferGoetze(TextField opSmallChamferGoetze) {
		this.upSmallChamferGoetze = opSmallChamferGoetze;
	}

	public TextField getUpChamferFlatNom() {
		return upChamferFlatNom;
	}

	public void setUpChamferFlatNom(TextField upChamferFlatNom) {
		this.upChamferFlatNom = upChamferFlatNom;
	}

	public TextField getUpChamferFlatTolMin() {
		return upChamferFlatTolMin;
	}

	public void setUpChamferFlatTolMin(TextField upChamferFlatTolMin) {
		this.upChamferFlatTolMin = upChamferFlatTolMin;
	}

	public TextField getUpChamferFlatTolMax() {
		return upChamferFlatTolMax;
	}

	public void setUpChamferFlatTolMax(TextField upChamferFlatTolMax) {
		this.upChamferFlatTolMax = upChamferFlatTolMax;
	}

	public TextField getUpChamferAlfaNom() {
		return upChamferAlfaNom;
	}

	public void setUpChamferAlfaNom(TextField upChamferAlfaNom) {
		this.upChamferAlfaNom = upChamferAlfaNom;
	}

	public TextField getUpChamferAlfaTol() {
		return upChamferAlfaTol;
	}

	public void setUpChamferAlfaTol(TextField upChamferAlfaTol) {
		this.upChamferAlfaTol = upChamferAlfaTol;
	}

	public TextField getUpChamferGoetze() {
		return upChamferGoetze;
	}

	public void setUpChamferGoetze(TextField upChamferGoetze) {
		this.upChamferGoetze = upChamferGoetze;
	}

	public TextField getUpBevelFlatNom() {
		return upBevelFlatNom;
	}

	public void setUpBevelFlatNom(TextField upBevelFlatNom) {
		this.upBevelFlatNom = upBevelFlatNom;
	}

	public TextField getUpBevelFlatTolMin() {
		return upBevelFlatTolMin;
	}

	public void setUpBevelFlatTolMin(TextField upBevelFlatTolMin) {
		this.upBevelFlatTolMin = upBevelFlatTolMin;
	}

	public TextField getUpBevelFlatTolMax() {
		return upBevelFlatTolMax;
	}

	public void setUpBevelFlatTolMax(TextField upBevelFlatTolMax) {
		this.upBevelFlatTolMax = upBevelFlatTolMax;
	}

	public TextField getUpBevelAlfaMin() {
		return upBevelAlfaMin;
	}

	public void setUpBevelAlfaMin(TextField upBevelAlfaMin) {
		this.upBevelAlfaMin = upBevelAlfaMin;
	}

	public TextField getUpBevelAlfaMax() {
		return upBevelAlfaMax;
	}

	public void setUpBevelAlfaMax(TextField upBevelAlfaMax) {
		this.upBevelAlfaMax = upBevelAlfaMax;
	}

	public TextField getUpBevelBetaMin() {
		return upBevelBetaMin;
	}

	public void setUpBevelBetaMin(TextField upBevelBetaMin) {
		this.upBevelBetaMin = upBevelBetaMin;
	}

	public TextField getUpBevelBetaMax() {
		return upBevelBetaMax;
	}

	public void setUpBevelBetaMax(TextField upBevelBetaMax) {
		this.upBevelBetaMax = upBevelBetaMax;
	}

	public TextField getUpRadius() {
		return upRadius;
	}

	public void setUpRadius(TextField upRadius) {
		this.upRadius = upRadius;
	}

	public RadioButton getDownNone() {
		return downNone;
	}

	public void setDownNone(RadioButton downNone) {
		this.downNone = downNone;
	}

	public RadioButton getDownSmallChamfer() {
		return downSmallChamfer;
	}

	public void setDownSmallChamfer(RadioButton downSmallChamfer) {
		this.downSmallChamfer = downSmallChamfer;
	}

	public RadioButton getDownBigChamfer() {
		return downBigChamfer;
	}

	public void setDownBigChamfer(RadioButton downBigChamfer) {
		this.downBigChamfer = downBigChamfer;
	}

	public RadioButton getDownBevel() {
		return downBevel;
	}

	public void setDownBevel(RadioButton downBevel) {
		this.downBevel = downBevel;
	}

	public TextField getDownSmallChamferNom() {
		return downSmallChamferNom;
	}

	public void setDownSmallChamferNom(TextField downSmallChamferNom) {
		this.downSmallChamferNom = downSmallChamferNom;
	}

	public TextField getDownSmallChamferTol() {
		return downSmallChamferTol;
	}

	public void setDownSmallChamferTol(TextField downSmallChamferTol) {
		this.downSmallChamferTol = downSmallChamferTol;
	}

	public TextField getDownSmallChamferAlfa() {
		return downSmallChamferAlfa;
	}

	public void setDownSmallChamferAlfa(TextField downSmallChamferAlfa) {
		this.downSmallChamferAlfa = downSmallChamferAlfa;
	}

	public TextField getDownSmallChamferGoetze() {
		return downSmallChamferGoetze;
	}

	public void setDownSmallChamferGoetze(TextField downSmallChamferGoetze) {
		this.downSmallChamferGoetze = downSmallChamferGoetze;
	}

	public TextField getDownChamferFlatNom() {
		return downChamferFlatNom;
	}

	public void setDownChamferFlatNom(TextField downChamferFlatNom) {
		this.downChamferFlatNom = downChamferFlatNom;
	}

	public TextField getDownChamferFlatTolMin() {
		return downChamferFlatTolMin;
	}

	public void setDownChamferFlatTolMin(TextField downChamferFlatTolMin) {
		this.downChamferFlatTolMin = downChamferFlatTolMin;
	}

	public TextField getDownChamferFlatTolMax() {
		return downChamferFlatTolMax;
	}

	public void setDownChamferFlatTolMax(TextField downChamferFlatTolMax) {
		this.downChamferFlatTolMax = downChamferFlatTolMax;
	}

	public TextField getDownChamferAlfa() {
		return downChamferAlfa;
	}

	public void setDownChamferAlfa(TextField downChamferAlfa) {
		this.downChamferAlfa = downChamferAlfa;
	}

	public TextField getDownChamferAlfaTol() {
		return downChamferAlfaTol;
	}

	public void setDownChamferAlfaTol(TextField downChamferAlfaTol) {
		this.downChamferAlfaTol = downChamferAlfaTol;
	}

	public TextField getDownChamferGoetze() {
		return downChamferGoetze;
	}

	public void setDownChamferGoetze(TextField downChamferGoetze) {
		this.downChamferGoetze = downChamferGoetze;
	}
	

	public TextField getDesignedBy() {
		return designedBy;
	}

	public void setDesignedBy(TextField designedBy) {
		this.designedBy = designedBy;
	}

	public TextField getDesignedByDateDay() {
		return designedByDateDay;
	}

	public void setDesignedByDateDay(TextField designedByDateDay) {
		this.designedByDateDay = designedByDateDay;
	}

	public TextField getDesignedByDateMonth() {
		return designedByDateMonth;
	}

	public void setDesignedByDateMonth(TextField designedByDateMonth) {
		this.designedByDateMonth = designedByDateMonth;
	}

	public TextField getDesignedByDateYear() {
		return designedByDateYear;
	}

	public void setDesignedByDateYear(TextField designedByDateYear) {
		this.designedByDateYear = designedByDateYear;
	}

	public TextField getChceckedBy() {
		return chceckedBy;
	}

	public void setChceckedBy(TextField chceckedBy) {
		this.chceckedBy = chceckedBy;
	}

	public TextField getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(TextField approvedBy) {
		this.approvedBy = approvedBy;
	}

	public TextField getCheckedByDateDay() {
		return checkedByDateDay;
	}

	public void setCheckedByDateDay(TextField checkedByDateDay) {
		this.checkedByDateDay = checkedByDateDay;
	}

	public TextField getCheckedByDateMonth() {
		return checkedByDateMonth;
	}

	public void setCheckedByDateMonth(TextField checkedByDateMonth) {
		this.checkedByDateMonth = checkedByDateMonth;
	}

	public TextField getCheckedByDateYear() {
		return checkedByDateYear;
	}

	public void setCheckedByDateYear(TextField checkedByDateYear) {
		this.checkedByDateYear = checkedByDateYear;
	}

	public TextField getApprovedByDateDay() {
		return approvedByDateDay;
	}

	public void setApprovedByDateDay(TextField approvedByDateDay) {
		this.approvedByDateDay = approvedByDateDay;
	}

	public TextField getApprovedByDateMonth() {
		return approvedByDateMonth;
	}

	public void setApprovedByDateMonth(TextField approvedByDateMonth) {
		this.approvedByDateMonth = approvedByDateMonth;
	}

	public TextField getApprovedByDateYear() {
		return approvedByDateYear;
	}

	public void setApprovedByDateYear(TextField approvedByDateYear) {
		this.approvedByDateYear = approvedByDateYear;
	}

	public TextField getEto() {
		return eto;
	}

	public void setEto(TextField eto) {
		this.eto = eto;
	}

	public TextField getEtoVersion() {
		return etoVersion;
	}

	public void setEtoVersion(TextField etoVersion) {
		this.etoVersion = etoVersion;
	}

	public TextArea getPPcode() {
		return PPcode;
	}

	public void setPPcode(TextArea pPcode) {
		PPcode = pPcode;
	}

	public TextField getPPname() {
		return PPname;
	}

	public void setPPname(TextField pPname) {
		PPname = pPname;
	}

	public void setRenderedImage(RenderedImage renderedImage) {
		this.renderedImage = renderedImage;
	}

	
	public TextField getfMin() {
		return fMin;
	}

	public void setfMin(TextField fMin) {
		this.fMin = fMin;
	}

	public TextField getfMax() {
		return fMax;
	}

	public void setfMax(TextField fMax) {
		this.fMax = fMax;
	}

	public TextField getOvalityMin() {
		return ovalityMin;
	}

	public void setOvalityMin(TextField ovalityMin) {
		this.ovalityMin = ovalityMin;
	}

	public TextField getOvalityMax() {
		return ovalityMax;
	}

	public void setOvalityMax(TextField ovalityMax) {
		this.ovalityMax = ovalityMax;
	}

	public ComboBox<?> getPhosphate() {
		return phosphate;
	}

	public void setPhosphate(ComboBox<?> phosphate) {
		this.phosphate = phosphate;
	}

	
	public TextField getTaperFacedRingAlfaMinNom() {
		return taperFacedRingAlfaMinNom;
	}

	public void setTaperFacedRingAlfaMinNom(TextField taperFacedRingAlfaMinNom) {
		this.taperFacedRingAlfaMinNom = taperFacedRingAlfaMinNom;
	}

	public TextField getTaperFacedRingLappedAlfaMinNom() {
		return taperFacedRingLappedAlfaMinNom;
	}

	public void setTaperFacedRingLappedAlfaMinNom(TextField taperFacedRingLappedAlfaMinNom) {
		this.taperFacedRingLappedAlfaMinNom = taperFacedRingLappedAlfaMinNom;
	}

	
	public TextField getSimpleRingChamferNom() {
		return SimpleRingChamferNom;
	}

	public void setSimpleRingChamferNom(TextField simpleRingChamferNom) {
		SimpleRingChamferNom = simpleRingChamferNom;
	}

	public TextField getSimpleRingChamferTol() {
		return SimpleRingChamferTol;
	}

	public void setSimpleRingChamferTol(TextField simpleRingChamferTol) {
		SimpleRingChamferTol = simpleRingChamferTol;
	}

	public TextField getSimpleRingChamferAlfa() {
		return SimpleRingChamferAlfa;
	}

	public void setSimpleRingChamferAlfa(TextField simpleRingChamferAlfa) {
		SimpleRingChamferAlfa = simpleRingChamferAlfa;
	}

	public TextField getSimpleRingChamferGoetze() {
		return SimpleRingChamferGoetze;
	}

	public void setSimpleRingChamferGoetze(TextField simpleRingChamferGoetze) {
		SimpleRingChamferGoetze = simpleRingChamferGoetze;
	}

	
	public TextField getKeystoneHeightTolMax() {
		return keystoneHeightTolMax;
	}

	public void setKeystoneHeightTolMax(TextField keystoneHeightTolMax) {
		this.keystoneHeightTolMax = keystoneHeightTolMax;
	}

	
	public TextField getUpBevelNom() {
		return upBevelNom;
	}

	public void setUpBevelNom(TextField upBevelNom) {
		this.upBevelNom = upBevelNom;
	}

	public TextField getUpBevelTolmin() {
		return upBevelTolmin;
	}

	public void setUpBevelTolmin(TextField upBevelTolmin) {
		this.upBevelTolmin = upBevelTolmin;
	}

	public TextField getUpBevelTolMax() {
		return UpBevelTolMax;
	}

	public void setUpBevelTolMax(TextField upBevelTolMax) {
		UpBevelTolMax = upBevelTolMax;
	}

	public TextField getDownBevelNom() {
		return downBevelNom;
	}

	public void setDownBevelNom(TextField downBevelNom) {
		this.downBevelNom = downBevelNom;
	}

	public TextField getDownBevelTolMin() {
		return downBevelTolMin;
	}

	public void setDownBevelTolMin(TextField downBevelTolMin) {
		this.downBevelTolMin = downBevelTolMin;
	}

	public TextField getDownBevelTolMax() {
		return downBevelTolMax;
	}

	public void setDownBevelTolMax(TextField downBevelTolMax) {
		this.downBevelTolMax = downBevelTolMax;
	}

	
	public TextField getDownBevelFlatNom() {
		return downBevelFlatNom;
	}

	public void setDownBevelFlatNom(TextField downBevelFlatNom) {
		this.downBevelFlatNom = downBevelFlatNom;
	}

	public TextField getDownBevelFlatTolMin() {
		return downBevelFlatTolMin;
	}

	public void setDownBevelFlatTolMin(TextField downBevelFlatTolMin) {
		this.downBevelFlatTolMin = downBevelFlatTolMin;
	}

	public TextField getDownBevelFlatTolMax() {
		return downBevelFlatTolMax;
	}

	public void setDownBevelFlatTolMax(TextField downBevelFlatTolMax) {
		this.downBevelFlatTolMax = downBevelFlatTolMax;
	}

	public TextField getDownBevelAlfaMin() {
		return downBevelAlfaMin;
	}

	public void setDownBevelAlfaMin(TextField downBevelAlfaMin) {
		this.downBevelAlfaMin = downBevelAlfaMin;
	}

	public TextField getDownBevelAlfaMax() {
		return downBevelAlfaMax;
	}

	public void setDownBevelAlfaMax(TextField downBevelAlfaMax) {
		this.downBevelAlfaMax = downBevelAlfaMax;
	}

	public TextField getDownBevelBetaMin() {
		return downBevelBetaMin;
	}

	public void setDownBevelBetaMin(TextField downBevelBetaMin) {
		this.downBevelBetaMin = downBevelBetaMin;
	}

	public TextField getDownBevelBetaMax() {
		return downBevelBetaMax;
	}

	public void setDownBevelBetaMax(TextField downBevelBetaMax) {
		this.downBevelBetaMax = downBevelBetaMax;
	}

	public TextField getDownBevelRadius() {
		return downBevelRadius;
	}

	public void setDownBevelRadius(TextField downBevelRadius) {
		this.downBevelRadius = downBevelRadius;
	}

	

	//POZOSTA£E ZMIENNE
	 int scale = 10;
	 
	public String FrontType;
    
	public String MidType;
	
	public String InUp;
	
	public String InDown;
   
	public String getFrontType() {
		return FrontType;
	}

	public void setFrontType(String frontType) {
		FrontType = frontType;
	}
	
		
	public String getMidType() {
		return MidType;
	}

	public void setMidType(String midType) {
		MidType = midType;
	}

	
	public String getInUp() {
		return InUp;
	}

	public void setInUp(String inUp) {
		InUp = inUp;
	}

	public String getInDown() {
		return InDown;
	}

	public void setInDown(String inDown) {
		InDown = inDown;
	}



	private  WritableImage wim = new WritableImage(scale*297, scale*210);
    
    private  RenderedImage renderedImage ;
    
    
    public WritableImage getWim() {
		return wim;
	}

	public void setWim(WritableImage wim) {
		this.wim = wim;
	}

	
	public  RenderedImage getRenderedImage() {
		return renderedImage;
	}

	
	
	public void initialize()
    {
    	 
    }
  
    //METODY
    

    
    public void backToRing()

    {
    	Model.main.windowInitializer.getSealingRingNoCoatingStage().hide();
    	Model.main.windowInitializer.getChooseRingStage().show();
    }
    
    public void cancelDrawing()
    {
    	
    }
    
    public void drawRing()
    {	
    	//literki przekroju
    	if(Model.main.Main.getSealingRingNoCoatingController().getSimpleRing().isSelected())
    	{
    		setFrontType("RA-01");
    	}
    	else if(Model.main.Main.getSealingRingNoCoatingController().getSimpleRingChamfers().isSelected())
    	{
    		setFrontType("RA-02");
    	}
    	else if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRing().isSelected())
    	{
    		setFrontType("SA");
    	}
    	else if(Model.main.Main.getSealingRingNoCoatingController().getTaperFacedRingLapped().isSelected())
    	{
    		setFrontType("DA");
    	}
    	
    	if(Model.main.Main.getSealingRingNoCoatingController().getStraight().isSelected())
    	{
    		setMidType("R");
    	}
    	if(Model.main.Main.getSealingRingNoCoatingController().getHalfKeystone().isSelected())
    	{
    		setMidType("J");
    	}
    	if(Model.main.Main.getSealingRingNoCoatingController().getKeystone().isSelected())
    	{
    		setMidType("T");
    	}
    	
    	if(Model.main.Main.getSealingRingNoCoatingController().getUpNone().isSelected())
    	
    	Model.main.windowInitializer.getSealingRingNoCoatingStage().hide();
    	
    	Group root = new Group();
    	
    	Canvas drawFrame = new Canvas(scale*297,scale*210);
    	Canvas drawSectionAB = new Canvas(scale*297,scale*210);
    	Canvas drawSectionC = new Canvas(scale*297,scale*210);
    	Canvas drawDimensions = new Canvas(scale*297,scale*210);
    	
    	GraphicsContext gc = drawFrame.getGraphicsContext2D();
    	GraphicsContext gc2 = drawSectionAB.getGraphicsContext2D();
    	GraphicsContext gc3 = drawSectionAB.getGraphicsContext2D();
    	GraphicsContext gc4 = drawDimensions.getGraphicsContext2D();
    	
    	drawFrame drawFrame1 = new drawFrame();
    	drawFrame1.drawShapes(gc);
    	DrawRingNoCoatingSectionAB drawSection = new DrawRingNoCoatingSectionAB();
    	drawSection.drawShapes(gc2);
    	DrawRingNoCoatingSectionC sectionC = new DrawRingNoCoatingSectionC();
    	sectionC.drawShapes(gc3);
    	DrawRingNoCoatingDimensions drawDimensions1 = new DrawRingNoCoatingDimensions();
    	drawDimensions1.drawShapes(gc4);
    	
    	
    	root.getChildren().add(drawFrame);
    	root.getChildren().add(drawSectionAB);
    	root.getChildren().add(drawSectionC);
    	root.getChildren().add(drawDimensions);
      
    	root.snapshot(null, wim);
    	ImageView img = new ImageView();
        img.setImage(wim);
       
    	
    	Model.main.windowInitializer.getMainPaneControler().getPanelPP().setContent(img);
    	img.setCache(true);
	     img.setSmooth(true);
	     img.setCursor(Cursor.OPEN_HAND);
    	
    	 renderedImage = SwingFXUtils.fromFXImage(wim, null);
   		img.setPreserveRatio(true);
    }

	
	
	
	
}
