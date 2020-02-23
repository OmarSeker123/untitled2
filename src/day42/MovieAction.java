package day42;

public class MovieAction {

    public static void main(String[] args) {
        
        Movie m1=new Movie();
        System.out.println("m1 = " + m1);

    }

    public static class Movie {

        String name;
        double length;
        String genre;


        public Movie(){

            System.out.println("EMPTY MOVIE");
        }

    //  WRITE A CONSTRUCTOR TO SET ALL THE FIELDS VALUE

        public Movie(String name, double length, String genre) {
            this.name = name;
            this.length = length;
            this.genre = genre;
        }

        // to String method so we can directly print out


        @Override
        public String toString() {
            return "Movie{" +
                    "name='" + name + '\'' +
                    ", length=" + length +
                    ", genre='" + genre + '\'' +
                    '}';
        }
    }
}
