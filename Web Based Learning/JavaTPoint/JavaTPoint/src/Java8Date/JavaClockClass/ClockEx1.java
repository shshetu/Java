/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8Date.JavaClockClass;

import java.time.Clock;

/**
 *
 * @author shshe
 */
public class ClockEx1 {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());
    }
}
