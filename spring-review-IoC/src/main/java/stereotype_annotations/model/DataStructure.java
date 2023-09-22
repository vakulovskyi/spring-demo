package stereotype_annotations.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataStructure {

    @NonNull
    ExtraHours extraHours;

//    //@Autowired
//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }

    public void getTotalHours(){
        System.out.println("Total hours: "+(40+extraHours.getHours()));
    }
}
