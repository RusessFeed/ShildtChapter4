class Help {
    // Переменные;




    // Методы;
    void helpOn(int choice) {
        switch (choice) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор");
                System.out.println("else оператор");
                break;
            case '2':
                System.out.println("Традиционный оператор switch: ");
                System.out.println("switch(выражение) {");
                System.out.println("\tcase константа:");
                System.out.println("\t\tпоследовательность операторов");
                System.out.println("\t\tbreak;");
                System.out.println("\t\t//...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Цикл for:\n");
                System.out.println("for(инициализация; условия; итерация;)");
                System.out.println("\tоператор");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do: {");
                System.out.println("\tоператор");
                System.out.println("} while(условие);");
                break;
            case '6':
                System.out.println("Оператор break:\n");
                System.out.println("break; или break метка");
                break;
            case '7':
                System.out.println("Оператор continue:\n");
                System.out.println("continue; или continue метка");
                break;
        }
    }

    void showMenu() {
        System.out.println("Справка по:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.println("\t3. for");
        System.out.println("\t4. while");
        System.out.println("\t5. do-while");
        System.out.println("\t6. break");
        System.out.println("\t7. continue\n");
        System.out.println("\tВыберите вариант (или нажмите q для выхода: ");
    }

    boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') {
            return false;
        } else {
            return true;
        }
    }
}

class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;

        Help helpObj = new Help();

        for (; ; ) {
            do {
                helpObj.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpObj.isValid(choice));
            if (choice == 'q') {
                break;
            }
            System.out.println('\n');
            helpObj.helpOn(choice);
        }
    }
}