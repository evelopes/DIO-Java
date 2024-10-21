public class qualOTamanho {
    public static void main(String [] args){
        String tamanho = "p";
        switch(tamanho){
            case "p" :{
                System.out.println("Pequeno");
                break;
            }
            case "m": {
                System.out.println("Médio");
            }
            case "g": {
                System.out.println("Grande");
            }
            default: {
                System.out.println("Tamanho não encontrado");
            }
        }
    }
}
