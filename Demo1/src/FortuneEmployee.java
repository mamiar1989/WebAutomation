

    public class FortuneEmployee {

        /**
         * FortuneEmployee class has a main methods where you will be able to create Object from
         * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
         * to use with proper business work flow.Think as a Software Architect, Product Designer and
         * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
         * more to design an application that will meet for fortune 500 Employee Information
         * Services.
         * <p>
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         **/
        public static void main(String[] args) {

            EmployeeInfo keyboard = new EmployeeInfo("Yasmina", 100);

            keyboard.setCompanyName("Kate Spade");
            System.out.println(keyboard.getCompanyName());

            keyboard.setSalary(6000);
            System.out.println(keyboard.getSalary());

            keyboard.setEmpId(100);
            System.out.println(keyboard.getEmpId());

            keyboard.setPhoneN("215/3456/567");
            System.out.println(keyboard.getPhoneN());
        }


    }

