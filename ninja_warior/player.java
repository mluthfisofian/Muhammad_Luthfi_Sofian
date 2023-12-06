import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    int idleImageNum = 6;
    int RunImageNum = 6;
    
    String state = "idle";
    
    public string getState()
    {
        return this.state;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public player(){
    this.setImage(new GreenfootImage("/player/idle/run1.png"));
    }
    int _animationDelay = 10;
    int _animationTimer = 0;
    int _lastspriteNo = 0;
    void animate(Boolean moveForward)
    {
        if (_animationTimer<_animationDelay)
        {
            _animationTimer++;
            return;
        }
    _animationTimer++;
    String Path = "";
    switch(this.state)
    {
        case "idle": {Path ="/player/idle/"+_lastspriteNo%idleImageNum+".png";break;}
        case "walks": {path ="/player/idle/"+_lastspriteNo%+"Run1ImageNum+".png;break;}
        defailt: {path = "/player/idle/run1.png"; break;
    }
    this.setImage(new GreenfootImage(Path));
    _lastspriteNo++;
    if(moveForward)
    {
        this.setImage(new greenfootImage(path));
        return;
    }
    GreenfootImage img=new greenfootImage(path);
    img.mirorHorizontally();
    this.setImage(img);
  }

  void controlplayer()
  {
    if(Greenfoot.isKeyDown("Right"))
    {
        this.moveForward = True;
        this.state = "walks" ;
        this.setLocation(this.getX()+2,this.getY());
        return;
    }
    if(Greenfoot.isKeyDown("Left"))
    {
        this.moveForward = True;
        this.state = "walks" ;
        this.setLocation(this.getX()-2,this.getY());
        return;
    }
    this.state = "idle";
    }
  
  public void act()
  {
    controlPlayer();
    animate();
  }
  }
}

  

