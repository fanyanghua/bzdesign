package com.bs.fan.myjob_vsb.service;

import com.bs.fan.myjob_vsb.model.MaterialTraceData;

import java.util.List;

public interface IMaterialTraceService {
    public List<MaterialTraceData> getTraceDataByCoilno(String outCoilNo);
}
