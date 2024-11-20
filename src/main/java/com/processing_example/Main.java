/*
 * Coder: Courtney Brown
 * Date: Aug. 2024
 * Description: Hello, world! Project for Coding III -- Prints hello, world and draw some stuff to the screen
 * 
 */

package com.processing_example;

import processing.core.*; 
import processing.sound.*;

public class Main extends PApplet {

    int green = 400; //the green color value of the 2 squares --changes on mouseclick.
    SoundFile sound; //the sound file!

    //sets up processing and prints the hello world message to the console.
    public static void main(String[] args) {
        PApplet.main("com.processing_example.Main");
        System.out.println("Hello world!");
    }

    //sets up the size of the window
    public void settings()
    {
        size(500, 500); 
    }

    //changes background color to something blue green
    public void setup()
    {
        background(30, 150, 100);
        sound = new SoundFile(this, "audio/15 Tristezas de un Doble A Cut.aif"); //load it -- this is an Astor Piazzolla song don't redistribute! thx -- also its aif but should work with mp3s, etc.
    }

    //draws some nested rectangles
    public void draw()
    {
        rectMode(CENTER);
        fill(200, green, 200);
        rect(width/2, height/2, 300, 300);
        fill(200, green/10, 200);
        rect(width/2, height/2, 150, 150);

    }

    //changes the colors of the 2 squares
    public void mousePressed()
    {
        sound.play(); //I play it when you press the mouse.
        if( green == 400 )
            green = 200;
        else green = 400; 
    }


}