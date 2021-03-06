package jp.ne.hyukke.wts.hello.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ワークスペースを操作するコントローラクラス.
 *
 * @author hyukke
 */
@Controller
@PreAuthorize("hasAnyRole('ROLE_SYSTEM_ADMIN', 'ROLE_USER_MANAGER', 'ROLE_USER')")
@RequestMapping("workspace")
public class WorkspaceController {

    /**
     * ビューを表示する.
     *
     * @param model モデル
     * @return ビュー
     */
    @RequestMapping(method = RequestMethod.GET, value = "reactjs")
    public String show() {

        return "workspace/reactjs/index";
    }

    /**
     * チュートリアルを表示する.
     *
     * @param model モデル
     * @return ビュー
     */
    @RequestMapping(method = RequestMethod.GET, value = "reactjs/tutorial")
    public String showTutorial() {

        return "workspace/reactjs/tutorial";
    }
}
