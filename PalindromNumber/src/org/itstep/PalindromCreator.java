package org.itstep;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PalindromCreator {

 private static Logger logger = Logger.getLogger(PalindromCreator.class.getName());
 
 public static void main(String[] args) {
  int maxPalindromNumber;
  LinkedList<Integer> list = new LinkedList<>();
  for(int i = 100; i < 1000; i++) {
   for(int j = 100; j < 1000; j++) {
    int multResult = i*j;
    if(isPalindrom(multResult)) {
     list.add(multResult);
    }
   }
  }
  maxPalindromNumber = getMaxValue(list);
  logger.log(Level.INFO, String.format("Maximal palindromic number is %d", maxPalindromNumber));
 }

 public static boolean isPalindrom(int palindromNumber) { //  1234321
  char[] numbers = String.valueOf(palindromNumber).toCharArray();
  for (int i = 0; i < numbers.length/2; i++) {
   if(numbers[i] != numbers[numbers.length-1-i]) {
    return false;
   }
  }
  return true;
 }

 public static int getMaxValue(List<Integer> numbersList) {
  int maxValue = Integer.MIN_VALUE;
  for (int i = 0; i < numbersList.size(); i++) {
   if(numbersList.get(i)>=maxValue) {
    maxValue = numbersList.get(i);
   }
  }
  return maxValue;
 }

}