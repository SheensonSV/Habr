package model;

import javax.persistence.*;

@Entity
@Table(name = "tag2post")
public class Tag2Post
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int post_id;

    private int tag_id;

    public Tag2Post() {}

    public Tag2Post(int post_id, int tag_id) {
        this.post_id = post_id;
        this.tag_id = tag_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }
}
