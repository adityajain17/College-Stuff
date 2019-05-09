/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

import java.util.Scanner;

/**
 *
 * @author User
 */
import java.util.*;
import java.io.*;

public class perm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
            int n=sc.nextInt();
            int arr[]=new int[n+1];
            int count=0;
            
            for(int j=0;j<n;j++) {
                int x=sc.nextInt();
                if(x<=n) arr[x]=1; 
            }
            for(int j=1;j<n+1;j++){
                if(arr[j]!=1) count++;
            }
            
        System.out.println(count);
    }
}
}