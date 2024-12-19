class RunnableLambdaDemo
{
    public static void main(String[] args) {
        
        // Traditional 
        Runnable r1 = new Runnable() {
            
            public void run()
            {
                int sum = 0;
                for (int i = 0 ; i < 10 ; i++)
                sum+=i;
                System.out.println(sum);
            }

        };
        new Thread(r1).start();

        // Lambda Demo 1

        Runnable r2 = ()->{

            int sum = 0;
            for (int i = 0 ; i < 10 ; i++)
            sum+=i;
            System.out.println(sum);

        };    

        new Thread(r2).start();
        
        // Lambda Demo 2

        new Thread(()->{
            int sum = 0;
            for (int i = 0 ; i < 10 ; i++)
            sum+=i;
            System.out.println(sum);

        }).start();




    }
}