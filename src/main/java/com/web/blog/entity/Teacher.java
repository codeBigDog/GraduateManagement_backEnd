package com.web.blog.entity;

public class Teacher {
    private String id;
    private String name;
    private String password;
    private String cellphone;
    private String t_state;

    public String getT_state() {
        return t_state;
    }

    public void setT_state(String t_state) {
        this.t_state = t_state;
    }

    //    private String sid;
//    private String sname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }
}
