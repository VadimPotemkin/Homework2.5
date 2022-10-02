public class Main {
    public static void main(String[] args) {
        var TotalTime = 640;
        var NumberOfPersons = TotalTime / 8;
        System.out.println("Всего работников в компании - " + NumberOfPersons + " человек");

        var NewNumberOfPerson = NumberOfPersons + 94;
        var NewTotalTime = NewNumberOfPerson * 8;
        System.out.println("Если в компании работает " + NewNumberOfPerson + " человек, то всего " + NewTotalTime + " часов работы может быть поделено между сотрудниками.");

    }
}