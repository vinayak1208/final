package com.cg.customer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.customer.model.Customer;
import com.cg.customer.service.ICustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	ICustomerService service;
	
	@RequestMapping("/start")
	public String registeration(Model model)
	{
		model.addAttribute("cust", new Customer());
	return "CustomerForm";
	}
	
	
	
	/*@RequestMapping("/success")
	public String success()
	{
		
		return "CustomerSuccess";
	}*/
	@RequestMapping("/success")
	public String success(@ModelAttribute("cust") @Valid Customer bean,BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			return "CustomerForm";
		}
		else
		{
			
			service.addDetails(bean);
			model.addAttribute("reg", bean);
			return "CustomerSuccess";
		}
	}
	
	@RequestMapping("/searchById")
	public String retrieveById()
	{
		return "SearchId";
		
	}
	
	
	
	@RequestMapping("/CheckId")
	public ModelAndView search(Customer bean)
	{
		bean=service.retrieve(bean.getCustomerId());
		return new ModelAndView("CustomerSuccess","reg",bean);
	}
	
	@RequestMapping("/getAll")
	public ModelAndView details()
	{
		List<Customer> list;
		list=service.getDetails();
		return new ModelAndView("Details","list",list);
	}
	
	/*@RequestMapping("/delete")
	public String delete()
	{
		return "delete";
		
	}*/
	
	@RequestMapping("/deleteDetail")
	public String get(@RequestParam("id") int custId)
	{
		service.get(custId);
		return "deleteDetails";
		
	}
	
	@RequestMapping("/index")
	public String start()
	{
		return "index";
		
	}
	@RequestMapping("/delete")
	public ModelAndView dropDown()
	{
		List<Integer> li;
		li=service.getDetails1();
		return new ModelAndView("delete","key",li);
	}
	
	
	
	
	
	
}
