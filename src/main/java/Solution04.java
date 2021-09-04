/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/*
    This is a mad lib program that asks the user to input a noun, a verb, an adjective, and an adverb.
    The program outputs a sentence that includes the words inputted by the user.
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String noun = input.next();
        String verb = input.next();
        String adjective = input.next();
        String adverb = input.next();
        System.out.printf("Enter a noun: %s\nEnter a verb: %s\n Enter an adjective: %s\nEnter an adverb: %s\nDo you %s your %s %s %s? That's hilarious!", noun, verb, adjective, adverb, verb, adjective, noun, adverb);
    }
}
