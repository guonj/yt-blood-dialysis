package com.yt.tarsdata.service;

import java.util.List;

import com.yt.tarsdata.model.TSlupHot;

public interface ProposalHotService {

	List<TSlupHot> findByMark(String mark) throws Exception;
}
