package com.funmix.seed.web;

import com.funmix.seed.core.Result;
import com.funmix.seed.core.ResultGenerator;
import com.funmix.seed.model.USER;
import com.funmix.seed.service.USERService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/09/25.
*/
@RestController
@RequestMapping("/u/s/e/r")
public class USERController {
    @Resource
    private USERService uSERService;

    @PostMapping
    public Result add(@RequestBody USER uSER) {
        uSERService.save(uSER);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        uSERService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody USER uSER) {
        uSERService.update(uSER);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        USER uSER = uSERService.findById(id);
        return ResultGenerator.genSuccessResult(uSER);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<USER> list = uSERService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
