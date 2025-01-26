package librarymanagementsystem;

 class Book extends LibraryItem implements Reservable{
     private boolean isAvailable;

     public Book(String itemId, String title, String author, boolean isAvailable) {
         super(itemId, title, author);
         this.isAvailable = isAvailable;
     }

     @Override
     public int getLoanDuration() {
         return 14;
     }

     @Override
     public void reserveItem() {
         if (isAvailable) {
             System.out.println("Book reserved successfully.");
             isAvailable = false;
         } else {
             System.out.println("Book is not available for reservation.");
         }
     }

     @Override
     public boolean checkAvailability() {
         return isAvailable;
     }
}
