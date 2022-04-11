package data1700.oblig2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    private final ArrayList<Billetter> billetter = new ArrayList<>();

    @PostMapping("/lagre")

    public void lagreKunde(Billetter innBillett) {
        billetter.add(innBillett);
    }

    @GetMapping("/hentAlle")
    public List<Billetter> hentAlle() {
        return billetter;
    }


    @GetMapping("/slettAlle")
    public void slettAlle() {
        billetter.clear();
    }
}
