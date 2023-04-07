package com.testcontainers.demo;

import java.math.BigDecimal;

record ProductPriceChangedEvent(
	String productCode,
	BigDecimal price){
}