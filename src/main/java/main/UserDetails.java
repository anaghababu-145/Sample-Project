package main;

public class UserDetails {
String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
int age;
String address;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserDetails ud=new UserDetails();
ud.setName("Rohan");
ud.setAge(27);
ud.setAddress("Bangalore");
System.out.println("User name is "+ud.getName());
System.out.println("Age is "+ud.getAge());
System.out.println("Address is "+ud.getAddress());
	}

}
