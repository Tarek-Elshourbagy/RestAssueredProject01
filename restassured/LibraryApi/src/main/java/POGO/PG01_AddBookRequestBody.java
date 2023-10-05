package POGO;

public class PG01_AddBookRequestBody {
        private String name;
        private String isbn;
        private String aisle;
        private String author;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
        public String getIsbn() {
            return isbn;
        }

        public void setAisle(String aisle) {
            this.aisle = aisle;
        }
        public String getAisle() {
            return aisle;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
        public String getAuthor() {
            return author;
        }

    }
