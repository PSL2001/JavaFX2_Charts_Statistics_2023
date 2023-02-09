package application;
	
import java.io.File;
import java.io.IOException;

import application.view.AreaController;
import application.view.RootController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class MainApp extends Application {
	private Stage primaryStage;
    private BorderPane rootLayout;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Charts Statistics");
		crearRootLayout();
		crearCenterLayout();
	}
	
	/**
	 * 
	 */
	public void crearAreaLayout() {
		 try {
			 // Load person overview.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(getClass().getResource("view/Area.fxml"));
	            AnchorPane centerLayout = (AnchorPane) loader.load();

	            // Set person overview into the center of root layout.
	            rootLayout.setCenter(centerLayout);
	            
	            AreaController controller = loader.getController();
	            controller.setMainApp(this);
	            

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}

	/**
	 * 
	 */
	public void crearCenterLayout() {
		 try {
	            // Load person overview.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(getClass().getResource("view/CenterLayout.fxml"));
	            AnchorPane centerLayout = (AnchorPane) loader.load();

	            // Set person overview into the center of root layout.
	            rootLayout.setCenter(centerLayout);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}

	/**
	 * Arranca el layout del menu
	 */
	private void crearRootLayout() {
		try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            // Give the controller access to the main app.
            RootController controller = loader.getController();
            controller.setMainApp(this);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * 
	 */
	public void showInitCenter() {
		// TODO Auto-generated method stub
		
	}
}
