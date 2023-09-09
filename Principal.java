import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        // Calcular o valor da parcela e juros de acordo com atraso; solicitar data de vencimento; solicitar data de pagamento;
        int DiaPG = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de pagamento: "));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da parcela: "));
        double valorpagar;
        if (DiaPG<=10){
            valorpagar = valor-(valor*0.10);
        }
        else{
            if(DiaPG<=20){
                valorpagar = valor+(valor*0.10);
            }
            else{
                valorpagar = valor+(valor*0.5);
               }
            }
        JOptionPane.showMessageDialog(null, "Valor a pagar: R$"+valorpagar);
        }
        
    }