package com.searchlead.controller;

import org.springframework.web.client.RestTemplate;

import com.searchlead.dto.Lead;


public class LeadRestClient {
	public Lead getLeadById(long id) {
		RestTemplate rest= new RestTemplate();
		Lead lead = rest.getForObject("http://localhost:8080/api/leads/get/"+id, Lead.class );
		return lead;
	}

}
