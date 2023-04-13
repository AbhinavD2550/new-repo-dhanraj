package com.springCalculactor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Calculator {
	@GetMapping("/getcalculate")
	public double getcalculate(@RequestParam double num1, @RequestParam double num2, @RequestParam char operator ) {
		double result = 0;
		switch(operator) {
		
		case '-':
			result = num1 - num2;
			break;
		case '+' :
			result = num1 + num2;
			break;
			
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
		    break ;
		}
		return result;
	}

}
