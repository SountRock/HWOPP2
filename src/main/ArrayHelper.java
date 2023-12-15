package main;

/**
 * Класс помогающий работать с массивом
 */
public class ArrayHelper {
    private Object[] array;

    public ArrayHelper(Object[] array) {
        this.array = array;
    }

    /**
     * Возвращает элемент по индексу типа Object
    */
    public Object getE(int index){
        try{
            return array[index];
        } catch (IndexOutOfBoundsException e){
            return "";
        }
    }

    /**
     * Возвращает элемент по индексу типа int
     */
    public int getInt(int index){
        try{
            return Integer.parseInt((String) array[index]);
        } catch (IndexOutOfBoundsException e){
            return 0;
        }
    }

    /**
     * Возвращает элемент по индексу типа float
     */
    public float getFloat(int index){
        try{
            return Float.parseFloat((String) array[index]);
        } catch (IndexOutOfBoundsException e){
            return 0;
        }
    }

    /**
     * Возвращает элемент по индексу типа double
     */
    public double getDouble(int index){
        try{
            return Double.parseDouble((String) array[index]);
        } catch (IndexOutOfBoundsException e){
            return 0;
        }
    }

    /**
     * Возвращает элемент по индексу типа char
     */
    public double getChar(int index){
        try{
            return Character.charCount(Integer.parseInt((String) array[index]));
        } catch (IndexOutOfBoundsException e){
            return 0;
        }
    }

    /**
     * Заменяет элемент в указаной позиции
     */
    public void setE(int index, Object elem){
        try{
            array[index] = elem;
        } catch (IndexOutOfBoundsException e){}
    }

    /**
     * Заменяет элемент в указаной позиции
     */
    public int getLength(){
        return array.length;
    }

    /**
     * Возвращает массив Object-ов
     */
    public Object[] getArray(){
        return array;
    }
}
