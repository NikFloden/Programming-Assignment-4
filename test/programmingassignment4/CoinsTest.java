/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment4;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nik
 */
public class CoinsTest {
    
    public CoinsTest() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void noSystem() {
        int array[] = {};
        Coins.change(array, 30);
    }
    
    @Test
    public void sixtythree(){
        int array[] = {25, 21, 10, 5, 1};
        assertEquals(3, Coins.count(array, 63));
    }
    
    @Test
    public void sixtythreeDP(){
        int array[] = {1, 5, 10, 21, 25};
        assertEquals(3, Coins.change(array, 63));
    }
    
    @Test
    public void Canadian(){
        int array[] = {5, 10, 25, 100, 200};
        assertEquals(3, Coins.change(array, 410));
    }
}
