package com.vastag.product.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vastag.product.dto.CouponDTO;
import com.vastag.product.dto.ProductDTO;
import com.vastag.product.services.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/product/v1")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService service;
	
	private final RestTemplate restTemplate;
	
	@Value("${couponService.url}")
	private String COUPON_URL;
	
	@PostMapping
	public ProductDTO create(@RequestBody ProductDTO product) {
		CouponDTO coupon = restTemplate.getForObject(COUPON_URL + product.getCouponCode() , CouponDTO.class);
		return service.save(product,coupon);
	}
	
	@GetMapping("/{id}")
	public ProductDTO getById(@PathVariable Long id) {
		return service.findById(id);
	}

}
