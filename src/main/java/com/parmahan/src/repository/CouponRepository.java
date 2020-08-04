package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, String> {

}
