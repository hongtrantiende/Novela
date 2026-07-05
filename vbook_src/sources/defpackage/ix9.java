package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ix9  reason: default package */
/* loaded from: classes.dex */
public final class ix9 implements Closeable {
    public final int a;
    public final /* synthetic */ lx9 b;

    public ix9(lx9 lx9Var, int i) {
        this.b = lx9Var;
        this.a = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        lx9 lx9Var = this.b;
        if (((lr8) lx9Var.b).b.getValue() instanceof dz1) {
            z87.v(lx9Var.E, null, null, new z38(lx9Var, this, null, 15), 3);
        }
    }
}
