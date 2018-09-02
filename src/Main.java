import javax.swing.*;

public class Main {
    public static void main(String[] a){

        int ans = JOptionPane.showConfirmDialog(null,"do you love me?","title",JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"i luv u");
        } else{
            JOptionPane.showMessageDialog(null,"i hate u");
        }
    }
}
