package Strings;

import java.lang.String;

public class Concatination {
    public static void main(String args[]){
        String firstName = "Mansi";
        String lastName ="kumari";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        //to find length
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length() ;i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
