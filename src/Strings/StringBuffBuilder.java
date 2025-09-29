package Strings;

public class StringBuffBuilder {

    public static void main(String[] args){

        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" world");
        System.out.println("string buffer " + sb1);

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" java");
        System.out.println("String builder "+ sb2);

        System.out.println("string buffer reverse is "+ sb1.reverse());
        System.out.println("string builder reverse is "+ sb2.reverse());

        // StringBuffer - Synchronized → Safe for multithreading
        // stringbuilder - Not synchronized → Faster, but not thread-safe

        // Why Strings are Immutable in Java
       // Strings are widely used for sensitive data like usernames, passwords, URLs, DB connections, file paths, etc.
        // If String were mutable, someone could change the value after it’s created, leading to security risks.
        //Multiple threads can use the same String object without synchronization, since it cannot be modified.

        // by default, string is immutable.. to make them mutable, we can use StringBuilder and StringBuffer
    }
}
