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
    @Column(name = "USED_RECIPE_KEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer USED_RECIPE_KEY;
    /**
     * レシピ主キー
     */
    @Column(name = "RECIPE_KEY")
    private Integer RECIPE_KEY;
    /**
     * 更新日時
     */
    @Column(name = "USED_DATE")
    private Date USED_DATE; 
    
}
