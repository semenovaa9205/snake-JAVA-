/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrey
 */
import javax.swing.*;
import java.awt.*;

public class gamefield extends JPanel {
    private final int size=320;
    private final int dot_size=16;
    private final int all_dots=400;
    private Image dot;
    private Image apple;
    private int applex;
    private int appley;
    private int[]xmas= new int[all_dots];
    private int[]ymas=new int[all_dots];
    private int dots;
    private Timer timer;
    private boolean left=false;
    private boolean right=true;
    private boolean up=false;
    private boolean down=false;
    private boolean ingame=true;
      



    
    
    
    
    public gamefield(){
        setBackground(Color.white);
        loadimages();
    }
    public void loadimages(){
        ImageIcon objapple=new ImageIcon("apple.png");
        apple=objapple.getImage();
        
    }
    public void initGame(){
        dots=3;
        for (int i = 0; i < dots; i++) {
            x   
        }
    } 
}
