package all.exercise24.Services;



import all.exercise24.Classes.Game;
import all.exercise24.Classes.Level;
import all.exercise24.Controllers.GameController;
import all.exercise24.Interfaces.GameRepository;
import all.exercise24.Interfaces.LevelRepository;
import all.exercise24.Controllers.LevelController;
import all.exercise24.ScheduleMXBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
public class Schedule implements ScheduleMXBean {
    @Autowired
    private final all.exercise24.Interfaces.GameRepository gameRepository;
    @Autowired
    private final all.exercise24.Interfaces.LevelRepository levelRepository;

    public Schedule(GameRepository gameRepository, LevelRepository levelRepository) {
        this.gameRepository = gameRepository;
        this.levelRepository = levelRepository;
    }

    private Boolean isEmpty(final File file) {
        return (file.isDirectory() && (file.list().length > 0));
    }
    @ManagedOperation
    @Scheduled(cron = "0 0/30 * * * *")
    public void doScheduledTask() throws IOException {
        if(isEmpty(new File("C:\\Users\\AramK\\IdeaProjects\\JavaAllExercises2\\src\\main\\java"))){
            for (File myFile : new File("C:\\Users\\AramK\\IdeaProjects\\JavaAllExercises2\\src\\main\\java")
                    .listFiles()) {
                if (myFile.isFile()) myFile.delete();
            }
        }
        GameController gameController = new GameController();
        LevelController levelController = new LevelController();
        List <Level> levels= levelRepository.findAll();
        List <Game> games= gameRepository.findAll();
        for (int i=0; i< games.size();i++) {
            File game = new File("C:\\Users\\AramK\\IdeaProjects\\JavaAllExercises2\\src\\main\\java"+i+".txt");
            FileWriter writer = new FileWriter(game, false);
            writer.write(games.get(i).toString());
        }

        for (int i=0; i< levels.size();i++) {
            File level = new File("C:\\Users\\AramK\\IdeaProjects\\JavaAllExercises2\\src\\main\\java"+i+".txt");
            FileWriter writer = new FileWriter(level, false);
            writer.write(levels.get(i).toString());
        }
    }
}
