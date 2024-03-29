package com.celinecloset.repository;

import com.celinecloset.dto.ItemSearchDto;
import com.celinecloset.dto.MainItemDto;
import com.celinecloset.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}
