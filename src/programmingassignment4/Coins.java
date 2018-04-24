/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment4;

/**
 * Author: Nik Floden
 * Date: April 24th 2018
 * Overview: This is programming assignment 4 for CSCI 232, it was made in
 * netbeans IDE and the test file is in junit 4. 
 */
public class Coins {
    
    public static int count(int[] system, int amount){
        int result = 0;
        if (system.length == 0){
           throw new IllegalArgumentException("Array of size 0 is not allowed"); 
        }
        while(amount != 0){
            for(int i = system.length - 1; i >= 0; i--){
                if(system[i] <= amount){
                    amount = amount - system[i];
                    result++;
                }
            }
        }
        return result;
    }

    public static int change(int[] system, int amount) {

        int result;
        int inf = Integer.MAX_VALUE - 1;
        if (system.length == 0) {
            throw new IllegalArgumentException("Array of size 0 is not allowed");
        }

        int[][] table = new int[system.length + 1][amount + 1];
        for (int j = 1; j <= amount; j++) {
            table[0][j] = inf;
        }

        for (int x = 1; x <= system.length; x++) {
            for (int y = 1; y <= amount; y++) {
                if (y - system[x - 1] >= 0) {
                    result = table[x][y - system[x - 1]];
                } else {
                    result = inf;
                }
                table[x][y] = Math.min(table[x - 1][y], 1 + result);
            }
        }

        return table[system.length][amount];
    }
}
 