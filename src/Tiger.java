public class Tiger extends Animals {
    private String voice = "РРРРРРРРРРР!!!";

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    public boolean getEat() {
        return eat;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public boolean getSleep() {
        return sleep;
    }

    @Override
    public void animalVoice() {
        System.out.println(voice + "\n");
    }

    @Override
    public void animalSleep(boolean sleep) {
        System.out.println("Тигр спит?   " + sleep + "; Подаёт голос?  " + eat);
    }

    @Override
    public void animalEat(boolean eat) {
        System.out.println("Тигр ест?  " + eat + "; Просыпается?  " + sleep + ";  " + voice);
    }


}