//this is a class that basically indexes all the movies so that if you get the input for a number
//it returns a Movie object with the title and the category
//will need to instantiate this object so that we can return the movies in this list

public class MovieIO {
	
	//static method that returns a certain type of Movie object
	//this method is specific to the class as a whole (static)
    public static Movie getMovie(int index) {
    	
        switch (index) {
            case 1:
                return new Movie("Citizen Kane", "drama", 1);
            case 2:
                return new Movie("Casablanca", "drama", 2);
            case 3:
                return new Movie("The Godfather", "drama", 3);
            case 4:
                return new Movie("Gone With The Wind", "drama", 4);
            case 5:
                return new Movie("Lawrence Of Arabia", "drama", 5);
            case 6:
                return new Movie("The Wizard Of Oz", "musical", 6);
            case 7:
                return new Movie("The Graduate", "drama", 7);
            case 8:
                return new Movie("On The Waterfront", "drama", 8);
            case 9:
                return new Movie("Schindler's List", "drama", 9);
            case 10:
                return new Movie("Singin' In The Rain", "musical", 10);
            case 11:
                return new Movie("It's A Wonderful Life", "drama", 11);
            case 12:
                return new Movie("Sunset Boulevard", "drama", 12);
            case 13:
                return new Movie("The Bridge On The River Kwai", "drama", 13);
            case 14:
                return new Movie("Some Like It Hot", "drama", 14);
            case 15:
                return new Movie("Star Wars", "scifi", 15);
            case 16:
                return new Movie("All About Eve", "drama", 16);
            case 17:
                return new Movie("The African Queen", "drama", 17);
            case 18:
                return new Movie("Psycho" , "horror", 18);
            case 19:
                return new Movie("Chinatown", "drama", 19);
            case 20:
                return new Movie("One Flew Over The Cuckoo's Nest", "drama", 20);
            case 21:
                return new Movie("The Grapes Of Wrath", "drama", 21);
            case 22:
                return new Movie("2001: A Space Odyssey", "scifi", 22);
            case 23:
                return new Movie("The Maltese Falcon", "drama", 23);
            case 24:
                return new Movie("Raging Bull", "drama", 24);
            case 25:
                return new Movie("E.T. The extra-terrestrial", "scifi", 25);
            case 26:
                return new Movie("Dr. Strangelove", "drama", 26);
            case 27:
                return new Movie("Bonnie And Clyde", "drama", 27);
            case 28:
                return new Movie("Apocalypse Now", "drama", 28);
            case 29:
                return new Movie("Mr. Smith Goes to Washington", "drama", 29);
            case 30:
                return new Movie("The Treasure Of The Sierra Madre", "drama", 30);
            case 31:
                return new Movie("Annie Hall", "comedy", 31);
            case 32:
                return new Movie("The Godfather Part II", "drama", 32);
            case 33:
                return new Movie("High Noon", "drama", 33);
            case 34:
                return new Movie("To Kill A Mockingbird", "drama", 34);
            case 35:
                return new Movie("It Happened One Night", "drama", 35);
            case 36:
                return new Movie("Midnight Cowboy", "drama", 36);
            case 37:
                return new Movie("The Best Years Of Our Lives", "drama", 37);
            case 38:
                return new Movie("Double Indemnity", "drama", 38);
            case 39:
                return new Movie("Doctor Zhivago", "drama", 39);
            case 40:
                return new Movie("North By Northwest", "drama", 40);
            case 41:
                return new Movie("West Side Story", "musical", 41);
            case 42:
                return new Movie("Rear Window", "drama", 42);
            case 43:
                return new Movie("King Kong", "horror", 43);
            case 44:
                return new Movie("The Birth Of A Nation", "drama", 44);
            case 45:
                return new Movie("A Streetcar Named Desire", "drama", 45);
            case 46:
                return new Movie("A Clockwork Orange", "scifi", 46);
            case 47:
                return new Movie("Taxi Driver", "drama", 47);
            case 48:
                return new Movie("Jaws", "horror", 48);
            case 49:
                return new Movie("Snow White And The Seven Dwarfs", "animated", 49);
            case 50:
                return new Movie("Butch Cassidy And The Sundance Kid", "drama", 50);
            case 51:
                return new Movie("The Philadelphia Story", "drama", 51);
            case 52:
                return new Movie("From Here To Eternity", "drama", 52);
            case 53:
                return new Movie("Amadeus", "drama", 53);
            case 54:
                return new Movie("All Quiet On The Western Front", "drama", 54);
            case 55:
                return new Movie("The Sound Of Music", "musical", 55);
            case 56:
                return new Movie("M*A*S*H", "comedy", 56);
            case 57:
                return new Movie("The Third Man", "drama", 57);
            case 58:
                return new Movie("Fantasia", "animated", 58);
            case 59:
                return new Movie("Rebel Without A Cause", "drama", 59);
            case 60:
                return new Movie("Raiders Of The Lost Ark", "drama", 60);
            case 61:
                return new Movie("Vertigo", "drama", 61);
            case 62:
                return new Movie("Tootsie", "comedy", 62);
            case 63:
                return new Movie("Stagecoach", "drama", 63);
            case 64:
                return new Movie("Close Encounters Of The Third Kind", "scifi", 64);
            case 65:
                return new Movie("The Silence Of The Lambs", "horror", 65);
            case 66:
                return new Movie("Network", "drama", 66);
            case 67:
                return new Movie("The Manchurian Candidate", "drama", 67);
            case 68:
                return new Movie("An American In Paris", "drama", 68);
            case 69:
                return new Movie("Shane", "drama", 69);
            case 70:
                return new Movie("The French Connection", "drama", 70);
            case 71:
                return new Movie("Forrest Gump", "drama", 71);
            case 72:
                return new Movie("Ben-Hur", "drama", 72);
            case 73:
                return new Movie("Wuthering Heights", "drama", 73);
            case 74:
                return new Movie("The Gold Rush", "drama", 74);
            case 75:
                return new Movie("Dances With Wolves", "drama", 75);
            case 76:
                return new Movie("City Lights", "drama", 76);
            case 77:
                return new Movie("American Graffiti", "drama", 77);
            case 78:
                return new Movie("Rocky", "drama", 78);
            case 79:
                return new Movie("The Deer Hunter", "drama", 79);
            case 80:
                return new Movie("The Wild Bunch", "drama", 80);
            case 81:
                return new Movie("Modern Times", "drama", 81);
            case 82:
                return new Movie("Giant", "drama", 82);
            case 83:
                return new Movie("Platoon", "drama", 83);
            case 84:
                return new Movie("Fargo", "drama", 84);
            case 85:
                return new Movie("Duck Soup", "comedy", 85);
            case 86:
                return new Movie("Mutiny On The Bounty", "drama", 86);
            case 87:
                return new Movie("Frankenstein", "horror", 87);
            case 88:
                return new Movie("Easy Rider", "drama", 88);
            case 89:
                return new Movie("Patton", "drama", 89);
            case 90:
                return new Movie("The Jazz Singer", "drama", 90);
            case 91:
                return new Movie("My Fair Lady", "musical", 91);
            case 92:
                return new Movie("A Place In The Sun", "drama", 92);
            case 93:
                return new Movie("The Apartment", "drama", 93);
            case 94:
                return new Movie("Goodfellas", "drama", 94);
            case 95:
                return new Movie("Pulp Fiction", "drama", 95);
            case 96:
                return new Movie("The Searchers", "drama", 96);
            case 97:
                return new Movie("Bringing Up Baby", "drama", 97);
            case 98:
                return new Movie("Unforgiven", "drama", 98);
            case 99:
                return new Movie("Guess Who's Coming To Dinner", "drama", 99);
            case 100:
                return new Movie("Yankee Doodle Dandy", "musical", 100);
            default:
                return new Movie("NO SUCH MOVIE", "", 0);
        }
    }
}