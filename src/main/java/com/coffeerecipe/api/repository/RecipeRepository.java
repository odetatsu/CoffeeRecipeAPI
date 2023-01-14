package com.coffeerecipe.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coffeerecipe.api.entity.MRecipe;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface RecipeRepository extends JpaRepository<MRecipe, Integer> {
    @Query(value ="select MAX(mr.DISP_ORDER) from m_recipes mr", nativeQuery=true)
	Integer getMaxOrder();
}