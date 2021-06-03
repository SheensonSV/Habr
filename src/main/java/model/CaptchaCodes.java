package model;

import javax.persistence.*;
import java.util.Date;

@Entity()
@Table(name = "captcha_codes")
public class CaptchaCodes
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Date time;

    private String code;

    private String secret_code;

    public CaptchaCodes(){}

    public CaptchaCodes(Date time, String code, String secret_code) {
        this.time = time;
        this.code = code;
        this.secret_code = secret_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSecret_code() {
        return secret_code;
    }

    public void setSecret_code(String secret_code) {
        this.secret_code = secret_code;
    }
}
