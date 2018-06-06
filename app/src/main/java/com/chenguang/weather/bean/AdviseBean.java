package com.chenguang.weather.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hcg on 2018/4/30 14:33
 */
public class AdviseBean implements Serializable {
    /**
     * testName : 想看视频B
     * channelId : 1050
     * status : 0
     * layoutId : 23
     * cards : [{"cardId":"36","summary":"","template":"1","title":"天气视频","isVisible":"false",
     * "cornerMark":{"cornerData":{"imgUrl":"","text":"","link":{"appUrl":"",
     * "useSystemBrowser":"true","packageName":"","channelId":"","type":"","url":""}},
     * "type":"tip"},"list":[{"rowType":"item","template":"12","data":{"wtrResource":"小米想看视频",
     * "wtrPublishTime":"","wtrTitle":"天气视频","wtrSummary":"全国最新天气预报，天气变化早知道。",
     * "wtrImges":["https://cdn.cnbj1.fds.api.mi-img.com/xvideo-activity/afternoongif4.gif"],
     * "wtrCornerMark":{"cornerData":{"imgUrl":"","text":"","link":{"appUrl":"http://hybrid.miui
     * .com/app/com.xiangkan.android
     * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath%3Dtianqi
     * &__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A%2F
     * %2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa",
     * "useSystemBrowser":"false","packageName":"com.miui.hybrid","channelId":"","type":"2",
     * "url":"http://hybrid.miui.com/app/com.xiangkan.android
     * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath%3Dtianqi
     * &__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A%2F
     * %2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa"}},
     * "type":"tip"},"wtrHeadData":{"template":"","summary":"","imgUrl":"","title":"",
     * "iconImgUrl":"","type":"","reserved":""},"wtrStatKey":"想看视频B",
     * "wtrLink":{"appUrl":"http://hybrid.miui.com/app/com.xiangkan.android
     * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath%3Dtianqi
     * &__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A%2F
     * %2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa",
     * "useSystemBrowser":"false","packageName":"com.miui.hybrid","channelId":"","type":"2",
     * "url":"http://hybrid.miui.com/app/com.xiangkan.android
     * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath%3Dtianqi
     * &__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A%2F
     * %2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa"},
     * "wtrDataId":"20170413121222844"},"type":"1"}],"statKey":"想看视频B"},{"cardId":"31",
     * "summary":"","template":"2","title":"宫格卡片","isVisible":"false",
     * "cornerMark":{"cornerData":{"imgUrl":"","text":"","link":{"appUrl":"",
     * "useSystemBrowser":"true","packageName":"","channelId":"","type":"","url":""}},
     * "type":"tip"},"list":[{"rowType":"item","template":"13","data":{"wtrType":"6-生活指数",
     * "wtrTitle":"适宜衬衫","wtrSummary":"今天走酷炫科技范儿？还是文艺小清新？","wtrImges":["http://f4.market.xiaomi
     * .com/download/MiSafe/001a2c4210f6944e83427fd96c3216666b4de8646/a.webp"],
     * "wtrIndexType":"clothing","wtrHeadData":{"summary":"今天走酷炫科技范儿？还是文艺小清新？",
     * "imgUrl":"https://sec-cdn.static.xiaomi
     * .net/secStatic/imgs/1ca075a5c5ed765e5dce1222dc5c3516864b8cc8.png","detail":[],
     * "title":"适宜衬衫","iconImgUrl":"http://f4.market.xiaomi
     * .com/download/MiSafe/001a2c4210f6944e83427fd96c3216666b4de8646/a.webp"},
     * "wtrStatKey":"clothing","wtrLink":{"channelId":"4010","type":"3"},"wtrExtra":""},
     * "type":"6"},{"rowType":"item","template":"13","data":{"wtrType":"6-生活指数",
     * "wtrTitle":"紫外线较弱","wtrSummary":"如果不下雨，那就愉快滴出门拥抱阳光吧！","wtrImges":["http://f4.market.xiaomi
     * .com/download/MiSafe/0779564bb576244883581fb0502d336b4ded98f67/a.webp"],
     * "wtrIndexType":"uvIndex","wtrHeadData":{"summary":"如果不下雨，那就愉快滴出门拥抱阳光吧！",
     * "imgUrl":"https://sec-cdn.static.xiaomi
     * .net/secStatic/imgs/ef8b1157161bf638e719288fe927ca8e5e947b95.png","detail":[],
     * "title":"紫外线较弱","iconImgUrl":"http://f4.market.xiaomi
     * .com/download/MiSafe/0779564bb576244883581fb0502d336b4ded98f67/a.webp"},
     * "wtrStatKey":"uvIndex","wtrLink":{"channelId":"4050","type":"3"},"wtrExtra":"SPF 15"},
     * "type":"6"},{"rowType":"item","template":"13","data":{"wtrType":"6-生活指数",
     * "wtrTitle":"宜室内运动","wtrSummary":"热浪滚滚，外出运动注意防晒消暑！","wtrImges":["http://f5.market.mi-img
     * .com/download/MiSafe/077954dbb67e2848df5815b05b8d3e6f4e5436036/a.webp"],
     * "wtrIndexType":"sports","wtrHeadData":{"summary":"热浪滚滚，外出运动注意防晒消暑！",
     * "imgUrl":"https://sec-cdn.static.xiaomi
     * .net/secStatic/imgs/89c9c5750936466b8ae844e938aa988c0b797e2e.png","detail":[],
     * "title":"宜室内运动","iconImgUrl":"http://f5.market.mi-img
     * .com/download/MiSafe/077954dbb67e2848df5815b05b8d3e6f4e5436036/a.webp"},
     * "wtrStatKey":"sports","wtrLink":{"channelId":"4040","type":"3"},"wtrExtra":""},
     * "type":"6"},{"rowType":"item","template":"13","data":{"wtrType":"6-生活指数",
     * "wtrTitle":"不宜洗车","wtrSummary":"在此期间不宜洗车，防止弄脏您的爱车。","wtrImges":["http://f1.market.xiaomi
     * .com/download/MiSafe/0579564bb576244883581fb0507d33674ded28f67/a.webp"],
     * "wtrIndexType":"carWash","wtrHeadData":{"summary":"在此期间不宜洗车，防止弄脏您的爱车。",
     * "imgUrl":"https://sec-cdn.static.xiaomi
     * .net/secStatic/imgs/224ad71d18f512accce3dcfb620456ec8c613149.png","detail":[],
     * "title":"不宜洗车","iconImgUrl":"http://f1.market.xiaomi
     * .com/download/MiSafe/0579564bb576244883581fb0507d33674ded28f67/a.webp"},
     * "wtrStatKey":"carWash","wtrLink":{"channelId":"4060","type":"3"},"wtrExtra":""},
     * "type":"6"},{"rowType":"item","template":"13","data":{"wtrType":"6-生活指数",
     * "wtrTitle":"有雨带伞","wtrSummary":"不喜欢雨中漫步的外出记得带伞。","wtrImges":["http://f3.market.xiaomi
     * .com/download/MiSafe/099c6a5f95e6640bc1d5bc171eeeb0f6ba00ac79a/a.webp"],
     * "wtrIndexType":"umbrella","wtrHeadData":{"summary":"不喜欢雨中漫步的外出记得带伞。",
     * "imgUrl":"https://sec-cdn.static.xiaomi
     * .net/secStatic/imgs/410601d632e4cab821b9e88909e3f200453022c3.png","detail":[],
     * "title":"有雨带伞","iconImgUrl":"http://f3.market.xiaomi
     * .com/download/MiSafe/099c6a5f95e6640bc1d5bc171eeeb0f6ba00ac79a/a.webp"},
     * "wtrStatKey":"umbrella","wtrLink":{"channelId":"4030","type":"3"},"wtrExtra":""},
     * "type":"6"}],"statKey":"宫格卡片"}]
     */

