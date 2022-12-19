import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Font;
public class JMenuTest extends JFrame
{
    private static final long serialVersionUID = 1L;

    public JMenuTest()
    {
        super("Системное меню");
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        JMenuBar menuBar = new JMenuBar();

        menuBar.add(createFileMenu());
        menuBar.add(createViewMenu());

        setJMenuBar(menuBar);



        setSize(300, 200);
        setVisible(true);
    }

    private JMenu createFileMenu()
    {

        JMenu file = new JMenu("СТРАНЫ");

        JMenuItem open1 = new JMenuItem("АВСТРАЛИЯ",
                new ImageIcon(""));
        JMenuItem open2 = new JMenuItem("КИТАЙ",
                new ImageIcon(""));
        JMenuItem open3 = new JMenuItem("АНГЛИЯ",
                new ImageIcon(""));
        JMenuItem open4 = new JMenuItem("РОССИЯ",
                new ImageIcon(""));

        JMenuItem exit = new JMenuItem(new ExitAction());

        exit.setIcon(new ImageIcon(""));

        file.add(open1);
        file.add(open2);
        file.add(open3);
        file.add(open4);

        file.addSeparator();
        file.add(exit);

        open1.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                JTextArea area2 = new JTextArea(150, 100);

                area2.setText("Австралия — государство в Южном полушарии, расположенное на одноимённом материке, а также близлежащих островах Тихого и Индийского океанов. При описании Австралии люди часто говорят об уникальности того или иного факта. Даже само расположение этой страны уникально — Австралия единственное в мире государство, занимающее территорию всего материка. Самый крупный остров Тасмания лежит к югу от континента. Официальное название страны — Австралийский союз. Животный мир и растительный мир Австралии настолько удивителен, что оставит у вас незабываемые впечатления!");

                area2.setLineWrap(true);
                area2.setWrapStyleWord(true);


                JPanel contents = new JPanel();

                contents.add(new JScrollPane(area2));
                setContentPane(contents);
                System.out.println ("ActionListener.actionPerformed : open");
            }
        });
        open2.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                JTextArea area2 = new JTextArea(150, 100);

                area2.setText("Китай или Чжун Го (Zhōngguó), как его называют сами китайцы, является одной из самых удивительных и загадочных стран мира. Родина бумаги и книгопечатания, пороха и компаса, шелка, фарфора и многих других полезных изобретений и открытий, он неизменно приковывает к себе внимание историков, исследователей, путешественников. Расположенный на юго-востоке азиатского континента и своими очертаниями напоминающий парящую в небе огромную птицу, современный Китай – наследник великой цивилизации, летопись которой насчитывает около пяти тысячелетий.");
                // Параметры переноса слов
                area2.setLineWrap(true);
                area2.setWrapStyleWord(true);

                // Добавим поля в окно
                JPanel contents = new JPanel();

                contents.add(new JScrollPane(area2));
                setContentPane(contents);
                System.out.println ("ActionListener.actionPerformed : open");
            }
        });
        open3.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                JTextArea area2 = new JTextArea(150, 100);

                area2.setText("Великобритания — небольшое государство на северо-западе Европы. Полное название страны — Соединённое Королевство Великобритании и Северной Ирландии. Всего за сутки можно проехать 1440 км, отделяющих мыс Лендс-Энд на юго-западном побережье Корнуолла от городка Джон-о'Гротс на северо-востоке Шотландии. Однако это небольшая группа островов к северо-западу от Европы оказала огромное влияние на развитие мировой культуры. И сейчас, несмотря на свой размер, Великобритания — одно из авторитетнейших государств в мире, ядерная держава, постоянный член Совета Безопасности ООН. Наследница Британской империи, крупнейшей в истории, и существовавшей в XIX — начале XX веков.");

                area2.setLineWrap(true);
                area2.setWrapStyleWord(true);


                JPanel contents = new JPanel();

                contents.add(new JScrollPane(area2));
                setContentPane(contents);
                System.out.println ("ActionListener.actionPerformed : open");
            }
        });
        open4.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                JTextArea area2 = new JTextArea(150, 100);

                area2.setText("Российская Федерация — крупнейшее в мире государство, занимающее 1/8 часть суши и расположенное на северо-востоке Евразии. Россия — страна с многовековой историей, богатым культурным наследием и щедрой природой. В России можно найти почти всё то, что встречает путешественник по отдельности в той или иной стране — солнечные пляжи субтропиков и снежные горные вершины, бескрайние степи и глухие леса, бурные реки и тёплые моря.\n" +
                        "\n" +
                        "© Яндекс Условия использования\n" +
                        "Создать свою карту\n");

                area2.setLineWrap(true);
                area2.setWrapStyleWord(true);


                JPanel contents = new JPanel();

                contents.add(new JScrollPane(area2));
                setContentPane(contents);
                System.out.println ("ActionListener.actionPerformed : open");
            }
        });
        return file;
    }

    private JMenu createViewMenu()
    {

        JMenu viewMenu = new JMenu();

        return viewMenu;
    }

    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");

        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {


        new JMenuTest();
    }
}