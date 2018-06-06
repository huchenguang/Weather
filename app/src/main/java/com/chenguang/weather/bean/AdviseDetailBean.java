package com.chenguang.weather.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.chenguang.weather.adapter.AdviseDetailAdapter;
import com.chenguang.weather.adapter.AdviseTitleAdapter;

import java.util.List;

/**
 * Created by hcg on 2018/5/5.
 */

public class AdviseDetailBean {
    /**
     * cards : [{"cardId":"3","cornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"",
     * "channelId":"","packageName":"","type":"","url":"","useSystemBrowser":"true"},"text":""},
     * "type":"tip"},"isVisible":"false",
     * "list":[{"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"",
     * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
     * .com/article/0IyPg4BD?s=misafe","useSystemBrowser":"false"},"text":""},"type":"tip"},
     * "wtrDataId":"0IyPg4BD","wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"",
     * "summary":"","template":"","title":"","type":""},"wtrImges":["http://i1.go2yd
     * .com/corpimage.php?url=0IyPg4o1uN&type=_270x190&source=mibrowser","http://i1.go2yd
     * .com/corpimage.php?url=0IyPg4LtrN&type=_270x190&source=mibrowser","http://i1.go2yd
     * .com/corpimage.php?url=0IyPg4GgYH&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"",
     * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
     * .com/article/0IyPg4BD?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"",
     * "wtrResource":"潮品先锋","wtrStatKey":"wtrId:331327",
     * "wtrSummary":"下面的30个上班族穿搭建议多少能解决你的困扰，你可以将这些建议作为参考，以后每天就不会为穿什么去上班而纠结啦。",
     * "wtrTitle":"穿什么去上班？30个适合都市白领的穿搭"},"rowType":"item","template":"31","type":"3"},
     * {"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"",
     * "packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyPY8dp?s=misafe",
     * "useSystemBrowser":"false"},"text":""},"type":"tip"},"wtrDataId":"0IyPY8dp",
     * "wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"","summary":"","template":"",
     * "title":"","type":""},"wtrImges":["http://i1.go2yd.com/corpimage
     * .php?url=0IyPY8jmBh&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyPY8iQpk&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyPY8G1ff&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"",
     * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
     * .com/article/0IyPY8dp?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"",
     * "wtrResource":"潮品先锋","wtrStatKey":"wtrId:331328",
     * "wtrSummary
     * ":"很多女孩都在流行浪尖翻滚摸爬，想要做个十足的时尚达人，永远不背离流行方向。不过，女孩们往往容易被时下的流行冲昏头，弄巧成拙，不仅穿得没有很时尚，反而让自己看起来很滑稽。",
     * "wtrTitle":"不做时尚小丑：你不能犯的5个穿搭错误"},"rowType":"item","template":"31","type":"3"},
     * {"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"",
     * "packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyOiGBx?s=misafe",
     * "useSystemBrowser":"false"},"text":""},"type":"tip"},"wtrDataId":"0IyOiGBx",
     * "wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"","summary":"","template":"",
     * "title":"","type":""},"wtrImges":["http://i1.go2yd.com/corpimage
     * .php?url=0IyOiGVRx4&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyOiG163D&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyOiGYtH4&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"",
     * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
     * .com/article/0IyOiGBx?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"",
     * "wtrResource":"时尚的小灰机","wtrStatKey":"wtrId:331329",
     * "wtrSummary":"上身随处可见的轻松感，本期让我宠爱的T恤，穿上整个人很有气色的感觉，吸晴的地方在于背后nike字母。",
     * "wtrTitle":"这件Nike耐克背后nike字母tee能搭配各种单品！"},"rowType":"item","template":"31","type":"3"},
     * {"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"",
     * "packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyOYln0?s=misafe",
     * "useSystemBrowser":"false"},"text":""},"type":"tip"},"wtrDataId":"0IyOYln0",
     * "wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"","summary":"","template":"",
     * "title":"","type":""},"wtrImges":["http://i1.go2yd.com/corpimage
     * .php?url=0IyOYlwO5W&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyOYlHDuZ&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyOYll82F&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"",
     * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
     * .com/article/0IyOYln0?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"",
     * "wtrResource":"街拍丘比特","wtrStatKey":"wtrId:331330",
     * "wtrSummary":"连衣裙是春夏必备单品，不需要上下复杂的搭配，一件单品就能出街，而且，连衣裙的飘逸感，很能表现女孩的柔美，一起来看看最近杭州的美女都穿了什么连衣裙吧。",
     * "wtrTitle":"杭州街拍：美女最近穿了这些漂亮的连衣裙"},"rowType":"item","template":"31","type":"3"},
     * {"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"",
     * "packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyONOMW?s=misafe",
     * "useSystemBrowser":"false"},"text":""},"type":"tip"},"wtrDataId":"0IyONOMW",
     * "wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"","summary":"","template":"",
     * "title":"","type":""},"wtrImges":["http://i1.go2yd.com/corpimage
     * .php?url=0IyONOFdxO&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyONOw8Fs&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyONOrlwo&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"",
     * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
     * .com/article/0IyONOMW?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"",
     * "wtrResource":"中国新闻网","wtrStatKey":"wtrId:331331",
     * "wtrSummary":"5月4日晚，主题为\u201c文创西藏\u201d的时装秀在南京老门东历史文化街区上演，为现场观众带来了将民族艺术与现代时尚相融合的藏元素时装展示。",
     * "wtrTitle":"藏元素时装秀亮相南京"},"rowType":"item","template":"31","type":"3"},
     * {"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"",
     * "packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyM6VZV?s=misafe",
     * "useSystemBrowser":"false"},"text":""},"type":"tip"},"wtrDataId":"0IyM6VZV",
     * "wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"","summary":"","template":"",
     * "title":"","type":""},"wtrImges":["http://i1.go2yd.com/corpimage
     * .php?url=0IyM6V3RhQ&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyM6Vhv4l&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
     * .php?url=0IyM6VKdHQ&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"",
     * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
     * .com/article/0IyM6VZV?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"",
     * "wtrResource":"新华网","wtrStatKey":"wtrId:331332",
     * "wtrSummary":"春天太短暂，一秒入夏随时都会发生。时髦的女孩们都开始露腿了，近期一组女明星的机场秀足以说明这一点。",
     * "wtrTitle":"一秒入夏！跟时尚小花们学习如何穿短裤"},"rowType":"item","template":"31","type":"3"}],
     * "statKey":"","summary":"","template":"1","title":"自动爬取"}]
     * channelId : 4010
     * layoutId : 3
     * status : 0
     * testName : 自动爬取
     */

