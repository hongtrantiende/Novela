package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ba1  reason: default package */
/* loaded from: classes.dex */
public final class ba1 extends ia1 {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, Context.VERSION_ECMASCRIPT, 97, 98, 99, 100, 101, 102, Token.ASSIGN_BITAND, Token.ASSIGN_LOGICAL_AND, Token.ASSIGN_LSH, Token.ASSIGN_RSH, Token.ASSIGN_URSH, Token.ASSIGN_ADD, Token.ASSIGN_SUB, 110, Token.ASSIGN_DIV, Token.ASSIGN_MOD, Token.ASSIGN_EXP, 114, Token.HOOK, Token.COLON, Token.OR, Token.AND, Token.INC, 120, Token.DOT, Token.FUNCTION, 231, 247, 209, 241, 9632};
    public static final int[] D = {Token.DEBUGGER, Token.GENEXPR, 189, 191, 8482, Token.XMLEND, Token.TO_OBJECT, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, Token.XMLATTR, 42, 39, 8212, Token.SETCONST, 8480, 8226, 8220, 8221, 192, 194, 199, Context.VERSION_ES6, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, Token.ARRAYCOMP, Token.LAST_TOKEN};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, Token.EXPORT, Token.IF, 92, 94, 95, Token.IMPORT, Token.ELSE, 196, 228, 214, 246, 223, Token.GET, Token.TO_DOUBLE, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final km8 h = new km8();
    public final ArrayList m = new ArrayList();
    public aa1 n = new aa1(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public ba1(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.i = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        st0.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.k = 0;
                        this.j = 0;
                    } else {
                        this.k = 1;
                        this.j = 1;
                    }
                } else {
                    this.k = 0;
                    this.j = 1;
                }
            } else {
                this.k = 1;
                this.j = 0;
            }
        } else {
            this.k = 0;
            this.j = 0;
        }
        m(0);
        l();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.ia1, defpackage.zq2
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        m(0);
        this.r = 4;
        this.n.h = 4;
        l();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.ia1
    public final ja1 g() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new ja1(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x007e A[SYNTHETIC] */
    @Override // defpackage.ia1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.ga1 r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba1.h(ga1):void");
    }

    @Override // defpackage.ia1, defpackage.zq2
    /* renamed from: i */
    public final ha1 d() {
        ha1 ha1Var;
        ha1 d = super.d();
        if (d != null) {
            return d;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            long j2 = this.y;
            if (j2 != -9223372036854775807L && this.e - j2 >= j && (ha1Var = (ha1) this.b.pollFirst()) != null) {
                this.o = Collections.EMPTY_LIST;
                this.y = -9223372036854775807L;
                ja1 g = g();
                long j3 = this.e;
                ha1Var.c = j3;
                ha1Var.e = g;
                ha1Var.f = j3;
                return ha1Var;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.ia1
    public final boolean j() {
        if (this.o != this.p) {
            return true;
        }
        return false;
    }

    public final ArrayList k() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            td2 c = ((aa1) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            td2 td2Var = (td2) arrayList2.get(i3);
            if (td2Var != null) {
                if (td2Var.i != i) {
                    td2Var = ((aa1) arrayList.get(i3)).c(i);
                    td2Var.getClass();
                }
                arrayList3.add(td2Var);
            }
        }
        return arrayList3;
    }

    public final void l() {
        aa1 aa1Var = this.n;
        aa1Var.g = this.q;
        aa1Var.a.clear();
        aa1Var.b.clear();
        aa1Var.c.setLength(0);
        aa1Var.d = 15;
        aa1Var.e = 0;
        aa1Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void m(int i) {
        int i2 = this.q;
        if (i2 != i) {
            this.q = i;
            if (i == 3) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.m;
                    if (i3 < arrayList.size()) {
                        ((aa1) arrayList.get(i3)).g = i;
                        i3++;
                    } else {
                        return;
                    }
                }
            } else {
                l();
                if (i2 != 3 && i != 1 && i != 0) {
                    return;
                }
                this.o = Collections.EMPTY_LIST;
            }
        }
    }

    @Override // defpackage.ia1, defpackage.zq2
    public final void a() {
    }
}
