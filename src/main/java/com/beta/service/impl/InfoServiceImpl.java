package com.beta.service.impl;

import com.beta.mapper.InfoMapper;
import com.beta.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by jimi on 2019/10/17
 * Comments:
 * For:
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Resource
    private InfoMapper infoMapper;
    @Override
    public Map<String,Object> getContentByInfoId(Integer infoId) {
        return infoMapper.getContentByInfoId(infoId);
    }

    @Override
    public List<Map<String,Object>> getImagesByInfoId(Integer infoId) {
        return infoMapper.getImagesByInfoId(infoId);
    }
}
