package cn.he4966.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.he4966.test.domain.User;
import cn.he4966.test.service.UserService;
import cn.he4966.test.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author mac
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-07-18 17:54:55
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




