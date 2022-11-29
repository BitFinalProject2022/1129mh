package com.showmual.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.showmual.model.ColorVo;

@Mapper
@Repository("styleDao")
public interface StyleDao {
    
    public List<ColorVo> selectColor() throws DataAccessException;
    public List<ColorVo> selectHobbies() throws DataAccessException;
  
}
