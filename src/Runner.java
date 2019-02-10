public class Runner {
    public static void main(String[] args){
        SortCompetition team6 = new Team6SortCompetition();
        int[] randIntArr = SortingUtil.randomIntsArr(10000);

        System.out.println("unsorted"); //challenge 1//
        SortingUtil.printArray(randIntArr);

        long time1 = System.currentTimeMillis();

        int median = team6.challengeOne(randIntArr);

        time1 = System.currentTimeMillis() - time1;
        System.out.println("Challenge One Time Taken: " + time1 * 0.001 + " Seconds");
        System.out.println("Median equals; " + median);

        System.out.println("Sorted");
        SortingUtil.printArray(randIntArr);
        System.out.println("\n");







        String[] randStringArr = SortingUtil.randomStringArr(10000, 5);
        randStringArr[10] = "troll";
        System.out.println("unsorted"); //challenge 1//
        SortingUtil.printArray(randStringArr);

        long time2 = System.currentTimeMillis();

        int index = team6.challengeTwo(randStringArr, "troll");

        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time Taken: " + time2 * 0.001 + " Seconds");
        System.out.println("Index equals; " + index);

        System.out.println("Sorted");
        SortingUtil.printArray(randStringArr);
        System.out.println("\n");












        randIntArr = SortingUtil.randomIntsArr(1000); //challenge 3//
        System.out.println("unsorted");
        SortingUtil.printArray(randIntArr);

        long time3 = System.currentTimeMillis();

        median = team6.challengeThree(randIntArr);

        time3 = System.currentTimeMillis() - time3;
        System.out.println("Challenge Three Time Taken: " + time3 * 0.001 + " Seconds");
        System.out.println("Median equals; " + median);

        System.out.println("Sorted");
        SortingUtil.printArray(randIntArr);
        System.out.println("\n");









        int[][] rand2DIntArr = SortingUtil.random2DIntArr(9, 9, 10);
        System.out.println("unsorted");
        SortingUtil.printArray(rand2DIntArr);

        long time4 = System.currentTimeMillis();

        median = team6.challengeFour(rand2DIntArr);

        time4 = System.currentTimeMillis() - time4;
        System.out.println("Challenge Four Time Taken: " + time4 * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        SortingUtil.printArray(rand2DIntArr);
        System.out.println("\n");




        Thingy[] things = Thingy.randomThingArr(10000);
        Thingy query = new Thingy(123);
        System.out.println("unsorted");
        SortingUtil.printArray(things);

        long time5 = System.currentTimeMillis();

        int indexC = team6.challengeFive(things,query);

        time5 = System.currentTimeMillis() - time5;
        System.out.println("Challenge Five Time Taken: " + time5 * 0.001 + " Seconds");
        System.out.println("Index equals; " + indexC);

        System.out.println("Sorted");
        SortingUtil.printArray(things);
        System.out.println("\n");



    }
}
