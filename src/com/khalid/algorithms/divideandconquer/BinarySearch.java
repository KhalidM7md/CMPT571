/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.khalid.algorithms.divideandconquer;

/**
 *
 * @author Khalid
 */
public class BinarySearch {
    
    
    
    public static int binarySearch(int[] array,int low, int high, int asc, int parameter)
    {
       int mid;
        if(asc == 1)
        {
           // low = array[0];
           // high = array.length-1;
        }else
        {
            //low = array.length-1;
            //high = array[0];
        }
        
        mid = (low+high)/2;
        
        if(parameter == mid)
        {
            return mid;
        }else if(parameter < mid)
        {
           
            return binarySearch(array, 0, mid-1,1,parameter);
        }else
        {
            return binarySearch(array, mid+1, high, 1, parameter);
        }
        
        
        
        
    }
    
}
