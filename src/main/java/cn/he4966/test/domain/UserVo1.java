package cn.he4966.test.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class UserVo1 implements Serializable {
    /**
     * 主键ID
     */
    @TableId
    private Long id;

    /**
     * 姓名
     */
    private String name;


}