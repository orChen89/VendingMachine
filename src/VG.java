public class VG {

    public double amountOfMoney;
    public String answer1 = "Sorry! Unfortunately, your amount is not sufficient!";
    public String answer2 = "Sorry! too much money for this drink!";
    public String answer3 = "Thank you! please take your drink!";
    public String tmpAnswer = "";

    public String buyDrink() {

        if (amountOfMoney < 4.5) {
            tmpAnswer = answer1;
            System.out.println(tmpAnswer);
        } else if (amountOfMoney > 10) {
            tmpAnswer = answer2;
            System.out.println(tmpAnswer);
        } else if (amountOfMoney >= 4.5 && amountOfMoney <= 10) {
            tmpAnswer = answer3;
            System.out.println(tmpAnswer);
        }
        return tmpAnswer;
    }
}
