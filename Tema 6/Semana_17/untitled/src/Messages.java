public class Messages {

    public final String header = """
                ________   ______           __          ____     __                __ __     \s
               / ____/ /  / ____/___  _____/ /____     /  _/____/ /___ _____  ____/ //_/ _____
              / __/ / /  / /   / __ \\/ ___/ __/ _ \\    / // ___/ / __ `/ __ \\/ __  / _ \\/ ___/
             / /___/ /  / /___/ /_/ / /  / /_/  __/  _/ /(__  ) / /_/ / / / / /_/ /  __(__  )\s
            /_____/_/   \\____/\\____/_/   \\__/\\___/  /___/____/_/\\__,_/_/ /_/\\__,_/\\___/____/\s""";

    public final String welcome = "Bienvenido/a a nuestra tienda, El Corte Islandés (nombre pendiente de revisión...).";
    public final String emptyCardListError = "ERROR - No existen tarjetas en el sistema.";
    public void showHeader(){
        System.out.println(header);
        System.out.println(welcome);
        System.out.println();

    }

    public void showMenu(){
        System.out.println("Por favor elija una de las opciones de la lista: ");
        System.out.println("1.- Crear nueva tarjeta regalo.");
        System.out.println("2.- Utilizar saldo en tarjeta.");
        System.out.println("3.- Añadir saldo a tarjeta existente.");
        System.out.println("4.- Combinar tarjetas.");
        System.out.println("5.- Mostrar tarjetas existentes.");
        System.out.println("6.- Salir del programa.");
        System.out.print("\nSu elección: ");
    }
}

