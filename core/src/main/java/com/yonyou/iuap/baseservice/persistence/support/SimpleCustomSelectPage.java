package com.yonyou.iuap.baseservice.persistence.support;

import com.yonyou.iuap.mvc.type.SearchParams;
import com.yonyou.iuap.ucf.common.entity.Identifier;
import org.springframework.data.domain.PageRequest;

public  abstract class SimpleCustomSelectPage<T extends Identifier> implements CustomSelectPageable<T>   {

    protected SearchParams searchParams;
    protected PageRequest pageRequest;

    public SearchParams getSearchParams() {
        return searchParams;
    }

    public PageRequest getPageRequest() {
        return pageRequest;
    }

    public SimpleCustomSelectPage(SearchParams searchParams, PageRequest pageRequest) {
        this.searchParams = searchParams;
        this.pageRequest = pageRequest;
    }


}
