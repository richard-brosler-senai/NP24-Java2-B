module ProjetoJavaFX_Licao09 {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	
	opens br.com.senaisp.bauru.richard.classes to javafx.graphics,
			javafx.controls, javafx.media, javafx.fxml;
	
}