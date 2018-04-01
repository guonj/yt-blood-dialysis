package com.yt.tarsdata.mapper;

import java.util.List;

import com.yt.tarsdata.model.TSlupHot;

public interface TSlupHotMapper {
    
    List<TSlupHot> findByMark(String mark);
}