package Commands;

import Collection.Address;
import Collection.Coordinates;
import Collection.Organization;
import Collection.OrganizationType;
import Utils.CollectionManager;
import Utils.Consoll;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class Insert extends Command {
    {name = "Insert";}

    public Insert(CollectionManager cm) {
        super(cm);
    }

    @Override
    public void execute(String parametr) {
        System.out.println(1);
        if (parametr == null || parametr.isBlank()) throw new IllegalArgumentException("Неправильный ключ!");
        System.out.println(1);
        if (getCollectionManager().getOrgCollection().containsKey(parametr))
            throw new IllegalArgumentException("Элемент с таким ключом уже есть!");
        Organization organization = new Organization();
        Address address = new Address();
        Coordinates coordinates = new Coordinates();
        organization.setId(CollectionManager.generateId());
        organization.setCreationDate(LocalDate.now());
        while(!input(Arrays.toString(OrganizationType.values()), organization::setType, OrganizationType::valueOf));
        while(!input("имя", organization::setName, String::valueOf));
        while(!input("полное имя", organization::setFullName, String::valueOf));
        while(!input("годовой оборот", organization::setAnnualTurnover, Double::valueOf));
        while(!input("координата по Х", coordinates::setX, Integer::valueOf));;
        while(!input("координата по Y", coordinates::setY, Double::valueOf));;
        organization.setCoordinates(coordinates);
        while(!input("Индекс", address::setZipCode, String::valueOf));;
        organization.setPostalAddress(address);
        getCollectionManager().addElement(parametr, organization);
    }

    private <T> boolean input(String fieldName, Consumer<T> setter, Function<String, T> intoValue) {
        try {
            String line = Consoll.askSmt(fieldName);
            setter.accept(intoValue.apply(line));
            return true;
        } catch (NumberFormatException exep) {
            System.out.println("Проверь пральность ввода!");
            return false;
        } catch (Exception ex) {
            if (ex.getMessage().startsWith("No enum constant")) {
                throw new IllegalArgumentException("Недопустимый тип организации");}
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
