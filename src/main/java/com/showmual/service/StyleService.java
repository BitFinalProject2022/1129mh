package com.showmual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showmual.dao.StyleDao;
import com.showmual.model.ColorVo;

@Service

public class StyleService {
    
@Autowired
public StyleDao styleDao;
    
    
    public List<ColorVo> menlist() {
        List<ColorVo> memList = styleDao.selectColor();
        return memList;
    }
    
}
