package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ljc  reason: default package */
/* loaded from: classes.dex */
public final class ljc implements gr2, g4a {
    public int a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Type inference failed for: r14v3, types: [k41, java.lang.Object] */
    public ljc(ad7 ad7Var, gd7 gd7Var) {
        boolean z;
        this.c = new long[33];
        this.d = new long[33];
        this.e = new ArrayList();
        int i = gd7Var.l;
        u01 d = ad7Var.d(i);
        if (d.f(0, 4).equals("HUFF")) {
            int k = d.k(8);
            this.a = d.k(12);
            int[] iArr = new int[256];
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = (i2 * 2) + k;
                iArr[i2] = (d.m(i3) << 8) | d.m(i3 + 1);
            }
            this.b = iArr;
            int i4 = this.a;
            byte[] bArr = d.b;
            u01 u01Var = new u01(b00.d0(bArr, i4, bArr.length), 0, (byte) 0);
            int i5 = 1;
            for (int i6 = 33; i5 < i6; i6 = 33) {
                long j = u01Var.j();
                long j2 = u01Var.j();
                int i7 = 32 - i5;
                ((long[]) this.c)[i5] = j << i7;
                ((long[]) this.d)[i5] = ((j2 + 1) << i7) - 1;
                i5++;
                i = i;
            }
            int i8 = i;
            int i9 = gd7Var.m;
            for (int i10 = 1; i10 < i9; i10++) {
                u01 d2 = ad7Var.d(i8 + i10);
                if (d2.f(0, 4).equals("CDIC")) {
                    int k2 = d2.k(4);
                    int min = Math.min(1 << d2.k(12), d2.k(8) - ((ArrayList) this.e).size());
                    u01 u01Var2 = new u01(d2.c(k2, d2.b.length - k2), 0, (byte) 0);
                    for (int i11 = 0; i11 < min; i11++) {
                        int i12 = u01Var2.i(i11 * 2);
                        int i13 = u01Var2.i(i12);
                        int i14 = i13 & 32767;
                        if ((i13 & 32768) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        byte[] c = u01Var2.c(i12 + 2, i14);
                        ?? obj = new Object();
                        obj.a = c;
                        obj.b = z;
                        ((ArrayList) this.e).add(obj);
                    }
                } else {
                    vs.k("Invalid CDIC record");
                    throw null;
                }
            }
            return;
        }
        vs.k("Invalid HUFF record");
        throw null;
    }

    public static void a(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        xoe.h(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, z);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        xoe.g();
    }

