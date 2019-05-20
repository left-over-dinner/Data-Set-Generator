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
        return insertScriptAssembler;
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
