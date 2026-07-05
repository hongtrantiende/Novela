package defpackage;

import java.util.HashMap;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tb1 */
/* loaded from: classes.dex */
public final class tb1 implements CharSequence {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public tb1(List list) {
        int i;
        list.getClass();
        this.d = list;
        o29 o29Var = (o29) sl1.e0(list);
        if (o29Var != null) {
            i = o29Var.b;
        } else {
            i = -1;
        }
        this.b = i;
        o29 o29Var2 = (o29) sl1.k0(list);
        this.c = o29Var2 != null ? o29Var2.b : -1;
        this.e = new HashMap();
    }

    public void a() {
        List list = (List) this.d;
        HashMap hashMap = (HashMap) this.e;
        if (hashMap.isEmpty()) {
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = ((o29) list.get(i2)).b;
                if (i3 >= i) {
                    while (i < i3) {
                        hashMap.put(Integer.valueOf(i), Integer.valueOf(i2 - 1));
                        i++;
                    }
                    hashMap.put(Integer.valueOf(i3), Integer.valueOf(i2));
                    i = i3 + 1;
                }
            }
        }
    }

    public int b(int i) {
        List list = (List) this.d;
        if (list.isEmpty() || i < this.b) {
            return -1;
        }
        if (i > this.c) {
            return list.size() - 1;
        }
        a();
        Integer num = (Integer) ((HashMap) this.e).get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public int c(int i) {
        if (((List) this.d).isEmpty()) {
            return -1;
        }
        if (i < this.b) {
            return 0;
        }
        if (i > this.c) {
            return -1;
        }
        a();
        Integer num = (Integer) ((HashMap) this.e).get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.b + i;
                if (i >= 0) {
                    if (i2 < this.c) {
                        return ((vb1) this.e).c(i2);
                    }
                    StringBuilder s = hl5.s("index (", ") should be less than length (", i);
                    s.append(length());
                    s.append(')');
                    throw new IllegalArgumentException(s.toString().toString());
                }
                p1a.k(a82.j(i, "index is negative: "));
                return (char) 0;
            case 1:
                mv4 mv4Var = (mv4) this.e;
                if (mv4Var == null) {
                    return ((CharSequence) this.d).charAt(i);
                }
                if (i < this.b) {
                    return ((CharSequence) this.d).charAt(i);
                }
                int a = mv4Var.b - mv4Var.a();
                int i3 = this.b;
                if (i < a + i3) {
                    int i4 = i - i3;
                    int i5 = mv4Var.d;
                    char[] cArr = mv4Var.c;
                    if (i4 < i5) {
                        return cArr[i4];
                    }
                    return cArr[(i4 - i5) + mv4Var.e];
                }
                return ((CharSequence) this.d).charAt(i - ((a - this.c) + i3));
            default:
                return ((o29) ((List) this.d).get(i)).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Type inference failed for: r4v0, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [xl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.tb1 d(java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            java.util.List r0 = (java.util.List) r0
            r10.getClass()
            r11.getClass()
            zhe r3 = new zhe
            r3.<init>(r10, r12, r13)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            if (r12 == 0) goto L2f
            gm9 r12 = new gm9
            r12.<init>(r10)
            ki4 r9 = defpackage.gm9.c(r12, r9)
            rg8 r10 = new rg8
            r12 = 26
            r10.<init>(r12)
            ki4 r12 = new ki4
            r13 = 3
            r12.<init>(r13, r9, r10)
        L2d:
            r5 = r8
            goto L57
        L2f:
            r10 = 2
            if (r13 == 0) goto L45
            xl9 r4 = new xl9
            r4.<init>()
            fm9 r1 = new fm9
            r6 = 0
            r5 = 1
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            c00 r12 = new c00
            r12.<init>(r1, r10)
            goto L2d
        L45:
            r2 = r9
            xl9 r4 = new xl9
            r4.<init>()
            fm9 r1 = new fm9
            r6 = 0
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            c00 r12 = new c00
            r12.<init>(r1, r10)
        L57:
            java.util.Iterator r9 = r12.iterator()
            r8 = r5
        L5c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lad
            java.lang.Object r10 = r9.next()
            y17 r10 = (defpackage.y17) r10
            int r12 = r10.a
            int r13 = r10.b
        L6c:
            if (r8 >= r12) goto L78
            java.lang.Object r1 = r0.get(r8)
            r7.add(r1)
            int r8 = r8 + 1
            goto L6c
        L78:
            int r12 = r11.length()
            if (r12 <= 0) goto Laa
            int r10 = r10.a
            java.lang.Object r10 = r0.get(r10)
            o29 r10 = (defpackage.o29) r10
            java.lang.Object r12 = r0.get(r13)
            o29 r12 = (defpackage.o29) r12
            int r1 = r11.length()
            r8 = r5
        L91:
            if (r8 >= r1) goto Laa
            o29 r2 = new o29
            char r3 = r11.charAt(r8)
            int r4 = r10.b
            int r4 = r4 + r8
            int r6 = r12.b
            if (r4 <= r6) goto La1
            r4 = r6
        La1:
            r2.<init>(r3, r4)
            r7.add(r2)
            int r8 = r8 + 1
            goto L91
        Laa:
            int r8 = r13 + 1
            goto L5c
        Lad:
            int r9 = r0.size()
            if (r8 >= r9) goto Lc3
            int r9 = r0.size()
        Lb7:
            if (r8 >= r9) goto Lc3
            java.lang.Object r10 = r0.get(r8)
            r7.add(r10)
            int r8 = r8 + 1
            goto Lb7
        Lc3:
            tb1 r9 = new tb1
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb1.d(java.lang.String, java.lang.String, boolean, boolean):tb1");
    }

    public void e(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            ov5.a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            ov5.a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            ov5.a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            ov5.a("textStart must be non-negative, but was " + i3);
        }
        mv4 mv4Var = (mv4) this.e;
        int i5 = i4 - i3;
        if (mv4Var == null) {
            int max = Math.max(255, i5 + Token.CASE);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((CharSequence) this.d).length() - i2, 64);
            int i6 = i - min;
            o28.w((CharSequence) this.d, cArr, 0, i6, i);
            int i7 = max - min2;
            int i8 = min2 + i2;
            o28.w((CharSequence) this.d, cArr, i7, i2, i8);
            o28.w(charSequence, cArr, min, i3, i4);
            mv4 mv4Var2 = new mv4(1);
            mv4Var2.b = max;
            mv4Var2.c = cArr;
            mv4Var2.d = min + i5;
            mv4Var2.e = i7;
            this.e = mv4Var2;
            this.b = i6;
            this.c = i8;
            return;
        }
        int i9 = this.b;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 >= 0 && i11 <= mv4Var.b - mv4Var.a()) {
            int i12 = i5 - (i11 - i10);
            if (i12 > mv4Var.a()) {
                int a = i12 - mv4Var.a();
                int i13 = mv4Var.b;
                do {
                    i13 *= 2;
                } while (i13 - mv4Var.b < a);
                char[] cArr2 = new char[i13];
                b00.X(mv4Var.c, cArr2, 0, 0, mv4Var.d);
                int i14 = mv4Var.b;
                int i15 = mv4Var.e;
                int i16 = i14 - i15;
                int i17 = i13 - i16;
                b00.X(mv4Var.c, cArr2, i17, i15, i16 + i15);
                mv4Var.c = cArr2;
                mv4Var.b = i13;
                mv4Var.e = i17;
            }
            int i18 = mv4Var.d;
            if (i10 < i18 && i11 <= i18) {
                int i19 = i18 - i11;
                char[] cArr3 = mv4Var.c;
                b00.X(cArr3, cArr3, mv4Var.e - i19, i11, i18);
                mv4Var.d = i10;
                mv4Var.e -= i19;
            } else if (i10 < i18 && i11 >= i18) {
                mv4Var.e = mv4Var.a() + i11;
                mv4Var.d = i10;
            } else {
                int a2 = mv4Var.a() + i10;
                int a3 = mv4Var.a() + i11;
                int i20 = mv4Var.e;
                char[] cArr4 = mv4Var.c;
                b00.X(cArr4, cArr4, mv4Var.d, i20, a2);
                mv4Var.d += a2 - i20;
                mv4Var.e = a3;
            }
            o28.w(charSequence, mv4Var.c, mv4Var.d, i3, i4);
            mv4Var.d += i5;
            return;
        }
        this.d = toString();
        this.e = null;
        this.b = -1;
        this.c = -1;
        e(i, i2, charSequence, i3, i4);
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof CharSequence)) {
                    return false;
                }
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() != length()) {
                    return false;
                }
                vb1 vb1Var = (vb1) this.e;
                int i = this.b;
                int length = length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (vb1Var.c(i + i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public ps g(ps psVar) {
        psVar.getClass();
        String tb1Var = toString();
        ns nsVar = new ns();
        nsVar.f(tb1Var);
        for (os osVar : psVar.c()) {
            int c = c(osVar.b);
            int b = b(osVar.c - 1);
            if (c >= 0 && b >= 0 && b >= c) {
                nsVar.b(c, b + 1, (uva) osVar.a);
            }
        }
        int i = -1;
        for (os osVar2 : psVar.b()) {
            int c2 = c(osVar2.b);
            int b2 = b(osVar2.c - 1);
            if (c2 >= 0 && b2 >= 0 && b2 >= c2 && c2 >= i) {
                if (c2 != b2 || tb1Var.charAt(c2) != '\n') {
                    nsVar.c((pl8) osVar2.a, c2, b2 + 1);
                }
                i = b2 + 1;
            }
        }
        for (os osVar3 : psVar.d(0, psVar.b.length())) {
            int c3 = c(osVar3.b);
            int b3 = b(osVar3.c - 1);
            if (c3 >= 0 && b3 >= 0 && b3 >= c3) {
                nsVar.a(osVar3.d, c3, b3 + 1, (String) osVar3.a);
            }
        }
        return nsVar.k();
    }

    public int hashCode() {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                if (str != null) {
                    return str.hashCode();
                }
                vb1 vb1Var = (vb1) this.e;
                int i = this.c;
                int i2 = 0;
                for (int i3 = this.b; i3 < i; i3++) {
                    i2 = (i2 * 31) + vb1Var.c(i3);
                }
                return i2;
            default:
                return super.hashCode();
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        switch (this.a) {
            case 0:
                return this.c - this.b;
            case 1:
                mv4 mv4Var = (mv4) this.e;
                CharSequence charSequence = (CharSequence) this.d;
                if (mv4Var == null) {
                    return charSequence.length();
                }
                return (mv4Var.b - mv4Var.a()) + (charSequence.length() - (this.c - this.b));
            default:
                return ((List) this.d).size();
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        switch (this.a) {
            case 0:
                if (i >= 0) {
                    if (i <= i2) {
                        int i3 = this.c;
                        int i4 = this.b;
                        if (i2 <= i3 - i4) {
                            if (i == i2) {
                                return "";
                            }
                            return new tb1((vb1) this.e, i + i4, i4 + i2);
                        }
                        ls2.d(length(), 41, "end should be less than length (");
                        return null;
                    }
                    vs.i(i, "start (", ") should be less or equal to end (", i2);
                    return null;
                }
                p1a.k(a82.j(i, "start is negative: "));
                return null;
            case 1:
                return toString().subSequence(i, i2);
            default:
                return new tb1(((List) this.d).subList(i, i2));
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                if (str == null) {
                    String obj = ((vb1) this.e).b(this.b, this.c).toString();
                    this.d = obj;
                    return obj;
                }
                return str;
            case 1:
                mv4 mv4Var = (mv4) this.e;
                if (mv4Var == null) {
                    return ((CharSequence) this.d).toString();
                }
                StringBuilder sb = new StringBuilder((((CharSequence) this.d).length() + ((mv4Var.b - mv4Var.a()) + this.b)) - this.c);
                sb.append((CharSequence) this.d, 0, this.b);
                sb.append(mv4Var.c, 0, mv4Var.d);
                char[] cArr = mv4Var.c;
                int i = mv4Var.e;
                sb.append(cArr, i, mv4Var.b - i);
                CharSequence charSequence = (CharSequence) this.d;
                sb.append(charSequence, this.c, charSequence.length());
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder();
                for (o29 o29Var : (List) this.d) {
                    sb2.append(o29Var.a);
                }
                return sb2.toString();
        }
    }

    public /* synthetic */ tb1() {
    }

    public tb1(vb1 vb1Var, int i, int i2) {
        this.e = vb1Var;
        this.b = i;
        this.c = i2;
    }
}
