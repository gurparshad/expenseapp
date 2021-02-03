package com.example.expense.expenseapp.model;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {
    @Id
    private Long id;

    private String name;


}
