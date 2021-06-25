package com.vastag.coupon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastag.coupon.dto.CouponDTO;
import com.vastag.coupon.services.CouponService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/coupons/v1")
@RequiredArgsConstructor
public class CouponController {

	private final CouponService service;
	
	@PostMapping()
	public CouponDTO create(@RequestBody CouponDTO coupon) {
		return service.save(coupon);
	}

	@GetMapping("/{code}")
	public CouponDTO get(@PathVariable String code) {
		return service.findByCode(code);
	}
	
}
