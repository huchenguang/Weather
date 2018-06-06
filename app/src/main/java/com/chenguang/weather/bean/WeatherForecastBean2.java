package com.chenguang.weather.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hcg on 2018/4/30.
 */

public class WeatherForecastBean2 implements Serializable {

    /**
     * indexes : [{"ext":{"icon":"http://static.etouch.cn/icon/chenlian.png","statsKey":"-1055"},
     * "valueV2":"较适宜晨练","name":"晨练指数","value":"较适宜",
     * "desc":"早晨气象条件较适宜晨练，但风力稍大，晨练时请注意选择避风的地点，避免迎风锻炼。"},{"ext":{"icon":"http://static.etouch
     * .cn/icon/tianqi.png","statsKey":"-1053"},"valueV2":"天气舒适","name":"穿衣指数","value":"舒适",
     * "desc":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"},{"ext":{"icon":"http://static.etouch
     * .cn/icon/shushidu.png","statsKey":"-1059"},"valueV2":"舒适","name":"舒适度指数","value":"舒适",
     * "desc":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"},{"ext":{"icon":"http://static.etouch
     * .cn/icon/ganmao.png","statsKey":"-1056"},"valueV2":"少发感冒","name":"感冒指数","value":"少发",
     * "desc":"各项气象条件适宜，无明显降温过程，发生感冒机率较低。"},{"ext":{"icon":"http://static.etouch
     * .cn/icon/ziwaixian.png","statsKey":"-1054"},"valueV2":"紫外线弱","name":"紫外线强度指数",
     * "link":"http://m.weathercn.com/index
     * .do?language=zh-cn&smartid=101010100&partner=1000001009","value":"弱",
     * "desc":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"},{"ext":{"icon":"http://static.etouch
     * .cn/icon/lvyou.png","statsKey":"-1057"},"valueV2":"适宜旅游","name":"旅游指数","link":"http://m
     * .weathercn.com/index.do?language=zh-cn&smartid=101010100&partner=1000001009","value":"适宜",
     * "desc":"天气较好，温度适宜，但风稍微有点大。这样的天气适宜旅游，您可以尽情地享受大自然的无限风光。"},{"ext":{"icon":"http://static
     * .etouch.cn/icon/xiche.png","statsKey":"-1052"},"valueV2":"较适宜洗车","name":"洗车指数",
     * "link":"http://m.weathercn.com/index
     * .do?language=zh-cn&smartid=101010100&partner=1000001009","value":"较适宜",
     * "desc":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},{"ext":{"icon":"http://static.etouch
     * .cn/icon/liangshai.png","statsKey":"-1058"},"valueV2":"适宜晾晒","name":"晾晒指数",
     * "link":"http://m.weathercn.com/index
     * .do?language=zh-cn&smartid=101010100&partner=1000001009","value":"适宜",
     * "desc":"天气不错，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！"},{"ext":{"icon":"","statsKey":""},
     * "valueV2":"较适宜钓鱼","name":"钓鱼指数","value":"较适宜","desc":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。"},
     * {"ext":{"icon":"","statsKey":""},"valueV2":"去油化妆","name":"化妆指数","value":"去油",
     * "desc":"天气较热，建议用露质面霜打底，水质无油粉底霜，透明粉饼，粉质胭脂。"},{"ext":{"icon":"","statsKey":""},
     * "valueV2":"较适宜运动","name":"运动指数","value":"较适宜",
     * "desc":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"},{"ext":{"icon":"","statsKey":""},
     * "valueV2":"不带伞","name":"雨伞指数","value":"不带伞","desc":"天气较好，不会降水，因此您可放心出门，无须带雨伞。"},
     * {"ext":{"icon":"","statsKey":""},"valueV2":"较适宜约会","name":"约会指数","value":"较适宜",
     * "desc":"虽然有点风，但情侣们可以放心外出，不用担心天气来调皮捣乱而影响了兴致。"}]
     * meta : {"circle_count":38804,"post_id":"501391","citykey":"101010100","city":"北京市",
     * "upper":"北京","html_url":"http://yun.rili.cn/tianqi/index.html?city=101010100",
     * "wcity":["w_101010100"],"up_time":"22:00","post_count":6747,"status":1000,
     * "desc":"看看离你最近的历友在哪里"}
     * weatherUrls : {"w_life_index_more":"http://m.weathercn.com/livingindex
     * .do?language=zh-cn&smartid=101010100&partner=1000001009#Indices","w_forecast_90":"http://m
     * .weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&partner=1000001009","w_gradual_hour":""}
     * forecast15 : [{"date":"20180508","sunrise":"05:08","high":27,"forecastUrl":"http://m
     * .weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=0&partner=1000001009","low":13,"sunset":"19:15",
     * "night":{"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,
     * "wd":"东南风","notice":"祝你有个晴朗的梦"},"aqi":68,"forecastAirUrl":"","day":{"wthr":"晴",
     * "bgPic":"http://static.etouch.cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static
     * .etouch.cn/imgs/upload/1505181366.5006.jpg","wp":"<3级","type":1,"wd":"南风",
     * "notice":"愿你拥有比阳光明媚的心情"}},{"date":"20180509","sunrise":"05:07","high":27,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=1&partner=1000001009","low":15,"sunset":"19:16",
     * "night":{"wthr":"多云","bgPic":"http://static.etouch.cn/imgs/upload/1505371467.4939.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284464.307.jpg","wp":"<3级","type":2,
     * "wd":"南风","notice":"夜晚多云，愿你梦里有月光"},"aqi":72,"forecastAirUrl":"","day":{"wthr":"晴",
     * "bgPic":"http://static.etouch.cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static
     * .etouch.cn/imgs/upload/1505181366.5006.jpg","wp":"3-4级","type":1,"wd":"南风",
     * "notice":"愿你拥有比阳光明媚的心情"}},{"date":"20180510","sunrise":"05:06","high":26,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=2&partner=1000001009","low":18,"sunset":"19:17",
     * "night":{"wthr":"多云","bgPic":"http://static.etouch.cn/imgs/upload/1505371467.4939.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284464.307.jpg","wp":"<3级","type":2,
     * "wd":"南风","notice":"夜晚多云，愿你梦里有月光"},"aqi":92,"forecastAirUrl":"","day":{"wthr":"多云",
     * "bgPic":"http://static.etouch.cn/imgs/upload/1505371463.3431.jpg","smPic":"http://static
     * .etouch.cn/imgs/upload/1505284459.5844.jpg","wp":"3-4级","type":2,"wd":"南风",
     * "notice":"阴晴之间，谨防紫外线侵扰"}},{"date":"20180511","sunrise":"05:05","high":25,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=3&partner=1000001009","low":15,"sunset":"19:18",
     * "night":{"wthr":"多云","bgPic":"http://static.etouch.cn/imgs/upload/1505371467.4939.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284464.307.jpg","wp":"<3级","type":2,
     * "wd":"东南风","notice":"夜晚多云，愿你梦里有月光"},"aqi":83,"forecastAirUrl":"","day":{"wthr":"阴",
     * "bgPic":"http://static.etouch.cn/imgs/upload/1505371479.5574.jpg","smPic":"http://static
     * .etouch.cn/imgs/upload/1505284484.5873.jpg","wp":"<3级","type":34,"wd":"南风",
     * "notice":"不要被阴云遮挡住好心情"}},{"date":"20180512","sunrise":"05:04","high":26,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=4&partner=1000001009","low":15,"sunset":"19:19",
     * "night":{"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,
     * "wd":"北风","notice":"祝你有个晴朗的梦"},"aqi":88,"forecastAirUrl":"","day":{"wthr":"多云",
     * "bgPic":"http://static.etouch.cn/imgs/upload/1505371463.3431.jpg","smPic":"http://static
     * .etouch.cn/imgs/upload/1505284459.5844.jpg","wp":"<3级","type":2,"wd":"南风",
     * "notice":"阴晴之间，谨防紫外线侵扰"}},{"date":"20180513","sunrise":"05:03","high":28,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=5&partner=1000001009","low":17,"sunset":"19:19",
     * "night":{"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,
     * "wd":"北风","notice":"祝你有个晴朗的梦"},"aqi":89,"forecastAirUrl":"","day":{"wthr":"晴",
     * "bgPic":"http://static.etouch.cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static
     * .etouch.cn/imgs/upload/1505181366.5006.jpg","wp":"<3级","type":1,"wd":"南风",
     * "notice":"愿你拥有比阳光明媚的心情"}},{"date":"20180514","sunrise":"05:02","high":31,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=6&partner=1000001009","low":17,"sunset":"19:20",
     * "night":{"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,
     * "wd":"西南风","notice":"祝你有个晴朗的梦"},"aqi":122,"forecastAirUrl":"","day":{"wthr":"晴",
     * "bgPic":"http://static.etouch.cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static
     * .etouch.cn/imgs/upload/1505181366.5006.jpg","wp":"<3级","type":1,"wd":"南风",
     * "notice":"愿你拥有比阳光明媚的心情"}},{"date":"20180515","sunrise":"05:01","high":33,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=7&partner=1000001009","low":21,"sunset":"19:21",
     * "night":{"wthr":"多云","bgPic":"http://static.etouch.cn/imgs/upload/1505371467.4939.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284464.307.jpg","wp":"<3级","type":2,
     * "wd":"西南风","notice":"夜晚多云，愿你梦里有月光"},"day":{"wthr":"晴","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505181366.5006.jpg","wp":"<3级","type":1,"wd":"西南风",
     * "notice":"愿你拥有比阳光明媚的心情"}},{"date":"20180516","sunrise":"05:00","high":31,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=8&partner=1000001009","low":18,"sunset":"19:22",
     * "night":{"wthr":"小雨","bgPic":"http://static.etouch.cn/imgs/upload/1505371554.566.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284577.5363.jpg","wp":"<3级","type":8,
     * "wd":"东风","notice":"别看雨还小，冒雨要不得"},"day":{"wthr":"多云","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371463.3431.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284459.5844.jpg","wp":"3-4级","type":2,"wd":"南风",
     * "notice":"阴晴之间，谨防紫外线侵扰"}},{"date":"20180517","sunrise":"04:59","high":26,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=9&partner=1000001009","low":14,"sunset":"19:23",
     * "night":{"wthr":"阴","bgPic":"http://static.etouch.cn/imgs/upload/1505371482.976.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284487.8387.jpg","wp":"<3级","type":34,
     * "wd":"北风","notice":"今晚虽阴，月光洒满你的梦"},"day":{"wthr":"多云","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371463.3431.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284459.5844.jpg","wp":"<3级","type":2,"wd":"东北风",
     * "notice":"阴晴之间，谨防紫外线侵扰"}},{"date":"20180518","sunrise":"04:58","high":27,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=10&partner=1000001009","low":15,"sunset":"19:24",
     * "night":{"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,
     * "wd":"北风","notice":"祝你有个晴朗的梦"},"day":{"wthr":"阴","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371479.5574.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284484.5873.jpg","wp":"<3级","type":34,"wd":"东风",
     * "notice":"不要被阴云遮挡住好心情"}},{"date":"20180519","sunrise":"04:57","high":27,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=11&partner=1000001009","low":16,"sunset":"19:25",
     * "night":{"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,
     * "wd":"北风","notice":"祝你有个晴朗的梦"},"day":{"wthr":"小雨","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371550.6113.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284574.0261.jpg","wp":"<3级","type":8,"wd":"西南风",
     * "notice":"雨虽小，注意保暖别感冒"}},{"date":"20180520","sunrise":"04:57","high":29,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=12&partner=1000001009","low":15,"sunset":"19:26",
     * "night":{"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,
     * "wd":"东风","notice":"祝你有个晴朗的梦"},"day":{"wthr":"晴","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505181366.5006.jpg","wp":"<3级","type":1,"wd":"北风",
     * "notice":"愿你拥有比阳光明媚的心情"}},{"date":"20180521","sunrise":"04:56","high":30,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=13&partner=1000001009","low":16,"sunset":"19:27",
     * "night":{"wthr":"小雨","bgPic":"http://static.etouch.cn/imgs/upload/1505371554.566.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284577.5363.jpg","wp":"<3级","type":8,
     * "wd":"南风","notice":"别看雨还小，冒雨要不得"},"day":{"wthr":"小雨","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371550.6113.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284574.0261.jpg","wp":"<3级","type":8,"wd":"南风",
     * "notice":"雨虽小，注意保暖别感冒"}},{"date":"20180522","sunrise":"04:55","high":33,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=14&partner=1000001009","low":16,"sunset":"19:28",
     * "night":{"wthr":"小雨","bgPic":"http://static.etouch.cn/imgs/upload/1505371554.566.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284577.5363.jpg","wp":"<3级","type":8,
     * "wd":"东南风","notice":"别看雨还小，冒雨要不得"},"day":{"wthr":"小雨","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371550.6113.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284574.0261.jpg","wp":"<3级","type":8,"wd":"北风",
     * "notice":"雨虽小，注意保暖别感冒"}},{"date":"20180523","sunrise":"04:54","high":32,
     * "forecastUrl":"http://m.weathercn.com/daily-weather-forecast
     * .do?language=zh-cn&smartid=101010100&day=15&partner=1000001009","low":18,"sunset":"19:29",
     * "night":{"wthr":"阴","bgPic":"http://static.etouch.cn/imgs/upload/1505371482.976.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284487.8387.jpg","wp":"3-4级","type":34,
     * "wd":"南风","notice":"今晚虽阴，月光洒满你的梦"},"day":{"wthr":"多云","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371463.3431.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284459.5844.jpg","wp":"3-4级","type":2,"wd":"南风",
     * "notice":"阴晴之间，谨防紫外线侵扰"}}]
     * forecast : [{"date":"20180508","sunrise":"05:08","high":27,"low":13,"sunset":"19:15",
     * "night":{"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,
     * "wd":"东南风","notice":"祝你有个晴朗的梦"},"aqi":68,"day":{"wthr":"晴","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505181366.5006.jpg","wp":"<3级","type":1,"wd":"南风",
     * "notice":"愿你拥有比阳光明媚的心情"}},{"date":"20180509","sunrise":"05:07","high":27,"low":15,
     * "sunset":"19:16","night":{"wthr":"多云","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371467.4939.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284464.307.jpg","wp":"<3级","type":2,"wd":"南风",
     * "notice":"夜晚多云，愿你梦里有月光"},"aqi":72,"day":{"wthr":"晴","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505181366.5006.jpg","wp":"3-4级","type":1,"wd":"南风",
     * "notice":"愿你拥有比阳光明媚的心情"}},{"date":"20180510","sunrise":"05:06","high":26,"low":18,
     * "sunset":"19:17","night":{"wthr":"多云","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371467.4939.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284464.307.jpg","wp":"<3级","type":2,"wd":"南风",
     * "notice":"夜晚多云，愿你梦里有月光"},"aqi":92,"day":{"wthr":"多云","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371463.3431.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284459.5844.jpg","wp":"3-4级","type":2,"wd":"南风",
     * "notice":"阴晴之间，谨防紫外线侵扰"}},{"date":"20180511","sunrise":"05:05","high":25,"low":15,
     * "sunset":"19:18","night":{"wthr":"多云","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371467.4939.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284464.307.jpg","wp":"<3级","type":2,"wd":"东南风",
     * "notice":"夜晚多云，愿你梦里有月光"},"aqi":83,"day":{"wthr":"阴","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371479.5574.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284484.5873.jpg","wp":"<3级","type":34,"wd":"南风",
     * "notice":"不要被阴云遮挡住好心情"}},{"date":"20180512","sunrise":"05:04","high":26,"low":15,
     * "sunset":"19:19","night":{"wthr":"晴","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371453.2293.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,"wd":"北风","notice":"祝你有个晴朗的梦"},
     * "aqi":88,"day":{"wthr":"多云","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371463.3431.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284459.5844.jpg","wp":"<3级","type":2,"wd":"南风",
     * "notice":"阴晴之间，谨防紫外线侵扰"}},{"date":"20180513","sunrise":"05:03","high":28,"low":17,
     * "sunset":"19:19","night":{"wthr":"晴","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371453.2293.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,"wd":"北风","notice":"祝你有个晴朗的梦"},
     * "aqi":89,"day":{"wthr":"晴","bgPic":"http://static.etouch
     * .cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505181366.5006.jpg","wp":"<3级","type":1,"wd":"南风","notice":"愿你拥有比阳光明媚的心情"}}]
     * hourfc : [{"wthr":22,"shidu":"36%","hourfcUrl":"","wp":"5-6级","time":"201805092200",
     * "type":2,"wd":"南风"},{"wthr":21,"shidu":"37%","hourfcUrl":"","wp":"4-5级",
     * "time":"201805092300","type":2,"wd":"南风"},{"wthr":19,"shidu":"40%","hourfcUrl":"",
     * "wp":"4-5级","time":"201805100000","type":2,"wd":"东南风"},{"wthr":19,"shidu":"42%",
     * "hourfcUrl":"","wp":"4-5级","time":"201805100100","type":2,"wd":"东南风"},{"wthr":18,
     * "shidu":"44%","hourfcUrl":"","wp":"4-5级","time":"201805100200","type":1,"wd":"东南风"},
     * {"wthr":17,"shidu":"48%","hourfcUrl":"","wp":"4-5级","time":"201805100300","type":1,
     * "wd":"东南风"},{"wthr":16,"shidu":"48%","hourfcUrl":"","wp":"4-5级","time":"201805100400",
     * "type":2,"wd":"东南风"},{"wthr":15,"shidu":"57%","hourfcUrl":"","wp":"4-5级",
     * "time":"201805100500","type":2,"wd":"东风"},{"wthr":16,"shidu":"56%","hourfcUrl":"",
     * "wp":"4-5级","time":"201805100600","type":2,"wd":"东风"},{"wthr":18,"shidu":"51%",
     * "hourfcUrl":"","wp":"4-5级","time":"201805100700","type":2,"wd":"东风"},{"wthr":20,
     * "shidu":"46%","hourfcUrl":"","wp":"4-5级","time":"201805100800","type":2,"wd":"东南风"},
     * {"wthr":21,"shidu":"42%","hourfcUrl":"","wp":"4-5级","time":"201805100900","type":2,
     * "wd":"东南风"},{"wthr":23,"shidu":"39%","hourfcUrl":"","wp":"5-6级","time":"201805101000",
     * "type":2,"wd":"南风"},{"wthr":24,"shidu":"36%","hourfcUrl":"","wp":"5-6级",
     * "time":"201805101100","type":2,"wd":"西南风"},{"wthr":25,"shidu":"34%","hourfcUrl":"",
     * "wp":"6-7级","time":"201805101200","type":2,"wd":"西南风"},{"wthr":26,"shidu":"32%",
     * "hourfcUrl":"","wp":"6-7级","time":"201805101300","type":2,"wd":"西南风"},{"wthr":26,
     * "shidu":"31%","hourfcUrl":"","wp":"7-8级","time":"201805101400","type":2,"wd":"西南风"},
     * {"wthr":26,"shidu":"29%","hourfcUrl":"","wp":"8-9级","time":"201805101500","type":2,
     * "wd":"西南风"},{"wthr":25,"shidu":"28%","hourfcUrl":"","wp":"8-9级","time":"201805101600",
     * "type":2,"wd":"西南风"},{"wthr":25,"shidu":"30%","hourfcUrl":"","wp":"9-10级",
     * "time":"201805101700","type":2,"wd":"西南风"},{"wthr":25,"shidu":"33%","hourfcUrl":"",
     * "wp":"9-10级","time":"201805101800","type":2,"wd":"西南风"},{"wthr":24,"shidu":"38%",
     * "hourfcUrl":"","wp":"6-7级","time":"201805101900","type":2,"wd":"西南风"},{"wthr":22,
     * "shidu":"44%","hourfcUrl":"","wp":"6-7级","time":"201805102000","type":2,"wd":"西南风"},
     * {"wthr":22,"shidu":"47%","hourfcUrl":"","wp":"6-7级","time":"201805102100","type":2,
     * "wd":"西南风"}]
     * xianhao : [{"f_date":"20180509","f_number":"1,6","action_type":"webview",
     * "item_id":"219894602","click_url":"http://yun.rili.cn/tianqi/traffic.html?city=101010100",
     * "title":"限行"},{"f_date":"20180510","f_number":"2,7","action_type":"webview",
     * "item_id":"219916045","click_url":"http://yun.rili.cn/tianqi/traffic.html?city=101010100",
     * "title":"限行"},{"f_date":"20180511","f_number":"3,8","action_type":"webview",
     * "item_id":"219920961","click_url":"http://yun.rili.cn/tianqi/traffic.html?city=101010100",
     * "title":"限行"},{"f_date":"20180514","f_number":"4,9","action_type":"webview",
     * "item_id":"258828909","click_url":"http://yun.rili.cn/tianqi/traffic.html?city=101010100",
     * "title":"限行"},{"f_date":"20180515","f_number":"5,0","action_type":"webview",
     * "item_id":"258846387","click_url":"http://yun.rili.cn/tianqi/traffic.html?city=101010100",
     * "title":"限行"},{"f_date":"20180516","f_number":"1,6","action_type":"webview",
     * "item_id":"258849826","click_url":"http://yun.rili.cn/tianqi/traffic.html?city=101010100",
     * "title":"限行"},{"f_date":"20180517","f_number":"2,7","action_type":"webview",
     * "item_id":"258853018","click_url":"http://yun.rili.cn/tianqi/traffic.html?city=101010100",
     * "title":"限行"}]
     * source : {"link":"http://m.weathercn.com/index
     * .do?language=zh-cn&smartid=101010100&partner=1000001009","icon":"http://static.etouch
     * .cn/icon/tianqitong.png","title":"中国天气通"}
     * evn : {"no2":38,"mp":"臭氧8小时","pm25":48,"o3":148,"so2":7,"aqi":120,"pm10":102,
     * "suggest":"儿童、老年人及心脏、呼吸系统疾病患者人群应减少长时间或高强度户外锻炼","time":"22:00:00","co":1,"quality":"轻度污染"}
     * observe : {"shidu":"36%","wthr":"多云","temp":22,"night":{"bgPic":"http://static.etouch
     * .cn/imgs/upload/1505371467.4939.jpg","smPic":"http://static.etouch
     * .cn/imgs/upload/1505284464.307.jpg"},"up_time":"22:00","wp":"2级","tigan":"22","type":2,
     * "wd":"南风","day":{"bgPic":"http://static.etouch.cn/imgs/upload/1505371463.3431.jpg",
     * "smPic":"http://static.etouch.cn/imgs/upload/1505284459.5844.jpg"}}
     */

