package com.kh.api.service;

import java.util.List;

import cok.kh.api.model.Phone;
import cok.kh.api.model.UserInfo;

public interface PhoneService { // impl -> PhoneServiceImpl
	int insert(Phone phone);
	int delete(List<String> list);
	Phone select(Phone phone);
	List<Phone> select();
	UserInfo select(UserInfo user);
}
