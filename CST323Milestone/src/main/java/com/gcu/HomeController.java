package com.gcu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView; 
@Controller
@RequestMapping("/")
public class HomeController {
    Logger logger = LoggerFactory.getLogger(HomeController.class);
	@GetMapping("/")
	public String home() {
		logger.trace("Application Home Page was accessed");
		return "home2";
	}
	

}
