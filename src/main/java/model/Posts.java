package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Posts
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private short is_active;

    private enum moderation_status {
        NEW,
        ACCEPTED,
        DECLINED
    }

    private int moderator_id;

    private int user_id;

    private Date time;

    private String title;

    private String text;

    private int view_count;

    public Posts() {}

    public Posts(short is_active, int moderator_id, int user_id, Date time, String title, String text, int view_count) {
        this.is_active = is_active;
        this.moderator_id = moderator_id;
        this.user_id = user_id;
        this.time = time;
        this.title = title;
        this.text = text;
        this.view_count = view_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getIs_active() {
        return is_active;
    }

    public void setIs_active(short is_active) {
        this.is_active = is_active;
    }

    public int getModerator_id() {
        return moderator_id;
    }

    public void setModerator_id(int moderator_id) {
        this.moderator_id = moderator_id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }
}
