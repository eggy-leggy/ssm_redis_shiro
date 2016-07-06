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
import com.ibm.test.util.RedisClientTemplate;

@RestController
@RequestMapping(value="/funds",produces=MediaType.APPLICATION_JSON_VALUE)
public class TestController {
	
	private static final Logger logger = Logger.getLogger(TestController.class);

	@Autowired
	private FundServiceImpl fundService;
	
	@Autowired
	private RedisClientTemplate redisClientTemplate;
	
	@RequestMapping(value="/query",method=RequestMethod.GET)
	public List<FundsBaseBean> qeuryList(){
		redisClientTemplate.set("ss", "bb");
		System.out.println(redisClientTemplate.get("ss"));
		return fundService.getAllFundsBase();
	}
	
}
