package project;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JPanel;

public class Harita extends JPanel{
    private JPanel contentPane;
    public ArrayList<String> cities;
    public Harita(ArrayList<String> c){
        cities = new ArrayList<String>();
        for (int i = 0; i < c.size(); i++) {
            cities.add(c.get(i));
        }
        setBackground(Color.black);
    
}
    private BufferedImage image;
    
    public void paint(Graphics g) {
        super.paint(g); 
      Graphics2D g2d = (Graphics2D) g;
      g2d.setStroke(new BasicStroke(3));
     


    String sehirler1[] = {"ADANA","ADIYAMAN","AFYONKARAHISAR","AGRI","AMASYA","ANKARA","ANTALYA","ARTVIN","AYDIN","BALIKESIR","BILECIK","BINGOL","BITLIS","BOLU","BURDUR","BURSA","CANAKKALE","CANKIRI","CORUM","DENIZLI","DIYARBAKIR","EDIRNE","ELAZIG","ERZINCAN","ERZURUM","ESKISEHIR","GAZIANTEP","GIRESUN","GUMUSHANE","HAKKARI","HATAY","ISPARTA","MERSIN","ISTANBUL","IZMIR","KARS","KASTAMONU","KAYSERI","KIRKLARELI","KIRSEHIR","KOCAELI","KONYA","KUTAHYA","MALATYA","MANISA","KAHRAMANMARAS","MARDIN","MUGLA","MUS","NEVSEHIR","NIGDE","ORDU","RIZE","SAKARYA","SAMSUN","SIIRT","SINOP","SIVAS","TEKIRDAG","TOKAT","TRABZON","TUNCELI","SANLIURFA","USAK","VAN","YOZGAT","ZONGULDAK","AKSARAY","BAYBURT","KARAMAN","KIRIKKALE","BATMAN","SIRNAK","BARTIN","ARDAHAN","IGDIR","YALOVA","KARABUK","KILIS","OSMANIYE","DUZCE"};
    int sehirler_x[] ={915,1200,459,1637,957,670,461,1503,193,213,411,1403,1562,566,428,327,82,752,875,313,1386,110,1281,1302,1468,460,1117,1198,1294,1734,1000,453,852,325,130,1630,765,928,170,803,412,644,408,1201,160,1075,1447,238,1505,855,853,1147,1385,454,1000,1554,893,1070,188,1025,1311,1313,1257,348,1686,861,588,790,1368,716,745,1477,1611,636,1588,1728,347,665,1095,1008,523};
    int sehirler_y[] ={657,555,435,282,211,290,662,118,532,315,265,406,452,198,562,255,245,220,225,550,525,60,439,308,275,312,642,175,221,537,752,555,678,150,454,174,125,445,58,396,187,551,353,485,435,580,597,614,419,460,538,170,149,188,135,512,46,318,149,250,157,385,627,441,428,315,115,490,241,628,314,525,558,91,120,250,203,148,687,650,188};
    ArrayList<Integer> dizi_indis = new ArrayList<Integer>();
    for(int i=0;i<this.cities.size();i++){
        for(int k=0;k<81;k++){
           if(this.cities.get(i).equals(sehirler1[k])){
               dizi_indis.add(k);
           } 
        }
    }

    
       
        try {
            image = ImageIO.read(new FileImageInputStream(new File("HARITA.png")));
            } catch (IOException ex) {
            Logger.getLogger(Harita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        g.drawImage(image, 0,0,this);
        g.setColor(Color.RED);
        
        g.drawLine(sehirler_x[40], sehirler_y[40],sehirler_x[dizi_indis.get(0)],sehirler_y[dizi_indis.get(0)]);
        
        for(int i=0;i<dizi_indis.size()-1;i++){
        g.drawLine(sehirler_x[dizi_indis.get(i)],sehirler_y[dizi_indis.get(i)],sehirler_x[dizi_indis.get(i+1)],sehirler_y[dizi_indis.get(i+1)] );
        }
    
              
      contentPane = new JPanel();
      
              
              
    }


 
        
   }
    
    
    
///}
