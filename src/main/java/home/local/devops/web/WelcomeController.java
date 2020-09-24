package home.local.devops.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/devops/")
	public String welcome(Model model) {
		model.addAttribute("course", "Devops");
		return "index";
	}

}
