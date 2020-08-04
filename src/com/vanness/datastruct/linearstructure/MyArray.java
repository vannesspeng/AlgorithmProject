package com.vanness.datastruct.linearstructure;

/**
 * Created by pyy on 2019/11/15.
 */
public class MyArray {
    //数组实体
    private int[] intArray;
    //定义数组实际有效长度
    private int elementCount;
    //定义数组的最大长度
    private int length;

    public MyArray(){
        this.elementCount = 0;
        this.length = 50;
        this.intArray = new int[length];
    }

    /**
     * 构造函数重载
     * @param length
     */
    public MyArray(int length){
        this.elementCount = 0;
        this.length = length;
        this.intArray = new int[length];
    }

    /**
     * 获取数组的有效长度
     * @return
     */
    public int getSize(){
        return this.elementCount;
    }

    /**
     *
     */
    public void display(){
        for (int i = 0; i < elementCount; i++) {
            System.out.println(intArray[i]);
        }
    }

    /**
     * 根据下标获取元素
     * @param i
     * @return查找下标值在数组下标有效范围内，返回下标所表示的元素
     * 查找下标超出数组下标有效值，提示访问下标越界
     */
    public int get(int i){
        if(i<0 || i>elementCount){
            System.out.println("访问下标越界");
        }
        return intArray[i];
    }

    /**
     * 添加一个元素
     * @param value
     * @return
     */
    public boolean add(int value){
        //判断数组是否已满
        if(elementCount == length){
            return false;
        }else{
            intArray[elementCount] = value;
            elementCount++;
            return true;
        }
    }

    /**查找一个元素
     * @param target
     * @return
     */
    public int find(int target){
        int i;
        for (i = 0; i < elementCount; i++) {
            if(intArray[i] == target){
                break;
            }
        }
        if(i == elementCount){
            return -1;
        }
        return i;
    }

    /**
     * 查找指定的值，找到则删除，返回true，没有找到则返回false
     * @param value
     * @return
     */
    public boolean delete(int value){
        int k = find(value);
        if(k == -1){
            return false;
        }else{
            if(k == elementCount-1){
                elementCount--;
                return true;
            }else{
                for (int j = 0; j < elementCount-1; j++) {
                    intArray[j] = intArray[j+1];
                }
                elementCount--;
            }
            return true;
        }

    }

    /**
     * 修改数组的值
     * @param oldValue
     * @param newValue
     * @return
     */
    public boolean modify(int oldValue, int newValue){
        int k = find(oldValue);
        if(k == -1){
            return false;
        }else{
            intArray[k] = newValue;
        }
        return true;
    }

    public static void main(String[] args) {
        //创建自定义封装数组结构，数组大小为4
        MyArray array = new MyArray(4);
        //添加4个元素分别是1,2,3,4
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        //显示数组元素
        array.display();
        //根据下标为0的元素
        int i = array.get(0);
        System.out.println(i);
        //删除4的元素
        array.delete(4);
        //将元素3修改为33
        array.modify(3, 33);
        array.display();
    }
}