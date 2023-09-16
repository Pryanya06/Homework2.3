public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        if (this != null) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                System.out.println("Меняем покрышку");
            }
            System.out.println("Проверяем двигатель");
            System.out.println("Проверяем прицеп");
        }
    }

}
