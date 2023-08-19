package cn.he4966.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.he4966.test.domain.TbArticle;
import cn.he4966.test.service.TbArticleService;
import cn.he4966.test.mapper.TbArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author mac
* @description 针对表【tb_article】的数据库操作Service实现
* @createDate 2023-07-22 09:52:35
*/
@Service
public class TbArticleServiceImpl extends ServiceImpl<TbArticleMapper, TbArticle>
    implements TbArticleService{

}




