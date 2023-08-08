package com.example.shoppingverse.dto.response;

import com.example.shoppingverse.Enum.ProductCategory;
import com.example.shoppingverse.model.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ItemResponseDto {

    int quantityAdded;
    String itemName;
    int itemPrice;
    ProductCategory category;
}
