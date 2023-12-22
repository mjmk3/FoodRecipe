package app.foodrecipe.foodrecipecore.Repository;

import app.foodrecipe.foodrecipecore.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
    User findByPhone(String phone);
}
