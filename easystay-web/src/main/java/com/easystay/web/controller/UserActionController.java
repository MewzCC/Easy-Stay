package com.easystay.web.controller;

import com.easystay.annotation.RecordUserMessage;
import com.easystay.entity.constants.Constants;
import com.easystay.entity.enums.MessageTypeEnum;
import com.easystay.entity.po.UserAction;
import com.easystay.entity.vo.ResponseVO;
import com.easystay.service.UserActionService;
import com.easystay.web.annotation.GlobalInterceptor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * 用户行为 点赞、评论 Controller
 */
@RestController("userActionController")
@RequestMapping("/userAction")
public class UserActionController extends ABaseController {

    @Resource
    private UserActionService userActionService;

    @RequestMapping("doAction")
    @RecordUserMessage(messageType = MessageTypeEnum.LIKE)
    @GlobalInterceptor(checkLogin = true)
    public ResponseVO doAction(@NotEmpty String videoId,
                               @NotEmpty Integer actionType,
                               @Max(2) @Min(1) Integer actionCount,
                               Integer commentId) {
        UserAction userAction = new UserAction();
        userAction.setUserId(getTokenUserInfoDto().getUserId());
        userAction.setVideoId(videoId);
        userAction.setActionType(actionType);
        actionCount = actionCount == null ? Constants.ONE : actionCount;
        userAction.setActionCount(actionCount);
        commentId = commentId == null ? 0 : commentId;
        userAction.setCommentId(commentId);
        userActionService.saveAction(userAction);
        return getSuccessResponseVO(null);
    }

}