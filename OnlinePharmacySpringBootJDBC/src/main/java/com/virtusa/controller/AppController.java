package com.virtusa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.entity.Product;
import com.virtusa.service.ProductService;

@Controller
public class AppController {

	@Autowired
	private ProductService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		
		return "index_product";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		
		return "new_product_table";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		service.save(product);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{pid}")
	public ModelAndView showEditProductPage(@PathVariable(name = "pid") int pid) {
		ModelAndView mav = new ModelAndView("edit_product_table");
		Product product = service.get(pid);
		mav.addObject("product", product);
		
		return mav;
	}
	
	@RequestMapping("/delete/{pid}")
	public String deleteProduct(@PathVariable(name = "pid") int pid) {
		service.delete(pid);
		return "redirect:/";		
	}
}

