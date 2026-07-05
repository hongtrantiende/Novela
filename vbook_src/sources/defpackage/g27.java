package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g27  reason: default package */
/* loaded from: classes.dex */
public final class g27 implements wea {
    public final yj a;
    public yj b;
    public long c;

    public g27(xu9 xu9Var) {
        yj a = dk.a();
        jq6 jq6Var = xu9Var.c;
        long j = xu9Var.b;
        yz1.r(a, jq6Var, nc2.i(j), nc2.j(j));
        this.a = a;
        this.c = 9205357640488583168L;
    }

    @Override // defpackage.wea
    public final kwe a(long j, tc6 tc6Var, r13 r13Var) {
        yj yjVar;
        if (dna.a(j, this.c) && (yjVar = this.b) != null) {
            yjVar.m();
        } else {
            this.c = j;
            this.b = dk.a();
        }
        yj yjVar2 = this.b;
        yjVar2.getClass();
        yj.b(yjVar2, this.a);
        float[] a = l27.a();
        l27.h(a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        yjVar2.o(a);
        yjVar2.p(y78.i(sxd.j(j), yjVar2.g().f()));
        return new sf8(yjVar2);
    }
}
