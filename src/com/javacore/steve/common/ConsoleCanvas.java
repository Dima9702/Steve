package com.javacore.steve.common;

public class ConsoleCanvas extends Canvas {
    private char[][] pixes;

    private int width;
    private int height;

    public ConsoleCanvas(int height, int width){
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
            for(int j = 0;j < width; j++) {
                pixes[i][j] = '.';
            }
        }
    }

    public void draw(){
        for (int i = 0;i < height; i++){
            System.out.print("\n");
            for(int j = 0;j < width; j++) {
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
    public ConsoleCanvas  drawSqareAt(int x, int y,int width, int height,ConsoleCanvas pix){

        for(int i = 0; i < 120; i++){

            for(int j = 0;j < 80 ; j++){
               if( (i >= y & i< y+height) & (j == x | j == x + width) | (i == y | i == y+height) & (j >= x & j <= x + width))
                   pix.pixes[i][j] = '#';

            }

        }
        return pix;
    }

    public ConsoleCanvas drawCircleAt(int x, int y,int radius,ConsoleCanvas pix){

        for(int i = 0; i < 120; i++){

            for(int j = 0;j < 80 ; j++){
                if( (i >= y - radius & i<= y + radius & j >= x - radius & j <= x + radius) & ((Math.abs(i-y)+Math.abs(j-x)) == radius))
                    pix.pixes[i][j] = '#';

            }

        }
        return pix;

    }


}
