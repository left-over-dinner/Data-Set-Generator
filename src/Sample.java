import example.ColorNameGenerator;
import example.NameGenerator;
import example.PhoneNumberGenerator;
import sqlscriptgenerator.statements.Insert;

public class Sample {
    public static void main(String[] args){
        NameGenerator nameColumn = new NameGenerator("name");
        ColorNameGenerator colorNameColumn = new ColorNameGenerator("colorName");
        PhoneNumberGenerator phoneNumberGenerator = new PhoneNumberGenerator("phoneNumber");
        Insert insert = new Insert("MyTable");
        insert.addColumn(nameColumn);
        insert.addColumn(colorNameColumn);
        insert.addColumn(phoneNumberGenerator);
        System.out.println(insert.createScript());
    }
}
