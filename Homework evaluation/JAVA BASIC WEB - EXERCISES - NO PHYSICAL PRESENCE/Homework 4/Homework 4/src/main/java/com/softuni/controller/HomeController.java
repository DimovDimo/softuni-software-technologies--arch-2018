package com.softuni.controller;

import com.softuni.entity.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("operator", "+");
		model.addAttribute("view", "views/calculatorForm");
		return "base-layout";
	}

	@PostMapping("/")
		public String calculate(@RequestParam(name = "leftOperand") String num1,
								@RequestParam(name = "rightOperand") String num2,
								@RequestParam(name = "operator") String operator,
								Model model) {
		double leftOperand;
		double rightOperand;

		try{
			leftOperand = Double.parseDouble(num1);
		} catch (NumberFormatException ex){
			leftOperand = 0;
		}

		try{
			rightOperand = Double.parseDouble(num2);
		} catch (NumberFormatException ex){
			rightOperand = 0;
		}

		Calculator calculator = new Calculator(leftOperand, rightOperand, operator);
		double result = calculator.calculateResult();

		model.addAttribute("view", "views/calculatorForm");

		model.addAttribute("leftOperand", calculator.getLeftOperand());
		model.addAttribute("operator", calculator.getOperator());
		model.addAttribute("rightOperand", calculator.getRightOpererand());

		model.addAttribute("result", result);

		return "base-layout";
	}


}
