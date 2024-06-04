package Entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Seller implements Serializable {
    public static final long serialVersionUID = 1L;

    private String name;
    private String email;
    private Double BaseSalary;
    private Integer Id;
    private Date BirthDate;

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", BaseSalary=" + BaseSalary +
                ", Id=" + Id +
                ", BirthDate=" + BirthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(name, seller.name) && Objects.equals(email, seller.email) && Objects.equals(BaseSalary, seller.BaseSalary) && Objects.equals(Id, seller.Id) && Objects.equals(BirthDate, seller.BirthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, BaseSalary, Id, BirthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Seller(String name, String email, Double baseSalary, Integer id, Date birthDate) {
        this.name = name;
        this.email = email;
        BaseSalary = baseSalary;
        Id = id;
        BirthDate = birthDate;
    }
}
