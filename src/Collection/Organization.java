package Collection;

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


    public static Integer getCurrentId() {
        return currentId;
    }
}