    public MetaBean meta;
    public WeatherUrlsBean weatherUrls;
    public SourceBean source;
    public EvnBean evn;
    public ObserveBean observe;
    public List<IndexesBean> indexes;
    public List<Forecast15Bean> forecast15;
    public List<ForecastBean> forecast;
    public List<HourfcBean> hourfc;
    public List<XianhaoBean> xianhao;

    public static class MetaBean implements Serializable{
        /**
         * circle_count : 38804
         * post_id : 501391
         * citykey : 101010100
         * city : 北京市
         * upper : 北京
         * html_url : http://yun.rili.cn/tianqi/index.html?city=101010100
         * wcity : ["w_101010100"]
         * up_time : 22:00
         * post_count : 6747
         * status : 1000
         * desc : 看看离你最近的历友在哪里
         */

        public int circle_count;
        public String post_id;
        public String citykey;
        public String city;
        public String upper;
        public String html_url;
        public String up_time;
        public int post_count;
        public int status;
        public String desc;
        public List<String> wcity;
    }

    public static class WeatherUrlsBean implements Serializable{
        /**
         * w_life_index_more : http://m.weathercn.com/livingindex
         * .do?language=zh-cn&smartid=101010100&partner=1000001009#Indices
         * w_forecast_90 : http://m.weathercn.com/daily-weather-forecast
         * .do?language=zh-cn&smartid=101010100&partner=1000001009
         * w_gradual_hour :
         */

