package com.play.controller;

import com.play.pojo.TbItem;
import com.play.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ${user}
 * @version 1.0
 * @date
 */
@Controller
@RequestMapping("/tbItem")
public class TbItemController {
    @Autowired
    private TbItemService itemService;

    @RequestMapping("/select")
    @ResponseBody
    public List<TbItem> selectTbItem(){

        return itemService.selectTbItem();
    }
}
