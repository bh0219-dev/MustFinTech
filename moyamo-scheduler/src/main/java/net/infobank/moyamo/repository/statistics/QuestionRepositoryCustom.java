package net.infobank.moyamo.repository.statistics;

import net.infobank.moyamo.models.Posting;
import net.infobank.moyamo.models.Statistics;
import net.infobank.moyamo.repository.StatisticsRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Repository
public class QuestionRepositoryCustom extends AbstractActivityRepositoryCustom<Posting> {

    public QuestionRepositoryCustom(EntityManager em, StatisticsRepository statisticsRepository) {
        super(em, statisticsRepository);
    }

    @Override
    Optional<Long> getStartId(List<Statistics> statisticsList) {
        return statisticsList.stream().map(Statistics::getFirstPostingId).min(Comparator.naturalOrder());
    }

    @Override
    Optional<Long> getEndId(List<Statistics> statisticsList) {
        return statisticsList.stream().map(Statistics::getLastPostingId).max(Long::compareTo);
    }
}
