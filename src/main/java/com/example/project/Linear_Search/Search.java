package com.example.project.Linear_Search;
import java.util.ArrayList;

public class Search {
    // A. write a static method named linearSearchFirst that returns the FIRST index
    // a target int is found in an array of ints (both the target and int array
    // should be accepted as parameters); return -1 if target is not found
    // BE SURE TO USE EARLY RETURN (more efficient)
    public static int linearSearchFirst(int[] elements, int target) {
        int a = -1;
        for (int c = 0; c < elements.length; c++) {
            if (elements[c] == target) {
                a = c;
                return a;
            }
        }
        return a;
    }

    // B. write a second static method named linearSearchLast that returns the LAST index
    // a target int is found in an array of ints (both the target and int array
    // should be accepted as parameters); return -1 if target is not found
    // FIGURE OUT A WAY TO DO THIS THAT STILL USES AN EARLY RETURN!!!!!
    public static int linearSearchLast(int[] elements, int target) {
        int a = -1;
        for (int c = elements.length - 1; c > -1; c--) {
            if (elements[c] == target) {
                a = c;
                return a;
            }
        }
        return a;
    }

    // C. write a third static method named linearSearchFound that has the same parameters
    // as linearSearchFirst and linearSearchLast but instead of returning an index,
    // it returns true if target is found or false if target is not found
    // AGAIN, BE SURE TO USE EARLY RETURN!
    public static boolean linearSearchFound(int[] elements, int target) {
        for (int c = 0; c < elements.length; c++) {
            if (elements[c] == target) {
                return true;
            }
        }
        return false;
    }

    // D. write a fourth static method named linearSearchCount that has the same parameters
    // as linearSearchFirst and linearSearchLast and returns the NUMBER OF TIMES the target
    // appears in the array
    public static int linearSearchCount(int[] elements, int target) {
        int a = 0;
        for (int c = 0; c < elements.length; c++) {
            if (elements[c] == target) {
                a ++;
            }
        }
        return a;
    }

    // E. add FOUR more static methods which are the OVERLOADED versions of the four method above
    // (same method name, different parameter types/order) except they take an ArrayList of Integers
    // rather than an array of ints; they should all otherwise work the same way (for this, it is
    // OK to either copy/paste code and change it to work with arraylists instead, or you can figure
    // out a way to call the 4 methods above; up to you)
    public static int linearSearchFirst(ArrayList<Integer> elements, int target) {
        int a = -1;
        for (int c = 0; c < elements.size(); c++) {
            if (elements.get(c) == target) {
                a = c;
                return a;
            }
        }
        return a;
    }

    public static int linearSearchLast(ArrayList<Integer> elements, int target) {
        int a = -1;
        for (int c = elements.size() - 1; c > -1; c--) {
            if (elements.get(c) == target) {
                a = c;
                return a;
            }
        }
        return a;
    }

    public static boolean linearSearchFound(ArrayList<Integer> elements, int target) {
        for (int c = 0; c < elements.size(); c++) {
            if (elements.get(c) == target) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchCount(ArrayList<Integer> elements, int target) {
        int a = 0;
        for (int c = 0; c < elements.size(); c++) {
            if (elements.get(c) == target) {
                a ++;
            }
        }
        return a;
    }



}