package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mr2  reason: default package */
/* loaded from: classes.dex */
public final class mr2 {
    public final kr2 a;
    public final lr2 b;
    public final String c;
    public final vyc d;

    public mr2(kr2 kr2Var, lr2 lr2Var, String str) {
        kr2Var.getClass();
        lr2Var.getClass();
        str.getClass();
        this.a = kr2Var;
        this.b = lr2Var;
        this.c = str;
        this.d = obe.o(str).b();
    }

    public final Map a() {
        tl8 tl8Var = this.d.c;
        tl8Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : tl8Var.a()) {
            Iterable<String> iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(tl1.s(iterable, 10));
            for (String str : iterable) {
                arrayList2.add(new yk8(entry.getKey(), str));
            }
            xl1.P(arrayList, arrayList2);
        }
        return o17.x(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr2)) {
            return false;
        }
        mr2 mr2Var = (mr2) obj;
        if (this.a == mr2Var.a && this.b == mr2Var.b && c16.i(this.c, mr2Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Deeplink(action=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", data=");
        return s21.q(sb, this.c, ")");
    }
}
