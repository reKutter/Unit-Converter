package converter.unit_converter.controller;
import converter.unit_converter.dto.ConvertDto;
import converter.unit_converter.service.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serial;

@org.springframework.stereotype.Controller
public class Controller {
    Service service = new Service()     ;

    @GetMapping("/length")
    public String showLengthPage(){
        return "Length_page";
    }

    @GetMapping("/weight")
    public String showWeightPage(){
        return "Weight_page";
    }

    @GetMapping("/temperature")
    public String showTemperaturePage(){
        return "Temperature_page";
    }

    @PostMapping("/convert")
    public String convertUnits(ConvertDto convertDto, Model model){
        String logic = convertDto.getLogic();
        String fromUnit = convertDto.getFromUnit();
        String toUnit = convertDto.getToUnit();
        double value = convertDto.getInputValue();

        double conversionResult = 0;

        switch (logic){
            case "Length_page":{
                conversionResult = service.convertLength(fromUnit,toUnit,value);
                break;
            }
            case "Weight_page":{
                conversionResult = service.convertWeight(fromUnit,toUnit,value);
                break;
            }
            case "Temperature_page":{
                conversionResult = service.convertTemperature(fromUnit,toUnit,value);
                break;
            }
            default:{
                System.out.println("logic wasn\'t recognized");
                return "Length_page";
            }
        }
        model.addAttribute("conversionResult",conversionResult);
        model.addAttribute("postedValue",value);
        model.addAttribute("postedFromUnit",fromUnit);
        model.addAttribute("postedToUnit",toUnit);

        return logic;
    }


}
