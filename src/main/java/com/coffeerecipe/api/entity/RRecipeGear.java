package com.coffeerecipe.api.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "R_RECIPE_GEAR")
public class RRecipeGear {
    /**
     * 器具主キー
     */
	@Column(name = "GEAR_KEY")
    private Integer GEAR_KEY;
    /**
     * レシピ主キー
     */
	@Id
	@Column(name = "RECIPE_KEY")
    private Integer RECIPE_KEY;	
}