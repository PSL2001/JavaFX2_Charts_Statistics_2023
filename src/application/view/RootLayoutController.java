/**
 * proyecto JavaFX2_charts_statistics_GarciaRubioSergio-application.view-RootLayoutController.java
 * 9 feb 2023 13:14:24
 * @author Sergio García Rubio
 */
package application.view;

import application.MainApp;
import javafx.fxml.FXML;

/**
 * @author Sergio
 *
 */
public class RootLayoutController {
	 private MainApp mainApp;

	    /**
	     * Is called by the main application to give a reference back to itself.
	     * 
	     * @param mainApp
	     */
	    public void setMainApp(MainApp mainApp) {
	        this.mainApp = mainApp;
	    }
	    @FXML
	    private void handleShowInitCenter() {
	      mainApp.showCentro();
	    }
	    @FXML
	    private void handleShowArea() {
		      mainApp.showArea();
		    }
	    @FXML
	    private void handleShowCirculo() {
		      mainApp.showCirculo();
		    }
	    
	    @FXML
	    private void handleShowLineChart() {
	    	mainApp.showLineChart();
	    }
	    
	    @FXML
	    private void handleShowBubbleChart() {
	    	mainApp.showBubbleChart();
	    }
	    
	    @FXML
	    private void handleShowBarChart() {
	    	mainApp.showBarChart();
	    }
	    
	    @FXML
	    private void handleShowScatterChart() {
	    	mainApp.showScatterChart();
	    }
	    
	    @FXML
	    private void handleshowWebView() {
	    	mainApp.showWebView();
	    }
	    
	    @FXML
	    private void handleShowBrowser() {
	    	mainApp.showBrowser();
	    }
	    
	    @FXML
	    private void handleShowPDF() {
	    	mainApp.showPDF();
	    }
}
