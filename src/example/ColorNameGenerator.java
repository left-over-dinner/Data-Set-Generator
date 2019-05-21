package example;

import sqlscriptgenerator.Column;

public class ColorNameGenerator extends Column {
    private String[] colorNameSet = {"Antique fuchsia","Munsell","Magnolia","Vermilion","Medium aquamarine","Bole","Lemon lime","Rose ebony","Dark blue","Medium spring bud","Psychedelic purple","Charcoal","Pink Sherbet","Light gray","Pale lavender","Deep sky blue","Crimson glory","Payne grey","Crimson glory","International Klein Blue"};
    public ColorNameGenerator(String columnName){
        super(columnName);
    }
    @Override
    public String generateValue() {
        return "'"+colorNameSet[randomNumber(0,colorNameSet.length)]+"'";
    }
}
