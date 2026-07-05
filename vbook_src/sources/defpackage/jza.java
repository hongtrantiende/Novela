package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jza  reason: default package */
/* loaded from: classes.dex */
public abstract class jza implements iza {
    public final z30 a = new AtomicInteger(0);

    public final boolean f(int i) {
        if ((this.a.get() & i) != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i) {
        z30 z30Var;
        int i2;
        do {
            z30Var = this.a;
            i2 = z30Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!z30Var.compareAndSet(i2, i2 | i));
    }
}