    public String testName;
    public String channelId;
    public String status;
    public String layoutId;
    public List<CardsBean> cards;

    public static class CardsBean implements Serializable{
        /**
         * cardId : 36
         * summary :
         * template : 1
         * title : 天气视频
         * isVisible : false
         * cornerMark : {"cornerData":{"imgUrl":"","text":"","link":{"appUrl":"",
         * "useSystemBrowser":"true","packageName":"","channelId":"","type":"","url":""}},
         * "type":"tip"}
         * list : [{"rowType":"item","template":"12","data":{"wtrResource":"小米想看视频",
         * "wtrPublishTime":"","wtrTitle":"天气视频","wtrSummary":"全国最新天气预报，天气变化早知道。",
         * "wtrImges":["https://cdn.cnbj1.fds.api.mi-img.com/xvideo-activity/afternoongif4.gif"],
         * "wtrCornerMark":{"cornerData":{"imgUrl":"","text":"","link":{"appUrl":"http://hybrid
         * .miui.com/app/com.xiangkan.android
         * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath
         * %3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A
         * %2F%2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa
         * ","useSystemBrowser":"false","packageName":"com.miui.hybrid","channelId":"",
         * "type":"2","url":"http://hybrid.miui.com/app/com.xiangkan.android
         * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath
         * %3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A
         * %2F%2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa
         * "}},"type":"tip"},"wtrHeadData":{"template":"","summary":"","imgUrl":"","title":"",
         * "iconImgUrl":"","type":"","reserved":""},"wtrStatKey":"想看视频B",
         * "wtrLink":{"appUrl":"http://hybrid.miui.com/app/com.xiangkan.android
         * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath
         * %3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A
         * %2F%2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa
         * ","useSystemBrowser":"false","packageName":"com.miui.hybrid","channelId":"",
         * "type":"2","url":"http://hybrid.miui.com/app/com.xiangkan.android
         * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath
         * %3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A
         * %2F%2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa
         * "},"wtrDataId":"20170413121222844"},"type":"1"}]
         * statKey : 想看视频B
         */

