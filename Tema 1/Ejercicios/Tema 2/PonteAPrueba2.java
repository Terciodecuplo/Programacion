import java.util.Scanner;

public class PonteAPrueba2 {
    public static void main(String[] args){
        System.out.println("Elige un mes (de 1 a 12) y yo te diré cuántos días tiene.");
        int mesElegido = getMesElegido();
        muestraMesElegido(mesElegido);

    }
    private static int getMesElegido() {
        Scanner in = new Scanner(System.in);
        int datoMes;
        do {
            System.out.print("Tu elección: ");
            datoMes = in.nextInt();
            if (datoMes < 1 || datoMes > 12) {
                System.out.println("El dato introducido es incorrecto. Por favor seleccione un número del 1 al 12.");
            }

        } while (datoMes < 1 || datoMes > 12);
        datoMes-=1;
        return datoMes;
    }

    private static void muestraMesElegido(int mesElegido){


        for (listaMes mes:listaMes.values()){
            if(mes.ordinal()==mesElegido){
                System.out.println("El mes que has elegido es " + mes.getNombreMes() + " y tiene " + mes.getDiasMes() + " días.");
            }
        }


    }

    public enum listaMes {
        ENERO("enero",31), FEBRERO("febrero",28),MARZO("marzo",31),
            ABRIL("abril",30),MAYO("mayo",31),JUNIO("junio", 30),
            JULIO("julio",31),AGOSTO("agosto",31),
            SEPTIEMBRE("septiembre", 30), OCTUBRE("octubre",31),
            NOVIEMBRE("noviembre",30),DICIEMBRE("diciembre",31);

        private int diasMes;
        private String nombreMes;
        private listaMes(String nombreMes, int diasMes){
            this.nombreMes = nombreMes;
            this.diasMes = diasMes;
        }

        public int getDiasMes(){
            return diasMes;
        }

        public String getNombreMes(){
            return nombreMes;
        }
    }
}
