package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: akf  reason: default package */
/* loaded from: classes.dex */
public final class akf extends tyd {
    public static final yjf N = new yjf();
    public static final Object O = new Object();
    public Object[] J;
    public int K;
    public String[] L;
    public int[] M;

    @Override // defpackage.tyd
    public final String I0() {
        int l1 = l1();
        if (l1 != 6 && l1 != 7) {
            String concat = " at path ".concat(r1());
            int length = concat.length();
            String t = n4f.t(l1);
            vs.k(nk2.v(new StringBuilder(t.length() + 24 + length), "Expected STRING but was ", t, concat));
            return null;
        }
        String b = ((dff) t1()).b();
        int i = this.K;
        if (i > 0) {
            int[] iArr = this.M;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return b;
    }

    @Override // defpackage.tyd
    public final boolean N0() {
        boolean parseBoolean;
        s1(8);
        dff dffVar = (dff) t1();
        Serializable serializable = dffVar.a;
        if (serializable instanceof Boolean) {
            parseBoolean = ((Boolean) serializable).booleanValue();
        } else {
            parseBoolean = Boolean.parseBoolean(dffVar.b());
        }
        int i = this.K;
        if (i > 0) {
            int[] iArr = this.M;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseBoolean;
    }

    @Override // defpackage.tyd
    public final void V() {
        s1(1);
        q1(((qef) this.J[this.K - 1]).a.iterator());
        this.M[this.K - 1] = 0;
    }

    @Override // defpackage.tyd
    public final void V0() {
        s1(9);
        t1();
        int i = this.K;
        if (i > 0) {
            int[] iArr = this.M;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.tyd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.J = new Object[]{O};
        this.K = 1;
    }

    @Override // defpackage.tyd
    public final void g0() {
        s1(2);
        t1();
        t1();
        int i = this.K;
        if (i > 0) {
            int[] iArr = this.M;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.tyd
    public final void j0() {
        s1(3);
        q1(((yhf) ((zef) this.J[this.K - 1]).a.entrySet()).iterator());
    }

    @Override // defpackage.tyd
    public final String k1() {
        return r1();
    }

    @Override // defpackage.tyd
    public final int l1() {
        int i = this.K;
        if (i == 0) {
            return 10;
        }
        Object[] objArr = this.J;
        Object obj = objArr[i - 1];
        if (obj instanceof Iterator) {
            boolean z = objArr[i - 2] instanceof zef;
            Iterator it = (Iterator) obj;
            if (it.hasNext()) {
                if (z) {
                    return 5;
                }
                q1(it.next());
                return l1();
            } else if (z) {
                return 4;
            } else {
                return 2;
            }
        } else if (obj instanceof zef) {
            return 3;
        } else {
            if (obj instanceof qef) {
                return 1;
            }
            if (obj instanceof dff) {
                Serializable serializable = ((dff) obj).a;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                cp8.i();
                return 0;
            } else if (obj instanceof xef) {
                return 9;
            } else {
                if (obj == O) {
                    vs.k("JsonReader is closed");
                    return 0;
                }
                String name = obj.getClass().getName();
                throw new IOException(nk2.v(new StringBuilder(name.length() + 45), "Custom JsonElement subclass ", name, " is not supported"));
            }
        }
    }

    @Override // defpackage.tyd
    public final void m0() {
        s1(4);
        this.L[this.K - 1] = null;
        t1();
        t1();
        int i = this.K;
        if (i > 0) {
            int[] iArr = this.M;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.tyd
    public final boolean p0() {
        int l1 = l1();
        if (l1 != 4 && l1 != 2 && l1 != 10) {
            return true;
        }
        return false;
    }

    public final String p1(boolean z) {
        String str;
        s1(5);
        Map.Entry entry = (Map.Entry) ((Iterator) this.J[this.K - 1]).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.L;
        int i = this.K - 1;
        if (true != z) {
            str = str2;
        } else {
            str = "<skipped>";
        }
        strArr[i] = str;
        q1(entry.getValue());
        return str2;
    }

    public final void q1(Object obj) {
        int i = this.K;
        Object[] objArr = this.J;
        if (i == objArr.length) {
            int i2 = i + i;
            this.J = Arrays.copyOf(objArr, i2);
            this.M = Arrays.copyOf(this.M, i2);
            this.L = (String[]) Arrays.copyOf(this.L, i2);
        }
        Object[] objArr2 = this.J;
        int i3 = this.K;
        this.K = i3 + 1;
        objArr2[i3] = obj;
    }

    public final String r1() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.K;
            if (i < i2) {
                Object[] objArr = this.J;
                Object obj = objArr[i];
                if (obj instanceof qef) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.M[i];
                        sb.append('[');
                        sb.append(i3);
                        sb.append(']');
                    }
                } else if ((obj instanceof zef) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.L[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public final void s1(int i) {
        if (l1() == i) {
            return;
        }
        String t = n4f.t(l1());
        String concat = " at path ".concat(r1());
        String t2 = n4f.t(i);
        StringBuilder sb = new StringBuilder(s21.a(t2.length() + 18, concat.length(), t));
        nk2.C(sb, "Expected ", t2, " but was ", t);
        sb.append(concat);
        throw new IllegalStateException(sb.toString());
    }

    public final Object t1() {
        Object[] objArr = this.J;
        int i = this.K - 1;
        this.K = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // defpackage.tyd
    public final String toString() {
        return akf.class.getSimpleName().concat(" at path ".concat(r1()));
    }

    @Override // defpackage.tyd
    public final String y0() {
        return p1(false);
    }
}
