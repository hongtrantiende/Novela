package defpackage;

import android.os.Build;
import android.text.TextPaint;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rse  reason: default package */
/* loaded from: classes.dex */
public abstract class rse {
    public static final tu1 a = new tu1(new cv1(13), false, 677299778);
    public static final tu1 b = new tu1(new dv1(0), false, 249384287);
    public static final tu1 c = new tu1(new dv1(1), false, -1200113822);
    public static final tu1 d = new tu1(new cv1(14), false, 1161911270);
    public static final tu1 e = new tu1(new cv1(15), false, -586991974);
    public static final ye3 f = new ye3(4);
    public static final ye3 g = new ye3(5);
    public static final pg2 h = new pg2(9);
    public static final yy9 i = new yy9(new mx8(16), new wr9(8));

    public static final void a(h2a h2aVar, nq7 nq7Var, rv4 rv4Var, int i2) {
        boolean z;
        rv4Var.g0(1187362963);
        int i3 = i2 & 1;
        if (i3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!rv4Var.U(i3, z)) {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z82(h2aVar, nq7Var, i2, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9b, y26] */
    public static b9b b() {
        return new y26(null);
    }

    public static final void c(vt4 vt4Var, vt4 vt4Var2, boolean z, e3a e3aVar, nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        rv4 rv4Var2;
        boolean z3;
        boolean z4;
        int i9;
        float f2;
        int i10;
        boolean z5;
        int i11;
        int i12;
        float f3;
        int i13;
        int i14;
        boolean z6;
        boolean z7;
        boolean z8;
        float f4;
        float f5;
        e3a e3aVar2 = e3aVar;
        Object obj = lu4Var;
        vt4Var.getClass();
        vt4Var2.getClass();
        e3aVar2.getClass();
        float f6 = e3aVar2.d;
        int i15 = e3aVar2.a;
        float f7 = e3aVar2.b;
        nq7Var.getClass();
        rv4Var.g0(-670190828);
        if (rv4Var.h(vt4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i16 = i2 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i17 = i16 | i4;
        if (rv4Var.g(z)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i18 = i17 | i5;
        if (rv4Var.f(e3aVar2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i19 = i18 | i6;
        if (rv4Var.f(nq7Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i20 = i19 | i7;
        if (rv4Var.h(obj)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i21 = i20 | i8;
        if ((74899 & i21) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i21 & 1, z2)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.valueOf(z));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            Boolean valueOf = Boolean.valueOf(z);
            if ((i21 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i22 = i21 & 7168;
            if (i22 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z3 | z4;
            Object P2 = rv4Var.P();
            if (!z9 && P2 != lh9Var) {
                i9 = i15;
                f2 = f7;
                i10 = i22;
            } else {
                i9 = i15;
                f2 = f7;
                i10 = i22;
                P2 = new lq0(5, (m42) null, aw7Var, e3aVar, z);
                e3aVar2 = e3aVar;
                rv4Var.o0(P2);
            }
            yte.g((lu4) P2, rv4Var, valueOf);
            int ordinal = e3aVar2.g.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    z5 = ((Boolean) aw7Var.getValue()).booleanValue();
                } else {
                    xk5.o();
                    return;
                }
            } else {
                z5 = true;
            }
            float f8 = 1.0f;
            if (!z) {
                f8 = 0.0f;
            }
            if (z) {
                i11 = 75;
            } else {
                i11 = 500;
            }
            if (z) {
                i12 = 0;
            } else {
                i12 = i9;
            }
            yya b2 = nq.b(f8, tte.x(i11, i12, null, 4), "scrollbar alpha value", rv4Var, 3072, 20);
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 14.0f;
            }
            if (z) {
                i13 = 75;
            } else {
                i13 = 500;
            }
            if (z) {
                i14 = 0;
            } else {
                i14 = i9;
            }
            rv4Var2 = rv4Var;
            yya a2 = nq.a(f3, tte.x(i13, i14, null, 4), "scrollbar displacement value", rv4Var2, 384, 8);
            if ((i21 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i21 & Token.ASSIGN_MOD) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z10 = z6 | z7;
            if (i10 == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean f9 = z10 | z8 | rv4Var2.f(a2);
            Object P3 = rv4Var2.P();
            if (f9 || P3 == lh9Var) {
                P3 = new t5d(vt4Var, vt4Var2, e3aVar, a2);
                rv4Var2.o0(P3);
            }
            b37 b37Var = (b37) P3;
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            kq7 kq7Var = kq7.a;
            nq7 p = lye.p(rv4Var2, kq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, b37Var);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf2 = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf2);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            f3a f3aVar = e3aVar.f;
            if (f3aVar == f3a.a) {
                f4 = f2;
            } else {
                f4 = 0.0f;
            }
            if (f3aVar == f3a.b) {
                f5 = f2;
            } else {
                f5 = 0.0f;
            }
            fu0.a(p17.o(nmd.v(pna.s(tte.k(lpe.m(zbe.C(kq7Var, f4, nae.e, f5, nae.e, 10), ((Number) b2.getValue()).floatValue()), e3aVar.c), f6), e3aVar.e, lre.g), "scrollbarThumb"), rv4Var2, 0);
            if (lu4Var == null) {
                rv4Var2.e0(1979123914);
                fu0.a(kq7Var, rv4Var2, 6);
                rv4Var2.q(false);
                obj = lu4Var;
            } else {
                rv4Var2.e0(1979125366);
                nq7 m = lpe.m(p17.o(kq7Var, "scrollbarIndicator"), ((Number) b2.getValue()).floatValue());
                b37 d2 = fu0.d(kh5.a, false);
                int hashCode2 = Long.hashCode(rv4Var2.T);
                xt8 l2 = rv4Var2.l();
                nq7 p2 = lye.p(rv4Var2, m);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar, rv4Var2, d2);
                jce.F(npVar2, rv4Var2, l2);
                s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                jce.F(npVar4, rv4Var2, p2);
                obj = lu4Var;
                hl5.u((i21 >> 15) & 14, obj, rv4Var2, true, false);
            }
            nq7 s = pna.s(pna.c(kq7Var, 1.0f), (f2 * 2.0f) + f6);
            if (z5) {
                s = s.a0(nq7Var);
            }
            fu0.a(p17.o(s, "scrollbarContainer"), rv4Var2, 0);
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ds1(vt4Var, vt4Var2, z, e3aVar, nq7Var, obj, i2);
        }
    }

    public static nq7 e(nq7 nq7Var, yf0 yf0Var, vt4 vt4Var, xt4 xt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var2, xt4 xt4Var3, int i2) {
        vt4 vt4Var5;
        vt4 vt4Var6;
        vt4 vt4Var7;
        xt4 xt4Var4;
        nq7 nq7Var2;
        nq7 nq7Var3;
        nq7 nq7Var4;
        if ((i2 & 8) != 0) {
            vt4Var5 = f;
        } else {
            vt4Var5 = vt4Var2;
        }
        if ((i2 & 16) != 0) {
            vt4Var6 = g;
        } else {
            vt4Var6 = vt4Var3;
        }
        if ((i2 & 32) != 0) {
            vt4Var7 = null;
        } else {
            vt4Var7 = vt4Var4;
        }
        if ((i2 & 64) != 0) {
            xt4Var4 = null;
        } else {
            xt4Var4 = xt4Var2;
        }
        nq7Var.getClass();
        yf0Var.getClass();
        vt4Var.getClass();
        xt4Var.getClass();
        a52 a52Var = new a52(vt4Var);
        nq7 nq7Var5 = kq7.a;
        if (xt4Var4 != null) {
            nq7Var2 = axe.k(nq7Var5, xt4Var4);
        } else {
            nq7Var2 = nq7Var5;
        }
        nq7 a0 = nq7Var.a0(nq7Var2);
        if (vt4Var7 != null) {
            nq7Var3 = new zv5(a52Var, vt4Var7);
        } else {
            nq7Var3 = nq7Var5;
        }
        nq7 a02 = a0.a0(nq7Var3);
        if (vt4Var6 != null) {
            nq7Var4 = new oea(a52Var, vt4Var6);
        } else {
            nq7Var4 = nq7Var5;
        }
        nq7 a03 = a02.a0(nq7Var4);
        if (vt4Var5 != null) {
            nq7Var5 = new e65(a52Var, vt4Var5);
        }
        return a03.a0(nq7Var5).a0(new rj3(yf0Var, a52Var, xt4Var, xt4Var4, h, xt4Var3));
    }

    public static String f(String str) {
        str.getClass();
        if (str.length() != 0) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt == '\"' || charAt == '<' || charAt == '>' || charAt == '&' || charAt == '\'') {
                    StringBuilder sb = new StringBuilder(str.length() + 8);
                    int length2 = str.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        char charAt2 = str.charAt(i3);
                        if (charAt2 != '\"') {
                            if (charAt2 != '<') {
                                if (charAt2 != '>') {
                                    if (charAt2 != '&') {
                                        if (charAt2 != '\'') {
                                            sb.append(charAt2);
                                        } else {
                                            sb.append("&#39;");
                                        }
                                    } else {
                                        sb.append("&amp;");
                                    }
                                } else {
                                    sb.append("&gt;");
                                }
                            } else {
                                sb.append("&lt;");
                            }
                        } else {
                            sb.append("&quot;");
                        }
                    }
                    return sb.toString();
                }
            }
            return str;
        }
        return str;
    }

    public static void g(tj3 tj3Var, float f2, float f3, boolean z, int i2) {
        float[] fArr;
        sv9 a2;
        boolean z2;
        float a3;
        float a4;
        float a5;
        float a6;
        if ((i2 & 8) != 0) {
            z = false;
        }
        tj3Var.getClass();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33 && f2 > nae.e && f3 > nae.e) {
            float f4 = tj3Var.e;
            if (f4 > nae.e) {
                float f5 = f4 - f2;
                if (f5 < nae.e) {
                    f5 = 0.0f;
                }
                tj3Var.e = f5;
            }
            wea weaVar = (wea) ((vt4) tj3Var.D.L.b).invoke();
            if (weaVar instanceof v72) {
                long j = tj3Var.c;
                float c2 = dna.c(j) / 2.0f;
                if (tj3Var.d == tc6.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    a3 = ((v72) weaVar).a.a(j, tj3Var);
                } else {
                    a3 = ((v72) weaVar).b.a(j, tj3Var);
                }
                if (z2) {
                    a4 = ((v72) weaVar).b.a(j, tj3Var);
                } else {
                    a4 = ((v72) weaVar).a.a(j, tj3Var);
                }
                if (z2) {
                    a5 = ((v72) weaVar).c.a(j, tj3Var);
                } else {
                    a5 = ((v72) weaVar).d.a(j, tj3Var);
                }
                if (z2) {
                    a6 = ((v72) weaVar).d.a(j, tj3Var);
                } else {
                    a6 = ((v72) weaVar).c.a(j, tj3Var);
                }
                if (a3 > c2) {
                    a3 = c2;
                }
                if (a4 > c2) {
                    a4 = c2;
                }
                if (a5 > c2) {
                    a5 = c2;
                }
                if (a6 <= c2) {
                    c2 = a6;
                }
                fArr = new float[]{a3, a4, a5, c2};
            } else {
                fArr = null;
            }
            if (fArr != null) {
                sf2 sf2Var = tj3Var.C;
                if (!z) {
                    a2 = sf2Var.a("Refraction", "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    return content.eval(refractedCoord);\n}");
                } else {
                    a2 = sf2Var.a("RefractionWithDispersion", "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\nuniform float chromaticAberration;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    float dispersionIntensity = chromaticAberration * ((centeredCoord.x * centeredCoord.y) / (halfSize.x * halfSize.y));\n    float2 dispersedCoord = d * grad * dispersionIntensity;\n\n    half4 color = half4(0.0);\n\n    half4 red = content.eval(refractedCoord + dispersedCoord);\n    color.r += red.r / 3.5;\n    color.a += red.a / 7.0;\n\n    half4 orange = content.eval(refractedCoord + dispersedCoord * (2.0 / 3.0));\n    color.r += orange.r / 3.5;\n    color.g += orange.g / 7.0;\n    color.a += orange.a / 7.0;\n\n    half4 yellow = content.eval(refractedCoord + dispersedCoord * (1.0 / 3.0));\n    color.r += yellow.r / 3.5;\n    color.g += yellow.g / 3.5;\n    color.a += yellow.a / 7.0;\n\n    half4 green = content.eval(refractedCoord);\n    color.g += green.g / 3.5;\n    color.a += green.a / 7.0;\n\n    half4 cyan = content.eval(refractedCoord - dispersedCoord * (1.0 / 3.0));\n    color.g += cyan.g / 3.5;\n    color.b += cyan.b / 3.0;\n    color.a += cyan.a / 7.0;\n\n    half4 blue = content.eval(refractedCoord - dispersedCoord * (2.0 / 3.0));\n    color.b += blue.b / 3.0;\n    color.a += blue.a / 7.0;\n\n    half4 purple = content.eval(refractedCoord - dispersedCoord);\n    color.r += purple.r / 7.0;\n    color.b += purple.b / 3.0;\n    color.a += purple.a / 7.0;\n\n    return color;\n}");
                }
                sl slVar = (sl) a2;
                slVar.c("size", Float.intBitsToFloat((int) (tj3Var.c >> 32)), Float.intBitsToFloat((int) (tj3Var.c & 4294967295L)));
                float f6 = -tj3Var.e;
                slVar.c("offset", f6, f6);
                slVar.d(fArr);
                slVar.b("refractionHeight", f2);
                slVar.b("refractionAmount", -f3);
                slVar.b("depthEffect", nae.e);
                if (z) {
                    slVar.b("chromaticAberration", 1.0f);
                }
                hl b2 = r4.b(a2);
                if (i3 >= 31) {
                    tj3Var.f = r4.c(tj3Var.f, b2);
                    return;
                }
                return;
            }
            xk5.q("Only RoundedRectangularShape or CornerBasedShape is supported in lens effects.");
        }
    }

    public static final void j(TextPaint textPaint, float f2) {
        if (!Float.isNaN(f2)) {
            if (f2 < nae.e) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f2 * 255.0f));
        }
    }

    public int h(int i2) {
        return 16 - (i2 % 16);
    }

    public int i(byte[] bArr) {
        return bArr.length - (bArr[bArr.length - 1] & 255);
    }

    public void d(byte[] bArr, int i2, int i3) {
    }
}
