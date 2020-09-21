package fr.epita.movie.service.dao;

import java.util.Map;

import fr.epita.movie.dataModel.userRatings;

public class userRatingsDAO extends GenericDAO<userRatings, Long> {
	
	
	@Override
	public String getQuery() {
		return "from UserRatings where title = :pTitle";
	}

	@Override
	public void setParameters(Map<String, Object> parameters, userRatings criteria) {
		parameters.put("pTitle", criteria.getCommentTitle());
		
	}

	@Override
	public Class<userRatings> getEntityClass() {
		return userRatings.class;
	}



}
