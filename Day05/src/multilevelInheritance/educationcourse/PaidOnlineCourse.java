package educationcourse;

public class PaidOnlineCourse extends OnlineCourse {

        private double fee;
        private double discount;

        // Constructor
        public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
            super(courseName, duration, platform, isRecorded);
            this.fee = fee;
            this.discount = discount;
        }

        // Method to calculate final price after discount
        public double calculateFinalPrice() {
            return fee - (fee * discount / 100);
        }

        // Override to include paid course-specific details
        @Override
        public void displayCourseInfo() {
            super.displayCourseInfo();
            System.out.println("Fee: $" + fee);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + calculateFinalPrice());
        }

}
