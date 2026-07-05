package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ngf  reason: default package */
/* loaded from: classes.dex */
public final class ngf {
    public int a;
    public final int b;
    public ngf c;
    public final HashMap d = new HashMap(0);

    public ngf(int i, int i2) {
        if (i <= i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
            return;
        }
        p1a.g();
        throw null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return nk2.s(identityHashCode, "Node", new StringBuilder(String.valueOf(identityHashCode).length() + 4));
    }
}
