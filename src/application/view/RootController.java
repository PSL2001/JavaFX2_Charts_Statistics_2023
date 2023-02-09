/**
 * JavaFX2_Charts_Statistics_2023 - application.view - RootController.java
 * 9 feb 2023 - 13:13:18
 * @author Pablo Sánchez López
 */
package application.view;

import application.MainApp;
import javafx.fxml.FXML;

/**
 * @author usuario
 *
 */
public class RootController {
	// Reference to the main application
    private MainApp mainApp;

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    
    /**
     * Opens the birthday statistics.
     */
    @FXML
    private void handleShowInitCenter() {
      mainApp.crearCenterLayout();
    }
    
    /**
     * Opens the birthday statistics.
     */
    @FXML
    private void handleShowArea() {
      mainApp.crearAreaLayout();
    }
}
