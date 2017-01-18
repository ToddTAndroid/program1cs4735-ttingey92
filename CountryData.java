
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jim Ward for Cosc 4735 program 1
 */
public class CountryData {

    ArrayList<String> Continents;
    List<ArrayList<String>> listsoflist;

    /*
     * constructor to create the initial data.
     */
    CountryData() {
        Continents = new ArrayList<String>(Arrays.asList("africa", "asia", "europe", "north america", "oceania",
                "south america" , "Antarctica"  ));
        listsoflist = new ArrayList<ArrayList<String>>();
        //africa  0
        listsoflist.add(new ArrayList<String>(Arrays.asList(
                "Algeria", "Angola", "Benin", "Botswana", "Burkina", "Burundi", "Cameroon", "Cape Verde", "Central African Republic",
                "Chad", "Comoros", "Congo", "Congo, Democratic Republic of", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea",
                "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Ivory Coast", "Kenya", "Lesotho", "Liberia",
                "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger",
                "Nigeria", "Rwanda", "Sao Tome and Principe", "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa",
                "South Sudan", "Sudan", "Swaziland", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe"
        )));
        //"asia" 1
        listsoflist.add(new ArrayList<String>(Arrays.asList(
                "Afghanistan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", "Burma (Myanmar)", "Cambodia", "China", "East Timor",
                "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan", "Jordan", "Kazakhstan", "Korea, North", "Korea, South",
                "Kuwait", "Kyrgyzstan", "Laos", "Lebanon", "Malaysia", "Maldives", "Mongolia", "Nepal", "Oman", "Pakistan",
                "Philippines", "Qatar", "Russian Federation", "Saudi Arabia", "Singapore", "Sri Lanka", "Syria", "Tajikistan",
                "Thailand", "Turkey", "Turkmenistan", "United Arab Emirates", "Uzbekistan", "Vietnam", "Yemen"
        )));
        //"europe" 2
        listsoflist.add(new ArrayList<String>(Arrays.asList(
                "Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belarus", "Belgium",
                "Bosnia and Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark",
                "Estonia", "Finland", "France", "Georgia", "Germany", "Greece", "Hungary", "Iceland",
                "Ireland", "Italy", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia",
                "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands", "Norway", "Poland", "Portugal",
                "Romania", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland",
                "Ukraine", "United Kingdom", "Vatican City"
        )));
        //"north america" 3
        listsoflist.add(new ArrayList<String>(Arrays.asList(
                "Antigua and Barbuda", "Bahamas", "Barbados", "Belize", "Canada", "Costa Rica", "Cuba",
                "Dominica", "Dominican Republic", "El Salvador", "Grenada", "Guatemala", "Haiti", "Honduras",
                "Jamaica", "Mexico", "Nicaragua", "Panama", "Saint Kitts and Nevis", "Saint Lucia",
                "Saint Vincent and the Grenadines", "Trinidad and Tobago", "United States"
        )));
        //"oceania" 4
        listsoflist.add(new ArrayList<String>(Arrays.asList(
                "Australia", "Fiji", "Kiribati", "Marshall Islands", "Micronesia", "Nauru", "New Zealand",
                "Palau", "Papua New Guinea", "Samoa", "Solomon Islands", "Tonga", "Tuvalu", "Vanuatu"
        )));
        //"south america" 5
        listsoflist.add(new ArrayList<String>(Arrays.asList(
                "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela"
        )));
        //"Antarctica" 6
        listsoflist.add(new ArrayList<String>() );
    }

    /*
     * Simple method to add data to a list
     * The param are item and int list
     *   Which is say a "country" and then integer that is the correct Continent.
     */
    public boolean add(String item, int list) {
        if (list >=0 && list < Continents.size()) {
            listsoflist.get(list).add(item);
            return true;
        }
        return false;
    }

    /*
     * returns a list of countries for the Continent requested (continent is an integer)
     *
     */
    public List<String> getlist(int list) {
        if (list >=0 && list < Continents.size()) {
            return listsoflist.get(list);
        } else {
            return null;
        }
    }
    /*
     * this will convert a name of a continent to the correct integer number for the list.
     */
    public int name2num(String continent) {
        for (int i=0; i<Continents.size(); i++) {
            if (Continents.get(i).compareTo(continent) == 0) {
                return i;
            }
        }
        return -1;
    }

}
