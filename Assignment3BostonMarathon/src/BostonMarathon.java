import java.util.ArrayList;

public class BostonMarathon {

    public static void main(String[] args) {
        Runner a = new Runner("Elena", 341);
        Runner b = new Runner("Thomas", 273);
        Runner c = new Runner("Hamilton", 278);
        Runner d = new Runner("Suzie", 329);
        Runner e = new Runner("Phil", 445);
        Runner f = new Runner("Matt", 402);
        Runner g = new Runner("Alex", 388);
        Runner h = new Runner("Emma", 275);
        Runner i = new Runner("John", 243);
        Runner j = new Runner("James", 334);
        Runner k = new Runner("Jane", 415);
        Runner l = new Runner("Emily", 393);
        Runner m = new Runner("Daniel", 299);
        Race race = new Race();
        race.addRunner(a);
        race.addRunner(b);
        race.addRunner(c);
        race.addRunner(d);
        race.addRunner(e);
        race.addRunner(f);
        race.addRunner(g);
        race.addRunner(h);
        race.addRunner(i);
        race.addRunner(j);
        race.addRunner(k);
        race.addRunner(l);
        race.addRunner(m);

        race.places();
    }
}
