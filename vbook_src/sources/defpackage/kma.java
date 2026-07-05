package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kma  reason: default package */
/* loaded from: classes.dex */
public final class kma implements wz9 {
    public final Object a;
    public final jz7 b;
    public final List c;
    public final List d;
    public final tu1 e = new tu1(new el7(this, 16), true, -322904035);

    public kma(Object obj, jz7 jz7Var, List list) {
        this.a = obj;
        this.b = jz7Var;
        this.c = list;
        this.d = tl1.A(jz7Var);
    }

    @Override // defpackage.wz9
    public final List a() {
        return this.c;
    }

    @Override // defpackage.wz9
    public final List b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && kma.class == obj.getClass()) {
                kma kmaVar = (kma) obj;
                if (c16.i(this.a, kmaVar.a) && c16.i(this.b, kmaVar.b) && this.c.equals(kmaVar.c) && c16.i(this.d, kmaVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wz9
    public final Object getKey() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + hashCode;
    }

    @Override // defpackage.wz9
    public final tu1 o() {
        return this.e;
    }

    public final String toString() {
        return "SinglePaneScene(key=" + this.a + ", entry=" + this.b + ", previousEntries=" + this.c + ", entries=" + this.d + ")";
    }
}
