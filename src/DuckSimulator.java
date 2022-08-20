import adapter.GooseAdapter;
import adapter.GooseAdapter;
import adapter.PigeonAdapter;
import animals.*;
import animals.composites.Flock;
import animals.composites.LeaderFlock;
import animals.decorated.QuackCounter;
import animals.decorated.QuackEcho;
import factories.AbstractDuckFactory;
import factories.CountAndEchoDuckFactory;
import factories.CountingDuckFactory;
import factories.DuckFactory;

public class DuckSimulator {

    public static void main(String[] args){
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulateAdapterPattern();

    }

    private void simulateAdapterPattern() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());
        Quackable pigeonAdapter = new PigeonAdapter(new Pigeon());

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);
        simulate(pigeonAdapter);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
