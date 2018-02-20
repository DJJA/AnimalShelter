package nl.djja.animalshelter.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Controller {

    @FXML
    public Button btnAddAnimal;

    @FXML
    private Button btnReserveAnimal;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfNameReservor;

    @FXML
    private ComboBox cboxSpecies;

    @FXML
    private TextField tfBadHabits;

    @FXML
    private RadioButton rbutMale;

    @FXML
    private RadioButton rbutFemale;

    @FXML
    private ListView lvAnimals;

    @FXML
    private void initialize(){
        //tfName = new TextField();
    }

    public Controller(){

    }

    @FXML
    private void handleBtnAddAnimal(ActionEvent event){
        tfName.setText("Doeihe!!");
        btnAddAnimal.setText("Blijf van me af!");
        System.out.println("Event handler aangesproken jah");
    }
}
