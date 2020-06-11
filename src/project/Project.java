
package project;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Project extends JFrame{
    public Project(String title) throws HeadlessException {
        super(title);
    }
  

        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ilsayisi = 81;
        
        
        int matris [][] = {                         ///KOMŞULUK MATRİSİ.
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,191,0,69,0,0,0,0,335,0,0,0,0,0,0,0,192,0,0,0,0,207,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,87,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,207,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,187,0,163,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,112,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,169,0,0,0,0,222,0,0,0,0,0,144,0,0,0,0,0,168,0,0,0,0,0,0,0,0,0,223,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,115,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,234,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,0,0,0,0,0,0,0,214,0,0,0,0,0,0,0,0,0,0,0,0,245,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,228,0,0,0,0,0,0,0,0,0,0,143,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,92,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,131,0,0,0,0,114,0,0,0,0,0,200,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,191,0,0,0,130,0,0,0,0,0,0,0,233,0,0,0,0,0,0,0,0,0,0,0,0,0,184,0,258,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,225,0,0,75,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,122,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,130,466,0,0,0,0,0,0,0,0,322,0,0,0,0,0,311,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,374,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,226,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,161,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,116,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,126,0,0,0,0,0,0,0,0,0,0,0,0,0,0,126,0,0,0,0,0,0,0,0,0,155,0,0,99,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,151,198,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,176,0,0,0,0,0,0,0,228,0,141,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,213,0,94,0,0,0,0,0,0,0,0,0,83,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,112,0,0,0,0,0,0,0,0,0,0,99,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,141,0,144,275,177,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,111,0,0,0,0,0,0,0,0,0,0,0,0,144,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,234,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,83,0,0,0,0,0,0,96,0,0,0,0,0,0,0,0,161,0,0,0,0,0,0,135,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,191,0,0,0,0,213,0,0,0,0,0,0,233,0,0,0,0,0,0,0,291,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,114,0,0,0,0,0,0,0,0,0,0,0,0,157,0,0,0,0,0,0,0,0,0,0,134,0,0,45},
{0,0,169,0,0,0,122,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,51,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,241,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,151,94,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,132,0,177,0,0,0,0,0,0,0,0,0,0,157,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,69,0,0,0,0},
{0,0,0,0,0,0,0,0,0,198,0,0,0,0,0,0,0,0,0,0,0,216,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,187,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,130,0,0,0,0,0,0,0,233,0,0,0,0,156,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,106,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,104,0,0,0,0,0,0,193,0,0,0},
{0,0,0,0,92,0,0,0,0,0,0,0,0,0,0,0,0,156,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,172,0,266,0,0,0,0,0,0,0,0,108,0,0,0,0,166,0,0,0,0,0,0,0,0,0,0},
{0,0,222,0,0,0,0,0,126,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,208,0,0,145,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,207,0,0,0,0,0,0,0,0,0,141,0,0,0,0,0,0,0,0,0,0,153,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,249,0,0,96,0,252,0,0,0,0,0,0,0,0,0,0,0,0,0,176,0,0,0,0,0,0,0,0,100,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,216,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,62,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,144,0,0,0,0,0,0,0,0,153,0,0,267,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,98,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,136,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,275,0,0,0,0,0,0,0,0,0,0,267,0,190,0,0,295,133,0,0,0,0,0,0,0,0,0,0,0,0,0,0,363,0,0,0,0,0,0,0,0,0,0,0,0,0,248,0,0,0,131,0,0,0,0,0,0,155,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,183,0,0,0,226,0,0,0,177,0,0,0,0,0,0,0,0,0,0,0,190,0,0,0,0,0,0,0,0,0,0,0,203,0,0,0,0,0,0,0,0,0,0,0,0,266,0,0,0,259,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,125,0,0,0,0,0,233,0,0,0,0,0,0},
{0,0,144,0,0,233,0,0,0,0,83,0,0,291,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,338,78,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,193,0,0,0,0,0,0,0,0,0,0,0,0,0,0,76,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,137,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,64,125,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,295,0,0,0,0,162,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,44,0,0,0,0,0,298,0,0,136,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,133,0,0,0,162,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100,0,0,0,0,0,0,0,78,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,189,0,0,0,0,0,0,0,0},
{191,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,193,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,129,0},
{0,0,168,0,0,0,130,0,0,0,0,0,0,0,51,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,263,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{69,0,0,0,0,0,466,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,348,0,0,0,0,0,0,0,0,200,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,235,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,111,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,131,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,126,176,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,35,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,214,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,203,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,140,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,106,197,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,114,0,0,0},
{335,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,261,0,0,0,81,128,0,0,0,0,0,0,194,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,62,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,121,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,184,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,91,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,112,0,110,0,0,113,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,132,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,111,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,65,0,0,0,0},
{0,0,223,0,0,258,322,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,338,0,0,0,0,0,263,348,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,242,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,148,0,119,0,0,0,0,0,0,0,0,0,0,0},
{0,0,100,0,0,0,0,0,0,228,112,0,0,0,0,177,0,0,0,0,0,0,0,0,0,78,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,316,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,139,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,187,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,249,0,98,363,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,224,0,0,0,0,0,0,0,0,0,0,0,243,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,155,141,0,0,0,0,0,0,0,0,0,208,0,0,0,0,0,0,0,0,0,0,0,0,0,0,35,0,0,0,0,0,0,0,316,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,195,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{192,163,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,76,0,0,0,0,0,0,0,0,0,0,261,0,0,0,0,0,224,0,0,0,0,0,0,0,0,0,0,0,0,0,327,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,105,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,96,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,227,0,0,0,0,0,0,188,0,0,0,0,0,0,0,0,150,197,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,311,0,99,0,0,0,0,0,241,0,0,0,0,145,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,245,0,0,0,0,0,0,0,111,83,0,0,0,0,0,0,0,252,0,0,0,266,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,218,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,81,0,91,0,0,0,0,0,0,0,0,0,0,82,0,0,0,0,0,0,0,0,0,0,0,0,0,0,203,0,75,0,0,0,0,0,0,0,0,0,0,0,0,0},
{207,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,200,0,0,0,0,128,0,0,0,242,0,0,0,0,0,0,0,82,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,122,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,44,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,314,0,216,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,161,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,259,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,75,0,0,0,0,0,0,0,253,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,99,0,0,114,0,157,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,69},
{0,0,0,0,131,0,0,0,0,0,0,0,0,0,0,0,0,0,172,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,0,0,155,0,0,229,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,96,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,227,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,257,0,0,0,0,0,0,86,100,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,266,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,155,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,248,0,0,0,298,0,0,0,0,0,0,0,0,0,194,0,0,0,0,0,243,0,327,0,0,0,0,0,314,0,0,0,0,0,0,0,108,0,0,0,0,0,224,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,187,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0,0,131,0,0,0,0,121,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,114,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,216,0,0,229,0,0,108,0,0,0,0,0,0,0,205,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,136,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,75,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,178,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,144,0,0,0,0,0,0,0,0,0,0,136,131,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,112,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,176,0,0,0,0,0,137,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,188,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,115,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,139,0,195,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,228,0,0,0,0,0,0,0,0,161,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,257,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,357,0,0,0,0,0,0,0,0},
{0,0,0,0,200,0,0,0,0,0,0,0,0,0,0,0,0,0,108,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,112,0,0,0,0,0,0,0,0,0,203,0,0,0,0,0,0,0,224,0,205,0,0,0,0,0,0,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,157,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,87,0,0,0,100,0,0,113},
{0,0,0,0,0,225,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,110,0,148,0,0,0,0,0,0,0,75,122,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,155,125,0,0,0,78,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,253,0,0,0,0,0,0,0,178,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,374,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,235,0,0,0,0,0,0,0,0,119,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,75,0,0,0,0,0,0,0,0,0,0,0,104,166,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,113,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,135,0,0,0,0,0,0,0,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,218,0,0,0,0,0,0,86,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,189,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,0,100,0,0,0,0,0,0,0,0,357,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,87,0,0,0,0,0,0,0,0,0,0,89,0,0,0},
{0,0,0,0,0,0,0,116,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,233,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,143,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,69,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,65,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,134,0,0,0,193,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,114,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100,0,0,0,0,0,0,89,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,64,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{87,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,125,0,0,0,129,0,0,0,0,0,0,0,0,0,0,0,0,0,0,105,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,0,0,0,45,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,69,0,0,0,0,0,0,0,0,0,0,0,0,113,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                    };
        
        
         int matris_Degistir2 [] = new int [ilsayisi];
           
           for(int i=0;i<ilsayisi;i++){
               matris_Degistir2[i] = matris[40][i];
           }

           for(int i=0;i<ilsayisi;i++){
               matris[40][i] = matris[0][i];
                
           }
           for(int i=0;i<ilsayisi;i++){
               matris[0][i] =matris_Degistir2[i];
           }
           
           
           for(int i=0;i<ilsayisi;i++){
               matris_Degistir2[i] = matris[i][40];
           }
           for(int i=0;i<ilsayisi;i++){
               matris[i][40]= matris[i][0];
           }
           for(int i=0;i<ilsayisi;i++){
               matris[i][0] = matris_Degistir2[i];
           }
          
         String sehirler1[] = {"ADANA","ADIYAMAN","AFYONKARAHISAR","AGRI","AMASYA","ANKARA","ANTALYA","ARTVIN","AYDIN","BALIKESIR","BILECIK","BINGOL","BITLIS","BOLU","BURDUR","BURSA","CANAKKALE","CANKIRI","CORUM","DENIZLI","DIYARBAKIR","EDIRNE","ELAZIG","ERZINCAN","ERZURUM","ESKISEHIR","GAZIANTEP","GIRESUN","GUMUSHANE","HAKKARI","HATAY","ISPARTA","MERSIN","ISTANBUL","IZMIR","KARS","KASTAMONU","KAYSERI","KIRKLARELI","KIRSEHIR","KOCAELI","KONYA","KUTAHYA","MALATYA","MANISA","KAHRAMANMARAS","MARDIN","MUGLA","MUS","NEVSEHIR","NIGDE","ORDU","RIZE","SAKARYA","SAMSUN","SIIRT","SINOP","SIVAS","TEKIRDAG","TOKAT","TRABZON","TUNCELI","SANLIURFA","USAK","VAN","YOZGAT","ZONGULDAK","AKSARAY","BAYBURT","KARAMAN","KIRIKKALE","BATMAN","SIRNAK","BARTIN","ARDAHAN","IGDIR","YALOVA","KARABUK","KILIS","OSMANIYE","DUZCE"};  
         int kocaelineuzaklik[]={837,1087,343,1296,560,342,606,1189,573,279,136,1201,1391,151,484,132,399,384,503,528,1246,341,1095,926,1116,214,1000,817,979,1686,1028,483,830,111,453,1316,396,663,322,529,0,552,243,997,418,924,1325,671,1308,620,692,773,1028,37,623,1432,568,780,242,674,953,1057,1137,382,1524,560,219,570,1015,665,420,1346,1497,306,1297,1407,65,285,1060,924,106};

           
        String sw = sehirler1[0];
        sehirler1[0] = sehirler1[40];
        sehirler1[40] = sw;
        
        ///BURAYA KADAR KOMUSULUK MATRISI VE SEHIRLER LISTESI AYARLANDI.
        
        
       int matris2[][] = new int[ilsayisi][ilsayisi] ;
        for(int i=0;i<ilsayisi;i++){
            for(int j=0;j<ilsayisi;j++){
                matris2[i][j] = matris[i][j];
            }
        }
        
        
        ///MATRIS KOPYASI OLUSTURULDU.

       
     
        
        
        System.out.println("Kaç ile teslimat yapıcaksınız?");
        int teslimat_sayisi;
        do{
        teslimat_sayisi = sc.nextInt();
        if(teslimat_sayisi>10){
            System.out.println("10'dan fazla teslimat yapılamaz. Tekrar giriniz:");
        }
        }while(teslimat_sayisi>10);
        
        
        String Gidilecek_sehirler[] = new String[teslimat_sayisi];
        int Gidilecek_sehirler_indis[] = new int[teslimat_sayisi];
        
        sc.nextLine(); ///KULLANICIDAN İNT TİPİNDE VERİ İSTEDİKTEN SONRA STRİNG TİPİNDE VERİ İSTİCEKSEK BU KODU YAZMAMIZ GEREKİR.
        int k = 0;
        System.out.println("Sehir ismi girerken Turkce harf kullanilmamali ve tum harfler buyuk olmali.");
        for(int i=0;i<teslimat_sayisi;i++){
            System.out.println("Teslimat yapacagınız "+ (i+1) + ". şehri giriniz:");
            Gidilecek_sehirler[i] = sc.nextLine();
            int deger =0;
            do {                
            for(int j=0;j<ilsayisi;j++){
                if(Gidilecek_sehirler[i].equals(sehirler1[j])){
                    Gidilecek_sehirler_indis[k] = j;
                    k++;
                    deger=1; 
                }
            }
                if(deger ==0){
                    System.out.println("Sehir ismini yanlış girdiniz, tekrar giriniz:");
                    Gidilecek_sehirler[i] = sc.nextLine();
                    
                }    
            }while (deger==0);
        }
        String Gidilecek_sehirler1[] = new String[teslimat_sayisi];
         
        String kocaelineuzaklik1 [] = new String[teslimat_sayisi];
        for(int n=0;n<teslimat_sayisi-1;n++){
        int enb_sira =n;
        for(int i=n+1;i<teslimat_sayisi;i++){
            if(kocaelineuzaklik[Gidilecek_sehirler_indis[i]] > kocaelineuzaklik[Gidilecek_sehirler_indis[enb_sira]]){
                enb_sira =i;
                
                
            }}
        int tmp = Gidilecek_sehirler_indis[n];
        Gidilecek_sehirler_indis[n]=Gidilecek_sehirler_indis[enb_sira];
        Gidilecek_sehirler_indis[enb_sira]=tmp;
        Gidilecek_sehirler1[0] = Gidilecek_sehirler[n];
        Gidilecek_sehirler[n] = Gidilecek_sehirler[enb_sira];
        Gidilecek_sehirler[enb_sira] = Gidilecek_sehirler1[0];
        
        }
        
      
        
        
        ///GIDILECEK SEHIRLER VE INDISLERI AYARLANDI.
        
        System.out.println("\n");
        ArrayList<String> dizi_yol = new ArrayList<String>();
        
        
        
        int total = teslimat_sayisi;
        for(int i=0;i<teslimat_sayisi;i++){
        arraydöndürme(dizi_yol,Gidilecek_sehirler_indis,matris,total);
        total--;
        }
        ///ARRAYLISTE GIDILECEK YOLLAR ATILDI.
        
        
        String yol = dizi_yol.get(dizi_yol.size()-1); ///SON GELDİGİMİZ İLİN HANGİ İL OLDUGUNU BULUR.

        int sonil_indeks=0;
        for(int i=0;i<ilsayisi;i++){ ///SON GELDİGİMİZ İLİN İNDEKSİNİ BULUR.
           if(sehirler1[i].equals(yol)){
               sonil_indeks = i;
           }
        }
        
        
        
        
        
           int matris_Degistir [] = new int [ilsayisi];
           
           for(int i=0;i<ilsayisi;i++){
               matris_Degistir[i] = matris2[sonil_indeks][i];
           }

           for(int i=0;i<ilsayisi;i++){
               matris2[sonil_indeks][i] = matris2[0][i];
                
           }
           for(int i=0;i<ilsayisi;i++){
               matris2[0][i] =matris_Degistir[i];
           }
           
           
           for(int i=0;i<ilsayisi;i++){
               matris_Degistir[i] = matris2[i][sonil_indeks];
           }
           for(int i=0;i<ilsayisi;i++){
               matris2[i][sonil_indeks]= matris2[i][0];
           }
           for(int i=0;i<ilsayisi;i++){
               matris2[i][0] = matris_Degistir[i];
           }
          
        String sw2 = sehirler1[0];
        sehirler1[0] = sehirler1[sonil_indeks];
        sehirler1[sonil_indeks] = sw2;
        
        ///DONUS ICIN MATRIS VE SEHIRLER LISTESI TEKRARDAN AYARLANDI.
        
        

        int donus_indis[] = new int[1];
        donus_indis[0]=sonil_indeks;
        arraydöndürme(dizi_yol,donus_indis,matris2,1);
        
        dizi_yol.remove(dizi_yol.size()-1);
        dizi_yol.add("KOCAELI");
       
        System.out.println("GÜZERGAH:");
        System.out.println("---------\n");
         for(int i=0;i<dizi_yol.size();i++){
            System.out.println(dizi_yol.get(i));
          
        }
        System.out.println("\n");
        
       System.out.println("---------\n");
        System.out.println("Teslimat yapildi, Kocaeline geri donuldu.");
       Harita grafik = new Harita(dizi_yol);
           
       Project ekran = new Project("Turkiye Haritasi");
       ekran.setVisible(true);
       ekran.setResizable(true);   
       ekran.setSize(1841,922);
       ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       ekran.add(grafik);
        
        
    }
    
    
    
    
    
    
    
    public static int arraydöndürme(ArrayList<String> array,int array_indis[], int matris[][],int delivery_sayisi){
        String sehirler1[] = {"ADANA","ADIYAMAN","AFYONKARAHISAR","AGRI","AMASYA","ANKARA","ANTALYA","ARTVIN","AYDIN","BALIKESIR","BILECIK","BINGOL","BITLIS","BOLU","BURDUR","BURSA","CANAKKALE","CANKIRI","CORUM","DENIZLI","DIYARBAKIR","EDIRNE","ELAZIG","ERZINCAN","ERZURUM","ESKISEHIR","GAZIANTEP","GIRESUN","GUMUSHANE","HAKKARI","HATAY","ISPARTA","MERSIN","ISTANBUL","IZMIR","KARS","KASTAMONU","KAYSERI","KIRKLARELI","KIRSEHIR","KOCAELI","KONYA","KUTAHYA","MALATYA","MANISA","KAHRAMANMARAS","MARDIN","MUGLA","MUS","NEVSEHIR","NIGDE","ORDU","RIZE","SAKARYA","SAMSUN","SIIRT","SINOP","SIVAS","TEKIRDAG","TOKAT","TRABZON","TUNCELI","SANLIURFA","USAK","VAN","YOZGAT","ZONGULDAK","AKSARAY","BAYBURT","KARAMAN","KIRIKKALE","BATMAN","SIRNAK","BARTIN","ARDAHAN","IGDIR","YALOVA","KARABUK","KILIS","OSMANIYE","DUZCE"};
          
        String sw = sehirler1[0];
        sehirler1[0] = sehirler1[40];
        sehirler1[40] = sw;
        
        int ilsayisi = 81;
        int [] uzaklik = new int[ilsayisi];
        int [] gelindi = new int[ilsayisi];
        int [] eski_yol = new int[ilsayisi];
        int min;
        int sonraki = 0;
        int matris2[][] = new int[ilsayisi][ilsayisi] ;
        for(int i=0;i<ilsayisi;i++){
            for(int j=0;j<ilsayisi;j++){
                matris2[i][j] = matris[i][j];
            }
        }
       
        
        
        for(int i=0;i<ilsayisi;i++){
            gelindi[i]=0;
            eski_yol[i]=0;
            for(int j=0;j<ilsayisi;j++){
                
                if(matris[i][j]==0){
                matris[i][j] = 9999999;}
                
            }
        }
        
        uzaklik = matris[0]; 
        uzaklik[0] = 0;      ///KOCAELİDEN KOCAELİNE YOL 0
        gelindi[0] = 1;       ///KOCAELİ ZİYARET EDİLMİŞ GİBİ...
        
        for(int i=0;i<ilsayisi;i++){
            min = 9999999;
            for(int j=0;j<ilsayisi;j++){
                if( min >uzaklik[j] && gelindi[j]!=1 ){
                
                    min = uzaklik[j];
                    sonraki = j;
                }
                
            }
            gelindi[sonraki] = 1;
          
            
            for(int c = 0;c<ilsayisi;c++){
                if(gelindi[c] != 1){
                    if(min+matris[sonraki][c]<uzaklik[c]){
                        uzaklik[c] = min+matris[sonraki][c];
                        eski_yol[c] = sonraki;
                       
                    }
                }
            }
            
        }
        int teslimat_sayisi = delivery_sayisi;
        int yol_indisi=0;
        int minimum_uzaklık =9999999;
        
        
        
        
     
        
        for(int i=0;i<teslimat_sayisi;i++){

            if(minimum_uzaklık >uzaklik[array_indis[i]] ){
                minimum_uzaklık =uzaklik[array_indis[i]];
                yol_indisi =array_indis[i];
                
            }  
            if(teslimat_sayisi == 1){
                yol_indisi =array_indis[0];              
               
                break;
            }
        }
  
        
         
            int j= yol_indisi;
         

          
           ArrayList<String> arrayi_duzeltme = new ArrayList<String>();
            
            while(j!=0){
                j = eski_yol[j];

                if(j==0){
                    break;
                }
               
                 arrayi_duzeltme.add(sehirler1[j]);
                
            } 
            int duzeltme =arrayi_duzeltme.size();
            for(;duzeltme>0;duzeltme--){
                array.add(arrayi_duzeltme.get(duzeltme-1));
            }
   
          
           

        array.add(sehirler1[yol_indisi]);
          

        String sw2 = sehirler1[0];
        sehirler1[0] = sehirler1[yol_indisi];
        sehirler1[yol_indisi] = sw2;
          
            
           
           if(delivery_sayisi>0){
           int matris_Degistir [] = new int [ilsayisi];
           int matris2_0 [] = new int [ilsayisi];
           matris2_0 = matris2[0];
           for(int i=0;i<ilsayisi;i++){
               matris_Degistir[i] = matris2[yol_indisi][i];
           }

           for(int i=0;i<ilsayisi;i++){
               matris2[yol_indisi][i] = matris2_0[i];
                
           }
           for(int i=0;i<ilsayisi;i++){
               matris2[0][i] =matris_Degistir[i];
           }
           
           
           for(int i=0;i<ilsayisi;i++){
               matris_Degistir[i] = matris2[i][yol_indisi];
           }
           for(int i=0;i<ilsayisi;i++){
               matris2[i][yol_indisi]= matris2[i][0];
           }
           for(int i=0;i<ilsayisi;i++){
               matris2[i][0] = matris_Degistir[i];
           }
           
           
          
           
            for(int i=0;i<ilsayisi;i++){
                for(int s=0;s<ilsayisi;s++){
                    matris[i][s] = matris2[i][s];
                }
            }
               

          }
      

  
        return 0;
        
    }

    
    
    }


    

    
