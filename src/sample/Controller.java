package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Controller {
    @FXML
    private TextField productName;
    @FXML
    private TextField productManufacturer;
    @FXML
    private ChoiceBox itemType;

    private DatabaseManager databaseManager = new DatabaseManager();

    public Controller() throws SQLException {
    }

    @FXML
    public void initialize() {

    }

    public void addProduct() {
//        String name = productName.getText();
//        String manufacturer = productManufacturer.getText();
//        String type = itemType.toString();

//        databaseManager.insert(type, manufacturer, name);
        System.out.println("Button Pressed");
    }

    public void recordProduction(ActionEvent actionEvent) {
        System.out.println("Button Pressed");
    }
}
