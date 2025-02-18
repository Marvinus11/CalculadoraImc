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
		Label lblPeso = new Label("Peso: ");
		Label lblAltura = new Label("Altura: ");

		//Campos de texto para entrada de dados
		TextField campoPeso = new TextField();
		campoPeso.setPromptText("Peso em kg");
		TextField campoAltura = new TextField();
		campoAltura.setPromptText("Peso em metros");

		//Label para mostrar resultado do calculo
		Label lblResultado = new Label();

		//Botão para calcular IMC
		Button btnCalcular = new Button("Calcular");
		btnCalcular.setOnAction(e -> {
			double peso = Double.parseDouble(campoPeso.getText());
			double altura = Double.parseDouble(campoAltura.getText());

			double imc = peso / (altura * altura);
			lblResultado.setText(String.format("Seu IMC é: %.2f", imc));
		});

		//Layout vertical
		VBox layout = new VBox(10, lblPeso, campoPeso, lblAltura, campoAltura, btnCalcular, lblResultado);
		layout.setPadding(new Insets(10));
		layout.setAlignment(Pos.CENTER);

		//Cena e palco
		Scene cena = new Scene(layout, 300, 250);
		palco.setTitle("Calculadora de IMC");
		palco.setScene(cena);
		palco.show();

	};

	public static void main(String[] args) {
		launch(args);
	}
}