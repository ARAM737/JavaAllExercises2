package all.exercise24.Interfaces;


import all.exercise24.Classes.Level;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LevelRepository extends JpaRepository<all.exercise24.Classes.Level,Long> {
    List<all.exercise24.Classes.Level> findAllByComplexity(String complexity);
    List<all.exercise24.Classes.Level> findAllByComplexityAndName(String complexity, String name);
    List<all.exercise24.Classes.Level> findAllByName(String name);
    all.exercise24.Classes.Level findById(UUID id);
    @NotNull List<Level> findAll();
    void deleteById(UUID id);
}
