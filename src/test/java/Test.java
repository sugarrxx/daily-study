import java.util.HashMap;

/**
 * @Author lixiaoxiang
 * @Date 2021/6/9
 */
public class Test {
    
    

//for offset in range(0,350,10):                     #offset偏移量处理
//    try:
//    json={"offset": offset, "limit": 10, "filter_type": 0, "totalNum": 500, "game_id": 26, "slol_id": "j9GJB4l",
//            "area_id": 24, "isMe": "true"}
//    res=requests.post(url=url,json=json,verify=False)
//    print(res.status_code)
//    with open('battle_list{0}.json'.format(offset),'w+',encoding='utf8') as f:     #保存为json文件
//            f.write(res.text)
//            time.sleep(2)
//    except:
//    print('error!')
    public static void main(String[] args) {
        String url = "https://m.wegame.com.cn/api/mobile/lua/proxy/index/mwg_lol_proxy/get_battle_list";
        HashMap<String, String> map = new HashMap<>();
        map.put("Accept", "application/json");
        map.put("Cookie", "***********");
        map.put("Content-Tyep", "113");
        map.put("Content-Length", "application/json; charset=utf-8");
        map.put("Host", "m.wegame.com.cn");
        map.put("Connection", "Keep-Alive");
        map.put("Accept-Encoding", "gzip");
        map.put("User-Agent", "okhttp/3.11.0");

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }
    }
}
