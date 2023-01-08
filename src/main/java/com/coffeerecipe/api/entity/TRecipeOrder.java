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
@Table(name = "T_RECIPE_ORDER")
public class TRecipeOrder {
    /**
     * ID
     */
    @Id
    @Column(name = "RECIPE_ORDER_KEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer RECIPE_ORDER_KEY;
    /**
     * レシピ主キー
     */
    @Column(name = "RECIPE_KEY")
    private Integer RECIPE_KEY;
    /**
     * 順番
     */
    @Column(name = "ORDER")
    private Integer ORDER;
    /**
     * ドリップ比率
     */
    @Column(name = "ORDER_RATIO")
    private Integer ORDER_RATIO;
    
    /**
     * タイマー時刻
     */
    @Column(name = "MINUTES_DATE")
    private Integer MINUTES_DATE;
    
    /**
     * タイマー時刻
     */
    @Column(name = "SECOND_DATE")
    private Integer SECOND_DATE;
    
    /**
     * アクティブフラグ
     */
    @Column(name = "ACTIVE_FLG")
    private Integer ACTIVE_FLG;
    /**
     * 削除フラグ
     */
    @Column(name = "DELETE_FLG")
    private Integer DELETE_FLG;    
    /**
     * ドリップ温度
     */
    @Column(name = "TEMPERATURE")
    private Integer TEMPERATURE;    
    /**
     * コメント
     */
    @Column(name = "COMMENT")
    private Integer COMMENT;
    
}