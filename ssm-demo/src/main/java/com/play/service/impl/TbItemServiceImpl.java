package com.play.service.impl;

import com.play.mapper.TbItemMapper;
import com.play.pojo.TbItem;
import com.play.pojo.TbItemExample;
import com.play.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author ${user}
 * @version 1.0
 * @date ${time}/${date}
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    private TbItemMapper mapper;

    public List<TbItem> selectTbItem() {
        TbItemExample example = new TbItemExample();
        return mapper.selectByExample(example);
    }
}
