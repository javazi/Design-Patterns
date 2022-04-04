package designPattern.adapter1;

public class Client {
    public static void main(String[] args) {
       RoundHole hole = new RoundHole(5);
       RoundPeg rPeg1 = new RoundPeg(5);
      // rPeg1.setRadius(5);
       RoundPeg rPeg2 = new RoundPeg(8);
      // rPeg2.setRadius(7);

        System.out.println(hole.fit(rPeg1));
        System.out.println(hole.fit(rPeg2));

        SquarePeg sqPeg1 = new SquarePeg(2);
        SquarePeg sqPeg2 = new SquarePeg(5);

        SquarePegAdapter small_sqAdapter = new SquarePegAdapter(sqPeg1);
        SquarePegAdapter large_sqAdapter = new SquarePegAdapter(sqPeg2);

        System.out.println(hole.fit(small_sqAdapter));
        System.out.println(hole.fit(large_sqAdapter));

    }
}
