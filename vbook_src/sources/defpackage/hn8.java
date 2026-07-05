package defpackage;

import java.io.File;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hn8  reason: default package */
/* loaded from: classes3.dex */
public final class hn8 implements Comparable {
    public static final String b;
    public final e31 a;

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public hn8(e31 e31Var) {
        e31Var.getClass();
        this.a = e31Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [my0, java.lang.Object] */
    public static hn8 f(hn8 hn8Var, String str) {
        hn8Var.getClass();
        str.getClass();
        ?? obj = new Object();
        obj.q1(str);
        return e.b(hn8Var, e.d(obj, false), false);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = e.a(this);
        e31 e31Var = this.a;
        if (a == -1) {
            a = 0;
        } else if (a < e31Var.e() && e31Var.j(a) == 92) {
            a++;
        }
        int e = e31Var.e();
        int i = a;
        while (a < e) {
            if (e31Var.j(a) == 47 || e31Var.j(a) == 92) {
                arrayList.add(e31Var.p(i, a));
                i = a + 1;
            }
            a++;
        }
        if (i < e31Var.e()) {
            arrayList.add(e31Var.p(i, e31Var.e()));
        }
        return arrayList;
    }

    public final String b() {
        e31 e31Var = e.a;
        e31 e31Var2 = this.a;
        int l = e31.l(e31Var2, e31Var);
        if (l == -1) {
            l = e31.l(e31Var2, e.b);
        }
        if (l != -1) {
            e31Var2 = e31.q(e31Var2, l + 1, 0, 2);
        } else if (g() != null && e31Var2.e() == 2) {
            e31Var2 = e31.d;
        }
        return e31Var2.t();
    }

    public final hn8 c() {
        e31 e31Var = e.d;
        e31 e31Var2 = this.a;
        if (!c16.i(e31Var2, e31Var)) {
            e31 e31Var3 = e.a;
            if (!c16.i(e31Var2, e31Var3)) {
                e31 e31Var4 = e.b;
                if (!c16.i(e31Var2, e31Var4)) {
                    e31 e31Var5 = e.e;
                    e31Var2.getClass();
                    e31Var5.getClass();
                    int e = e31Var2.e();
                    byte[] bArr = e31Var5.a;
                    if (!e31Var2.m(e - bArr.length, e31Var5, bArr.length) || (e31Var2.e() != 2 && !e31Var2.m(e31Var2.e() - 3, e31Var3, 1) && !e31Var2.m(e31Var2.e() - 3, e31Var4, 1))) {
                        int l = e31.l(e31Var2, e31Var3);
                        if (l == -1) {
                            l = e31.l(e31Var2, e31Var4);
                        }
                        if (l == 2 && g() != null) {
                            if (e31Var2.e() != 3) {
                                return new hn8(e31.q(e31Var2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (l == 1) {
                            e31Var4.getClass();
                            if (e31Var2.m(0, e31Var4, e31Var4.e())) {
                                return null;
                            }
                        }
                        if (l == -1 && g() != null) {
                            if (e31Var2.e() != 2) {
                                return new hn8(e31.q(e31Var2, 0, 2, 1));
                            }
                            return null;
                        } else if (l == -1) {
                            return new hn8(e31Var);
                        } else {
                            if (l == 0) {
                                return new hn8(e31.q(e31Var2, 0, 1, 1));
                            }
                            return new hn8(e31.q(e31Var2, 0, l, 1));
                        }
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        hn8 hn8Var = (hn8) obj;
        hn8Var.getClass();
        return this.a.compareTo(hn8Var.a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [my0, java.lang.Object] */
    public final hn8 d(hn8 hn8Var) {
        hn8 hn8Var2;
        hn8 hn8Var3;
        hn8Var.getClass();
        e31 e31Var = hn8Var.a;
        int a = e.a(this);
        e31 e31Var2 = this.a;
        if (a == -1) {
            hn8Var2 = null;
        } else {
            hn8Var2 = new hn8(e31Var2.p(0, a));
        }
        int a2 = e.a(hn8Var);
        if (a2 == -1) {
            hn8Var3 = null;
        } else {
            hn8Var3 = new hn8(e31Var.p(0, a2));
        }
        if (c16.i(hn8Var2, hn8Var3)) {
            ArrayList a3 = a();
            ArrayList a4 = hn8Var.a();
            int min = Math.min(a3.size(), a4.size());
            int i = 0;
            while (i < min && c16.i(a3.get(i), a4.get(i))) {
                i++;
            }
            if (i == min && e31Var2.e() == e31Var.e()) {
                return fn8.d(".", false);
            }
            if (a4.subList(i, a4.size()).indexOf(e.e) == -1) {
                if (c16.i(e31Var, e.d)) {
                    return this;
                }
                ?? obj = new Object();
                e31 c = e.c(hn8Var);
                if (c == null && (c = e.c(this)) == null) {
                    c = e.f(b);
                }
                int size = a4.size();
                for (int i2 = i; i2 < size; i2++) {
                    obj.g1(e.e);
                    obj.g1(c);
                }
                int size2 = a3.size();
                while (i < size2) {
                    obj.g1((e31) a3.get(i));
                    obj.g1(c);
                    i++;
                }
                return e.d(obj, false);
            }
            cy7.g("Impossible relative path to resolve: ", this, " and ", hn8Var);
            return null;
        }
        cy7.g("Paths of different roots cannot be relative to each other: ", this, " and ", hn8Var);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [my0, java.lang.Object] */
    public final hn8 e(String str) {
        str.getClass();
        ?? obj = new Object();
        obj.q1(str);
        return e.b(this, e.d(obj, false), false);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof hn8) && c16.i(((hn8) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    public final Character g() {
        e31 e31Var = e.a;
        e31 e31Var2 = this.a;
        if (e31.h(e31Var2, e31Var) == -1 && e31Var2.e() >= 2 && e31Var2.j(1) == 58) {
            char j = (char) e31Var2.j(0);
            if (('a' <= j && j < '{') || ('A' <= j && j < '[')) {
                return Character.valueOf(j);
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.t());
    }

    public final String toString() {
        return this.a.t();
    }
}
