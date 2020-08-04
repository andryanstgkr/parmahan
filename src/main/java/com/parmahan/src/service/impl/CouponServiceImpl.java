package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.Coupon;
import com.parmahan.src.repository.CouponRepository;
import com.parmahan.src.service.CouponService;

public class CouponServiceImpl implements CouponService {

	@Autowired
	private CouponRepository couponRepository;

	@Override
	public void delete(Coupon coupon) {
		couponRepository.delete(coupon);
	}

	@Override
	public List<Coupon> getAll() {
		List<Coupon> coupons = new ArrayList<Coupon>();
		couponRepository.findAll().forEach(coupons::add);
		return coupons;
	}

	@Override
	public Coupon getDetail(String id) {
		Coupon coupon = couponRepository.findById(id).get();
		return coupon;
	}

	@Override
	public Coupon save(Coupon coupon) {
		coupon = couponRepository.save(coupon);
		return coupon;
	}

	@Override
	public boolean existsById(String id) {
		return couponRepository.existsById(id);
	}

}
