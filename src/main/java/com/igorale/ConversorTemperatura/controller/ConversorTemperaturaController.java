package com.igorale.ConversorTemperatura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConversorTemperaturaController {
	
	@GetMapping("/")
	public ModelAndView conversor() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("converting");
	return modelAndView;
	}
	
	@PostMapping("converting")
	public String converting(@RequestParam("temp") double num,
							 @RequestParam("operation") String operation,
							 Model model ) {
	
		double result = 0;
		switch (operation) {
		case "Celsius para Kelvin":
			result = num + 273.15;
		break;
		case "Celsius para Fahrenheit":
			result = (num * 1.8) + 32;
		break;
		case "Kelvin para Celsius":
			result = num - 273.15;
		break;
		case "Kelvin para Fahrenheit":
			result = (num - 273.15) * 1.8 + 32 ;
		break;
		case "Fahrenheit para Celsius":
			result = (num - 32) / 1.8;
		break;
		case "Fahrenheit para Kelvin":
			result = (num - 32) * 5/9 + 273.15 ;
		break;	
		}
		
		model.addAttribute("result", result);
		return "converting";
	}
}
		
