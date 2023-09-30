package ms2aop.ms2aop.Service;

import lombok.RequiredArgsConstructor;
import ms2aop.ms2aop.Dto.GoodDto;
import org.springframework.stereotype.Service;

@Service

public interface GoodService {
    GoodDto sayGood1(String language);
    GoodDto sayGood2();
     GoodDto sayGood3();
}
