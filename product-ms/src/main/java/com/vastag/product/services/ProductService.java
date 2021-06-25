package com.vastag.product.services;

import com.vastag.product.dto.CouponDTO;
import com.vastag.product.dto.ProductDTO;

public interface ProductService {

	ProductDTO save(ProductDTO product, CouponDTO coupon);

	ProductDTO findById(Long id);

}
