package IoTPrevisao;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos objetos necessários
        SensorIoT sensor = new SensorIoT();
        PrevisaoService previsao = new PrevisaoService();

        // Coletando dados do sensor IoT
        double temperatura = sensor.getTemperatura();
        double umidade = sensor.getUmidade();

        // Imprimindo as previsões
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Umidade: " + umidade + "%");

        if (previsao.preverEnchente(umidade, temperatura)) {
            System.out.println("Atenção: Possibilidade de enchente.");
        } else {
            System.out.println("Sem risco de enchente.");
        }
    }
}
