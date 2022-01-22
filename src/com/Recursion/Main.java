package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// java program to find the gcd of a number that is HCF.
    int ans = gcd(3,6);
        System.out.println(ans);
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
/*
  This is also called as euclid's algorithm.
 */