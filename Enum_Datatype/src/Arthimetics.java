public enum Arthimetics {
    ADD("it performs addition") {
        public void doOperation() {
            System.out.println(a + " + " + b + " = " + (a + b));
        }
    },
    SUB("it performs subtraction") {
        public void doOperation() {
            System.out.println(a + " - " + b + " = " + (a - b));
        }
    },
    PRO("it performs multiplication") {
        public void doOperation() {
            System.out.println(a + " * " + b + " = " + (a * b));
        }
    },
    DIV("it performs division") {
        public void doOperation() {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    },
    MOD("it performs modulus operation") {
        public void doOperation() {
            System.out.println(a + " % " + b + " = " + (a % b));
        }
    };

    private String data;
    private static int a, b;

    private Arthimetics(String data) {
        this.data = data;
    }

    public void setdata(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void getdata() {
        System.out.println(data);
        doOperation();
    }

    public abstract void doOperation();
}
