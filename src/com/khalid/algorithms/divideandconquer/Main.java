/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.khalid.algorithms.divideandconquer;

import static com.khalid.algorithms.divideandconquer.ExchangeSort.exchangeSort;
import java.util.Calendar;

/**
 *
 * @author Khalid
 */
public class Main {
    
        public static void main(String[] args) {
        
             int[] array = ArrayUtility.sortedArray(1,99999999);
             long startTime = Calendar.getInstance().getTimeInMillis();
             int result = BinarySearch.binarySearch(array, 0, array.length-1, 1, 0);
             long endTime = Calendar.getInstance().getTimeInMillis();
             
             System.out.println("Time taken: "+(endTime-startTime)+" result is: "+result);
                     
                     
        
        }
}
