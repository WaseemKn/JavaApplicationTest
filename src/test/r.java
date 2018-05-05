/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Waseem Kntar
 */

public class r implements Cloneable {
    
    
    
    List<String > num = new ArrayList< >();
    //String str;
    private static r obj = null;
    
    public r()
    {
        //num = 10;
        //str = "waseem";
    }

    public static r getInstance()
    {
        if(obj == null)
        {
            obj = new r();
        }
        return obj;
    }
    void add(String s)
    {
        num.add(s);
    }
    
    void print()
    {
        for(String e : num)
        {
            System.out.println(e); 
        }
    }
    //Compare
    /*int id;
    String name;
    @Override
    public int compareTo(r b)
    {
        r a = this;
        int boo = a.name.compareTo(b.name);
        System.out.println(boo);
        if(boo!=0)
        {
            return boo;
        }
        else
        {
            if(a.id > b.id) boo=1;
            else if(a.id < b.id) boo=-1;
            else boo=0;
            return boo;
        }
    }
    @Override
    public String toString()
    {
        return name + " " + id;
    }*/
    //Clone
    /*
    int num;
    d q;
    public r clone()
    {
        r copy;
        try
        {
            copy = (r) super.clone();
            copy.q = (d) this.q.clone();
        }
        catch(Exception e)
        {
            copy = null;
        }
        return copy;
    }
        */
    
}