        public String w_life_index_more;
        public String w_forecast_90;
        public String w_gradual_hour;
    }

    public static class SourceBean implements Serializable{
        /**
         * link : http://m.weathercn.com/index
         * .do?language=zh-cn&smartid=101010100&partner=1000001009
         * icon : http://static.etouch.cn/icon/tianqitong.png
         * title : 中国天气通
         */

        public String link;
        public String icon;
        public String title;
    }

    public static class EvnBean implements Serializable{
        /**
         * no2 : 38
         * mp : 臭氧8小时
         * pm25 : 48
         * o3 : 148
         * so2 : 7
         * aqi : 120
         * pm10 : 102
         * suggest : 儿童、老年人及心脏、呼吸系统疾病患者人群应减少长时间或高强度户外锻炼
         * time : 22:00:00
         * co : 1
         * quality : 轻度污染
         */

        public int no2;
        public String mp;
        public int pm25;
        public int o3;
        public int so2;
        public int aqi;
        public int pm10;
        public String suggest;
        public String time;
        public int co;
        public String quality;
    }

    public static class ObserveBean implements Serializable{
        /**
         * shidu : 36%
         * wthr : 多云
         * temp : 22
         * night : {"bgPic":"http://static.etouch.cn/imgs/upload/1505371467.4939.jpg",
         * "smPic":"http://static.etouch.cn/imgs/upload/1505284464.307.jpg"}
         * up_time : 22:00
         * wp : 2级
         * tigan : 22
         * type : 2
         * wd : 南风
         * day : {"bgPic":"http://static.etouch.cn/imgs/upload/1505371463.3431.jpg",
         * "smPic":"http://static.etouch.cn/imgs/upload/1505284459.5844.jpg"}
         */

