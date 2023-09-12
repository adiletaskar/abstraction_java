package repositories;

import models.Comment;

public class DBCommentRepository implements CommentRepository{
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
