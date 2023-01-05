package com.coffeerecipe.api.converter;

import com.coffeerecipe.api.entity.MBeans;
import com.coffeerecipe.api.entity.MRecipe;
import com.coffeerecipe.api.entity.MTaste;
import com.coffeerecipe.api.resupons.BeansInfoRes;
import com.coffeerecipe.api.resupons.RecipeDetailInfoRes;
import com.coffeerecipe.api.resupons.RecipeInfoRes;

public class ResuponsConverter 
{

	public static BeansInfoRes Convert(MBeans mBeans) 
	{
		BeansInfoRes res =new BeansInfoRes();
		res.setBeansKey(mBeans.getBEANS_KEY());
		res.setBeansInfo(mBeans.getBEANS_INFO());
		res.setBeansName(mBeans.getBEANS_NAME());
		res.setRoastVal(mBeans.getROAST_VAL());
		res.setDispOrder(mBeans.getDISP_ORDER());
		
		return res;
	}
	
	public static RecipeInfoRes Convert(MRecipe mRecipe) 
	{
		RecipeInfoRes res =new RecipeInfoRes();
		res.setRecipeKey(mRecipe.getRECIPE_KEY());
		res.setRecipeName(mRecipe.getRECIPE_NAME());
		res.setRecipeInfo(mRecipe.getRECIPE_INFO());
		res.setDispOrder(mRecipe.getDISP_ORDER());
		if(mRecipe.getMBeans()!=null) 
		{
			res.setBeansName(mRecipe.getMBeans().getBEANS_NAME());
			res.setRoastVal(mRecipe.getMBeans().getROAST_VAL());
		}

		return res;
	}
	
	public static RecipeDetailInfoRes Convert(MRecipe mRecipe, MTaste mTaste) 
	{
		RecipeDetailInfoRes res =new RecipeDetailInfoRes();
		res.setRecipeKey(mRecipe.getRECIPE_KEY());
		res.setRecipeName(mRecipe.getRECIPE_NAME());
		res.setRecipeInfo(mRecipe.getRECIPE_INFO());
		res.setDispOrder(mRecipe.getDISP_ORDER());
		if(mRecipe.getMBeans()!=null) 
		{
			res.setBeansName(mRecipe.getMBeans().getBEANS_NAME());
			res.setRoastVal(mRecipe.getMBeans().getROAST_VAL());
		}
		if(mTaste != null) 
		{
			res.setBitter(mTaste.getBITTER());
			res.setRich(mTaste.getRICH());
			res.setAcidity(mTaste.getACIDITY());

			res.setRemarks(mTaste.getREMARKS());;

		}

		return res;
	}
}
