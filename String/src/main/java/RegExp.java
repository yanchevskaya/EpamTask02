import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lisica on 25.01.2017.
 */
public class RegExp {

  public static String g = "На главную\n" +
                "Новая фундаментальная физика (Статья А.Н. Ховалкина)\n" +
                "Природа гравитационных, электромагнитных, сильных, слабых и коллапсарных взаимодействий – электрическая.\n" +
                "Предсказания\n" +
                "Мнения ученых\n" +
                "Новости о конце света\n" +
                "Природные катаклизмы\n" +
                "СМИ и киноиндустрия\n" +
                "Видео\n" +
                "Мнения\n" +
                "О конце света\n" +
                "Мнения ученых » Новая фундаментальная физика (Статья А.Н. Ховалкина)\n" +
                "\n" +
                "\n" +
                "Экстренное сообщение учёным мирового научного сообщества о революционном открытии в науке. Крах электронной теории. Великое объединение взаимодействий свершилось. Природа гравитационных, электромагнитных, сильных, слабых и коллапсарных взаимодействий – электрическая.\n" +
                "\n" +
                "Многоуважаемые учёные!\n" +
                "Написана книга «Новая фундаментальная физика», под условным названием «Истина коллапсара-семёрки». В настоящей статье приведены причины краха электронной теории и доказательства объединения всех взаимодействий.\n" +
                " \n" +
                "В коллапсарах-семёрках рождаются гравитациоонные, электромагнитные, сильные, слабые и коллапсарные взаимодействия, природа всех взаимодействий едина – электрическая. Мощные неэлектростатические заряды (спин) элементарных колапсаров создают силовую структуру ядер атомов и ядер молекул. Геометрическая форма взаимодействия «семёркой» разнополярных зарядов на носителях электричества в силовой структуре коллапсара-семёрки, неопровержимо доказывает существование разнополярных частиц вещества – эфира Космоса. Разнополярные частицы вещества (эфира) не рождаются, всегда существовали и всегда будут существовать в Космосе. Полную электронную версию книги «Новая фундаментальная физика» и статьи можно получить по адресу: khovalkin.alexander@yandex.ru Скайп Aleksandr181949 Телефон 89263043052.\n" +
                "Предлагаю учёным изучить неоспоримые доказательства рождения новой физики, в статье дано описание структуры ядер атомов, атомов и, конкректно ядер атомов  углерода (12С) в структурах графита, фуллерена, алмаза, графена, в неорганических и органических молекулах. Изучите описание неэлектростатических зарядов (спина) в силовой структуре чешуек графита, магнетонные силы притяжения между чешйками графита в структуре алмаза, истинную структуру нанотрубок и трубок фуллерена. Предлагаю учёным, научным коллективам активно участвовать в дальнейшей разработке новой единой концепции физического мироустройства. Новое описание истинной структуры ядра атома углерода основано на универсальных свойствах коллапсаров-нуклонов в силовых структурах трёх альф, расположенных в ядерной трубке атома углерода с взаимным относительным смещением на 60 (рис. 8). Нейтроны и протоны в ядрах атомов – это коллапсары, привожу веские доказательства моего утверждения. Почему нейтроны (протоны) необходимо называть коллапсарами?\n" +
                "Из геометрии известно, в окружность можно вписать семь малых равных окружностей, одна располагается в центре. Поместим вместо окружностей на рисунке 1, разнополярные частицы субстанции (разнополярные частицы вещества электромагнитного поля) и увидим истинную структуру первичного коллапсара.\n" +
                "Рис. 1   Слева, на рисунке 1 показаны силы притяжения (коллапс) между разнополярными зарядами частиц субстанции (частицами вещества электромагнитного поля), силы противодействующие бесконечному сжатию (коллапсу) показаны на рисунке справа. В центре (Рис. 1) показано равновесие сил сжатия и сил противодействующих бесконечному сжатию в геометрической семёрке – коллапсаре. Расстояния между разнополярными зарядами в коллапсаре (Рис. 1) меньше расстояний между однополярными зарядами частиц субстанции и поэтому силы противодействия сжатию между однополярными зарядами разрешают коллапс, но запрещают бесконечное сжатие (описание дано в книге).\n" +
                "Особым свойством в коллапсарах обладает 7 (седьмой), нечётный заряд, в центре семёрки. Шесть зарядов, три положительных и три отрицательных заряда, расположенных в кольце семёрки (рис. 1), взаимно нейтрализованы. Седьмой, нечётный заряд, не может взаимно нейтрализоваться во внутренней структуре, поэтому проявляется как элементарный кулоновский заряд. На рисунке 1 показан принцип созидательных сил в одной семёрке коллапсара, первичный гамма-коллапсар состоит из двух семёрок (рис. 2).\n" +
                "Рис. 2  Гамма-коллапсар. Состоит из двух семёрок, знаки полярности в «звёздах и треугольниках» семёрок имеют противоположное значение. На рисунке 2 показано взаимное расположение однополярных элементарных зарядов в треугольнике и в звезде. Элементарные кулоновские заряды в двух семёрках гамма-коллапсара силами взаимного притяжения создают линейную структуру в семи элементарных трубках. Почему? Силы взаимного притяжения и отталкивания между разнополярными и однополярными кулоновскими зарядами существуют не только в плоскости семёрок (Рис. 2), но и между семёрками. В современной фундаментальной физике первичный гамма-коллапсар (Рис. 2) ошибочно принимают за гамма-квант и считают подобным гамма-кванту оптического диапазона. Потоки гамма-коллапсаров (Рис. 2) индуцируют жёсткое электромагнитное излучение, гамма-коллапсары обладают наибольшей проникающей способностью. Почему? Коллапсар-электрон (Рис. 3)  построен из гамма-коллапсаров (Рис. 2)! На рисунке 3 показана принципиальная структура коллапсара-электрона. Гамма-коллапсары – это первичные строительные «кирпичики» из которых построены электроны, а из электронов – нуклоны.\n" +
                "\n" +
                "Рис. 3  Коллапс (сжатие) гамма-коллапсаров в электроне (коллапс коллапсаров). \n" +
                "\n" +
                "Уважаемые учёные, сколько элементарных (кулоновских) зарядов, элементарных спиновых (сторонних) неэлектростатических зарядов, элементарных нейтрино и гамма-коллапсаров находятся в структуре коллапсара-электрона (коллапсара-позитрона)?\n" +
                " \n" +
                "В электроне (позитроне) гамма-коллапсары образуют семь гамма-трубок (Рис. 3), в каждой из семи гамма-трубок по семь элементарных трубок, всего в электроне (позитроне) 49 элементарных трубок, сорок девятая трубка расположена в центре. Последовательное электрическое взаимодействие элементарных (кулоновских) зарядов противоположного знака полярности в коллапсарах называется элементарными трубками.\n" +
                "Один положительный и один отрицательный элементарные (кулоновские) заряды совместно создают элементарный спиновой (сторонний) неэлектростатический заряд в семи элементарных трубках гамма-коллапсаров (Рис. 2). Элементарные трубки электронов построены из элементарных трубок в гамма-коллапсарах; элементарные трубки нуклонов состоят из элементарных трубок в электронах (позитронах).  \n" +
                "Элементарные трубки электронов (позитронов) построены из элементарных трубок гамма-коллапсаров, расположенных последовательно в семи гамма-трубках электрона. Следовательно суммарный неэлектростатический заряд на концах всех элементарных трубок электронов (позитронов) равен сумме элементарных спиновых зарядов всех гамма-коллапсаров, расположенных в гамма-трубках. В элементарных трубках гамма-коллапсаров (Рис. 2) находятся два элеметарных (кулоновских) заряда противоположного знака, обладающих совместно элементарным спиновым (неэлектростатическим) зарядом.\n" +
                "В электроне (позитроне) последовательное расположение гамма-коллапсаров в семи гамма-трубках (Рис. 3) создаёт суммарный электрический заряд в 49 элементарных трубках электрона (Рис. 3). Электрические потенциалы 48 (сорока восьми) элементарных трубок электронов (позитронов) взаимно нейтрализованы в змеевидной (бесконечной) замкнутой электрической цепи нейтрализации. Электрический потенциал 49 (сорок девятой) элементарной трубки, расположенной в осевом центре электрона (позитрона) разделён и, поэтому индуцирует неэлектростатический – спиновой (сторонний) электрический заряд и элементарный (кулоновский) заряд электрона (позитрона). Подробное описание природы происхождения спина, неэлектростатических зарядов, электростатических (кулоновских) элементарных зарядов, дано в книге «Новая фундаментальная физика».   \n" +
                " \n" +
                " Гамма-коллапсары, коллапсары-электроны (коллапсары-позитроны) и коллапсары-нуклоны – это элементарные коллапсары (описание элементарных и индуцированных коллапсаров дано в книге). Название «элементарные коллапсары» – в точном значении этого термина – первичные неделимые материальные системы, но в реальности коллапсары «состоят из...». Гамма-коллапсары состоят из элементарных нейтрино, коллапсары-электроны (позитроны) состоят из гамма-коллапсаров и следовательно, также из элеметарных нейтрино, коллапсары-нуклоны разложимы на структурные части и состоят из коллапсаров-электронов. Использование названия «элементарные коллапсары» в «Новой фундаментальной физике» отражает структурную сущность коллапсаров и древнюю идею о первосущностях, определяющих свойства физического мира. Элементарные коллапсары состоят из элементарных скоплений вещества, обладающих элементарными (кулоновскими) зарядами противоположного знака в структурах элементарных нейтрино. Обращаюсь к уважаемым учёным, работающим в научных центрах на коллайдерах! Не ищите слепо «частицу бога», используйте истинное структурное описание элементарных коллапсаров, элементарных и абсолютных нейтрино в книге «Новая фундаментальная физика». Новая революционная парадигма физической теории, под условным названием «Истина коллапсара», раскрывает полную концепцию физического мироустройства и содержит важнейшие научные открытия в истории человечества.\n" +
                " \n" +
                " Коллапс (сжатие) коллапсаров-электронов (позитронов) рождает коллапсар-нейтрон (протон), на рисунке 4 показана принципиальная структура сжатия коллапсаров-электронов и коллапсаров-позитронов в коллапсаре-нейтроне. На рисунке 4 показаны 49 (сорок девять) электрон-позитронных (мезонных) трубок, в семи пионных трубках нейтрона. Каждая электрон-позитронная (мезонная) трубка нейтрона состоит из 38 последовательно расположенных электронов и позитронов в 19 электрон-позитронных нейтрино.  Всего в коллапсаре-нейтроне находятся  (49 × 38 = 1862) коллапсара-электрона и позитрона в 931 электрон-позитронном нейтрино.\n" +
                "\n" +
                "Рис. 4 Коллапс коллапсаров-электронов в коллапсаре-нейтроне.\n" +
                "\n" +
                "Полная принципиаальная структура коллапсара-электрона (позитрона) показана на рисунке 3, взаимное расположение электронов и позитронов в 49 мезонных трубках коллапсара-нейтрона показано на рисунке 4. По семь электрон-позитронных (мезонных) трубок в нейтроне образуют совместно 7 (семь) трубок пионов в коллапсаре-нейтроне.\n" +
                " Почему отдельные электрон-позитронные трубки нейтрона (протона) названы – мезонными, а по семь электрон-позитронных трубок в «семёрках» названы – пионами? Каждая электрон-позитронная (мезонная) и пионная трубка (части трубок) при разрушении коллапсара-нейтрона (протона) проявляется в опытах мельчайшими частицами – фрагментами трубок (коллективов трубок), близкими по массам известным в физике частицам – мезонам (пионам). По семь электрон-позитронных (мезонных) трубок в структуре коллапсара-нейтрона (Рис. 4), расположенные «семёркой»  образуют структуры семи пионов.\n" +
                " \n" +
                " Шесть пионных трубок (Рис. 4) расположены в «шубе» нейтрона седьмая пионная трубка расположена в центре коллапсара – керне нейтрона.\n" +
                "Вокруг седьмого пиона – керна нейтрона, индуцированы 6 (шесть) полных коллапсарных нанотрубок – полных трубок магнетонов коллапсара-нейтрона (протона), на рисунке 4 показаны шестиконечными звёздами и буквами «П».  На «поверхности» нейтрона, между трубками пионов в шубе нейтрона, расположены шесть неполных нанотрубок – неполных трубок магнетонов, на рисунке 4 показаны буквами «Н».\n" +
                " \n" +
                "Между пионными трубками индуцированы шесть свободных закрытых пространств вокруг керна и шесть частично закрытых пространств на поверхности шубы нейтрона.\n" +
                " Почему образуются в свободных пространствах полные и неполные нанотрубки (магнетоны) в коллапсарах?\n" +
                "Семь малых равных окружностей не закрывают полностью площадь большой окружности, поэтому между окружностями в геометрической «семёрке» образуются свободные пространства.\n" +
                " \n" +
                " В электронах (Рис. 5) свободные пространства расположены между элементарными трубками, а элементарные трубки состоят из элементарных зарядов противоположного знака. На рисунке 5 показаны концевые элементарные заряды противоположного знака в элементарных трубках, на видимой стороне коллапсара-электрона.\n" +
                "Рис. 5   Полные и неполные нанотрубки в коллапсаре-электроне. Принципиальная электрическая схема образования шести полных (П) коллапсарных нанотрубок (полных магнетонов) в закрытых свободных пространствах и шести неполных (Н) нанотрубок (неполных магнетонов) в частично закрытых пространствах, между элементарными трубками коллапсара-электрона.\n" +
                "В каждом слое гамма-коллапсаров, в структуре коллапсара-электрона, знаки полярности элементарных зарядов в элементарных нейтрино изменяются на противоположные. По шесть элементарных трубок (Рис. 5) образовали закрытые свободные пространства. Полные нанотрубки (магнетоны) коллапсара-электрона показаны буквами «П». По четыре элементарных трубки образовали неполные нанотрубки коллапсара-электрона, на рисунке 5 показаны буквами «Н».\n" +
                " \n" +
                "Концы элементарных трубок в нанотрубках электрона (Рис. 5) замкнуты. Индуцированные силовые линии электрического поля смыкаются на концах потиволежащих элементарных трубок на видимой и на обратной стороне коллапсара-электрона.\n" +
                " \n" +
                "Силы взаимного сжатия элементарных трубок, в полных нанотрубках электрона коллапсарные, – значительно превосходят коллапсарные силы в нанотрубках (магнетонах) нуклонов (Рис. 4) и ядерные силы в нанотрубках (магнетонах) ядер атомов (Рис. 6). Неполные нанотрубки электронов (Рис. 5) подобны электромагнитным «стыковочным узлам» и обладают короткодействующими коллапсарными силами взаимного притяжения между ближайшими электронами.  Силы притяжения (Рис. 5) между неполными нанотрубками электронов образуют полные и неполные нанотрубки в коллапсарах-нейтронах (коллапсарах-протонах).     \n" +
                "Неполные магнетонные трубки коллапсаров-нейтронов и протонов создают совместно единые короткодействующие ядерные силы (Рис. 6) в нанотрубках альфы – ядре атома гелия.\n" +
                " \n" +
                "Природа короткодействующих ядерных сил, между нуклонами в ядрах атомов электрическая (рис. 6) и, оказалась в действительности удивительно простой для смыслового описания.  Тайну структуры ядер атомов и природу короткодействующих ядерных сил между нуклонами – полностью раскрывает структура силового взаимодействия нуклонов в ядре атома гелия (рис. 6).\n" +
                "\n" +
                "Рис. 6   Альфа-коллапсар – ядро атома гелия. Принципиальная структура силового сжатия (притяжения) нуклонов в ядре атома гелия (принципиальная структура ядерных сил).\n" +
                " \n" +
                "На рисунке 6 показаны короткодействующие силы в неполных магнетонах нейтронов и протонов, совместно образовавшие силовые структуры притяжения в двух полных ядерных магнетонах – полных ядерных нанотрубках альфы и четыре совместные силовые структуры притяжения в неполных нанотрубках.\n";

