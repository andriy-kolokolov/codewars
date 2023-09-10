public class KataSimple {
    public static void main(String[] args) {
        System.out.println("Leonardo");
    }

    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().startsWith("r") ?
                name + " plays banjo" :
                name + " does not play banjo";
    }
}


