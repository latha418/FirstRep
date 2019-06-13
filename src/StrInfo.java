
public class StrInfo {
public static void main(String[] args) {
	String s="Greeshma";
int len=s.length();
System.out.println(len);
char c=s.charAt(5);
System.out.println(c);
String s1=s.toLowerCase();
System.out.println(s1);
String s2=s.toUpperCase();
System.out.println(s2);
boolean b=s.startsWith("Gr");
System.out.println(b);
boolean b1=s.startsWith("Ma");
System.out.println(b1);
int ip=s.indexOf("e");
System.out.println(ip);
int li=s.lastIndexOf("e");
System.out.println(li);
boolean b2=s.contains("ree");
System.out.println(b2);
boolean b3=s.equals("greeshma");
System.out.println(b3);
boolean b4=s.equalsIgnoreCase("greeshma");
System.out.println(b4);
System.out.println("madhu is a good girl");
String s3="";
boolean b5=s3.isEmpty();
System.out.println(b5);
String s4=s.replace('e', '*');
System.out.println(s4);
boolean b6=s.endsWith("ma");
System.out.println(b6);
String s5=s.substring(4);
System.out.println(s5);
String s8=s.substring(4,6);
System.out.println(s8);
String s6="Hai welcome to java class";
String []s7=s6.split("a");
System.out.println(s7[1]);
String s9= s.concat(s6);
System.out.println(s9);
for(int i=0;i<s6.length();i++)
{
	System.out.print(s6.charAt(i));
}

}
}
