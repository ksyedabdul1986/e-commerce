package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String test() {
		System.out.println("HomeController is executed");
		
		
		int result  = test2(22);
		System.out.print(result);
		
		return "Hello from HomeController";
		
	}

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
}
