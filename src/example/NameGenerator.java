package example;

import sqlscriptgenerator.Column;

public class NameGenerator extends Column {
    public NameGenerator(String columnName){
        super(columnName);
    }
    @Override
    public String generateValue() {
        /*TODO
            create random generator
        * */
        return "'Maria'";
    }
}
