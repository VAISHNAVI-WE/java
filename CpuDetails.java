class Cpu
    {
        double price=15000.00;
        class Processor
          {
            int cores=10;
            String manufacturer="Pentium";
          }
        static class RAM
            {
                double memory=64;
                String manufacturer="intel";
            }  
    }
public class CpuDetails
    {
      public static void main(String[]args)
        {
            Cpu c=new Cpu();
            Cpu.Processor p=c.new Processor();
            Cpu.RAM r=new Cpu.RAM();
            System.out.println("Cpu Class");
            System.out.println("........................");
            System.out.println("Cpu Price="+c.price);
            System.out.println("\n Processor inner class");
            System.out.println(".........................");
            System.out.println("No.of cores="+p.cores);
            System.out.println("Manufacturer="+p.manufacturer);
            System.out.println("\n RAM static nested class");
            System.out.println("...............................");
            System.out.println("Memory="+r.memory);
            System.out.println("Manufacturer="+r.manufacturer);
        }
    }    