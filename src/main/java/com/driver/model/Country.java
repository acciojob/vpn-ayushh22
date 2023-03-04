// Note: Do not write @Enumerated annotation above CountryName in this model.

import com.driver.model.CountryName;
import jdk.internal.module.ServicesCatalog;
import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table(name="country_db")

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    CountryName countryName;
    String code;
    User user;

}