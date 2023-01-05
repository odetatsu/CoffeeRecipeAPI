package com.coffeerecipe.api.entity;
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
@Table(name = "M_TASTE")
public class MTaste {
	
    /**
     * ID
     */
    @Column(name = "TASTE_KEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer TASTE_KEY;
    /**
     * レシピキー（外部キー）
     */
    @Id
    @Column(name = "RECIPE_KEY")
    private Integer RECIPE_KEY;    
    /**
     * 酸味
     */
    @Column(name = "ACIDITY")
    @GeneratedValue()
    private Integer ACIDITY;
    /**
     * 苦味
     */
    @Column(name = "BITTER")
    private Integer BITTER;
    /**
     * コク
     */
    @Column(name = "RICH")
    private Integer RICH;
    /**
     * 備考
     */
    @Column(name = "REMARKS")
    private String REMARKS;

}