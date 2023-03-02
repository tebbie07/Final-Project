public class Library {

//this is the library array of all the books. They are indexed below and added to the array in the method "public library" below
private Book[] collection;
private Book tLtWatW = new Book("The Lion the Witch and the Wardrobe", "C.S. Lewis", "Fantasy"); //0
private Book tHGttG = new Book("The Hitchhiker’s Guide to the Galaxy", "Douglas Adams", "Sci-Fi");//1
private Book tHG = new Book("The Hunger Games", "Suzanne Collins", "Dystopian"); //2
private Book tHotB = new Book("The Hound of the Baskervilles", "Arthur Conan Doyle", "Mystery"); //3
private Book It = new Book("It", "Stephen King", "Horror"); //4
private Book Cc = new Book("To Kill A Mockingbird", "Harper Lee", "Historical Fiction");//5
private Book OLS = new Book("One Last Stop", "Casey McQuiston", "Romance"); //6
private Book aHYoS = new Book("A Hundred Years of Solitude","Gabriel García Márquez","Magical Realism");//7
private Book tFioS = new Book("The Fault In Our Stars", "John Green", "Young Adult");//8
private Book BC = new Book("Becoming", "Michelle Obama", "Memoir");//9
private Book TDoYG = new Book("The Diary of Young Girl", "Anne Frank", "Autobiography");//10
private Book iTA = new Book("Into Thin Air", "John Krakauer","Travel");//11
private Book SaWH = new Book("Salt: A World History", "Mark Kurlansky", "Food");//12
private Book AfPiaH = new Book("Astrophysics for People in a Hurry", "Neil deGrasse Tyson", "Science");//13
private Book HtHaEaHotGUS = new Book("How to Hide an Empire: A History of the Greater United States","Daniel Immerwahr", "History");//14
private Book iCB = new Book("In Cold Blood", "Truman Capote", "True Crime");//15
private Book ETWCtWYT = new Book("101 Essays That Will Change The Way You Think", "Brianna Wiest", "Essays");//16


public Library(){
Book[] c = {tLtWatW, tHGttG, tHG, tHotB, It, Cc, OLS, aHYoS, tFioS, BC, TDoYG, iTA, SaWH, AfPiaH, HtHaEaHotGUS, iCB, ETWCtWYT}; 
this.collection = c;
}

public Book findBook(int i){
return this.collection[i];
}
}
