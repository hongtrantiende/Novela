package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t4d  reason: default package */
/* loaded from: classes.dex */
public final class t4d implements q4d {
    public js C;
    public js D;
    public js E;
    public js F;
    public float[] G;
    public float[] H;
    public mu9 I;
    public final vu7 a;
    public final wu7 b;
    public final int c;
    public final mn3 d;
    public int[] e = p4d.a;
    public float[] f;

    public t4d(vu7 vu7Var, wu7 wu7Var, int i, mn3 mn3Var) {
        this.a = vu7Var;
        this.b = wu7Var;
        this.c = i;
        this.d = mn3Var;
        float[] fArr = p4d.b;
        this.f = fArr;
        this.G = fArr;
        this.H = fArr;
        this.I = p4d.c;
    }

    public final int b(int i) {
        int i2;
        vu7 vu7Var = this.a;
        int i3 = vu7Var.b;
        int i4 = 0;
        if (i3 > 0) {
            int i5 = i3 - 1;
            while (true) {
                if (i4 <= i5) {
                    i2 = (i4 + i5) >>> 1;
                    int i6 = vu7Var.a[i2];
                    if (i6 < i) {
                        i4 = i2 + 1;
                    } else if (i6 <= i) {
                        break;
                    } else {
                        i5 = i2 - 1;
                    }
                } else {
                    i2 = -(i4 + 1);
                    break;
                }
            }
            if (i2 < -1) {
                return -(i2 + 2);
            }
            return i2;
        }
        cy7.k("");
        return 0;
    }

    public final float c(int i, int i2, boolean z) {
        mn3 mn3Var;
        float f;
        vu7 vu7Var = this.a;
        if (i >= vu7Var.b - 1) {
            f = i2;
        } else {
            int c = vu7Var.c(i);
            int c2 = vu7Var.c(i + 1);
            if (i2 == c) {
                f = c;
            } else {
                int i3 = c2 - c;
                s4d s4dVar = (s4d) this.b.b(c);
                if (s4dVar == null || (mn3Var = s4dVar.b) == null) {
                    mn3Var = this.d;
                }
                float f2 = i3;
                float f3 = mn3Var.f((i2 - c) / f2);
                if (z) {
                    return f3;
                }
                return ((f2 * f3) + c) / 1000.0f;
            }
        }
        return f / 1000.0f;
    }

