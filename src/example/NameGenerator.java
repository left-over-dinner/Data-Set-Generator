package example;

import sqlscriptgenerator.Column;

public class NameGenerator extends Column {
    private String[] nameSet = {"Argentina Tupper","Odis Denniston","Heath Mullane","Elfreda Marez","Holly Bayard","Lexie Beauchamp","Kindra Soja","Diedre Millman","Gerard Claude","Dick Mcmickle","Carmela Gertner","Jules Vowell","Shelton Tompson","Mozelle Schmid","Cristin Millspaugh","Suanne Minks","Cristine Dent","Stepanie Newbern","Rosario Carithers","Piper Mccurley"};
    public NameGenerator(String columnName){
        super(columnName);
    }
    @Override
    public String generateValue() {
        return "'"+nameSet[ randomNumber(0, nameSet.length) ]+"'";
    }
}
