package com.yt.tarsdata.serviceImpl;

import java.util.List;

import com.yt.tarsdata.mapper.TSlupHotMapper;
import com.yt.tarsdata.model.TSlupHot;
import com.yt.tarsdata.service.ProposalHotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProposalHotServiceImpl implements ProposalHotService {

	@Autowired
	private TSlupHotMapper tSlupHotMapper;
	
	public List<TSlupHot> findByMark(String mark) {
		// TODO Auto-generated method stub
		return  tSlupHotMapper.findByMark(mark);
	}

}
