package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hv4  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv4 implements rw4 {
    public static final hv4 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [hv4, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("io.ktor.util.date.GMTDate", obj, 9);
        n09Var.k("seconds", false);
        n09Var.k("minutes", false);
        n09Var.k("hours", false);
        n09Var.k("dayOfWeek", false);
        n09Var.k("dayOfMonth", false);
        n09Var.k("dayOfYear", false);
        n09Var.k("month", false);
        n09Var.k("year", false);
        n09Var.k("timestamp", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        jv4 jv4Var = (jv4) obj;
        jv4Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        ye6[] ye6VarArr = jv4.F;
        k.z(0, jv4Var.a, o9aVar);
        k.z(1, jv4Var.b, o9aVar);
        k.z(2, jv4Var.c, o9aVar);
        k.F(o9aVar, 3, (s76) ye6VarArr[3].getValue(), jv4Var.d);
        k.z(4, jv4Var.e, o9aVar);
        k.z(5, jv4Var.f, o9aVar);
        k.F(o9aVar, 6, (s76) ye6VarArr[6].getValue(), jv4Var.C);
        k.z(7, jv4Var.D, o9aVar);
        k.B(o9aVar, 8, jv4Var.E);
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr = jv4.F;
        Object obj = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        fid fidVar = null;
        long j = 0;
        boolean z = true;
        ar7 ar7Var = null;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = t.r(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = t.r(o9aVar, 1);
                    i |= 2;
                    break;
                case 2:
                    i4 = t.r(o9aVar, 2);
                    i |= 4;
                    break;
                case 3:
                    fidVar = (fid) t.q(o9aVar, 3, (s76) ye6VarArr[3].getValue(), fidVar);
                    i |= 8;
                    break;
                case 4:
                    i5 = t.r(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    i6 = t.r(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    ar7Var = (ar7) t.q(o9aVar, 6, (s76) ye6VarArr[6].getValue(), ar7Var);
                    i |= 64;
                    break;
                case 7:
                    i7 = t.r(o9aVar, 7);
                    i |= Token.CASE;
                    continue;
                case 8:
                    j = t.D(o9aVar, 8);
                    i |= 256;
                    continue;
                default:
                    fb4.a(f);
                    return obj;
            }
            obj = null;
        }
        t.n(o9aVar);
        return new jv4(i, i2, i3, i4, fidVar, i5, i6, ar7Var, i7, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw4
    public final s76[] d() {
        ye6[] ye6VarArr = jv4.F;
        xy5 xy5Var = xy5.a;
        return new s76[]{xy5Var, xy5Var, xy5Var, ye6VarArr[3].getValue(), xy5Var, xy5Var, ye6VarArr[6].getValue(), xy5Var, ky6.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
