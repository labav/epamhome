package hometask2.src;

/**
 * Created by Doomsday Device on 28.08.2017.
 */
public class GraphicController {
    public static String[] getNumber(double result) {
        String[] image = {"", "", "", "", ""};

        if (result != Double.POSITIVE_INFINITY && result != Double.NEGATIVE_INFINITY) {
            String buffer = String.valueOf(result);
            char[] charArray = buffer.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                switch (charArray[i]) {
                    case '1':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.one[j];
                        }
                        break;
                    case '2':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.two[j];
                        }
                        break;
                    case '3':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.three[j];
                        }
                        break;
                    case '4':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.four[j];
                        }
                        break;
                    case '5':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.five[j];
                        }
                        break;
                    case '6':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.six[j];
                        }
                        break;
                    case '7':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.seven[j];
                        }
                        break;
                    case '8':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.eight[j];
                        }
                        break;
                    case '9':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.nine[j];
                        }
                        break;
                    case '0':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.zero[j];
                        }
                        break;
                    case '.':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.dot[j];
                        }
                        break;
                    case '+':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.plus[j];
                        }
                        break;
                    case '-':
                        for (int j = 0; j < image.length; j++) {
                            image[j] += GraphicNumbers.minus[j];
                        }
                        break;

                    default:
                        break;
                }
            }
        }
        else if (result == Double.POSITIVE_INFINITY) {
            for (int j = 0; j < image.length; j++) {
                image[j] += GraphicNumbers.plus[j];
                image[j] += GraphicNumbers.infinity[j];
            }
        }
        else if (result == Double.NEGATIVE_INFINITY) {
            for (int j = 0; j < image.length; j++) {
                image[j] += GraphicNumbers.minus[j];
                image[j] += GraphicNumbers.infinity[j];
            }
        }
        return image;
    }
}

class GraphicNumbers{
    static String[] one =   {"   *", "   *", "   *", "   *", "   *"};
    static String[] two =   {" ***", "   *", " ***", " *  ", " ***"};
    static String[] three = {" ***", "   *", " ***", "   *", " ***"};
    static String[] four =  {" * *", " * *", " ***", "   *", "   *"};
    static String[] five =  {" ***", " *  ", " ***", "   *", " ***"};
    static String[] six =   {" ***", "   *", " ***", " * *", " ***"};
    static String[] seven = {" ***", "   *", "   *", "   *", "   *"};
    static String[] eight = {" ***", " * *", " ***", " * *", " ***"};
    static String[] nine =  {" ***", " * *", " ***", "   *", " ***"};
    static String[] zero =  {" ***", " * *", " * *", " * *", " ***"};
    static String[] dot =   {"    ", "    ", "    ", "    ", "  * "};

    static String[] plus =   {"  * ", "  * ", " ***", "  * ", "  * "};
    static String[] minus =   {"    ", "    ", " ***", "    ", "    "};

    static String[] infinity = {"  ***   *** ", " *   * *   *", " *    *    *", " *   * *   *", "  ***   *** "};
}
