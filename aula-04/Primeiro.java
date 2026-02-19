void main(){
    IO.println("Olá, mundo!");

    int i = 1;
    String s = "";
    
    switch(i){
        case 1:
            s = "Um";
        break;
        default:
            s = "Outro";
    }
    System.out.println(s);

    
    // String s = switch(i){
    //     case 1 -> "Um";
    //     default -> "Outro";
    // };
   

}