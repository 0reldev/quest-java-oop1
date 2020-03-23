public class Classroom {


    public static void main(String[] args) {

        Wilder Johnny = new Wilder("Johnny", true);
        Wilder Quasimodo = new Wilder("Quasimodo", true);
        Wilder Polichinel = new Wilder("Polichinel", false);

        String presentationJohnny = Johnny.whoAmI();
        String presentationQuasimodo = Quasimodo.whoAmI();
        String presentationPolichinel = Polichinel.whoAmI();

        System.out.println(presentationJohnny);
        System.out.println(presentationQuasimodo);
        System.out.println(presentationPolichinel);


    }


}