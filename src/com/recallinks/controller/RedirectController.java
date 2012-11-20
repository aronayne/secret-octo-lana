package com.recallinks.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



/*import com.movie.values.Movie1;
import com.movie.values.Movie3;
*/ 
@Controller
public class RedirectController {
	  
	  @RequestMapping(value = "redirect", method = RequestMethod.GET)
	  public ModelAndView redirect() {		

		  return new ModelAndView("tester");

	  }

	    @RequestMapping(value = "viewFile" , method = RequestMethod.GET)
	       public @ResponseBody String viewFile() {      

	        
	         return "test" ;
	       }
	  
}
