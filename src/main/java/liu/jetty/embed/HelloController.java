package liu.jetty.embed;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello world! welocom to visit waylau.com!";
	}
	
	@RequestMapping("/hello/way")
    public User helloWay() {
        return new User("Way Lau", 30);
    }

}
