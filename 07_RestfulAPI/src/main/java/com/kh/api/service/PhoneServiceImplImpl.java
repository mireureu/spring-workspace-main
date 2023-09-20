package com.kh.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.api.dao.PhoneDAO;
import com.kh.api.model.Phone;
import com.kh.api.model.UserInfo;

@Service
public class PhoneServiceImplImpl implements PhoneService{

	@Autowired
	private PhoneDAO dao;
	
	@Override
	public int insert(Phone phone) {
		return dao.insert(phone);
	}

	@Override
	public int delete(String num) {
		return dao.delete(num);
	}

	@Override
	public Phone select(String num) {
		return dao.select(num);
	}

	@Override
	public List<Phone> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}

	@Override
	public UserInfo select(UserInfo user) {
		// TODO Auto-generated method stub
		return dao.select(user);
	}

	@Override
	public int update(Phone phone) {
		// TODO Auto-generated method stub
		return dao.update(phone);
	}

}
