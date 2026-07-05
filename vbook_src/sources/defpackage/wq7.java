package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wq7  reason: default package */
/* loaded from: classes3.dex */
public final class wq7 {
    public final String a = hre.q().toString();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final ArrayList e = new ArrayList();

    public final void a(yx5 yx5Var) {
        yj0 yj0Var = yx5Var.a;
        gi1 gi1Var = yj0Var.b;
        nf9 nf9Var = yj0Var.a;
        StringBuilder sb = new StringBuilder();
        s21.v(gi1Var, sb, ':', "", ':');
        sb.append(nf9Var);
        this.c.put(sb.toString(), yx5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq7)) {
            return false;
        }
        return c16.i(this.a, ((wq7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
