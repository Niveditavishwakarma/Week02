package librarymanagementsystem;

 class Magazine extends LibraryItem implements Reservable {
     private boolean isAvailable;

     public Magazine(String itemId, String title, String author, boolean isAvailable) {
         super(itemId, title, author);
         this.isAvailable = isAvailable;
     }

     @Override
     public int getLoanDuration() {
         return 7; // 7 days loan duration for magazines
     }

     @Override
     public void reserveItem() {
         if (isAvailable) {
             System.out.println("Magazine reserved successfully.");
             isAvailable = false;
         } else {
             System.out.println("Magazine is not available for reservation.");
         }
     }

     @Override
     public boolean checkAvailability() {
         return isAvailable;
     }
}
