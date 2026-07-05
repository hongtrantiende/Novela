package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oz6  reason: default package */
/* loaded from: classes3.dex */
public final class oz6 extends ad1 {
    public final /* synthetic */ int b;
    public zc1 c;
    public final Object d;
    public Object e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, o55, ad1] */
    /* JADX WARN: Type inference failed for: r4v9, types: [guc, ad1] */
    public oz6(int i) {
        this.b = i;
        zc1 zc1Var = zc1.a;
        switch (i) {
            case 1:
                this.c = zc1Var;
                ArrayList arrayList = new ArrayList();
                this.d = arrayList;
                int[] iArr = kk5.m;
                int[] iArr2 = qz0.f;
                arrayList.add(new gma(new d9a(iArr, iArr2, 0.976601f, "WINDOWS-1251"), false, null));
                arrayList.add(new gma(new d9a(kk5.j, iArr2, 0.976601f, "KOI8-R"), false, null));
                arrayList.add(new gma(new d9a(kk5.k, iArr2, 0.976601f, "ISO-8859-5"), false, null));
                arrayList.add(new gma(new d9a(kk5.l, iArr2, 0.976601f, "MACCYRILLIC"), false, null));
                arrayList.add(new gma(new d9a(kk5.i, iArr2, 0.976601f, "IBM866"), false, null));
                arrayList.add(new gma(new d9a(kk5.h, iArr2, 0.976601f, "IBM855"), false, null));
                int[] iArr3 = ac6.h;
                int[] iArr4 = qz0.g;
                arrayList.add(new gma(new d9a(iArr3, iArr4, 0.982851f, "ISO-8859-7"), false, null));
                arrayList.add(new gma(new d9a(ac6.i, iArr4, 0.982851f, "WINDOWS-1253"), false, null));
                int[] iArr5 = zb6.h;
                int[] iArr6 = qz0.e;
                arrayList.add(new gma(new d9a(iArr5, iArr6, 0.969392f, "ISO-8859-5"), false, null));
                arrayList.add(new gma(new d9a(zb6.i, iArr6, 0.969392f, "WINDOWS-1251"), false, null));
                arrayList.add(new gma(new d9a(n55.g, n55.h, 0.926386f, "TIS620"), false, null));
                d9a d9aVar = new d9a(n55.e, n55.f, 0.984004f, "WINDOWS-1255");
                ?? ad1Var = new ad1();
                ad1Var.d = (byte) 32;
                ad1Var.e = (byte) 32;
                gma gmaVar = new gma(d9aVar, false, ad1Var);
                gma gmaVar2 = new gma(d9aVar, true, ad1Var);
                ad1Var.f = gmaVar;
                ad1Var.g = gmaVar2;
                arrayList.add(ad1Var);
                arrayList.add(gmaVar);
                arrayList.add(gmaVar2);
                d();
                return;
            case 2:
                this.d = new p88[]{new p88(new z1(new n07(g35.C), 6, new n07(g35.D), g35.E, "HZ-GB-2312")), new p88(new z1(new n07(fk5.C), 9, new n07(fk5.D), fk5.E, "ISO-2022-CN")), new p88(new z1(new n07(gk5.C), 10, new n07(gk5.D), gk5.E, "ISO-2022-JP")), new p88(new z1(new n07(hk5.C), 6, new n07(hk5.D), hk5.E, "ISO-2022-KR"))};
                this.f = 4;
                this.c = zc1Var;
                return;
            default:
                this.c = zc1Var;
                ev4 ev4Var = new ev4();
                ?? ad1Var2 = new ad1();
                ad1Var2.b = new p88(guc.e);
                ad1Var2.c = zc1Var;
                this.d = tl1.C(ev4Var, ad1Var2, new sk0(), new zv9(), new en3(), new hn3(), new kn3());
                d();
                return;
        }
    }

    @Override // defpackage.ad1
    public final String a() {
        String a;
        String a2;
        int i = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (((ad1) this.e) == null) {
                    b();
                    if (((ad1) this.e) == null && !arrayList.isEmpty()) {
                        this.e = (ad1) arrayList.get(0);
                    }
                }
                ad1 ad1Var = (ad1) this.e;
                if (ad1Var == null || (a = ad1Var.a()) == null) {
                    return "";
                }
                return a;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((ad1) this.e) == null) {
                    b();
                    if (((ad1) this.e) == null && !arrayList2.isEmpty()) {
                        this.e = (ad1) arrayList2.get(0);
                    }
                }
                ad1 ad1Var2 = (ad1) this.e;
                if (ad1Var2 == null || (a2 = ad1Var2.a()) == null) {
                    return "";
                }
                return a2;
            default:
                String str = (String) this.e;
                if (str == null) {
                    return "";
                }
                return str;
        }
    }

    @Override // defpackage.ad1
    public final float b() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        zc1 zc1Var = zc1.c;
        zc1 zc1Var2 = zc1.b;
        switch (i) {
            case 0:
                zc1 zc1Var3 = this.c;
                if (zc1Var3 == zc1Var2) {
                    return 0.99f;
                }
                if (zc1Var3 == zc1Var) {
                    return 0.01f;
                }
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                float f = 0.0f;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ad1 ad1Var = (ad1) obj2;
                    if (ad1Var.a) {
                        float b = ad1Var.b();
                        if (f < b) {
                            this.e = ad1Var;
                            f = b;
                        }
                    }
                }
                return f;
            case 1:
                zc1 zc1Var4 = this.c;
                if (zc1Var4 == zc1Var2) {
                    return 0.99f;
                }
                if (zc1Var4 == zc1Var) {
                    return 0.01f;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                float f2 = 0.0f;
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    ad1 ad1Var2 = (ad1) obj3;
                    if (ad1Var2.a) {
                        float b2 = ad1Var2.b();
                        if (f2 < b2) {
                            this.e = ad1Var2;
                            f2 = b2;
                        }
                    }
                }
                return f2;
            default:
                return 0.99f;
        }
    }

    @Override // defpackage.ad1
    public final zc1 c(byte[] bArr, int i) {
        ad1 ad1Var;
        ad1 ad1Var2;
        int i2 = this.b;
        zc1 zc1Var = zc1.c;
        zc1 zc1Var2 = zc1.b;
        Object obj = this.d;
        switch (i2) {
            case 0:
                byte[] bArr2 = new byte[i];
                boolean z = true;
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte b = bArr[i4];
                    if ((b & 128) != 0) {
                        bArr2[i3] = b;
                        i3++;
                        z = true;
                    } else if (z) {
                        bArr2[i3] = b;
                        i3++;
                        z = false;
                    }
                }
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        Object obj2 = arrayList.get(i5);
                        i5++;
                        ad1Var = (ad1) obj2;
                        if (ad1Var.a) {
                            zc1 c = ad1Var.c(bArr2, i3);
                            if (c != zc1Var2 && ad1Var.b() != 0.99f) {
                                if (c == zc1Var) {
                                    ad1Var.a = false;
                                    int i6 = this.f - 1;
                                    this.f = i6;
                                    if (i6 <= 0) {
                                        this.c = zc1Var;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                this.e = ad1Var;
                this.c = zc1Var2;
                return this.c;
            case 1:
                ArrayList arrayList2 = new ArrayList(i);
                int i7 = 0;
                boolean z2 = false;
                int i8 = 0;
                while (i7 < i) {
                    byte b2 = bArr[i7];
                    if ((b2 & 128) == 0) {
                        int i9 = b2 & 255;
                        if (i9 < 65 || ((i9 > 90 && i9 < 97) || i9 > 122)) {
                            if (z2 && i7 > i8) {
                                while (i8 < i7) {
                                    arrayList2.add(Byte.valueOf(bArr[i8]));
                                    i8++;
                                }
                                arrayList2.add((byte) 32);
                                i8 = i7 + 1;
                                z2 = false;
                            } else {
                                i8 = i7 + 1;
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    i7++;
                }
                if (z2 && i7 > i8) {
                    while (i8 < i7) {
                        arrayList2.add(Byte.valueOf(bArr[i8]));
                        i8++;
                    }
                }
                byte[] x0 = sl1.x0(arrayList2);
                if (x0.length == 0) {
                    return this.c;
                }
                ArrayList arrayList3 = (ArrayList) obj;
                int size2 = arrayList3.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        ad1Var2 = (ad1) obj3;
                        if (ad1Var2.a) {
                            zc1 c2 = ad1Var2.c(x0, x0.length);
                            if (c2 != zc1Var2 && ad1Var2.b() != 0.99f) {
                                if (c2 == zc1Var) {
                                    ad1Var2.a = false;
                                    int i11 = this.f - 1;
                                    this.f = i11;
                                    if (i11 <= 0) {
                                        this.c = zc1Var;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                this.e = ad1Var2;
                this.c = zc1Var2;
                return this.c;
            default:
                p88[] p88VarArr = (p88[]) obj;
                for (int i12 = 0; i12 < i && this.c == zc1.a; i12++) {
                    for (int i13 = this.f - 1; i13 >= 0; i13--) {
                        int z3 = p88VarArr[i13].z(bArr[i12]);
                        if (z3 != 1) {
                            if (z3 == 2) {
                                this.c = zc1Var2;
                                this.e = (String) ((z1) p88VarArr[i13].c).c;
                                return zc1Var2;
                            }
                        } else {
                            int i14 = this.f - 1;
                            this.f = i14;
                            if (i14 <= 0) {
                                this.c = zc1Var;
                                return zc1Var;
                            } else if (i13 != i14) {
                                p88 p88Var = p88VarArr[i14];
                                p88VarArr[i14] = p88VarArr[i13];
                                p88VarArr[i13] = p88Var;
                            }
                        }
                    }
                }
                return this.c;
        }
    }

    @Override // defpackage.ad1
    public final void d() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        zc1 zc1Var = zc1.a;
        switch (i) {
            case 0:
                this.f = 0;
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ad1 ad1Var = (ad1) obj2;
                    ad1Var.d();
                    ad1Var.a = true;
                    this.f++;
                }
                this.e = null;
                this.c = zc1Var;
                return;
            case 1:
                this.f = 0;
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    ad1 ad1Var2 = (ad1) obj3;
                    ad1Var2.d();
                    ad1Var2.a = true;
                    this.f++;
                }
                this.e = null;
                this.c = zc1Var;
                return;
            default:
                this.c = zc1Var;
                p88[] p88VarArr = (p88[]) obj;
                for (p88 p88Var : p88VarArr) {
                    p88Var.a = 0;
                }
                this.f = p88VarArr.length;
                this.e = null;
                return;
        }
    }
}
