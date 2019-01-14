/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video_101_to_130;

/**
 *
 * @author shshe
 */
public class Video128Test {
    public static void main(String[] args) {
       Video128Shape[] s = new Video128Shape[3];
        
        //Video128Shape s = new Video128Shape();
        Video128Rectangle r = new Video128Rectangle(10,20);
        Video128Triangle t = new Video128Triangle(10,20);
        Video128Shape s1;
        Video128Shape s2;
        Video128Shape s3;
        //Dynamic method dispatching
        s[0] = new Video128Shape();
        s[1] = new Video128Triangle(10,20);
        s[2] = new Video128Rectangle(10,20);
        
        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());
//instead of 3 lines we can use one for loop
for (int i = 0; i < 3; i++) {
            System.out.println("for loop:"+s[i].area());
        }
 
        /*
        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
*/    
}
}
