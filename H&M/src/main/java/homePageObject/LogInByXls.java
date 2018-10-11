package homePageObject;

import base.BaseUtil;
import dataProviderUtilityWithXlsReader.XlsDataReaderUtil;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

public class LogInByXls extends BaseUtil {

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
}
