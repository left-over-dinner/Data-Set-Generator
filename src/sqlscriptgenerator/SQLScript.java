package sqlscriptgenerator;

import java.util.ArrayList;

public abstract class SQLScript {
    private ArrayList<Column> columns = new ArrayList<Column>();
    private String tableName;
    public SQLScript(String tableName){
        setTableName(tableName);
    }
    public void setTableName(String tableName){
        this.tableName = tableName;
    }
    public String getTableName(){
        return tableName;
    }
    public void addColumn(Column column){
        columns.add(column);
    }
}