    public final void d(js jsVar, js jsVar2, js jsVar3) {
        boolean z;
        float[] fArr;
        if (this.I != p4d.c) {
            z = true;
        } else {
            z = false;
        }
        js jsVar4 = this.C;
        wu7 wu7Var = this.b;
        vu7 vu7Var = this.a;
        if (jsVar4 == null) {
            this.C = jsVar.c();
            this.D = jsVar3.c();
            int i = vu7Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = vu7Var.c(i2) / 1000.0f;
            }
            this.f = fArr2;
            int i3 = vu7Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                s4d s4dVar = (s4d) wu7Var.b(vu7Var.c(i4));
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.I != p4d.c && c16.i(this.E, jsVar) && c16.i(this.F, jsVar2)) {
                return;
            }
            this.E = jsVar;
            this.F = jsVar2;
            int b = jsVar.b() + (jsVar.b() % 2);
            this.G = new float[b];
            this.H = new float[b];
            int i5 = vu7Var.b;
            float[][] fArr3 = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int c = vu7Var.c(i6);
                s4d s4dVar2 = (s4d) wu7Var.b(c);
                if (c == 0 && s4dVar2 == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = jsVar.a(i7);
                    }
                } else if (c == this.c && s4dVar2 == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = jsVar2.a(i8);
                    }
                } else {
                    s4dVar2.getClass();
                    js jsVar5 = s4dVar2.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = jsVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.I = new mu9(this.e, this.f, fArr3);
        }
    }

    @Override // defpackage.q4d
    public final int g() {
        return this.c;
    }

    @Override // defpackage.o4d
    public final js l(long j, js jsVar, js jsVar2, js jsVar3) {
        long j2;
        long j3 = j / 1000000;
        int[] iArr = p4d.a;
        long j4 = this.c;
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 < 0) {
            return jsVar3;
        }
        d(jsVar, jsVar2, jsVar3);
        js jsVar4 = this.D;
        jsVar4.getClass();
        int i = 0;
        if (this.I != p4d.c) {
            int i2 = (int) j2;
            float c = c(b(i2), i2, false);
            float[] fArr = this.H;
            yy[][] yyVarArr = (yy[][]) this.I.a;
            float f = yyVarArr[0][0].a;
            float f2 = yyVarArr[yyVarArr.length - 1][0].b;
            if (c < f) {
                c = f;
            }
            if (c <= f2) {
                f2 = c;
            }
            int length = fArr.length;
            boolean z = false;
            for (yy[] yyVarArr2 : yyVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    yy yyVar = yyVarArr2[i4];
                    if (f2 <= yyVar.b) {
                        if (yyVar.p) {
                            fArr[i3] = yyVar.q;
                            fArr[i3 + 1] = yyVar.r;
                        } else {
                            yyVar.c(f2);
                            fArr[i3] = yyVar.a();
                            fArr[i3 + 1] = yyVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                jsVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            js u = u((j2 - 1) * 1000000, jsVar, jsVar2, jsVar3);
            js u2 = u(j2 * 1000000, jsVar, jsVar2, jsVar3);
            int b = u.b();
            while (i < b) {
                jsVar4.e(i, (u.a(i) - u2.a(i)) * 1000.0f);
                i++;
            }
        }
        return jsVar4;
    }

    @Override // defpackage.q4d
    public final int o() {
        return 0;
    }

    @Override // defpackage.o4d
    public final js u(long j, js jsVar, js jsVar2, js jsVar3) {
        js jsVar4;
        js jsVar5;
        yy[][] yyVarArr;
        js jsVar6 = jsVar;
        long j2 = j / 1000000;
        int[] iArr = p4d.a;
        int i = this.c;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        wu7 wu7Var = this.b;
        s4d s4dVar = (s4d) wu7Var.b(i2);
        if (s4dVar != null) {
            return s4dVar.a;
        }
        if (i2 >= i) {
            return jsVar2;
        }
        if (i2 <= 0) {
            return jsVar6;
        }
        d(jsVar6, jsVar2, jsVar3);
        js jsVar7 = this.C;
        jsVar7.getClass();
        int i3 = 0;
        if (this.I != p4d.c) {
            float c = c(b(i2), i2, false);
            float[] fArr = this.G;
            yy[][] yyVarArr2 = (yy[][]) this.I.a;
            int length = yyVarArr2.length - 1;
            float f = yyVarArr2[0][0].a;
            float f2 = yyVarArr2[length][0].b;
            int length2 = fArr.length;
            if (c >= f && c <= f2) {
                int length3 = yyVarArr2.length;
                int i4 = 0;
                boolean z = false;
                while (i4 < length3) {
                    int i5 = i3;
                    int i6 = i5;
                    while (i5 < length2 - 1) {
                        yy yyVar = yyVarArr2[i4][i6];
                        if (c <= yyVar.b) {
                            if (yyVar.p) {
                                float f3 = yyVar.a;
                                float f4 = yyVar.k;
                                float f5 = yyVar.c;
                                fArr[i5] = a82.c(yyVar.e, f5, (c - f3) * f4, f5);
                                float f6 = yyVar.d;
                                fArr[i5 + 1] = a82.c(yyVar.f, f6, (c - f3) * f4, f6);
                            } else {
                                yyVar.c(c);
                                fArr[i5] = (yyVar.n * yyVar.h) + yyVar.q;
                                fArr[i5 + 1] = (yyVar.o * yyVar.i) + yyVar.r;
                            }
                            z = true;
                        }
                        i5 += 2;
                        i6++;
                    }
                    if (z) {
                        break;
                    }
                    i4++;
                    i3 = 0;
                }
            } else {
                if (c > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f7 = c - f;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2 - 1) {
                    yy yyVar2 = yyVarArr2[length][i8];
                    boolean z2 = yyVar2.p;
                    float f8 = yyVar2.r;
                    float f9 = yyVar2.q;
                    if (z2) {
                        float f10 = yyVar2.a;
                        float f11 = yyVar2.k;
                        float f12 = yyVar2.c;
                        yyVarArr = yyVarArr2;
                        fArr[i7] = (f9 * f7) + a82.c(yyVar2.e, f12, (f - f10) * f11, f12);
                        float f13 = yyVar2.d;
                        fArr[i7 + 1] = (f8 * f7) + a82.c(yyVar2.f, f13, (f - f10) * f11, f13);
                    } else {
                        yyVarArr = yyVarArr2;
                        yyVar2.c(f);
                        fArr[i7] = (yyVar2.a() * f7) + (yyVar2.n * yyVar2.h) + f9;
                        fArr[i7 + 1] = (yyVar2.b() * f7) + (yyVar2.o * yyVar2.i) + f8;
                    }
                    i7 += 2;
                    i8++;
                    yyVarArr2 = yyVarArr;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                jsVar7.e(i9, fArr[i9]);
            }
        } else {
            int b = b(i2);
            float c2 = c(b, i2, true);
            vu7 vu7Var = this.a;
            s4d s4dVar2 = (s4d) wu7Var.b(vu7Var.c(b));
            if (s4dVar2 != null && (jsVar5 = s4dVar2.a) != null) {
                jsVar6 = jsVar5;
            }
            s4d s4dVar3 = (s4d) wu7Var.b(vu7Var.c(b + 1));
            if (s4dVar3 == null || (jsVar4 = s4dVar3.a) == null) {
                jsVar4 = jsVar2;
            }
            int b2 = jsVar7.b();
            for (int i10 = 0; i10 < b2; i10++) {
                jsVar7.e(i10, (jsVar4.a(i10) * c2) + ((1.0f - c2) * jsVar6.a(i10)));
            }
        }
        return jsVar7;
    }
}
