/**
 * JavaFX2_Charts_Statistics_2023 - application.view - AreaController.java
 * 9 feb 2023 - 12:56:23
 * @author Pablo Sánchez López
 */
package application.view;

import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

/**
 * @author usuario
 *
 */
public class AreaController {
	@FXML
	Pane paneView;
	
	private MainApp mainApp;

	@FXML
	private void inicializar() {
		cargarDatos();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void cargarDatos() {
		final NumberAxis xAxis = new NumberAxis(1, 31, 1);
		final NumberAxis yAxis = new NumberAxis();
		final AreaChart<Number, Number> ac = new AreaChart<>(xAxis, yAxis);
		ac.setTitle("Temperature Monitoring (in Degrees C)");

		XYChart.Series seriesApril = new XYChart.Series();
		seriesApril.setName("April");
		seriesApril.getData().add(new XYChart.Data(1, 4));
		seriesApril.getData().add(new XYChart.Data(3, 10));
		seriesApril.getData().add(new XYChart.Data(6, 15));
		seriesApril.getData().add(new XYChart.Data(9, 8));
		seriesApril.getData().add(new XYChart.Data(12, 5));
		seriesApril.getData().add(new XYChart.Data(15, 18));
		seriesApril.getData().add(new XYChart.Data(18, 15));
		seriesApril.getData().add(new XYChart.Data(21, 13));
		seriesApril.getData().add(new XYChart.Data(24, 19));
		seriesApril.getData().add(new XYChart.Data(27, 21));
		seriesApril.getData().add(new XYChart.Data(30, 21));

		XYChart.Series seriesMay = new XYChart.Series();
		seriesMay.setName("May");
		seriesMay.getData().add(new XYChart.Data(1, 20));
		seriesMay.getData().add(new XYChart.Data(3, 15));
		seriesMay.getData().add(new XYChart.Data(6, 13));
		seriesMay.getData().add(new XYChart.Data(9, 12));
		seriesMay.getData().add(new XYChart.Data(12, 14));
		seriesMay.getData().add(new XYChart.Data(15, 18));
		seriesMay.getData().add(new XYChart.Data(18, 25));
		seriesMay.getData().add(new XYChart.Data(21, 25));
		seriesMay.getData().add(new XYChart.Data(24, 23));
		seriesMay.getData().add(new XYChart.Data(27, 26));
		seriesMay.getData().add(new XYChart.Data(31, 26));
		
		ac.getData().addAll(seriesApril, seriesMay);
		
		paneView.getChildren().add(ac);
	}

	/**
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		 this.mainApp = mainApp;
		
	}
}
