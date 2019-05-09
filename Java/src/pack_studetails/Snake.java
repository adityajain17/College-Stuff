/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_studetails;

/**
 *
 * @author Aditya Jain
 */
import java.awt.Color;

import java.awt.Dimension;

import java.awt.Graphics;

import java.awt.Point;

import java.awt.Toolkit;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import java.util.ArrayList;

import java.util.Random;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.Timer;



/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */



/**

 *

 * @author Harsh V. Kushwaha

 */





class RenderPanel extends JPanel{

    

    public static Color black = new Color(0);

    

    @Override

    public void paintComponent(Graphics g) {

        

        super.paintComponent(g);

        g.setColor(black);

        g.fillRect(0, 0, 800, 700);

        

        g.setColor(Color.GREEN);

        

        Snake snake = Snake.snake;

        

        for (Point point : snake.snakeParts) {

            g.setColor(Color.GREEN);

            g.fillRect(point.x * snake.SCALE, point.y * snake.SCALE,

                    snake.SCALE, snake.SCALE);

            g.setColor(Color.BLUE);

            g.drawRect(point.x * snake.SCALE, point.y * snake.SCALE,

                    snake.SCALE, snake.SCALE);

        }

        

        g.fillRect(snake.head.x * snake.SCALE, snake.head.y * snake.SCALE,

                    snake.SCALE, snake.SCALE);

        

        g.setColor(Color.RED);

        g.fillRect(snake.cherry.x * snake.SCALE, snake.cherry.y * snake.SCALE,

                    snake.SCALE, snake.SCALE);

        

        g.setColor(Color.WHITE);

        String str = "Welcome to Snake game";

        g.drawString(str, 325 - str.length() / 2, 25);

        

//        System.out.println(snake.cherry.x + " " + snake.cherry.y);

        

    }

    

}







public class Snake implements ActionListener, KeyListener{

    

    public static Snake snake;

    

    public JFrame jframe;

    

    public RenderPanel renderPanel;

    

    public Timer timer = new Timer(20,this);    

    

    ArrayList<Point> snakeParts = new ArrayList<Point>();

    

    public static final int UP = 1, DOWN = 2, LEFT = 3, RIGHT = 4, SCALE = 10;

    

    public int ticks = 0, direction = DOWN, score = 0, tailLength = 5, time;

    

    public Point head, cherry;

    

    public Random random;

    

    public Dimension dim;

    

    public boolean over = false, paused = false;

    

    Snake(){

        

        dim = Toolkit.getDefaultToolkit().getScreenSize();

        jframe = new JFrame("Snake");

        

        jframe.setVisible(true);

        jframe.setSize(800, 700);

        jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2,

                dim.height / 2 - jframe.getHeight() / 2);

        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

        

        jframe.add(renderPanel = new RenderPanel());

        jframe.addKeyListener(this);

        

        startGame();

    }

    

    public void startGame(){

        

        over = false;

        paused = false;

        score = 0;

        time = 0;

        tailLength = 9;

        direction = DOWN;

        head = new Point(0, -1);

        random = new Random();

        snakeParts.clear();

        cherry = new Point(random.nextInt(78),random.nextInt(65));

        timer.start();

        

    }

    

    public static void main(String[] args){

        snake = new Snake();

    }



    @Override

    public void actionPerformed(ActionEvent e) {

        renderPanel.repaint();

        ticks += 1;

        

        if(snakeParts.size() > tailLength)

            snakeParts.remove(0);

        

        if (ticks % 2 == 0 && head != null && !over && !paused ){

            

            snakeParts.add(new Point(head.x, head.y));

             

            if(direction == UP){

                if(head.y - 1 >= 0 && noTailAt(head.x, head.y - 1))

                    head = new Point(head.x, head.y - 1);

                else

                    over = true;

            }

            if(direction == DOWN){

                if(head.y + 1 < 65 && noTailAt(head.x, head.y + 1))

                    head = new Point(head.x, head.y + 1);

                else

                    over = true;

            }

            if(direction == RIGHT){

                if(head.x - 1 >= 0 && noTailAt(head.x - 1, head.y))

                    head = new Point(head.x - 1, head.y);

                else

                    over = true;

            }

            if(direction == LEFT){

                if(head.x + 1 < 78 && noTailAt(head.x + 1, head.y))

                    head = new Point(head.x + 1, head.y);

                else

                    over = true;

            }

            

            snakeParts.add(new Point(head.x, head.y));

            

            if(snakeParts.size() > tailLength)

                snakeParts.remove(0);

            

            if (cherry != null){

                if (head.equals(cherry)){

                    score += 10;

                    tailLength += 1;

                    cherry.setLocation(random.nextInt(79),random.nextInt(65));

                    

                }

            }

                

        }

    }



    @Override

    public void keyTyped(KeyEvent e) {

    }



    

    @Override

    public void keyPressed(KeyEvent e) {

        

        int i = e.getKeyCode();

        

        if((i == KeyEvent.VK_W || i == KeyEvent.VK_UP)&& direction != DOWN){

            direction = UP;

        }

        if((i == KeyEvent.VK_A || i == KeyEvent.VK_LEFT)&& direction != LEFT){

            direction = RIGHT;

        }

        if((i == KeyEvent.VK_S || i == KeyEvent.VK_RIGHT)&& direction != UP){

            direction = DOWN;

        }

        if((i == KeyEvent.VK_D || i == KeyEvent.VK_DOWN)&& direction != RIGHT){

            direction = LEFT;

        }

        if(i == KeyEvent.VK_SPACE){

            if(over)

                startGame();

            else

                paused = !paused;

        }

        

    }



    @Override

    public void keyReleased(KeyEvent e) {

    }



    private boolean noTailAt(int x, int i) {

        

        for(Point point : snakeParts)

        {

            if(point.equals(new Point(x, i))){

                return false;

            }

        }

        

        return true;

        

    }



}