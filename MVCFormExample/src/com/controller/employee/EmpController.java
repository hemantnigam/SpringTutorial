package com.controller.employee;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

	@RequestMapping("/empform")
	public ModelAndView showForm() {
		return new ModelAndView("empform","command",new Emp());
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp")Emp emp) {
		EmpDAO.addEmp(emp);
		return new ModelAndView("redirect:/empform");
	}
	@RequestMapping("/viewemp")
	public ModelAndView viewform() {
		List<Emp> list=EmpDAO.getEmpList();
		return new ModelAndView("viewform","list",list);
	}
}
