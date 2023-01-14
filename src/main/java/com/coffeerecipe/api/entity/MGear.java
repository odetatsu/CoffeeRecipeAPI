package com.coffeerecipe.api.entity;

import java.util.Date;

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
@Table(name = "M_GEAR")
public class MGear {
    /**
     * ID
     */
    @Id
    @Column(name = "GEAR_KEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer GEAR_KEY;
    /**
     * 名前
     */
    @Column(name = "GEAR_NAME")
    private String GEAR_NAME;
    /**
     * 情報
     */
    @Column(name = "GEAR_INFO")
    private String GEAR_INFO;
    
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
     * 作成日時
     */
    @Column(name = "CREATE_DATE")
    private Date CREATE_DATE;   
    /**
     * 更新日時
     */
    @Column(name = "UPDATE_DATE")
    private Date UPDATE_DATE; 
}