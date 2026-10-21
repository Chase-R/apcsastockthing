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
    public Label stockdetails;
    private Person chosenPerson;
    private Stock chosenStock;
    private Manager Manager =new Manager();


    public void initialize(){
        addradpeeople();
        addradstock();

   }
    public void handleClick(ActionEvent actionEvent) {

        
    }

    public void handleNameClick(MouseEvent mouseEvent) {

        chosenPerson = Manager.getPeople().get(namesList.getSelectionModel().getSelectedIndex());
//        lblDisplay.setText(chosenPerson.getPersonName()+" | "+lblDisplay.getText());
        System.out.println(chosenPerson.getPersonName());
        ownedList.getItems().clear();
        for (int i = 0; i <chosenPerson.getMyStocks().size(); i++){
            ownedList.getItems().add(chosenPerson.getMyStocks().get(i).getStock().getStockname() + " Number of stocks owned: "+chosenPerson.getMyStocks().get(i).getSharesOwned());

        }
        lblDisplay.setText(String.valueOf(chosenPerson.getCash()));


    }

    public void handleStockClick(MouseEvent mouseEvent) {

        int selectedIndex= stocksList.getSelectionModel().getSelectedIndex();
//        lblDisplay.setText(Manager.getStocksAvaliable().get(selectedIndex).getStockname() +":" + Manager.getStocksAvaliable().get(selectedIndex).getPrice());
        chosenStock = Manager.getStocksAvaliable().get(selectedIndex);
        lblDisplay.setText(chosenStock.getStockname() + ": price = " + chosenStock.getPrice());

//        String selectedtext = stocksList.getSelectionModel().getSelectedItem().toString();
//        System.out.println(selectedtext);
//        int found = -1;
//        for (int i = 0; i <Manager.getStocksAvaliable().size(); i++){
//            if (Manager.getStocksAvaliable().get(i).getStockname().equals(selectedtext)){
//                found = i;
//                break;
//            }
//        }
//        if (found == -1){
//            lblDisplay.setText("no stock found");
//        }else {
//            lblDisplay.setText(Manager.getStocksAvaliable().get(found).getStockname() +":" + Manager.getStocksAvaliable().get(i).getPrice());
//
//        }


    }

    public void handleOwnedClick(MouseEvent mouseEvent) {
    }

    public void handleBuy(ActionEvent actionEvent) {


        lblDisplay.setText(Manager.buyStock( chosenPerson,chosenStock,Integer.parseInt( sharesField.getText())));


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