        public String cardId;
        public String summary;
        public String template;
        public String title;
        public String isVisible;
        public CornerMarkBean cornerMark;
        public String statKey;
        public List<ListBean> list;

        public static class CornerMarkBean implements Serializable {
            /**
             * cornerData : {"imgUrl":"","text":"","link":{"appUrl":"","useSystemBrowser":"true",
             * "packageName":"","channelId":"","type":"","url":""}}
             * type : tip
             */

            public CornerDataBean cornerData;
            public String type;

            public static class CornerDataBean implements Serializable{
                /**
                 * imgUrl :
                 * text :
                 * link : {"appUrl":"","useSystemBrowser":"true","packageName":"","channelId":"",
                 * "type":"","url":""}
                 */

                public String imgUrl;
                public String text;
                public LinkBean link;

                public static class LinkBean {
                    /**
                     * appUrl :
                     * useSystemBrowser : true
                     * packageName :
                     * channelId :
                     * type :
                     * url :
                     */

                    public String appUrl;
                    public String useSystemBrowser;
                    public String packageName;
                    public String channelId;
                    public String type;
                    public String url;
                }
            }
        }

        public static class ListBean implements Serializable{
            /**
             * rowType : item
             * template : 12
             * data : {"wtrResource":"小米想看视频","wtrPublishTime":"","wtrTitle":"天气视频",
             * "wtrSummary":"全国最新天气预报，天气变化早知道。","wtrImges":["https://cdn.cnbj1.fds.api.mi-img
             * .com/xvideo-activity/afternoongif4.gif"],
             * "wtrCornerMark":{"cornerData":{"imgUrl":"","text":"",
             * "link":{"appUrl":"http://hybrid.miui.com/app/com.xiangkan.android
             * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath
             * %3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb
             * =http%3A%2F%2Factivities.xk.miui
             * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa",
             * "useSystemBrowser":"false","packageName":"com.miui.hybrid","channelId":"",
             * "type":"2","url":"http://hybrid.miui.com/app/com.xiangkan.android
             * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath
             * %3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb
             * =http%3A%2F%2Factivities.xk.miui
             * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa"}},"type":"tip"},
             * "wtrHeadData":{"template":"","summary":"","imgUrl":"","title":"","iconImgUrl":"",
             * "type":"","reserved":""},"wtrStatKey":"想看视频B","wtrLink":{"appUrl":"http://hybrid
             * .miui.com/app/com.xiangkan.android
             * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath
             * %3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb
             * =http%3A%2F%2Factivities.xk.miui
             * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa",
             * "useSystemBrowser":"false","packageName":"com.miui.hybrid","channelId":"",
             * "type":"2","url":"http://hybrid.miui.com/app/com.xiangkan.android
             * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath
             * %3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb
             * =http%3A%2F%2Factivities.xk.miui
             * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa"},
             * "wtrDataId":"20170413121222844"}
             * type : 1
             */

            public String rowType;
            public String template;
            public DataBean data;
            public String type;

            public static class DataBean implements Serializable{
                /**
                 * wtrResource : 小米想看视频
                 * wtrPublishTime :
                 * wtrTitle : 天气视频
                 * wtrSummary : 全国最新天气预报，天气变化早知道。
                 * wtrImges : ["https://cdn.cnbj1.fds.api.mi-img
                 * .com/xvideo-activity/afternoongif4.gif"]
                 * wtrCornerMark : {"cornerData":{"imgUrl":"","text":"",
                 * "link":{"appUrl":"http://hybrid.miui.com/app/com.xiangkan.android
                 * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa
                 * %26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22
                 * %7D%7D&mifb=http%3A%2F%2Factivities.xk.miui
                 * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa",
                 * "useSystemBrowser":"false","packageName":"com.miui.hybrid","channelId":"",
                 * "type":"2","url":"http://hybrid.miui.com/app/com.xiangkan.android
                 * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa
                 * %26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22
                 * %7D%7D&mifb=http%3A%2F%2Factivities.xk.miui
                 * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa"}},"type":"tip"}
                 * wtrHeadData : {"template":"","summary":"","imgUrl":"","title":"",
                 * "iconImgUrl":"","type":"","reserved":""}
                 * wtrStatKey : 想看视频B
                 * wtrLink : {"appUrl":"http://hybrid.miui.com/app/com.xiangkan.android
                 * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa
                 * %26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22
                 * %7D%7D&mifb=http%3A%2F%2Factivities.xk.miui
                 * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa",
                 * "useSystemBrowser":"false","packageName":"com.miui.hybrid","channelId":"",
                 * "type":"2","url":"http://hybrid.miui.com/app/com.xiangkan.android
                 * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa
                 * %26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22
                 * %7D%7D&mifb=http%3A%2F%2Factivities.xk.miui
                 * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa"}
                 * wtrDataId : 20170413121222844
                 */

