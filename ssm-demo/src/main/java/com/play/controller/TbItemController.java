package com.play.controller;

import com.play.pojo.TbItem;
import com.play.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public List<TbItem> selectTbItem(){
        System.out.println("---------------进入方法-----------");
        List<TbItem> tbItems = itemService.selectTbItem();
        for (TbItem tbItem : tbItems) {
            System.out.println("tbItem:"+tbItem.toString());
        }
        return tbItems;
    }
}
