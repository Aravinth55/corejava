package com.chainsys.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Readobj
{
    public static void main(String arg[])throws IOException
    {
         FileInputStream fis = new FileInputStream("E:\\New folder\\Aravinth.txt");
         ObjectInputStream ois = new ObjectInputStream(fis) ;
          Emp ob =null;
         try
        {
            ob = (Emp) ois.readObject();
        }
        catch(Exception e)
        {
            System.out.println("Exception during deserialization: " +e);
        }
        finally
        {
            try
            {
                ois.close();
            }
            catch(Exception e)
            {
                System.out.println("Exception during ois close: " + e);
            }
        }
        if(null!=ob)
        {
           System.out.println(ob.getID()+" "+ob.Name);
            System.out.println("HashCode "+ob.hashCode());            
        }
    }
}