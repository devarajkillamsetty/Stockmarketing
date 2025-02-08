package com.product;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserStockRepository extends JpaRepository<UserStock, Integer> {
    List<UserStock> findByUserId(Integer userId);

	UserStock findByUserIdAndStockId(Integer userId, Integer stockId);
}
