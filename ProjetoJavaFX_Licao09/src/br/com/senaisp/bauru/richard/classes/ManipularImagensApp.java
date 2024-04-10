package br.com.senaisp.bauru.richard.classes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ManipularImagensApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		criarComponentes(root);
		Scene scena = new Scene(root,600,400,Color.BEIGE);
		primeiraStage.setTitle("Manipulando mídias");
		primeiraStage.setScene(scena);
		primeiraStage.show();
	}

	private void criarComponentes(Group root) {
		Duke dk01 = new Duke();
		dk01.setLayoutX(20);
		dk01.setLayoutY(20);
		
		root.getChildren().addAll(dk01);
	}

}
