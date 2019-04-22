package com.javacore.steve.db;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataBase {


//DB.query("SELECT ID, NAME, EMAIL FROM CRIMINALS );


    private Object tableLock = new Object();

    Map<String, Table> tables;

    public synchronized List<Record> select() {
        System.out.println("Starting fetohing records...");
        synchronized (tableLock) {
            System.out.println("Starting selecting records...");
            try {
                Thread.sleep(500);
                System.out.println("Finished fetohing records...");
            } catch (InterruptedException e) {

            }
        }
        return null;
    }

    public void update() {


        System.out.println("Starting update records...");
        synchronized (tableLock) {
            try {
                Thread.sleep(10000);
                System.out.println("Finished update records");
            } catch (InterruptedException e) {

            }
        }

    }

    public static List<String[]> readDataFile(String fileName) {
        FileInputStream fis = null;
        List<String[]> result = new ArrayList<>();
        BufferedReader br;
        try {
            fis = new FileInputStream(fileName);
            br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println("Sourse line: " + line);
                result.add(line.split(";"));
            }
            }catch(FileNotFoundException fnfe){

            } catch(IOException ioex){

            }catch (NullPointerException np) {
            np.printStackTrace();
        }finally{
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        return  result;
        }




    public void delete(){

    }
    public void insert(Record record, Table table){

    }

}
