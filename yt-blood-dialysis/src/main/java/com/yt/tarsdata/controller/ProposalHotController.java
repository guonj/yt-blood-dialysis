package com.yt.tarsdata.controller;

import java.util.List;

import com.yt.tarsdata.model.TSlupHot;
import com.yt.tarsdata.service.ProposalHotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProposalHotController {
	
	@Autowired
	private ProposalHotService proposalHotService;
	
	@RequestMapping(value = "/proposalHot/{mark}",method =RequestMethod.GET)
	public List<TSlupHot> selectProposalHotByMark(@PathVariable String mark) throws Exception {
		
		List<TSlupHot> list = proposalHotService.findByMark(mark);
		
		return list;
	}
	
	@RequestMapping(value = "/hot",method =RequestMethod.GET)
	public String selectProposalHot() throws Exception {
		
		
		
		return " hello  world !!";
	}
}
