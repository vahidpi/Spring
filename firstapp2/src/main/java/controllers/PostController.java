package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/posts")
public class PostController {
	// to do
	@RequestMapping(value="", method=RequestMethod.GET)
	public String listPosts(Model model) {
		return "list";
	}
	
	
}
