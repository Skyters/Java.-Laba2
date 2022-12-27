public class Stroka {
    public String text;

    public Stroka(String text) {this.text = text;}

    public Stroka() {this.text = "";}

    public String deleteThreeWord() {
        if (text.isEmpty()) {
            return "(Ошибка! Введён пустой текст)";
        }

        StringBuilder str = new StringBuilder();

        int wordNum = 1;
        for(char ch : text.toCharArray())
        {
            if(wordNum % 3 != 0)
            {
                str.append(Character.toString(ch));
            }

            if (ch == ' ')
            {
                wordNum++;
            }
        }
        return str.toString();
    }
}
