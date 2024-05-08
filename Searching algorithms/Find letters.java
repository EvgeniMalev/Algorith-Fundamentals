import java.util.*;
import java.util.Scanner;

public class Findletters {
  public static void main(String args) {

   Scanner scanner = new Scanner(System.in);

   String[] words = scanner.nextLine.split("");

   String x = scanner.nextLine();
   String y = scanner.nextLine();

       for (int i = 0; i < words.length; i++) {
        if (words[i] == x && words[i] == y)
            return i;
       else if (words[i] == x)
            return i + 1;
             else if (words[i] == y)
            return i + 2;
    }
    return -1;

    String result = search(arr, y, x);

    if (result == -1)
        System.out.print(The word contains a letter: %d , x)
    else if (result == i )
        System.out.print(The word contains both letter: %d %d, x , y)
    else if (result == i + 2 )
        System.out.print(The word contains both letter: %d,  y)
    else {
         System.out.print(There are no containing letters)     
   }  
    return 0;
