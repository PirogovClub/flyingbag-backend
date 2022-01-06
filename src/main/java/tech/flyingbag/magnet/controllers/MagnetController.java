package tech.flyingbag.magnet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.flyingbag.magnet.domain.MagnetMessage;
import tech.flyingbag.magnet.services.MagnetMessageService;

@RestController
public class MagnetController {


    @Autowired
    private MagnetMessageService magnetMessageService;



    @PostMapping("/api/v1/magnetMessage/get")
    public ResponseEntity<MagnetMessage> getMagnetMessage(@RequestBody MagnetMessage magnetMessage){
        try {
            MagnetMessage magnetMessageToReturn = magnetMessageService.getMagnetMessageFromProvider(magnetMessage);
            return new ResponseEntity<>(magnetMessageToReturn,HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
