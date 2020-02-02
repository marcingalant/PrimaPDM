module PrimaPDM 
{
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
	requires javafx.base;
	requires java.desktop;
	requires javafx.swing;
	requires kernel;
	requires layout;
	requires io;
	requires poi.ooxml;
	requires java.persistence;
	
	requires spring.context;
	requires spring.orm;
	
	
	
   
    opens controller to javafx.fxml;
    exports Model.main;
}