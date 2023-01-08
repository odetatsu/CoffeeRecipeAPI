package com.coffeerecipe.api.converter;

import java.util.ArrayList;
import java.util.List;

import com.coffeerecipe.api.entity.MBeans;
import com.coffeerecipe.api.entity.MRecipe;
import com.coffeerecipe.api.entity.MTaste;
import com.coffeerecipe.api.entity.TRecipeOrder;
import com.coffeerecipe.api.resupons.BeansInfoRes;
import com.coffeerecipe.api.resupons.ModBeansInfoRes;
import com.coffeerecipe.api.resupons.RecipeDetailInfoRes;
import com.coffeerecipe.api.resupons.RecipeInfoRes;
import com.coffeerecipe.api.resupons.RecipeStepRes;

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
	
	public static ModBeansInfoRes ConvertModBeansInfo(MBeans mBeans) 
	{
		ModBeansInfoRes res =new ModBeansInfoRes();
		res.setBeansInfo(mBeans.getBEANS_INFO());
		res.setBeansName(mBeans.getBEANS_NAME());
		res.setRoastVal(mBeans.getROAST_VAL());
		
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
		res.setDripRatio(mRecipe.getDRIP_RATIO());
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
	
	public static List<RecipeStepRes> Convert(List<TRecipeOrder> tRecipeOrders) 
	{
		List<RecipeStepRes> resList = new ArrayList<RecipeStepRes>();
		tRecipeOrders.forEach(tRecipeOrder -> 
		{
			RecipeStepRes res =new RecipeStepRes();
			res.setOrder(tRecipeOrder.getORDER());
			res.setOrderRatio(tRecipeOrder.getORDER_RATIO());
		    res.setMinutesDate(tRecipeOrder.getMINUTES_DATE());
		    res.setSecondDate(tRecipeOrder.getSECOND_DATE());
		    res.setTemperature(tRecipeOrder.getTEMPERATURE());
		    resList.add(res);
			}
		);
		
		


		return resList;
	}
}
