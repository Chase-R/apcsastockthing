package com.example.template;
//github
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    public Button btnClick,addStockButton,addPersonButton,sellButton,buyButton;
    public Label lblDisplay;
    public TextField txtInput,lastNameField,stockNameField,sharesField;
    public ListView ownedList,stocksList,namesList;
    public TextField firstNameField;
    public TextField depositField;

    private Manager Manager =new Manager();


    public void initialize(){
        addradpeeople();
        addradstock();

   }
    public void handleClick(ActionEvent actionEvent) {

        
    }

    public void handleNameClick(MouseEvent mouseEvent) {

    }

    public void handleStockClick(MouseEvent mouseEvent) {


    }

    public void handleOwnedClick(MouseEvent mouseEvent) {
    }

    public void handleBuy(ActionEvent actionEvent) {


    }

    public void handleSell(ActionEvent actionEvent) {
    }

    public void handleAddPerson(ActionEvent actionEvent) {
        String lastname = lastNameField.getText();
        String firstname = firstNameField.getText();

        if(depositField.getText() == null){
            Manager.addPerson(lastname, firstname, 0);
        }else {
            double cash = Double.parseDouble(depositField.getText());

            Manager.addPerson(lastname, firstname, cash);
        }

        for (Person person : Manager.getPeople()){
            System.out.println(person.getPersonName());
        }
        updatescreen();


    }
    public  void addradpeeople(){
        String[] fnames = {"bob", "sally","joe","john","steve"};
        String[] lnames= {"bob", "sally","joe","john","steve"};

        for (int i = 0; i < 5; i++){
            Manager.addPerson(lnames[i], fnames[i], (int)(Math.random()*1000));
        }
        updatescreen();


    }
    public void addradstock(){
        String[] snames = {"amazon", "apple", "google"};

        for (int i = 0; i < 3; i++){
            Manager.addStok(snames[i],(int)(Math.random()*50+50));
        }
        updatescreen();

    }

    public void handleAddStock(ActionEvent actionEvent) {
        String sname = stockNameField.getText();
        Manager.addStok(sname,(int)(Math.random()*51+50));
        updatescreen();

    }

    public void updatescreen(){
        stocksList.getItems().clear();
        namesList.getItems().clear();

        for (Stock stock : Manager.getStocksAvaliable()){
            stocksList.getItems().add(stock.getStockname());
            System.out.println(stock.getPrice());
        }
        for (Person person : Manager.getPeople()){
            namesList.getItems().add(person.getPersonName());
        }
    }

    public void handleDeposit(ActionEvent actionEvent) {
    }
}