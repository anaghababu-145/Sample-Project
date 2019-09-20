package main;
import java.util.*;
public class Contacts {
private static char[] getName;
private String name;
private int phone;
	public Contacts(String string, int i) {
	// TODO Auto-generated constructor stub
}
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
ArrayList<Contacts> contact=new ArrayList<Contacts>();
Contacts c1=new Contacts("tim",181888424);
Contacts c2=new Contacts("john",181888425);
System.out.println(contact.get(0).getName());
System.out.println(contact.get(0).getPhone());
	}

}