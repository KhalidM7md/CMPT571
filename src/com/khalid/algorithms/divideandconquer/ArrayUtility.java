/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.khalid.algorithms.divideandconquer;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Khalid
 */
public class ArrayUtility {
    
    protected static int[] generateNumbers(int size)
    {
         int[] array= new int[size];
        Random randomiser = new Random();
        for(int i = 0 ; i<size ; i++)
        {
            array[i] = randomiser.nextInt(1000);
        }
        
        return array;
    }
    
    protected static int[] sortedArray(int asc, int size)
    {
        int[] array =  new int[size];
        int counter; 
        if(asc == 1)//ascending order
        {
            counter = 0;
        }else
        {
            counter = size; 
        }
        
        for (int i : array) {
            array[i] = counter;
            if(asc == 1)
            {
                counter++;
            }
            else
            {
                counter--;
            }
        }
        
        return array;
    }
    protected static void arrayPrinter(int[] array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
}
