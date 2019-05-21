package sqlscriptgenerator.statements;

import sqlscriptgenerator.Column;
import sqlscriptgenerator.SQLScript;

import java.util.ArrayList;
import java.util.Iterator;

public class Insert extends SQLScript {
    public Insert(String tableName){
        super(tableName);
    }
    @Override
    public String createScript() {
        String insertScriptAssembler ="";
        insertScriptAssembler+=createHeader();
        insertScriptAssembler+=createValuesRows();
        return insertScriptAssembler+";";
    }
    private String createValuesRows() {
        String valuesRows="";
        int numberOfValue = getDataQuantity();
        if(numberOfValue>0) valuesRows+="\n"+createValues();
        while((numberOfValue--)>1){
            valuesRows+=",\n"+createValues();
        }
        return valuesRows;
    }
    private String createValues() {
        String values="(";
        ArrayList<Column> columns = getColumns();
        if(columns.size()>0) values += columns.get(0).generateValue();
        for(int i =1; i<columns.size();i++){
            values+=","+columns.get(i).generateValue()+"";
        }
        values+=")";
        return values;
    }
    private String createHeader() {
        String header ="insert into "+getTableName()+" (";
        header+=createColumnsName();
        header+=") values";
        return header;
    }
    private String createColumnsName(){
        String columnNames="";
        ArrayList<Column> columns = getColumns();
        if(columns.size()>0) columnNames += "`"+columns.get(0).getColumnName()+"`";
        for(int i =1; i<columns.size();i++){
            columnNames+=",`"+columns.get(i).getColumnName()+"`";
        }
        return columnNames;
    }
}
