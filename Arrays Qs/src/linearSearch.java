public class linearSearch {
    public void searchFood(String[] food, String target){
        for(int i = 0; i<food.length; i++){
            if(food[i].equals(target)){
                System.out.println("Element found at index: " + i + "  Value is: "+ food[i]);
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args){
        String[] food ={"Burger", "Noodles", "Shake", "Pizza", "Pasta"};
        String target = "Pizza";
        linearSearch m = new linearSearch();
        m.searchFood(food, target);

    }
}
