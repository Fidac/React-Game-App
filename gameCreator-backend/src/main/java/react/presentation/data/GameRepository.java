package react.presentation.data;

import react.presentation.model.Game;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GameRepository extends PagingAndSortingRepository<Game, Long> {

}
