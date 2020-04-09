/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort sort = new SelectionSort();
        sort.basicSelectionSort(arr);
        for (int k = 0; k < arr.length; k++)
        {
            
            System.out.print(arr[k] + ", ");
        }
        boolean assertion;
        if (Arrays.equals((arr),Sortedarr))
        {
        	assertion = true;
        }
        else
        {
        	assertion = false;
        }
        System.out.println(assertion);

    }
    
    public void testNegative(){
        
    	 int[] arr = new int[5];
         arr[0] = -9;
         arr[1] = -4;
         arr[2] =-3;
         arr[3] = -1;
         arr[4] = -2;
         
         int[] Sortedarr = new int[5];
         Sortedarr[0] = -9;
         Sortedarr[1] = -4;
         Sortedarr[2] = -3;
         Sortedarr[3] = -2;
         Sortedarr[4] = -1;
         SelectionSort sort = new SelectionSort();
         sort.basicSelectionSort(arr);
         System.out.println();
         for (int k = 0; k < arr.length; k++)
         {
             
             System.out.print( arr[k] + ", ");
         }
         boolean assertion;
         if (Arrays.equals((arr),Sortedarr))
         {
         	assertion = true;
         }
         else
         {
         	assertion = false;
         }
         System.out.println(assertion);
             }
    
    
    public void testMixed(){
        
    	 int[] arr = new int[5];
         arr[0] = -9;
         arr[1] = 5;
         arr[2] =-3;
         arr[3] = 10;
         arr[4] = -4;
         
         int[] Sortedarr = new int[5];
         Sortedarr[0] = -9;
         Sortedarr[1] = -4;
         Sortedarr[2] = -3;
         Sortedarr[3] = 5;
         Sortedarr[4] = 10;
         
         SelectionSort sort = new SelectionSort();
         sort.basicSelectionSort(arr);
         System.out.println();
         for (int k = 0; k < arr.length; k++)
         {
             
             System.out.print( arr[k] + ", ");
         }
         boolean assertion;
         if (Arrays.equals((arr),Sortedarr))
         {
         	assertion = true;
         }
         else
         {
         	assertion = false;
         }
         System.out.println(assertion);
         }
    
    public void testDuplicates(){
        
    	 int[] arr = new int[8];
         arr[0] = 9;
         arr[1] = -4;
         arr[2] =3;
         arr[3] = -1;
         arr[4] = -4;
         arr[5] = 9;
         arr[6] = -4;
         arr[7] = -4;
         
         int[] Sortedarr = new int[8];
         Sortedarr[0] = -4;
         Sortedarr[1] = -4;
         Sortedarr[2] = -4;
         Sortedarr[3] = -4;
         Sortedarr[4] = -1;
         Sortedarr[5] = 3;
         Sortedarr[6] = 9;
         Sortedarr[7] = 9;
         
         SelectionSort sort = new SelectionSort();
         sort.basicSelectionSort(arr);
         System.out.println();
         for (int k = 0; k < arr.length; k++)
         {
             
             System.out.print( arr[k] + ", ");
         }
         boolean assertion;
         if (Arrays.equals((arr),Sortedarr))
         {
         	assertion = true;
         }
         else
         {
         	assertion = false;
         }
         System.out.println(assertion);     
    }


}