    public static long m(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = 8;
        long j = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            int i5 = length - 1;
            if (length <= 0) {
                break;
            }
            j |= (bArr[i + i3] & 255) << (i4 * 8);
            i3++;
            length = i5;
            i2 = i4;
        }
        return j;
    }

    @Override // defpackage.g4a
    public void b(km8 km8Var) {
        lac lacVar;
        int i;
        lac lacVar2;
        SparseArray sparseArray;
        int i2;
        ea1 ea1Var;
        int i3;
        char c;
        voc a;
        int i4;
        int i5;
        lac lacVar3;
        SparseArray sparseArray2 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        ea1 ea1Var2 = (ea1) this.b;
        toc tocVar = (toc) this.e;
        SparseArray sparseArray3 = tocVar.h;
        SparseBooleanArray sparseBooleanArray = tocVar.i;
        qy2 qy2Var = tocVar.f;
        List list = tocVar.c;
        int i6 = tocVar.a;
        if (km8Var.z() == 2) {
            if (i6 != 1 && i6 != 2 && tocVar.n != 1) {
                lacVar = new lac(((lac) list.get(0)).d());
                list.add(lacVar);
            } else {
                lacVar = (lac) list.get(0);
            }
            if ((km8Var.z() & Token.CASE) != 0) {
                km8Var.N(1);
                int G = km8Var.G();
                km8Var.N(3);
                km8Var.k(ea1Var2.b, 0, 2);
                ea1Var2.m(0);
                ea1Var2.o(3);
                tocVar.t = ea1Var2.g(13);
                km8Var.k(ea1Var2.b, 0, 2);
                ea1Var2.m(0);
                ea1Var2.o(4);
                km8Var.N(ea1Var2.g(12));
                if (i6 == 2 && tocVar.r == null) {
                    voc a2 = qy2Var.a(21, new vdf(21, null, 0, null, a2d.b));
                    tocVar.r = a2;
                    if (a2 != null) {
                        a2.d(lacVar, tocVar.m, new zc7(G, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a3 = km8Var.a();
                while (a3 > 0) {
                    km8Var.k(ea1Var2.b, 0, 5);
                    ea1Var2.m(0);
                    int g = ea1Var2.g(8);
                    ea1Var2.o(3);
                    int g2 = ea1Var2.g(13);
                    ea1Var2.o(4);
                    int g3 = ea1Var2.g(12);
                    int i7 = km8Var.b;
                    int i8 = i7 + g3;
                    int i9 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i10 = 0;
                    int i11 = a3;
                    while (true) {
                        if (km8Var.b < i8) {
                            int z = km8Var.z();
                            ea1Var = ea1Var2;
                            int z2 = km8Var.b + km8Var.z();
                            if (z2 > i8) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (z == 5) {
                                long B = km8Var.B();
                                if (B == 1094921523) {
                                    i9 = 129;
                                } else if (B == 1161904947) {
                                    i9 = 135;
                                } else {
                                    if (B != 1094921524) {
                                        if (B == 1212503619) {
                                            i9 = 36;
                                        }
                                    }
                                    i9 = 172;
                                }
                                i4 = z2;
                                i5 = G;
                                lacVar3 = lacVar;
                            } else if (z == 106) {
                                i4 = z2;
                                i5 = G;
                                lacVar3 = lacVar;
                                i9 = 129;
                            } else if (z == 122) {
                                i5 = G;
                                lacVar3 = lacVar;
                                i9 = 135;
                                i4 = z2;
                            } else {
                                if (z == 127) {
                                    int z3 = km8Var.z();
                                    if (z3 != 21) {
                                        if (z3 == 14) {
                                            i9 = Token.WITH;
                                        } else if (z3 == 33) {
                                            i9 = Token.VOID;
                                        }
                                    }
                                    i9 = 172;
                                } else if (z == 123) {
                                    i9 = 138;
                                } else if (z == 10) {
                                    str = km8Var.x(3, StandardCharsets.UTF_8).trim();
                                    i4 = z2;
                                    i10 = km8Var.z();
                                    i5 = G;
                                    lacVar3 = lacVar;
                                } else {
                                    if (z == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (km8Var.b < z2) {
                                            String trim = km8Var.x(3, StandardCharsets.UTF_8).trim();
                                            km8Var.z();
                                            lac lacVar4 = lacVar;
                                            byte[] bArr = new byte[4];
                                            km8Var.k(bArr, 0, 4);
                                            arrayList2.add(new uoc(trim, bArr));
                                            lacVar = lacVar4;
                                            z2 = z2;
                                            G = G;
                                        }
                                        i4 = z2;
                                        i5 = G;
                                        lacVar3 = lacVar;
                                        arrayList = arrayList2;
                                        i9 = 89;
                                    } else {
                                        i4 = z2;
                                        i5 = G;
                                        lacVar3 = lacVar;
                                        if (z == 111) {
                                            i9 = 257;
                                        }
                                    }
                                    km8Var.N(i4 - km8Var.b);
                                    lacVar = lacVar3;
                                    ea1Var2 = ea1Var;
                                    sparseArray3 = sparseArray4;
                                    G = i5;
                                }
                                i4 = z2;
                                i5 = G;
                                lacVar3 = lacVar;
                            }
                            km8Var.N(i4 - km8Var.b);
                            lacVar = lacVar3;
                            ea1Var2 = ea1Var;
                            sparseArray3 = sparseArray4;
                            G = i5;
                        } else {
                            ea1Var = ea1Var2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i12 = G;
                    lac lacVar5 = lacVar;
                    km8Var.M(i8);
                    vdf vdfVar = new vdf(i9, str, i10, arrayList, Arrays.copyOfRange(km8Var.a, i7, i8));
                    if (g == 6 || g == 5) {
                        g = i9;
                    }
                    int i13 = i11 - (g3 + 5);
                    if (i6 == 2) {
                        i3 = g;
                    } else {
                        i3 = g2;
                    }
                    if (sparseBooleanArray.get(i3)) {
                        c = 21;
                    } else {
                        c = 21;
                        if (i6 == 2 && g == 21) {
                            a = tocVar.r;
                        } else {
                            a = qy2Var.a(g, vdfVar);
                        }
                        if (i6 != 2 || g2 < sparseIntArray.get(i3, 8192)) {
                            sparseIntArray.put(i3, g2);
                            sparseArray2.put(i3, a);
                        }
                    }
                    a3 = i13;
                    lacVar = lacVar5;
                    ea1Var2 = ea1Var;
                    sparseArray3 = sparseArray5;
                    G = i12;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i14 = G;
                lac lacVar6 = lacVar;
                int size = sparseIntArray.size();
                int i15 = 0;
                while (i15 < size) {
                    int keyAt = sparseIntArray.keyAt(i15);
                    int valueAt = sparseIntArray.valueAt(i15);
                    sparseBooleanArray.put(keyAt, true);
                    tocVar.j.put(valueAt, true);
                    voc vocVar = (voc) sparseArray2.valueAt(i15);
                    if (vocVar != null) {
                        if (vocVar != tocVar.r) {
                            i2 = i14;
                            lacVar2 = lacVar6;
                            vocVar.d(lacVar2, tocVar.m, new zc7(i2, keyAt, 8192));
                        } else {
                            lacVar2 = lacVar6;
                            i2 = i14;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, vocVar);
                    } else {
                        lacVar2 = lacVar6;
                        sparseArray = sparseArray6;
                        i2 = i14;
                    }
                    i15++;
                    sparseArray6 = sparseArray;
                    i14 = i2;
                    lacVar6 = lacVar2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i6 == 2) {
                    if (!tocVar.o) {
                        tocVar.m.m();
                        tocVar.n = 0;
                        tocVar.o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.a);
                if (i6 == 1) {
                    i = 0;
                } else {
                    i = tocVar.n - 1;
                }
                tocVar.n = i;
                if (i == 0) {
                    tocVar.m.m();
                    tocVar.o = true;
                }
            }
        }
    }

    public byte c(int i) {
        int i2 = this.a;
        if (i >= 0 && i < i2) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
            byte[] bArr = (byte[]) this.c;
            if (bArr != null) {
                return bArr[i];
            }
            int i3 = i / Parser.ARGC_LIMIT;
            byte[] bArr2 = (byte[]) linkedHashMap.get(Integer.valueOf(i3));
            if (bArr2 == null) {
                x56 x56Var = (x56) this.b;
                if (x56Var != null) {
                    int q = x56Var.q(i3 * 65536, (byte[]) this.e, 0, Math.min((int) Parser.ARGC_LIMIT, i2 - (i3 * Parser.ARGC_LIMIT)));
                    if (q < 0) {
                        q = 0;
                    }
                    bArr2 = Arrays.copyOf((byte[]) this.e, Math.max(q, 0));
                    linkedHashMap.put(Integer.valueOf(i3), bArr2);
                    if (linkedHashMap.size() > 64) {
                        Set keySet = linkedHashMap.keySet();
                        keySet.getClass();
                        linkedHashMap.remove(sl1.b0(keySet));
                    }
                } else {
                    vs.k("no handle");
                    return (byte) 0;
                }
            }
            int i4 = i - (i3 * Parser.ARGC_LIMIT);
            if (i4 < bArr2.length) {
                return bArr2[i4];
            }
        }
        return (byte) 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [my0, java.lang.Object] */
    @Override // defpackage.gr2
    public byte[] e(byte[] bArr) {
        bArr.getClass();
        ?? obj = new Object();
        char c = '\b';
        int length = bArr.length * 8;
        long m = m(bArr, 0);
        int i = 32;
        int i2 = 0;
        while (true) {
            if (i <= 0) {
                i2 += 4;
                m = m(bArr, i2);
                i += 32;
            }
            long j = (m >> i) & 4294967295L;
            int i3 = ((int[]) this.b)[(int) (j >> 24)];
            int i4 = i3 & 31;
            long j2 = (((i3 >> c) + 1) << ((int) (32 - i4))) - 1;
            if ((i3 & Token.CASE) == 0) {
                while (j < ((long[]) this.c)[i4]) {
                    i4++;
                }
                j2 = ((long[]) this.d)[i4];
            }
            i -= i4;
            length -= i4;
            if (length < 0) {
                return obj.p0(obj.b);
            }
            Object obj2 = ((ArrayList) this.e).get((int) ((j2 - j) >> (32 - i4)));
            obj2.getClass();
            k41 k41Var = (k41) obj2;
            if (!k41Var.b) {
                k41Var.a = e(k41Var.a);
                k41Var.b = true;
            }
            byte[] bArr2 = k41Var.a;
            obj.write(bArr2, 0, bArr2.length);
            c = '\b';
        }
    }

    public int f(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        xoe.g();
        return glGetAttribLocation;
    }

    public long g() {
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            return tnd.a.a(paint);
        }
        return sve.b(paint.getColor());
    }

    public int h() {
        int i;
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = rj.a[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public int i() {
        int i;
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = rj.b[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public boolean j(ljc ljcVar, int i) {
        if (ljcVar == null || !Objects.equals(((ao9[]) this.b)[i], ((ao9[]) ljcVar.b)[i]) || !Objects.equals(((c14[]) this.c)[i], ((c14[]) ljcVar.c)[i])) {
            return false;
        }
        return true;
    }

    public boolean k(int i) {
        if (((ao9[]) this.b)[i] != null) {
            return true;
        }
        return false;
    }

    public byte[] l(int i, int i2) {
        int i3 = this.a;
        int n = dce.n(i, 0, i3);
        int n2 = dce.n(i2, n, i3);
        int i4 = n2 - n;
        if (i4 == 0) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) this.c;
        if (bArr != null) {
            return b00.d0(bArr, n, n2);
        }
        byte[] bArr2 = new byte[i4];
        x56 x56Var = (x56) this.b;
        if (x56Var != null) {
            int i5 = 0;
            while (i5 < i4) {
                x56 x56Var2 = x56Var;
                int q = x56Var2.q(n + i5, bArr2, i5, i4 - i5);
                if (q <= 0) {
                    break;
                }
                i5 += q;
                x56Var = x56Var2;
            }
        }
        return bArr2;
    }

    public void n(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void o(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            tnd.a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(ff.F(i)));
        }
    }

    public void p(long j) {
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            tnd.a.c(paint, j);
        } else {
            paint.setColor(sve.x(j));
        }
    }

    public void q(em1 em1Var) {
        ColorFilter colorFilter;
        this.d = em1Var;
        Paint paint = (Paint) this.b;
        if (em1Var != null) {
            colorFilter = em1Var.a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public void r(int i) {
        boolean z;
        Paint paint = (Paint) this.b;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        paint.setFilterBitmap(!z);
    }

    public void s(zj zjVar) {
        PathEffect pathEffect;
        Paint paint = (Paint) this.b;
        if (zjVar != null) {
            pathEffect = zjVar.a;
        } else {
            pathEffect = null;
        }
        paint.setPathEffect(pathEffect);
        this.e = zjVar;
    }

    public void t(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public void u(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.b;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void v(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.b;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void w(float f) {
        ((Paint) this.b).setStrokeWidth(f);
    }

    public void x(int i) {
        Paint.Style style;
        Paint paint = (Paint) this.b;
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    @Override // defpackage.g4a
    public void d(lac lacVar, t94 t94Var, zc7 zc7Var) {
    }

    public ljc(Paint paint) {
        this.b = paint;
        this.a = 3;
    }

    public ljc(x56 x56Var, byte[] bArr, int i) {
        this.b = x56Var;
        this.c = bArr;
        this.a = i;
        this.d = new LinkedHashMap();
        this.e = new byte[Parser.ARGC_LIMIT];
    }

    public ljc(ao9[] ao9VarArr, c14[] c14VarArr, tjc tjcVar, Object obj) {
        wq9.s(ao9VarArr.length == c14VarArr.length);
        this.b = ao9VarArr;
        this.c = (c14[]) c14VarArr.clone();
        this.d = tjcVar;
        this.e = obj;
        this.a = ao9VarArr.length;
    }

    public ljc(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        xoe.g();
        a(glCreateProgram, 35633, str);
        a(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        xoe.h("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.b = new zj1[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                } else if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            zj1 zj1Var = new zj1(26);
            ((zj1[]) this.b)[i] = zj1Var;
            ((HashMap) this.d).put(str3, zj1Var);
        }
        this.e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.c = new tn3[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                } else if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                } else {
                    i8++;
                }
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            tn3 tn3Var = new tn3(26);
            ((tn3[]) this.c)[i5] = tn3Var;
            ((HashMap) this.e).put(str4, tn3Var);
        }
        xoe.g();
    }

    public ljc(at7 at7Var, l97 l97Var, byte[] bArr, nt5[] nt5VarArr, int i) {
        this.b = at7Var;
        this.c = l97Var;
        this.d = bArr;
        this.e = nt5VarArr;
        this.a = i;
    }

    public ljc(toc tocVar, int i) {
        this.e = tocVar;
        this.b = new ea1(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i;
    }
}
