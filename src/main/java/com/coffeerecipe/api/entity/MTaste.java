package com.coffeerecipe.api.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
    @Id
    @Column(name = "TASTE_KEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer TASTE_KEY;
    /**
     * ID
     */
    @Id
	@PrimaryKeyJoinColumn(name = "RECIPE_KEY",referencedColumnName="RECIPE_KEY")
    private Integer RECIPE_KEY;    
    /**
     * 名前
     */
    @Column(name = "ACIDITY")
    @GeneratedValue()
    private Integer ACIDITY;
    /**
     * 焙煎度
     */
    @Column(name = "BITTER")
    private Integer BITTER;

    /**
     * 表示順
     */
    @Column(name = "RICH")
    private Integer RICH;
    /**
     * アクティブフラグ
     */
    @Column(name = "REMARKS")
    private String REMARKS;

}