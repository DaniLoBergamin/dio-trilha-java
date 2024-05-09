public class FormatadorCepExcepition {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        }catch (CepInvalidoException e){
            System.out.println("O CEP não corresponde com as regras");
        }
    }
static String formatarCep (String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        // Similando um CEP formatado
        return "23.765-064";
    }
}
