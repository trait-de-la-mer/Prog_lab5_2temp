package Main.Commands;

import Main.Collection.Address;
import Main.Collection.Coordinates;
import Main.Collection.Organization;
import Main.Collection.OrganizationType;
import Main.Utils.CollectionManager;
import Main.Utils.Consoll;

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
        if (parametr == null || parametr.isBlank()) throw new IllegalArgumentException("Неправильный ключ!");
        if (getCollectionManager().getOrgCollection().containsKey(parametr))
            throw new IllegalArgumentException("Элемент с таким ключом уже есть!");
        Organization organization = new Organization();
        Address address = new Address();
        Coordinates coordinates = new Coordinates();
        organization.setId(CollectionManager.generateId());
        organization.setCreationDate(LocalDate.now());
        while(!input(Arrays.toString(OrganizationType.values()), organization::setType, OrganizationType::fromString));
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
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
