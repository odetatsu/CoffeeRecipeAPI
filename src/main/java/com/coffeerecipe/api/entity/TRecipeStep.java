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
@Table(name = "T_RECIPE_STEP")
public class TRecipeStep {
    /**
     * ID
     */
    @Id
    @Column(name = "RECIPE_STEP_KEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer RECIPE_STEP_KEY;
    /**
     * レシピ主キー
     */
    @Column(name = "RECIPE_KEY")
    private Integer RECIPE_KEY;
    /**
     * 順番
     */
    @Column(name = "STEP")
    private Integer STEP;
    /**
     * ドリップ比率
     */
    @Column(name = "DRIP_RATIO")
    private Integer DRIP_RATIO;
    
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
     * ドリップ温度
     */
    @Column(name = "TEMPERATURE")
    private Integer TEMPERATURE;    
    /**
     * コメント
     */
    @Column(name = "COMMENT")
    private String COMMENT;
    
}