package com.coffeerecipe.api.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "T_USED_RECIPE")
public class TUsedRecipe {
    /**
     * ID
     */
    @Id
    @Column(name = "used_recipe_key")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer RECIPE_ORDER_KEY;
    /**
     * レシピ主キー
     */
    @Column(name = "recipe_key")
    private Integer RECIPE_KEY;
    /**
     * 更新日時
     */
    @Column(name = "used_date")
    private Date USED_DATE; 
    
}