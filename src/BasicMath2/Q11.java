package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11 {

   public static void main(String[] args) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      int testCase = Integer.parseInt(bf.readLine());
      
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < testCase; i++) {
         StringTokenizer st = new StringTokenizer(bf.readLine());
         int x1 = Integer.parseInt(st.nextToken());
         int y1 = Integer.parseInt(st.nextToken());
         int r1 = Integer.parseInt(st.nextToken());
         int x2 = Integer.parseInt(st.nextToken());
         int y2 = Integer.parseInt(st.nextToken());
         int r2 = Integer.parseInt(st.nextToken());
         int a = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
         int add = (r1 + r2) * (r1 + r2);
         int sub = (r1 - r2) * (r1 - r2);
         
         if(a == 0 && r1 == r2) {
        	 sb.append(-1).append("\n");
         } else if(a > add || a < sub) {
        	 sb.append(0).append("\n");
         } else if(a == add || a == sub) {
        	 sb.append(1).append("\n");
         } else {
        	 sb.append(2).append("\n");
         }
      }
      
      System.out.println(sb);
   }

}