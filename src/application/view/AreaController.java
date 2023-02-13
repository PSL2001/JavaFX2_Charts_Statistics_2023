/**
 * proyecto JavaFX2_charts_statistics_GarciaRubioSergio-application.view-AreaController.java
 * 9 feb 2023 12:56:29
 * @author Sergio García Rubio
 */
package application.view;

import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

/**
 * @author Sergio
 *
 */
public class AreaController {
   @FXML
   private Pane paneview;
   
   @FXML
   private void initialize() {
	   load();
   }
   
   private void load() {
	   
	
	   final NumberAxis xAxis = new NumberAxis(1, 31, 1);
       final NumberAxis yAxis = new NumberAxis();
        final AreaChart<Number,Number> ac =
           new AreaChart<>(xAxis,yAxis);
       ac.setTitle("Monitoreo de temperatura (en grados C)");

       XYChart.Series seriesAbril= new XYChart.Series();
       seriesAbril.setName("Abril");
       seriesAbril.getData().add(new XYChart.Data(1, 4));
       seriesAbril.getData().add(new XYChart.Data(3, 10));
       seriesAbril.getData().add(new XYChart.Data(6, 15));
       seriesAbril.getData().add(new XYChart.Data(9, 8));
       seriesAbril.getData().add(new XYChart.Data(12, 5));
       seriesAbril.getData().add(new XYChart.Data(15, 18));
       seriesAbril.getData().add(new XYChart.Data(18, 15));
       seriesAbril.getData().add(new XYChart.Data(21, 13));
       seriesAbril.getData().add(new XYChart.Data(24, 19));
       seriesAbril.getData().add(new XYChart.Data(27, 21));
       seriesAbril.getData().add(new XYChart.Data(30, 21));
       
       XYChart.Series seriesMay = new XYChart.Series();
       seriesMay.setName("Mayo");
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
       ac.getData().addAll(seriesAbril, seriesMay);
       paneview.getChildren().add(ac);
   }
}
