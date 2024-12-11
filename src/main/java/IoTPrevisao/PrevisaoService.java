package IoTPrevisao;

public class PrevisaoService {
    public boolean preverEnchente(double umidade, double temperatura) {
        // Lógica simples para prever enchente com base em umidade e temperatura
        if (umidade > 80 && temperatura > 30) {
            return true;  // Possibilidade de enchente
        }
        return false;
    }
}
