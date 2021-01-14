package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AllnRepo;
import com.example.demo.model.Alln;

@Controller
public class AllnController {
	
	@Autowired
	AllnRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addalln")
	public String addalln(Alln alln)
	{
		repo.save(alln);
		return "home.jsp";
	}
	
	@RequestMapping("/alln")
	@ResponseBody
	public String getalln()
	{
		
		return repo.findAll().toString();
		
	}
	
	@RequestMapping("/alln/{aid}")
	@ResponseBody
	public String getallns(@PathVariable("aid") int aid)
	{
		
		return repo.findById(aid).toString();
		
	}


}
