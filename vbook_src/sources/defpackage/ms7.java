package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ms7  reason: default package */
/* loaded from: classes3.dex */
public final class ms7 implements mo3 {
    public final cj3 a;
    public final int b;

    public ms7(cj3 cj3Var, int i) {
        cj3Var.getClass();
        this.a = cj3Var;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        if (r0 <= r13) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
        if (r0 != r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d1, code lost:
        if (r2 == false) goto L108;
     */
    @Override // defpackage.mo3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.so3 a(defpackage.so3 r18) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms7.a(so3):so3");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms7)) {
            return false;
        }
        ms7 ms7Var = (ms7) obj;
        if (c16.i(this.a, ms7Var.a) && this.b == ms7Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MoveDragPayload(dragState=" + this.a + ", visualGap=" + this.b + ")";
    }
}
