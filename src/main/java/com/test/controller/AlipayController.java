package com.test.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.test.config.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.test.config.AlipayConfig.notify_url;
import static com.test.config.AlipayConfig.return_url;


/**
 * 支付宝网页支付
 * */
@Controller
@RequestMapping("/alipay")
public class AlipayController {


    /**
     * 前往支付宝支付界面
     * */
    @RequestMapping("/goAlipayment")
    @ResponseBody
    public void goAlipayment(HttpServletRequest httpRequest, HttpServletResponse httpResponse)throws Exception {

        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json","GBK",AlipayConfig.alipay_public_key,AlipayConfig.sign_type);
        //创建API对应的request
        AlipayTradePagePayRequest alipayRequest =  new  AlipayTradePagePayRequest();
        //在公共参数中设置回跳和通知地址
        alipayRequest.setReturnUrl( return_url);
        alipayRequest.setNotifyUrl( notify_url );
        //如果 ISV 代商家接入电脑网站支付能力，则需要传入 app_auth_token，使用第三方应用授权；自研开发模式请忽略
//        alipayRequest.putOtherTextParam("app_auth_token", "201611BB8xxxxxxxxxxxxxxxxxxxedcecde6");
        //填充业务参数

        String timeout_express = "1c";
        alipayRequest.setBizContent("{\"out_trade_no\":\"20150320010101001\","
                + "\"total_amount\":\"88.88\","
                + "\"subject\":\"Iphone6 16G\","
                + "\"body\":\"Iphone6 16G\","
                + "\"timeout_express\":\""+ timeout_express +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        String form= "" ;
        try  {
            form = alipayClient.pageExecute(alipayRequest).getBody();  //调用SDK生成表单
        }  catch  (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType( "text/html;charset="  + AlipayConfig.charset);
        httpResponse.getWriter().write(form); //直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }

}
