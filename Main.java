public class Main {
    public static void main(String[] args) throws InterruptedException {
        String userName = new String();
        String repoName = null;
        int i = 0;
        for (; i < args.length; i++) {
            if(!" ".equals(args[i])) {
                userName += args[i];
            }
        }
        
        // for (; i < args.length; i++) {
        //     if(!" ".equals(args[i])) {
        //         repoName += args[i];
        //     }
        // }
        DataCollector user = new DataCollector();
        System.out.println(user.parser(userName));
    }
}
