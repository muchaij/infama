/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infama;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author HP
 */
public class Infama {

    /**
     * @param args the command line arguments
     */
   
     public static boolean moviesWithinFlightLength(int[] moviesDurations, int flightTime) {

        Arrays.sort(moviesDurations); //sort inorder to use pointers

        int startPointer = 0;
        int endPointer = moviesDurations.length-1;
        int calculatedSum = 0;

        while (startPointer < endPointer) {
            calculatedSum = moviesDurations[startPointer] + moviesDurations[endPointer];
            if (calculatedSum == flightTime) {
                return true;
            }

            if (calculatedSum < flightTime) {
                startPointer++;
            } else {
                endPointer--;
            }
        }


        return false;
    }
//test function
    public static void main (String [] args) {

        System.out.println(moviesWithinFlightLength(new int[] { 2, 9, 5, 11 }, 11));
    }
}