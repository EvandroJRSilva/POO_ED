package aula06.codigos.exemplos.abstratos;

public class Principal {
    public static void main(String[] args) {
        Animal cachorrinho = new Cachorro(4, "Canis", "lupus", "Bichin",
                1, 45, 120);

        Cachorro cachorro = new Cachorro(4, "Canis", "lupus", "Coitado",
                4, 45, 120);


        System.out.println(cachorrinho instanceof Animal);
        System.out.println(cachorrinho instanceof Cachorro);
        System.out.println(cachorrinho.getClass());
        cachorrinho.mover();
        cachorro.mover();
    }
}
