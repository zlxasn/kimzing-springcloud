package ${package.Mapper};

<#--import ${package.Entity}.${entity};-->
<#--import ${superMapperClassPackage};-->
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import ${package.Entity}.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ${table.comment!} Mapper 接口
 *
 * @author ${author}
 * @since ${date}
 */
<#if kotlin>
interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
@Mapper
<#--public interface ${table.mapperName} extends ${superMapperClass}<${entity}> {-->
public interface ${table.mapperName} {

    /**
     * 保存${table.comment!}
     */
    Integer insert(${entity} ${entity?uncap_first});

    /**
     * 删除${table.comment!}
     */
    void delete(Integer id);

    /**
     * 根据ID更新${table.comment!}
     */
    void update(${entity} ${entity?uncap_first});

    /**
     * 根据ID查询${table.comment!}
     */
    ${table.name?cap_first}BO selectById(Integer id);

    /**
     * 条件分页查询${table.comment!}
     */
    IPage<${table.name?cap_first}BO> selectPage(Page<${table.name?cap_first}BO> page, @Param("query") ${table.name?cap_first}QueryDTO ${table.name}QueryDTO);

}
</#if>
