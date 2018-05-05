/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javafx.util.Pair;

abstract class A
{
    int id;
    abstract void dd();
}
class B extends A 
{
    int was;
    @Override 
    void dd()
    {
        
    }
}
/**
 *
 * @author Waseem Kntar
 */

public class Test {

    /**
     * @param args the command line arguments
     */
    /*@Override
    public int hashCode(int x)
    {
        return x;
    }*/
    
    static int i = 10;
    static class p
    {
        //int i = 10;
        static void print()
        {
            System.out.println(i);
        }
    }
    static r t;
     public static void print(String s)
    {

        t = r.getInstance();
        t.add(s);
        //System.out.println(t.str);
    }
    static HashMap<String, Object> ds()
    {
        HashMap<String, Object> s = new HashMap<String, Object>();
        s.put("fsd", 1);
        return s;
    }
    static void fun(int r)
    {
        r = 4;
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        
        int r = 3; 
        
        //print("first");
        //r.getInstance();
        //print("second");
        
        //t.print();
        HashMap<String, Integer> fi = new HashMap<>();
        HashMap<String, Integer> se = new HashMap<>();
        fi.put("1",1);
        fi.put("2",2);
        se.put("3",3);
        System.out.println(fi.toString());
        /*for(String key : fi.keySet())
        {
            se.put(key, fi.get(key));
        }*/
        
        se.putAll(fi);
        fi.put("test", 32);
        //se.put("re", 321);
        int s = 32;
       if(s==22)
       {
           //System.out.println("s"+);
       }
        HashMap<String, List<Integer> > thash = new HashMap<String, List<Integer > >();
        List<Integer> listPair = new ArrayList<Integer >();
        listPair.add(1);
        listPair.add(2);
        listPair.add(3);
        //listPair.set(0, 5);
        thash.put("e",listPair);
        List<Integer > f = new ArrayList<>();
        f.add(4);
        f.add(5);
        listPair.addAll(f);
        File ff = new File("in.txt");
        FileInputStream fis = new FileInputStream(ff);
        
        //List<Pair<Integer, Integer>> l = thash.get("k");
        System.out.println(listPair);
        
        
        //System.out.println(thash.get("e").getClass().getSimpleName());
        //System.out.println(thash.size());
        
        /*for(String key : thash.keySet())
        {
            ArrayList<Pair<Integer, Integer> > p = (ArrayList<Pair<Integer, Integer> >) thash.get(key);
            for(Pair e : p)
            {
                System.out.println(e);
            }
            
        }*/
        //Pair<Integer, Integer> ll = new Pair<Integer, Integer>(2,112321);
        //System.out.println(ll.getValue());
        //thash.put("x", new Pair<Integer, Integer >(2, 0));
        //Pair<Integer, Integer > w = thash.get("x");
        //System.out.println(w.getKey());
        //fun(r);
        //System.out.println(r);
        HashMap<String, Object> s = ds();
        Object wa = 1;
        String ss = "abcd", ss1 = "abcde";
        System.out.println(Math.sin(Math.PI));
        if(ss.equals("abcd"))
        {
            System.err.println("Java program has stopped with error");
            System.exit(0);
        }
        System.out.println("Not exit");
        //ss.length();
        if(!s.isEmpty())
        {
            if(wa == s.get("fsd"))
                System.out.println("0");
        }
        else
        {
            System.out.println(s.get("fsd").getClass().getSimpleName());
            for(String key : s.keySet())
            {
                System.out.println(key);
            }
            if(s.get("fsd").getClass().getSimpleName().equals("Double"))
                System.out.println(s.get("fsd"));
        }
        
        //System.out.println((int)m.get("يزن"));
        /*String s = "a@@@b@@@c";
        Scanner sc = new Scanner(s).useDelimiter("@");
        int i = 0;
        String out = "";
        //System.out.println(sc.findInLine("a@@b@@c"));
        while(sc.hasNext())
        {
            
            out += sc.next();
            i++;
            System.out.println(out);
        }*/
        //System.out.println(i + " " + out);
        /*rr a = new rr();
        a.id = 10;
        r b = new r();
        if(a instanceof rr)
        {
            b = (r) a;
        }
        b.id = 1;
        System.out.println(b.id);
        System.out.println(a.toString());
        //Files
        /* Read & Write from/to files
        File f = new File("e:\\hi.txt");
        try
        {
            byte b[];
            String x = "waseem";
            b = x.getBytes();
            Integer h;
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("1234");
            dos.close();
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        */
       
        /* Methods of File class
        File f = new File("e:\\");
        //f.mkdirs();
        System.out.println("f is exist: " + f.exists() + "\nf is File: " + f.isFile() + "\nf is Directory: " + f.isDirectory() + 
               "\nis Hidden: " + f.isHidden() + "\nis absolute path: " + f.isAbsolute());
        String[] listFile = f.list();
        for(String s : listFile)
        {
            System.out.println(s);
        }
        System.out.println("My Drives is: ");
        File[] Drives = File.listRoots();
        for(File d : Drives)
        {
            System.out.println(d);
        }
        */
        
        /*
        //Boxing
        List <Integer > w = new ArrayList<>();
        w.add(3); // boxing
        w.add(new Integer(1));
        //w.sort((Comparator<? super Integer>)w);
        int h = w.size();
        int z = w.get(1); // unboxing
        System.out.println(h + " " + z);
        */
        
        /*
        //comparTo تصاعدي: if(first < second) return (value bigger than 0 (default case true)); else if(second < first) return (value < 0(false)); else return 0; 
        //compareTo تنازلي : if(first < second) return (value < 0(false)); else if(second < first(true)) return (value > 0); else return 0;
        r a[] = new r[2];
        for(int i=0;i<2;i++)
        {
            a[i] = new r();
        }
        a[0].name = "was"; a[0].id=2; a[1].id=1; a[1].name="was";
        Arrays.sort(a);
        System.out.println(a[0] + " " + a[1]);
        */
        //Clone
        /*
        r a = new r(),b;
        
        a.num = 10;
        a.q = new d();
        a.q.Val = 22;
        b = a.clone();
        a.q.Val = 12;
        System.out.println(b.num + " " + b.q.Val);
        */
    }
}
