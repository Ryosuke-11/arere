import java.io.*;
class zissen14
{
 public static void main(String[] args)throws IOException
 {
  System.out.println("整数を2つ入力してください");
  
  BufferedReader br=
  new BufferedReader(new InputStreamReader(System.in));
  
  String str1=br.readLine();
  String str2=br.readLine();
  
  int a=Integer.parseInt(str1);
  int b=Integer.parseInt(str2);
  
  if(b>a&&(((b-a)+1)%2==0)){
  System.out.println(+a+"から"+b+"までの合計は"+((b+a)*((b-a+1)/2))+"です");
  }
  else if(b>a&&(((b-a)+1)%2>0)){
  System.out.println(+a+"から"+b+"までの合計は"+(((a+b)*((b-a)/2))+((b-a)+((b-a)/2)))+"です");
  }
 
 if(a>b&&(((a-b)+1)%2==0)){
  System.out.println(+b+"から"+a+"までの合計は"+((a+b)*((a-b+1)/2))+"です");
  }
  else if(a>b&&(((a-b)+1)%2>0)){
  System.out.println(+b+"から"+a+"までの合計は"+(((a+b)*((a-b)/2))+((a-b)+((a-b)/2)))+"です");
  }
 }
}
   