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
@Table(name = "R_RECIPE_BEANS")
public class RRecipeBeans {
    /**
     * コーヒー豆主キー
     */
	@Column(name = "BEANS_KEY")
    private Integer BEANS_KEY;
    /**
     * レシピ主キー
     */
	@Id
	@Column(name = "RECIPE_KEY")
    private Integer RECIPE_KEY;	
}