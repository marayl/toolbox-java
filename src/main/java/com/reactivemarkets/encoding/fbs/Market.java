// automatically generated by the FlatBuffers compiler, do not modify

package com.reactivemarkets.encoding.fbs;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Market extends Table {
    public static Market getRootAsMarket(ByteBuffer _bb) {
        return getRootAsMarket(_bb, new Market());
    }

    public static Market getRootAsMarket(ByteBuffer _bb, Market obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createMarket(FlatBufferBuilder builder,
                                   int symbolOffset,
                                   int venueOffset,
                                   int instrOffset,
                                   short pool,
                                   int expiry_date,
                                   long default_lots,
                                   int lot_numer,
                                   int lot_denom,
                                   int tick_numer,
                                   int tick_denom,
                                   short price_dp) {
        builder.startObject(11);
        Market.addDefaultLots(builder, default_lots);
        Market.addTickDenom(builder, tick_denom);
        Market.addTickNumer(builder, tick_numer);
        Market.addLotDenom(builder, lot_denom);
        Market.addLotNumer(builder, lot_numer);
        Market.addExpiryDate(builder, expiry_date);
        Market.addInstr(builder, instrOffset);
        Market.addVenue(builder, venueOffset);
        Market.addSymbol(builder, symbolOffset);
        Market.addPriceDp(builder, price_dp);
        Market.addPool(builder, pool);
        return Market.endMarket(builder);
    }

    public static void startMarket(FlatBufferBuilder builder) {
        builder.startObject(11);
    }

    public static void addSymbol(FlatBufferBuilder builder, int symbolOffset) {
        builder.addOffset(0, symbolOffset, 0);
    }

    public static void addVenue(FlatBufferBuilder builder, int venueOffset) {
        builder.addOffset(1, venueOffset, 0);
    }

    public static void addInstr(FlatBufferBuilder builder, int instrOffset) {
        builder.addOffset(2, instrOffset, 0);
    }

    public static void addPool(FlatBufferBuilder builder, short pool) {
        builder.addShort(3, pool, 0);
    }

    public static void addExpiryDate(FlatBufferBuilder builder, int expiryDate) {
        builder.addInt(4, expiryDate, 0);
    }

    public static void addDefaultLots(FlatBufferBuilder builder, long defaultLots) {
        builder.addLong(5, defaultLots, 0L);
    }

    public static void addLotNumer(FlatBufferBuilder builder, int lotNumer) {
        builder.addInt(6, lotNumer, 1);
    }

    public static void addLotDenom(FlatBufferBuilder builder, int lotDenom) {
        builder.addInt(7, lotDenom, 1);
    }

    public static void addTickNumer(FlatBufferBuilder builder, int tickNumer) {
        builder.addInt(8, tickNumer, 1);
    }

    public static void addTickDenom(FlatBufferBuilder builder, int tickDenom) {
        builder.addInt(9, tickDenom, 100);
    }

    public static void addPriceDp(FlatBufferBuilder builder, short priceDp) {
        builder.addShort(10, priceDp, 2);
    }

    public static int endMarket(FlatBufferBuilder builder) {
        int o = builder.endObject();
        builder.required(o, 4);  // symbol
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
        vtable_start = bb_pos - bb.getInt(bb_pos);
        vtable_size = bb.getShort(vtable_start);
    }

    public Market __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public String symbol() {
        int o = __offset(4);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer symbolAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer symbolInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 4, 1);
    }

    public String venue() {
        int o = __offset(6);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer venueAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer venueInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 6, 1);
    }

    public String instr() {
        int o = __offset(8);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer instrAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer instrInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 8, 1);
    }

    public short pool() {
        int o = __offset(10);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public int expiryDate() {
        int o = __offset(12);
        return o != 0 ? bb.getInt(o + bb_pos) : 0;
    }

    public long defaultLots() {
        int o = __offset(14);
        return o != 0 ? bb.getLong(o + bb_pos) : 0L;
    }

    public int lotNumer() {
        int o = __offset(16);
        return o != 0 ? bb.getInt(o + bb_pos) : 1;
    }

    public int lotDenom() {
        int o = __offset(18);
        return o != 0 ? bb.getInt(o + bb_pos) : 1;
    }

    public int tickNumer() {
        int o = __offset(20);
        return o != 0 ? bb.getInt(o + bb_pos) : 1;
    }

    public int tickDenom() {
        int o = __offset(22);
        return o != 0 ? bb.getInt(o + bb_pos) : 100;
    }

    public short priceDp() {
        int o = __offset(24);
        return o != 0 ? bb.getShort(o + bb_pos) : 2;
    }
}
