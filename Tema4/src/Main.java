public class Main {
    public static void main(String[] args) {

        //PRIMERA PARTE DEL ENUNCIADO
        System.out.println("Primera parte del enunciado");

        var numerolf = 0;

        if (numerolf < 0) {
            System.out.println("negativo");
        } else {
            if (numerolf == 0) {
                System.out.println("cero");
            } else {
                System.out.println("positivo");
            }
        }

        //SEGUNDA PARTE DEL ENUNCIADO
        System.out.println("Segunda parte del enunciado");

        var numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //TERCERA PARTE DEL ENUNCIADO
        System.out.println("Tercera parte del enunciado");

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        while (numeroWhile < 3);


        //CUARTA PARTE DEL ENUNCIADO
        System.out.println("Cuarta parte del enunciado");

        var numeroFor = 0;
        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //QUINTA PARTE DEL ENUNCIADO
        System.out.println("Quinta parte del enunciado");

        var estacion = "veroño";
        switch (estacion){
            case "verano":System.out.println("Es VERANO");break;
            case "primavera":System.out.println("Es PRIMAVERA");break;
            case "otoño":System.out.println("Es OTOÑO");break;
            case "invierno":System.out.println("Es INVIERNO");break;
            default:System.out.println("NO ES UNA ESTACIÓN");}

    }
}
