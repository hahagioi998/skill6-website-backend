package cn.skill6.website.controller.video;

import cn.skill6.common.entity.vo.ResponseJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 视频
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-04 23:00
 */
@Slf4j
@RestController
@RequestMapping("/video")
public class VideoController {

    @GetMapping
    public ResponseJson getVideos(int pageSize, int pageNum) {
        return null;
    }

    @GetMapping("/{videoId}")
    public ResponseJson getVideoById(@PathVariable("videoId") Long videoId) {
        return null;
    }

}
