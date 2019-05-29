package com.fileDownload.demoDownloadFile.storage;

import com.fileDownload.demoDownloadFile.domain.Emlopyee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private static List empList=new ArrayList();

    static {

empList.add(new Emlopyee(1,"abc","abc@gamil.com","Pune","111111111",120000));

    }

    public List getEmpList(){

        return empList;
    }
}
