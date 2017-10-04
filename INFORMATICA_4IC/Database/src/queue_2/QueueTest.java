/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_2;


/**
 *
 * @author pietro cappellato
 * @version 1.0
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        for (int i = 0; i < 6; i++) {
            queue.enqueue("ciao");
        }

        //s.clear();
        System.out.println(queue);

        for (int i = 0; i < 5; i++) {
            queue.dequeue();
        }

        System.out.println(queue);

        System.out.println("(" + queue.size() + " left on queue)");
    }
}
