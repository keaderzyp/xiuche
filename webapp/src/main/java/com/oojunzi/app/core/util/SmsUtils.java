package com.oojunzi.app.core.util;
/** 
* @author liguoqiang
* @date 2017年8月11日 下午3:18:31 
* @describe 
*/

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.dysmsapi.transform.v20170525.SendSmsResponseUnmarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.oojunzi.app.web.model.SmsModel;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created on 17/6/7.
 * 短信API产品的DEMO程序,工程中包含了一个SmsDemo类，直接通过
 * 执行main函数即可体验短信产品API功能(只需要将AK替换成开通了云通信-短信产品功能的AK即可)
 * 工程依赖了2个jar包(存放在工程的libs目录下)
 * 1:aliyun-java-sdk-core.jar
 * 2:aliyun-java-sdk-dysmsapi.jar
 *
 * 备注:Demo工程编码采用UTF-8
 * 国际短信发送请勿参照此DEMO
 */
public class SmsUtils {

    //产品名称:云通信短信API产品,开发者无需替换
    static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    static final String accessKeyId = "LTAIOKsiTZ9a7lPx";
    static final String accessKeySecret = "L2FPVeuqCsS8bbIJvsapYpqT4SKO9I";

    public static SendSmsResponse sendSms(SmsModel smsModel) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);
      //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(smsModel.getPhone());
        //必填:短信签名-可在短信控制台中找到
        request.setSignName("互助修车");
      //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode(smsModel.getTemplateCode());
        switch (smsModel.getTemplateCode()) {
        //结算账单-至互助用户
		case "SMS_84465004":
			request.setTemplateParam("{\"bill\":\""+smsModel.getParam1()+"\",\"money\":\""+smsModel.getParam2()+"\"}");
			break;
			 //服务完成-至求助用户
		case "SMS_84545008":
			request.setTemplateParam("{\"carnumber\":\""+smsModel.getParam1()+"\",\"money1\":\""+smsModel.getParam2()+"\",\"money2\":\""+smsModel.getParam3()+"\"}");
			break;
			 //求助提醒（客服提交后）- 至车管家
		case "SMS_84635008":
			request.setTemplateParam("{\"phone1\":\""+smsModel.getParam1()+"\",\"carnumber\":\""+smsModel.getParam2()+"\",\"phone\":\""+smsModel.getParam3()+"\"}");
			break;
			 //求助提醒（客服提交后）- 至用户
		case "SMS_84460018":
			request.setTemplateParam("{\"name\":\""+smsModel.getParam1()+"\",\"phone\":\""+smsModel.getParam2()+"\"}");
			break;
			 //出险提醒（用户提交后）- 至客服	
		case "SMS_84625011":
			request.setTemplateParam("{\"phone\":\""+smsModel.getParam1()+"\",\"carnumber\":\""+smsModel.getParam2()+"\"}");
			break;
			 //加入互助计划	
		case "SMS_84525013":
			request.setTemplateParam("{\"carnumber\":\""+smsModel.getParam1()+"\",\"date\":\""+smsModel.getParam2()+"\"}");
			break;
			 //注册验证码	
		case "SMS_84535005":
	        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
	        request.setTemplateParam("{\"number\":\""+smsModel.getParam1()+"\"}");
	        //System.out.println(smsModel.getParam1());
	        //return sb.toString();
	        break;
		default:
			break;
		}
        
        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        request.setOutId("yourOutId");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
		//return null;

        return sendSmsResponse;
    }


   

    
}

