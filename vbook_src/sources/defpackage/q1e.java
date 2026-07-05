package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q1e  reason: default package */
/* loaded from: classes.dex */
public final class q1e {
    public final yx9 a;

    public q1e(i3e i3eVar, i3e i3eVar2, Object obj) {
        this.a = new yx9(22, i3eVar, i3eVar2, obj);
    }

    public static void a(g0e g0eVar, yx9 yx9Var, Object obj, Object obj2) {
        j0e.b(g0eVar, (i3e) yx9Var.b, 1, obj);
        j0e.b(g0eVar, (i3e) yx9Var.c, 2, obj2);
    }

    public static int b(yx9 yx9Var, Object obj, Object obj2) {
        int b;
        int b2;
        int a;
        int b3;
        int a2;
        i3e i3eVar = (i3e) yx9Var.b;
        i3e i3eVar2 = (i3e) yx9Var.c;
        int i = j0e.c;
        int i2 = 8;
        int a3 = g0e.a(8);
        i3e i3eVar3 = i3e.d;
        if (i3eVar == i3eVar3) {
            a3 += a3;
        }
        j3e j3eVar = j3e.a;
        switch (i3eVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                b = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                b = 4;
                break;
            case 2:
                b = g0e.b(((Long) obj).longValue());
                break;
            case 3:
                b = g0e.b(((Long) obj).longValue());
                break;
            case 4:
                b = g0e.b(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                b = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                b = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                b = 1;
                break;
            case 8:
                if (obj instanceof szd) {
                    b2 = ((szd) obj).b();
                    a = g0e.a(b2);
                } else {
                    b2 = h3e.b((String) obj);
                    a = g0e.a(b2);
                }
                b = b2 + a;
                break;
            case 9:
                b = ((o0e) ((hzd) obj)).m();
                break;
            case 10:
                b2 = ((o0e) ((hzd) obj)).m();
                a = g0e.a(b2);
                b = b2 + a;
                break;
            case 11:
                if (obj instanceof szd) {
                    b2 = ((szd) obj).b();
                    a = g0e.a(b2);
                } else {
                    b2 = ((byte[]) obj).length;
                    a = g0e.a(b2);
                }
                b = b2 + a;
                break;
            case 12:
                b = g0e.a(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof s0e) {
                    b = g0e.b(((s0e) obj).zza());
                    break;
                } else {
                    b = g0e.b(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).getClass();
                b = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                b = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                b = g0e.a((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                b = g0e.b((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                cy7.e("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        int i3 = b + a3;
        int a4 = g0e.a(16);
        if (i3eVar2 == i3eVar3) {
            a4 += a4;
        }
        switch (i3eVar2.ordinal()) {
            case 0:
                ((Double) obj2).getClass();
                break;
            case 1:
                ((Float) obj2).getClass();
                i2 = 4;
                break;
            case 2:
                i2 = g0e.b(((Long) obj2).longValue());
                break;
            case 3:
                i2 = g0e.b(((Long) obj2).longValue());
                break;
            case 4:
                i2 = g0e.b(((Integer) obj2).intValue());
                break;
            case 5:
                ((Long) obj2).getClass();
                break;
            case 6:
                ((Integer) obj2).getClass();
                i2 = 4;
                break;
            case 7:
                ((Boolean) obj2).getClass();
                i2 = 1;
                break;
            case 8:
                if (obj2 instanceof szd) {
                    b3 = ((szd) obj2).b();
                    a2 = g0e.a(b3);
                } else {
                    b3 = h3e.b((String) obj2);
                    a2 = g0e.a(b3);
                }
                i2 = a2 + b3;
                break;
            case 9:
                i2 = ((o0e) ((hzd) obj2)).m();
                break;
            case 10:
                b3 = ((o0e) ((hzd) obj2)).m();
                a2 = g0e.a(b3);
                i2 = a2 + b3;
                break;
            case 11:
                if (obj2 instanceof szd) {
                    b3 = ((szd) obj2).b();
                    a2 = g0e.a(b3);
                } else {
                    b3 = ((byte[]) obj2).length;
                    a2 = g0e.a(b3);
                }
                i2 = a2 + b3;
                break;
            case 12:
                i2 = g0e.a(((Integer) obj2).intValue());
                break;
            case 13:
                if (obj2 instanceof s0e) {
                    i2 = g0e.b(((s0e) obj2).zza());
                    break;
                } else {
                    i2 = g0e.b(((Integer) obj2).intValue());
                    break;
                }
            case 14:
                ((Integer) obj2).getClass();
                i2 = 4;
                break;
            case 15:
                ((Long) obj2).getClass();
                break;
            case 16:
                int intValue2 = ((Integer) obj2).intValue();
                i2 = g0e.a((intValue2 >> 31) ^ (intValue2 + intValue2));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                i2 = g0e.b((longValue2 >> 63) ^ (longValue2 + longValue2));
                break;
            default:
                cy7.e("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return i2 + a4 + i3;
    }

    public final yx9 c() {
        return this.a;
    }
}
