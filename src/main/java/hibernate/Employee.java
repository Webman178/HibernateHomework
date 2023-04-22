package hibernate;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    public Employee() {

    }

    public Employee(int id, String firstName, String lastName, String gender, int age, int cityId) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.cityId = cityId;
    }

    public Employee(String firstName, String lastName, String gender, int age, int cityId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="last_name", length = 50, nullable = false)
    private String lastName;
    @Column(name="first_name", length = 50, nullable = false)
    private String firstName;
    @Column(length = 6, nullable = false)
    private String gender;
    @Column(nullable = false)
    private int age;
    @Column(name = "city_id", nullable = false)
    private int cityId;

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName + " " + gender + " " + age + " " + cityId;
    }
}

