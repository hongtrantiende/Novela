package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q71  reason: default package */
/* loaded from: classes3.dex */
public final class q71 {
    public static final q71 f = new q71(null, 63);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final d92 d;
    public final mu4 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ q71(defpackage.mu4 r10, int r11) {
        /*
            r9 = this;
            r0 = r11 & 1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r4 = r2
            goto L9
        L8:
            r4 = r1
        L9:
            r0 = r11 & 2
            if (r0 == 0) goto Lf
            r5 = r1
            goto L10
        Lf:
            r5 = r2
        L10:
            r0 = r11 & 4
            if (r0 == 0) goto L16
            r6 = r1
            goto L17
        L16:
            r6 = r2
        L17:
            r11 = r11 & 32
            if (r11 == 0) goto L1c
            r10 = 0
        L1c:
            r8 = r10
            d92 r7 = defpackage.d92.b
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q71.<init>(mu4, int):void");
    }

    public static q71 a(q71 q71Var) {
        boolean z = q71Var.b;
        boolean z2 = q71Var.c;
        d92 d92Var = q71Var.d;
        q71Var.getClass();
        mu4 mu4Var = q71Var.e;
        q71Var.getClass();
        d92Var.getClass();
        return new q71(true, z, z2, d92Var, mu4Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q71) {
                q71 q71Var = (q71) obj;
                if (this.a != q71Var.a || this.b != q71Var.b || this.c != q71Var.c || this.d != q71Var.d || !c16.i(this.e, q71Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 961;
        mu4 mu4Var = this.e;
        if (mu4Var == null) {
            hashCode = 0;
        } else {
            hashCode = mu4Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder p = rs8.p("CascadeEditorConfig(readOnly=", this.a, ", blockSelectionEnabled=", this.b, ", blockDraggingEnabled=");
        p.append(this.c);
        p.append(", crashPolicy=");
        p.append(this.d);
        p.append(", onInternalError=null, emojiImageLoader=");
        p.append(this.e);
        p.append(")");
        return p.toString();
    }

    public q71(boolean z, boolean z2, boolean z3, d92 d92Var, mu4 mu4Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = d92Var;
        this.e = mu4Var;
    }
}
