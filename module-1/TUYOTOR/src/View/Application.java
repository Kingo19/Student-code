package View;
import Items.CandyStoreItems;
import pkg.*;

import java.util.List;

public class Application {
   private CashRegister register = new CashRegister();
   private UserInterface ui = new UserInterface();
   private Inventory inv = new Inventory();
   private ShoppingCart cart = new ShoppingCart();

   public static void main(String[] args) {
      Application app = new Application();
      app.run();

   }
   public void run () {
      //set up the main while loop to loop through the menu & menu choices


      while(true){
         int choice = ui.printMainMenu();
         if(choice == 1){
            getInventory();

         }
         else if(choice == 2){
            makeSale();
         }
         else{
            break;
         }

      }
   }

   //method to get Inventory
   private void getInventory(){
      //fetch List from Inventory
      List<CandyStoreItems> inventory = inv.inventoryListMethod();
      //send List to UI to print for user
      ui.printInventory(inventory);
   }

   private void makeSale(){

      //MAKE SALE SUBMENU
      while(true){
         int choice = ui.printSalesMenu(register.getBalance());
         if(choice == 1){
            //asking user for amount
            double amountToAdd = ui.askAmountToAdd();

            //tell the cash register to add that amount to its balance
            String registerMessage = register.addToBalance(amountToAdd);
            ui.printMessage(registerMessage);

         }
         else if(choice == 2){
            //get and print inventory
            getInventory();

            //get information about candy and quantity
            String productIDSelected = ui.selectProduct();
            int selectedQuantity = ui.selectQuantity();

            //validate ID
            try{
               CandyStoreItems itemToAdd = inv.copyCandy(productIDSelected, selectedQuantity); // could throw null pointer

               //validate enough inventory
               if(!inv.validateQuantity(selectedQuantity, productIDSelected)){
                  ui.printMessage("Enter valid quantity");
               }
               //validate money
               else if(!register.validateEnoughMoney(itemToAdd)){
                  ui.printMessage("Not enough balance");
               }
               //if validated, remove from inventory, subtract from balance, add to shopping cart

            }
            catch (NullPointerException e){
               ui.printMessage("Invalid Candy");
            }
         }
         else {
            //Method for complete sale
            //gather all info needed for receipt
            double subtotal = cart.getTotal();
            double change = register.getBalance();
            String changeStatement = register.changeStatement();

            //send info to UI to print
            ui.printReceipt(cart.getCartItems(), subtotal, change, changeStatement);

            //clear register & cart
            register.printChange();
            register.clearRegister();


            //break out to main menu
            break;


         }

      }




   }




}


//TODO Method for validating ints & doubles
//TODO specific error for sold out
//TODO fix nickle problem