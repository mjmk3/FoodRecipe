package app.foodrecipe.foodrecipecore.Repository;

import app.foodrecipe.foodrecipecore.Domain.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, String> {
}
