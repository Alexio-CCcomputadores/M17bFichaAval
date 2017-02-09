package M17_FichaAval;

/**
 * Classe Ponto2D, para instaciar objetos (pontos).
 * @version 0.1.1, 9.fev.2017
 * @author David e Aléxio
 */

public class Ponto2D {
    /**Coordenadas*/
    private int x;
    /**  Coordenada X <br>
     */
    private int y;
    /**  Coordenada Y <br>
     */
    
    
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    /**
     * Construtor da classe não parametrizado com todos os atributos.
     * @param x ponto x
     * @param y ponto y
     */
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    /**
     * Construtor da classe parametrizado com todos os atributos.
     * @param x ponto x
     * @param y ponto y
     */
    
    public int getX() {
        return x;
    }
    /**
     * @return  da variável x
     */

    public int getY() {
        return y;
    }
    /**
     * @return  da variável y
     */
    
    public void setX(int x) {
        this.x = x;
    }
    /**
     * 
     * @param setter para a variável x 
     */

    public void setY(int y) {
        this.y = y;
    }
    /**
     * 
     * @param setter para a variável y
     */

    
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    /**
     * @return  a distancia entre 2 pontos
     */

    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
    /**
     * @return uma string composta pelos atributos da classe (x e y)
     */
    
}
