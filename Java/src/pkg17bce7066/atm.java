/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class atm
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i = 0 ; i < n ; i++){
               int a = sc.nextInt();
               if(a <= k){
                   k = k - a;
                   System.out.print("1");
               }
               else{
                   System.out.print("0");
               }
            }
            System.out.println("");
        }
    }
}