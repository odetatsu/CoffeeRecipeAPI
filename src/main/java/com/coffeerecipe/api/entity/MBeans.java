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
@Table(name = "M_BEANS")
public class MBeans {
    /**
     * ID
     */
    @Id
    @Column(name = "BEANS_KEY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BEANS_KEY;
    /**
     * 名前
     */
    @Column(name = "BEANS_NAME")
    private String BEANS_NAME;
    /**
     * コーヒ豆情報
     */
    @Column(name = "BEANS_INFO")
    private String BEANS_INFO;
    
    /**
     * 焙煎度
     */
    @Column(name = "ROAST_VAL")
    private int ROAST_VAL;
    /**
     * 表示順
     */
    @Column(name = "DISP_ORDER")
    private Integer DISP_ORDER;
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
    
    /**
     * 無効フラグ
     */
    @Column(name = "INVALID_FLG")
    private Integer INVALID_FLG;
}