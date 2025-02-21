package javaVoyage;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcher {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Enter the pattern that you want to search in sentence:: ");
        String ptn = sc.nextLine();

        Pattern pattern = Pattern.compile(ptn);
        Matcher matcher = pattern.matcher(sentence);

        if(matcher.find()){
            System.out.println("The pattern found in the sentence (i.e) Found");
        } else{
            System.out.println("The pattern does not found in the sentence (i.e) Not found");
        }

    }
}
