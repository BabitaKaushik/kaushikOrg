/**
 * 
 */
package com.kaushikOrg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Babita
 *
 */
@RestController
public class FirstKaushikController {
	
	@RequestMapping("/getProduct")
	public String getProduct() {
		String message1 = "Hello from Kaushik Organisation";
		
		return message1;
	}

}
