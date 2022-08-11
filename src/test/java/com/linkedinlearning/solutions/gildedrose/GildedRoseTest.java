package com.linkedinlearning.solutions.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GildedRoseTest {

  @Test
  public void regularItem() {
    Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 20) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("+5 Dexterity Vest", items[0].name);
    Assertions.assertEquals(9, items[0].sellIn);
    Assertions.assertEquals(19, items[0].quality);
  }

  @Test
  public void sellDatePassed() {
    Item[] items = new Item[] { new Item("+5 Dexterity Vest", 0, 20) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("+5 Dexterity Vest", items[0].name);
    Assertions.assertEquals(-1, items[0].sellIn);
    Assertions.assertEquals(18, items[0].quality);
  }

  @Test
  public void brieIncreases() {
    Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("Aged Brie", items[0].name);
    Assertions.assertEquals(1, items[0].sellIn);
    Assertions.assertEquals(1, items[0].quality);
  }

  @Test
  public void brieMax50() {
    Item[] items = new Item[] { new Item("Aged Brie", 2, 50) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("Aged Brie", items[0].name);
    Assertions.assertEquals(1, items[0].sellIn);
    Assertions.assertEquals(50, items[0].quality);
  }

  @Test
  public void backStagePassRegular() {
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    Assertions.assertEquals(14, items[0].sellIn);
    Assertions.assertEquals(21, items[0].quality);
  }

  @Test
  public void backStagePass10Days() {
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    Assertions.assertEquals(8, items[0].sellIn);
    Assertions.assertEquals(22, items[0].quality);
  }

  @Test
  public void backStagePass5Days() {
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    Assertions.assertEquals(4, items[0].sellIn);
    Assertions.assertEquals(23, items[0].quality);
  }

  @Test
  public void backStagePassDropAfterConcert() {
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    Assertions.assertEquals(-1, items[0].sellIn);
    Assertions.assertEquals(0, items[0].quality);
  }

  @Test
  public void sulfurasNeverDropsInQuality() {
    Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("Sulfuras, Hand of Ragnaros", items[0].name);
    Assertions.assertEquals(0, items[0].sellIn);
    Assertions.assertEquals(80, items[0].quality);
  }

  @Test
  public void conjuredItemsDegradeTwiceAsFast() {
    Item[] items = new Item[] { new Item("Conjured Mana Cake", 3, 6) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Assertions.assertEquals("Conjured Mana Cake", items[0].name);
    Assertions.assertEquals(2, items[0].sellIn);
    Assertions.assertEquals(4, items[0].quality);
  }

}
