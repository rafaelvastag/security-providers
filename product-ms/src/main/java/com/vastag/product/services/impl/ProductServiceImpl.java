package com.vastag.product.services.impl;

import org.springframework.stereotype.Service;

import com.vastag.product.dto.CouponDTO;
import com.vastag.product.dto.ProductDTO;
import com.vastag.product.mapper.ProductMapperImpl;
import com.vastag.product.repository.ProductRepository;
import com.vastag.product.services.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductMapperImpl productMapper;

	private final ProductRepository repository;

	@Override
	public ProductDTO save(ProductDTO product, CouponDTO coupon) {
		
		if (null != coupon) {
			product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		}
		
		return productMapper.fromEntity((repository.save(productMapper.fromDTO(product))));
	}

	@Override
	public ProductDTO findById(Long id) {
		return productMapper.fromEntity(repository.findById(id).orElse(null));
	}

}