    public String channelId;
    public String layoutId;
    public String status;
    public String testName;
    public List<CardsBean> cards;

    public static class CardsBean {
        /**
         * cardId : 3
         * cornerMark : {"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"",
         * "packageName":"","type":"","url":"","useSystemBrowser":"true"},"text":""},"type":"tip"}
         * isVisible : false
         * list : [{"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"",
         * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
         * .com/article/0IyPg4BD?s=misafe","useSystemBrowser":"false"},"text":""},"type":"tip"},
         * "wtrDataId":"0IyPg4BD","wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"",
         * "summary":"","template":"","title":"","type":""},"wtrImges":["http://i1.go2yd
         * .com/corpimage.php?url=0IyPg4o1uN&type=_270x190&source=mibrowser","http://i1.go2yd
         * .com/corpimage.php?url=0IyPg4LtrN&type=_270x190&source=mibrowser","http://i1.go2yd
         * .com/corpimage.php?url=0IyPg4GgYH&type=_270x190&source=mibrowser"],
         * "wtrLink":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb
         * .yidianzixun.com/article/0IyPg4BD?s=misafe","useSystemBrowser":"false"},
         * "wtrPublishTime":"","wtrResource":"潮品先锋","wtrStatKey":"wtrId:331327",
         * "wtrSummary":"下面的30个上班族穿搭建议多少能解决你的困扰，你可以将这些建议作为参考，以后每天就不会为穿什么去上班而纠结啦。",
         * "wtrTitle":"穿什么去上班？30个适合都市白领的穿搭"},"rowType":"item","template":"31","type":"3"},
         * {"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"",
         * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
         * .com/article/0IyPY8dp?s=misafe","useSystemBrowser":"false"},"text":""},"type":"tip"},
         * "wtrDataId":"0IyPY8dp","wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"",
         * "summary":"","template":"","title":"","type":""},"wtrImges":["http://i1.go2yd
         * .com/corpimage.php?url=0IyPY8jmBh&type=_270x190&source=mibrowser","http://i1.go2yd
         * .com/corpimage.php?url=0IyPY8iQpk&type=_270x190&source=mibrowser","http://i1.go2yd
         * .com/corpimage.php?url=0IyPY8G1ff&type=_270x190&source=mibrowser"],
         * "wtrLink":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb
         * .yidianzixun.com/article/0IyPY8dp?s=misafe","useSystemBrowser":"false"},
         * "wtrPublishTime":"","wtrResource":"潮品先锋","wtrStatKey":"wtrId:331328",
         * "wtrSummary":"很多女孩都在流行浪尖翻滚摸爬，想要做个十足的时尚达人，永远不背离流行方向。不过，女孩们往往容易被时下的流行冲昏头，弄巧成拙，不仅穿得没有很时尚，反而让自己看起来很滑稽。","wtrTitle":"不做时尚小丑：你不能犯的5个穿搭错误"},"rowType":"item","template":"31","type":"3"},{"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyOiGBx?s=misafe","useSystemBrowser":"false"},"text":""},"type":"tip"},"wtrDataId":"0IyOiGBx","wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"","summary":"","template":"","title":"","type":""},"wtrImges":["http://i1.go2yd.com/corpimage.php?url=0IyOiGVRx4&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage.php?url=0IyOiG163D&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage.php?url=0IyOiGYtH4&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyOiGBx?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"","wtrResource":"时尚的小灰机","wtrStatKey":"wtrId:331329","wtrSummary":"上身随处可见的轻松感，本期让我宠爱的T恤，穿上整个人很有气色的感觉，吸晴的地方在于背后nike字母。","wtrTitle":"这件Nike耐克背后nike字母tee能搭配各种单品！"},"rowType":"item","template":"31","type":"3"},{"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyOYln0?s=misafe","useSystemBrowser":"false"},"text":""},"type":"tip"},"wtrDataId":"0IyOYln0","wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"","summary":"","template":"","title":"","type":""},"wtrImges":["http://i1.go2yd.com/corpimage.php?url=0IyOYlwO5W&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage.php?url=0IyOYlHDuZ&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage.php?url=0IyOYll82F&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyOYln0?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"","wtrResource":"街拍丘比特","wtrStatKey":"wtrId:331330","wtrSummary":"连衣裙是春夏必备单品，不需要上下复杂的搭配，一件单品就能出街，而且，连衣裙的飘逸感，很能表现女孩的柔美，一起来看看最近杭州的美女都穿了什么连衣裙吧。","wtrTitle":"杭州街拍：美女最近穿了这些漂亮的连衣裙"},"rowType":"item","template":"31","type":"3"},{"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyONOMW?s=misafe","useSystemBrowser":"false"},"text":""},"type":"tip"},"wtrDataId":"0IyONOMW","wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"","summary":"","template":"","title":"","type":""},"wtrImges":["http://i1.go2yd.com/corpimage.php?url=0IyONOFdxO&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage.php?url=0IyONOw8Fs&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage.php?url=0IyONOrlwo&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyONOMW?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"","wtrResource":"中国新闻网","wtrStatKey":"wtrId:331331","wtrSummary":"5月4日晚，主题为\u201c文创西藏\u201d的时装秀在南京老门东历史文化街区上演，为现场观众带来了将民族艺术与现代时尚相融合的藏元素时装展示。","wtrTitle":"藏元素时装秀亮相南京"},"rowType":"item","template":"31","type":"3"},{"data":{"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyM6VZV?s=misafe","useSystemBrowser":"false"},"text":""},"type":"tip"},"wtrDataId":"0IyM6VZV","wtrHeadData":{"iconImgUrl":"","imgUrl":"","reserved":"","summary":"","template":"","title":"","type":""},"wtrImges":["http://i1.go2yd.com/corpimage.php?url=0IyM6V3RhQ&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage.php?url=0IyM6Vhv4l&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage.php?url=0IyM6VKdHQ&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"","channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun.com/article/0IyM6VZV?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"","wtrResource":"新华网","wtrStatKey":"wtrId:331332","wtrSummary":"春天太短暂，一秒入夏随时都会发生。时髦的女孩们都开始露腿了，近期一组女明星的机场秀足以说明这一点。","wtrTitle":"一秒入夏！跟时尚小花们学习如何穿短裤"},"rowType":"item","template":"31","type":"3"}]
         * statKey :
         * summary :
         * template : 1
         * title : 自动爬取
         */

