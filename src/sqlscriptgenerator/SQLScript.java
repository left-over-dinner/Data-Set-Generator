package sqlscriptgenerator;

import java.util.ArrayList;

public abstract class SQLScript {
    private ArrayList<Column> columns = new ArrayList<Column>();
    private String tableName;
    private int dataQuantity;
    public SQLScript(String tableName){
        setTableName(tableName);
    }
    public void setTableName(String tableName){
        this.tableName = tableName;
    }
    public String getTableName(){
        return "`"+tableName+"`";
    }
    public void addColumn(Column column){
        columns.add(column);
    }
    public ArrayList<Column> getColumns(){
        return columns;
    }
    public int getDataQuantity() {
        return dataQuantity;
    }
    public void setDataQuantity(int dataQuantity) {
        this.dataQuantity = dataQuantity;
    }
    public abstract String createScript();
}
