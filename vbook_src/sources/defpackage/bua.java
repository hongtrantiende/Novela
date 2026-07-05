package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bua  reason: default package */
/* loaded from: classes.dex */
public final class bua implements rx1, Iterable, j76 {
    public final bqa a;
    public final int b;
    public final wm9 c;

    public bua(bqa bqaVar, int i, uv4 uv4Var, wm9 wm9Var) {
        this.a = bqaVar;
        this.b = i;
        this.c = wm9Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bua) {
            bua buaVar = (bua) obj;
            if (buaVar.b == this.b && buaVar.a == this.a && buaVar.c.equals(this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return this.c.hashCode() + ((hashCode + (this.b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new aua(this.a, this.b, null, this.c);
    }
}
