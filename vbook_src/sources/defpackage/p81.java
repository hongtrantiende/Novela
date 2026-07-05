package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p81  reason: default package */
/* loaded from: classes3.dex */
public final class p81 implements Map, n76 {
    public static final String[] E = new String[0];
    public static final Object[] F = new Object[0];
    public static final int[] G = new int[0];
    public m81 C;
    public o81 D;
    public int c;
    public int e;
    public m81 f;
    public String[] a = E;
    public Object[] b = F;
    public int[] d = G;

    public final int a(String str) {
        if (this.c != 0) {
            int e = ox9.e(str);
            int length = this.a.length;
            while (true) {
                int i = e & (length - 1);
                String str2 = this.a[i];
                if (str2 == null) {
                    return -1;
                }
                if (str2.equalsIgnoreCase(str)) {
                    return i;
                }
                e = i + 1;
                length = this.a.length;
            }
        } else {
            return -1;
        }
    }

    @Override // java.util.Map
    /* renamed from: b */
    public final Object put(Object obj, String str) {
        int i;
        int[] iArr;
        String str2;
        str.getClass();
        obj.getClass();
        int i2 = 0;
        if (this.a == E) {
            this.a = new String[8];
            this.b = new Object[8];
            int[] iArr2 = new int[8];
            for (int i3 = 0; i3 < 8; i3++) {
                iArr2[i3] = -1;
            }
            this.d = iArr2;
        }
        int e = ox9.e(str);
        int length = (this.a.length - 1) & e;
        while (true) {
            String[] strArr = this.a;
            String str3 = strArr[length];
            if (str3 == null) {
                if (this.c * 4 >= strArr.length * 3) {
                    int length2 = strArr.length * 2;
                    Object[] objArr = this.b;
                    int[] iArr3 = this.d;
                    int i4 = this.e;
                    this.a = new String[length2];
                    this.b = new Object[length2];
                    int[] iArr4 = new int[length2];
                    for (int i5 = 0; i5 < length2; i5++) {
                        iArr4[i5] = -1;
                    }
                    this.d = iArr4;
                    this.c = 0;
                    this.e = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        int i7 = iArr3[i6];
                        if (i7 >= 0 && (str2 = strArr[i7]) != null) {
                            Object obj2 = objArr[i7];
                            obj2.getClass();
                            put(obj2, str2);
                        }
                    }
                }
                int length3 = this.a.length;
                while (true) {
                    i = e & (length3 - 1);
                    String[] strArr2 = this.a;
                    if (strArr2[i] == null) {
                        break;
                    }
                    e = i + 1;
                    length3 = strArr2.length;
                }
                int i8 = this.e;
                if (i8 == this.d.length && i8 != 0) {
                    int i9 = 0;
                    while (true) {
                        iArr = this.d;
                        if (i2 >= i8) {
                            break;
                        }
                        int i10 = iArr[i2];
                        if (i10 >= 0 && this.a[i10] != null) {
                            iArr[i9] = i10;
                            i9++;
                        }
                        i2++;
                    }
                    int length4 = iArr.length;
                    for (int i11 = i9; i11 < length4; i11++) {
                        this.d[i11] = -1;
                    }
                    this.e = i9;
                }
                this.a[i] = str;
                this.b[i] = obj;
                int[] iArr5 = this.d;
                int i12 = this.e;
                this.e = i12 + 1;
                iArr5[i12] = i;
                this.c++;
                return null;
            } else if (str3.equalsIgnoreCase(str)) {
                Object[] objArr2 = this.b;
                Object obj3 = objArr2[length];
                objArr2[length] = obj;
                return obj3;
            } else {
                length = (length + 1) & (this.a.length - 1);
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.c > 0) {
            String[] strArr = this.a;
            b00.g0(0, strArr.length, null, strArr);
            Object[] objArr = this.b;
            b00.g0(0, objArr.length, null, objArr);
            b00.h0(-1, 0, 6, this.d);
            this.c = 0;
            this.e = 0;
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String) || a((String) obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj != null && this.c != 0) {
            int length = this.b.length;
            for (int i = 0; i < length; i++) {
                if (this.a[i] != null && c16.i(this.b[i], obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        m81 m81Var = this.C;
        if (m81Var != null) {
            return m81Var;
        }
        m81 m81Var2 = new m81(this, 0);
        this.C = m81Var2;
        return m81Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p81) {
                p81 p81Var = (p81) obj;
                if (p81Var.c == this.c) {
                    int length = this.a.length;
                    for (int i = 0; i < length; i++) {
                        String str = this.a[i];
                        if (str != null) {
                            if (!c16.i(p81Var.get(str), this.b[i])) {
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int a;
        if ((obj instanceof String) && (a = a((String) obj)) >= 0) {
            return this.b[a];
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = this.a[i3];
            if (str != null) {
                int e = ox9.e(str);
                Object obj = this.b[i3];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 += e ^ i;
            }
        }
        return i2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        m81 m81Var = this.f;
        if (m81Var != null) {
            return m81Var;
        }
        m81 m81Var2 = new m81(this, 1);
        this.f = m81Var2;
        return m81Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int a;
        int i;
        if (!(obj instanceof String) || (a = a((String) obj)) < 0) {
            return null;
        }
        Object obj2 = this.b[a];
        int i2 = this.e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.d;
            if (iArr[i3] == a) {
                iArr[i3] = -1;
                break;
            }
            i3++;
        }
        String[] strArr = this.a;
        strArr[a] = null;
        this.b[a] = null;
        this.c--;
        int i4 = a + 1;
        int length = strArr.length;
        while (true) {
            int i5 = i4 & (length - 1);
            String[] strArr2 = this.a;
            String str = strArr2[i5];
            if (str != null) {
                Object[] objArr = this.b;
                Object obj3 = objArr[i5];
                strArr2[i5] = null;
                objArr[i5] = null;
                this.c--;
                obj3.getClass();
                int e = ox9.e(str);
                int length2 = this.a.length;
                while (true) {
                    i = e & (length2 - 1);
                    String[] strArr3 = this.a;
                    String str2 = strArr3[i];
                    if (str2 == null) {
                        strArr3[i] = str;
                        this.b[i] = obj3;
                        this.c++;
                        break;
                    } else if (str2.equalsIgnoreCase(str)) {
                        this.b[i] = obj3;
                        break;
                    } else {
                        e = i + 1;
                        length2 = this.a.length;
                    }
                }
                int i6 = this.e;
                int i7 = 0;
                while (true) {
                    if (i7 < i6) {
                        int[] iArr2 = this.d;
                        if (iArr2[i7] == i5) {
                            iArr2[i7] = i;
                            break;
                        }
                        i7++;
                    }
                }
                i4 = i5 + 1;
                length = this.a.length;
            } else {
                return obj2;
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.Map
    public final Collection values() {
        o81 o81Var = this.D;
        if (o81Var != null) {
            return o81Var;
        }
        o81 o81Var2 = new o81(this);
        this.D = o81Var2;
        return o81Var2;
    }
}
