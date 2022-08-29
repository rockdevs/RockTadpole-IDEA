package az.rock.ide.view.page.screen;

import az.rock.ide.view.page.lib.panel.PicPanel;
import az.rock.ide.view.page.lib.panel.TransparentPanel;
import az.rock.ide.view.ui.frame.GSplashFrame;
import az.rock.ide.view.util.ImageProvider;

import javax.swing.*;
import java.awt.*;
import java.util.stream.IntStream;

public class SplashGScreen extends GSplashFrame {
    private final Image image = ImageProvider.getImage("src/main/scala/ide/view/ui/icon/png/RR.png",new Dimension(50,50));
    private final PicPanel mainPanel = new PicPanel("src/main/scala/ide/view/ui/icon/png/splash.png");
    private JProgressBar jProgressBar = new JProgressBar();

    private final Runnable progressRunnable =  ()->{
        IntStream.range(0,100).forEach(e -> {
            try {
                Thread.sleep(30);
                this.jProgressBar.setValue(e);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
    };


    @Override
    public void postConst() {
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(this.getContextPanel(),BorderLayout.NORTH);
        this.mainPanel.add(this.getLogoPanel(),BorderLayout.SOUTH);
        this.add(this.mainPanel,BorderLayout.CENTER);
    }

    @Override
    public void initializer() {
        this.pack();
    }

    private Component getLogoPanel(){
        TransparentPanel transparentPanel = new TransparentPanel(new FlowLayout(FlowLayout.LEFT));
        final JLabel rockDevs_company = new JLabel("Copyright © 2021-2022 Rock s.r.o.");
        rockDevs_company.setFont(new Font("Helvetica", Font.PLAIN, 13));
        rockDevs_company.setForeground(Color.lightGray);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);

        jProgressBar = new JProgressBar(0,100);
        jProgressBar.setPreferredSize(new Dimension(530,3));
        jProgressBar.setValue(0);
        jProgressBar.setStringPainted(false);
        jProgressBar.setBackground(Color.white);
        jProgressBar.setForeground(Color.decode("#2980b9"));
        //rgba(52, 152, 219,1.0)

        new Thread(progressRunnable).start();

        transparentPanel.add(rockDevs_company);
        transparentPanel.add(separator);
        transparentPanel.add(jProgressBar);
        return transparentPanel;
    }



    private Component getContextPanel(){

        TransparentPanel transparentPanel = new TransparentPanel(new FlowLayout(FlowLayout.LEFT));
        final JLabel jLabelText = new JLabel("Rock IDEA");
        JSeparator sep = new JSeparator();
        final JLabel imageLabel = new JLabel(new ImageIcon(this.image));
        Dimension size = imageLabel.getPreferredSize();
        imageLabel.setBounds(10, 10, size.width, size.height);

        jLabelText.setFont(new Font("Helvetica", Font.BOLD, 45));
        jLabelText.setPreferredSize(new Dimension(300, 100));
        jLabelText.setForeground(Color.white);


        transparentPanel.add(imageLabel);
        transparentPanel.add(sep);
        transparentPanel.add(jLabelText);
        return transparentPanel;
    }

}
