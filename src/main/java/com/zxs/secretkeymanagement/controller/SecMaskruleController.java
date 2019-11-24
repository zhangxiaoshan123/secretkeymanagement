package com.zxs.secretkeymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zxs.secretkeymanagement.entity.SecMaskrule;
import com.zxs.secretkeymanagement.service.SecMaskruleService;


@RestController
@RequestMapping("/SecMaskrule")
public class SecMaskruleController {

	@Autowired
	SecMaskruleService secMaskruleService;
	
    @RequestMapping("selectByPrimaryKey/{maskruleId}")
	SecMaskrule selectByPrimaryKey(@PathVariable("maskruleId") Long maskruleId) {
	return secMaskruleService.selectByPrimaryKey(maskruleId);
		
	}
}
