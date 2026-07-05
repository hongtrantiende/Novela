package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: srd  reason: default package */
/* loaded from: classes.dex */
public final class srd extends aab implements lu4 {
    public final /* synthetic */ yrd a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srd(yrd yrdVar, float f, long j, long j2, float f2, m42 m42Var) {
        super(2, m42Var);
        this.a = yrdVar;
        this.b = f;
        this.c = j;
        this.d = j2;
        this.e = f2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new srd(this.a, this.b, this.c, this.d, this.e, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        pvc pvcVar = pvc.a;
        ((srd) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        final yrd yrdVar = this.a;
        long j = yrdVar.d;
        az5 az5Var = new az5(j);
        az5 az5Var2 = null;
        if (!eh.r(j)) {
            az5Var = null;
        }
        pvc pvcVar = pvc.a;
        if (az5Var != null) {
            long j2 = yrdVar.e;
            az5 az5Var3 = new az5(j2);
            if (eh.r(j2)) {
                az5Var2 = az5Var3;
            }
            if (az5Var2 != null) {
                final float b = (lz9.b(yrdVar.s.a) * this.b) / lz9.b(yrdVar.q.a);
                final float d = yrdVar.d(b, yrdVar.m);
                final akc akcVar = yrdVar.r;
                final float b2 = lz9.b(akcVar.a);
                final long j3 = akcVar.b;
                final long i = vye.i(b2, j3, d, this.c, this.d);
                final long c = yrdVar.c(d, i);
                final akc a = akc.a(akcVar, mz9.a(d, d), c, 0L, 28);
                qw6 qw6Var = yrdVar.a;
                final long j4 = this.c;
                final float f = this.b;
                final long j5 = this.d;
                final float f2 = this.e;
                vt4 vt4Var = new vt4() { // from class: rrd
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        float f3 = b;
                        float f4 = b2;
                        float f5 = d;
                        long j6 = i;
                        long j7 = j3;
                        long d2 = z78.d(j6, j7);
                        long j8 = c;
                        long d3 = z78.d(j8, j7);
                        StringBuilder sb = new StringBuilder("ZoomableState. gestureTransform. centroid=");
                        yrdVar.getClass();
                        sb.append(mue.t(j4));
                        sb.append(", zoomChange=");
                        sb.append(yz1.k(4, f));
                        sb.append(", userScale=");
                        sb.append(yz1.k(4, f4));
                        sb.append(" -> ");
                        sb.append(yz1.k(4, f3));
                        sb.append('(');
                        sb.append(yz1.k(4, f3 - f4));
                        sb.append(") -> ");
                        sb.append(yz1.k(4, f5));
                        sb.append('(');
                        sb.append(yz1.k(4, f5 - f4));
                        sb.append("), panChange=");
                        sb.append(mue.t(j5));
                        sb.append(", userOffset=");
                        sb.append(mue.t(j7));
                        sb.append(" -> ");
                        sb.append(mue.t(j6));
                        sb.append('(');
                        sb.append(mue.t(d2));
                        sb.append(") -> ");
                        sb.append(mue.t(j8));
                        sb.append('(');
                        sb.append(mue.t(d3));
                        sb.append("), rotationChange=");
                        sb.append(yz1.k(4, f2));
                        sb.append(". userTransform=");
                        sb.append(v9e.P(akcVar));
                        sb.append(" -> ");
                        sb.append(v9e.P(a));
                        return sb.toString();
                    }
                };
                qw6Var.getClass();
                qw6Var.b(mw6.b, vt4Var);
                yrdVar.j(a);
            }
        }
        return pvcVar;
    }
}
