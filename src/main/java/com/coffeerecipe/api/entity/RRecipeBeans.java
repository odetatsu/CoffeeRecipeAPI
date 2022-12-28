package com.coffeerecipe.api.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
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
	@Column(name = "BEANS_KEY")
    private Integer BEANS_KEY;
    /**
     * レシピ主キー
     */
	@Id
	@Column(name = "RECIPE_KEY")
    private Integer RECIPE_KEY;
	
	@OneToOne
	@MapsId
    @JoinColumn(name = "BEANS_KEY")
    private MBeans beans;

	@OneToOne
	@MapsId
    @JoinColumn(name = "RECIPE_KEY")
    private MRecipe recipe;
}