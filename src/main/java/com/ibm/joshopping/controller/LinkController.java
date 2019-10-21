package com.ibm.joshopping.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {
	
	@RequestMapping(value="/")
	public ModelAndView indexPage() {
		return new ModelAndView("index");
	}
	
	/*@RequestMapping(value="/about")
	public ModelAndView AboutPage() {
		return new ModelAndView("about");
	}
	
	@RequestMapping(value="/services")
	public ModelAndView servicesPage() {
		return new ModelAndView("services");
	}
	
	@RequestMapping(value="/blog")
	public ModelAndView blogPage() {
		return new ModelAndView("blog");
	}
	
	@RequestMapping(value="/gallery")
	public ModelAndView galleryPage() {
		return new ModelAndView("gallery");
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contactUsPage() {
		return new ModelAndView("contact");
	}
	
	@RequestMapping(value="/testpage")
	public ModelAndView testPage() {
		return new ModelAndView("home");
	}
	@RequestMapping(value="/regional")
	public ModelAndView regionalPage() {
		return new ModelAndView("gallery");
	}
	
	@RequestMapping(value="/newyear")
	public ModelAndView newYearPage() {
		return new ModelAndView("newyear");
	}*/
}
