package restaurantmanagement;

class Chef extends Person implements Worker{

        private String specialty;

        // Constructor
        public Chef(String name, int id, String specialty) {
            super(name, id);
            this.specialty = specialty;
        }

        // Implementing the performDuties() method
        @Override
        public void performDuties() {
            System.out.println("Preparing delicious meals. Specialty: " + specialty);
        }
    }

