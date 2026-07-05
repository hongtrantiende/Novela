package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mab  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mab implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mab(Object obj, long j, long j2, int i) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float intBitsToFloat;
        boolean z;
        final boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        long j = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                ak3.R0(ak3Var, sve.q(((ef2) obj2).c(), j, this.c), 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 1:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                for (njc njcVar : (List) obj2) {
                    long j2 = njcVar.a * 1000;
                    long j3 = njcVar.b * 1000;
                    if (j3 > 0 && j3 > j2) {
                        float f = (float) j2;
                        float f2 = (float) j;
                        float m = dce.m(f / f2, nae.e, 1.0f);
                        float m2 = dce.m(((float) j3) / f2, nae.e, 1.0f);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * m;
                        if (Float.intBitsToFloat((int) (ak3Var2.b() >> 32)) * (m2 - m) > nae.e) {
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L));
                            ak3.R0(ak3Var2, this.c, (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), nae.e, null, 0, 120);
                        }
                    }
                }
                return pvcVar;
            default:
                final yrd yrdVar = (yrd) obj2;
                akc akcVar = yrdVar.r;
                long c = yrdVar.c(lz9.b(akcVar.a), ((z78) obj).a);
                if (c == akcVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = !z;
                if (!z) {
                    final akc a = akc.a(yrdVar.r, 0L, c, 0L, 29);
                    qw6 qw6Var = yrdVar.a;
                    final long j4 = this.b;
                    final long j5 = this.c;
                    z2 = z3;
                    vt4 vt4Var = new vt4() { // from class: qrd
                        @Override // defpackage.vt4
                        public final Object invoke() {
                            StringBuilder sb = new StringBuilder("ZoomableState. fling. running. velocity=");
                            yrd.this.getClass();
                            sb.append((Object) z78.g(j4));
                            sb.append(". startUserOffset=");
                            sb.append(mue.t(j5));
                            sb.append(", currentUserOffset=");
                            sb.append(v9e.P(a));
                            sb.append(", continue1=");
                            sb.append(z2);
                            return sb.toString();
                        }
                    };
                    qw6Var.getClass();
                    qw6Var.b(mw6.a, vt4Var);
                    yrdVar.j(a);
                } else {
                    z2 = z3;
                }
                return Boolean.valueOf(z2);
        }
    }
}
