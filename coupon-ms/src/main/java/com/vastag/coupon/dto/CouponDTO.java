package com.vastag.coupon.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponDTO {
	private Long id;
	private String code;
	private BigDecimal discount;
	private String expDate;
}
