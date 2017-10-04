/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_2;

/**
 *
 * @author pietro cappellato
 * @version 1.0
 */
public class StackTest {

    public static void main(String[] args) {
        StackDemo<Integer> s = new StackDemo<>();

        try {

            for (int i = 0; i < 20; i++) {
                s.push(i);
                s.push(i * 2 + i);
            }

            //s.clear();
            System.out.println(s);
            
            for (int i = 0; i < 5; i++) {
                s.top();
            }
            
            System.out.println(s);

            for (int i = 0; i < 15; i++) {
                s.pop();
            }

            System.out.println(s);

        } catch (StackException e) {
            System.err.println(e);
        }
    }
}
