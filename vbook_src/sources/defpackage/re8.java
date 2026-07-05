package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: re8  reason: default package */
/* loaded from: classes.dex */
public final class re8 extends xve {
    public int l;
    public int n;
    public int p;
    public pe8[] k = new pe8[16];
    public int[] m = new int[16];
    public Object[] o = new Object[16];

    public final void m() {
        this.l = 0;
        this.n = 0;
        Arrays.fill(this.o, 0, this.p, (Object) null);
        this.p = 0;
    }

    public final void n(ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        if (this.l != 0) {
            vh1 vh1Var = new vh1(this);
            re8 re8Var = (re8) vh1Var.e;
            while (true) {
                pe8 pe8Var = re8Var.k[vh1Var.b];
                lv4 b = pe8Var.b(vh1Var);
                ny nyVar2 = nyVar;
                eqa eqaVar2 = eqaVar;
                zm9 zm9Var2 = zm9Var;
                qe8 qe8Var2 = qe8Var;
                try {
                    pe8Var.a(vh1Var, nyVar2, eqaVar2, zm9Var2, qe8Var2);
                    int i = vh1Var.b;
                    int i2 = re8Var.l;
                    if (i < i2) {
                        pe8 pe8Var2 = re8Var.k[i];
                        vh1Var.c += pe8Var2.a;
                        vh1Var.d += pe8Var2.b;
                        int i3 = i + 1;
                        vh1Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        nyVar = nyVar2;
                        eqaVar = eqaVar2;
                        zm9Var = zm9Var2;
                        qe8Var = qe8Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (qe8Var2 != null) {
                        zxe.x(th, new se0(25, b, eqaVar2, qe8Var2));
                    }
                    throw th;
                }
            }
        }
        m();
    }

    public final boolean o() {
        if (this.l == 0) {
            return true;
        }
        return false;
    }

    public final void p(pe8 pe8Var) {
        int i;
        int i2;
        int i3 = this.l;
        pe8[] pe8VarArr = this.k;
        int i4 = 1024;
        if (i3 == pe8VarArr.length) {
            if (i3 > 1024) {
                i2 = 1024;
            } else {
                i2 = i3;
            }
            pe8[] pe8VarArr2 = new pe8[i2 + i3];
            System.arraycopy(pe8VarArr, 0, pe8VarArr2, 0, i3);
            this.k = pe8VarArr2;
        }
        int i5 = this.n;
        int i6 = pe8Var.a;
        int i7 = pe8Var.b;
        int i8 = i5 + i6;
        int[] iArr = this.m;
        int length = iArr.length;
        if (i8 > length) {
            if (length > 1024) {
                i = 1024;
            } else {
                i = length;
            }
            int i9 = i + length;
            if (i9 >= i8) {
                i8 = i9;
            }
            int[] iArr2 = new int[i8];
            b00.V(0, 0, length, iArr, iArr2);
            this.m = iArr2;
        }
        int i10 = this.p + i7;
        Object[] objArr = this.o;
        int length2 = objArr.length;
        if (i10 > length2) {
            if (length2 <= 1024) {
                i4 = length2;
            }
            int i11 = i4 + length2;
            if (i11 >= i10) {
                i10 = i11;
            }
            Object[] objArr2 = new Object[i10];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.o = objArr2;
        }
        pe8[] pe8VarArr3 = this.k;
        int i12 = this.l;
        this.l = i12 + 1;
        pe8VarArr3[i12] = pe8Var;
        this.n += pe8Var.a;
        this.p += i7;
    }
}
