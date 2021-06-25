package com.vastag.coupon.services;

import com.vastag.coupon.dto.CouponDTO;

/**
 *  - CouponService - Foi optado por NÃO fazer uso de uma camada DTO por fins didáticos.
 * @author vastag
 *
 */
public interface CouponService {

	CouponDTO save(CouponDTO coupon);

	CouponDTO findByCode(String code);
}
