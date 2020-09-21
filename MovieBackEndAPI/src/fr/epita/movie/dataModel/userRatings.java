package fr.epita.movie.dataModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserRatings")
public class userRatings {
	
	@Column(name = "ratings")
	private long ratings;
	
	@Column(name = "commentTitle")
	private String commentTitle;
	
	@Column(name = "commentContent")
	private String commentContent;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userID")
	private long userId;

	public long getRatings() {
		return ratings;
	}

	public void setRatings(long ratings) {
		this.ratings = ratings;
	}

	public String getCommentTitle() {
		return commentTitle;
	}

	public void setCommentTitle(String commentTitle) {
		this.commentTitle = commentTitle;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public userRatings(long ratings, String commentTitle, String commentContent, long userId) {
		super();
		this.ratings = ratings;
		this.commentTitle = commentTitle;
		this.commentContent = commentContent;
		this.userId = userId;
	}

	public userRatings() {
		
	}

}
