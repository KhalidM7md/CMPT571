/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.khalid.algorithms.divideandconquer;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Khalid
 */
public class ExchangeSort {
        
    public static int[] exchangeSort(int[] array)
    {
      
        long startTime = Calendar.getInstance().getTimeInMillis();
        
        for(int i=0 ; i < array.length ; i++)
        {
            for(int j = i+1 ; j < array.length ; j++)
            {
                if(array[i] < array[j])
                {
                    //saving position j
                    int temp = array[j];
                    //adding i into position j
                    array[j] = array[i];
                    //adding temp (i.e. j) into position i
                    array[i] = temp;
                }
            }
        }
        long endTime = Calendar.getInstance().getTimeInMillis();
        
        System.out.println("Sorted: "+array.length+
                " elements, time taken: "+(endTime-startTime)/1000);
        
         
        return array;
    }
}
