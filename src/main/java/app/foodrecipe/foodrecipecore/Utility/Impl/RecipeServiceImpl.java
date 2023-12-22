package app.foodrecipe.foodrecipecore.Utility.Impl;

import app.foodrecipe.foodrecipecore.Repository.RecipeRepository;
import app.foodrecipe.foodrecipecore.Service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
}
