package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GAME4_P extends JPanel implements ActionListener 
{

    private static final int SCREEN_WIDTH = 620;
    private static final int SCREEN_HEIGHT = 620;
    private static final int UNIT_SIZE = 15;
    private static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    private static int DELAY = 120;
    private final int[] x = new int[GAME_UNITS];
    private final int[] y = new int[GAME_UNITS];
    private int foodConsumed = 0;
    private int snakeLength = 6;
    private int foodX;
    private int foodY;
    private GAME4_D direction = GAME4_D.RIGHT;
    private boolean running = false;
    private Timer timer;
    private final Random random;

    public GAME4_P() 
    {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    private void startGame() 
    {
        generateFood();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        draw(g);
    }
//---------------------------------------------------------------------------------------
    private void draw(Graphics g)   // DRAW METHOD OF GRAPHICS
    {
    	
        if (running) 
        {
// FOOD--------------------------------------------------------------------
            g.setColor(Color.MAGENTA);
            g.fillOval(foodX, foodY, UNIT_SIZE, UNIT_SIZE);

// SNAKE--------------------------------------------------------------------
            for (int i = 0; i < snakeLength; i++) 
            {
// HEAD--------------------------------------------------------------------
                if (i == 0) 
                {
                    g.setColor(Color.RED);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }  
// BODY--------------------------------------------------------------------
                else if (i == 1) 
               {
                   g.setColor(Color.YELLOW);
                   g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
               }
                else if (i == 2) 
               {
                   g.setColor(Color.YELLOW);
                   g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                  // BODY
               } 
                else 
                {
                    g.setColor(Color.GREEN);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
// SCORE--------------------------------------------------------------------
            g.setColor(Color.YELLOW);
            g.setFont(new Font("MV Boli", Font.PLAIN, 20));
            FontMetrics metrics = getFontMetrics(g.getFont());
            String score = "Score: " + foodConsumed;
            g.drawString(score, SCREEN_WIDTH - metrics.stringWidth(score) - UNIT_SIZE, g.getFont().getSize());
       
        } // IF CLOSING
        else
        {
            gameOver(g);
        }
    } // CLOSING OF DRAW METHOD OF GRAPHICS.
//------------------------------------------------------------------------------------
    
    private void generateFood() 
    {
        foodX = random.nextInt(SCREEN_WIDTH / UNIT_SIZE) * UNIT_SIZE;
        foodY = random.nextInt(SCREEN_HEIGHT / UNIT_SIZE) * UNIT_SIZE;
    }
//------------------------------------------------------------------------------------
    
    private void move() 
    {
        for (int i = snakeLength; i > 0; i--) 
        {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch (direction) 
        {
            case UP:
            	y[0] = y[0] - UNIT_SIZE;
            	break;
            case DOWN:
            	y[0] = y[0] + UNIT_SIZE;
            	break;
            case LEFT:
            	x[0] = x[0] - UNIT_SIZE;
            	break;
            case RIGHT:
            	x[0] = x[0] + UNIT_SIZE;
            	break;
        }
    }
//------------------------------------------------------------------------------------    
   
    private void checkFood() 
    {
        if (x[0] == foodX && y[0] == foodY) 
        {
            foodConsumed++;
            snakeLength++;
            generateFood();
            if (DELAY > 50 && foodConsumed % 5 == 0) 
            {
                timer.setDelay(DELAY = DELAY - 5);
            }
        }
    }
    
//------------------------------------------------------------------------------------
    private void checkCollision() 
    {
// HEAD COLLIDING WITH BODY//------------------------------------------------------------------------------------
        for (int i = snakeLength; i > 0; i--) 
        {
            if (x[0] == x[i] && y[0] == y[i]) 
            {
                running = false;
                break;
            }
        }
// HEAD COLLIDING WITH BORDERS//------------------------------------------------------------------------------------
        if (x[0] < 0 || x[0] > SCREEN_WIDTH - UNIT_SIZE || y[0] < 0 || y[0] > SCREEN_HEIGHT - UNIT_SIZE) 
        {
            running = false;
        }
        if (!running) 
        {
            timer.stop();
        }
    }
//------------------------------------------------------------------------------------
    
    private void gameOver(Graphics g) 
    {
// SCORE//------------------------------------------------------------------------------------
        g.setColor(Color.YELLOW);
        g.setFont(new Font("MV Boli", Font.PLAIN, 20));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        String score = "Score: " + foodConsumed;
        g.drawString(score, (SCREEN_WIDTH - metrics1.stringWidth(score)) / 2, (SCREEN_HEIGHT / 2) + g.getFont().getSize());
        // GAME OVER
        g.setColor(Color.RED);
        g.setFont(new Font("MV Boli", Font.PLAIN, 60));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        String gameOver = "GAME OVER!";
        g.drawString(gameOver, (SCREEN_WIDTH - metrics2.stringWidth(gameOver)) / 2, SCREEN_HEIGHT / 2);
    }
//------------------------------------------------------------------------------------
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (running) 
        {
            move();
            checkFood();
            checkCollision();
        }
        repaint();
    }
//------------------------------------------------------------------------------------
    
    private class MyKeyAdapter extends KeyAdapter 
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            switch (e.getKeyCode()) 
            {
                case KeyEvent.VK_LEFT:
                    if (direction != GAME4_D.RIGHT) 
                    {
                        direction = GAME4_D.LEFT;
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != GAME4_D.LEFT) 
                    {
                        direction = GAME4_D.RIGHT;
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != GAME4_D.DOWN) 
                    {
                        direction = GAME4_D.UP;
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != GAME4_D.UP) 
                    {
                        direction = GAME4_D.DOWN;
                    }
                    break;
            }
        }
    }
}