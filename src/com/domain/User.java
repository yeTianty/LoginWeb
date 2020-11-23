package com.domain;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2020/11/22 20:43
 */
public class User {
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 权限（默认0，1为管理员）
     */
    private int competence;
    /**
     * 金钱（默认0，管理员可设置）
     */
    private int money;

    public User() {
    }

    public User(String name, String password, int competence, int money) {
        this.name = name;
        this.password = password;
        this.competence = competence;
        this.money = money;
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

    public int getCompetence() {
        return competence;
    }

    public void setCompetence(int competence) {
        this.competence = competence;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
