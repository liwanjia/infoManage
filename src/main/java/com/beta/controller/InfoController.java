package com.beta.controller;

import com.beta.service.InfoService;
import com.beta.util.ResultBean;
import com.beta.util.ResultBeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jimi on 2019/10/17
 * Comments:
 * For:
 */
@RestController
@RequestMapping(value = "/info")
public class InfoController {

    @Autowired
    private InfoService infoServiceImpl;

    @RequestMapping(value = "/getContentById",method = RequestMethod.GET)
    public ResultBean getContent(Integer infoId){
        return ResultBeanUtil.successQuery(infoServiceImpl.getContentByInfoId(infoId));
    }

    @RequestMapping(value = "/getImagesById",method = RequestMethod.GET)
    public ResultBean getImageStr(Integer infoId){
        return ResultBeanUtil.successQuery(infoServiceImpl.getImagesByInfoId(infoId));
    }
}
