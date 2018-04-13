package xin.lobinson.springboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_cjx_user`")
public class TCjxUser {
	@Id
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private Date birthday;

    private Integer sex;

    private String info;

    private String phone;

    private String email;

    private String web;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

	@Override
	public String toString() {
		return "TCjxUser{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", nickname='" + nickname + '\'' +
				", birthday=" + birthday +
				", sex=" + sex +
				", info='" + info + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", web='" + web + '\'' +
				'}';
	}
}