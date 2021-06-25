package com.vastag.coupon.mappers;

import org.mapstruct.Mapper;

import com.vastag.coupon.dto.CouponDTO;
import com.vastag.coupon.entities.CouponEntity;

@Mapper(componentModel = "spring")
public interface CouponMapper {
	
	CouponDTO fromEntity(CouponEntity entity);

	CouponEntity fromDTO(CouponDTO coupon);

}
