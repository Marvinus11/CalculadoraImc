import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class CalculadoraImc extends Application {
	@Override
	public void start(Stage palco) {
		//Labels para campos de entrada
		Label lblPeso = new Label("Peso");
		lblPeso.getStyleClass().add("text");
		Label lblAltura = new Label("Altura");
		lblAltura.getStyleClass().add("text");

		//Campos de texto para entrada de dados
		TextField campoPeso = new TextField();
		campoPeso.setPromptText("Peso em kg");
		TextField campoAltura = new TextField();
		campoAltura.setPromptText("Altura em metros");

		//Label para mostrar resultado do calculo
		Label lblResultado = new Label();

		//Botão para calcular IMC
		Button btnCalcular = new Button("Calcular");
		btnCalcular.setOnAction(e -> {

			try {
				double peso = Double.parseDouble(campoPeso.getText());
				double altura = Double.parseDouble(campoAltura.getText());

				double imc = peso / (altura * altura);
				lblResultado.setText(String.format("Seu IMC é: %.2f", imc));
			}catch(NumberFormatException ex) {
				lblResultado.setText("Por favor, insira um número válido.");
			}
		});

		//Layout vertical
		VBox layout = new VBox(10, lblPeso, campoPeso, lblAltura, campoAltura, btnCalcular, lblResultado);
		layout.setPadding(new Insets(10));
		layout.setAlignment(Pos.CENTER);
		layout.getStyleClass().add("body");

		//Cena e palco
		Scene cena = new Scene(layout, 500, 400);
		cena.getStylesheets().add("file:///C:/Users/vinic/Dev/UdemyJava/CalculadoraImc/styles.css");
		palco.setTitle("Calculadora de IMC");
		palco.setScene(cena);
		palco.show();

	};

	public static void main(String[] args) {
		launch(args);
	}
}