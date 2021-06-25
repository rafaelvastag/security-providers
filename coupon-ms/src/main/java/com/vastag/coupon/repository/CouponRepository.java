package com.vastag.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vastag.coupon.entities.CouponEntity;

@Repository
public interface CouponRepository extends JpaRepository<CouponEntity, Long>{

	CouponEntity findByCode(String code);

}
