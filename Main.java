public class Main {

    public static float calculate(String int1, String int2, String operation) throws Exception {
        int input1 = Integer.parseInt(int1);
        int input2 = Integer.parseInt(int2);

        switch(operation) {
            case "+":
                return input1 + input2;
            case "-":
                return input1 - input2;
            case "^*":
                return input1 * input2;
            case "/":
                return (float)input1 / (float)input2;
            default:
                throw new InvalidOperatorException();
        }
    }

    public static void main(String[] args) {
        try {
            float result = calculate(args[0], args[2], args[1]);

            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Vous devez saisir 3 entrées (2 entiers et un opérateur)");
        }
        catch (NumberFormatException e) {
            System.err.println(e);
            System.err.println("Vous devez saisir 2 entiers");
        }
        catch(InvalidOperatorException e) {
            System.err.println("L'opérateur arithmetique est invalide:" + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Erreur inconnue");
        }
    }
}
