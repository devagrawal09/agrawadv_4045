package edu.uc.agrawadv.agrawadv_Assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for the index and /assignment routes
 * @author Dev Agrawal
 * @return
 */
@Controller
public class AssignmentController {

	/**
	 * Maps the index route
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	/**
	 * Maps the index route
	 * @return
	 */
	@RequestMapping("/assignment")
	public String assignment() {
		return "assignment";
	}
}
