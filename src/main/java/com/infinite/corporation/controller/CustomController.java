package com.infinite.corporation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.infinite.corporation.model.Corporation;
import com.infinite.corporation.service.CorporationServiceImpl;

@Controller
	public class CustomController {
	@Autowired
	CorporationServiceImpl CorporationService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllCorporation";
	}
	@RequestMapping(value = "/getAllCorporation", method = RequestMethod.GET)
	public String getAllCustomers(Model model) {
		model.addAttribute("Corporation", new Corporation());
		model.addAttribute("listOfCorporation", CorporationService.getAllCorporation());
		return "Corporation";
	}
	@RequestMapping(value = "/getCorporation/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Corporation getCorporationById(@PathVariable int id) {
		return CorporationService.getCorporation(id);
	}
	@RequestMapping(value = "/addCorporation", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCorporation(@ModelAttribute("Corporation") Corporation Corporation) {
		if (Corporation.getId() == 0) {
			CorporationService.addCorporation(Corporation);
		} else {
			CorporationService.updateCorporation(Corporation);
		}

		return "redirect:/getAllCorporation";
	}
	
	@RequestMapping(value = "/updateCorporation/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCorporation(@PathVariable("id") int id, Model model) {
		model.addAttribute("Corporation", this.CorporationService.getCorporation(id));
		model.addAttribute("listOfCorporation", this.CorporationService.getAllCorporation());
		return "Corporation";
	}

	@RequestMapping(value = "/deleteCorporation/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteCorporation(@PathVariable("id") int id) {
		CorporationService.deleteCorporation(id);
		return "redirect:/getAllCorporation";	
}


}
