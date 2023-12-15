package main;

import main.Classes.Expeirence;
import main.Classes.UnitHP_EXP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Game extends ConsoleInterface {
    ExpHandler expHandler; //Handler для системы опыта
    HashMap<String, UnitHP_EXP> persons; //список игроков

    public Game(HashMap<String, UnitHP_EXP> persons) {
        this.persons = persons;
        expHandler = new ExpHandler();
    }

    @Override
    public void otherCommand(String[] commamd) {
        ArrayHelper comHelper = new ArrayHelper(commamd);

        //Если вводимое имя персонажа имеется в списке и может получать опыт
        if (persons.containsKey(comHelper.getE(0)) && persons.get(comHelper.getE(0)) instanceof Expeirence){

            //Собераем полностью команду
            String action = "";
            for (int i = 1; i < comHelper.getLength(); i++) {
                action += (String)comHelper.getE(i);
            }
            ////////////////////////////

            if(action.equals("exp")){
                System.out.println(expHandler.status((Expeirence) persons.get(comHelper.getE(0))));
            } else {
                System.out.println(expHandler.upUnitExp((Expeirence) persons.get(comHelper.getE(0)), action));
            }
        }

    }

    @Override
    public String instruction() {
        String instr = "Для того чтобы совершить действие: ИмяПерсонажа Действие. Пример: Anna kill animal \n";
        for (Map.Entry<String, UnitHP_EXP> pers : persons.entrySet()) {
            UnitHP_EXP temp = pers.getValue();
            instr += "Класс: " + temp.getClass().getName().replaceAll("main.Classes.", "") +
                    ", Имя: " + temp.getName() +
                    ", Действия: " + temp.getMethodForGetExpeirence() + '\n';
        }
        return instr;
    }
}
