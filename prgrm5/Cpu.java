class Cpu {

    int price;

  
    Cpu(int p) {
        price = p;
    }

  
    void display() {
        System.out.println("Price of CPU : " + price);
    }

   
    class Processor {

        int cores;
        String manufacture;

      
        Processor(int c, String m) {
            cores = c;
            manufacture = m;
        }

        
        void display() {
            System.out.println("No of cores : " + cores);
            System.out.println("Processor manufactures : " + manufacture);
        }
    }

    
    static class Ram {

        int memory;
        String manufacture;

       
        Ram(int mem, String m) {
            memory = mem;
            manufacture = m;
        }

      
        void display() {
            System.out.println("Memory Size : " + memory);
            System.out.println("Memory manufactures : " + manufacture);
        }
    }

    public static void main(String[] args) {

        Cpu intel = new Cpu(23000);

        Cpu.Processor p = intel.new Processor(8, "Intel");

        Cpu.Ram ram = new Cpu.Ram(64, "Asus");

        intel.display();
        p.display();
        ram.display();
    }
}
