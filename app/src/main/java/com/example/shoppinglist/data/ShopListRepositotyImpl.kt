package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.ShopListRepository

object ShopListRepositotyImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }

    override fun addShopItem(shopItem: ShopItem) {
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun updateShopItem(shopItem: ShopItem) {
       val oldElement = getShopItem(shopItem.id)
       shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find { it.id == shopItemId }
            ?: throw RuntimeException("Element with id $shopItemId not found")
    }

}
