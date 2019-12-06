// automatically generated by the FlatBuffers compiler, do not modify

package com.reactivemarkets.encoding.fbs;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;

import java.nio.ByteBuffer;

@SuppressWarnings("unused")
public final class MDTrade extends Struct {
    public static int createMDTrade(FlatBufferBuilder builder, long transTs, short side, double qty, double price) {
        builder.prep(8, 32);
        builder.putDouble(price);
        builder.putDouble(qty);
        builder.pad(6);
        builder.putShort(side);
        builder.putLong(transTs);
        return builder.offset();
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public MDTrade __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public long transTs() {
        return bb.getLong(bb_pos + 0);
    }

    public short side() {
        return bb.getShort(bb_pos + 8);
    }

    public double qty() {
        return bb.getDouble(bb_pos + 16);
    }

    public double price() {
        return bb.getDouble(bb_pos + 24);
    }
}
