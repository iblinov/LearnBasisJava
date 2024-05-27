package stream;

/**
 2.2.	В тексте каждую букву заменить ее порядковым номером в алфавите.
 При выводе в одной строке печатать текст
 с двумя пробелами между буквами, в следующей строке внизу
 под каждой буквой печатать ее номер.
 */
public class StreamMain3_2 {
    public static void main(String[] args) {

        String text = "HERE you cancancan see some text with some testtext ";
        int temp;


        StringBuilder sb = new StringBuilder();
        sb.append(text);
        System.out.println("Original ---> " + sb.toString());


        String formatchar = "%-3s";
        String formatint =  "%-3d";

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != ' ') {
                System.out.format(formatchar, sb.charAt(i));
//				System.out.print(sb.charAt(i) + "  ");
            }
        }

        System.out.println();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != ' ') {

                temp = getIndex(sb.charAt(i));
                System.out.format(formatint, temp);
//				System.out.print(temp + "  ");
            }
        }

    }

    public static int getIndex(char letter) {
        int index = 0;
        char lowerCase = Character.toLowerCase(letter);

        switch (lowerCase) {
            case 'a':
                index = 1;
                break;
            case 'b':
                index = 2;
                break;
            case 'c':
                index = 3;
                break;
            case 'd':
                index = 4;
                break;
            case 'e':
                index = 5;
                break;
            case 'f':
                index = 6;
                break;
            case 'g':
                index = 7;
                break;
            case 'h':
                index = 8;
                break;
            case 'i':
                index = 9;
                break;
            case 'j':
                index = 10;
                break;
            case 'k':
                index = 11;
                break;
            case 'l':
                index = 12;
                break;
            case 'm':
                index = 13;
                break;
            case 'n':
                index = 14;
                break;
            case 'o':
                index = 15;
                break;
            case 'p':
                index = 16;
                break;
            case 'q':
                index = 17;
                break;
            case 'r':
                index = 18;
                break;
            case 's':
                index = 19;
                break;
            case 't':
                index = 20;
                break;
            case 'u':
                index = 21;
                break;
            case 'v':
                index = 22;
                break;
            case 'w':
                index = 23;
                break;
            case 'x':
                index = 24;
                break;
            case 'y':
                index = 25;
                break;
            case 'z':
                index = 26;
                break;
        }
        return index;
    }
}

