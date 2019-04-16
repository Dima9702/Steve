package com.javacore.steve.common;

public class ConsoleCanvas extends Canvas {
    private char[][] pixes;

    private int width;
    private int height;

    public ConsoleCanvas(int width, int height){
        this.width = width;
        this.height = height;
        init();

    }

    public void init(){
        pixes = new char[height][width];
        reset();
        }

    private void reset(){
        for (int i = 0;i < height; i++){
            for(int j = 0;j < height; j++) {
                pixes[i][j] = '.';
            }
        }
    }

    public void draw(){
        for (int i = 0;i < height; i++){
            System.out.print("\n");
            for(int j = 0;j < height; j++) {
                System.out.print(pixes[i][j]);
            }
        }
    }

    public void setSimbolAt(int x, int y, char symbol){
        pixes[x][y] = symbol;
    }

    @Override
    public void drawText(String text) {
        System.out.println(text);
    }

    @Override
    public void drawSquare(int size) {
        if (size < 2) {
            System.out.println("No square of such size allowed");
        }
        System.out.print("\n");
        for (int i = 0; i < size; i++) {
            System.out.print("#");
        }

        for (int i = 0; i < size - 1; i++) {
            System.out.print("");
        }
    }
    public void drawSqareAt(int x, int y, int size){

        for(int i = 0; i < 15; i++){

            for(int j = 0;j < 15 ; j++){
               if( (i >= x & i< x+size) & (j == y | j == y + size) | (i == x | i == x+size) & (j >= y & j < y + size))
                   System.out.print("#");
               else System.out.print(".");
            }
            System.out.print("\n");

        }

    }
}
