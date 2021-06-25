package com.vastag.coupon.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastag.coupon.dto.CouponDTO;
import com.vastag.coupon.mappers.CouponMapper;
import com.vastag.coupon.repository.CouponRepository;
import com.vastag.coupon.services.CouponService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CouponServiceImpl implements CouponService {

	private final CouponRepository repository;
	
	@Autowired
	private CouponMapper mapper;
	
	@Override
	public CouponDTO save(CouponDTO coupon) {
		return mapper.fromEntity(repository.save(mapper.fromDTO(coupon)));
	}

	@Override
	public CouponDTO findByCode(String code) {
		return mapper.fromEntity(repository.findByCode(code));
	}

}
