public class Main {
    public static void main(String[] args) {

        Endereco enderecoRestauraanteCami = new Endereco();

        Endereco enderedoRestaurantecami2 = new Endereco("12345","Endereco Restaurante Cami");
        Endereco enderedoRestauranteFulana = new Endereco("55656","Endereco Restaurante Fulana");


        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante da Cami");
        restaurante.setCnpj("000.000.00001-11");
        restaurante.setEndereco(enderedoRestaurantecami2);
        System.out.println(restaurante);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante da Fulana");
        restaurante2.setCnpj("000.000.00001-12");
        restaurante2.setEndereco(enderedoRestauranteFulana);
        System.out.println(restaurante2);


    }
}