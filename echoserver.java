import java.io.*;
import java.net.*;
class echoserver
{
 public static void main(String args[])
{
  try
{ Socket s=null;
  ServerSocket ss=new ServerSocket(8000);
  s=ss.accept();
  System.out.println(s);
  BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
  PrintWriter print=new PrintWriter(s.getOutputStream());
  int i=1;
  while(i>0)
 { String str=br.readLine();
   if(str.equals("."))
   break;
 System.out.println("Msg received by client"+str);
 print.flush();
}}
catch(IOException e)
{ System.out.println("\n error:"+e);
}
}
}
 