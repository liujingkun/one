package com.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/7/20 0020.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "getIndex", method = {RequestMethod.GET, RequestMethod.POST})
    public String getIndex(String name ,ModelMap modelMap) {

        modelMap.put("name",name);
        return "/debug";
    }

}
