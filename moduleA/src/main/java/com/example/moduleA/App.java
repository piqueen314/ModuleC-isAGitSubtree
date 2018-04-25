package com.example.moduleA;
import com.example.moduleA.modAPackage.noClass;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        noClass nc = new noClass();
        String meanermsg = nc.meanerMsg();
        System.out.println(meanermsg);

        String meanmsg = noClass.meanMsg();
        System.out.println(meanmsg);





    }
}
