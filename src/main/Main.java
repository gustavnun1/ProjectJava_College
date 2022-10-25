
package main;

import javax.swing.JOptionPane;

public class Main {
            
           
            
    public static void main(String[] args) {
            float descontoVT;
            float INSS;
            float IRRF;
            float salarioTotal;
            float escolhaBeneficio;
            
            JOptionPane.showMessageDialog(null,"Seja bem vindo ao seu holerite salarial!");
            String nomeFunc = JOptionPane.showInputDialog(null,"Primeiramente, digite aqui o seu nome: ");
            if (nomeFunc.equals("")){
                JOptionPane.showMessageDialog(null,"Ficamos felizes em te ver em nosso sistema");
                
            }else{
                JOptionPane.showMessageDialog(null,"Ficamos felizes em te ver em nosso sistema, "+nomeFunc);

            } 
            
            String salarioFunc = JOptionPane.showInputDialog(null,"Ótimo, agora nos diga, quanto é o seu salário mensal?");
            
            JOptionPane.showMessageDialog(null,"Só um momento... Ok");
            
            double salario = Double.parseDouble(salarioFunc);
            
            
            
            String vale = JOptionPane.showInputDialog(null,"Agora nos diga, você possi vale alimentação ou refeição? Responda com VA ou VR.");
            
            if(vale.equals("VA")){
                escolhaBeneficio = 1;
            }
            else if (vale.equals("VR")){
                escolhaBeneficio = 2;
            }
            else{
                JOptionPane.showMessageDialog(null,"Resposta incorreta, finalizando o programa.");
                System.exit(0);           
            }
            
            
            
            String horaExtraFunc = JOptionPane.showInputDialog(null,"Ok, agora nos diga quanto de hora extra você fez neste mês "+nomeFunc);
            
            float horaExtra = Float.parseFloat(horaExtraFunc);

            
            
            
            
            String bonusFunc = JOptionPane.showInputDialog(null,"Houve algum bonus este mês? Se sim, nos diga o valor"
                    + " por gentileza, se não, somente clique no Ok abaixo");
            
            float bonus = Float.parseFloat(bonusFunc);
           
            
            
            
            String VT = JOptionPane.showInputDialog(null,"Bom, agora nos diga, quantas passagens paga por dia para ir trabalhar?"
                    + " Obs: Quantidade, e não valor");
            
            int vtFunc = Integer.parseInt(VT);
            
            
            
            
            
            
            JOptionPane.showMessageDialog(null,"Estamos calculando seus descontos... Finalizado.");
            
            
            //------------------------------DESCONTO IRRF-------------------------------//
            if (salario <= 1.903  ){
                IRRF = 0;
                
            }else if (salario <= 2.826){
                IRRF = (float) ((salario * 7.5) / 100);
                
            }else if (salario <= 3.751){
                IRRF = (float) ((salario * 15) / 100);
                
            }else if (salario <= 4.664){
                IRRF = (float) ((salario * 22.5) / 100);
                
            }else {
                IRRF = (float) ((salario * 27.5) / 100);
    }
            
            //------------------------------DESCONTO INSS-------------------------------//
            if (salario <= 1.212){
                INSS = (float) ((salario * 7.5) / 100);;
                
            }else if (salario <= 2.427){
                INSS = (float) ((salario * 9) / 100);
                
            }else if (salario <= 3.641){
                INSS = (float) ((salario * 12) / 100);
                
            }else {
                INSS = (float) ((salario * 14) / 100);
    }
            
           //------------------------------DESCONTO VT-------------------------------//
            
            int VTLiqu = vtFunc* 22;
            
            double VTFinal = (VTLiqu * 4.40);
            
            double salarioVT = (salario * 6) /100;
            
            if (VTFinal > salarioVT){
                VTFinal = salarioVT;
            }
            
            
            
           //------------------------------DESCONTO VALE REFEIÇÃO-------------------------------// 
            
            double descontoVale;
            double salarioMin = 1.212;
            if (escolhaBeneficio = 1){
                if (salario > salarioMin){
                    descontoVale = (salario * 3) / 100;
                }else{
                    descontoVale = 0;
                }
            } else {
                
            }
            
            
           
           
    }
    
}
