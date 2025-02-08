package com.product;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StockPriceHistoryRepo extends JpaRepository<StockPriceHistory, Integer> {
    List<StockPriceHistory> findByStockId(Integer stockId);
}
