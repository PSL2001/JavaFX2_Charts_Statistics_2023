/**
 * proyecto JavaFX2_charts_statistics_GarciaRubioSergio-application.view-CirculoController.java
 * 9 feb 2023 14:01:04
 * @author Sergio García Rubio
 */
package application.view;

/**
 * @author Sergio
 *
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.layout.Pane;
public class CirculoController   {
	 @FXML
	   private Pane paneviewCir;
	   
	   @FXML
	   private void initialize() {
		   load();
	   }
	   
	   private void load() {
		   
		
		   ObservableList<PieChart.Data> pieChartData =
				   FXCollections.observableArrayList(
				   new PieChart.Data("Grapefruit", 13),
				   new PieChart.Data("Oranges", 25),
				   new PieChart.Data("Plums", 10),
				   new PieChart.Data("Pears", 22),
				   new PieChart.Data("Apples", 30));
				   final PieChart chart = new PieChart(pieChartData);
				   chart.setTitle("Imported Fruits");
				   paneviewCir.getChildren().add(chart);
	   }
}
