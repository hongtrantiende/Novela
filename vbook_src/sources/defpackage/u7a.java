package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u7a  reason: default package */
/* loaded from: classes.dex */
public final class u7a implements l8a, Iterable, j76 {
    public final tv7 a;
    public j17 b;
    public boolean c;
    public boolean d;

    public u7a() {
        long[] jArr = tz9.a;
        this.a = new tv7();
    }

    @Override // defpackage.l8a
    public final void a(k8a k8aVar, Object obj) {
        boolean z = obj instanceof g4;
        tv7 tv7Var = this.a;
        if (z && tv7Var.c(k8aVar)) {
            Object g = tv7Var.g(k8aVar);
            g.getClass();
            g4 g4Var = (g4) g;
            g4 g4Var2 = (g4) obj;
            String str = g4Var2.a;
            if (str == null) {
                str = g4Var.a;
            }
            hu4 hu4Var = g4Var2.b;
            if (hu4Var == null) {
                hu4Var = g4Var.b;
            }
            tv7Var.n(k8aVar, new g4(str, hu4Var));
        } else {
            tv7Var.n(k8aVar, obj);
        }
        k8aVar.getClass();
    }

    public final Object b(k8a k8aVar) {
        Object g = this.a.g(k8aVar);
        if (g != null) {
            return g;
        }
        fb4.g(k8aVar, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void c(u7a u7aVar) {
        tv7 tv7Var = u7aVar.a;
        Object[] objArr = tv7Var.b;
        Object[] objArr2 = tv7Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            k8a k8aVar = (k8a) obj;
                            tv7 tv7Var2 = this.a;
                            Object g = tv7Var2.g(k8aVar);
                            k8aVar.getClass();
                            Object invoke = k8aVar.b.invoke(g, obj2);
                            if (invoke != null) {
                                tv7Var2.n(k8aVar, invoke);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u7a) {
                u7a u7aVar = (u7a) obj;
                if (!c16.i(this.a, u7aVar.a) || this.c != u7aVar.c || this.d != u7aVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.k(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j17 j17Var = this.b;
        if (j17Var == null) {
            tv7 tv7Var = this.a;
            j17 j17Var2 = tv7Var.f;
            if (j17Var2 == null) {
                j17Var2 = new j17(tv7Var);
                tv7Var.f = j17Var2;
            }
            j17Var = j17Var2;
            this.b = j17Var;
        }
        return ((mu3) j17Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        tv7 tv7Var = this.a;
        Object[] objArr = tv7Var.b;
        Object[] objArr2 = tv7Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((k8a) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return z1d.J(this) + "{ " + ((Object) sb) + " }";
    }
}
