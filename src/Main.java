import static java.lang.IO.*;
void main() {

    int fome = Integer.parseInt(readln("qual a fome do seu pet de 0/100? :"));
    int energia = Integer.parseInt(readln("qual a energia do seu pet de 0/100? :"));
    String nome = readln("digite qual o nome pet: ");

    Tamagochi pet = new Tamagochi(nome);

    pet.setEnergia(energia);
    pet.setFome(fome);

    IO.println("\no nome do seu pet é:" + pet.getNome() +" \nseu estado de fome é: " + pet.getfome()+ "\nsua energia é: " + pet.getenergia()+ "\n seu humor é: " + pet.getHumor());
}