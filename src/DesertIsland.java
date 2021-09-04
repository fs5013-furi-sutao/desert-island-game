public class DesertIsland {
    private Survivor survivor;
    private Advisor advisor;

    public DesertIsland() {
        this.survivor = new Survivor();
        this.advisor = new Advisor();
    }

    public void survive() {
        FoodTypes.showAllFoodTypes();


        supendOneDay();

        
    }

    private void supendOneDay() {
        OptionsFactory<Selectable> factory = new OptionsFactory<>();

        SelectOptions<Selectable> mainOptions = factory.create()
            .append(new EatAction())
            .append(new NotEatAction())
            .append(new HearHintAction());

        this.survivor.selectOption(mainOptions);

        SelectOptions<Selectable> optionsAfterHearingHint = factory.create()
            .append(new EatAction())
            .append(new NotEatAction());
        
        this.survivor.selectOption(optionsAfterHearingHint);
    }
}