        public String shidu;
        public String wthr;
        public int temp;
        public NightBean night;
        public String up_time;
        public String wp;
        public String tigan;
        public int type;
        public String wd;
        public DayBean day;

        public static class NightBean {
            /**
             * bgPic : http://static.etouch.cn/imgs/upload/1505371467.4939.jpg
             * smPic : http://static.etouch.cn/imgs/upload/1505284464.307.jpg
             */

            public String bgPic;
            public String smPic;
        }

        public static class DayBean {
            /**
             * bgPic : http://static.etouch.cn/imgs/upload/1505371463.3431.jpg
             * smPic : http://static.etouch.cn/imgs/upload/1505284459.5844.jpg
             */

            public String bgPic;
            public String smPic;
        }
    }

    public static class IndexesBean implements Serializable{
        /**
         * ext : {"icon":"http://static.etouch.cn/icon/chenlian.png","statsKey":"-1055"}
         * valueV2 : 较适宜晨练
         * name : 晨练指数
         * value : 较适宜
         * desc : 早晨气象条件较适宜晨练，但风力稍大，晨练时请注意选择避风的地点，避免迎风锻炼。
         * link : http://m.weathercn.com/index
         * .do?language=zh-cn&smartid=101010100&partner=1000001009
         */

        public ExtBean ext;
        public String valueV2;
        public String name;
        public String value;
        public String desc;
        public String link;

