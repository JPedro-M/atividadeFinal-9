package avaliaçãofinal.pkg9;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class AvaliaçãoFinal9 {
    public static void main(String[] args) {
        int contagem, valor, par;
        
        contagem = 0;
        par = 0;
        while (contagem != 10) {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor:"));
            contagem += 1;
            
            if (valor%2 == 0) {
                par += 1;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Quantidade de números pares: "+par);
    }
}
