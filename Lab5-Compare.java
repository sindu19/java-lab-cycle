import java.util.*;
public class Lab5-compare{
  public static void main(String args[])
  {
	String string1=new String("Python");
	String string2=new String("Python");
	String string3=new String("C");
	String string4=new String("Ruby");
	String string5=new String("SQL");
	System.out.println("Comparing"+String1+"and"+String2+":"+String1.equals(String2));
	System.out.println("Comparing"+String3+"and"+String4+":"+String3.equals(String4));
	System.out.println("Comparing"+String4+"and"+String4+":"+String4.equals(String5));
	System.out.println("Comparing"+String1+"and"+String4+":"+String1.equals(String4));
  }
