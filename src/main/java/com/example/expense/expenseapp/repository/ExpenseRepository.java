package com.example.expense.expenseapp.repository;

import com.example.expense.expenseapp.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExpenseRepository extends JpaRepository<Expense,Long> {

}