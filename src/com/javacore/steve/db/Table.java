package com.javacore.steve.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table {

    protected String name;

    protected List<String> colums;

    protected List<Record> records;

    {
        records = new ArrayList<Record>();
    }

    public Table(String name, List<String> colums)
    {
       this.name = name;
        this.colums = colums;

    }

    public void insert(Record record) {
        records.add(record);
    };

    //select id, firstName, lastName
    public void select(Record query) {


        // между записями 100 мс слип
        //лодинг...... и потом таблица

        // селект в отдельном потоке

    //--------------------------------
    //ID        firstName    lastName
    //--------------------------------
    //1         Vladimir     Trump

    };


    public  List<String> selectField(String fieldName){
        int index = colums.indexOf(fieldName);
        Iterator it = records.iterator();
        List<String> result = new ArrayList<>();
        while(it.hasNext()){
            Record r = (Record)it.next();
            result.add(r.values.get(index));

        }
    return result;
    };


}
