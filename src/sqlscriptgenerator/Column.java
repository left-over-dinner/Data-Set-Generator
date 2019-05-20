package sqlscriptgenerator;

public abstract class Column {
    private String columnName;
    public void setColumnName(String columnName){
        this.columnName = columnName;
    }
    public void getColumnName(String columnName){
        this.columnName = columnName;
    }
    public abstract String generateValue();
}
