    public class Book {
        private String title;
        private String author;
        private int year;
        private String genre;

        public Book(String title, String author, int year, String genre) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.genre = genre;
        }

        public String getTitle() {
            return title;
        }
    }

