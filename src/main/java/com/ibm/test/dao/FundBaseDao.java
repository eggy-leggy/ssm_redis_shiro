package com.ibm.test.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ibm.test.bean.FundsBaseBean;

public class FundBaseDao extends SqlSessionDaoSupport{

	public List<FundsBaseBean> getAllFundsBase(){
		return getSqlSession().selectList("Fund.getAllFundsBase");
	}
	
}
