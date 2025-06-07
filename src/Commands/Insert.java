package Commands;

import Collection.Address;
import Collection.Coordinates;
import Collection.Organization;
import Utils.CollectionManager;
import Utils.Consoll;

import java.time.LocalDateTime;

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
        String name = Consoll.askSmt("имя организации");
        organization.setName(name);
        String fullName = Consoll.askSmt("полное имя организации");
        organization.setFullName(fullName);
        Integer annualTurnover = Integer.parseInt(Consoll.askSmt("годовой оборот"));
        organization.setAnnualTurnover(annualTurnover);
        Integer xCoo = Integer.parseInt(Consoll.askSmt("координата по Х"));
        coordinates.setX(xCoo);
        long yCoo = Integer.parseInt(Consoll.askSmt("координата по Х"));
        coordinates.setY(yCoo);
        organization.setCoordinates(coordinates);
        String street = Consoll.askSmt("улицу");
        address.setStreet(street);
        String zipCode = Consoll.askSmt("зип код");
        address.setStreet(zipCode);
        organization.setPostalAddress(address);
        System.out.println(organization);
        return "1";
    }
}
