package com.example.shoppinglist.domain

interface ShopListRepository {

    fun getShopList(): List<ShopItem>
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun updateShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
}