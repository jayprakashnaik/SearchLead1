package com.searchlead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchlead.dto.Lead;

@Controller
public class SearchLeadController {
	
	@RequestMapping(value="/searchPage")
	public String viewSearchPage() {
		return "search_lead";
	}
	
	@RequestMapping("/searchLead")
	public String  searchLead(@RequestParam("id") long id, ModelMap model) {
		LeadRestClient client = new LeadRestClient();
		Lead lead = client.getLeadById(id);
		model.addAttribute("lead",lead);
		return "lead_result";
	}
}
