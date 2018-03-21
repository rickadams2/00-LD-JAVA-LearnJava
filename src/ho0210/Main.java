/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ho0210;

/**
 *
 * @author thead
 */
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(" Wuilus ",  3); 
        d.bark(); 
        
        int dogYears = d.getDogYears(); 
        System.out.println(dogYears + " dog years ");

        d.fetch();
    }
}