                public String wtrResource;
                public String wtrPublishTime;
                public String wtrTitle;
                public String wtrSummary;
                public WtrCornerMarkBean wtrCornerMark;
                public WtrHeadDataBean wtrHeadData;
                public String wtrStatKey;
                public WtrLinkBean wtrLink;
                public String wtrDataId;
                public List<String> wtrImges;

                public static class WtrCornerMarkBean implements Serializable{
                    /**
                     * cornerData : {"imgUrl":"","text":"","link":{"appUrl":"http://hybrid.miui
                     * .com/app/com.xiangkan.android
                     * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa
                     * %26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A
                     * %22tianqi%22%7D%7D&mifb=http%3A%2F%2Factivities.xk.miui
                     * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa",
                     * "useSystemBrowser":"false","packageName":"com.miui.hybrid","channelId":"",
                     * "type":"2","url":"http://hybrid.miui.com/app/com.xiangkan.android
                     * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa
                     * %26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A
                     * %22tianqi%22%7D%7D&mifb=http%3A%2F%2Factivities.xk.miui
                     * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa"}}
                     * type : tip
                     */

                    public CornerDataBeanX cornerData;
                    public String type;

                    public static class CornerDataBeanX implements Serializable{
                        /**
                         * imgUrl :
                         * text :
                         * link : {"appUrl":"http://hybrid.miui.com/app/com.xiangkan.android
                         * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa
                         * %26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A
                         * %22tianqi%22%7D%7D&mifb=http%3A%2F%2Factivities.xk.miui
                         * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa",
                         * "useSystemBrowser":"false","packageName":"com.miui.hybrid",
                         * "channelId":"","type":"2","url":"http://hybrid.miui.com/app/com
                         * .xiangkan.android
                         * .lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa
                         * %26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A
                         * %22tianqi%22%7D%7D&mifb=http%3A%2F%2Factivities.xk.miui
                         * .com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa"}
                         */

                        public String imgUrl;
                        public String text;
                        public LinkBeanX link;

                        public static class LinkBeanX implements Serializable{
                            /**
                             * appUrl : http://hybrid.miui.com/app/com.xiangkan.android.lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A%2F%2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa
                             * useSystemBrowser : false
                             * packageName : com.miui.hybrid
                             * channelId :
                             * type : 2
                             * url : http://hybrid.miui.com/app/com.xiangkan.android.lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A%2F%2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa
                             */

                            public String appUrl;
                            public String useSystemBrowser;
                            public String packageName;
                            public String channelId;
                            public String type;
                            public String url;
                        }
                    }
                }

                public static class WtrHeadDataBean implements Serializable{
                    /**
                     * template :
                     * summary :
                     * imgUrl :
                     * title :
                     * iconImgUrl :
                     * type :
                     * reserved :
                     */

                    public String template;
                    public String summary;
                    public String imgUrl;
                    public String title;
                    public String iconImgUrl;
                    public String type;
                    public String reserved;
                }

                public static class WtrLinkBean implements Serializable{
                    /**
                     * appUrl : http://hybrid.miui.com/app/com.xiangkan.android.lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A%2F%2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa
                     * useSystemBrowser : false
                     * packageName : com.miui.hybrid
                     * channelId :
                     * type : 2
                     * url : http://hybrid.miui.com/app/com.xiangkan.android.lite?path=%2FVideoDetail%3FvideoId%3Def6b1f3b33a98deb3a907489cd2a52fa%26fromPath%3Dtianqi&__SRC__=%7B%22internal%22%3A%7B%22scene%22%3A%22tianqi%22%7D%7D&mifb=http%3A%2F%2Factivities.xk.miui.com%2Fxk-weather%2F%3Fvid%3Def6b1f3b33a98deb3a907489cd2a52fa
                     */

                    public String appUrl;
                    public String useSystemBrowser;
                    public String packageName;
                    public String channelId;
                    public String type;
                    public String url;
                }
            }
        }
    }
}
