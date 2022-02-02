public class App1 {

    /*
        Na początek metoda, która zwraca ilość
        cyfr w napisie.
    */
    static int countDigits(String expression) {
        return expression
                .replaceAll("\\D+", "")
                .length();
    }

    public static void main(String[] args) {
        /*
            Pamiętaj o nowej metodzie transform dla
            napisów Java, która pozwala dokonać
            konwersji wyrażenia w napisie według
            implementacji interfejsu Function
            przekazywanego jako argument metody
            transform.
        */
        var expression = "KM Programs 2021 Kurs Java";
        /*
            Wykorzystamy metodę countDigits podczas
            pracy z metodą transform.
        */
        var digitsCount = expression
                .transform(App1::countDigits);
        System.out.println(digitsCount);
    }
}
