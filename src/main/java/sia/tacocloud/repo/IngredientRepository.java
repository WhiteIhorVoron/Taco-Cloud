package sia.tacocloud.repo;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient,String> {

}
