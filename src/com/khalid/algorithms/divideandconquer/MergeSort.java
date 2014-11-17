/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// n =100 h = 50 m = 50 
// n =102 h= 51 = m = 51 
// n
package com.khalid.algorithms.divideandconquer;

/**
 *
 * @author Khalid
 */
public class MergeSort {
    
    public static int MergeSort(int[]  array)
    {
        int low = 0; 
        int high = array.length-1;
        int mid = (low+high)/2;
        
        int[] lowarray = new int[mid];
        System.arraycopy(array, low, lowarray, low, mid);
        
        int[] highArray = new int[mid];
        System.arraycopy(array, mid+1, highArray, low, mid);
        
//for now
        return 0;
    }
    
}
