package kz.dar.summerintership.controller;

import kz.dar.summerintership.model.CamundaTask;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history")
public class CamundaHistoryController {

    @PostMapping()
    public CamundaTask upsertHistory(@RequestBody CamundaTask task) {
        System.out.println(task);

        return task;
    }


}
