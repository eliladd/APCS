import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Image;

import java.awt.image.BufferedImage;
public class Card {
    private String suit;

    private int rank;
    private String name;
    public Card(String suit, String name, int rank){
        this.suit = suit;
        this.rank = rank;
        this.name = name;
        
    }
    public String getSuit(){
        return suit;
    }
    public int getRank(){
        return rank;
    }
    public String getName(){
        return name;
    }

}