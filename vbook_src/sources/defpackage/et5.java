package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: et5  reason: default package */
/* loaded from: classes3.dex */
public final class et5 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Map d;

    public et5(Set set, Set set2, Set set3, Map map) {
        set.getClass();
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = map;
    }

    public static et5 a(et5 et5Var, Set set, Set set2, Set set3, Map map, int i) {
        if ((i & 2) != 0) {
            set2 = et5Var.b;
        }
        if ((i & 4) != 0) {
            set3 = et5Var.c;
        }
        if ((i & 8) != 0) {
            map = et5Var.d;
        }
        et5Var.getClass();
        set2.getClass();
        set3.getClass();
        map.getClass();
        return new et5(set, set2, set3, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et5)) {
            return false;
        }
        et5 et5Var = (et5) obj;
        if (c16.i(this.a, et5Var.a) && c16.i(this.b, et5Var.b) && c16.i(this.c, et5Var.c) && c16.i(this.d, et5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + s21.b(this.c, s21.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ImportState(importProgress=" + this.a + ", importError=" + this.b + ", importSuccess=" + this.c + ", importBookIdByPath=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ et5(int r2, java.util.Set r3) {
        /*
            r1 = this;
            r2 = r2 & 1
            rs3 r0 = defpackage.rs3.a
            if (r2 == 0) goto L7
            r3 = r0
        L7:
            ls3 r2 = defpackage.ls3.a
            r1.<init>(r3, r0, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et5.<init>(int, java.util.Set):void");
    }
}
