import static java.lang.IO.*;

public class Tamagochi{

    private int fome;
    private int energia;
    private String humor;
    private String nome;

    public Tamagochi(String nome) {
        this.nome = nome;

    }
    public Tamagochi(String nome, int fome, int energia) {
        this.nome = nome;
        this.fome = fome;
        this.energia = energia;
    }


    public int getfome() {
        return fome;
    }

    public void setFome(int fome) {
        if(fome > 0 && fome <= 100){
            this.fome = fome;
        }
    }


    public int getenergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        if (energia > 0 && energia <= 100) {
            this.energia = energia;
        }
    }

    public String getHumor() {
        if (energia < 25 && fome > 75){
            return humor = "Estou triste";
        } else if (energia < 50 && fome > 50) {
            return humor =" Estou cansado";
        }else{
            return humor = "Estou feliz";
        }
    }


    public String getNome() {
        return nome;
    }

    public String bater(){
        return "pá";
    }
    public String assoprar() {
        return "fuuuuu";
    }
}
