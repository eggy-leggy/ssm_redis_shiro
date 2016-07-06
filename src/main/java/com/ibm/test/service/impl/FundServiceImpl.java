package com.ibm.test.service.impl;

import java.util.List;

import com.ibm.test.bean.FundsBaseBean;
import com.ibm.test.dao.FundBaseDao;
import com.ibm.test.service.IFundService;

public class FundServiceImpl implements IFundService {
	
	private FundBaseDao fundBaseDao;

	public void setFundBaseDao(FundBaseDao fundBaseDao) {
		this.fundBaseDao = fundBaseDao;
	}
	
	@Override
	public List<FundsBaseBean> getAllFundsBase() {
		// TODO Auto-generated method stub
		return fundBaseDao.getAllFundsBase();
	}
	
	

}
