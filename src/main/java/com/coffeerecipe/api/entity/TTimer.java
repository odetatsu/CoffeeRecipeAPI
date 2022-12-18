package com.coffeerecipe.api.entity;
import java.util.Date;

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
@Table(name = "T_TIMER")
public class TTimer {
    /**
     * ID
     */
    @Id
    @Column(name = "TIMER_KEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer TIMER_KEY;
    /**
     * レシピ主キー
     */
    @Column(name = "RECIPE_KEY")
	@PrimaryKeyJoinColumn(name = "M_RECIPE",referencedColumnName="RECIPE_KEY")
    private String BEANS_NAME;
    /**
     * タイマー時刻
     */
    @Column(name = "TIMER_DATE")
    private Date TIMER_DATE;
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

}