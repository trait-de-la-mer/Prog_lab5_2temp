package Commands;

import Collection.Address;
import Collection.Coordinates;
import Collection.Organization;
import Collection.OrganizationType;
import Utils.CollectionManager;
import Utils.Consoll;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;

public class Insert extends Command {
    {name = "Insert";}

    public Insert(CollectionManager cm) {
        super(cm);
    }

    @Override
    public String execute() {
        Organization organization = new Organization();
        Address address = new Address();
        Coordinates coordinates = new Coordinates();
        organization.setId(CollectionManager.generateId());
        organization.setCreationDate(LocalDateTime.now());
        for (OrganizationType orgType : OrganizationType.values()){System.out.printf(String.valueOf(orgType) + " ");}
        organization.setType(OrganizationType.valueOf(Consoll.askSmt("тип организации").toUpperCase()));
        while(!input("имя", organization::setName, String::valueOf));
        while(!input("полное имя", organization::setFullName, String::valueOf));
        while(!input("годовой оборот", organization::setAnnualTurnover, Integer::valueOf));
        while(!input("координата по Х", coordinates::setX, Integer::valueOf));;
        while(!input("координата по Y", coordinates::setY, Long::valueOf));;
        organization.setCoordinates(coordinates);
        while(!input("улицу", address::setStreet, String::valueOf));
        while(!input("Индекс", address::setZipCode, String::valueOf));;
        organization.setPostalAddress(address);
        System.out.println(organization);
        return "1";
    }

    private <T> boolean input(String fieldName, Consumer<T> setter, Function<String, T> intoValue){
        try{
            String line = Consoll.askSmt(fieldName);
            setter.accept(intoValue.apply(line));
            return true;
        }
        catch (Exception e){
            System.out.println("Точно правильно ввел?");
            return false;
        }
    }
}
