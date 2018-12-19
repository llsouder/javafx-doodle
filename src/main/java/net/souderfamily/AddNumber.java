package net.souderfamily;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class AddNumber implements Initializable {
    public Label lblA;
    public TextField txtB;
    public TextField txtC;
    public IntegerProperty a = new SimpleIntegerProperty();
    public IntegerProperty b = new SimpleIntegerProperty();
    public IntegerProperty c = new SimpleIntegerProperty();

    public void initialize(URL location, ResourceBundle resources) {
        Bindings.bindBidirectional(txtB.textProperty(), b, new NumberStringConverter());
        Bindings.bindBidirectional(txtC.textProperty(), c, new NumberStringConverter());
        lblA.textProperty().bind(b.add(c).asString());
    }
}
