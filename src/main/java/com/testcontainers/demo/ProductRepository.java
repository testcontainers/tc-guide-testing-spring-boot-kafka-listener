package com.testcontainers.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.Optional;

interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findByCode(String code);

	@Modifying
	@Query("update Product p set p.price = :price where p.code = :productCode")
	void updateProductPrice(
			@Param("productCode") String productCode,
			@Param("price") BigDecimal price);

}
