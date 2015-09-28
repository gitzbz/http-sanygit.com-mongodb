package com.mongo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.mongo.model.UserInfo;

/**
 *@author zhangbz
 *@version 2015��9��25�� ����4:57:32
**/
@Repository
public class MongoDBOperator{

	@Autowired
	private MongoOperations mongoTemplate;
	
	public void save(UserInfo user){
		mongoTemplate.save(user);
	}
	
	public void query(){
	}
	
}
