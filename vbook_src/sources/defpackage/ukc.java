package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ukc  reason: default package */
/* loaded from: classes.dex */
public final class ukc {
    public final qa4 a;
    public final dpa b;
    public final qa1 c;
    public final iz9 d;
    public final v4d e;
    public final boolean f;
    public final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [ls3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ukc(defpackage.qa4 r3, defpackage.dpa r4, defpackage.qa1 r5, defpackage.iz9 r6, defpackage.v4d r7, java.util.LinkedHashMap r8, int r9) {
        /*
            r2 = this;
            r0 = r9 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r9 & 2
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r0 = r9 & 4
            if (r0 == 0) goto L10
            r5 = r1
        L10:
            r0 = r9 & 8
            if (r0 == 0) goto L15
            r6 = r1
        L15:
            r0 = r9 & 16
            if (r0 == 0) goto L1a
            r7 = r1
        L1a:
            r0 = r9 & 32
            if (r0 == 0) goto L20
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            r9 = r9 & 64
            if (r9 == 0) goto L27
            ls3 r8 = defpackage.ls3.a
        L27:
            r9 = r8
            r8 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukc.<init>(qa4, dpa, qa1, iz9, v4d, java.util.LinkedHashMap, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukc)) {
            return false;
        }
        ukc ukcVar = (ukc) obj;
        if (c16.i(this.a, ukcVar.a) && c16.i(this.b, ukcVar.b) && c16.i(this.c, ukcVar.c) && c16.i(this.d, ukcVar.d) && c16.i(this.e, ukcVar.e) && this.f == ukcVar.f && c16.i(this.g, ukcVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        qa4 qa4Var = this.a;
        if (qa4Var == null) {
            hashCode = 0;
        } else {
            hashCode = qa4Var.hashCode();
        }
        int i2 = hashCode * 31;
        dpa dpaVar = this.b;
        if (dpaVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = dpaVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        qa1 qa1Var = this.c;
        if (qa1Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = qa1Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        iz9 iz9Var = this.d;
        if (iz9Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = iz9Var.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        v4d v4dVar = this.e;
        if (v4dVar != null) {
            i = v4dVar.hashCode();
        }
        return this.g.hashCode() + eub.k((i5 + i) * 31, 31, this.f);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=" + this.e + ", hold=" + this.f + ", effectsMap=" + this.g + ")";
    }

    public ukc(qa4 qa4Var, dpa dpaVar, qa1 qa1Var, iz9 iz9Var, v4d v4dVar, boolean z, Map map) {
        this.a = qa4Var;
        this.b = dpaVar;
        this.c = qa1Var;
        this.d = iz9Var;
        this.e = v4dVar;
        this.f = z;
        this.g = map;
    }
}
