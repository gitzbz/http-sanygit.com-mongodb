package com.mongo;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mongo.dao.MongoDBOperator;
import com.mongo.model.UserInfo;

/**
 *@author zhangbz
 *@version 2015年9月25日 下午4:53:09
**/
@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:application_test.xml"})
public class SpringMongoTest {
	
	@Autowired
	private MongoDBOperator mongodb;
	
	@Test
	public void insert(){
		UserInfo user=new UserInfo();
		user.setCrtDate(new Date());
		user.setDisabled(true);
		user.setName("123");
		user.setId(2);
		mongodb.save(user);
	}

}
