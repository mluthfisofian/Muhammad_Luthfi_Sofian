import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor {
    public int jumlahJamurDimakan = 0;
    public int jumlahBungaDimakan = 0;

    public void act() {
        // KeyboardControls(); // Ini bisa diaktifkan jika Anda memiliki metode KeyboardControls
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseDragEnded(this)) {
            setLocation(mouse.getX(), mouse.getY());
        }
        eatBunga();
        makanJamur();
        cekSkor();
    }

    public void cekSkor() {
        if (jumlahJamurDimakan >= 3) {
            kalah alert_kalah = new kalah();
            getWorld().addObject(alert_kalah, 300, 200);
            Greenfoot.stop();
        }
        if (jumlahBungaDimakan >= 3) {
            menang alert_menang = new menang();
            getWorld().addObject(alert_menang, 300, 200);
            Greenfoot.stop();
        }
    }

    public void makanJamur() {
        Actor getJamur = getOneIntersectingObject(jamur.class); 
        if (getJamur != null) {
            getWorld().removeObject(getJamur);
            jumlahJamurDimakan++;
        }
    }

    public void eatBunga() {
        Actor getBunga = getOneIntersectingObject(bunga.class); 
        if (getBunga != null) {
            getWorld().removeObject(getBunga);
            jumlahBungaDimakan++;
        }
    }

    public void keyboardControls() {
        if (Greenfoot.isKeyDown("left")) {
            this.setImage("bee2_left.png");
            this.setLocation(this.getX() - 5, this.getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            this.setImage("bee2_right.png");
            this.setLocation(this.getX() + 5, this.getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            this.setImage("bee2_up.png");
            this.setLocation(this.getX(), this.getY() - 5);
        }
        if (Greenfoot.isKeyDown("space")) {
            
        }
    }

    public void turnAtEdge() {
        if (getX() <= 10 || getX() >= getWorld().getWidth() - 10) {
            turn(180);
        }
        if (getY() <= 10 || getY() >= getWorld().getHeight() - 10) {
            turn(180);
        }
    }
}


    

    
        
        
    

 
    



    
    

        
    
    
    

    
    
        

    
    
        
 
    
    
        

    
