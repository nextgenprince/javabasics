import java.util.*;

public class promotion1{
    public static void main (String args[]) {
       int a = 10;
       float b = 20.25f;
       long c = 25;
       double d = 30;
       int ans = a+b+c+d; //whole expression is promoted to double data type which can't be stored inside int 

       System.err.println(ans);
    }
}