package com.niepan.springbootai3.bean;

public class Medicine {
    //  编号
    private Integer m_Id;
    //    药名
    private String m_Name;
    //    R或者O  0:R   1:O
    private String m_RO_o;
    //    功能
    private String m_function;
    //    剂型
    private String m_medicament;
    //    药型：中成药或者西药
    private String m_m_type;
    //    生产国家
    private String m_produce_country;
    //    内服或者外服
    private String m_in_or_out;
    //    属于哪一科
    private String m_type;

    public Integer getM_Id() {
        return m_Id;
    }

    public void setM_Id(Integer m_Id) {
        this.m_Id = m_Id;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public String getM_RO_o() {
        return m_RO_o;
    }

    public void setM_RO_o(String m_RO_o) {
        this.m_RO_o = m_RO_o;
    }

    public String getM_function() {
        return m_function;
    }

    public void setM_function(String m_function) {
        this.m_function = m_function;
    }

    public String getM_medicament() {
        return m_medicament;
    }

    public void setM_medicament(String m_medicament) {
        this.m_medicament = m_medicament;
    }

    public String getM_m_type() {
        return m_m_type;
    }

    public void setM_m_type(String m_m_type) {
        this.m_m_type = m_m_type;
    }

    public String getM_produce_country() {
        return m_produce_country;
    }

    public void setM_produce_country(String m_produce_country) {
        this.m_produce_country = m_produce_country;
    }

    public String getM_in_or_out() {
        return m_in_or_out;
    }

    public void setM_in_or_out(String m_in_or_out) {
        this.m_in_or_out = m_in_or_out;
    }

    public String getM_type() {
        return m_type;
    }

    public void setM_type(String m_type) {
        this.m_type = m_type;
    }

    @Override
    public String toString() {
        return "Medicine [m_Id=" + m_Id + ", m_Name=" + m_Name + ", m_RO_o=" + m_RO_o + ", m_function=" + m_function
                + ", m_medicament=" + m_medicament + ", m_m_type=" + m_m_type + ", m_produce_country="
                + m_produce_country + ", m_in_or_out=" + m_in_or_out + ", m_type=" + m_type + "]";
    }
}
