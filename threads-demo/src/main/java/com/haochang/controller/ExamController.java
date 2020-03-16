package com.haochang.controller;

import com.haochang.event.StudentEvent;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by gaoyouzhi on 2020/3/7.
 */
@RestController
public class ExamController {

    private BlockingDeque blockingDeque = new LinkedBlockingDeque<>();

    private FutureTask futureTask = new FutureTask(new StudentEvent());

    private List<FutureTask> tasks = new ArrayList<>();


}
