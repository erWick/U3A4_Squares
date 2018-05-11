/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squares;

import java.util.ArrayList;

/**
 *
 * @author erhal8376
 */
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> square = new ArrayList();
        for(int i = 0;i<=9;i++) {
            square.add(i*i);
        }
        System.out.println("Squares ArrayList\n*****************");
        for(int i = 0;i<=9;i++) {
            System.out.println("Number: "+i+" Square: "+square.get(i));
        }
    }
}
