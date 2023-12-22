package app.foodrecipe.foodrecipecore.Repository;

import app.foodrecipe.foodrecipecore.Domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
