public class tehtavat {
    static boolean isEven(int n) {
        if(n%2==0){
            return true;
        }
        return false;

    }

    static String sign(int n){
        if(n==0){
            return "nolla";
        }
        else if(n>0){
            return "positiivinen";
        }
        return "negatiivinen";
    }

    static String describe(int n){
        if(n==0){
            return "nolla";
        }
        else if(n>0){
            if(n%2==0){
                return "positiivinen parillinen";
            }
            return "positiivinen pariton";
        }
        else{
            if(n%2==0){
                return "negatiivinen parillinen";
            }
            return "negatiivinen pariton";
        }
    }

    static String order2(int a, int b){
        return Math.min(a, b) + "," + Math.max(a,b);

    }

    static String order3(int a, int b, int c){
        return Math.min(Math.min(a,b),c) + "," + ((a+b+c)-Math.min(Math.min(a,b),c)-Math.max(Math.max(a,b),c)) + "," + Math.max(Math.max(a,b),c);
    }

    static String line(int i, int j){
        return i + " x " + j +  " = " + (i*j);

    }

    static String table10(int n){
        StringBuilder str = new StringBuilder();
        for(int i = 1; i<=10;i++){
            str.append(n + " x " + i + " = " + i*n +"\n");
        }
        return str.toString();
    }

    static boolean check(String s){
        if(s==null){
            return false;
        }   
        else if("java123".equals(s)){
            return true;
        }
        return false;
    }

    static String login(String[] tries){

         for(int i = 0; i<tries.length && i<3; i++){
            if(tries[i] == "java123"){
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }

    static double average(int[] a){
        if(a.length == 0){
            return 0.0;
        }
        double summa = 0.0;
        for(int i : a){
            summa += i;
        }
        return summa / a.length;
    }

    static int max(int[] a){
        if(a.length == 0){
            return Integer.MIN_VALUE;
        }
        int maksimi = 0;
        for(int i : a){
            if(maksimi < i){
                maksimi = i;
            }
        }
        return maksimi;
    }

    public static void main(String[] args) {
        System.out.println(isEven(1));
        System.out.println(sign(-2));
        System.out.println(check(null));
        System.out.println(check("moro"));
        System.out.println(max(new int[]{1,2,3,15000}));
    }
}
