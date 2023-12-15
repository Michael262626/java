import java.util.Scanner;

public class NokiaPhone{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);

System.out.println("1.Phone book");
System.out.println("2.Messages");
System.out.println("3.Chat");
System.out.println("4.Call Register");
System.out.println("5.Tones");
System.out.println("6.Settings");
System.out.println("7.Call Divert");
System.out.println("8.Games");
System.out.println("9.Calculator");
System.out.println("10.Reminders");
System.out.println("11.Clock");
System.out.println("12.Profiles");
System.out.println("13.Sim services");

System.out.print("Select a number 1 - 13: ");
int number = scanner.nextInt();

if(number == 1){
System.out.println("1.Search");
System.out.println("2.Services Nos");
System.out.println("3.Add Name");
System.out.println("4.Erase");
System.out.println("5.Edit");
System.out.println("6.Assign tone");
System.out.println("7.Send B' Card");
System.out.println("8.Options");
System.out.println("9.Speed Dials");
System.out.println("10.Voice Tags");

while(number2 > 0 || number2 <= 10){
System.out.print("Select a number 1 - 10: ");
number2 = scanner.nextInt();

if(number2 == 1){
System.out.println("Search");
}
else if(number2 == 2){
System.out.println("Service Nos");
}
else if(number2 == 3){
System.out.println("Add Name");
}
else if(number2 == 4){
System.out.println("Erase");
}
else if(number2 == 5){
System.out.println("Edit");
}
else if(number2 == 6){
System.out.println("Assign tone");
}
else if(number2 == 7){
System.out.println("Send B' Card");
}
else if(number2 == 8){
System.out.println("Options");
System.out.println("1.Type of view");
System.out.println("2.Memory status");
}
else if(number2 == 9){
System.out.println("Speed Dials");
}
else if(number2 == 10){
System.out.println("Voice Tags");
}

else{
System.out.println("Invalid number");
System.out.println("Please re-enter from 1 -10 :)");
}
}
}

System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();

if(number == 2){
System.out.println("1.Write messages");
System.out.println("2.Inbox");
System.out.println("3.Outbox");
System.out.println("4.Picture messages");
System.out.println("5.Templates");
System.out.println("6.Smileys");
System.out.println("7.Messages settings");
System.out.println("8.Info serivces");
System.out.println("9.Voice mailbox number");
System.out.println("10.Services command editor");

System.out.print("Select a number form 1-7: ");
int number3 = scanner.nextInt();

if(number3 == 1){
System.out.println("Write messages");
}
else if(number3 == 2){
System.out.println("Inbox");
}
else if(number3 == 3){
System.out.println("Outbox");
}
else if(number3 == 4){
System.out.println("Picture messages");
}
else if(number3 == 5){
System.out.println("Templates");
}
else if(number3 == 6){
System.out.println("Smileys");
}
else if(number3 == 7){
System.out.println("Message settings");
System.out.print("1.Set");
System.out.println	("1.Message center number");
System.out.println	("2.Messages sent as");
System.out.println	("3.Message validity");
System.out.print("2.Common");
System.out.println	("1.Delivery reports");
System.out.println	("2.Reply via same centre");
System.out.print	("3.Character support");
}

else if(number3 == 8){
System.out.print("Info service");
}
else if(number3 == 9){
System.out.print("Voice mailbox number");
}
else if(number3 == 10){
System.out.print("Service command editor");
}
else{
System.out.println("Invalid number");
System.out.println("Please re-enter from 1 - 10 :)");
}
}

if(number == 3){
System.out.print("Chat");
}

System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();

if(number == 4){
System.out.println("1.Missed calls");
System.out.println("2.Received calls");
System.out.println("3.Dialled numbers");
System.out.println("4.Erase recent call lists");
System.out.println("5.Show call duration");
System.out.println("6.Show call costs");
System.out.println("7.Call cost settings");
System.out.println("8.Prepaid credit");

System.out.print("Select a number from 1-8: ");
int number4 = scanner.nextInt();

if(number4 == 1){
System.out.println("Missed calls");
}
else if(number4 == 2){
System.out.println("Received calls");
}
else if(number4 == 3){
System.out.println("Dialled numbers");
}
else if(number4 == 4){
System.out.println("Erase recent call lists");
}
else if(number4 == 5){
System.out.println("1.last call duration");
System.out.println("2.All calls's duration");
System.out.println("3.Clear counters");
}
else if(number4 == 6){
System.out.println("1.Last call cost");
System.out.println("2.All call's cost");
System.out.println("3.Clear counters");
}
else if(number4 == 7){
System.out.println("Call cost limit");
System.out.println("Show cost in");
}
else if(number4 == 8){
System.out.println("Prepaid credit");
}
}

System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();
if(number == 5){
System.out.println("1.Ringing tone");
System.out.println("2.Ringing volume");
System.out.println("3.Incoming call alert");
System.out.println("4.Composer");
System.out.println("5.Message alert tone");
System.out.println("6.Keypad tones");
System.out.println("7.Warning and game tones");
System.out.println("8.Vibrating alert");
System.out.println("9.Screen saver");

System.out.print("Select a number 1-9: ");
int number5 = scanner.nextInt();

if(number5 == 1){
System.out.println("Ringing tone");
}
else if(number5 == 2){
System.out.println("Ringing volume");
}
else if(number5 == 3){
System.out.println("Incoming call alert");
}
else if(number5 == 4){
System.out.println("Composer");
}
else if(number5 == 5){
System.out.println("Message alert tone");
}
else if(number5 == 6){
System.out.println("Keypad tones");
}
else if(number5 == 7){
System.out.println("Warning and game tones");
}
else if(number5 == 8){
System.out.println("Vibrating alert");
}
else if(number5 == 9){
System.out.println("Screen saver");
}
}

System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();
if(number == 6){
System.out.println("1.Call settings");
System.out.println("2.Phone settings");
System.out.println("3.Security settings");
System.out.println("4.Restore factory settings");

System.out.print("Select a number 1-4: ");
int number6 = scanner.nextInt();
if(number6 == 1){
System.out.println("1.Automatic redial");
System.out.println("2.Speed dialling");
System.out.println("3.Call waiting options");
System.out.println("4.Own number sending");
System.out.println("5.Phone line in use");
System.out.println("Automatic answer");
}
else if(number6 == 2){
System.out.println("1.Language");
System.out.println("2.Cell info display");
System.out.println("3.Welcome note");
System.out.println("4.Network selection");
System.out.println("5.lights");
System.out.println("6.Confirm SIM service actions");
}
else if(number6 == 3){
System.out.println("1.PIN code request");
System.out.println("2.Call baring services");
System.out.println("3.Fixed dialling");
System.out.println("4.Closed user group");
System.out.println("5.Phone security");
System.out.println("6.Change access codes");
}
else if(number6 == 4){
System.out.println("Restore factory settings");
}
}

System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();
if(number == 7){
System.out.println("Call divert");
}
System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();

if(number == 8){
System.out.println("Games");
}
System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();

if(number == 9){
System.out.println("Calculator");
}
System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();

if(number == 10){
System.out.println("Remainder");
}
System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();

if(number == 11){
System.out.print("1.Alarm clock");
System.out.println("2.Clock settings");
System.out.println("3.Date setting");
System.out.println("4.Stop watch");
System.out.println("5.Count down timer");
System.out.println("6.Auto update of date and time");
}
System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();

if(number == 12){
System.out.println("Profiles");
}

System.out.print("Select a number 1 - 13: ");
number = scanner.nextInt();

if(number == 13){
System.out.println("SIM services");
}



}


}



