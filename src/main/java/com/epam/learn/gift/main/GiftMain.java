package com.epam.learn.gift.main;

import com.epam.learn.gift.comparator.IdComparator;
import com.epam.learn.gift.comparator.WeightComparator;
import com.epam.learn.gift.entity.Candy;
import com.epam.learn.gift.entity.Chocolate;
import com.epam.learn.gift.entity.Gift;
import com.epam.learn.gift.entity.Sweet;
import com.epam.learn.gift.reader.ChocoladePropertiesReader;
import com.epam.learn.gift.service.GiftService;

import java.util.*;

public class GiftMain {
  public static void main(String[] args) {
    List<Sweet> list ;
 //   Candy sweet = new Candy(7, 20, Candy.Type.JELLY);
    Sweet candy = new Chocolate(1, 7, 20,  Chocolate.Type.DARK, true);
    //System.out.println(candy.toString());
   // ChocoladePropertiesReader reader = new ChocoladePropertiesReader();
 //   Chocolate chocolade =  reader.propertyReadBundle();
   // System.out.println(chocolade);
    //   sweet.equals(candy);
//    Candy candy1 = new Candy(7, 20, Candy.Type.JELLY);
//    Candy candy2 = new Candy(7, 20, Candy.Type.JELLY);
//    Sweet sweet1 = new Chocolate(100, 30, Chocolate.Type.DARK, true);
    Chocolate ch = new Chocolate(7, 100, 30, Chocolate.Type.DARK, true);
    Chocolate ch0 = new Chocolate(5, 80, 20, Chocolate.Type.MILK, true);
    Chocolate ch1 = new Chocolate(9, 110, 40, Chocolate.Type.DARK, false);
    Chocolate ch2 = new Chocolate(8, 90, 35, Chocolate.Type.WHITE, true);
    ArrayList<Chocolate> sweets = new ArrayList<>();
    sweets.add(ch);
    sweets.add(ch0);
    sweets.add(ch1);
    sweets.add(ch2);
    System.out.println(sweets);
    Collections.sort(sweets, new IdComparator());
    System.out.println(sweets);
    Collections.sort(sweets, new WeightComparator());
    System.out.println(sweets);
  //  Collections.sort(sweets, (o1, o2) -> o1.getSugarPercent() - o2.getSugarPercent());
    Collections.sort(sweets, Comparator.comparing(Chocolate::getSugarPercent));
    System.out.println(sweets);
    List<Integer> numbers = new ArrayList<>();
    numbers.add(7);
    numbers.add(9);
    numbers.add(5);
    numbers.add(8);
    Collections.sort(numbers);
    System.out.println(numbers);
    List<String> strings = new ArrayList<>();
    strings.add("bce");
    strings.add("bcf");
    strings.add("bnea");
    strings.add("abc");
    Collections.sort(strings);
    System.out.println(strings);
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
