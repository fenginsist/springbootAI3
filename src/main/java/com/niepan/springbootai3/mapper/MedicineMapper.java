package com.niepan.springbootai3.mapper;

import com.niepan.springbootai3.bean.Medicine;
import org.apache.ibatis.annotations.*;

import java.util.List;

//药品的mapper   接口与配置文件在一块
@Mapper
public interface MedicineMapper {

    @Select("select * from medicine  where m_id=#{id}")
    public Medicine getMedicineById(Integer id);

    @Select("select * from medicine")
    public List<Medicine> getAllMedic();

    @Delete("delete from medicine where m_id=#{id}")
    public int deleteMedicById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty ="m_id" )
    @Insert("insert into medicine(m_name,m_or_o,m_function,m_medicament,m_m_type,m_produce_country,m_in_or_out,m_type) values(#{m_Name},#{m_RO_o},#{m_function},#{m_medicament},#{m_m_type},#{m_produce_country},#{m_in_or_out},#{m_type})")
    public int insertMedic(Medicine medicineDetail);

    @Update("update medicine set m_name=#{m_name},r_or_o=#{m_RO_o},m_function=#{m_function},m_medicament=#{m_medicament},m_m_type=#{m_m_type},m_produce_country=#{m_produce_country},m_in_or_out=#{m_in_or_out},m_type=#{m_type} where m_id=#{id} ")
    public int updateMedic(Medicine medicineDetail);


}
