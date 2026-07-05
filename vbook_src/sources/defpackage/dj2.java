package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = gj2.class)
/* renamed from: dj2  reason: default package */
/* loaded from: classes3.dex */
public abstract class dj2 {
    public static final cj2 Companion = new Object();

    public abstract int a();

    public int b() {
        return (int) (g() / 3600000000000L);
    }

    public int c() {
        return (int) ((g() % 3600000000000L) / 60000000000L);
    }

    public int d() {
        return (int) (g() % 1000000000);
    }

    public int e() {
        return (int) ((g() % 60000000000L) / 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dj2) {
                dj2 dj2Var = (dj2) obj;
                if (f() != dj2Var.f() || a() != dj2Var.a() || g() != dj2Var.g()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public abstract long f();

    public abstract long g();

    public final int hashCode() {
        int a = a();
        return Long.hashCode(g()) + ((a + (Long.hashCode(f()) * 31)) * 31);
    }

    public final String toString() {
        int i;
        Object obj;
        StringBuilder sb = new StringBuilder();
        if (f() <= 0 && a() <= 0 && g() <= 0 && ((f() | g()) != 0 || a() != 0)) {
            sb.append('-');
            i = -1;
        } else {
            i = 1;
        }
        sb.append('P');
        if (((int) (f() / 12)) != 0) {
            sb.append(((int) (f() / 12)) * i);
            sb.append('Y');
        }
        if (((int) (f() % 12)) != 0) {
            sb.append(((int) (f() % 12)) * i);
            sb.append('M');
        }
        if (a() != 0) {
            sb.append(a() * i);
            sb.append('D');
        }
        String str = "";
        String str2 = "T";
        if (b() != 0) {
            sb.append("T");
            sb.append(b() * i);
            sb.append('H');
            str2 = "";
        }
        if (c() != 0) {
            sb.append(str2);
            sb.append(c() * i);
            sb.append('M');
        } else {
            str = str2;
        }
        if ((e() | d()) != 0) {
            sb.append(str);
            if (e() != 0) {
                obj = Integer.valueOf(e() * i);
            } else if (d() * i < 0) {
                obj = "-0";
            } else {
                obj = "0";
            }
            sb.append(obj);
            if (d() != 0) {
                sb.append('.');
                sb.append(k4b.r0(9, String.valueOf(Math.abs(d()))));
            }
            sb.append('S');
        }
        if (sb.length() == 1) {
            sb.append("0D");
        }
        return sb.toString();
    }
}
