package cn.he4966.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.he4966.test.domain.TbAccount;
import cn.he4966.test.service.TbAccountService;
import cn.he4966.test.mapper.TbAccountMapper;
import org.springframework.stereotype.Service;

/**
* @author mac
* @description 针对表【tb_account】的数据库操作Service实现
* @createDate 2023-07-22 11:12:37
*/
@Service
public class TbAccountServiceImpl extends ServiceImpl<TbAccountMapper, TbAccount>
    implements TbAccountService{

}




