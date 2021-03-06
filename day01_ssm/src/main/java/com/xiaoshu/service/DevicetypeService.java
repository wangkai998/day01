package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.DevicetypeMapper;
import com.xiaoshu.entity.Devicetype;
import com.xiaoshu.entity.User;

@Service
public class DevicetypeService {

	@Autowired
	private DevicetypeMapper devicetypeMapper;

	public PageInfo<Devicetype> findUserPage(Devicetype devicetype, Integer pageNum, Integer pageSize, String ordername,
			String order) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Devicetype>list=devicetypeMapper.findUserPage(devicetype);
		return new PageInfo<>(list);
	}



	public void updateDevice(Devicetype devicetype) {
		// TODO Auto-generated method stub
		devicetypeMapper.updateDevice(devicetype);
	}

	public void addDevice(Devicetype devicetype) {
		// TODO Auto-generated method stub
		devicetypeMapper.addDevice(devicetype);
	}

	public void deleteDevice(int parseInt) {
		// TODO Auto-generated method stub
		devicetypeMapper.deleteDevice(parseInt);
	}



	public Devicetype existdeviceWithdeviceName(String devicename) {
		// TODO Auto-generated method stub
		return devicetypeMapper.existdeviceWithdeviceName(devicename);
	}



	
}
