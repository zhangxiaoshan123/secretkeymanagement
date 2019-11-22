package com.snc.secretkeymanagement.mapper;


import com.snc.secretkeymanagement.entity.SecMaskrule;
public interface SecMaskruleMapper {
    int deleteByPrimaryKey(Long maskruleId);

    int insert(SecMaskrule record);

    int insertSelective(SecMaskrule record);

    SecMaskrule selectByPrimaryKey(Long maskruleId);

    int updateByPrimaryKeySelective(SecMaskrule record);

    int updateByPrimaryKey(SecMaskrule record);
}