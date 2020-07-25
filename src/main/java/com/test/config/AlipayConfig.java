package com.test.config;

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
	public static String app_id = "2021000116662451";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCDZjaUg1aHXH/q+vpaDom6L2XdolK9Z4k5W9H0ggxw9HsQhzUkKQk9o9hLrP8Al3eOCgzNNzBdd4f5SbhQl7DErlotPR8ADshbDRUfWll1yuvnDf6p3DoXBHUsHy2XIVlsp1hcAnTYz5OguOGUiGcAPbXC26wPrw1Pgr0FKBPAJowo3PmWzx7DgXjgFSPcLmSsMaln2/Fj4u6iyeZAdLk9Y7LcsZNkqb2r1bDDpi+xYn2c4os+1DuKNI2oM89/5oJuDUOwdZHQ49up1Q0Fyw6N2jitXrhewBd39C1UDggmo6TNMxSFzD34MCVLKQjpAXlz4iJtYw4aJ2DJpoj4aNebAgMBAAECggEAILunwRtuxM2wOBNJpoGUocMI90tmnTRbpORQyz5SZxkgRx/HhziJysc0LLXt2HHjIIk0YzLqY35RazKILdt796MPZ9GgFV2ZX8VEi8jwHD3uwmJkHGB2QCGmJtWlf86Y/k453sHl5dTgC9vCpkPMlOzKiL48gLO09ye0esJfGTCktgcGMfJJINbmsnzeJdKdSEiAEqZ/ObPNgaBWK8IBwI21O/ZOv7xaW8leYplJXS4BTvqk3tNmOKYzK6xE8DRfF1cF4htzVqv+eYszU90xiwouyk7qNHI1hghCFl2jOyZS962vLGZPmVK1RfSrFp3alJ89M+lnU1qvLY7luKpc4QKBgQDVCN3dVGRNO/DKQQo4os8h4lonhgmjwRPAEuK921lW2FZkj9cfCyA/yGhbyQP5djD88bTetxpqFoTNiTEQ9Zt6Xyy4lW0P7pGGhzl40np0rXbUbJkdFQhUEZQFOWSgDgWRsUd9YSzOGFhBRquoRNVMrJUNgd1gyQITJXu/iuir6QKBgQCd5nQFUb7JU6F/tvpZqrLqLfMZdpbYP6EwC4fSzyrKUP1IoQiTTWoZD35buN/uUCcFN1zn767zakWIlTAVLur71POXebj8CIeg2RI8P1lsPhlp4+qiyxNWgrq5tB2S/FY5hrnGl0lp6+mZrnenRwwC12RivXF+E003r0yS7dwo4wKBgFFqIBAz7lkt7Sn+jT9zySEz9ixgp1JzuW6QSSMxrwTnjKzF4/qzL9HwbyGUwvYVW0dvwCXVaDze+kXqhlvq4U51DQxF3vZVwDvfdfFczvvER0OLdUCOBy7JwP32HySj9zDkxWN/PbZNy3y222dlVvcEhboxxT710tsqWg6rsZvxAoGARjrC7b6/CdKtqR1cWldm/mtzjabGTuZ2LeVjAutrz9KX5R7iromnIABZJjijON7jjBlktDBR8ygYRzh7y2Az2dCMi5nzIf41POBvkOZoQpGYQhXCPafvMPIyVPh8kuyy+SEoLeEKIRdxrg4AYCFkgTsGBjjWasnw9Ux91XgADRsCgYEAjU3XF+u35KDr2K43ymoKNFFteE7RFWZfT+3SpO/BaiaLn+Cr90o2k2E6ZV2vFVO4pVWWro8ABs7ftniTh065HC2uGWdOC6hmMjsXO4CMCx4Uf2+r4/5kszOOcUN1E1tcs1vLU/hp5nb73C/a2K7HX6S2P8IU6SOpL2xfzz9p+dI=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4ny6JRefqy4gH4BzzbR6+KttsWPiIscvu2EBIOtOx3QhY+jb/iWC8a36z0v61OR1AOMNaPdxBIDQaJl/XPnDblImHRHB5RVHM/ZFwBTV/oyEIHDl3b7WonmC/WVfJ0oeTzXShc/kMMey++4/ib4rFkptKBadUrJ/XI9N08P6vYEB3dzupQNf02/lZGNyWEoLtC9vNeuTTcc57UXlg7qDlhJ+frlyX/kIJTRcq+CrLKeEgVwxCVjDjAARd/BdpVa5BIkvaf9jJpEnunIGoFfAZDBdXQTyb0YkZsfN1PP1V8M/ekey3SmU7U7D9Dwj0Tkj0jwqvYN9sO+kjfYW8nJ7LwIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
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

