package xin.wenjing.blogHao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

/**
 * 插件配置
 * @author: dreamChaser
 * @date: 2024年06月16日 00:01
 */
@AllArgsConstructor
public class Settings {

    /**
     * 幻灯片相关配置
     */
    @Data
    public static class SlideConfig{
        public final static String GROUP_NAME = "slideConfig";
        private boolean enableSlide;
        private String themeName;
        private SlidePlugin slidePlugin;
        private Individualization individualization;
    }

    /**
     * 复制追加配置
     */
    @Data
    public static class CopyAdd{
        public final static String GROUP_NAME = "copyAdd";
        private String copyAddContent;
        private String divideType;
        private String copyMinLength;
        private boolean contentPageOnly;
    }

    /**
     * 小工具配置
     */
    @Data
    public static class MiniTool{
        public final static String GROUP_NAME = "miniTools";
        private ContentIndent contentIndent;
    }

    /**
     * 小工具配置的子内容
     * 文章内容首行缩进
     */
    @Data
    public static class ContentIndent{
        private boolean enableContentIndent;
        private String indentNodeName;
    }

    /**
     * 幻灯片配置的子内容
     * 用于插件配置
     */
    @Data
    public static class SlidePlugin{
        private List<EnablePlugin> enablePlugin;
    }

    /**
     * 幻灯片配置的子内容
     * 用于插件配置的数据模型
     */
    @Data
    public static class EnablePlugin{
        private String pluginName;
    }

    /**
     * 幻灯片配置的子内容
     * 用于个性化配置的选项
     */
    @Data
    public static class Individualization{
        private boolean mouseWheel;
        private boolean loop;
        private boolean scrollView;
        private String scrollProgress;
    }

}
