package com.muratyildirim.app.ozelkodlar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratyildirim.app.ozelkodlar.dto.OzelKodlarDTO;

import java.util.List;

@RestController
public class OzelKodlarController {

    @Autowired
    OzelKodlarService ozelKodlarService;

    @GetMapping("/api/v1/ozelkodlar3")
    List<OzelKodlarDTO> getAllOzelKodlar3() {
        return ozelKodlarService.getOzelKod3();
    }

}
