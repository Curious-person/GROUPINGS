package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.BedroomLamp;
import model.BedroomPlant;
import model.BeigeBucket;
import model.CargoSleeve;
import model.Cart;
import model.CeilingLamp;
import model.MiniDress;
import model.WallLamp;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController implements Initializable {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    @FXML
    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    static BedroomLamp blamp = new BedroomLamp();
    static CeilingLamp clamp = new CeilingLamp();
    static WallLamp wlamp = new WallLamp();
    static BedroomPlant bplant = new BedroomPlant();
    static BeigeBucket bbucket = new BeigeBucket();
    static CargoSleeve csleeve = new CargoSleeve();
    static MiniDress mdress = new MiniDress();
    static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== BEIGE DRESS ==================//
        blamp.setProductName("Beige Dress");
        blamp.setProductPrice(5.00);
        blamp.setProductImage("images/beige dress.jpg");
        // ============== CAP ==================//

        clamp.setProductName("Cap");
        clamp.setProductPrice(10.00);
        clamp.setProductImage("images/cap.jpg");

        // ============== BEIGE SHOES ==================//
        wlamp.setProductName("Beige Shoes");
        wlamp.setProductPrice(15.00);
        wlamp.setProductImage("images/beige shoes.jpg");

        // ============== BEIGE BUCKET ==================//
        bbucket.setProductName("Beige Bucket");
        bbucket.setProductPrice(500.00);
        bbucket.setProductImage("images/Bucket.png");
        
        // ============== CARGO SLEEVE ==================//
        csleeve.setProductName("Cargo Sleeve");
        csleeve.setProductPrice(500.00);
        csleeve.setProductImage("images/Cargo.PNG");

        // ============== MINI DRESS ==================//
        mdress.setProductName("Mini dress");
        mdress.setProductPrice(899.00);
        mdress.setProductImage("images/midi dress.PNG");


        // ============== PLANTS ==================/

        // ============== BEDROOM PLANT ==================/
        bplant.setProductName("Bedroom Plant");
        bplant.setProductPrice(5.00);
        bplant.setProductImage("images/plant1.jpg");



        // TODO Auto-generated method stub

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            homeRoot = loader.load();

        } catch (Exception e) {
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void login(ActionEvent event) throws IOException {

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            mywarninglabel.setVisible(true);
        }
    }

}
