package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    int ar[]={100, 300, 500, 600, 900, 1000};
    int size=6;
    for(int i=0;i<size;i++)
    {
    if(ar[i]<410)     //checking for low count
    counts.lowCount++;               //incrementing the low count variable by one if ar[i] is less than 410 
    else if(ar[i]>=410 && ar[i]<910) //checking for medium  count 
    counts.mediumCount++;            //incrementing the medium count
    else                              //checking for high count
    counts.highCount++;              // incrementing the high count
    }
    System.out.println(counts.lowCount);     //displaying the low count
    System.out.println(counts.mediumCount);  //displaying the medium count
    System.out.println(counts.highCount);   //displaying the high count
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
