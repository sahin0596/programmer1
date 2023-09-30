package ms2aop.ms2aop.Controller;

import lombok.RequiredArgsConstructor;
import ms2aop.ms2aop.Dto.GoodDto;
import ms2aop.ms2aop.Service.GoodService;
import ms2aop.ms2aop.Service.GoodServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/good")
public class GoodController {
    private final GoodServiceImp goodServiceImp;


    @GetMapping("/1")
    public GoodDto sayGood1(){
        return goodServiceImp.sayGood1("azerbaijan");
    }

    @GetMapping("/2")
    public GoodDto sayGood2(){
        return goodServiceImp.sayGood2();
    }
    @GetMapping("/3")
    public GoodDto sayGood3(){
        return goodServiceImp.sayGood3();
    }
}
