import java.util.ArrayList;
public class findlist {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,5};
        // ArrayList<Integer> ans= findlis(arr, 4, 0,new ArrayList<>());
        // System.out.println(ans);

        ArrayList<Integer> ans2= findli2(arr, 4, 0);
        System.out.println("2"+ans2);


    }
    // static ArrayList findlis(int[] arr,int target,int index, ArrayList<Integer> list)
    // {
    //     if(index ==arr.length)
    //     {
    //         return list;
    //     }
    //     if(arr[index]==target)
    //     {
    //         list.add(index);

    //     }
    //     return findlis(arr,target,index+1,list);
    // }


    static ArrayList findli2(int[] arr,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index ==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);

        }
        ArrayList<Integer> ansfrombelow= findli2(arr,target,index+1);
        list.addAll(ansfrombelow);
        return list;
    }
}