        public static class ExtBean {
            /**
             * icon : http://static.etouch.cn/icon/chenlian.png
             * statsKey : -1055
             */

            public String icon;
            public String statsKey;
        }
    }

    public static class Forecast15Bean implements Serializable{
        /**
         * date : 20180508
         * sunrise : 05:08
         * high : 27
         * forecastUrl : http://m.weathercn.com/daily-weather-forecast
         * .do?language=zh-cn&smartid=101010100&day=0&partner=1000001009
         * low : 13
         * sunset : 19:15
         * night : {"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg",
         * "smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,"wd":"东南风","notice":"祝你有个晴朗的梦"}
         * aqi : 68
         * forecastAirUrl :
         * day : {"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static.etouch.cn/imgs/upload/1505181366.5006.jpg","wp":"<3级","type":1,"wd":"南风","notice":"愿你拥有比阳光明媚的心情"}
         */

        public String date;
        public String sunrise;
        public int high;
        public String forecastUrl;
        public int low;
        public String sunset;
        public NightBeanX night;
        public int aqi;
        public String forecastAirUrl;
        public DayBeanX day;

        public static class NightBeanX {
            /**
             * wthr : 晴
             * bgPic : http://static.etouch.cn/imgs/upload/1505371453.2293.jpg
             * smPic : http://static.etouch.cn/imgs/upload/1505215052.3458.jpg
             * wp : <3级
             * type : 1
             * wd : 东南风
             * notice : 祝你有个晴朗的梦
             */

