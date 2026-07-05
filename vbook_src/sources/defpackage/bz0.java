package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bz0  reason: default package */
/* loaded from: classes3.dex */
public interface bz0 extends osa, ReadableByteChannel {
    e31 B(long j);

    String F0();

    byte[] K();

    boolean P0(long j, e31 e31Var);

    my0 b();

    String c0(long j);

    long f1();

    InputStream i1();

    boolean k();

    int read(byte[] bArr);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    void skip(long j);

    e31 t0();

    void w(long j);

    void w0(my0 my0Var, long j);
}
