package com.javacore.steve.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table {

    protected String name;

    protected List<String> columns;

    protected List<Record> records;

    {
        records = new ArrayList<Record>();
    }

    public Table(String name, List<String> colums) {
        this.name = name;
        this.columns = columns;

    }

    public void insert(Record record) {

        records.add(record);
    }

    //select id, firstName, lastName

    ///обработчик запросов





      public void select(Record query) {/*

          Record crim = new Record(query.values);

          Thread loading = new Thread() {
              @Override
              public void run() {
                  System.out.print("Start searching");
                  for (int i = 0; i < 10; i++) {
                      System.out.print(".");
                      try {
                          Thread.sleep(500);
                      } catch (InterruptedException e) {
                      }
                  }
                  System.out.println("Done");
              }


          };

          Thread searching = new Thread() {
              @Override
              public void run() {

                  for (int i = 0; i < 10; i++) {
                      try {
                          Thread.sleep(500);

                      } catch (InterruptedException e) {
                      }


                  }


                  //System.out.print(query.values.get(1));


              }


          };
          Thread result = new Thread() {
              @Override
              public void run() {

                  for (int i = 0; i < 10; i++) {


                  }
                  System.out.println("This is the answer");
              }


          };

          loading.start();
          searching.start();
          try {
              loading.join();
              searching.join();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }

          result.start();*/
      }

   // ---------------------------------------------------------------------------------------

        // между записями 100 мс слип
        //лодинг...... и потом таблица

        // селект в отдельном потоке

    //--------------------------------
    //ID        firstName    lastName
    //--------------------------------
    //1         Vladimir     Trump

    //};



    public List<String> getColums(){
        return columns;
    }

    public  List<String> selectField(String fieldName){
        int index = columns.indexOf(fieldName);
        Iterator it = records.iterator();
        List<String> result = new ArrayList<>();
        while(it.hasNext()){
            Record r = (Record)it.next();
            result.add(r.values.get(index));

        }
    return result;
    }
}



