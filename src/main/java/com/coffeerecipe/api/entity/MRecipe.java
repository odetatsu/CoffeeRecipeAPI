package com.coffeerecipe.api.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "M_RECIPES")
public class MRecipe {
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
    @GeneratedValue()
    private String RECIPE_NAME;
    /**
     * 焙煎度
     */
    @Column(name = "RECIPE_INFO")
    private String RECIPE_INFO;
    /**
     * 表示順
     */
    @Column(name = "DISP_ORDER")
    private Integer	 DISP_ORDER;
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
    
    @JoinTable(
            name = "R_Recipe_Beans",
            joinColumns = @JoinColumn(
                    name = "RECIPE_KEY",
                    referencedColumnName = "RECIPE_KEY"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "BEANS_KEY",
                    referencedColumnName = "BEANS_KEY"
            )
    )
    @OneToOne
    private MBeans mBeans;
    
}