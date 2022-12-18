package com.coffeerecipe.api.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "R_Recipe_Beans")
public class RRecipeBeans {
    /**
     * コーヒー豆主キー
     */
	@Id
	@OneToOne
	@JoinColumn(name = "BEANS_KEY")
    private MBeans Beans;
    /**
     * レシピ主キー
     */
	@Id
	@OneToOne
	@JoinColumn(name = "RECIPE_KEY")
    private MRecipe Recipe;

}