package com.beta.service;

import java.util.List;
import java.util.Map;

/**
 * Created by jimi on 2019/10/17
 * Comments:
 * For:
 */
public interface InfoService {
    public Map<String,Object> getContentByInfoId(Integer infoId);
    public List<Map<String,Object>> getImagesByInfoId(Integer infoId);
}
