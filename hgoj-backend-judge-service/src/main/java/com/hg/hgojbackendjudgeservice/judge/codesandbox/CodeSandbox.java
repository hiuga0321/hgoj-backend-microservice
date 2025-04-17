package com.hg.hgojbackendjudgeservice.judge.codesandbox;

import com.hg.hgojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.hg.hgojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
