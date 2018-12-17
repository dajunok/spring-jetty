package liu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= {"/spittr","/homepage"})
public class HomeController {
	@RequestMapping(method=RequestMethod.GET)  //spittr
	public String home() {
		return "home";
	}
}
