
       class Employee {
        String name;  // variabless
        double salary;
        Employee(String name, double salary) {//construcotr
            this.name = name;
            this.salary = salary;
        }

        void Display_details() {  //method
            System.out.println("emp name is " + name + " salary of emp is " + salary);
        }
    }

        class Manager extends Employee {  //new cls extends the parent 
        String department;  // add new variable

        Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }

        @Override //override the parent detaills
        void Display_details() {
            System.out.println("department is : " + department + ", emp name is " + name + ", salary of emp is " + salary);
        }
    }

    
