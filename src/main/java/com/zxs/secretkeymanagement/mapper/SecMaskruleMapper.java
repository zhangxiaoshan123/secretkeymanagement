package com.zxs.secretkeymanagement.mapper;

import com.zxs.secretkeymanagement.entity.SecMaskrule;

public interface SecMaskruleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SecMaskrule record);

    int insertSelective(SecMaskrule record);

    SecMaskrule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SecMaskrule record);

    int updateByPrimaryKey(SecMaskrule record);
}