            public String wthr;
            public String bgPic;
            public String smPic;
            public String wp;
            public int type;
            public String wd;
            public String notice;
        }

        public static class DayBeanX {
            /**
             * wthr : 晴
             * bgPic : http://static.etouch.cn/imgs/upload/1505379621.3163.jpg
             * smPic : http://static.etouch.cn/imgs/upload/1505181366.5006.jpg
             * wp : <3级
             * type : 1
             * wd : 南风
             * notice : 愿你拥有比阳光明媚的心情
             */

            public String wthr;
            public String bgPic;
            public String smPic;
            public String wp;
            public int type;
            public String wd;
            public String notice;
        }
    }

    public static class ForecastBean implements Serializable{
        /**
         * date : 20180508
         * sunrise : 05:08
         * high : 27
         * low : 13
         * sunset : 19:15
         * night : {"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505371453.2293.jpg","smPic":"http://static.etouch.cn/imgs/upload/1505215052.3458.jpg","wp":"<3级","type":1,"wd":"东南风","notice":"祝你有个晴朗的梦"}
         * aqi : 68
         * day : {"wthr":"晴","bgPic":"http://static.etouch.cn/imgs/upload/1505379621.3163.jpg","smPic":"http://static.etouch.cn/imgs/upload/1505181366.5006.jpg","wp":"<3级","type":1,"wd":"南风","notice":"愿你拥有比阳光明媚的心情"}
         */

