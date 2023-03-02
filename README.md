# Final-Project
import java.util.Scanner;

public class Picking {
//this project is a decision tree for choosing a book. To choose type what is in the brackets.
//It starts by decciding between fiction and non-fiction 
        public static void main(String[] args ){
        Library l = new Library();
        String[] choiceone = {"fiction", "non-fiction"}; //these arrays are all the decision keywords referenced in the if statements below
        String[] choicetwo = {"real world", "fantasy world","biography","something else"};
        String[] choicethree = {"historical","contemporary","sci-fi","fantasy","dystopian","autobiography","memoir","true crime","no"};
        String[] choicefour = {"real people","make believe","essays","different"};
        String[] choicefive = {"young adult","adult","magical realism","horror","travel","food","something else"};
        String[] choicesix = {"romance", "mystery", "science", "history"};
    
        //this is the decision tree part of code. It can be confusing to navigate so the comments hopefully will help.
        //the comments that say "go to" are part of the brances for routes to different books
        //when the comment just says a genre of name of book that bit of code is where a book suggestion is made 
        System.out.println("Welcome to the book generator! To begin please choose between [fiction] and [non-fiction]. To select an option please type what is in the brackets.");
        Scanner in = new Scanner(System.in);
        String pickone = in.nextLine();
        if (choiceone[0].equals(pickone.toLowerCase())) {//goes through the fiction route
            System.out.println("Great! Now choose between a book in the [real world] or a [fantasy world]");
                String picktwoa = in.nextLine();
            if (choicetwo[0].equals(picktwoa.toLowerCase())) {//goes to real world instead of fantasy world
                System.out.println("[Historical] or [Contemporary]?");
                String pickthreeb = in.nextLine();
                if (choicethree[1].equals(pickthreeb.toLowerCase())) {//goes to contemporary
                    System.out.println("Do you want a book with all [real people] or some [make believe]");
                    String pickfourb = in.nextLine();
                    if (choicefour[0].equals(pickfourb.toLowerCase())) {//goes to real people
                        System.out.println("Awesome! Now a [Young Adult] or [Adult] book?");
                        String pickfiveb = in.nextLine();
                        if (choicefive[1].equals(pickfiveb.toLowerCase())) {//goes to adult
                            System.out.println("Almost done, now pick between [Romance] and [Mystery]");
                            String picksixb = in.nextLine();
                            if (choicesix[1].equals(picksixb.toLowerCase())) {
                                System.out.println(l.findBook(3));//mystery
                                } else if (choicesix[0].equals(picksixb.toLowerCase())) {
                                    System.out.println(l.findBook(6)); } // romance 
                            } else if (choicefive[0].equals(pickfiveb.toLowerCase())) {
                                System.out.println(l.findBook(8)); } //YA 
                        } else if (choicefour[1].equals(pickfourb.toLowerCase())) {
                            System.out.println("Cool, do you prefer [magical realism] or [horror]?");
                            String pickfivec = in.nextLine();
                            if (choicefive[2].equals(pickfivec.toLowerCase())) {
                                System.out.println(l.findBook(7));//magical realism 
                            } else if (choicefive[3].equals(pickfivec.toLowerCase())) {
                                System.out.println(l.findBook(4));//it, horror 
                            }
                        }
                     } else if (choicethree[0].equals(pickthreeb.toLowerCase())) {
                            System.out.println(l.findBook(5)); // historical fiction
                        } 
                                      
                    } else if (choicetwo[1].equals(picktwoa.toLowerCase())) {//go to route if chose fantasy world instead of real world
                            System.out.println("Which would you prefer [sci-fi], [fantasy], or [dystopian]?");
                            String pickthreec = in.nextLine();
                            if (choicethree[2].equals(pickthreec.toLowerCase())) {
                                System.out.println(l.findBook(1)); //scifi
                            } else if (choicethree[3].equals(pickthreec.toLowerCase())) {
                                System.out.println(l.findBook(0)); //fantasy
                            } else if (choicethree[4].equals(pickthreec.toLowerCase())) {
                                System.out.println(l.findBook(2)); //dystopian
                            }     
                    }            
            } else if (choiceone[1].equals(pickone.toLowerCase())) { //go to nonfiction route 
                System.out.println("Awesome, do you want [biography] or [something else]?");
                String picktwod = in.nextLine();
                 if (choicetwo[2].equals(picktwod.toLowerCase())) {//go to biography choice
                    System.out.println("Do you want a [Autobiography] or [Memoir]?");
                    String pickthreeg = in.nextLine();
                    if (choicethree[6].equals(pickthreeg.toLowerCase())) {
                        System.out.println(l.findBook(9));//memoir
                        }else if (choicethree[5].equals(pickthreeg.toLowerCase())) {
                            System.out.println(l.findBook(10));//autobiography
                        } else if (choicefive[4].equals(pickone.toLowerCase()))
                        System.out.println(l.findBook(11));//travel
                    } if (choicetwo[3].equals(picktwod.toLowerCase())) {
                    System.out.println("Okay something else. Do you like [true crime] or [no]?"); //go to route if dont chose biography
                    String pickthreei = in.nextLine();
                    if (choicethree[7].equals(pickthreei.toLowerCase())){ 
                        System.out.println(l.findBook(15));//true crime book 
                    } if (choicethree[8].equals(pickthreei.toLowerCase())) {//go to no true crime route
                        System.out.println("Do you want a book of [essays] or something [different]");
                        String pickfoure =in.nextLine();
                        if (choicefour[3].equals(pickfoure.toLowerCase())) {
                            System.out.println("Do you want a [travel] book, a book about [food] or [something else]"); //go to travel, food, or else route
                            String pickfiveg = in.nextLine();
                            if (choicefive[6].equals(pickfiveg.toLowerCase())) {
                                System.out.println("Okay last choice a book about [science] or one about [history]?"); //go to route of science or history
                                String picksixc = in.nextLine();
                                if (choicesix[2].equals(picksixc.toLowerCase())) {
                                    System.out.println(l.findBook(13));//science book
                                } else if (choicesix[3].equals(picksixc.toLowerCase())) {
                                        System.out.println(l.findBook(14));//history
                                    } 
                            }
                            else if (choicefive[4].equals(pickfiveg.toLowerCase())) {
                                System.out.println(l.findBook(11));//travel
                            } else if (choicefive[5].equals(pickfiveg.toLowerCase())) {
                                System.out.println(l.findBook(12));//food 
                                }
                            }  else if (choicefour[2].equals(pickfoure.toLowerCase())) {
                                System.out.println(l.findBook(16));//essay
                            }                       
                        }
                    }
                }
            }
        }


    
        
    

