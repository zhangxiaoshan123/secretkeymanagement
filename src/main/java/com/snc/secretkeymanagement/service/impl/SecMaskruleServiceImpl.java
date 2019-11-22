package com.snc.secretkeymanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snc.secretkeymanagement.entity.SecMaskrule;
import com.snc.secretkeymanagement.mapper.SecMaskruleMapper;
import com.snc.secretkeymanagement.service.SecMaskruleService;

@Service
public class SecMaskruleServiceImpl implements SecMaskruleService {
	@Autowired
	SecMaskruleMapper secMaskruleMapper;
	@Override
	public SecMaskrule selectByPrimaryKey(Long maskruleId) {
		return secMaskruleMapper.selectByPrimaryKey(maskruleId);
	}

}
