package dao;

import entity.Test;

public interface TestMapper {
    int deleteByPrimaryKey(String tId);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}