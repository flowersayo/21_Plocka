package com.jupging.jupgingServer.shop.repository;

import com.jupging.jupgingServer.shop.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

}
