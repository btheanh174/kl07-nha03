package util;

public class CurrencyConverter {

	public static float convertUSDtoVND(float usd)
	{
		return usd*20600;
	}
	
	public static float convertVNDtoUSD(float vnd)
	{
		return vnd/20600;
	}
}
