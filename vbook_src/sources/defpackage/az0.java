package defpackage;

import java.nio.channels.WritableByteChannel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: az0  reason: default package */
/* loaded from: classes3.dex */
public interface az0 extends yma, WritableByteChannel {
    long J(osa osaVar);

    az0 S0(e31 e31Var);

    az0 a0();

    my0 b();

    @Override // defpackage.yma, java.io.Flushable
    void flush();

    az0 i0(String str);

    az0 n(byte[] bArr, int i);

    az0 q0(long j);

    az0 write(byte[] bArr);

    az0 writeByte(int i);

    az0 writeInt(int i);

    az0 writeShort(int i);
}
