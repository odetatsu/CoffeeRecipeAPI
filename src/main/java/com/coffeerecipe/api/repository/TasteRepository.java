package com.coffeerecipe.api.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coffeerecipe.api.entity.MTaste;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface TasteRepository extends JpaRepository<MTaste, Integer> {
    @Query(value ="select * from m_taste mt where mt.RECIPE_KEY = :recipeKey", nativeQuery=true)
	List<MTaste> findByRecipeKey(@Param("recipeKey") Integer recipeKey);
}