        public String cardId;
        public CornerMarkBean cornerMark;
        public String isVisible;
        public String statKey;
        public String summary;
        public String template;
        public String title;
        public List<ListBean> list;

        public static class CornerMarkBean {
            /**
             * cornerData : {"imgUrl":"","link":{"appUrl":"","channelId":"","packageName":"",
             * "type":"","url":"","useSystemBrowser":"true"},"text":""}
             * type : tip
             */

            public CornerDataBean cornerData;
            public String type;

            public static class CornerDataBean {
                /**
                 * imgUrl :
                 * link : {"appUrl":"","channelId":"","packageName":"","type":"","url":"",
                 * "useSystemBrowser":"true"}
                 * text :
                 */

                public String imgUrl;
                public LinkBean link;
                public String text;

                public static class LinkBean {
                    /**
                     * appUrl :
                     * channelId :
                     * packageName :
                     * type :
                     * url :
                     * useSystemBrowser : true
                     */

                    public String appUrl;
                    public String channelId;
                    public String packageName;
                    public String type;
                    public String url;
                    public String useSystemBrowser;
                }
            }
        }

        public static class ListBean implements MultiItemEntity {
            /**
             * data : {"wtrCornerMark":{"cornerData":{"imgUrl":"","link":{"appUrl":"",
             * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
             * .com/article/0IyPg4BD?s=misafe","useSystemBrowser":"false"},"text":""},
             * "type":"tip"},"wtrDataId":"0IyPg4BD","wtrHeadData":{"iconImgUrl":"","imgUrl":"",
             * "reserved":"","summary":"","template":"","title":"","type":""},
             * "wtrImges":["http://i1.go2yd.com/corpimage
             * .php?url=0IyPg4o1uN&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
             * .php?url=0IyPg4LtrN&type=_270x190&source=mibrowser","http://i1.go2yd.com/corpimage
             * .php?url=0IyPg4GgYH&type=_270x190&source=mibrowser"],"wtrLink":{"appUrl":"",
             * "channelId":"","packageName":"","type":"1","url":"http://mb.yidianzixun
             * .com/article/0IyPg4BD?s=misafe","useSystemBrowser":"false"},"wtrPublishTime":"",
             * "wtrResource":"潮品先锋","wtrStatKey":"wtrId:331327",
             * "wtrSummary":"下面的30个上班族穿搭建议多少能解决你的困扰，你可以将这些建议作为参考，以后每天就不会为穿什么去上班而纠结啦。",
             * "wtrTitle":"穿什么去上班？30个适合都市白领的穿搭"}
             * rowType : item
             * template : 31
             * type : 3
             */

