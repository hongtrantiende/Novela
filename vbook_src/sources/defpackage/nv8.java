package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nv8  reason: default package */
/* loaded from: classes.dex */
public final class nv8 implements u08 {
    public final /* synthetic */ ov8 a;

    public nv8(ov8 ov8Var) {
        this.a = ov8Var;
    }

    @Override // defpackage.u08
    public final long i1(long j, long j2, int i) {
        ov8 ov8Var = this.a;
        if (!((Boolean) ov8Var.b.invoke()).booleanValue()) {
            return 0L;
        }
        cgc cgcVar = ov8Var.a;
        float h = cgcVar.b.h();
        cgcVar.b.i(Float.intBitsToFloat((int) (j & 4294967295L)) + h);
        return 0L;
    }

    @Override // defpackage.u08
    public final Object l1(long j, long j2, m42 m42Var) {
        if (z4d.c(j2) > nae.e) {
            this.a.a.b.i(nae.e);
        }
        return super.l1(j, j2, m42Var);
    }
}
