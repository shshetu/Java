/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOPSMisc;

public class Description {

    /*
    Upcasting: parent class reference variable
    can refer the child class object, know as upcasting.
    
    Methods: 
    
public final Class getClass()
public int hashCode()
public boolean equals(Object obj)
protected Object clone() throws CloneNotSupportedException
public String toString()
public final void notify()
public final void notifyAll()
public final void wait(long timeout)throws InterruptedException
public final void wait(long timeout,int nanos)throws InterruptedException
public final void wait()throws InterruptedException
protected void finalize()throws Throwable
    
    ======================================Object Cloning==================
    Object cloning: 
    1.The object cloning is a way to create exact copy of an object. 
    2.The clone() method of Object class is used to clone an object.
    3.The java.lang.Cloneable interface must be implemented by the 
    class whose object clone we want to create.
    
    Why use clone() method ?
    1.The clone() method saves the extra processing task for creating 
    the exact copy of an object.
    2.If we perform it by using the new keyword, it will take a lot of
    processing time to be performed that is why we use object cloning. 
     
    Advantage of Object cloning:
    1.You don't need to write lengthy and repetitive codes. Just use an 
    abstract class with a 4- or 5-line long clone() method.
    2.It is the easiest and most efficient way for copying objects, 
    especially if we are applying it to an already developed or an old project.
    
    Disadvantage of Object cloning:
    1.o use the Object.clone() method, we have to change a lot of syntaxes to our code, 
    like implementing a Cloneable interface, defining the clone() method and handling CloneNotSupportedException, and finally, calling Object.clone() etc.
    2.Object.clone() is protected, so we have to provide our own clone() and indirectly call Object.clone() from it.
    3.Object.clone() supports only shallow copying but we will need to override it if we need deep cloning.
    
    
    
    
    
    
    
    
    */
}
