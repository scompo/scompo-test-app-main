/**
 * MainController.java
 */
package it.scompo.testapp.main.api;

import it.scompo.testapp.lib.api.calculator.Calculator;
import it.scompo.testapp.lib.impl.ScompoCalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Main Controller for application.
 * 
 * @author mscomparin
 */
@Controller
@RequestMapping("/test")
public class MainController {

	private static final String HELLO_STRING = "Hello!";

	private static final Calculator c = ScompoCalculator.getInstance();

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello() {

		Integer sum = c.calculate(Calculator.Operands.PLUS, 2, 2);
		
		return HELLO_STRING + " " + sum;

	}
}
