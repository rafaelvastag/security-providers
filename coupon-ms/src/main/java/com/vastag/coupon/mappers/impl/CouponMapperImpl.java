package com.vastag.coupon.mappers.impl;

import org.springframework.stereotype.Component;

import com.vastag.coupon.dto.CouponDTO;
import com.vastag.coupon.entities.CouponEntity;
import com.vastag.coupon.mappers.CouponMapper;

@Component
public class CouponMapperImpl implements CouponMapper {

	@Override
	public CouponDTO fromEntity(CouponEntity e) {
		return CouponDTO.builder().id(e.getId()).code(e.getCode()).discount(e.getDiscount()).expDate(e.getExpDate())
				.build();
	}

	@Override
	public CouponEntity fromDTO(CouponDTO d) {
		return CouponEntity.builder().code(d.getCode()).discount(d.getDiscount()).expDate(d.getExpDate()).build();
	}

}
