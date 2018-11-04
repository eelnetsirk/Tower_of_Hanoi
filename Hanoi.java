// @author Kristen Lee
import java.util.*;
public class Hanoi{
    int num_moves = 0;

    public void solveHanoi(int disk_num, String start, String end, String alt){
      if(disk_num == 1){// TERMINATING CONDITION
        System.out.println(" - moved one disk from " + start + " to " + end);
        num_moves++;
      }
      else{
        solveHanoi(disk_num-1, start, end, alt);
        System.out.println(" - moved one disk from " + start + " to " + end);
        solveHanoi(disk_num -1, alt, start, end);
        num_moves ++;
      }
    }


    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      boolean flag = true;
      while(flag){
        Hanoi game = new Hanoi();
        System.out.print("Enter the amount of disks wanted: ");
        int i = sc.nextInt();
        game.solveHanoi(i, "a", "b", "c");
        System.out.println("Took " + (game.num_moves) + " moves");
        System.out.println("Another? (y/n)");
        if(sc.next().equals("n")) flag = false;
      }
    }

}
//
// class Peg{
//   Disk head;
//   int size;
//
//   public Peg(){
//     this.head = null;
//     this.size = 0;
//   }
//   public boolean isEmpty(){
//     return this.head == null;
//   }
//   public int size(){
//     return this.size;
//   }
//   public void add(int a){
//     Disk oldfirst = this.head;
//     this.head = new Disk(a);
//     this.head.size = a;
//     this.head.next = oldfirst;
//     this.size++;
//   }
//   public int remove(){
//     if(isEmpty()) return 0;
//     Disk n = this.head.next;
//     this.head = this.head.next;
//     size--;
//     return n.size;
//   }
//   public Disk peek(){
//     if(isEmpty()) return null;
//     return this.head;
//   }
//   public String toString(){
//     StringBuilder s = new StringBuilder();
//     for(Disk i = this.head; i!= null; i = i.next){
//       s.append(i.size);
//       s.append(' ');
//     }
//     return s.toString();
//   }
//
//
// }
//
// class Disk{
//   int size;
//   Disk next;
//
//   public Disk(int size){
//     this.size = size;
//     this.next = null;
//   }
// }
