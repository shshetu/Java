/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_08_01_2019_chapter9;

/**
 *
 * @author User
 */
public class StaticNonStaticEx {
    int x =10; //Instatance that means non static
    static int y = 20; //Static hoklei kora jabe
    public static void main(String[] args) {
        StaticNonStaticEx obj1 = new StaticNonStaticEx();
        System.out.println("X: "+ obj1.x);
        System.out.println("Y: "+ y);
        System.out.println("Sum: "+ obj1.makeSum(10));
        System.out.println("makeSum2: "+ makeSum2(100));
    }
    
    public int makeSum(int bonus)
    {int sum = x+y+bonus;
    return sum;
    }
    
    public  static int makeSum2(int bonus)
    {   
        StaticN
        int sum1 = x+y+ bonus;
    return sum1;
    
    
    public StaticAnotherEx(){
        x= 500;
        System.out.println("I am default Constructor"+ x);
        
        
    }

}
}
