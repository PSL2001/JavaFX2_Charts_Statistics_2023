package application;
	
import java.io.IOException;

import application.view.RootLayoutController;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


public class MainApp extends Application {
	
    private Stage primaryStage;
    private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		 this.primaryStage = primaryStage;
	        this.primaryStage.setTitle("Estadisticas");

	        //this.primaryStage.getIcons().add(new Image("file:resources/images/address_book_32.png"));
	        initRootLayout();
	        showCentro();
	        //showArea();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	 public void initRootLayout() {
	        try {
	            // Load root layout from fxml file.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
	            rootLayout = (BorderPane) loader.load();

	            // Show the scene containing the root layout.
	            Scene scene = new Scene(rootLayout);
	            primaryStage.setScene(scene);

	            // Give the controller access to the main app.
	            RootLayoutController controller = loader.getController();
	            controller.setMainApp(this);

	            primaryStage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	      
  }
	   public void showCentro() {
	        try {
	            // Load person overview.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("view/CenterLayout.fxml"));
	            AnchorPane CentroLayout = (AnchorPane) loader.load();

	            // Set person overview into the center of root layout.
	            rootLayout.setCenter(CentroLayout);

	            // Give the controller access to the main app.
	           // PersonOverviewController controller = loader.getController();
	           // controller.setMainApp(this);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	   
	   public void showArea() {
	        try {
	            // Load person overview.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("view/Area.fxml"));
	            AnchorPane AreaLayout = (AnchorPane) loader.load();

	            // Set person overview into the center of root layout.
	            rootLayout.setCenter(AreaLayout);

	            // Give the controller access to the main app.
	           // PersonOverviewController controller = loader.getController();
	           // controller.setMainApp(this);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	   public void showCirculo() {
	        try {
	            // Load person overview.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("view/Circulo.fxml"));
	            AnchorPane AreaLayout = (AnchorPane) loader.load();

	            // Set person overview into the center of root layout.
	            rootLayout.setCenter(AreaLayout);

	            // Give the controller access to the main app.
	           // PersonOverviewController controller = loader.getController();
	           // controller.setMainApp(this);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	   
	   public void showWebView() {
		   Stage stage = new Stage();
		// Create the WebView
	        WebView webView = new WebView();
	         
	        // Create the WebEngine
	        final WebEngine webEngine = webView.getEngine();
	 
	        // LOad the Start-Page
	        webEngine.load(getClass().getResource("resources/ayuda.html").toString());
	 
	        // Create the VBox
	        VBox root = new VBox();
	        // Add the WebView to the VBox
	        root.getChildren().add(webView);
	 
	        // Set the Style-properties of the VBox
	        root.setStyle("-fx-padding: 10;" +
	                "-fx-border-style: solid inside;" +
	                "-fx-border-width: 2;" +
	                "-fx-border-insets: 5;" +
	                "-fx-border-radius: 5;" +
	                "-fx-border-color: blue;");
	 
	        // Create the Scene
	        Scene scene = new Scene(root);
	        // Add  the Scene to the Stage
	        stage.setScene(scene);
	        // Display the Stage
	        stage.show();
	   }
	   
	   public void showBrowser() {
		   HostServices hs =  getHostServices();
	       hs.showDocument(getClass().getResource("resources/ayuda.html").toString());
	   }
	   
	   public void showPDF() {
		   HostServices hs =  getHostServices();
	       hs.showDocument(getClass().getResource("resources/ayuda.pdf").toString());
	   }

	/**
	 * 
	 */
	public void showLineChart() {
		 try {
	            // Load person overview.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("view/LineChartLayout.fxml"));
	            AnchorPane AreaLayout = (AnchorPane) loader.load();

	            // Set person overview into the center of root layout.
	            rootLayout.setCenter(AreaLayout);

	            // Give the controller access to the main app.
	           // PersonOverviewController controller = loader.getController();
	           // controller.setMainApp(this);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	public void showBubbleChart() {
		try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/BubbleChartLayout.fxml"));
            AnchorPane AreaLayout = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(AreaLayout);

            // Give the controller access to the main app.
           // PersonOverviewController controller = loader.getController();
           // controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	/**
	 * 
	 */
	public void showBarChart() {
		try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/BarChartLayout.fxml"));
            AnchorPane AreaLayout = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(AreaLayout);

            // Give the controller access to the main app.
           // PersonOverviewController controller = loader.getController();
           // controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	/**
	 * 
	 */
	public void showScatterChart() {
		try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ScatterChartLayout.fxml"));
            AnchorPane AreaLayout = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(AreaLayout);

            // Give the controller access to the main app.
           // PersonOverviewController controller = loader.getController();
           // controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
} 
