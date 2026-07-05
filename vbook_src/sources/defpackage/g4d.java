package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g4d  reason: default package */
/* loaded from: classes.dex */
public final class g4d extends t3d {
    public final q25 b;
    public String c;
    public boolean d;
    public final xj3 e;
    public vt4 f;
    public final hm8 g;
    public wl0 h;
    public final hm8 i;
    public long j;
    public float k;
    public float l;
    public final f4d m;

    public g4d(q25 q25Var) {
        this.b = q25Var;
        q25Var.i = new f4d(this, 0);
        this.c = "";
        this.d = true;
        this.e = new xj3();
        this.f = zx1.Z;
        this.g = yae.z(null);
        this.i = yae.z(new dna(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new f4d(this, 1);
    }

    @Override // defpackage.t3d
    public final void a(ak3 ak3Var) {
        e(ak3Var, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r3 != r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
        if (r9.d == r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.ak3 r37, float r38, defpackage.em1 r39) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4d.e(ak3, float, em1):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        hm8 hm8Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((dna) hm8Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((dna) hm8Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
