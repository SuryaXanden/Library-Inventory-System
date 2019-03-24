
/* Program to HELP the Librarian in 
managing the huge list of books.*/
import java.io.*;//for using FileReader & FileWriter
import java.util.*;//for taking user input

class LibraryInventorySystem_NVS // class name
{
  public static void printeR() {
    for (int abc = 0; abc < 51; abc++)// used to clear the console screen by 50 lines
    {
      System.out.println("");
    }
  }

  public static void main(String ar[]) throws IOException {
    for (long limit = 1;; limit++) {
      System.out.println("\n");
      System.out.println("_%%%%%%%.%%%%%%%.%%%%%%%.%%%%%_");
      System.out.println("%                             %");
      System.out.println(". LibraryInventorySystem_NVS  .");
      System.out.println("%                             %");
      System.out.println("_%%%%%%%.%%%%%%%.%%%%%%%.%%%%%_");
      System.out.println(
          "\n\n For additional privileges enter the user name as Administrator and enter the respective password.");
      System.out.println("    \nOR");
      System.out
          .println("    \n For normal privileges enter the user name as Guest and enter the respective password.");
      FileReader fr1 = new FileReader("protected.nvs");// user names and passwords are stored in this file
      BufferedReader br1 = new BufferedReader(fr1);
      FileReader fr2 = new FileReader("db.nvs");
      BufferedReader br2 = new BufferedReader(fr2);
      FileWriter fw = new FileWriter("db.nvs", true);
      BufferedWriter bw = new BufferedWriter(fw);
      Scanner sc = new Scanner(System.in);
      String fip;
      String l1 = "Surya Vishnu Nitish";// Line no. 1 in protected.nvs
      String l2 = "Little Flower Public School";// Line no. 2 in protected.nvs
      String l3 = "Library Inventory System";// Line no. 3 in protected.nvs
      String l4 = "Administrator";// Line no. 4 in protected.nvs
      String l5 = "Guest";// Line no. 5 in protected.nvs
      String l6 = "LFPS";// Line no. 6 in protected.nvs
      // Line no. 7 in protected.nvs is the Administrator user's password.
      String fip1, fip2, fip3, fip4, fip5, fip6, fip7;
      if (((fip1 = br1.readLine()).equals(l1)) & ((fip2 = br1.readLine()).equals(l2))
          & ((fip3 = br1.readLine()).equals(l3)) & ((fip4 = br1.readLine()).equals(l4))
          & ((fip5 = br1.readLine()).equals(l5)) & ((fip6 = br1.readLine()).equals(l6))) {
        System.out.print("   Enter the user name:> ");
        String iun = sc.next();// user name input
        System.out.print("   Enter user key:> ");
        String iuk = sc.next();// user key ip
        String fipk = br1.readLine();// key ip from file
        // printeR();
        if ((iun.equals(l4)) & (iuk.equals(fipk))) {
          System.out.println("\n\nLogged in as " + l4 + ".");
          for (int lim = 0;; lim++) {
            System.out.println("\n Press: ");
            System.out.println(" 1 for Search in Books List");
            System.out.println(" 2 for Add Book...");
            System.out.println(" 3 for Preferences...");
            System.out.println(" 4 for Exit");
            System.out.print(" Enter your choice:> ");
            int uic = sc.nextInt();
            printeR();
            switch (uic) {
            case 1:
              System.out.println(" \n ---Search in Books List---");
              System.out.println(" Press:");
              System.out.println(" 1 for Display BooksList");
              System.out.println(" 2 for Search in BooksList");
              System.out.println(" 3 for exit");
              System.out.print(" Enter your choice:> ");
              int uic2 = sc.nextInt();
              printeR();
              switch (uic2) {
              case 1:
                System.out.println("\n Displaying BooksList...");
                FileReader fr9 = new FileReader("db.nvs");
                BufferedReader br9 = new BufferedReader(fr9);
                String rtext;
                System.out.println("");
                while ((rtext = br9.readLine()) != null) {
                  System.out.println(rtext);
                }
                fr9.close();
                break;
              case 2:
                System.out.println("\n ---Searching Menu... ---");
                System.out.println("\n Press: ");
                System.out.println(" 1 for Search in Titles");
                System.out.println(" 2 for Search in AccessionNumbers");
                System.out.println(" 3 for Search in Publisher");
                System.out.println(" 4 for Exit");
                System.out.print(" Enter your choice:> ");
                int uisc = sc.nextInt();
                printeR();
                switch (uisc) {
                case 1:
                  System.out.println("\n ---Searching in Titles---");
                  FileReader sfr1 = new FileReader("Title.nvs");
                  BufferedReader sbr1 = new BufferedReader(sfr1);
                  System.out.print("Enter the Title :> ");
                  String title1 = sc.next();
                  String fiv1;
                  int lnum1 = 0;
                  int par1 = 0;
                  System.out.println("Searching for :> " + title1);
                  while ((fiv1 = sbr1.readLine()) != null) {
                    lnum1++;
                    if (title1.equalsIgnoreCase(fiv1)) {
                      System.out.println("\n\n --------------");
                      System.out.println("Book Found.");
                      par1++;
                      System.out.println("Found in line number: " + lnum1);
                      break;
                    }
                  }
                  if (par1 == 0 | par1 < 0) {
                    System.out.println("Book Not Found.");
                  }
                  break;
                case 2:
                  System.out.println("\n ---Searching in AccessionNumbers---");
                  FileReader sfr2 = new FileReader("AccessionNumber.nvs");
                  BufferedReader sbr2 = new BufferedReader(sfr2);
                  System.out.print("Enter the AccessionNumber :> ");
                  String accnum2 = sc.next();
                  String fiv2;
                  int lnum2 = 0;
                  int par2 = 0;
                  System.out.println("Searching for :> " + accnum2);
                  while ((fiv2 = sbr2.readLine()) != null) {
                    lnum2++;
                    if (accnum2.equalsIgnoreCase(fiv2)) {
                      System.out.println("\n\n --------------");
                      System.out.println("Book Found.");
                      par2++;
                      System.out.println("Found in line number: " + lnum2);
                      break;
                    }
                  }
                  if (par2 == 0 | par2 < 0) {
                    System.out.println("Book Not Found.");
                  }
                  break;
                case 3:
                  System.out.println("\n ---Searching in Publishers---");
                  FileReader sfr3 = new FileReader("AccessionNumber.nvs");
                  BufferedReader sbr3 = new BufferedReader(sfr3);
                  System.out.print("Enter the Publisher Name :> ");
                  String pubname3 = sc.next();
                  String fiv3;
                  int lnum3 = 0;
                  int par3 = 0;
                  System.out.println("Searching for :> " + pubname3);
                  while ((fiv3 = sbr3.readLine()) != null) {
                    lnum3++;
                    if (pubname3.equalsIgnoreCase(fiv3)) {
                      System.out.println("\n\n --------------");
                      System.out.println("Book Found.");
                      par3++;
                      System.out.println("Found in line number: " + lnum3);
                      break;
                    }
                  }
                  if (par3 == 0 | par3 < 0) {
                    System.out.println("Book Not Found.");
                  }
                  break;
                default:
                  System.out.println("Invalid choice");
                  break;
                }
                break;
              case 3:
                System.out.println("\ns~~~~~~~~~Logging Out~~~~~~~~~~~~~~s");// 32
                System.out.println("");
                System.out.println("s~~~~~~~~~Quitting Program~~~~~~~~~s");// 38
                System.out.println("");
                System.out.println("s~~~~~~~~~Program Ends~~~~~~~~~~~~~s");// 34
                System.out.println("");
                System.exit(0);
                break;
              default:
                System.out.println("Invalid choice");
                break;
              }
              break;
            case 2:
              System.out.println(" \n ---Add Book... (without any spaces in between)---");
              System.out.print("Enter the book title :> ");
              String nbt = sc.next();// uip book title
              System.out.print("Enter the Accession Number :> ");
              String nba = sc.next();// uip acc no
              System.out.print("Enter the name of the Publisher :> ");
              String nbp = sc.next();// uip publ
              Calendar c = Calendar.getInstance();
              String s = "  " + "Added on: " + (c.get(Calendar.DATE)) + " - " + (c.get(Calendar.MONTH)) + " - "
                  + (c.get(Calendar.YEAR)) + "  " + (c.get(Calendar.HOUR)) + ":" + (c.get(Calendar.MINUTE)) + ":"
                  + (c.get(Calendar.SECOND));
              char ch = nba.charAt(0);
              if (ch == 'A') {
                FileWriter Itfr = new FileWriter("Title.nvs", true);
                BufferedWriter Itbr = new BufferedWriter(Itfr);
                FileWriter IIafr = new FileWriter("AccessionNumber.nvs", true);
                BufferedWriter IIabr = new BufferedWriter(IIafr);
                FileWriter IIIpfr = new FileWriter("Publisher.nvs", true);
                BufferedWriter IIIpbr = new BufferedWriter(IIIpfr);
                Itbr.newLine();
                Itbr.write(nbt);
                IIabr.newLine();
                IIabr.write(nba);
                IIIpbr.newLine();
                IIIpbr.write(nbp);
                Itbr.close();
                IIabr.close();
                IIIpbr.close();
                bw.newLine();
                bw.write(nbt + "  " + nba + "  " + nbp + "  " + s);
                bw.close();
                System.out.println("\n Book Added.");
              } else {
                System.out.println("\n Book not added due to invalid Accession number. ");
              }
              break;
            case 3:
              for (int l = 0;; l++) {
                System.out.println(" \n---Preferences... ---");
                System.out.println("\t Note: !Restarting of the program is required if any change is made.!");
                System.out.println("1 for Change Password");
                System.out.println("2 for Wipe !Books List! File");
                System.out.println("3 for BookList BACKUP");
                System.out.println("4 for BookList Restore");
                System.out.println("5 for exit.");
                System.out.print("Enter your choice :> ");
                int prefint = sc.nextInt();
                printeR();
                switch (prefint) {
                case 1:
                  System.out.println(" \n ---Change Password---");
                  System.out.print("Enter Current password :> ");
                  String ipcp = sc.next();
                  System.out.print("Enter new Password :> ");
                  String ipnp1 = sc.next();
                  System.out.print("Enter new Password again :> ");
                  String ipnp2 = sc.next();
                  if (ipcp.equals(fipk)) {
                    if (ipnp1.equals(ipnp2)) {
                      System.out.println("Changing Password...");
                      FileWriter keyr = new FileWriter("protected.nvs");
                      BufferedWriter k = new BufferedWriter(keyr);
                      k.write(l1);
                      k.newLine();
                      k.write(l2);
                      k.newLine();
                      k.write(l3);
                      k.newLine();
                      k.write("Administrator");
                      k.newLine();
                      k.write(l5);
                      k.newLine();
                      k.write(l6);
                      k.newLine();
                      k.write(ipnp2);
                      k.close();
                      System.out.println("Password Changed!.");
                    }
                  } else {
                    System.out.println("Password not matching or invalid.");
                  }
                  break;
                case 2:
                  System.out.println(" \n ---Wipe !Books List! File---");
                  System.out.print("Type WIPE in UpperCase to wipe the file. :>");
                  String uipwipe = sc.next();
                  String wipe = "WIPE";
                  if (wipe.equals(uipwipe)) {
                    FileWriter fw0 = new FileWriter("db.nvs");
                    BufferedWriter bw0 = new BufferedWriter(fw0);
                    bw0.newLine();
                    bw0.write("");
                  }
                  System.out.println("File Wiped !.");
                  break;
                case 3:
                  System.out.println(" \n ---BookList BACKUP---");
                  System.out.print("Enter the File Name :> ");
                  String uif = sc.next();
                  String uifn = uif + ".nvs";
                  FileReader bfr = new FileReader("db.nvs");
                  FileWriter bbw = new FileWriter(uifn);
                  BufferedWriter ffw = new BufferedWriter(bbw);
                  BufferedReader bbr = new BufferedReader(bfr);
                  String text;
                  while ((text = bbr.readLine()) != null) {
                    ffw.newLine();
                    ffw.write(text);
                  }
                  ffw.close();
                  System.out.println("Backed up to " + uifn);
                  break;
                case 4:
                  System.out.println(" \n ---BookList Restore---");
                  System.out.print("Enter the backup file name without \".nvs\" :> ");
                  String bfn = sc.next();
                  String conv = bfn + ".nvs";
                  FileReader frr = new FileReader(conv);
                  FileWriter fwr = new FileWriter("db.nvs");
                  BufferedReader brr = new BufferedReader(frr);
                  String rtxt;
                  BufferedWriter bwr = new BufferedWriter(fwr);
                  while ((rtxt = brr.readLine()) != null) {
                    bwr.newLine();
                    bwr.write(rtxt);
                  }
                  bwr.close();
                  System.out.println(" BookList Restored!.");
                  break;
                case 5:
                  System.out.println("\ns~~~~~~~~~Logging Out~~~~~~~~~~~~~~s");// 32
                  System.out.println("");
                  System.out.println("s~~~~~~~~~Quitting Program~~~~~~~~~s");// 38
                  System.out.println("");
                  System.out.println("s~~~~~~~~~Program Ends~~~~~~~~~~~~~s");// 34
                  System.out.println("");
                  System.exit(0);
                  break;
                default:
                  System.out.println("Invalid choice");
                  break;
                }
              }
            case 4:
              System.out.println("\ns~~~~~~~~~Logging Out~~~~~~~~~~~~~~s");// 32
              System.out.println("");
              System.out.println("s~~~~~~~~~Quitting Program~~~~~~~~~s");// 38
              System.out.println("");
              System.out.println("s~~~~~~~~~Program Ends~~~~~~~~~~~~~s");// 34
              System.out.println("");
              System.exit(0);
              break;
            }
          }
        } else if ((iun.equals("Guest")) & (iuk.equals("LFPS"))) {
          System.out.println("\n\nLogged in as " + l5 + ".");
          for (int unlim = 0;; unlim++) {
            System.out.println("Press: ");
            System.out.println(" 1 for Search in Books List");
            System.out.println(" 2 for Exit.");
            System.out.print("Enter your choice :> ");
            int uic2 = sc.nextInt();
            printeR();
            switch (uic2) {
            case 1:
              for (int ul2 = 0;; ul2++) {
                System.out.println(" \n ---Search in Books List---");
                System.out.println(" Press:");
                System.out.println(" 1 for Display BooksList");
                System.out.println(" 2 for Search in BooksList");
                System.out.println(" 3 for exit");
                System.out.print(" Enter your choice:> ");
                int uic3 = sc.nextInt();
                printeR();
                switch (uic3) {
                case 1:
                  System.out.println("\n Displaying BooksList...");
                  FileReader fr10 = new FileReader("db.nvs");
                  BufferedReader br10 = new BufferedReader(fr10);
                  String rtexte;
                  while ((rtexte = br10.readLine()) != null) {
                    System.out.println(rtexte);
                  }
                  fr10.close();
                  break;
                case 2:
                  System.out.println("---Search Menu... ---");
                  System.out.println("\n Press: ");
                  System.out.println(" 1 for Search in Titles");
                  System.out.println(" 2 for Search in AccessionNumbers");
                  System.out.println(" 3 for Search in Publisher");
                  System.out.println(" 4 for Exit");
                  System.out.print(" Enter your choice:> ");
                  int uiscg = sc.nextInt();
                  printeR();
                  switch (uiscg) {
                  case 1:
                    System.out.println("\n ---Searching in Titles---");
                    FileReader sfr4 = new FileReader("Title.nvs");
                    BufferedReader sbr4 = new BufferedReader(sfr4);
                    System.out.print("Enter the Title :> ");
                    String title4 = sc.next();
                    String fiv4;
                    int lnum4 = 0;
                    int par4 = 0;
                    System.out.println("Searching for :> " + title4);
                    while ((fiv4 = sbr4.readLine()) != null) {
                      lnum4++;
                      if (title4.equalsIgnoreCase(fiv4)) {
                        System.out.println("\n\n --------------");
                        System.out.println("Book Found.");
                        par4++;
                        System.out.println("Found in line number: " + lnum4);
                        break;
                      }
                    }
                    if (par4 == 0 | par4 < 0) {
                      System.out.println("Book Not Found.");
                    }
                    break;
                  case 2:
                    System.out.println("\n ---Searching in AccessionNumbers---");
                    FileReader sfr5 = new FileReader("AccessionNumber.nvs");
                    BufferedReader sbr5 = new BufferedReader(sfr5);
                    System.out.print("Enter the AccessionNumber :> ");
                    String accnum5 = sc.next();
                    String fiv5;
                    int lnum5 = 0;
                    int par5 = 0;
                    System.out.println("Searching for :> " + accnum5);
                    while ((fiv5 = sbr5.readLine()) != null) {
                      lnum5++;
                      if (accnum5.equalsIgnoreCase(fiv5)) {
                        System.out.println("\n\n --------------");
                        System.out.println("Book Found.");
                        par5++;
                        System.out.println("Found in line number: " + lnum5);
                        break;
                      }
                    }
                    if (par5 == 0 | par5 < 0) {
                      System.out.println("Book Not Found.");
                    }
                    break;
                  case 3:
                    System.out.println("\n ---Searching in Publishers---");
                    FileReader sfr6 = new FileReader("Publisher.nvs");
                    BufferedReader sbr6 = new BufferedReader(sfr6);
                    System.out.print("Enter the Publisher Name :> ");
                    String pubname6 = sc.next();
                    String fiv6;
                    int lnum6 = 0;
                    int par6 = 0;
                    System.out.println("Searching for :> " + pubname6);
                    while ((fiv6 = sbr6.readLine()) != null) {
                      lnum6++;
                      if (pubname6.equalsIgnoreCase(fiv6)) {
                        System.out.println("\n\n --------------");
                        System.out.println("Book Found.");
                        par6++;
                        System.out.println("Found in line number: " + lnum6);
                        break;
                      }
                    }
                    if (par6 == 0 | par6 < 0) {
                      System.out.println("Book Not Found.");
                    }
                    break;
                  }
                  break;
                case 3:
                  System.out.println("\ns~~~~~~~~~Logging Out~~~~~~~~~~~~~~s");// 32
                  System.out.println("");
                  System.out.println("s~~~~~~~~~Quitting Program~~~~~~~~~s");// 38
                  System.out.println("");
                  System.out.println("s~~~~~~~~~Program Ends~~~~~~~~~~~~~s");// 34
                  System.out.println("");
                  System.exit(0);
                  break;

                default:
                  System.out.println("Invalid choice");
                  break;
                }
              }
            case 2:
              System.out.println("\ns~~~~~~~~~Logging Out~~~~~~~~~~~~~~s");// 32
              System.out.println("");
              System.out.println("s~~~~~~~~~Quitting Program~~~~~~~~~s");// 38
              System.out.println("");
              System.out.println("s~~~~~~~~~Program Ends~~~~~~~~~~~~~s");// 34
              System.out.println("");
              System.exit(0);
              break;
            default:
              System.out.println("Invalid choice");
              break;
            }
          }
        } else {
          System.out.println("\n \nError.!? File Corrupted or Invalid Password or Invalid UserName.");
          printeR();
        }
      }
    }
  }
}