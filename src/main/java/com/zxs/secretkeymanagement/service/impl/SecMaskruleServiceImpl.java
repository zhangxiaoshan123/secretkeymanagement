package com.zxs.secretkeymanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxs.secretkeymanagement.entity.SecMaskrule;
import com.zxs.secretkeymanagement.mapper.SecMaskruleMapper;
import com.zxs.secretkeymanagement.service.SecMaskruleService;

@Service
public class SecMaskruleServiceImpl implements SecMaskruleService {
	@Autowired
	SecMaskruleMapper secMaskruleMapper;
	@Override
	public SecMaskrule selectByPrimaryKey(Long maskruleId) {
		return secMaskruleMapper.selectByPrimaryKey(maskruleId);
	}

}
