package com.xiaoduo.sms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 销售单Repository接口
 *
 * @author Administrator
 */
@Mapper
@Component("saleListMapper")
public interface SaleListMapper {

    /**
     * 获取当天最大销售单号
     *
     * @return
     */
//	@Query(value="SELECT MAX(sale_number) FROM t_sale_list WHERE TO_DAYS(sale_date) = TO_DAYS(NOW())",nativeQuery=true)
    String getTodayMaxSaleNumber();

    /**
     * 按天统计某个日期范围内的销售信息
     *
     * @param begin
     * @param end
     * @return
     */
//	@Query(value="SELECT SUM(t3.purchasing_price*t1.num) AS amountCost,SUM(t1.price*t1.num) AS amountSale,t2.`sale_date` AS saleDate FROM t_sale_list_goods t1 LEFT JOIN t_sale_list t2 ON t1.`sale_list_id`=t2.`id`   LEFT JOIN t_goods t3 ON t3.`id`=t1.`goods_id` WHERE t2.`sale_date` BETWEEN ?1 AND ?2 GROUP BY t2.`sale_date` ",nativeQuery=true)
    List<Object> countSaleByDay(
            @Param("begin") String begin,
            @Param("end") String end);

    /**
     * 按月统计某个日期范围内的销售信息
     *
     * @param begin
     * @param end
     * @return
     */
//	@Query(value="SELECT SUM(t3.purchasing_price*t1.num) AS amountCost,SUM(t1.price*t1.num) AS amountSale,DATE_FORMAT(t2.`sale_date`,'%Y-%m') AS saleDate FROM t_sale_list_goods t1 LEFT JOIN t_sale_list t2 ON t1.`sale_list_id`=t2.`id`   LEFT JOIN t_goods t3 ON t3.`id`=t1.`goods_id` WHERE DATE_FORMAT(t2.`sale_date`,'%Y-%m') BETWEEN ?1 AND ?2 GROUP BY DATE_FORMAT(t2.`sale_date`,'%Y-%m') ",nativeQuery=true)
    List<Object> countSaleByMonth(
            @Param("begin") String begin,
            @Param("end") String end);
}
