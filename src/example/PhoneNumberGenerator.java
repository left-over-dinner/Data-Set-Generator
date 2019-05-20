package example;

import sqlscriptgenerator.Column;

public class PhoneNumberGenerator extends Column {
    public PhoneNumberGenerator(String columnName){
        super(columnName);
    }
    @Override
    public String generateValue() {
        /*TODO
            create random generator
        * */
        return "'599-520-2330'";
    }
}
