package model;

import javax.persistence.*;
import java.util.Date;

@Entity()
@Table(name = "global_settings")
public class GlobalSettings
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String code;

    private String name;

    private String value;

    public GlobalSettings(){}

    public GlobalSettings(String code, String name, String value) {
        this.code = code;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
