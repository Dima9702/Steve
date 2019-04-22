package com.javacore.steve;

import com.javacore.steve.common.ConsoleCanvas;
import com.javacore.steve.db.DataBase;
import com.javacore.steve.db.Record;
import com.javacore.steve.db.Table;
import com.javacore.steve.profile.ProfileController;
import com.javacore.steve.state.ApplicationState;



import java.util.Arrays;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;


/**
 * The Application class is a CLI for the project com.javacore.steve. "Steve" is a programme, modelling some activities
 * of a forensic scientist. Moreover, the programme is capable of holding a simple conversation on some general
 * topics, such as weather, music preferences, news, etc...
 * So far the program supports two commands: CommandAuthor and CommandVersion, which are described in the corresponding
 * classes.
 *
 * @author dasha
 * @version 0.0.0
 */


public class Application {

    static public final String APP_NAME = "Steve";
    static public final String AUTHOR = "Dmitriy Mikhailov";
    static public final String VERSION = "0.0.1";
    static ApplicationState currentState;



    public static void main(String[] args) {
        List<String[]> records = DataBase.readDataFile("C:\\EpamProj\\ser.txt");

        Table table = new Table("Criminals", Arrays.asList(new String[]{"id", "name", "deceased"}));
        for(int i = 0; i < records.size(); i++){
            Record record = new Record(table);
            record.setValues(records.get(i));
            table.insert(record);
        }

       // record.setValues(new String[]{"100", "Anthony Soprano", "false"});
       // record.setValues(new String[]{"100", "Anthony Soprano", "false"});





        try {
            List<Integer> ids = new ArrayList<>();
            for(Record record : table.getRecords()) {
                ids.add(record.getInt("id"));
            }
            //System.out.println(table.getRecords());
            //System.out.println(record.getBoolean("deceased"));
            System.out.println(ids);
        } catch (Record.FieldNotFoundExeption ex) {
            ex.printStackTrace();
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }catch (NullPointerException np) {
            np.printStackTrace();
        }

        System.out.println("All is ok, all exceptions have been caught!");


        /*try {
            rec.getInt("id");

        } catch (Record.FieldNotFoundException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }

    }*/

        /*
        List<String> colums = new ArrayList<>();
        colums.add("id");
        colums.add("firstName");
        colums.add("lastName");
        Table criminalTable = new Table("Criminals", colums);
        List<String> values = new ArrayList<>();
        List<String> values2 = new ArrayList<>();
        values.add("1");
        values.add("Vladimir");
        values.add("Tramp");


        values2.add("2");
        values2.add("Donald");
        values2.add("Timoshenko");
        criminalTable.insert(new Record(values));
        criminalTable.insert(new Record(values2));
*/
       // запрос
        String theRequest = "SELECT id, lastName,";
        List<String> requestColumNames = new ArrayList<>();
        int d =7;
        for(int i = 7; i < theRequest.length() ; i++){
            char c = theRequest.charAt(i);
                        if(c == ','){
                requestColumNames.add(theRequest.substring(d, i));
                d = i+2; //учитывая пробел и ,
            }

        }










                // нужно распарсить запрос


      //  Record request = new Record(requestColumNames);
      //  criminalTable.select(request);

        /*List<String> result = criminalTable.selectField("firstName");
        for(String s: result){
            System.out.println(s);
        }
        */
        ConsoleCanvas canvas = new ConsoleCanvas(120,80);
       canvas.drawSqareAt(48, 2, 30,20, canvas  );
       canvas.drawCircleAt(63, 10, 4,canvas );
       canvas.drawSqareAt(51, 15, 24,6, canvas );

       canvas.draw();

        //canvas.setSimbolAt(0,2,'A');
        //canvas.draw();



        // пример потока для графики

        /*Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {3
                    System.out.print(".");
                    try {
                        Thread.sleep(500);
                        } catch (InterruptedException e) {
                    }
                }
                System.out.println("Done");
            }


        };
        System.out.println("\nLoading");
        thread.start();

        ProfileController profileController = new ProfileController();
        profileController.showProfile(51);*/

        /*changeState(new StateIdle(), "idle");
        String testCommand = "test command";
        currentState.onCommand(testCommand);

        //      for (int i = 0; i < 10; i++) {
        //        currentState.onCommand(commandName + i);
        // }

        //or maybe
        for (String commandName : args) {
            currentState.onCommand(commandName);
        }

      /*  System.out.println("Hello, my name is " + APP_NAME);
        //System.out.println("my author is " + AUTHOR);
        for (String commandName : args) {
            ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
            command.execute();
        }
        //command = CommandRegistry.INSTANCE.getCommand(commandName);
        //command.execute();
        //CommandRegistry.INSTANCE.listCommands();

        /*ACommand command = new ACommand("anonymous"){
            @Override
            public void execute(){
                System.out.println("Executing anonymous...");

            }*/


    }

    public static void changeState(ApplicationState newState, String commandName) {
        if (currentState != null) {
            currentState.exit();
        }
        currentState = newState;
        currentState.enter(commandName);
    }


}

