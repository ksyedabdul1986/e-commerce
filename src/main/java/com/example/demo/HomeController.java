package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String test() {
		System.out.println("HomeController is executed");
		
		
		int result  = test2(22);
		test3();
		System.out.print(result);
		
		return "Hello from HomeController";
		
	}

	//PayPay Japan
	int test2(int n) {
		int result=0;		
		for(int i=0; i<=n; i++) {
			String iValue = String.valueOf(i);
			String[] iValueArrs = iValue.split("");
			for(String iVaueArr : iValueArrs) {				
				if(iVaueArr.equals("2")) {
					result =result+1;
				}
				if(iVaueArr.equals("4")) {
					result =result+1;
				}
			}
		}
		return result;
		
	}

	//TCS June 2026
	void test3(){
		int[] arr = {5,6,1,10,1,4};

		int inputValue = 7;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] ==  inputValue) {
					System.out.println("Position is " + i + " " + j);
				}
			}
		}
	}
}
