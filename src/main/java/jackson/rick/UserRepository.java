package jackson.rick;

import org.springframework.data.repository.CrudRepository;
import jackson.rick.User;

/**
 * Created by rickjackson on 2/21/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    
}
