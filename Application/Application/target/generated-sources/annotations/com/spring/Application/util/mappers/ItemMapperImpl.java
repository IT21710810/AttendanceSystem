package com.spring.Application.util.mappers;

import com.spring.Application.dto.request.ItemSaveRequestDTO;
import com.spring.Application.dto.response.ItemGetResponseDTO;
import com.spring.Application.entity.Item;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-01T13:51:31+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class ItemMapperImpl implements ItemMapper {

    @Override
    public List<ItemGetResponseDTO> entityListToDTOList(List<Item> items) {
        if ( items == null ) {
            return null;
        }

        List<ItemGetResponseDTO> list = new ArrayList<ItemGetResponseDTO>( items.size() );
        for ( Item item : items ) {
            list.add( entityToDto( item ) );
        }

        return list;
    }

    @Override
    public ItemGetResponseDTO entityToDto(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemGetResponseDTO itemGetResponseDTO = new ItemGetResponseDTO();

        itemGetResponseDTO.setItemId( item.getItemId() );
        itemGetResponseDTO.setItemName( item.getItemName() );
        itemGetResponseDTO.setBalanceQty( item.getBalanceQty() );
        itemGetResponseDTO.setSupplier_Price( item.getSupplier_Price() );
        itemGetResponseDTO.setSelling_Price( item.getSelling_Price() );

        return itemGetResponseDTO;
    }

    @Override
    public Item dtoToEntity(ItemSaveRequestDTO itemSaveRequestDTO) {
        if ( itemSaveRequestDTO == null ) {
            return null;
        }

        Item item = new Item();

        item.setItemName( itemSaveRequestDTO.getItemName() );
        item.setMeasuringUnitType( itemSaveRequestDTO.getMeasuringUnitType() );
        item.setBalanceQty( itemSaveRequestDTO.getBalanceQty() );
        item.setSupplier_Price( itemSaveRequestDTO.getSupplier_Price() );
        item.setSelling_Price( itemSaveRequestDTO.getSelling_Price() );

        return item;
    }

    @Override
    public List<ItemGetResponseDTO> LisDTOToPage(Page<Item> items) {
        if ( items == null ) {
            return null;
        }

        List<ItemGetResponseDTO> list = new ArrayList<ItemGetResponseDTO>();
        for ( Item item : items ) {
            list.add( entityToDto( item ) );
        }

        return list;
    }
}
