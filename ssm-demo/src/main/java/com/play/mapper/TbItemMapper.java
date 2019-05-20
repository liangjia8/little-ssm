package com.play.mapper;

import com.play.pojo.TbItem;
import com.play.pojo.TbItemExample;

import java.util.List;

public interface TbItemMapper {

    List<TbItem> selectByExample(TbItemExample example);

}