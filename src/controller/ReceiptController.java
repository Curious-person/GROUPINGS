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

        if (LoginController.bdress.getProductStatus()) {
            product1.setText(LoginController.bdress.getProductName());
            qty1.setText(Double.toString(LoginController.bdress.getProductQuantity()));
            price1.setText(Double.toString(LoginController.bdress.getProductPrice()));
            amount1.setText(Double
                    .toString(LoginController.bdress.getProductPrice() * LoginController.bdress.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = LoginController.bdress.getProductPrice() * LoginController.bdress.getProductQuantity();

        }

        if (LoginController.bshoes.getProductStatus()) {
            product2.setText(LoginController.bshoes.getProductName());
            qty2.setText(Double.toString(LoginController.bshoes.getProductQuantity()));
            price2.setText(Double.toString(LoginController.bshoes.getProductPrice()));
            amount2.setText(Double
                    .toString(LoginController.bshoes.getProductPrice() * LoginController.bshoes.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = LoginController.bshoes.getProductPrice() * LoginController.bshoes.getProductQuantity();
        }

        if (LoginController.cap.getProductStatus()) {
            product3.setText(LoginController.cap.getProductName());
            qty3.setText(Double.toString(LoginController.cap.getProductQuantity()));
            price3.setText(Double.toString(LoginController.cap.getProductPrice()));
            amount3.setText(Double
                    .toString(LoginController.cap.getProductPrice() * LoginController.cap.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = LoginController.cap.getProductPrice() * LoginController.cap.getProductQuantity();

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

        if (LoginController.csleeve.getProductStatus()) {
            product5.setText(LoginController.csleeve.getProductName());
            qty5.setText(Double.toString(LoginController.csleeve.getProductQuantity()));
            price5.setText(Double.toString(LoginController.csleeve.getProductPrice()));
            amount5.setText(Double
                    .toString(LoginController.csleeve.getProductPrice() * LoginController.csleeve.getProductQuantity()));

            product5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = LoginController.csleeve.getProductPrice() * LoginController.csleeve.getProductQuantity();

        }

        if (LoginController.mdress.getProductStatus()) {
            product6.setText(LoginController.mdress.getProductName());
            qty6.setText(Double.toString(LoginController.mdress.getProductQuantity()));
            price6.setText(Double.toString(LoginController.mdress.getProductPrice()));
            amount6.setText(Double
                    .toString(LoginController.mdress.getProductPrice() * LoginController.mdress.getProductQuantity()));

            product6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = LoginController.mdress.getProductPrice() * LoginController.mdress.getProductQuantity();

        }

        if (LoginController.bshirt.getProductStatus()) {
            product9.setText(LoginController.bshirt.getProductName());
            qty9.setText(Double.toString(LoginController.bshirt.getProductQuantity()));
            price9.setText(Double.toString(LoginController.bshirt.getProductPrice()));
            amount9.setText(Double
                    .toString(LoginController.bshirt.getProductPrice() * LoginController.bshirt.getProductQuantity()));

            product9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = LoginController.bshirt.getProductPrice() * LoginController.bshirt.getProductQuantity();

        }
        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item9Amount;
        total.setText(Double.toString(final_amount));

    }
}