package StaticAndFinal;

import jdk.jfr.BooleanFlag;

public class Human {

    private Boolean alive;

    public Human(Boolean alive) {
        this.alive = alive;
    }

    public String breathig(){
        if(alive){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String eat(){
        return "Hunt and eat";
    }

    public String digest(){
        return "Food digested";
    }

}
