package com.parctice;
import java.util.*;


public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Phone [] arr = new Phone[3];
		for(int i=0;i<3;i++) {
			int a= sc.nextInt();		sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();			sc.nextLine();
			
			arr[i] = new Phone(a,b,c,d);
		}
		String brand = sc.nextLine();
		String os = sc.nextLine();
		
		int sum = findPriceForGivenBrand(arr,brand);
		if(sum==0) {
			System.out.println("The given Brand is not available");
		}else {
			System.out.println(sum);
		}
		
		Phone result = getPhoneIdBasedOnOs(arr, os);
		if(result == null) {
			System.out.println("No phones are available with specified os and price range");
		}else {
			System.out.println(result.getphoneId());
		}
	}
	
	public static int findPriceForGivenBrand(Phone[] arr, String brand) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].brand.equals(brand)) {
				sum = sum + arr[i].price;
			}
			else {
				return 0;
			}
		}
		return sum;
	}
	
	public static Phone getPhoneIdBasedOnOs(Phone[] arr, String os) {
		
		Phone temp = null;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getos().equalsIgnoreCase(os) && arr[i].getprice() >= 50000) {
				return arr[i];
			}
		}
		return temp;
	}
}


class Phone{
	int phoneId;
	String os;
	String brand;
	int price;
	
	Phone(int phoneId,String os,String brand,int price){
		this.phoneId=phoneId;
		this.os=os;
		this.brand=brand;
		this.price=price;
	}
	
	public int getphoneId() {
		return phoneId;
	}
	
	public String getos() {
		return os;
	}
	
	public String getbrand() {
		return brand;
	}
	
	public int getprice() {
		return price;
	}
}

