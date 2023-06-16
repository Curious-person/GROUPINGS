package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ReceiptController implements Initializable {

    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount, item7Amount, item8Amount, item9Amount, item10Amount, item11Amount, item12,Amount, item13Amount, item14Amount
    , item15Amount, item16Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, qty9, qty10, qty11, qqty12, qty13, qty14, qty15, qty16,
     product1, product2, product3, product4, product5, product6, product7, product8, product9, product10, product11, product12, product13, product14, product15, product16,
     price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, price12, price13, price14, price15, price16,
     amount1, amount2,amount3, amount4, amount5, amount6, amount7, amount8, amount9, amount10, amount11, amount12, amount13, amount14, amount15, amount16, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (LoginController.blamp.getProductStatus()) {
            product1.setText(LoginController.blamp.getProductName());
            qty1.setText(Double.toString(LoginController.blamp.getProductQuantity()));
            price1.setText(Double.toString(LoginController.blamp.getProductPrice()));
            amount1.setText(Double
                    .toString(LoginController.blamp.getProductPrice() * LoginController.blamp.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = LoginController.blamp.getProductPrice() * LoginController.blamp.getProductQuantity();

        }

        if (LoginController.wlamp.getProductStatus()) {
            product2.setText(LoginController.wlamp.getProductName());
            qty2.setText(Double.toString(LoginController.wlamp.getProductQuantity()));
            price2.setText(Double.toString(LoginController.wlamp.getProductPrice()));
            amount2.setText(Double
                    .toString(LoginController.wlamp.getProductPrice() * LoginController.wlamp.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = LoginController.wlamp.getProductPrice() * LoginController.wlamp.getProductQuantity();
        }

        if (LoginController.clamp.getProductStatus()) {
            product3.setText(LoginController.clamp.getProductName());
            qty3.setText(Double.toString(LoginController.clamp.getProductQuantity()));
            price3.setText(Double.toString(LoginController.clamp.getProductPrice()));
            amount3.setText(Double
                    .toString(LoginController.clamp.getProductPrice() * LoginController.clamp.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = LoginController.clamp.getProductPrice() * LoginController.clamp.getProductQuantity();

        }

         if (LoginController.bbucket.getProductStatus()) {
            product4.setText(LoginController.bbucket.getProductName());
            qty4.setText(Double.toString(LoginController.bbucket.getProductQuantity()));
            price4.setText(Double.toString(LoginController.bbucket.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.bbucket.getProductPrice() * LoginController.bbucket.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.bbucket.getProductPrice() * LoginController.bbucket.getProductQuantity();

        }

        if (LoginController.bplant.getProductStatus()) {
            product9.setText(LoginController.bplant.getProductName());
            qty9.setText(Double.toString(LoginController.bplant.getProductQuantity()));
            price9.setText(Double.toString(LoginController.bplant.getProductPrice()));
            amount9.setText(Double
                    .toString(LoginController.bplant.getProductPrice() * LoginController.bplant.getProductQuantity()));

            product9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = LoginController.bplant.getProductPrice() * LoginController.bplant.getProductQuantity();

        }
        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item9Amount;
        total.setText(Double.toString(final_amount));

    }
}