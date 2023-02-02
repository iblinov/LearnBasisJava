package dish;
import dish.Ingredient;
import dish.Pizza;

import java.time.LocalDateTime;

public class Bill {
    public String createBill(Pizza pizza) {
        double payCheck = 0;
       String bill =  LocalDateTime.now() + "\n";
        if (pizza.isKalzone()) {
           payCheck += Ingredient.KALZONE.getPrice();
         bill +=String.format("%-10s = %5.2f \n", Ingredient.KALZONE, Ingredient.KALZONE.getPrice());
        }
        if (pizza.isMais()){
          payCheck += Ingredient.MAIS.getPrice();
          bill +=String.format("%-10s = %5.2f \n", Ingredient.MAIS, Ingredient.MAIS.getPrice());
        }
      bill += "______________________"+"\n";
      bill += "Sum =" + payCheck +"\n";
        return bill;
    }
}