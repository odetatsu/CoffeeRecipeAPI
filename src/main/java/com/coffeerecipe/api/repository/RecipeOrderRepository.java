package com.coffeerecipe.api.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coffeerecipe.api.entity.TRecipeOrder;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface RecipeOrderRepository extends JpaRepository<TRecipeOrder, Integer> {
    @Query(value ="select * from t_recipe_order mt where mt.RECIPE_KEY = :recipeKey order by mt.ORDER, mt.Recipe_ORDER_Key", nativeQuery=true)
	List<TRecipeOrder> findByRecipeKey(@Param("recipeKey") Integer recipeKey);
}
