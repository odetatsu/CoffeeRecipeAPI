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
@Table(name = "M_RECIPES")
public class Recipe {
    /**
     * ID
     */
    @Id
    @Column(name = "RECIPE_KEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer RECIPE_KEY;
    /**
     * 名前
     */
    @Column(name = "RECIPE_NAME")
    private String RECIPE_NAME;
    /**
     * 住所
     */
    @Column(name = "DISP_ORDER")
    private String DISP_ORDER;
    /**
     * 電話番号
     */
    @Column(name = "ACTIVE_FLG")
    private Integer ACTIVE_FLG;
    /**
     * 更新日時
     */
    @Column(name = "DELETE_FLG")
    private Integer DELETE_FLG;

}