package practice10;

public class Q07_ConvertThreeDigitNumberToWords {
    public static void main(String[] args) {
        int number = 123;
        int hundreds = number/100;
        int tens = (number/10)%10;
        int ones = number%10;

        if(hundreds==0){
            System.out.println("Enter a three digits number");

        }else {

            switch (hundreds){
                case 1  :{
                    System.out.println("one");
                    break;
                }
                case 2  :{
                    System.out.println("two");
                    break;
                }
                case 3  :{
                    System.out.println("three");
                    break;
                }
                case 4  :{
                    System.out.println("four");
                    break;
                }
                case 5  :{
                    System.out.println("five");
                    break;
                }
                case 6  :{
                    System.out.println("six");
                    break;
                }
                case 7  :{
                    System.out.println("seven");
                    break;
                }
                case 8  :{
                    System.out.println("eight");
                    break;
                }
                case 9  :{
                    System.out.println("nine");
                    break;
                }
            }
            System.out.println("hundred");

            if(tens==1){
                switch (ones){
                    case 0:{
                        System.out.println("ten");
                        break;
                    }
                    case 1:{
                        System.out.println("eleven");
                    }
                    case 2:{
                        System.out.println("twelve");
                    }
                    case 3:{
                        System.out.println("thirteen");
                    }
                    case 4:{
                        System.out.println("fourteen");
                    }
                    case 5:{
                        System.out.println("fifteen");
                    }
                    case 6:{
                        System.out.println("sixteen");
                    }
                    case 7:{
                        System.out.println("sevebteen");
                    }
                    case 8:{
                        System.out.println("eighteen");
                    }
                    case 9:{
                        System.out.println("ninteen");
                    }

                }

            }else {
                switch (tens){
                    case 2:{
                        System.out.println("twenty");
                        break;
                        //homework!!!
                    }
                }
            }
        }
    }
}
