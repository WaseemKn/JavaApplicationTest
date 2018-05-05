/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author Waseem Kntar
 */
public class rr extends r implements Cloneable {
    int was;
    
    public Object clone()
    {
        rr copy;
        try
        {
            copy = (rr) super.clone();
        }
        catch(Exception e)
        {
            copy = null;
        }
        return copy;
    }
    @Override
    public String toString()
    {
        return super.id + " " + was;
    }
    /*//@Override
    static void d()
    {
        System.out.println("Hi from rr");
    }*/
}
