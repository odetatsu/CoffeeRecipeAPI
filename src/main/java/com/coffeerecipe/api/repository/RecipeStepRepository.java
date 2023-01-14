package com.coffeerecipe.api.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coffeerecipe.api.entity.TRecipeStep;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface RecipeStepRepository extends JpaRepository<TRecipeStep, Integer> {
    @Query(value ="select * from t_recipe_step mt where mt.RECIPE_KEY = :recipeKey order by mt.STEP, mt.recipe_step_Key", nativeQuery=true)
	List<TRecipeStep> findByRecipeKey(@Param("recipeKey") Integer recipeKey);
    @Query(value ="delete from t_recipe_step mt where mt.RECIPE_KEY = :recipeKey", nativeQuery=true)
	List<TRecipeStep> deleteByRecipeKey(@Param("recipeKey") Integer recipeKey);
}

