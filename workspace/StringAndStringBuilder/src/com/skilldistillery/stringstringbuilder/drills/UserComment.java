package com.skilldistillery.stringstringbuilder.drills;

public class UserComment {
  private int commentId;
  private UserComment inReplyToComment;
  private String date;
  private String time;
  private String userName;
  private String commentText;
  
  public UserComment(int commentId, UserComment inReplyToComment, String date, String time, String userName,
      String commentText) {
    super();
    this.commentId = commentId;
    this.inReplyToComment = inReplyToComment;
    this.date = date;
    this.time = time;
    this.userName = userName;
    this.commentText = commentText;
  }
  
  public String toString() {

	  StringBuilder sb = new StringBuilder("On ")
			  .append(date)
			  .append(" at ")
			  .append(time)
			  .append(", ")
			  .append(userName)
			  .append(" posted this commment:")
			  .append("[")
			  .append(commentText)
			  .append("]");
	  
	    String msg = sb.toString();
	    
	    return msg;
	  }

  public UserComment getInReplyToComment() {
    return inReplyToComment;
  }

  public void setInReplyToComment(UserComment inReplyToComment) {
    this.inReplyToComment = inReplyToComment;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }

  public int getCommentId() {
    return commentId;
  }

}
