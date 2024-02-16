package sia.tacocloud.repo;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.entity.UserTaco;

public interface UserRepository extends CrudRepository<UserTaco,Long> {
    UserTaco findByUsername(String username);
}
