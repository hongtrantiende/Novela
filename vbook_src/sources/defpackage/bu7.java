package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bu7  reason: default package */
/* loaded from: classes.dex */
public final class bu7 {
    public final tv7 a;

    public /* synthetic */ bu7(tv7 tv7Var) {
        this.a = tv7Var;
    }

    public static final void a(tv7 tv7Var, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int f = tv7Var.f(obj);
        if (f < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = tv7Var.c[f];
        }
        if (obj3 != null) {
            if (obj3 instanceof kv7) {
                kv7 kv7Var = (kv7) obj3;
                kv7Var.a(obj2);
                obj2 = kv7Var;
            } else {
                Object[] objArr = i78.a;
                kv7 kv7Var2 = new kv7(2);
                kv7Var2.a(obj3);
                kv7Var2.a(obj2);
                obj2 = kv7Var2;
            }
        }
        if (z) {
            int i = ~f;
            tv7Var.b[i] = obj;
            tv7Var.c[i] = obj2;
            return;
        }
        tv7Var.c[f] = obj2;
    }

    public static final Object b(tv7 tv7Var, js7 js7Var) {
        Object g = tv7Var.g(js7Var);
        if (g == null) {
            return null;
        }
        if (g instanceof kv7) {
            kv7 kv7Var = (kv7) g;
            if (!kv7Var.h()) {
                int i = kv7Var.b - 1;
                Object f = kv7Var.f(i);
                kv7Var.k(i);
                f.getClass();
                if (kv7Var.h()) {
                    tv7Var.l(js7Var);
                }
                if (kv7Var.b == 1) {
                    tv7Var.n(js7Var, kv7Var.e());
                }
                return f;
            }
            p1a.l("List is empty.");
            return null;
        }
        tv7Var.l(js7Var);
        return g;
    }

    public static final void c(tv7 tv7Var, js7 js7Var, xt4 xt4Var) {
        Object g = tv7Var.g(js7Var);
        if (g != null) {
            if (g instanceof kv7) {
                kv7 kv7Var = (kv7) g;
                int i = kv7Var.b;
                Object[] objArr = kv7Var.a;
                int i2 = 0;
                ty5 F = dce.F(0, i);
                int i3 = F.a;
                int i4 = F.b;
                if (i3 <= i4) {
                    while (true) {
                        objArr[i3 - i2] = objArr[i3];
                        if (((Boolean) xt4Var.invoke(objArr[i3])).booleanValue()) {
                            i2++;
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3++;
                    }
                }
                b00.g0(i - i2, i, null, objArr);
                kv7Var.b -= i2;
                if (kv7Var.h()) {
                    tv7Var.l(js7Var);
                }
                if (kv7Var.b == 1) {
                    tv7Var.n(js7Var, kv7Var.e());
                }
            } else if (((Boolean) xt4Var.invoke(g)).booleanValue()) {
                tv7Var.l(js7Var);
            }
        }
    }

    public static final kv7 d(tv7 tv7Var) {
        if (tv7Var.i()) {
            kv7 kv7Var = i78.b;
            kv7Var.getClass();
            return kv7Var;
        }
        kv7 kv7Var2 = new kv7();
        Object[] objArr = tv7Var.c;
        long[] jArr = tv7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof kv7) {
                                kv7Var2.b((kv7) obj);
                            } else {
                                obj.getClass();
                                kv7Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return kv7Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bu7) {
            if (!this.a.equals(((bu7) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
