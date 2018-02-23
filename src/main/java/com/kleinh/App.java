package com.kleinh;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Credentials cred = new Credentials();

        cred.setName("Heinrich");
        cred.setSurname("Klein");
        cred.setAge(41);

        System.out.println("DAD CREDENTIALS: " + "\n" + cred.toString());

        Credentials cred1 =new Credentials();

        cred1.setName("Alec");
        cred1.setSurname("Klein");
        cred1.setAge(9);

        System.out.println("SON CREDENTIALS: " + "\n" + cred1.toString());
    }
}
