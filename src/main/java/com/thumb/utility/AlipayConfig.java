package com.thumb.utility;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2017030506061792";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCgJYaSAbtK3ZyWy8bnuVmt92MKG7JP1Bk3VlTAViCiKNB/r3u5p0KPdxzHG6RemMPai4dN/maIranN1vAb76tzc/Pfa5bxAOe7VrZJ090Q9nofbrVLJnYft0eaUb2wsG1BlrSuru2Z/CeKvANl+X5ekTG+DCddT4pWezG8Ag526sTXVxspB2Hw0bfphzLdGZB4Dxm38DeZxxvl9csMpqPPoAbjvYF3TfTbnFjubEHTWsCA4mM45feOICKCFriRr0MKmQs/o7BZAZxv7EsEjNqvef2JfRdzL6FIUeTQ+L/9T6wIvU98B4mpwxFOAwlD4DMrHZdHjyTPcLaOyeT/1BlXAgMBAAECggEBAIfjj66w3XYHWeny+9KAyoH9mwJmwgVO2h7EmKGj84jlzRWrl/bO4IHP9pFU+UJzqiz1nFgn+GUdxyosqg1qbzdGOrdoGepidD/YslEu/zR3kOS/EgK0niMHaDCgD6+v5OV0tdhMAr1Y40yrgM60x/ACkAzNT1G0PpRncKoxrIhmEcLzt7Nxy8t/zUvx8aAuH1jbEm9aHybZSKrXKnNfQ5R/lv2Fs5AOxWg3JcQ5SOD6SRez7ntYoMOuzAvui6eLDnz6hcmCPpUSpdD9bVDqrBGMY8oJ1GTWCZNudSU9TyMtf06LDSepx3ENgCOizNhRMYeyDVr0x/ewG1AKRWpHnMECgYEA0oTiDi3o6cEq74+2OiKDrEI06cvqIMRwsEZCGuSWKgVz2ZuYBiAiSzbHC02S0evi7/plYWSnY7Nx2xczRorGr1ZCvGYEuikD+W6kRpncj0HrDY/TvYLLNBls9EaE3qdZ7333QCWp6OlEb/iFGN8gnLHa0+FNTPD0xuglqakHVVECgYEAwr60wDLXitxzLIFo6Dhc+eELfmswID0IpGAEnIsMxSi9woynACSfak32fDpMFidB/9vEkBuaRPLxdE6xp+71N883hC+a0W+042jTk0CRGMw7SS3+6Objgi1y2nIK+WQw45trEZlXmfshKimuSrfSoOatrdddQeKgfhBUkPrV+icCgYBQxW1aVWEM9vF7Ut9u9LkiiZB1t6hQBC7cY0iPuu6mlsr5TgqJJyEhTJYYDx5q7p92xdLKCG11Am+HySICSdKriWQ3lsjviDcfJ8Vd1UDbskX2QR3Tk3BVv/+excPLDdii2+jWsty7IW0BrQ+cGFgR5ud37fTTtYulGYMB0nme0QKBgB12cqwdRQTKI1aZYYC4fkCDrpR6rPZDpZoQuMHiO5Vce5ECbIWWBNQ1ZVQYEcjMOaz2178hne5Ofv8kpLYObeT6oaCK/zYuW0SIaHH/s7P3ugRxQ/6CZ+sa6yRnWoeug8L7kXBBLcKq/rJ9SdQeCWy0WZRSX9aG7dcEq3afrF3DAoGAT2ilEo3SM2FGZKh5dHjjMa3xjjx011EmZ77FQ9KgsGmTKfJh+4aHN5B3QV6aLwAKlk0CXZh2ywrKtPl1nzrwJQBWM/qJdvGPtbl7tpBSSMrigfPSDDOihi5Zz2ZuapmmM0ezUS+iXMkCtFouRnfW90bZmPSeC5hIVMtlb+wYRng=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoCWGkgG7St2clsvG57lZrfdjChuyT9QZN1ZUwFYgoijQf697uadCj3ccxxukXpjD2ouHTf5miK2pzdbwG++rc3Pz32uW8QDnu1a2SdPdEPZ6H261SyZ2H7dHmlG9sLBtQZa0rq7tmfwnirwDZfl+XpExvgwnXU+KVnsxvAIOdurE11cbKQdh8NG36Ycy3RmQeA8Zt/A3mccb5fXLDKajz6AG472Bd03025xY7mxB01rAgOJjOOX3jiAigha4ka9DCpkLP6OwWQGcb+xLBIzar3n9iX0Xcy+hSFHk0Pi//U+sCL1PfAeJqcMRTgMJQ+AzKx2XR48kz3C2jsnk/9QZVwIDAQAB\n";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

