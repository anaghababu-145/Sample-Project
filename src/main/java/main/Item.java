package main;
import java.util.Scanner;
public class Item {
	
int price;
	public int getPrice() 
	{
	return price;
    }
public void setPrice(int price) {
	this.price = price;
}}
 class Customer extends Item
{
	 String product;
	 public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	int quantity;
	

}
 class Bill extends Customer
 {
 public int result(int p,int q)
 {
	 int result=p*q;
	 return result;
 }
 }
 class Main
 {
 public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
String product=sc.nextLine();
int price = sc.nextInt();
int quantity = sc.nextInt();
Item i = new Item();
Customer c = new Customer();
i.setPrice(price);
c.setQuantity(quantity);
int q= c.getQuantity();
int p =i.getPrice();
Bill obj = new Bill();
int r=obj.result(p,q);
System.out.println("Total Price is : " + r);
	}
 }
