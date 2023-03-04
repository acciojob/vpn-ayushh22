// Note: Do not write @Enumerated annotation above CountryName in this model.

import com.driver.model.CountryName;
import jdk.internal.module.ServicesCatalog;
import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table(name="country")

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    CountryName countryName;
    String code;
    User user;

    public Country(int id, CountryName countryName, String code, User user) {
        this.id = id;
        this.countryName = countryName;
        this.code = code;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CountryName getCountryName() {
        return countryName;
    }

    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}