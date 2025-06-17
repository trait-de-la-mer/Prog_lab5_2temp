package Main.Utils;
import Main.Collection.Address;
import Main.Collection.Coordinates;
import Main.Collection.Organization;
import Main.Collection.OrganizationType;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class JParser {

    public HashMap<String, Organization> parse(String file){
        HashMap<String, Organization> organizationsMap = new HashMap<>();
        JSONParser parser = new JSONParser();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        try (FileReader reader = new FileReader(file)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            for (Object key : jsonObject.keySet()) {
                String orgKey = (String) key;
                JSONObject orgJson = (JSONObject) jsonObject.get(orgKey);
                Organization org = new Organization();
                org.setId((Long.valueOf(orgJson.get("id").toString())));
                org.setName(orgJson.get("name").toString());
                JSONObject coordinatesJson = (JSONObject) orgJson.get("coordinates");
                Coordinates coordinates = new Coordinates();
                coordinates.setX(Integer.valueOf(coordinatesJson.get("x").toString()));
                coordinates.setY(Double.valueOf(coordinatesJson.get("y").toString()));
                org.setCoordinates(coordinates);
                String creationDateStr = orgJson.get("creationDate").toString();
                org.setCreationDate(LocalDate.parse(creationDateStr));
                org.setAnnualTurnover(Double.valueOf(orgJson.get("annualTurnover").toString()));
                org.setFullName(orgJson.get("fullName").toString());
                String typeStr = orgJson.get("type").toString(); // ПРОВЕРИТЬ!!!!!!!!!!!!!!!!!1
                org.setType(OrganizationType.fromString(typeStr));
                JSONObject addressJson = (JSONObject) orgJson.get("postalAddress");
                Address address = new Address();
                address.setZipCode((String) addressJson.get("zipCode"));
                org.setPostalAddress(address);
                organizationsMap.put(orgKey, org);
            }

        } catch (FileNotFoundException e ){
            Consoll.printSmt("файл " + file + " не найден");
        } catch (NumberFormatException e){
            Consoll.printSmt("Проверь правильность введенных данных (возможно не тот тип данных)");
        } catch (IllegalArgumentException e){
            Consoll.printSmt(e.getMessage());
        } catch (IOException e) {
            Consoll.printSmt("Непредвиденная ошибка чтения файла " + file);
        } catch (ParseException e) {
          Consoll.printSmt("Что-то не так с данными файла");
        }
        return organizationsMap;
    }}