    public void findLinks() {

        String reg1 = "[А-Яё[0-9]\"«»–\\s()а-я\\-,]+\\((Р|р)ис\\. [0-9]+\\)[ё[0-9]\"«»–\\s()а-я\\-,?!]+" +
                "(\\((Р|р)ис\\.\\s?[0-9]+\\)[ё[0-9]\"«»–\\s()а-я\\-,]*)?[?!.]";

        Pattern regExp = Pattern.compile(reg1, Pattern.CASE_INSENSITIVE);

        Matcher picture = regExp.matcher(g);

        while (picture.find()) {
            System.out.println("Found '" + picture.group().trim() + "'");
        }
    }


    public static boolean numbersOrder() {
        int count = 1;
        boolean c = true;

        String reg1 = "[(]Рис. [0-9]+[)]|[(]рис. [0-9]+[)]";


        Matcher picture = Pattern.compile(reg1).matcher(g);

        while (picture.find()) {
            Matcher numberOfPicture = Pattern.compile("[0-9]+").matcher(picture.group());

            while (numberOfPicture.find() && c) {
                if (Integer.valueOf(numberOfPicture.group()) == count || Integer.valueOf(numberOfPicture.group()) == count + 1) {
                    count = Integer.valueOf(numberOfPicture.group());
                } else c = false;
            }

        }

        return c;
    }}






