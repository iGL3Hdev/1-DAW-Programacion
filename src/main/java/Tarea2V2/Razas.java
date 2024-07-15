
package Tarea2V2;


public enum Razas{
    
    Mastin(0), Terrier(1), Bulldog(2), Pekines(3), Caniche(4), Galgo(6);
    
    private int index;
    
    private Razas(int index){
        this.index = index;
    }
        
        public int getIndex(){
            return this.index;
        }
    }