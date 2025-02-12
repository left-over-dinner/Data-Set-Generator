package sqlscriptgenerator;

public abstract class Column {
    private String columnName;

    public Column(String columnName) {
        setColumnName(columnName);
    }
    public int randomNumber(int min, int max){
        return (int)(Math.random() * max + min);
    }
    public void setColumnName(String columnName){
        this.columnName = columnName;
    }
    public String getColumnName(){
        return columnName;
    }
    public abstract String generateValue();
}
