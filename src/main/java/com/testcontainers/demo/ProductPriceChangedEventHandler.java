package com.testcontainers.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
class ProductPriceChangedEventHandler {
	private static final Logger log = LoggerFactory.getLogger(ProductPriceChangedEventHandler.class);

	private final ProductRepository productRepository;

	ProductPriceChangedEventHandler(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@KafkaListener(topics = "product-price-changes", groupId = "demo")
	public void handle(ProductPriceChangedEvent event) {
		log.info("Received a ProductPriceChangedEvent with productCode:{}: ", event.productCode());
		productRepository.updateProductPrice(event.productCode(), event.price());
	}
}