package defpackage;

import java.io.Closeable;
import java.io.Flushable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yma  reason: default package */
/* loaded from: classes3.dex */
public interface yma extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    dac timeout();

    void write(my0 my0Var, long j);
}
