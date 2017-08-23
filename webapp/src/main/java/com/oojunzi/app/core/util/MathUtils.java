package com.oojunzi.app.core.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.aspectj.apache.bcel.classfile.Code;


public class MathUtils {
	/**阶乘*/
	public static BigDecimal nn_(BigDecimal n){

		for(long i = n.longValue() - 1; i > 0; i--){
			n = n.multiply(new BigDecimal(i));
		}
		return n;
	}
	/**排列*/
	public static BigDecimal p_n_m(BigDecimal n,BigDecimal m){
		BigDecimal tmp = n.subtract(m);
		return nn_(n).divide(nn_(tmp));
	}
	/**组合*/
	public static BigDecimal c_n_m(BigDecimal n,BigDecimal m){
		BigDecimal tmp = n.subtract(m);
		return nn_(n).divide((nn_(tmp).multiply(nn_(m))));
	}
	public static void main(String args[]){
		System.out.println(roundByScale(0.5541,2));
		if(true) System.exit(0);
		Date begin = new Date();
		testnn();
		//new MathUtils().testtt();
		/*
		System.out.println(c_n_m(new BigDecimal(100),new BigDecimal(3)).multiply(new BigDecimal(0.001)));
		int ids[] = new int[5];
		for(int i = 0; i < ids.length ;i ++){
			ids[i] = i;
		}
		
		printNCrossN(ids,new Function(){
			public void call(List<int> vH,int m,List<int> vT ){
				for(int n: vH) System.out.print(n + ",");
				System.out.print(m + ",");
				for(int n: vT) System.out.print(n + ",");
				System.out.println();
			}
		}) ;*/
		Date end = new Date();
		System.out.println("总共花费：" + ((end.getTime() - begin.getTime()) / 1000f) + "秒");
	}

	
	private static int count = 0;
	/**求100个数取3个数的组合*/
	private static void testnn(){
		int tmp[] = new int[20];
		for(int i = 0; i < tmp.length ; i++){
			tmp[i] = i;
		}
		pickMfromNums(13,new int[0],tmp);
		System.out.println(count);
	}
	private void testtt(){
		int tmp[] = new int[3];
		for(int i = 0; i < tmp.length ; i++){
			tmp[i] = i;
		}
		perm(tmp,0,tmp.length - 1);
		System.out.println(count);
	}
	private static void pickMfromNums(int m,int[] result,int...inputs){
		if(result.length < m){
			for(int i = 0; i < inputs.length; i++){
				int nextResult[] = new int[result.length + 1];
				for(int k = 0; k < result.length; k++){
					nextResult[k] = result[k];
				}
				int cur = inputs[i];
				if(result.length > 0 && cur < result[result.length - 1])
					continue;
				nextResult[nextResult.length - 1] = cur;
				int nextInput[] = new int[inputs.length - 1];
				for(int k = 0; k < i; k++){
					nextInput[k] = inputs[k];
				}
				for(int k = i + 1; k < inputs.length; k++){
					nextInput[k-1] = inputs[k];
				}
				pickMfromNums(m,nextResult,nextInput);
			}
		}else{
			double sum = 0;
			for(int i = 0; i < result.length; i++){
				sum+=result[i];
				//System.out.print(result[i] + ",");
			}
			if(sum > 100000000)
				System.out.println();
			count++;
		}
	}
	/**非递归算法 begin*/
	int n = 0;  


