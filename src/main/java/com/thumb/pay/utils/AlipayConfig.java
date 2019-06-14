package com.thumb.pay.utils;

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
    public static String app_id = "2016092800616634";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCRGTcSXNvoJaC1pLIkcOwyKp5B/FYA0EM7PrTGbcIOhGIofGN5CmAA8X55Dyt/Eq/de3GZuI5bzDNzaweSl0dceZOXX4YGoZ0AacCm29s1Nfo2vgv8S0vvuqr5VAr/8hMFWvDRmliBm1YdRMkPHufcjxPtjf39BJbPeEaJ3uSg5qGzRQfWngWDe7+HeRhwDfAQ3PtcFxMBn7D52he5Ja8zAPi/zqBQsMq0EpJDQEq1+Gt4Z33afmDLgC0clNK7U9l5MJrC1DXQDJWuw1+YLOy7QvMaMa3YDmKH/vYJpwAlMdvSve0FLRlBkgyaoJB5cT9I/+JXCGlgXM5eiypkFuO/AgMBAAECggEADr2jDKiGZsU72HhM6MrYFBikT0vVaOu/iMtMDkSkTFlCp55LdMaLDk16bc4OuzAo0bVyyw0m2UibiYQ8FrZrt4daaSx5Lz9H9fzIZ6s6T+OV8e3Ixe7YXhh2ujHBlFMBf6/He2PUzgX776lHS9P19kBK4/1i6kuHDrjHYcZVL8tXRBDkd9umWhlL+GM2B5l+/sDLaGWrz3/OL3J7tHhCEpAVdcuJ1eatbM7gtNRrJQYpbA3YCKj3xAGlMLk7z31/UM4I/w1a1XIe01g723yjZOpdTvv7YAd3Lm5DBY2kieoKg7KfgrQbmxdXfx4+8Sa0yQzjd+LVbVnAOWDonLzRAQKBgQDDiA6fFSl1WkKhSQqeORtlzVCD9twHo0S6FHxWo9/rXdHIDcMEaybYUR1wpQ+XMh4TfcMwWHue3m75IrZO/IsQnLVLkDzSjn7r0oBXSNzmYUg0+SJ3cJoxOR4IZW4GJ/DaUjuZTgCPuJraHXzdEtwBJt19CvM2wlvhle93j4zbwQKBgQC9+HPU7NKG3aTaMxTzJanFFS+kVgo0dw4Tm79LxiTUuBwx7jg5o9i34q0/nsMeqHvksp1g3gWCcjQlgTJkV5x1kSUJBeYjPpgwOaeSR3MiXDgF+o9QZVhimuCQmYIHJ/zu00lf5ECE86qVDpE0OzmUlAknDiqt4Xn7WefUcvmffwKBgQChCTI5lL0zWGYd3UEwdIn6+vB/7tTiOXZF5s9Mr+SgPQGkSKk/v1wbthqQBnFjrbQVi3MxIv6VJk6xQwRw4w9JXDb4B8///bnMUO7AdFLyLlbAwhq/0e478fWpJphJ26VCuY06QoK12201jCmlDX5COJcb/+O1SrdPgCPcDU8OQQKBgBuSe/1jggrhEJQ65ceEp+da89c+RaznurtN163/zEizkCQPF0oGZeYKmGqreFZyzcibxAvTLamJOdhXsCCwNp05u85bdNOYui4FsDSi+ir6h4cWnsZkbzegkwdpwF2ZiDSBphys3FBvrUqFGr4h+nF+KvXoMHmcSEAbBHLpXSGxAoGAQQVnsRxlVxmi9AMxvwABQjZn9QIHpg+zy0WCDhyI7w2csLaAQJfAJUsShmYep62FeNwb/cyMTbk+cWdh2ktx0vQ4+TV7sTPqKD4gmfVPGRIamIV5dCjoO2aJD6b/BdNesDBaARcFen2V1V1znOF8Sw9jxsbqhT8oLvMHSTeIuvQ=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzFjEdoOQIN505BVoy8+onu1GY1PpbU6yafp81Fa9TLum0xwrNwdNDJizalvIC3bQPXVXTF1PcNpvrn32WAUFKsZtYsolEwmPcN2WUYpNcH/+AOINv1slZE9TImNsiTqsNoMDMG4Q1KR6YVsz2+1DtlFQkH4t+gpO/RRUlmdDt22aLDK/Q8HyZ9TF0bpNG7JHWB8HZ14eNWFegHwGWNcCxTuJJEXNLXIMMJ1QoVrs11J5MR4mvo4GMiIduep5E98f0/dNC6SSKHfPeN38lSzv1Glcai/eBRP9YZ+4scavwpl9M637H2uV4AfIetDuBT4y/QloGx4SenT3oj3RJwpcswIDAQAB\n";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://w56xi6.natappfree.cc/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://w56xi6.natappfree.cc/alipayreturn";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "/Users/mbl/Desktop/111";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记v录存入数据库）
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