            public DataBean data;
            public String rowType;
            public String template;
            public String type;

            @Override
            public int getItemType() {
                if (data.wtrImges.size() == 1) {
                    return AdviseDetailAdapter.TYPE_ONE;
                } else {
                    return AdviseDetailAdapter.TYPE_THREE;
                }
            }

            public static class DataBean {
                /**
                 * wtrCornerMark : {"cornerData":{"imgUrl":"","link":{"appUrl":"","channelId":"",
                 * "packageName":"","type":"1","url":"http://mb.yidianzixun
                 * .com/article/0IyPg4BD?s=misafe","useSystemBrowser":"false"},"text":""},
                 * "type":"tip"}
                 * wtrDataId : 0IyPg4BD
                 * wtrHeadData : {"iconImgUrl":"","imgUrl":"","reserved":"","summary":"",
                 * "template":"","title":"","type":""}
                 * wtrImges : ["http://i1.go2yd.com/corpimage
                 * .php?url=0IyPg4o1uN&type=_270x190&source=mibrowser","http://i1.go2yd
                 * .com/corpimage.php?url=0IyPg4LtrN&type=_270x190&source=mibrowser",
                 * "http://i1.go2yd.com/corpimage
                 * .php?url=0IyPg4GgYH&type=_270x190&source=mibrowser"]
                 * wtrLink : {"appUrl":"","channelId":"","packageName":"","type":"1",
                 * "url":"http://mb.yidianzixun.com/article/0IyPg4BD?s=misafe",
                 * "useSystemBrowser":"false"}
                 * wtrPublishTime :
                 * wtrResource : 潮品先锋
                 * wtrStatKey : wtrId:331327
                 * wtrSummary : 下面的30个上班族穿搭建议多少能解决你的困扰，你可以将这些建议作为参考，以后每天就不会为穿什么去上班而纠结啦。
                 * wtrTitle : 穿什么去上班？30个适合都市白领的穿搭
                 */

