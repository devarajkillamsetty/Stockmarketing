package com.product;


import org.springframework.data.jpa.repository.JpaRepository;

import com.product.Loan;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Integer> {
    List<Loan> findByUserId(Integer userId);
}

