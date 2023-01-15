package com.coffeerecipe.api.converter;

import java.util.ArrayList;
import java.util.List;

import com.coffeerecipe.api.entity.MBeans;
import com.coffeerecipe.api.entity.MGear;
import com.coffeerecipe.api.entity.MRecipe;
import com.coffeerecipe.api.entity.MTaste;
import com.coffeerecipe.api.entity.TRecipeStep;
import com.coffeerecipe.api.entity.TUsedRecipe;
import com.coffeerecipe.api.resupons.BeansInfoRes;
import com.coffeerecipe.api.resupons.GearInfoRes;
import com.coffeerecipe.api.resupons.ModBeansInfoRes;
import com.coffeerecipe.api.resupons.RecipeDetailAllRes;
import com.coffeerecipe.api.resupons.RecipeDetailInfoRes;
import com.coffeerecipe.api.resupons.RecipeInfoRes;
import com.coffeerecipe.api.resupons.RecipeStepRes;
import com.coffeerecipe.api.resupons.UsedRecipeRes;

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
	
	public static UsedRecipeRes Convert(TUsedRecipe dto,  List<MRecipe> allRecipe) 
	{
		UsedRecipeRes res =new UsedRecipeRes();
		var recipe = allRecipe.stream().filter(str->str.getRECIPE_KEY() == dto.getRECIPE_KEY()).findFirst().get();
		res.setName(recipe.getRECIPE_NAME());

		res.setKey(dto.getUSED_RECIPE_KEY());
		res.setDate(dto.getUSED_DATE().toString());
		
		return res;
	}
	
	public static GearInfoRes Convert(MGear mGear) 
	{
		var res =new GearInfoRes();
		res.setKey(mGear.getGEAR_KEY());
		res.setName(mGear.getGEAR_NAME());
		res.setInfo(mGear.getGEAR_INFO());
		
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
			res.setBeansKey(mRecipe.getMBeans().getBEANS_KEY());
			res.setBeansName(mRecipe.getMBeans().getBEANS_NAME());
			res.setRoastVal(mRecipe.getMBeans().getROAST_VAL());
		}
		if(mRecipe.getMGeart()!=null) 
		{
			res.setGearKey(mRecipe.getMGeart().getGEAR_KEY());
			res.setGearName(mRecipe.getMGeart().getGEAR_NAME());
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
	
	public static List<RecipeStepRes> Convert(List<TRecipeStep> tRecipeSteps) 
	{
		List<RecipeStepRes> resList = new ArrayList<RecipeStepRes>();
		tRecipeSteps.forEach(tRecipeStep -> 
		{
			RecipeStepRes res =new RecipeStepRes();
			res.setOrder(tRecipeStep.getSTEP());
			res.setOrderRatio(tRecipeStep.getDRIP_RATIO());
		    res.setMinutesDate(tRecipeStep.getMINUTES_DATE());
		    res.setSecondDate(tRecipeStep.getSECOND_DATE());
		    res.setTemperature(tRecipeStep.getTEMPERATURE());
		    resList.add(res);
			}
		);
		
		return resList;
	}
	
	public static RecipeDetailAllRes Convert(MRecipe mRecipe, MTaste mTaste, List<TRecipeStep> tRecipeSteps) 
	{
		RecipeDetailAllRes res =new RecipeDetailAllRes();
		res.setRecipeInfo(Convert(mRecipe,mTaste));
		res.setRecipeSteps(Convert(tRecipeSteps));

		return res;
	}
}
