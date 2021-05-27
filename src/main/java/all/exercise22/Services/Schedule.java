package all.exercise22.Services;



import all.exercise22.Classes.Game;
import all.exercise22.Classes.Level;
import all.exercise22.Controllers.GameController;
import all.exercise22.Controllers.LevelController;
import all.exercise22.ScheduleMXBean;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
public class Schedule implements ScheduleMXBean {
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
        List <Level> levels= levelController.getAll();
        List <Game> games= gameController.getAll();
        for (int i=0; i< games.size();i++) {
            File game = new File("C:\\Users\\AramK\\IdeaProjects\\JavaAllExercises2\\src\\main\\java");
            FileWriter writer = new FileWriter(game, false);
            writer.write(games.get(i).toString());
        }

        for (int i=0; i< levels.size();i++) {
            File level = new File("C:\\Users\\AramK\\IdeaProjects\\JavaAllExercises2\\src\\main\\java");
            FileWriter writer = new FileWriter(level, false);
            writer.write(levels.get(i).toString());
        }
    }
}
