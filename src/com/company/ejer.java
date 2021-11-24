import javax.swing.JOptionPane;

public class ejer {
    public static void main(String[] args){
        int num,total = 0;

        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero: "));
            total = num + total;
        }
        while(num !=0);
        JOptionPane.showMessageDialog(null, "Pusiste un cero."
                + "\n La suma de todos los numeros que pusiste fue: "+total);
    }
}