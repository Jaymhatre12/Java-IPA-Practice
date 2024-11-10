package com.parctice;
import java.util.*;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TravelAgencies[] arr = new TravelAgencies[4];
		
		for(int i=0; i<4;i++) {
			int a=sc.nextInt();		sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();		sc.nextLine();
			boolean e=sc.nextBoolean();
			
			arr[i] = new TravelAgencies(a,b,c,d,e);
		}
		
		int regNo = sc.nextInt();	sc.nextLine();
		String packageType = sc.nextLine();
		
		int max = highestPackage(arr);
		System.out.println(max);
		
		TravelAgencies result = info(arr, regNo, packageType);
		System.out.println(result.getagencyName() + ":" + result.getprice());
		
	}
	
	public static int highestPackage(TravelAgencies[] arr) {
		int max = arr[0].getprice();
		
			for(int i=0; i<arr.length;i++) {
				if(max<arr[i].getprice()) {
					max = arr[i].getprice();
				}
				else {
					return max;
				}
			}
			return 0;
		}
	
	public static TravelAgencies info(TravelAgencies[] arr, int regNo, String packageType) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].flightFacility) {
				if(arr[i].regNo == regNo && arr[i].packageType.equals(packageType)) {
					return arr[i];
				}
			}
		}
		return null;
	}
}

class TravelAgencies{
	int regNo;
	String agencyName;
	String packageType;
	int price;
	boolean flightFacility;
	
	public TravelAgencies(int regNo,String agencyName,String packageType,int price, boolean flightFacility) {
		this.regNo=regNo;
		this.agencyName=agencyName;
		this.packageType=packageType;
		this.price=price;
		this.flightFacility=flightFacility;	
	}
	
	public int getregNo() {
		return regNo;
	}
	
	public String getagencyName() {
		return agencyName;
	}
	
	public String getpackageType() {
		return packageType;
	}
	
	public int getprice() {
		return price;
	}
	
	public boolean isflightFacility() {
		return flightFacility;
	}

}




/*
Question: 1
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package 
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
have more than one package type. Travel agency and package type combination is unique. All the searches should 
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000
 */





