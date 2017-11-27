package org.itstep;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class PalindromCreatorTest {

 @Test
 public void testIsPalindrom() {
  int palindromNumber = 1234321;
  int notPalindromNumber = 123456;
  PalindromCreator creator = new PalindromCreator();
  boolean isPalindrom = creator.isPalindrom(palindromNumber);
  assertTrue(isPalindrom);
  boolean notPalindrom = creator.isPalindrom(notPalindromNumber);
  assertTrue(!notPalindrom);
  
 }
 
 @Test
 public void testMaxInList() {
  PalindromCreator creator = new PalindromCreator();
  List<Integer> numbersList = new LinkedList<Integer>();
  numbersList.addAll(Arrays.asList(123, 159, 789, 456, 95));
  int maxValue = creator.getMaxValue(numbersList);
  assertEquals(789, maxValue);
 }

}