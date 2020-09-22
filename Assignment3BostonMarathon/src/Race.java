import java.util.ArrayList;

public class Race {
    ArrayList<Runner> runnersInRace = new ArrayList<>();

    public Race() {

    }
    public ArrayList<Runner> addRunner(Runner runner) {
        runnersInRace.add(runner);
        return runnersInRace;
    }

    public Runner firstPlace() {
        Runner fastestRunner = runnersInRace.get(0);
        for(Runner runner : runnersInRace) {
            if (runner.minutes < fastestRunner.minutes) {
                fastestRunner = runner;
            }
        }
        return fastestRunner;
    }

    public Runner secondPlace() {
        ArrayList<Runner> tempArrayList = new ArrayList<>();
        Runner secondFastestRunner = runnersInRace.get(0);
        for(Runner runner : runnersInRace) {
            tempArrayList.add(runner);
        }
        Runner tempFastestRunner = firstPlace();
        tempArrayList.remove(tempFastestRunner);
        for(Runner runner : tempArrayList) {
            if (runner.minutes < secondFastestRunner.minutes) {
                secondFastestRunner = runner;
            }
        }
        return secondFastestRunner;
    }

    public void places() {
        Runner fastestRunner = firstPlace();
        System.out.println("The fastest runner is " + fastestRunner.name + " with a time of " + fastestRunner.minutes + " minutes.");
        Runner secondFastestRunner = secondPlace();
        System.out.println("The second fastest runner is " + secondFastestRunner.name + " with a time of " + secondFastestRunner.minutes + " minutes.");
    }
}