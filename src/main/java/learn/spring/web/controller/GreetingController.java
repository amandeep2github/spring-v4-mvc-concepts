package learn.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingController {
	
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World")String name, Model model){
		model.addAttribute("name", name);
		return "greeting";
		
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam(name="name", required=false, defaultValue="World")String name, Model model){
		model.addAttribute("name", name);
		return "welcome";
		
	}
}
