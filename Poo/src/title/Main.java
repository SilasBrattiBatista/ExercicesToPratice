package title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Title> titles = new ArrayList<>();
        Title firstTitle = new Title();
        Title secondTitle = new Title();
        Title thirdTitle = new Title();
        firstTitle.setName("Anaconda");
        secondTitle.setName("MI");
        thirdTitle.setName("Baby Driver");

        titles.add(firstTitle);
        titles.add(secondTitle);
        titles.add(thirdTitle);

        Collections.sort(titles);
        for (Title title : titles) {
            System.out.println(title.getName());
        }
    }
}
