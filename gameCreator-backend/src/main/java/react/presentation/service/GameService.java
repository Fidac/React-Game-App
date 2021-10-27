package react.presentation.service;

import react.presentation.data.GameRepository;
import react.presentation.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public Game createGame(Game game){
        return gameRepository.save((Game) game);
    }

    public Game getGame(Long id){
        Game game = gameRepository.findById(id).get();
        return game;
    }

    public List<Game> getGames(){
        return (List<Game>)gameRepository.findAll();
    }

    public Game updateGame(Game game){ return gameRepository.save((Game) game);};

    public void deleteGame(Long id){
        Game game = gameRepository.findById(id).get();
        gameRepository.delete(game);
    }
}
