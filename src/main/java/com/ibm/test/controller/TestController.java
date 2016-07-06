package com.ibm.test.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.test.bean.FundsBaseBean;
import com.ibm.test.service.impl.FundServiceImpl;

@RestController
@RequestMapping(value="/funds",produces=MediaType.APPLICATION_JSON_VALUE)
public class TestController {
	
	private static final Logger logger = Logger.getLogger(TestController.class);

	@Autowired
	private FundServiceImpl fundService;
	
	@RequestMapping(value="/query",method=RequestMethod.GET)
	public List<FundsBaseBean> qeuryList(){
		return fundService.getAllFundsBase();
	}
	
}
