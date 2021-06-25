package com.vastag.product.mapper;

import org.springframework.stereotype.Component;

import com.vastag.product.dto.ProductDTO;
import com.vastag.product.entity.ProductEntity;

@Component
public class ProductMapperImpl {

	public ProductDTO fromEntity(ProductEntity e) {
		return ProductDTO.builder().id(e.getId()).name(e.getName()).description(e.getDescription()).price(e.getPrice())
				.build();
	}

	public ProductEntity fromDTO(ProductDTO d) {
		return ProductEntity.builder().name(d.getName()).description(d.getDescription()).price(d.getPrice()).build();
	}

}
