package com.snc.secretkeymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snc.secretkeymanagement.entity.SecMaskrule;
import com.snc.secretkeymanagement.service.SecMaskruleService;


@RestController
@RequestMapping("/SecMaskrule")
public class SecMaskruleController {

	@Autowired
	SecMaskruleService secMaskruleService;
	
    @RequestMapping("selectByPrimaryKey/{maskruleId}")
	SecMaskrule selectByPrimaryKey(@PathVariable("maskruleId") Long maskruleId) {
	System.out.println("-----------------------------");
	return secMaskruleService.selectByPrimaryKey(maskruleId);
		
	}
}
