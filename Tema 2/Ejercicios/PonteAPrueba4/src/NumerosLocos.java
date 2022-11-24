public class NumerosLocos {

    public static void main(String[] args) {
        byte randomByte = 127;
        short randomShort = 32767;
        int randomInt = (int) (Math.pow(2,31)-1);
        long randomLong = (long)(Math.pow(2,63)-1);
        System.out.println("Un número aleatorio tipo byte: " + ((byte)(Math.random()*-128) +(byte)(Math.random()*randomByte)));
        System.out.println("Un número aleatorio tipo byte: " + ((short)(Math.random()*-32767) +(short)(Math.random()*randomShort)));
        System.out.println("Un número aleatorio tipo byte: " + ((int)(Math.random()*(-1*(Math.pow(2,31))) +(int)(Math.random()*randomInt))));
        System.out.println("Un número aleatorio tipo byte: " + ((long)(-1*(Math.pow(2,63)*Math.random()) + (long)(Math.random()*randomLong))));

    }
}