/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondlargest;
import java.util.*;

/**
 *
 * @author alexandrosaristeridis
 */
public class SecondLargest {
    public Integer seclar(Integer[] arr) {
       int max=0;
       int secmax=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>=max) {
                max=arr[i];
            }
        }int j=0;
        while(arr[j]!=max && arr[j]>secmax){
                secmax=arr[j];
                j++;
        }
      return secmax;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         SecondLargest se=new SecondLargest();
        Scanner s = new Scanner(System.in);
         System.out.println("Enter the elements of the array: ");  
          Integer[] array = new Integer[3];  
    for(int i=0; i<3; i++)  
{  
//reading array elements from the user   
    array[i]=s.nextInt();  
}   System.out.println("return " + se.seclar(array));
    
    }
        
    
    
}
