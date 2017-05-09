package pl.com.hedgo.java8.model;

import java.math.BigDecimal;

public class Developer {
    private String name;
    private BigDecimal money;
    private Integer age;

    public Developer(String name, BigDecimal money, Integer age) {
        this.name = name;
        this.money = money;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getAge() {
        return age;
    }

    public Long getMoneyLong(){
        return money.longValue();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", age=" + age +
                '}';
    }
}
