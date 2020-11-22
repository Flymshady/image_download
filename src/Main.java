import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main extends JFrame {


    public Main(){
        super("Image download");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);

    }

    public static void main(String[] args) throws IOException {
        Main wndw = new Main();

        JTextArea text = new JTextArea("Running");
        JScrollPane scroll = new JScrollPane (text,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        wndw.add(scroll);
        wndw.setVisible(true);

            try {

                while (true) {


                    down_italie();
                    down_bar_d_c();
                    down_bar_z_c();
                    down_polska();
                    down_praz_d_c();
                    down_praz_z_c();
                    String timeStamp = new SimpleDateFormat("dd_MM_HH_mm_ss").format(Calendar.getInstance().getTime());
                    text.setText(text.getText() + System.lineSeparator() + "Done   " + timeStamp);
                    Thread.sleep(5 * 60 * 1000); //5*60 secs
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    public static void down_italie() throws IOException {
        String timeStamp = new SimpleDateFormat("dd_MM_HH_mm_ss").format(Calendar.getInstance().getTime());
        URL url = new URL("http://kamery.lwq.cz/jpg/italie.jpg");
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1!=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        byte[] response = out.toByteArray();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Počítač\\Desktop\\SMAP\\italie\\italie_"+timeStamp+".jpg");
        //FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\Desktop\\ŠKOLA\\SMAP\\DATA\\italie\\italie_"+timeStamp+".jpg");
        fos.write(response);
        fos.close();
    }
    public static void down_bar_d_c() throws IOException {
        String timeStamp = new SimpleDateFormat("dd_MM_HH_mm_ss").format(Calendar.getInstance().getTime());
        URL url = new URL("http://kamery.lwq.cz/jpg/barton-vysokov.jpg");
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1!=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        byte[] response = out.toByteArray();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Počítač\\Desktop\\SMAP\\barton_do_centra\\bar_d_c_"+timeStamp+".jpg");
       // FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\Desktop\\ŠKOLA\\SMAP\\DATA\\barton_do_centra\\bar_d_c_"+timeStamp+".jpg");
        fos.write(response);
        fos.close();
    }

    public static void down_bar_z_c() throws IOException {
        String timeStamp = new SimpleDateFormat("dd_MM_HH_mm_ss").format(Calendar.getInstance().getTime());
        URL url = new URL("http://kamery.lwq.cz/jpg/barton-centrum.jpg");
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1!=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        byte[] response = out.toByteArray();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Počítač\\Desktop\\SMAP\\barton_z_centra\\bar_z_c_"+timeStamp+".jpg");
       // FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\Desktop\\ŠKOLA\\SMAP\\DATA\\barton_z_centra\\bar_z_c_"+timeStamp+".jpg");
        fos.write(response);
        fos.close();
    }

    public static void down_polska() throws IOException {
        String timeStamp = new SimpleDateFormat("dd_MM_HH_mm_ss").format(Calendar.getInstance().getTime());
        URL url = new URL("http://kamery.lwq.cz/jpg/polska.jpg");
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1!=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        byte[] response = out.toByteArray();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Počítač\\Desktop\\SMAP\\polska\\polska_"+timeStamp+".jpg");
      //  FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\Desktop\\ŠKOLA\\SMAP\\DATA\\polska\\polska_"+timeStamp+".jpg");
        fos.write(response);
        fos.close();
    }

    public static void down_praz_d_c() throws IOException {
        String timeStamp = new SimpleDateFormat("dd_MM_HH_mm_ss").format(Calendar.getInstance().getTime());
        URL url = new URL("http://kamery.lwq.cz/jpg/slavia.jpg");
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1!=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        byte[] response = out.toByteArray();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Počítač\\Desktop\\SMAP\\prazska_do_centra\\praz_d_c_"+timeStamp+".jpg");
        //FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\Desktop\\ŠKOLA\\SMAP\\DATA\\prazska_do_centra\\praz_d_c_"+timeStamp+".jpg");
        fos.write(response);
        fos.close();
    }

    public static void down_praz_z_c() throws IOException {
        String timeStamp = new SimpleDateFormat("dd_MM_HH_mm_ss").format(Calendar.getInstance().getTime());
        URL url = new URL("http://kamery.lwq.cz/jpg/barton.jpg");
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1!=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        byte[] response = out.toByteArray();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Počítač\\Desktop\\SMAP\\prazska_z_centra\\praz_z_c_"+timeStamp+".jpg");
        //FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\Desktop\\ŠKOLA\\SMAP\\DATA\\prazska_z_centra\\praz_z_c_"+timeStamp+".jpg");
        fos.write(response);
        fos.close();
    }



}
