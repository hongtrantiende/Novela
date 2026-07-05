package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o5f  reason: default package */
/* loaded from: classes.dex */
public abstract class o5f {
    public static final hlf a = hlf.a(new byte[0]);

    public static final hlf a(int i) {
        return hlf.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final hlf b(int i) {
        return hlf.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
