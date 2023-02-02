package bill;
import dish.Pizza;

import java.time.LocalDateTime;

public class Bill {
    public String createBill(Pizza pizza) {
      double payCheck = 0;
       String bill =  LocalDateTime.now() + "\n";
        if (pizza.isPasta()) {
           payCheck += 1;
         bill +=String.format("%-10s = %5.2f \n","Pasta", 1.0);
        }
        if (pizza.isKalzone()){
          payCheck += 0.5;
          bill +=String.format("%-10s = %5.2f \n", "Kalzone", 0.5);
        }
     bill += "______________________"+"\n";
      bill += "Sum =" + payCheck +"\n";
        return bill;
    }
}