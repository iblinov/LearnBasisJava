package com.epam.learn.gift.main;

import com.epam.learn.gift.entity.Candy;
import com.epam.learn.gift.entity.Chocolate;
import com.epam.learn.gift.entity.Gift;
import com.epam.learn.gift.entity.Sweet;
import com.epam.learn.gift.reader.ChocoladePropertiesReader;
import com.epam.learn.gift.service.GiftService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GiftMain {
  public static void main(String[] args) {
    List<Sweet> list ;
 //   Candy sweet = new Candy(7, 20, Candy.Type.JELLY);
    Sweet candy = new Chocolate(1, 7, 20,  Chocolate.Type.DARK, true);
    //System.out.println(candy.toString());
    ChocoladePropertiesReader reader = new ChocoladePropertiesReader();
    Chocolate chocolade =  reader.propertyReadBundle();
   // System.out.println(chocolade);
    //   sweet.equals(candy);
//    Candy candy1 = new Candy(7, 20, Candy.Type.JELLY);
//    Candy candy2 = new Candy(7, 20, Candy.Type.JELLY);
//    Sweet sweet1 = new Chocolate(100, 30, Chocolate.Type.DARK, true);
//    Chocolate chocolate = new Chocolate(100, 30, Chocolate.Type.DARK, true);
//    list = List.of(sweet1, sweet, candy, candy1, candy2, chocolate);
//    //System.out.println(list);
//    Map<Sweet, Integer> map = new HashMap<>();
//    map.put(candy, 4);
//    map.put(chocolate, 2);
// //   System.out.println(map);
//    Gift gift = new Gift(list);
//    GiftService service = new GiftService();
//    int totalWeight = service.calculateWeight(gift);
//    System.out.println(totalWeight);

  }
}