	public void perm(int list[], int k, int m) 
	{     
	    int i;     
	    if(k == m)     
	    {          
	        for(i = 0; i <= m; i++)             
	            System.out.print(list[i] + ",");         
	        System.out.println();         
	        n++;     
	    }     
	    else     
	    {         
	        for(i = k; i <= m; i++)         
	        {         
	        	int temp = list[k];
	        	list[k] = list[i];
	        	list[i] = temp;
	            //swap(&list[k], &list[i]);             
	            perm(list, k + 1, m);   
	            temp = list[k];
	        	list[k] = list[i];
	        	list[i] = temp;
	            //swap(&list[k], &list[i]);         
	        }     
	    } 
	} 
	/**非递归算法 end*/
	public static void ttt(int[][] result,int[]...inputss){
		int sum = 0;
		for(int i = 0; i < result.length; i++){
			int item[] = result[i];
			for(int j = 0; j < item.length; j++)
				sum+=item[j];
		}
		if(sum < 3){
			for(int i = 0; i < inputss.length; i++){
				int item[] = inputss[i];
			}
		}else{
			for(int i = 0; i < result.length; i++){
				int item[] = result[i];
				System.out.print(i + "=>");
				for(int j = 0; j < item.length; j++)
					System.out.print(item[j] + ",");
				System.out.println();
			}
		}
	}
	/**四舍五入金额*/
	public static double roundByScale(double num,int scale){
		return new BigDecimal(num).setScale(scale,BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}
	public enum OP{
		ADD,
		SUB,
		MUL,
		DIV,
		SCALE,
		UP,
		DOWN
	}
    //默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;

    //这个类不能实例化
    private MathUtils() {
    }

    /**
     * 提供精确的加法运算。
     *
     * @param v1 被加数
     * @param v2 加数
     * @return 两个参数的和
     * @throws Exception 
     */

    public static double add(double... args) throws Exception {
    	try{
	        BigDecimal v = new BigDecimal(Double.toString(args[0]));
	        for(int i = 1; i <args.length; i++){
	        	v = v.add(new BigDecimal(Double.toString(args[i])));
	        }
	        return v.doubleValue();
    	}catch(Exception e){
    		throw e;
    	}
    }

    /**
     * 提供精确的减法运算。
     *
     * @param v1 减数
     * @param v2 被减数
     * @return 两个参数的差
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算。
     *
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static double mul(double...args) {
        BigDecimal v = new BigDecimal(Double.toString(args[0]));
        for(int i = 1; i <args.length; i++){
        	v = v.multiply(new BigDecimal(Double.toString(args[i])));
        }
        return v.doubleValue();
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到
     * 小数点以后10位，以后的数字四舍五入。
     *
     * @param v1 被除数
     * @param v2 除数
     * @return 两个参数的商
     * @throws Exception 
     */
    public static double div(double v1, double v2) throws Exception {
        return div(v1, v2, DEF_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     * @throws Exception 
     */
    public static double div(double v1, double v2, int scale) throws Exception {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        try{
	        BigDecimal b1 = new BigDecimal(Double.toString(v1));
	        BigDecimal b2 = new BigDecimal(Double.toString(v2));
	        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
        }catch(Exception e){
        	throw e;
        }
    }

    /**
     * 提供精确的小数位四舍五入处理。
     *
     * @param v     需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {
    	 BigDecimal b = new BigDecimal(Double.toString(v));
        return _round(b,scale).doubleValue();
    }
    private static BigDecimal _round(BigDecimal b, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }       
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP);
    }
    
    /**
     * 设置精确度
     * @param val
     * @param scale ： 小数位数
     * @param roundType ： 取舍方式
     * @return
     */
    public static double round( double val , int scale , int roundingMode ){
    	return new BigDecimal(val + "" ).setScale(scale, roundingMode).doubleValue() ;
    }
    
    /**
     * 以 BigDecimal.ROUND_UP 方式设置精确度
     * @param val ：原数值
     * @param scale ：精度
     * @return
     */
    public static double roundFn( double val , int scale ){
    	return round(val, scale, BigDecimal.ROUND_UP );
    }
    
    public static double op(double num,Object...args){
    	 BigDecimal v = new BigDecimal(Double.toString(num));
    	 int i = 0;
    	 while(i < args.length){
    		 OP op = (OP) args[i];
    		 Object _n = args[i + 1];
    		 BigDecimal n = null;
    		 if(_n instanceof Double)
    			 n =  new BigDecimal(Double.toString((Double) _n));
    		 else if(_n instanceof Float)
    			 n =  new BigDecimal(Double.toString((Float) _n));
    		 else if(_n instanceof Long)
    			 n =  new BigDecimal(Double.toString((Long) _n));
    		 else if(_n instanceof Integer)
    			 n =  new BigDecimal(Double.toString((Integer) _n));
    		 else if(_n instanceof Short)
    			 n =  new BigDecimal(Double.toString((Short) _n));
    		 if(op.equals(OP.ADD))
    			 v = v.add(n);
    		 else if(op.equals(OP.SUB))
    			 v = v.subtract(n);
    		 else if(op.equals(OP.MUL))
    			 v = v.multiply(n);
    		 else if(op.equals(OP.DIV))
    			 v = v.divide(n ,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP);
    		 else if(op.equals(OP.SCALE))
    			 v = _round(v,n.intValue());
    		 else if(op.equals(OP.UP))
    			 v = new BigDecimal(v.setScale(n.intValue(), BigDecimal.ROUND_CEILING).doubleValue() + "");
    		 else if(op.equals(OP.DOWN))
    			 v = new BigDecimal(v.setScale(n.intValue(), BigDecimal.ROUND_FLOOR).doubleValue() + "");
    		 
    		 i = i + 2;
    	 }
         return v.doubleValue();
    }
    public static double truncToScale(double amount, int scale) throws Exception{
    	int mod = 1;
    	for(int i = 0; i < scale; i++){
    		mod*= 10;
    	}
    	return MathUtils.div(Math.floor(MathUtils.mul(amount,mod)), mod);
    }
    public static double ceilToScale(double amount, int scale){
    	/*if(amount == 0)
    		return amount;
    	int mod = 1;
    	for(int i = 0; i < scale; i++){
    		mod*= 10;
    	}
    	return MathUtils.div(Math.ceil(MathUtils.mul(amount,mod)), mod);
    	*/
    	return round(amount,scale,BigDecimal.ROUND_CEILING);
    }
    private static DecimalFormat fmAmount = new DecimalFormat("##.00");
    public static String toAmountFormat(double amount){
    	return fmAmount.format(amount);
    }
    private static DecimalFormat fmWeight = new DecimalFormat("##.000");
    public static String toWeightFormat(double amount){
    	return fmWeight.format(amount);
    }
    /**
     * 从字符串里取得数字
     * @param str
     * @return
     */
    public static double[] getNumbers(String str){
		String[] strs = str.split("[^0-9\\.]");
		List<Double> doubles = new ArrayList<Double>(strs.length);
		for(String s: strs){
			if(s.length() > 0)
				doubles.add(Double.parseDouble(s));
		}
		double[] result = new double[doubles.size()];
		for(int i = 0; i < doubles.size(); i++){
			result[i] = doubles.get(i);
		}
		return result;
	}
    /**
     * 返回占分母数
     * 如pushweight=countByRate(pushunits,validunits,validweight);
     * @param subMolecular 占分子数
     * @param molecular 分子
     * @param denominator 分母
     * @param scale 保留小数点后位数
     */
    public static double countByRate(double subMolecular, double molecular, double denominator,int scale){
    	if(subMolecular == molecular)
    		return denominator;
    	if(molecular == 0)
    		return 0;
    	return MathUtils.op(denominator,OP.MUL,subMolecular,OP.DIV,molecular,OP.SCALE,scale);	
    }
    
    //add LGQ  验证码
    public static String code(){
    	String str="0123456789";
	    StringBuilder sb=new StringBuilder(4);
	    for(int i=0;i<4;i++)
	    {
	    	char ch=str.charAt(new Random().nextInt(str.length()));
	        sb.append(ch);
	    }
    	return sb.toString();
    }
}
