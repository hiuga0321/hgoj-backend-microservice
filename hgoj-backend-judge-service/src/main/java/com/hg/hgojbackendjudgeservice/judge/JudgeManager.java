package com.hg.hgojbackendjudgeservice.judge;

import com.hg.hgojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.hg.hgojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.hg.hgojbackendjudgeservice.judge.strategy.JudgeContext;
import com.hg.hgojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.hg.hgojbackendmodel.model.codesandbox.JudgeInfo;
import com.hg.hgojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