                public WtrCornerMarkBean wtrCornerMark;
                public String wtrDataId;
                public WtrHeadDataBean wtrHeadData;
                public WtrLinkBean wtrLink;
                public String wtrPublishTime;
                public String wtrResource;
                public String wtrStatKey;
                public String wtrSummary;
                public String wtrTitle;
                public List<String> wtrImges;

                public static class WtrCornerMarkBean {
                    /**
                     * cornerData : {"imgUrl":"","link":{"appUrl":"","channelId":"",
                     * "packageName":"","type":"1","url":"http://mb.yidianzixun
                     * .com/article/0IyPg4BD?s=misafe","useSystemBrowser":"false"},"text":""}
                     * type : tip
                     */

                    public CornerDataBeanX cornerData;
                    public String type;

                    public static class CornerDataBeanX {
                        /**
                         * imgUrl :
                         * link : {"appUrl":"","channelId":"","packageName":"","type":"1",
                         * "url":"http://mb.yidianzixun.com/article/0IyPg4BD?s=misafe",
                         * "useSystemBrowser":"false"}
                         * text :
                         */

                        public String imgUrl;
                        public LinkBeanX link;
                        public String text;

                        public static class LinkBeanX {
                            /**
                             * appUrl :
                             * channelId :
                             * packageName :
                             * type : 1
                             * url : http://mb.yidianzixun.com/article/0IyPg4BD?s=misafe
                             * useSystemBrowser : false
                             */

                            public String appUrl;
                            public String channelId;
                            public String packageName;
                            public String type;
                            public String url;
                            public String useSystemBrowser;
                        }
                    }
                }

                public static class WtrHeadDataBean {
                    /**
                     * iconImgUrl :
                     * imgUrl :
                     * reserved :
                     * summary :
                     * template :
                     * title :
                     * type :
                     */

                    public String iconImgUrl;
                    public String imgUrl;
                    public String reserved;
                    public String summary;
                    public String template;
                    public String title;
                    public String type;
                }

                public static class WtrLinkBean {
                    /**
                     * appUrl :
                     * channelId :
                     * packageName :
                     * type : 1
                     * url : http://mb.yidianzixun.com/article/0IyPg4BD?s=misafe
                     * useSystemBrowser : false
                     */

                    public String appUrl;
                    public String channelId;
                    public String packageName;
                    public String type;
                    public String url;
                    public String useSystemBrowser;
                }
            }
        }
    }
}