        public String date;
        public String sunrise;
        public int high;
        public int low;
        public String sunset;
        public NightBeanXX night;
        public int aqi;
        public DayBeanXX day;

        public static class NightBeanXX {
            /**
             * wthr : 晴
             * bgPic : http://static.etouch.cn/imgs/upload/1505371453.2293.jpg
             * smPic : http://static.etouch.cn/imgs/upload/1505215052.3458.jpg
             * wp : <3级
             * type : 1
             * wd : 东南风
             * notice : 祝你有个晴朗的梦
             */

            public String wthr;
            public String bgPic;
            public String smPic;
            public String wp;
            public int type;
            public String wd;
            public String notice;
        }

        public static class DayBeanXX {
            /**
             * wthr : 晴
             * bgPic : http://static.etouch.cn/imgs/upload/1505379621.3163.jpg
             * smPic : http://static.etouch.cn/imgs/upload/1505181366.5006.jpg
             * wp : <3级
             * type : 1
             * wd : 南风
             * notice : 愿你拥有比阳光明媚的心情
             */

            public String wthr;
            public String bgPic;
            public String smPic;
            public String wp;
            public int type;
            public String wd;
            public String notice;
        }
    }

    public static class HourfcBean {
        /**
         * wthr : 22
         * shidu : 36%
         * hourfcUrl :
         * wp : 5-6级
         * time : 201805092200
         * type : 2
         * wd : 南风
         */

        public int wthr;
        public String shidu;
        public String hourfcUrl;
        public String wp;
        public String time;
        public int type;
        public String wd;
    }

    public static class XianhaoBean implements Serializable{
        /**
         * f_date : 20180509
         * f_number : 1,6
         * action_type : webview
         * item_id : 219894602
         * click_url : http://yun.rili.cn/tianqi/traffic.html?city=101010100
         * title : 限行
         */

        public String f_date;
        public String f_number;
        public String action_type;
        public String item_id;
        public String click_url;
        public String title;
    }
}
