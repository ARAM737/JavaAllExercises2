package all.exercise19.Services;

import all.exercise19.Classes.Game;
import all.exercise19.Interfaces.GameRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class GameService {

    @Autowired
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getGames() {
        return gameRepository.findAll();
    }


    public void deleteGame(UUID id) {
        gameRepository.deleteById(id);
    }

    public List<Game> getByName(String name) {
        return gameRepository.findAllByName(name);
    }

    public List<Game> getByYear(int creationYear) {
        return gameRepository.findAllByCreationYear(creationYear);
    }
}
