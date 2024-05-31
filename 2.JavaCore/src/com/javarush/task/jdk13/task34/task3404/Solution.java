package com.javarush.task.jdk13.task34.task3404;

/* 
Ханойские башни
*/

public class Solution {
    public static void main(String[] args) {
        int numRings = 3;
        moveRing('A', 'B', 'C', numRings);
    }
                             //source   dest    helper
    public static void moveRing(char a, char b, char c, int numRings) {
        //напишите тут ваш код
        if (numRings == 1)
            System.out.println("from "+a+" to "+b);
        else {
            moveRing(a,c,b,numRings - 1);
            System.out.println("from "+a+" to "+b);
            moveRing(c,b,a,numRings - 1);

        }





    }

    /*
  Procedure Tower_Of_Hanoi(disk, source, dest, helper)
  		IF disk == 1, THEN
      			move disk from source to dest
   		ELSE
     			Tower_Of_Hanoi (disk - 1, source, helper, dest)
      			move disk from source to dest
      			Tower_Of_Hanoi (disk - 1, helper, dest, source)
   		END IF
     */
}