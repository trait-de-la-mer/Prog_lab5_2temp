package Collection;

import java.time.LocalDateTime;

public class Organization{
    private static Integer currentId = 0;
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer annualTurnover; //Поле может быть null, Значение поля должно быть больше 0
    private String fullName; //Длина строки не должна быть больше 1354, Поле может быть null
    private OrganizationType type; //Поле не может быть null
    private Address postalAddress; //Поле не может быть null

    public void setCreationDate(LocalDateTime creationDate) {
        if (creationDate == null) throw new IllegalArgumentException("время создания не может быть null");
        this.creationDate = creationDate;
    }


    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("Id должно быть > 0");
        this.id = id;
    }


    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("имя не может быть null");
        if (name.isEmpty()) throw new IllegalArgumentException("имя не может быть пустым");
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        if (coordinates == null) throw new IllegalArgumentException("координаты не могут быть null");
        this.coordinates = coordinates;
    }

    public void setAnnualTurnover(Integer annualTurnover) {
        if (annualTurnover == null) throw new IllegalArgumentException("оборот не может быть null");
        if (annualTurnover <= 0) throw new IllegalArgumentException("оборот должен быть > 0");
        this.annualTurnover = annualTurnover;
    }

    public void setFullName(String fullName) {
        if (fullName == null) throw new IllegalArgumentException("полное имя не может быть null");
        if (fullName.length() > 1354) throw new IllegalArgumentException("слишком длинное!");
        this.fullName = fullName;
    }

    public void setType(OrganizationType type) {
        if (type == null) throw new IllegalArgumentException("тип не может быть null");
        this.type = type;
    }

    public void setPostalAddress(Address postalAddress) {
        if (postalAddress == null) throw new IllegalArgumentException("адрес не может быть null");
        this.postalAddress = postalAddress;
    }

    public static Integer getCurrentId() {
        return currentId;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", annualTurnover=" + annualTurnover +
                ", fullName='" + fullName + '\'' +
                ", type=" + type +
                ", postalAddress=" + postalAddress +
                '}';
    }
}