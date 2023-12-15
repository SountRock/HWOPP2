package main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Класс обеспечивающий консольный диалог
 */
public abstract class ConsoleInterface {
    /**
     * Интепритуриую вводимую строку в нужный формат для чтения команды.
     * @param command
     * @return translate command
     */
    public String[] translateCommand(String command){
        String[] translComm = command.split(" ");
        for (int i = 0; i < translComm.length; i++) {
            translComm[i] = translComm[i].replaceAll(" ", "").toLowerCase();
        }

        return translComm;
    }

    /**
     * Метод консольного диалога, принимающий команды и выводит их результат
     */
    public void commandUp() throws IOException, InterruptedException {

        System.out.println("clear - очистить консоль (работает только при запуске с консоли) \n"+
                "exit - выход из диалога");

        System.out.println(instruction());
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Слушаю вас:");
        while (!exit){
            String line = sc.nextLine();
            String[] translateLine = translateCommand(line);

            ArrayHelper TLHelper = new ArrayHelper(translateLine);
            if(TLHelper.getE(0).equals("exit")){
                exit = true;
            } else if(TLHelper.getE(0).equals("clear")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //очищает консоль
            } else {
                otherCommand(translateLine);
            }
        }
    }

    /**
     * Метод обеспечивает выполнение НЕ базовых комманд
     * @param commamd
     */
    public abstract void otherCommand(String[] commamd);

    /**
     * Метод возвращающий инструкцию поясняющий как пользоваться коммандами
     * @return instruction
     */
    public abstract String instruction();


}

