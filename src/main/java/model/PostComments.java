package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_comments")
public class PostComments
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int parent_id;

    private int post_id;

    private int user_id;

    private Date time;

    private String text;

    public PostComments(){}

    public PostComments(int parent_id, int post_id, int user_id, Date time, String text) {
        this.parent_id = parent_id;
        this.post_id = post_id;
        this.user_id = user_id;
        this.time = time;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
