package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.CouponDao;
import com.parmahan.src.model.Coupon;
import com.parmahan.src.service.CouponService;

public class CouponServiceImpl implements CouponService{

	@Autowired
	private CouponDao couponDao;
	
	@Override
	public Coupon create(Coupon coupon) {
		// TODO Auto-generated method stub
		return couponDao.create(coupon);
	}

	@Override
	public Coupon update(String id, Coupon coupon) {
		// TODO Auto-generated method stub
		return couponDao.update(id, coupon);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Coupon> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
