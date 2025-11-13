public class TimeCalc {
    public static void main(String[] args) {
        String clock = args[0];
        String minutesToAdd = args[1];
        int hours = Integer.parseInt(clock.substring(0, 2));
        int minutes = Integer.parseInt(clock.substring(3, 5));
        int minutesAdd = Integer.parseInt(minutesToAdd);
        int totalminutes = hours * 60 + minutes + minutesAdd;
        int totalhours = (totalminutes / 60) % 24;
        int newminutes = totalminutes % 60;
        if (totalhours < 10) {
            System.out.print("0" + totalhours + ":");
        } else {
            System.out.print(totalhours + ":");
        }
        if (newminutes % 60 < 10) {
            System.out.println("0" + newminutes % 60);
        } else {
            System.out.println(newminutes % 60);
        }
    }
}
