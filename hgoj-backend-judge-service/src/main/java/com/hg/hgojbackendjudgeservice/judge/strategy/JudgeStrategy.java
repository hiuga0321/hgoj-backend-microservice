package com.hg.hgojbackendjudgeservice.judge.strategy;


import com.hg.hgojbackendmodel.model.codesandbox.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
