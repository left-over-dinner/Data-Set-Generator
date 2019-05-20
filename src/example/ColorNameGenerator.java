package example;

import sqlscriptgenerator.Column;

public class ColorNameGenerator extends Column {
    public ColorNameGenerator(String columnName){
        super(columnName);
    }
    @Override
    public String generateValue() {
        /*TODO
            create random generator
        * */
        return "'Blue'";
    }
}
