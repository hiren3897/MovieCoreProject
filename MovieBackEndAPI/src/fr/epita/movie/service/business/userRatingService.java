package fr.epita.movie.service.business;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.epita.movie.dataModel.userRatings;
import fr.epita.movie.service.dao.userRatingsDAO;

public class userRatingService {
	
	public static final Logger LOGGER = LogManager.getLogger(userRatingService.class);
	
	@Inject
	userRatingsDAO userRatingDAO;
	
	@PersistenceContext
	EntityManager em;

	@Transactional(Transactional.TxType.REQUIRED)
	public void createQuestionAndMCQChoices(userRatings user) {

		LOGGER.info("entering the createQuestionAndMCQChoices method");
		

	
	}
}
