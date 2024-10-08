/*
 * Coder: Vanessa Haynes
 * Project: Project 1 - Particle Engine
 * Date: Sep. 2024
 * Description: Particle engine with basic physics and some interactivity
 */

package com.particle_engine;
import processing.core.*;

public class Main extends PApplet {

    Bubbles bubbles; //draws the bubbles simulation to the screen
    Fishies fishies; //draws the fish simulation to the screen

//sets up processing
    public static void main(String[] args) {
        PApplet.main("com.particle_engine.Main");
    }

//sets up the size of the window 
    public void settings() {
        size (700,500);
        bubbles = new Bubbles(this);
        fishies = new Fishies(this);
    }

//draws everything on the screen
    public void draw() {
        bubbles.draw();
        fishies.draw();
    }

//2 out of 3 mouse functions. Clicking in specific mouse locations speed up either the fishes or the bubbles
    public void mousePressed() {
        fishies.mousePressed();
        bubbles.mousePressed();
    }

//final mouse function. Dragging the mouse will change the color of the background between different shades of dark blue
// (Also plays with the speeds of the particles depending on where it's dragged)
    public void mouseDragged() {
        bubbles.mouseDragged();
    }

//keyboard function. Pressing spacebar flips the direction of the fishes from where they currently are
    public void keyPressed() {
        fishies.keyPressed();
    }
}