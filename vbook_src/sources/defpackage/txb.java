package defpackage;

import java.util.List;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: txb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class txb implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ txb(nsc nscVar) {
        this.a = 27;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        nsc nscVar;
        String valueOf;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return hl5.h(4, (Integer) obj);
            case 1:
                return hl5.h(4, (Integer) obj);
            case 2:
                ((String) obj).getClass();
                return "\n";
            case 3:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 4:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 5:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 6:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 7:
                return ((ymc) obj).a;
            case 8:
                return ((ymc) obj).a;
            case 9:
                t7c t7cVar = (t7c) obj;
                t7cVar.getClass();
                vy5 vy5Var = t7cVar.b;
                StringBuilder sb = new StringBuilder("(");
                sb.append(vy5Var.a);
                sb.append('x');
                sb.append(vy5Var.b);
                sb.append(',');
                sb.append(vy5Var.c);
                sb.append('x');
                return hl5.p(sb, vy5Var.d, ')');
            case 10:
                ((fvb) obj).getClass();
                return pvcVar;
            case 11:
                return Boolean.valueOf(d4b.g(((Character) obj).charValue()));
            case 12:
                List list = (List) obj;
                return new cgc(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
            case 13:
                ((String) obj).getClass();
                return pvcVar;
            case 14:
                xq xqVar = (xq) obj;
                xqVar.getClass();
                return xqVar.a(new z22(zt3.g(tte.v(nae.e, nae.e, 7, null), 2), zt3.i(tte.v(nae.e, nae.e, 7, null), 2)), new xna(false));
            case 15:
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6.y(ri6Var, null, zbe.a, 3);
                ri6.y(ri6Var, null, zbe.b, 3);
                ri6.A(ri6Var, 3, null, zbe.c, 6);
                return pvcVar;
            case 16:
                xl0 xl0Var = (xl0) obj;
                xl0Var.getClass();
                return s21.m("t_", xl0Var.a);
            case 17:
                iw9 iw9Var = (iw9) obj;
                iw9Var.getClass();
                return Boolean.valueOf(iw9Var.Z0());
            case 18:
                y4a y4aVar = (y4a) obj;
                long j = y4aVar.f;
                sra sraVar = y4aVar.D;
                if (sraVar != null) {
                    sraVar.d(y4aVar, bze.e, y4aVar.C);
                }
                long j2 = y4aVar.f;
                if (j != j2) {
                    r4a r4aVar = y4aVar.K;
                    if (r4aVar != null) {
                        if (r4aVar.a > j2) {
                            y4aVar.d0();
                        } else {
                            r4aVar.g = j2;
                            if (r4aVar.b == null) {
                                r4aVar.h = k27.B((1.0d - r4aVar.e.a(0)) * y4aVar.f);
                            }
                        }
                    } else if (j2 != 0) {
                        y4aVar.g0();
                    }
                }
                return pvcVar;
            case 19:
                return Integer.valueOf((-((Integer) obj).intValue()) / 5);
            case 20:
                return Integer.valueOf((-((Integer) obj).intValue()) / 5);
            case 21:
                return hl5.h(4, (Integer) obj);
            case 22:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 23:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 24:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 25:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 26:
                iw9 iw9Var2 = (iw9) obj;
                iw9Var2.getClass();
                xba xbaVar = new xba();
                while (iw9Var2.Z0()) {
                    xbaVar.add(Integer.valueOf((int) iw9Var2.getLong(0)));
                }
                return fca.d(xbaVar);
            case 27:
                w76 w76Var = (w76) obj;
                w76Var.getClass();
                y76 y76Var = w76Var.a;
                if (y76Var == null) {
                    return "*";
                }
                t76 t76Var = w76Var.b;
                if (t76Var instanceof nsc) {
                    nscVar = (nsc) t76Var;
                } else {
                    nscVar = null;
                }
                if (nscVar != null) {
                    valueOf = nscVar.c(true);
                } else {
                    valueOf = String.valueOf(t76Var);
                }
                int ordinal = y76Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return "out ".concat(valueOf);
                        }
                        xk5.o();
                        return null;
                    }
                    return "in ".concat(valueOf);
                }
                return valueOf;
            case 28:
                yk8 yk8Var = (yk8) obj;
                yk8Var.getClass();
                String str = (String) yk8Var.a;
                Object obj2 = yk8Var.b;
                if (obj2 != null) {
                    return str + '=' + String.valueOf(obj2);
                }
                return str;
            default:
                String str2 = (String) obj;
                str2.getClass();
                String quote = Pattern.quote(str2);
                quote.getClass();
                return quote;
        }
    }

    public /* synthetic */ txb(int i) {
        this.a = i;
    }
}
