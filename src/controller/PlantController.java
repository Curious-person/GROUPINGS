package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import alert.AlertMaker;

public class PlantController implements Initializable {

    @FXML
    Label name1, price1;

    @FXML
    ImageView img1;

    @FXML
    Button button1, cartbutton, homebutton, logoutbutton;

    @FXML
    private AnchorPane scenepane; 

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

  

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== BEDROOM LAMP ==================//

        name1.setText(LoginController.bplant.getProductName());
        price1.setText(Double.toString(LoginController.bplant.getProductPrice()));
        Image bedroomPlant = new Image(LoginController.bplant.getProductImage());
        img1.setImage(bedroomPlant);
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            LoginController.bplant.setProductStatus(true);
            LoginController.bplant.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane4);
        }

        LoginController.cart.showItems();
    }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        // Load items to cart before switching to checkout page
        LoginController.checkoutController.showItems(LoginController.cart.getItemList());

        // Set initial total amount in checkout page
        LoginController.checkoutController.getInitialAmount();

        Scene scene = new Scene(LoginController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void logout(ActionEvent event) {

        Alert alert = new Alert(AlertType.CONFIRMATION  );
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to leave JAACK.");
        alert.setContentText("Do you wish to stop shopping?: ");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenepane.getScene().getWindow();
            System.out.println("You have successfully logged out.");
            stage.close();
        }


    }
}
