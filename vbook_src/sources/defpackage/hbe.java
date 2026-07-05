package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hbe  reason: default package */
/* loaded from: classes3.dex */
public abstract class hbe implements yq2, fx1 {
    public static final tu1 a = new tu1(new rv1(16), false, -741016627);
    public static final tu1 b = new tu1(new rv1(17), false, 855325303);
    public static final tu1 c = new tu1(new rv1(18), false, 41799840);
    public static final tu1 d = new tu1(new rv1(19), false, -1562204033);

    /* JADX WARN: Removed duplicated region for block: B:221:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0831  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(defpackage.cg1 r53, defpackage.kj6 r54, final boolean r55, final java.lang.String r56, final java.lang.String r57, final boolean r58, defpackage.rh8 r59, final defpackage.nq7 r60, final defpackage.vt4 r61, final defpackage.xt4 r62, final defpackage.vt4 r63, final defpackage.vt4 r64, final defpackage.lu4 r65, final defpackage.xt4 r66, defpackage.vt4 r67, defpackage.vt4 r68, defpackage.vt4 r69, final defpackage.vt4 r70, final defpackage.xt4 r71, defpackage.rv4 r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 2235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbe.F(cg1, kj6, boolean, java.lang.String, java.lang.String, boolean, rh8, nq7, vt4, xt4, vt4, vt4, lu4, xt4, vt4, vt4, vt4, vt4, xt4, rv4, int, int):void");
    }

    public static final void G(String str, final cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        cz7 cz7Var2;
        pb2 pb2Var;
        pb2 pb2Var2;
        boolean z2;
        pb2 pb2Var3;
        String str2;
        boolean z3;
        aw7 aw7Var;
        aw7 aw7Var2;
        final aw7 aw7Var3;
        aw7 aw7Var4;
        aw7 aw7Var5;
        Object obj;
        Object obj2;
        boolean z4;
        d0d d0dVar;
        int i4;
        kn6 kn6Var;
        boolean z5;
        kn6 kn6Var2;
        String str3;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(7097242);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            sdd sddVar = (sdd) rv4Var.j(idd.b);
            if (sddVar == null) {
                rv4Var.e0(1368428688);
                sddVar = kv6.a(rv4Var);
            } else {
                rv4Var.e0(1368426673);
            }
            rv4Var.q(false);
            if (sddVar != null) {
                if (sddVar instanceof y35) {
                    pb2Var = ((y35) sddVar).f();
                } else {
                    pb2Var = ob2.b;
                }
                d1d d1dVar = (d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var, o96.a(rv4Var), null));
                sdd a2 = kv6.a(rv4Var);
                if (a2 != null) {
                    if (a2 instanceof y35) {
                        pb2Var2 = ((y35) a2).f();
                    } else {
                        pb2Var2 = ob2.b;
                    }
                    d0d d0dVar2 = (d0d) ((fdd) voe.z(cm9.a(d0d.class), a2.i(), null, pb2Var2, o96.a(rv4Var), null));
                    if ((i6 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P = rv4Var.P();
                    Object obj3 = ax1.a;
                    if (z2 || P == obj3) {
                        P = new op0(str, 4);
                        rv4Var.o0(P);
                    }
                    vt4 vt4Var = (vt4) P;
                    sdd a3 = kv6.a(rv4Var);
                    if (a3 != null) {
                        if (a3 instanceof y35) {
                            pb2Var3 = ((y35) a3).f();
                        } else {
                            pb2Var3 = ob2.b;
                        }
                        pb2 pb2Var4 = pb2Var3;
                        q0a a4 = o96.a(rv4Var);
                        gi1 a5 = cm9.a(ng1.class);
                        final ng1 ng1Var = (ng1) ((fdd) voe.z(a5, a3.i(), eub.o(a5.f(), "-", str), pb2Var4, a4, vt4Var));
                        final aw7 z6 = jsc.z(d1dVar.f, rv4Var);
                        final aw7 z7 = jsc.z(d0dVar2.d, rv4Var);
                        aw7 z8 = jsc.z(ng1Var.C, rv4Var);
                        boolean equals = str.equals("chat");
                        rv4Var.e0(-1769464469);
                        String str4 = ((cg1) z8.getValue()).h;
                        if (k4b.j0(str4)) {
                            str4 = yqe.A((y3b) f3b.I.getValue(), rv4Var);
                        }
                        rv4Var.q(false);
                        Object P2 = rv4Var.P();
                        if (P2 == obj3) {
                            P2 = yae.z(Boolean.FALSE);
                            rv4Var.o0(P2);
                        }
                        final aw7 aw7Var6 = (aw7) P2;
                        Object P3 = rv4Var.P();
                        if (P3 == obj3) {
                            P3 = yae.z(Boolean.FALSE);
                            rv4Var.o0(P3);
                        }
                        aw7 aw7Var7 = (aw7) P3;
                        Object P4 = rv4Var.P();
                        if (P4 == obj3) {
                            P4 = yae.z(Boolean.FALSE);
                            rv4Var.o0(P4);
                        }
                        final aw7 aw7Var8 = (aw7) P4;
                        Object P5 = rv4Var.P();
                        if (P5 == obj3) {
                            P5 = yae.z(Boolean.FALSE);
                            rv4Var.o0(P5);
                        }
                        final aw7 aw7Var9 = (aw7) P5;
                        Object P6 = rv4Var.P();
                        if (P6 == obj3) {
                            P6 = yae.z(Boolean.FALSE);
                            rv4Var.o0(P6);
                        }
                        aw7 aw7Var10 = (aw7) P6;
                        Object P7 = rv4Var.P();
                        if (P7 == obj3) {
                            P7 = yae.z(null);
                            rv4Var.o0(P7);
                        }
                        final aw7 aw7Var11 = (aw7) P7;
                        Object P8 = rv4Var.P();
                        if (P8 == obj3) {
                            P8 = yae.z("");
                            rv4Var.o0(P8);
                        }
                        aw7 aw7Var12 = (aw7) P8;
                        Object P9 = rv4Var.P();
                        if (P9 == obj3) {
                            P9 = yae.z(null);
                            rv4Var.o0(P9);
                        }
                        aw7 aw7Var13 = (aw7) P9;
                        Object[] objArr = new Object[0];
                        Object P10 = rv4Var.P();
                        if (P10 == obj3) {
                            str2 = str4;
                            P10 = new cd1(4);
                            rv4Var.o0(P10);
                        } else {
                            str2 = str4;
                        }
                        Object j = zpe.j(objArr, (vt4) P10, rv4Var, 384);
                        Object P11 = rv4Var.P();
                        if (P11 == obj3) {
                            P11 = new s7(aw7Var13, 25);
                            rv4Var.o0(P11);
                        }
                        final kd4 v = w92.v(av8.a, (xt4) P11, rv4Var, 54);
                        Boolean bool = (Boolean) aw7Var7.getValue();
                        bool.getClass();
                        String str5 = ((cg1) z8.getValue()).h;
                        boolean f = rv4Var.f(z8);
                        Object P12 = rv4Var.P();
                        if (f || P12 == obj3) {
                            z3 = equals;
                            Object caVar = new ca(aw7Var7, z8, aw7Var12, aw7Var13, null, 2);
                            aw7Var = aw7Var10;
                            aw7Var2 = aw7Var7;
                            aw7Var3 = z8;
                            aw7Var4 = aw7Var12;
                            aw7Var5 = aw7Var13;
                            rv4Var.o0(caVar);
                            obj = caVar;
                        } else {
                            obj = P12;
                            z3 = equals;
                            aw7Var = aw7Var10;
                            aw7Var3 = z8;
                            aw7Var2 = aw7Var7;
                            aw7Var4 = aw7Var12;
                            aw7Var5 = aw7Var13;
                        }
                        yte.h(bool, str5, (lu4) obj, rv4Var);
                        Boolean bool2 = (Boolean) aw7Var8.getValue();
                        bool2.getClass();
                        boolean f2 = rv4Var.f(j) | rv4Var.f(ng1Var);
                        Object P13 = rv4Var.P();
                        if (!f2 && P13 != obj3) {
                            obj2 = j;
                        } else {
                            obj2 = j;
                            P13 = new ol(ng1Var, aw7Var8, obj2, (m42) null, 7);
                            rv4Var.o0(P13);
                        }
                        yte.g((lu4) P13, rv4Var, bool2);
                        s02 s02Var = d0dVar2.e;
                        int i7 = i6 & Token.ASSIGN_MOD;
                        if (i7 == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Object P14 = rv4Var.P();
                        if (!z4 && P14 != obj3) {
                            d0dVar = d0dVar2;
                            i4 = 0;
                            kn6Var = null;
                        } else {
                            d0dVar = d0dVar2;
                            i4 = 0;
                            kn6Var = null;
                            P14 = new ve1(cz7Var, aw7Var11, (m42) null, 0);
                            rv4Var.o0(P14);
                        }
                        jye.b(s02Var, kn6Var, (mu4) P14, rv4Var, i4);
                        final kj6 a6 = mj6.a(i4, rv4Var, i4, 3);
                        final rz4 A = cae.A(rv4Var);
                        s02 s02Var2 = ng1Var.D;
                        boolean f3 = rv4Var.f(a6);
                        if (i7 == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean f4 = f3 | z5 | rv4Var.f(A);
                        Object P15 = rv4Var.P();
                        if (!f4 && P15 != obj3) {
                            kn6Var2 = null;
                        } else {
                            kn6Var2 = null;
                            P15 = new we1(a6, cz7Var, A, (m42) null);
                            rv4Var.o0(P15);
                        }
                        jye.b(s02Var2, kn6Var2, (mu4) P15, rv4Var, 0);
                        if (z3) {
                            rv4Var.e0(983185824);
                            String A2 = yqe.A((y3b) k2b.t.getValue(), rv4Var);
                            rv4Var.q(false);
                            str3 = A2;
                        } else {
                            rv4Var.e0(983262208);
                            rv4Var.q(false);
                            str3 = str2;
                        }
                        tu1 E = jce.E(-55992554, new p7(cz7Var, 7), rv4Var);
                        tu1 E2 = jce.E(-877189121, new a1a(z3, aw7Var3, aw7Var6, 2), rv4Var);
                        final aw7 aw7Var14 = aw7Var2;
                        final aw7 aw7Var15 = obj2;
                        final String str6 = str2;
                        final aw7 aw7Var16 = aw7Var4;
                        final aw7 aw7Var17 = aw7Var5;
                        final d0d d0dVar3 = d0dVar;
                        final aw7 aw7Var18 = aw7Var;
                        nu4 nu4Var = new nu4() { // from class: re1
                            @Override // defpackage.nu4
                            public final Object h(Object obj4, Object obj5, Object obj6, Object obj7) {
                                boolean z9;
                                Object obj8;
                                cg1 cg1Var;
                                Object obj9;
                                vt4 vt4Var2;
                                vt4 vt4Var3;
                                aw7 aw7Var19;
                                boolean z10;
                                aw7 aw7Var20;
                                aw7 aw7Var21;
                                vt4 vt4Var4;
                                int i8;
                                rh8 rh8Var = (rh8) obj5;
                                rv4 rv4Var2 = (rv4) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                ((ou0) obj4).getClass();
                                rh8Var.getClass();
                                if ((intValue & 48) == 0) {
                                    if (rv4Var2.f(rh8Var)) {
                                        i8 = 32;
                                    } else {
                                        i8 = 16;
                                    }
                                    intValue |= i8;
                                }
                                if ((intValue & Token.TARGET) != 144) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (rv4Var2.U(intValue & 1, z9)) {
                                    ze4 ze4Var = pna.c;
                                    b37 d2 = fu0.d(kh5.a, false);
                                    int hashCode = Long.hashCode(rv4Var2.T);
                                    xt8 l = rv4Var2.l();
                                    nq7 p = lye.p(rv4Var2, ze4Var);
                                    rw1.k.getClass();
                                    vt4 vt4Var5 = qw1.b;
                                    rv4Var2.i0();
                                    if (rv4Var2.S) {
                                        rv4Var2.k(vt4Var5);
                                    } else {
                                        rv4Var2.r0();
                                    }
                                    jce.F(qw1.f, rv4Var2, d2);
                                    jce.F(qw1.e, rv4Var2, l);
                                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                                    jce.C(qw1.h, rv4Var2);
                                    jce.F(qw1.d, rv4Var2, p);
                                    aw7 aw7Var22 = aw7Var3;
                                    cg1 cg1Var2 = (cg1) aw7Var22.getValue();
                                    yya yyaVar = z6;
                                    boolean z11 = ((y0d) yyaVar.getValue()).a;
                                    String str7 = ((y0d) yyaVar.getValue()).c;
                                    String str8 = ((y0d) yyaVar.getValue()).h;
                                    cz7 cz7Var3 = cz7Var;
                                    boolean f5 = rv4Var2.f(cz7Var3);
                                    Object P16 = rv4Var2.P();
                                    Object obj10 = ax1.a;
                                    if (f5 || P16 == obj10) {
                                        P16 = new n7(cz7Var3, 12);
                                        rv4Var2.o0(P16);
                                    }
                                    vt4 vt4Var6 = (vt4) P16;
                                    boolean f6 = rv4Var2.f(cz7Var3);
                                    Object P17 = rv4Var2.P();
                                    if (f6 || P17 == obj10) {
                                        P17 = new n7(cz7Var3, 9);
                                        rv4Var2.o0(P17);
                                    }
                                    vt4 vt4Var7 = (vt4) P17;
                                    boolean f7 = rv4Var2.f(cz7Var3);
                                    Object P18 = rv4Var2.P();
                                    if (f7 || P18 == obj10) {
                                        P18 = new n7(cz7Var3, 10);
                                        rv4Var2.o0(P18);
                                    }
                                    vt4 vt4Var8 = (vt4) P18;
                                    Object obj11 = ng1Var;
                                    boolean f8 = rv4Var2.f(obj11);
                                    int i9 = intValue;
                                    Object P19 = rv4Var2.P();
                                    if (f8 || P19 == obj10) {
                                        P19 = new v7(0, obj11, ng1.class, "loadNewMessages", "loadNewMessages()V", 0, 7);
                                        rv4Var2.o0(P19);
                                    }
                                    vt4 vt4Var9 = (vt4) ((i76) P19);
                                    boolean f9 = rv4Var2.f(obj11);
                                    Object P20 = rv4Var2.P();
                                    if (f9 || P20 == obj10) {
                                        P20 = new v7(0, obj11, ng1.class, "reloadMessages", "reloadMessages()V", 0, 8);
                                        rv4Var2.o0(P20);
                                    }
                                    vt4 vt4Var10 = (vt4) ((i76) P20);
                                    boolean f10 = rv4Var2.f(obj11);
                                    Object P21 = rv4Var2.P();
                                    if (f10 || P21 == obj10) {
                                        P21 = new v7(0, obj11, ng1.class, "loadMoreMessages", "loadMoreMessages()V", 0, 9);
                                        rv4Var2.o0(P21);
                                    }
                                    vt4 vt4Var11 = (vt4) ((i76) P21);
                                    boolean f11 = rv4Var2.f(obj11);
                                    Object P22 = rv4Var2.P();
                                    if (f11 || P22 == obj10) {
                                        P22 = new m0(1, obj11, ng1.class, "addQuote", "addQuote(J)V", 0, 9);
                                        rv4Var2.o0(P22);
                                    }
                                    xt4 xt4Var = (xt4) ((i76) P22);
                                    boolean f12 = rv4Var2.f(obj11);
                                    Object P23 = rv4Var2.P();
                                    if (f12 || P23 == obj10) {
                                        P23 = new v7(0, obj11, ng1.class, "removeQuote", "removeQuote()V", 0, 10);
                                        rv4Var2.o0(P23);
                                    }
                                    vt4 vt4Var12 = (vt4) ((i76) P23);
                                    boolean f13 = rv4Var2.f(obj11);
                                    Object P24 = rv4Var2.P();
                                    if (f13 || P24 == obj10) {
                                        P24 = new v7(0, obj11, ng1.class, "resetUnreadNewMessage", "resetUnreadNewMessage()V", 0, 11);
                                        rv4Var2.o0(P24);
                                    }
                                    vt4 vt4Var13 = (vt4) ((i76) P24);
                                    boolean f14 = rv4Var2.f(obj11);
                                    Object P25 = rv4Var2.P();
                                    if (f14 || P25 == obj10) {
                                        P25 = new xe1(2, obj11, ng1.class, "sendChat", "sendChat(Ljava/lang/String;Ljava/util/List;)V", 0, 0);
                                        rv4Var2.o0(P25);
                                    }
                                    lu4 lu4Var = (lu4) ((i76) P25);
                                    boolean f15 = rv4Var2.f(obj11);
                                    Object P26 = rv4Var2.P();
                                    if (f15 || P26 == obj10) {
                                        P26 = new m0(1, obj11, ng1.class, "handleLink", "handleLink(Ljava/lang/String;)V", 0, 6);
                                        rv4Var2.o0(P26);
                                    }
                                    xt4 xt4Var2 = (xt4) ((i76) P26);
                                    boolean f16 = rv4Var2.f(obj11);
                                    Object P27 = rv4Var2.P();
                                    if (!f16 && P27 != obj10) {
                                        obj8 = obj11;
                                    } else {
                                        obj8 = obj11;
                                        P27 = new v7(0, obj8, ng1.class, "joinConversation", "joinConversation()V", 0, 5);
                                        rv4Var2.o0(P27);
                                    }
                                    vt4 vt4Var14 = (vt4) ((i76) P27);
                                    Object P28 = rv4Var2.P();
                                    aw7 aw7Var23 = aw7Var11;
                                    if (P28 == obj10) {
                                        cg1Var = cg1Var2;
                                        P28 = new s7(aw7Var23, 23);
                                        rv4Var2.o0(P28);
                                    } else {
                                        cg1Var = cg1Var2;
                                    }
                                    cg1 cg1Var3 = cg1Var;
                                    Object obj12 = obj8;
                                    hbe.J(cg1Var3, kj6.this, z11, str7, str8, rh8Var, ze4Var, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, xt4Var, vt4Var12, vt4Var13, lu4Var, xt4Var2, vt4Var14, (xt4) P28, rv4Var2, ((i9 << 12) & 458752) | 1572864);
                                    cae.f(A, rv4Var2, 0);
                                    aw7 aw7Var24 = aw7Var6;
                                    boolean booleanValue = ((Boolean) aw7Var24.getValue()).booleanValue();
                                    cg1 cg1Var4 = (cg1) aw7Var22.getValue();
                                    Object P29 = rv4Var2.P();
                                    if (P29 == obj10) {
                                        P29 = new s7(aw7Var24, 24);
                                        rv4Var2.o0(P29);
                                    }
                                    xt4 xt4Var3 = (xt4) P29;
                                    Object P30 = rv4Var2.P();
                                    aw7 aw7Var25 = aw7Var14;
                                    if (P30 == obj10) {
                                        P30 = new he1(aw7Var24, aw7Var25, 0);
                                        rv4Var2.o0(P30);
                                    }
                                    vt4 vt4Var15 = (vt4) P30;
                                    Object P31 = rv4Var2.P();
                                    final aw7 aw7Var26 = aw7Var8;
                                    if (P31 == obj10) {
                                        P31 = new he1(aw7Var24, aw7Var26, 1);
                                        rv4Var2.o0(P31);
                                    }
                                    vt4 vt4Var16 = (vt4) P31;
                                    Object P32 = rv4Var2.P();
                                    final aw7 aw7Var27 = aw7Var9;
                                    if (P32 == obj10) {
                                        P32 = new he1(aw7Var24, aw7Var27, 2);
                                        rv4Var2.o0(P32);
                                    }
                                    vt4 vt4Var17 = (vt4) P32;
                                    Object P33 = rv4Var2.P();
                                    final aw7 aw7Var28 = aw7Var18;
                                    if (P33 == obj10) {
                                        P33 = new he1(aw7Var24, aw7Var28, 3);
                                        rv4Var2.o0(P33);
                                    }
                                    vt4 vt4Var18 = (vt4) P33;
                                    boolean f17 = rv4Var2.f(obj12);
                                    Object P34 = rv4Var2.P();
                                    if (!f17 && P34 != obj10) {
                                        obj9 = obj12;
                                    } else {
                                        P34 = new m0(1, obj12, ng1.class, "kickConversationMember", "kickConversationMember(Ljava/lang/String;)V", 0, 7);
                                        obj9 = obj12;
                                        rv4Var2.o0(P34);
                                    }
                                    xt4 xt4Var4 = (xt4) ((i76) P34);
                                    Object P35 = rv4Var2.P();
                                    if (P35 == obj10) {
                                        vt4Var2 = vt4Var17;
                                        vt4Var3 = vt4Var18;
                                        aw7Var19 = aw7Var23;
                                        P35 = new pr0(aw7Var24, aw7Var19, 1);
                                        rv4Var2.o0(P35);
                                    } else {
                                        vt4Var2 = vt4Var17;
                                        vt4Var3 = vt4Var18;
                                        aw7Var19 = aw7Var23;
                                    }
                                    aw7 aw7Var29 = aw7Var19;
                                    hma.a(booleanValue, cg1Var4, null, xt4Var3, vt4Var15, vt4Var16, vt4Var2, vt4Var3, xt4Var4, (xt4) P35, rv4Var2, 819686400);
                                    bzc bzcVar = (bzc) aw7Var29.getValue();
                                    String str9 = ((y0d) yyaVar.getValue()).b;
                                    if (((bzc) aw7Var29.getValue()) != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    boolean z12 = ((c0d) z7.getValue()).a;
                                    Object P36 = rv4Var2.P();
                                    if (P36 == obj10) {
                                        P36 = new s7(aw7Var29, 29);
                                        rv4Var2.o0(P36);
                                    }
                                    xt4 xt4Var5 = (xt4) P36;
                                    Object obj13 = d0dVar3;
                                    boolean f18 = rv4Var2.f(obj13);
                                    Object P37 = rv4Var2.P();
                                    if (f18 || P37 == obj10) {
                                        P37 = new u0(obj13, 12);
                                        rv4Var2.o0(P37);
                                    }
                                    npe.h(bzcVar, str9, z10, z12, xt4Var5, (xt4) P37, rv4Var2, 24584);
                                    boolean booleanValue2 = ((Boolean) aw7Var25.getValue()).booleanValue();
                                    aw7 aw7Var30 = aw7Var16;
                                    String str10 = (String) aw7Var30.getValue();
                                    String str11 = ((cg1) aw7Var22.getValue()).i;
                                    aw7 aw7Var31 = aw7Var17;
                                    f76 f76Var = (f76) aw7Var31.getValue();
                                    boolean z13 = ((cg1) aw7Var22.getValue()).v;
                                    Object P38 = rv4Var2.P();
                                    if (P38 == obj10) {
                                        P38 = new s7(aw7Var25, 17);
                                        rv4Var2.o0(P38);
                                    }
                                    xt4 xt4Var6 = (xt4) P38;
                                    Object P39 = rv4Var2.P();
                                    if (P39 == obj10) {
                                        aw7Var20 = aw7Var25;
                                        P39 = new s7(aw7Var30, 18);
                                        rv4Var2.o0(P39);
                                    } else {
                                        aw7Var20 = aw7Var25;
                                    }
                                    xt4 xt4Var7 = (xt4) P39;
                                    kd4 kd4Var = v;
                                    boolean f19 = rv4Var2.f(kd4Var);
                                    Object P40 = rv4Var2.P();
                                    if (!f19 && P40 != obj10) {
                                        aw7Var21 = aw7Var30;
                                    } else {
                                        aw7Var21 = aw7Var30;
                                        P40 = new fe1(kd4Var, 0);
                                        rv4Var2.o0(P40);
                                    }
                                    vt4 vt4Var19 = (vt4) P40;
                                    final ng1 ng1Var2 = obj9;
                                    boolean f20 = rv4Var2.f(ng1Var2);
                                    Object P41 = rv4Var2.P();
                                    if (f20 || P41 == obj10) {
                                        P41 = new xw0((Object) ng1Var2, (Object) aw7Var20, (Object) aw7Var21, (Object) aw7Var31, 2);
                                        rv4Var2.o0(P41);
                                    }
                                    hma.g(booleanValue2, str10, str11, f76Var, z13, xt4Var6, xt4Var7, vt4Var19, (vt4) P41, rv4Var2, 1769472);
                                    boolean booleanValue3 = ((Boolean) aw7Var26.getValue()).booleanValue();
                                    cg1 cg1Var5 = (cg1) aw7Var22.getValue();
                                    final aw7 aw7Var32 = aw7Var15;
                                    jub jubVar = (jub) aw7Var32.getValue();
                                    nq7 a7 = pu0.a.a(kq7.a, kh5.b);
                                    Object P42 = rv4Var2.P();
                                    if (P42 == obj10) {
                                        P42 = new s7(aw7Var26, 19);
                                        rv4Var2.o0(P42);
                                    }
                                    xt4 xt4Var8 = (xt4) P42;
                                    boolean f21 = rv4Var2.f(aw7Var32);
                                    Object P43 = rv4Var2.P();
                                    if (f21 || P43 == obj10) {
                                        P43 = new s7(aw7Var32, 20);
                                        rv4Var2.o0(P43);
                                    }
                                    xt4 xt4Var9 = (xt4) P43;
                                    boolean f22 = rv4Var2.f(ng1Var2) | rv4Var2.f(aw7Var32);
                                    Object P44 = rv4Var2.P();
                                    if (f22 || P44 == obj10) {
                                        P44 = new vt4() { // from class: ge1
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i10 = r3;
                                                pvc pvcVar = pvc.a;
                                                aw7 aw7Var33 = aw7Var32;
                                                switch (i10) {
                                                    case 0:
                                                        ng1Var2.m(((jub) aw7Var33.getValue()).a.b);
                                                        return pvcVar;
                                                    case 1:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var3 = ng1Var2;
                                                        cza czaVar = ng1Var3.C;
                                                        Long U = r4b.U(ng1Var3.c);
                                                        if (U != null) {
                                                            long longValue = U.longValue();
                                                            List C0 = sl1.C0(((cg1) czaVar.getValue()).z);
                                                            if (!C0.isEmpty() && !((cg1) czaVar.getValue()).v) {
                                                                hk1 a8 = jdd.a(ng1Var3);
                                                                sw2 sw2Var = ab3.a;
                                                                ng1Var3.f(a8, ru2.c, new gg1(ng1Var3, longValue, C0, (m42) null));
                                                            }
                                                        }
                                                        return pvcVar;
                                                    case 2:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var4 = ng1Var2;
                                                        Long U2 = r4b.U(ng1Var4.c);
                                                        if (U2 != null) {
                                                            long longValue2 = U2.longValue();
                                                            if (!((cg1) ng1Var4.C.getValue()).v) {
                                                                hk1 a9 = jdd.a(ng1Var4);
                                                                sw2 sw2Var2 = ab3.a;
                                                                ng1Var4.f(a9, ru2.c, new fg1(ng1Var4, longValue2, null, 1));
                                                            }
                                                        }
                                                        return pvcVar;
                                                    default:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var5 = ng1Var2;
                                                        Long U3 = r4b.U(ng1Var5.c);
                                                        if (U3 != null) {
                                                            long longValue3 = U3.longValue();
                                                            if (!((cg1) ng1Var5.C.getValue()).v) {
                                                                hk1 a10 = jdd.a(ng1Var5);
                                                                sw2 sw2Var3 = ab3.a;
                                                                ng1Var5.f(a10, ru2.c, new fg1(ng1Var5, longValue3, null, 0));
                                                            }
                                                        }
                                                        return pvcVar;
                                                }
                                            }
                                        };
                                        rv4Var2.o0(P44);
                                    }
                                    vt4 vt4Var20 = (vt4) P44;
                                    boolean f23 = rv4Var2.f(ng1Var2);
                                    Object P45 = rv4Var2.P();
                                    if (f23 || P45 == obj10) {
                                        P45 = new v7(0, ng1Var2, ng1.class, "loadMoreInviteUsers", "loadMoreInviteUsers()V", 0, 6);
                                        rv4Var2.o0(P45);
                                    }
                                    vt4 vt4Var21 = (vt4) ((i76) P45);
                                    boolean f24 = rv4Var2.f(ng1Var2);
                                    Object P46 = rv4Var2.P();
                                    if (f24 || P46 == obj10) {
                                        P46 = new m0(1, ng1Var2, ng1.class, "toggleInviteUser", "toggleInviteUser(Ljava/lang/String;)V", 0, 8);
                                        rv4Var2.o0(P46);
                                    }
                                    xt4 xt4Var10 = (xt4) ((i76) P46);
                                    boolean f25 = rv4Var2.f(ng1Var2);
                                    Object P47 = rv4Var2.P();
                                    if (!f25 && P47 != obj10) {
                                        vt4Var4 = vt4Var21;
                                    } else {
                                        vt4Var4 = vt4Var21;
                                        P47 = new vt4() { // from class: ge1
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i10 = r3;
                                                pvc pvcVar = pvc.a;
                                                aw7 aw7Var33 = aw7Var26;
                                                switch (i10) {
                                                    case 0:
                                                        ng1Var2.m(((jub) aw7Var33.getValue()).a.b);
                                                        return pvcVar;
                                                    case 1:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var3 = ng1Var2;
                                                        cza czaVar = ng1Var3.C;
                                                        Long U = r4b.U(ng1Var3.c);
                                                        if (U != null) {
                                                            long longValue = U.longValue();
                                                            List C0 = sl1.C0(((cg1) czaVar.getValue()).z);
                                                            if (!C0.isEmpty() && !((cg1) czaVar.getValue()).v) {
                                                                hk1 a8 = jdd.a(ng1Var3);
                                                                sw2 sw2Var = ab3.a;
                                                                ng1Var3.f(a8, ru2.c, new gg1(ng1Var3, longValue, C0, (m42) null));
                                                            }
                                                        }
                                                        return pvcVar;
                                                    case 2:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var4 = ng1Var2;
                                                        Long U2 = r4b.U(ng1Var4.c);
                                                        if (U2 != null) {
                                                            long longValue2 = U2.longValue();
                                                            if (!((cg1) ng1Var4.C.getValue()).v) {
                                                                hk1 a9 = jdd.a(ng1Var4);
                                                                sw2 sw2Var2 = ab3.a;
                                                                ng1Var4.f(a9, ru2.c, new fg1(ng1Var4, longValue2, null, 1));
                                                            }
                                                        }
                                                        return pvcVar;
                                                    default:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var5 = ng1Var2;
                                                        Long U3 = r4b.U(ng1Var5.c);
                                                        if (U3 != null) {
                                                            long longValue3 = U3.longValue();
                                                            if (!((cg1) ng1Var5.C.getValue()).v) {
                                                                hk1 a10 = jdd.a(ng1Var5);
                                                                sw2 sw2Var3 = ab3.a;
                                                                ng1Var5.f(a10, ru2.c, new fg1(ng1Var5, longValue3, null, 0));
                                                            }
                                                        }
                                                        return pvcVar;
                                                }
                                            }
                                        };
                                        rv4Var2.o0(P47);
                                    }
                                    hma.h(booleanValue3, cg1Var5, jubVar, a7, xt4Var8, xt4Var9, vt4Var20, vt4Var4, xt4Var10, (vt4) P47, rv4Var2, 24576);
                                    boolean booleanValue4 = ((Boolean) aw7Var27.getValue()).booleanValue();
                                    String A3 = yqe.A((y3b) k2b.D.getValue(), rv4Var2);
                                    String str12 = str6;
                                    String B = yqe.B((y3b) k2b.E.getValue(), new Object[]{str12}, rv4Var2);
                                    boolean z14 = ((cg1) aw7Var22.getValue()).v;
                                    Object P48 = rv4Var2.P();
                                    if (P48 == obj10) {
                                        P48 = new s7(aw7Var27, 21);
                                        rv4Var2.o0(P48);
                                    }
                                    xt4 xt4Var11 = (xt4) P48;
                                    boolean f26 = rv4Var2.f(ng1Var2);
                                    Object P49 = rv4Var2.P();
                                    if (f26 || P49 == obj10) {
                                        P49 = new vt4() { // from class: ge1
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i10 = r3;
                                                pvc pvcVar = pvc.a;
                                                aw7 aw7Var33 = aw7Var27;
                                                switch (i10) {
                                                    case 0:
                                                        ng1Var2.m(((jub) aw7Var33.getValue()).a.b);
                                                        return pvcVar;
                                                    case 1:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var3 = ng1Var2;
                                                        cza czaVar = ng1Var3.C;
                                                        Long U = r4b.U(ng1Var3.c);
                                                        if (U != null) {
                                                            long longValue = U.longValue();
                                                            List C0 = sl1.C0(((cg1) czaVar.getValue()).z);
                                                            if (!C0.isEmpty() && !((cg1) czaVar.getValue()).v) {
                                                                hk1 a8 = jdd.a(ng1Var3);
                                                                sw2 sw2Var = ab3.a;
                                                                ng1Var3.f(a8, ru2.c, new gg1(ng1Var3, longValue, C0, (m42) null));
                                                            }
                                                        }
                                                        return pvcVar;
                                                    case 2:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var4 = ng1Var2;
                                                        Long U2 = r4b.U(ng1Var4.c);
                                                        if (U2 != null) {
                                                            long longValue2 = U2.longValue();
                                                            if (!((cg1) ng1Var4.C.getValue()).v) {
                                                                hk1 a9 = jdd.a(ng1Var4);
                                                                sw2 sw2Var2 = ab3.a;
                                                                ng1Var4.f(a9, ru2.c, new fg1(ng1Var4, longValue2, null, 1));
                                                            }
                                                        }
                                                        return pvcVar;
                                                    default:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var5 = ng1Var2;
                                                        Long U3 = r4b.U(ng1Var5.c);
                                                        if (U3 != null) {
                                                            long longValue3 = U3.longValue();
                                                            if (!((cg1) ng1Var5.C.getValue()).v) {
                                                                hk1 a10 = jdd.a(ng1Var5);
                                                                sw2 sw2Var3 = ab3.a;
                                                                ng1Var5.f(a10, ru2.c, new fg1(ng1Var5, longValue3, null, 0));
                                                            }
                                                        }
                                                        return pvcVar;
                                                }
                                            }
                                        };
                                        rv4Var2.o0(P49);
                                    }
                                    hma.b(booleanValue4, A3, B, z14, xt4Var11, (vt4) P49, rv4Var2, 24576);
                                    boolean booleanValue5 = ((Boolean) aw7Var28.getValue()).booleanValue();
                                    String A4 = yqe.A((y3b) o2b.y.getValue(), rv4Var2);
                                    String B2 = yqe.B((y3b) k2b.y.getValue(), new Object[]{str12}, rv4Var2);
                                    boolean z15 = ((cg1) aw7Var22.getValue()).v;
                                    Object P50 = rv4Var2.P();
                                    if (P50 == obj10) {
                                        P50 = new s7(aw7Var28, 22);
                                        rv4Var2.o0(P50);
                                    }
                                    xt4 xt4Var12 = (xt4) P50;
                                    boolean f27 = rv4Var2.f(ng1Var2);
                                    Object P51 = rv4Var2.P();
                                    if (f27 || P51 == obj10) {
                                        P51 = new vt4() { // from class: ge1
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i10 = r3;
                                                pvc pvcVar = pvc.a;
                                                aw7 aw7Var33 = aw7Var28;
                                                switch (i10) {
                                                    case 0:
                                                        ng1Var2.m(((jub) aw7Var33.getValue()).a.b);
                                                        return pvcVar;
                                                    case 1:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var3 = ng1Var2;
                                                        cza czaVar = ng1Var3.C;
                                                        Long U = r4b.U(ng1Var3.c);
                                                        if (U != null) {
                                                            long longValue = U.longValue();
                                                            List C0 = sl1.C0(((cg1) czaVar.getValue()).z);
                                                            if (!C0.isEmpty() && !((cg1) czaVar.getValue()).v) {
                                                                hk1 a8 = jdd.a(ng1Var3);
                                                                sw2 sw2Var = ab3.a;
                                                                ng1Var3.f(a8, ru2.c, new gg1(ng1Var3, longValue, C0, (m42) null));
                                                            }
                                                        }
                                                        return pvcVar;
                                                    case 2:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var4 = ng1Var2;
                                                        Long U2 = r4b.U(ng1Var4.c);
                                                        if (U2 != null) {
                                                            long longValue2 = U2.longValue();
                                                            if (!((cg1) ng1Var4.C.getValue()).v) {
                                                                hk1 a9 = jdd.a(ng1Var4);
                                                                sw2 sw2Var2 = ab3.a;
                                                                ng1Var4.f(a9, ru2.c, new fg1(ng1Var4, longValue2, null, 1));
                                                            }
                                                        }
                                                        return pvcVar;
                                                    default:
                                                        aw7Var33.setValue(Boolean.FALSE);
                                                        ng1 ng1Var5 = ng1Var2;
                                                        Long U3 = r4b.U(ng1Var5.c);
                                                        if (U3 != null) {
                                                            long longValue3 = U3.longValue();
                                                            if (!((cg1) ng1Var5.C.getValue()).v) {
                                                                hk1 a10 = jdd.a(ng1Var5);
                                                                sw2 sw2Var3 = ab3.a;
                                                                ng1Var5.f(a10, ru2.c, new fg1(ng1Var5, longValue3, null, 0));
                                                            }
                                                        }
                                                        return pvcVar;
                                                }
                                            }
                                        };
                                        rv4Var2.o0(P51);
                                    }
                                    hma.b(booleanValue5, A4, B2, z15, xt4Var12, (vt4) P51, rv4Var2, 24576);
                                    rv4Var2.q(true);
                                } else {
                                    rv4Var2.X();
                                }
                                return pvc.a;
                            }
                        };
                        cz7Var2 = cz7Var;
                        fxe.h(str3, null, true, E, E2, null, jce.E(1028413605, nu4Var, rv4Var), rv4Var, 1600896, 34);
                    } else {
                        vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var2, i, 2);
        }
    }

    public static final void H(aw7 aw7Var, boolean z) {
        aw7Var.setValue(Boolean.valueOf(z));
    }

    public static final void I(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        Object obj;
        boolean z2;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(1705229455);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            obj = vt4Var;
            if (rv4Var.h(obj)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        } else {
            obj = vt4Var;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            nq7 f = pna.f(nq7Var, 1.0f);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, f);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            nmd.a(obj, zbe.z(pna.f(kq7.a, 1.0f), 12.0f, 10.0f), !z, null, null, null, null, null, jce.E(1968340185, new kd1(2, z), rv4Var), rv4Var, ((i2 >> 6) & 14) | 805306416, 504);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new am(z, nq7Var, vt4Var, i, 2);
        }
    }

    public static final void J(final cg1 cg1Var, final kj6 kj6Var, final boolean z, final String str, final String str2, final rh8 rh8Var, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final xt4 xt4Var, final vt4 vt4Var7, final vt4 vt4Var8, final lu4 lu4Var, final xt4 xt4Var2, final vt4 vt4Var9, final xt4 xt4Var3, rv4 rv4Var, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(2086251125);
        if ((i & 6) == 0) {
            i2 = (rv4Var2.f(cg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rv4Var2.f(kj6Var) ? 32 : 16;
        }
        int i3 = i & 384;
        int i4 = Token.CASE;
        if (i3 == 0) {
            i2 |= rv4Var2.g(z) ? 256 : 128;
        }
        int i5 = i2;
        if ((i & 3072) == 0) {
            i5 |= rv4Var2.f(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= rv4Var2.f(str2) ? 16384 : 8192;
        }
        int i6 = i & 196608;
        int i7 = Parser.ARGC_LIMIT;
        if (i6 == 0) {
            i5 |= rv4Var2.f(rh8Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= rv4Var2.f(nq7Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= rv4Var2.h(vt4Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= rv4Var2.h(vt4Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= rv4Var2.h(vt4Var3) ? 536870912 : 268435456;
        }
        int i8 = 805306368 | (rv4Var2.h(vt4Var4) ? 4 : 2) | (rv4Var2.h(vt4Var5) ? 32 : 16);
        if (rv4Var2.h(vt4Var6)) {
            i4 = 256;
        }
        int i9 = i8 | i4 | (rv4Var2.h(xt4Var) ? 2048 : 1024) | (rv4Var2.h(vt4Var7) ? 16384 : 8192);
        if (rv4Var2.h(vt4Var8)) {
            i7 = 131072;
        }
        int i10 = i9 | i7 | (rv4Var2.h(lu4Var) ? 1048576 : 524288) | (rv4Var2.h(xt4Var2) ? 8388608 : 4194304) | (rv4Var2.h(vt4Var9) ? 67108864 : 33554432);
        if (rv4Var2.U(i5 & 1, ((i5 & 306783379) == 306783378 && (i10 & 306783379) == 306783378) ? false : true)) {
            un6 un6Var = (un6) rv4Var2.j(nu6.a);
            xn6 k = un6Var.k();
            boolean h = rv4Var2.h(un6Var) | ((i10 & 14) == 4);
            Object P = rv4Var2.P();
            Object obj = ax1.a;
            if (h || P == obj) {
                P = new cv0(un6Var, vt4Var4, null, 11);
                rv4Var2.o0(P);
            }
            yte.g((lu4) P, rv4Var2, k);
            boolean z4 = cg1Var.a;
            List list = cg1Var.D;
            if (z4) {
                rv4Var2.e0(-963466241);
                yf2.j(zbe.x(kq7.a, rh8Var).a0(pna.c), rv4Var2, 0);
                rv4Var2.q(false);
            } else if (cg1Var.c && list.isEmpty()) {
                rv4Var2.e0(-963203671);
                ar5 E = owe.E(rv4Var2);
                String A = yqe.A((y3b) s2b.a.getValue(), rv4Var2);
                String A2 = yqe.A((y3b) s2b.b.getValue(), rv4Var2);
                String A3 = yqe.A((y3b) b3b.B.getValue(), rv4Var2);
                nq7 x = zbe.x(zbe.A(pna.c, 12.0f, nae.e, 2), rh8Var);
                boolean z5 = (i10 & Token.ASSIGN_MOD) == 32;
                Object P2 = rv4Var2.P();
                if (z5 || P2 == obj) {
                    P2 = new pa(24, vt4Var5);
                    rv4Var2.o0(P2);
                }
                jxe.d(E, A, A2, x, A3, (vt4) P2, rv4Var2, 0, 0);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-962642044);
                boolean isEmpty = list.isEmpty();
                boolean z6 = (i10 & 896) == 256;
                Object P3 = rv4Var2.P();
                if (z6 || P3 == obj) {
                    P3 = new pa(25, vt4Var6);
                    rv4Var2.o0(P3);
                }
                vt4 vt4Var10 = (vt4) P3;
                boolean z7 = (i10 & 7168) == 2048;
                Object P4 = rv4Var2.P();
                if (z7 || P4 == obj) {
                    z2 = true;
                    P4 = new im(1, xt4Var);
                    rv4Var2.o0(P4);
                } else {
                    z2 = true;
                }
                xt4 xt4Var4 = (xt4) P4;
                boolean z8 = (57344 & i10) == 16384 ? z2 : false;
                Object P5 = rv4Var2.P();
                if (z8 || P5 == obj) {
                    P5 = new pa(26, vt4Var7);
                    rv4Var2.o0(P5);
                }
                vt4 vt4Var11 = (vt4) P5;
                boolean z9 = (458752 & i10) == 131072 ? z2 : false;
                Object P6 = rv4Var2.P();
                if (z9 || P6 == obj) {
                    P6 = new pa(27, vt4Var8);
                    rv4Var2.o0(P6);
                }
                vt4 vt4Var12 = (vt4) P6;
                boolean z10 = (i10 & 3670016) == 1048576;
                Object P7 = rv4Var2.P();
                if (z10 || P7 == obj) {
                    z3 = isEmpty;
                    P7 = new tb(2, lu4Var);
                    rv4Var2.o0(P7);
                } else {
                    z3 = isEmpty;
                }
                lu4 lu4Var2 = (lu4) P7;
                boolean z11 = (i10 & 29360128) == 8388608;
                Object P8 = rv4Var2.P();
                if (z11 || P8 == obj) {
                    P8 = new im(2, xt4Var2);
                    rv4Var2.o0(P8);
                }
                int i11 = i5 << 3;
                F(cg1Var, kj6Var, z, str, str2, z3, rh8Var, nq7Var, vt4Var10, xt4Var4, vt4Var11, vt4Var12, lu4Var2, (xt4) P8, vt4Var, vt4Var2, vt4Var9, vt4Var3, xt4Var3, rv4Var2, (i5 & 65534) | (i11 & 3670016) | (i11 & 29360128), ((i5 >> 9) & 516096) | ((i10 >> 6) & 3670016) | ((i5 >> 6) & 29360128) | 100663296);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: ie1
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p = xoe.p(i | 1);
                    hbe.J(cg1.this, kj6Var, z, str, str2, rh8Var, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, xt4Var, vt4Var7, vt4Var8, lu4Var, xt4Var2, vt4Var9, xt4Var3, (rv4) obj2, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void K(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        Object obj;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        aw7 aw7Var;
        ps psVar;
        lh9 lh9Var;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-1061779366);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = vt4Var;
            if (rv4Var.h(obj)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            obj = vt4Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            String A = yqe.A((y3b) x2b.Q.getValue(), rv4Var);
            long j = ((h27) rv4Var.j(j27.a)).a.a;
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                qa5 qa5Var = qa5.a;
                ps d2 = qa5.d(A);
                ns nsVar = new ns();
                nsVar.d(d2);
                for (os osVar : d2.d(0, d2.b.length())) {
                    nsVar.b(osVar.b, osVar.c, new uva(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                }
                P = nsVar.k();
                rv4Var.o0(P);
            }
            ps psVar2 = (ps) P;
            b37 d3 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d3);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var2) {
                P2 = yae.z(null);
                rv4Var.o0(P2);
            }
            aw7 aw7Var2 = (aw7) P2;
            if ((i2 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & 896) == 256) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object P3 = rv4Var.P();
            if (z4 || P3 == lh9Var2) {
                aw7Var = aw7Var2;
                psVar = psVar2;
                lh9Var = lh9Var2;
                ze1 ze1Var = new ze1(aw7Var, psVar, obj, vt4Var2, 0);
                rv4Var.o0(ze1Var);
                P3 = ze1Var;
            } else {
                aw7Var = aw7Var2;
                lh9Var = lh9Var2;
                psVar = psVar2;
            }
            kq7 kq7Var = kq7.a;
            nq7 a0 = zbe.y(pu0.a.a(kq7Var, kh5.e), 24.0f).a0(dab.b(kq7Var, pvc.a, (PointerInputEventHandler) P3));
            tza tzaVar = j27.a;
            oyb a2 = oyb.a(((h27) rv4Var.j(tzaVar)).b.j, ((h27) rv4Var.j(tzaVar)).a.q, 0L, null, null, null, 0L, null, 3, 0L, null, 16744446);
            Object P4 = rv4Var.P();
            if (P4 == lh9Var) {
                P4 = new s7(aw7Var, 28);
                rv4Var.o0(P4);
            }
            cvb.d(psVar, a0, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, (xt4) P4, a2, rv4Var, 6, 12582912, 131068);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new va(nq7Var, (Object) vt4Var, (hu4) vt4Var2, i, 6);
        }
    }

    public static final void L(int i, int i2, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(-123586997);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (rv4Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(nq7Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(vt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            rte.c(z, nq7Var, zt3.g(null, 3), zt3.i(null, 3), null, jce.E(-1882930573, new qe1(i, vt4Var, 0), rv4Var), rv4Var, (i10 & 14) | 200064 | ((i10 >> 3) & Token.ASSIGN_MOD), 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new am(z, i, nq7Var, vt4Var, i2);
        }
    }

    public static final void M(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str, String str2, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        rv4Var.g0(-1424544820);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | 384;
        if (rv4Var.f(nq7Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            t86 t86Var = new t86(3, 0, Token.EXPORT);
            v72 v72Var = ((h27) rv4Var.j(j27.a)).c.b;
            tu1 E = jce.E(1538674662, new jd1(str2, 18), rv4Var);
            int i10 = ((i9 >> 3) & 896) | (i9 & 14) | 1572864 | ((i9 >> 9) & Token.ASSIGN_MOD) | 3072;
            z3 = true;
            uwe.h(str, xt4Var, nq7Var, true, false, null, E, null, null, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var, i10, 12779520, 6127536);
        } else {
            rv4Var.X();
            z3 = z;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kj7(str, str2, z3, nq7Var, xt4Var, i);
        }
    }

    public static final void N(boolean z, List list, boolean z2, nq7 nq7Var, rh8 rh8Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        rv4Var.g0(-786622706);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z2)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(rh8Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i2 & 1, z3)) {
            ya9 b2 = ra9.b(rv4Var);
            ra9.a(z, vt4Var, nq7Var, b2, null, jce.E(-953634411, new f83(b2, z, rh8Var, 2), rv4Var), false, nae.e, jce.E(1332009522, new xsa(ej6.e(0, vt4Var2, rv4Var, (i2 >> 9) & 7168, 7), rh8Var, list, z2), rv4Var), rv4Var, (i2 & 14) | 100859904 | ((i2 >> 12) & Token.ASSIGN_MOD) | ((i2 >> 3) & 896));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mt0(z, list, z2, nq7Var, rh8Var, vt4Var, vt4Var2, i);
        }
    }

    public static final void O(ysa ysaVar, nq7 nq7Var, rh8 rh8Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(122573930);
        if ((i & 6) == 0) {
            if (rv4Var2.f(ysaVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i8 & 1, z)) {
            boolean z2 = ysaVar.a;
            List list = ysaVar.c;
            if (z2 && list.isEmpty()) {
                rv4Var2.e0(877997233);
                P(zbe.A(zbe.x(pna.f(nq7Var, 1.0f), rh8Var), 16.0f, nae.e, 2), rv4Var2, 0);
                rv4Var2.q(false);
            } else if (ysaVar.d) {
                rv4Var2.e0(878215597);
                rv4Var2.q(false);
            } else if (list.isEmpty()) {
                rv4Var2.e0(878264205);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(878320284);
                N(ysaVar.a, ysaVar.c, ysaVar.b, pna.f(nq7Var, 1.0f), mwe.h(mwe.r(rh8Var, mwe.f(14, rv4Var2, false)), 16.0f, nae.e, 16.0f, 12.0f, rv4Var2, 27696, 2), vt4Var, vt4Var2, rv4Var, (i8 << 6) & 4128768);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ud1(ysaVar, nq7Var, rh8Var, vt4Var, vt4Var2, i);
        }
    }

    public static final void P(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-1690828537);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            rv4Var.e0(1117177059);
            for (int i4 = 0; i4 < 12; i4++) {
                kq7 kq7Var = kq7.a;
                fbe.f(c0(rv4Var, pna.f(kq7Var, 1.0f)), rv4Var, 0);
                if (i4 < 11) {
                    s21.w(rv4Var, -1848431783, kq7Var, 8.0f, rv4Var);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-1848362591);
                    rv4Var.q(false);
                }
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 26);
        }
    }

    public static final void Q(boolean z, final int i, final int i2, final zwb zwbVar, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final nu4 nu4Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        boolean z2;
        zwbVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        nu4Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        rv4Var.g0(956564357);
        if (rv4Var.g(z)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i13 = i3 | i4;
        char c3 = ' ';
        if (rv4Var.d(i)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i14 = i13 | i5;
        char c4 = 256;
        if (rv4Var.d(i2)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i15 = i14 | i6;
        if (rv4Var.f(zwbVar)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i16 = i15 | i7;
        if (rv4Var.h(xt4Var)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i17 = i16 | i8;
        if (rv4Var.h(xt4Var3)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i18 = i17 | i9;
        if (rv4Var.h(xt4Var4)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i19 = i18 | i10;
        if (rv4Var.h(nu4Var)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i20 = i19 | i11;
        if (rv4Var.h(vt4Var)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i21 = i20 | i12;
        if (rv4Var.h(vt4Var2)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (!rv4Var.h(vt4Var3)) {
            c3 = 16;
        }
        int i22 = c2 | c3;
        if (!rv4Var.h(vt4Var4)) {
            c4 = 128;
        }
        int i23 = i22 | c4;
        if ((306783379 & i21) == 306783378 && (i23 & Token.EXPR_VOID) == 146) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i21 & 1, z2)) {
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new si7(8);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i24 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new si7(9);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i24.a(zt3.x((xt4) P2)), null, 0L, false, false, null, jce.E(1666673639, new mu4() { // from class: ij7
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((su0) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        final zwb zwbVar2 = zwb.this;
                        final xt4 xt4Var5 = xt4Var2;
                        final xt4 xt4Var6 = xt4Var4;
                        final xt4 xt4Var7 = xt4Var3;
                        final int i25 = i;
                        final int i26 = i2;
                        final nu4 nu4Var2 = nu4Var;
                        final vt4 vt4Var5 = vt4Var;
                        final vt4 vt4Var6 = vt4Var2;
                        final vt4 vt4Var7 = vt4Var3;
                        final xt4 xt4Var8 = xt4Var;
                        final vt4 vt4Var8 = vt4Var4;
                        v9b.a(null, null, 0L, 0L, nae.e, nae.e, null, jce.E(-1961800702, new lu4() { // from class: lj7
                            /* JADX WARN: Code restructure failed: missing block: B:55:0x0300, code lost:
                                if (r12 == r11) goto L74;
                             */
                            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, qid] */
                            @Override // defpackage.lu4
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r38, java.lang.Object r39) {
                                /*
                                    Method dump skipped, instructions count: 1208
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.lj7.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, rv4Var2), rv4Var2, 12582912, Token.SWITCH);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i21 & 14) | 805309824 | ((i21 >> 9) & Token.ASSIGN_MOD), 496);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new y73(z, i, i2, zwbVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, nu4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, i3);
        }
    }

    public static final void R(final int i, final int i2, final boolean z, final boolean z2, final int i3, boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final String str, final List list, final nq7 nq7Var, final mu4 mu4Var, final xt4 xt4Var, final xt4 xt4Var2, final mu4 mu4Var2, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, rv4 rv4Var, final int i4) {
        boolean z8;
        int i5;
        mk0 mk0Var;
        aw7 aw7Var;
        kq7 kq7Var;
        int i6;
        boolean z9;
        mk0 mk0Var2 = kh5.F;
        rv4Var.g0(-1753040152);
        int i7 = i4 | (rv4Var.d(i) ? 4 : 2) | (rv4Var.d(i2) ? 32 : 16) | (rv4Var.g(z) ? 256 : 128) | (rv4Var.g(z2) ? 2048 : 1024) | (rv4Var.d(i3) ? 16384 : 8192) | (rv4Var.g(z3) ? 131072 : Parser.ARGC_LIMIT) | (rv4Var.g(z4) ? 1048576 : 524288) | (rv4Var.g(z5) ? 8388608 : 4194304) | (rv4Var.g(z6) ? 67108864 : 33554432);
        int i8 = (rv4Var.f(str) ? (char) 4 : (char) 2) | (rv4Var.f(list) ? ' ' : (char) 16) | (rv4Var.f(nq7Var) ? (char) 256 : (char) 128) | (rv4Var.h(mu4Var) ? (char) 2048 : (char) 1024) | (rv4Var.h(xt4Var) ? (char) 16384 : (char) 8192) | (rv4Var.h(mu4Var2) ? (char) 0 : (char) 0) | (rv4Var.h(vt4Var) ? (char) 0 : (char) 0) | (rv4Var.h(vt4Var2) ? (char) 0 : (char) 0) | (rv4Var.h(vt4Var3) ? 536870912 : 268435456);
        if (rv4Var.U(i7 & 1, ((i7 & 38347923) == 38347922 && (306717843 & i8) == 306717842) ? false : true)) {
            Object[] objArr = new Object[0];
            boolean z10 = ((i7 & 14) == 4) | ((i7 & Token.ASSIGN_MOD) == 32);
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z10 || P == obj) {
                P = new lj6(i, i2, 1);
                rv4Var.o0(P);
            }
            aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 0);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new rh7(8);
                rv4Var.o0(P2);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
            Object[] objArr3 = new Object[0];
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = new rh7(9);
                rv4Var.o0(P3);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var, 48);
            xn1 a2 = wn1.a(lz.d(), kh5.I, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            vt4 vt4Var4 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var4);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            jv9 jv9Var = jv9.a;
            kq7 kq7Var2 = kq7.a;
            if (!z2 && !z) {
                rv4Var.e0(-1037484865);
                nq7 f = pna.f(kq7Var2, 1.0f);
                i5 = i8;
                gv9 a3 = ev9.a(lz.d(), mk0Var2, rv4Var, 6);
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, f);
                rv4Var.i0();
                mk0Var = mk0Var2;
                if (rv4Var.S) {
                    rv4Var.k(vt4Var4);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, a3);
                jce.F(npVar2, rv4Var, l2);
                s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p2);
                String str2 = (String) aw7Var2.getValue();
                String A = yqe.A((y3b) o3b.X.getValue(), rv4Var);
                nq7 a4 = jv9Var.a(2.0f, kq7Var2, true);
                boolean f2 = rv4Var.f(aw7Var2);
                Object P4 = rv4Var.P();
                if (f2 || P4 == obj) {
                    P4 = new ig7(aw7Var2, 23);
                    rv4Var.o0(P4);
                }
                M(0, (xt4) P4, rv4Var, a4, str2, A, false);
                String str3 = (String) aw7Var3.getValue();
                String A2 = yqe.A((y3b) o3b.j0.getValue(), rv4Var);
                nq7 a5 = jv9Var.a(1.0f, kq7Var2, true);
                aw7Var3 = aw7Var3;
                boolean f3 = rv4Var.f(aw7Var3);
                Object P5 = rv4Var.P();
                if (f3 || P5 == obj) {
                    P5 = new ig7(aw7Var3, 24);
                    rv4Var.o0(P5);
                }
                M(0, (xt4) P5, rv4Var, a5, str3, A2, false);
                String str4 = (String) aw7Var4.getValue();
                String A3 = yqe.A((y3b) o3b.i0.getValue(), rv4Var);
                nq7 a6 = jv9Var.a(1.0f, kq7Var2, true);
                aw7Var = aw7Var4;
                boolean f4 = rv4Var.f(aw7Var);
                Object P6 = rv4Var.P();
                if (f4 || P6 == obj) {
                    P6 = new ig7(aw7Var, 25);
                    rv4Var.o0(P6);
                }
                M(0, (xt4) P6, rv4Var, a6, str4, A3, false);
                rv4Var.q(true);
                rv4Var.q(false);
            } else {
                i5 = i8;
                mk0Var = mk0Var2;
                aw7Var = aw7Var4;
                rv4Var.e0(-1036495996);
                rv4Var.q(false);
            }
            nq7 f5 = pna.f(kq7Var2, 1.0f);
            hz d2 = lz.d();
            mk0 mk0Var3 = kh5.G;
            aw7 aw7Var5 = aw7Var;
            gv9 a7 = ev9.a(d2, mk0Var3, rv4Var, 54);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f5);
            rv4Var.i0();
            aw7 aw7Var6 = aw7Var3;
            if (rv4Var.S) {
                rv4Var.k(vt4Var4);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a7);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            String A4 = yqe.A((y3b) o3b.e0.getValue(), rv4Var);
            f99 f99Var = j27.a;
            cvb.c(A4, null, ((h27) rv4Var.j(f99Var)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(f99Var)).b.j, rv4Var, 0, 0, 131066);
            nq7 q = rte.q(kq7Var2, rte.u(rv4Var), 14);
            mk0 mk0Var4 = mk0Var;
            gv9 a8 = ev9.a(lz.d(), mk0Var4, rv4Var, 6);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, q);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var4);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a8);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            String A5 = yqe.A((y3b) o3b.h0.getValue(), rv4Var);
            int i9 = i5;
            int i10 = i9 & 7168;
            int i11 = i7 & 3670016;
            int i12 = i7 & 29360128;
            int i13 = i7 & 234881024;
            boolean z11 = (i12 == 8388608) | (i10 == 2048) | (i11 == 1048576) | (i13 == 67108864);
            Object P7 = rv4Var.P();
            if (z11 || P7 == obj) {
                P7 = new vt4() { // from class: jj7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i14 = r5;
                        pvc pvcVar = pvc.a;
                        boolean z12 = z6;
                        boolean z13 = z5;
                        boolean z14 = z4;
                        mu4 mu4Var3 = mu4Var;
                        switch (i14) {
                            case 0:
                                mu4Var3.c(Boolean.valueOf(!z14), Boolean.valueOf(z13), Boolean.valueOf(z12));
                                return pvcVar;
                            case 1:
                                mu4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(!z13), Boolean.valueOf(z12));
                                return pvcVar;
                            default:
                                mu4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(z13), Boolean.valueOf(!z12));
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P7);
            }
            ese.m((i7 >> 15) & Token.ASSIGN_MOD, (vt4) P7, rv4Var, null, null, null, A5, z4);
            String A6 = yqe.A((y3b) o3b.f0.getValue(), rv4Var);
            boolean z12 = (i10 == 2048) | (i11 == 1048576) | (i12 == 8388608) | (i13 == 67108864);
            Object P8 = rv4Var.P();
            if (z12 || P8 == obj) {
                P8 = new vt4() { // from class: jj7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i14 = r5;
                        pvc pvcVar = pvc.a;
                        boolean z122 = z6;
                        boolean z13 = z5;
                        boolean z14 = z4;
                        mu4 mu4Var3 = mu4Var;
                        switch (i14) {
                            case 0:
                                mu4Var3.c(Boolean.valueOf(!z14), Boolean.valueOf(z13), Boolean.valueOf(z122));
                                return pvcVar;
                            case 1:
                                mu4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(!z13), Boolean.valueOf(z122));
                                return pvcVar;
                            default:
                                mu4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(z13), Boolean.valueOf(!z122));
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P8);
            }
            ese.m((i7 >> 18) & Token.ASSIGN_MOD, (vt4) P8, rv4Var, null, null, null, A6, z5);
            String A7 = yqe.A((y3b) o3b.g0.getValue(), rv4Var);
            boolean z13 = (i10 == 2048) | (i11 == 1048576) | (i12 == 8388608) | (i13 == 67108864);
            Object P9 = rv4Var.P();
            if (z13 || P9 == obj) {
                P9 = new vt4() { // from class: jj7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i14 = r5;
                        pvc pvcVar = pvc.a;
                        boolean z122 = z6;
                        boolean z132 = z5;
                        boolean z14 = z4;
                        mu4 mu4Var3 = mu4Var;
                        switch (i14) {
                            case 0:
                                mu4Var3.c(Boolean.valueOf(!z14), Boolean.valueOf(z132), Boolean.valueOf(z122));
                                return pvcVar;
                            case 1:
                                mu4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(!z132), Boolean.valueOf(z122));
                                return pvcVar;
                            default:
                                mu4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(z132), Boolean.valueOf(!z122));
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P9);
            }
            ese.m((i7 >> 21) & Token.ASSIGN_MOD, (vt4) P9, rv4Var, null, null, null, A7, z6);
            rv4Var.q(true);
            rv4Var.q(true);
            if (!z2 && !z) {
                rv4Var.e0(-1034836783);
                kq7Var = kq7Var2;
                nq7 f6 = pna.f(kq7Var, 1.0f);
                gv9 a9 = ev9.a(lz.d(), mk0Var3, rv4Var, 54);
                int hashCode5 = Long.hashCode(rv4Var.T);
                xt8 l5 = rv4Var.l();
                nq7 p5 = lye.p(rv4Var, f6);
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var4);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, a9);
                jce.F(npVar2, rv4Var, l5);
                s21.t(hashCode5, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p5);
                cvb.c(yqe.A((y3b) o3b.a0.getValue(), rv4Var), null, ((h27) rv4Var.j(f99Var)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(f99Var)).b.j, rv4Var, 0, 0, 131066);
                hz d3 = lz.d();
                boolean z14 = ((i9 & Token.ASSIGN_MOD) == 32) | ((i9 & 14) == 4) | ((i9 & 57344) == 16384);
                Object P10 = rv4Var.P();
                if (z14 || P10 == obj) {
                    P10 = new k34(1, xt4Var, str, list);
                    rv4Var.o0(P10);
                }
                jce.e(null, null, null, false, d3, null, null, false, null, (xt4) P10, rv4Var, 24576, 495);
                rv4Var.q(true);
                i6 = 0;
                rv4Var.q(false);
            } else {
                kq7Var = kq7Var2;
                i6 = 0;
                rv4Var.e0(-1033865212);
                rv4Var.q(false);
            }
            if (z) {
                rv4Var.e0(-1033099047);
                nq7 i14 = zj0.i(pna.f(kq7Var, 1.0f), w06.a);
                gv9 a10 = ev9.a(lz.d(), mk0Var4, rv4Var, 6);
                int hashCode6 = Long.hashCode(rv4Var.T);
                xt8 l6 = rv4Var.l();
                nq7 p6 = lye.p(rv4Var, i14);
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var4);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, a10);
                jce.F(npVar2, rv4Var, l6);
                s21.t(hashCode6, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p6);
                kq7 kq7Var3 = kq7Var;
                nqe.m(i3, ((i7 >> 12) & 14) | 3072, 0L, 0L, jce.E(778634327, new zj7(i3, 10), rv4Var), rv4Var, jv9Var.a(1.0f, tte.k(zbe.A(pna.c(kq7Var, 1.0f), nae.e, 4.0f, 1), uu9.a), true));
                tu1 E = jce.E(-409164137, new nd1(z, 3, (byte) 0), rv4Var);
                tu1 tu1Var = n4f.f;
                boolean z15 = (i9 & 29360128) == 8388608;
                Object P11 = rv4Var.P();
                if (z15 || P11 == obj) {
                    P11 = new hi7(16, vt4Var);
                    rv4Var.o0(P11);
                }
                z1d.g(false, null, kq7Var3, null, null, E, tu1Var, (vt4) P11, rv4Var, 1769856);
                rv4Var.q(true);
                rv4Var.q(false);
                z8 = z3;
                z9 = true;
            } else {
                kq7 kq7Var4 = kq7Var;
                int i15 = i6;
                if (z2) {
                    rv4Var.e0(-1030721502);
                    nq7 f7 = pna.f(kq7Var4, 1.0f);
                    gv9 a11 = ev9.a(lz.d(), mk0Var4, rv4Var, 6);
                    int hashCode7 = Long.hashCode(rv4Var.T);
                    xt8 l7 = rv4Var.l();
                    nq7 p7 = lye.p(rv4Var, f7);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(vt4Var4);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a11);
                    jce.F(npVar2, rv4Var, l7);
                    s21.t(hashCode7, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p7);
                    ar5 c2 = rp5.c((wk3) ok3.d0.getValue(), rv4Var, 0);
                    String A8 = yqe.A((y3b) o3b.d0.getValue(), rv4Var);
                    nq7 a12 = jv9Var.a(1.0f, kq7Var4, true);
                    boolean z16 = (i9 & 234881024) == 67108864;
                    Object P12 = rv4Var.P();
                    if (z16 || P12 == obj) {
                        P12 = new hi7(17, vt4Var2);
                        rv4Var.o0(P12);
                    }
                    z1d.f(c2, A8, false, null, a12, null, null, null, (vt4) P12, rv4Var, 0, 236);
                    nq7 a13 = jv9Var.a(1.0f, kq7Var4, true);
                    z8 = z3;
                    tu1 E2 = jce.E(1433300407, new nd1(z8, 4, (byte) 0), rv4Var);
                    tu1 tu1Var2 = n4f.g;
                    boolean z17 = (i9 & 1879048192) == 536870912;
                    Object P13 = rv4Var.P();
                    if (z17 || P13 == obj) {
                        P13 = new hi7(18, vt4Var3);
                        rv4Var.o0(P13);
                    }
                    z1d.g(false, null, a13, null, null, E2, tu1Var2, (vt4) P13, rv4Var, 1769472);
                    rv4Var.q(true);
                    rv4Var.q(false);
                } else {
                    z8 = z3;
                    rv4Var.e0(-1028994616);
                    ar5 c3 = rp5.c((wk3) ok3.l0.getValue(), rv4Var, i15);
                    String A9 = yqe.A((y3b) b3b.J.getValue(), rv4Var);
                    nq7 f8 = pna.f(kq7Var4, 1.0f);
                    boolean f9 = rv4Var.f(aw7Var2) | ((i9 & 3670016) == 1048576) | rv4Var.f(aw7Var6) | rv4Var.f(aw7Var5);
                    Object P14 = rv4Var.P();
                    if (f9 || P14 == obj) {
                        Object ee7Var = new ee7(mu4Var2, aw7Var2, aw7Var6, aw7Var5, 1);
                        rv4Var.o0(ee7Var);
                        P14 = ee7Var;
                    }
                    z1d.f(c3, A9, false, null, f8, null, null, null, (vt4) P14, rv4Var, 24576, 236);
                    rv4Var.q(false);
                }
                z9 = true;
            }
            rv4Var.q(z9);
        } else {
            z8 = z3;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final boolean z18 = z8;
            u.d = new lu4(i, i2, z, z2, i3, z18, z4, z5, z6, z7, str, list, nq7Var, mu4Var, xt4Var, xt4Var2, mu4Var2, vt4Var, vt4Var2, vt4Var3, i4) { // from class: hj7
                public final /* synthetic */ boolean C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ String G;
                public final /* synthetic */ List H;
                public final /* synthetic */ nq7 I;
                public final /* synthetic */ mu4 J;
                public final /* synthetic */ xt4 K;
                public final /* synthetic */ xt4 L;
                public final /* synthetic */ mu4 M;
                public final /* synthetic */ vt4 N;
                public final /* synthetic */ vt4 O;
                public final /* synthetic */ vt4 P;
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ int e;
                public final /* synthetic */ boolean f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p8 = xoe.p(1);
                    hbe.R(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (rv4) obj2, p8);
                    return pvc.a;
                }
            };
        }
    }

    public static final void S(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-530426190);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            ar5 c2 = rp5.c((wk3) ok3.l0.getValue(), rv4Var2, 0);
            long j = r0f.y(rv4Var2).a;
            kq7 kq7Var = kq7.a;
            nk5.a(c2, null, zbe.y(nmd.v(tte.k(pna.n(kq7Var, 72.0f), uu9.a), zl1.b(0.12f, r0f.y(rv4Var2).a), lre.g), 18.0f), j, rv4Var2, 48, 0);
            xbe.i(rv4Var2, pna.h(kq7Var, 16.0f));
            cvb.c(yqe.A((y3b) o3b.b0.getValue(), rv4Var2), null, r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 0, 0, 130042);
            xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
            cvb.c(yqe.A((y3b) o3b.c0.getValue(), rv4Var), null, r0f.y(rv4Var).s, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var).k, rv4Var, 0, 0, 130042);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 18);
        }
    }

    public static final void T(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-1171117526);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            nq7 y = zbe.y(st0.d(nmd.v(tte.k(nq7Var, r0f.z(rv4Var).b), rm1.g(r0f.y(rv4Var), 1.0f), lre.g), 1.0f, rm1.g(r0f.y(rv4Var), 4.0f), r0f.z(rv4Var).b), 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            dpe.g(pna.h(new we6(1.0f, true), 18.0f), r0f.z(rv4Var).a, rv4Var, 0, 0);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            dpe.g(pna.p(kq7Var, 40.0f, 18.0f), r0f.z(rv4Var).a, rv4Var, 6, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            dpe.g(pna.p(kq7Var, 32.0f, 18.0f), r0f.z(rv4Var).a, rv4Var, 6, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            nq7 n = pna.n(kq7Var, 32.0f);
            su9 su9Var = uu9.a;
            dpe.g(n, su9Var, rv4Var, 6, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            dpe.g(pna.n(kq7Var, 32.0f), su9Var, rv4Var, 6, 0);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 19);
        }
    }

    public static final void U(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-940391715);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var2)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i5 = i4 | i3;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            rv4Var2.e0(-9061033);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            boolean z2 = false;
            cvb.c(str2, null, 0L, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var, 24576, 0, 130030);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
            z1d.f(rp5.c((wk3) ok3.F.getValue(), rv4Var, 0), yqe.A((y3b) b3b.e.getValue(), rv4Var), false, null, null, null, null, null, vt4Var, rv4Var, 100663296, 252);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var2, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 7168) == 2048) {
                z2 = true;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new on7(14, vt4Var2);
                rv4Var2.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var2, 0, 4);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(str, nq7Var, vt4Var, vt4Var2, i, 9);
        }
    }

    public static final void V(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1488523269);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.g;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            kq7 kq7Var = kq7.a;
            cvb.c(str, zbe.y(kq7Var, 24.0f), j, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i5 & 14) | 48, 0, 130040);
            eg0.f(pna.n(kq7Var, 48.0f), ((h27) rv4Var.j(tzaVar)).a.q, null, rv4Var, 6, 4);
            rv4Var.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new on7(13, vt4Var);
                rv4Var.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var, 0, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 11);
        }
    }

    public static final void W(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i2;
        cz7 cz7Var2;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        long v;
        long v2;
        hm8 z4;
        int i3;
        int i4;
        int i5;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(983766835);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cz7Var2 = cz7Var;
            if (rv4Var.f(cz7Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            cz7Var2 = cz7Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new v85(str, 11);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(j68.class);
                j68 j68Var = (j68) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f = rv4Var.f(j68Var);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new i68(j68Var, 1);
                    rv4Var.o0(P2);
                }
                tte.d(j68Var, null, (xt4) P2, rv4Var, 0);
                aw7 z5 = jsc.z(j68Var.t0, rv4Var);
                aw7 z6 = jsc.z(j68Var.g1, rv4Var);
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                boolean e = ((om3) rv4Var.j(nm3.a)).e();
                boolean f2 = rv4Var.f(((nnb) z5.getValue()).a) | rv4Var.f(((nnb) z5.getValue()).d) | rv4Var.f(((nnb) z5.getValue()).e) | rv4Var.f(((nnb) z5.getValue()).h) | rv4Var.f(((nnb) z5.getValue()).f) | rv4Var.f(pm1Var) | rv4Var.g(e);
                Object P3 = rv4Var.P();
                if (f2 || P3 == lh9Var) {
                    if (e) {
                        z4 = yae.z(new e6c(true, false, pm1Var.q, pm1Var.p, "", nae.n(((nnb) z5.getValue()).h)));
                    } else {
                        if (((nnb) z5.getValue()).a.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z7 = ((nnb) z5.getValue()).g;
                        if (z3) {
                            v = pm1Var.q;
                        } else {
                            v = kve.v(((nnb) z5.getValue()).d);
                        }
                        long j = v;
                        if (z3) {
                            v2 = pm1Var.p;
                        } else {
                            v2 = kve.v(((nnb) z5.getValue()).e);
                        }
                        z4 = yae.z(new e6c(z3, z7, j, v2, ((nnb) z5.getValue()).f, nae.n(((nnb) z5.getValue()).h)));
                    }
                    P3 = z4;
                    rv4Var.o0(P3);
                }
                aw7 aw7Var = (aw7) P3;
                aw7 z8 = jsc.z(j68Var.z0, rv4Var);
                WeakHashMap weakHashMap = yjd.w;
                ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
                boolean f3 = rv4Var.f((nnb) z5.getValue());
                Object P4 = rv4Var.P();
                if (f3 || P4 == lh9Var) {
                    th8 th8Var = new th8(((nnb) z5.getValue()).F, ((nnb) z5.getValue()).H, ((nnb) z5.getValue()).G, ((nnb) z5.getValue()).I);
                    rv4Var.o0(th8Var);
                    P4 = th8Var;
                }
                aw7 z9 = jsc.z(j68Var.A0, rv4Var);
                dxe.l(((nnb) z5.getValue()).o, ((nnb) z5.getValue()).r, ((nnb) z5.getValue()).p, ((nnb) z5.getValue()).q, rv4Var, 0);
                rv4Var2 = rv4Var;
                pc2.f((e6c) aw7Var.getValue(), jce.E(-1879153949, new k68(j68Var, nq7Var, o, cz7Var2, (rh8) P4, aw7Var, z6, z8, z5, z9), rv4Var2), rv4Var2, 48);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new j31(str, cz7Var, nq7Var, i, 7);
        }
    }

    public static final void X(String str, String str2, String str3, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        pb2 pb2Var;
        String str4;
        str.getClass();
        str2.getClass();
        str3.getClass();
        cz7Var.getClass();
        rv4Var.g0(-773081524);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(cz7Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            String o = eub.o(str, "-", str3);
            if ((i9 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3 | z2;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z4 || P == obj) {
                P = new m43(str, str3, 4);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(cta.class);
                cta ctaVar = (cta) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", o), pb2Var2, a3, vt4Var));
                boolean f = rv4Var.f(ctaVar);
                Object P2 = rv4Var.P();
                if (f || P2 == obj) {
                    P2 = new usa(ctaVar, 1);
                    rv4Var.o0(P2);
                }
                tte.d(ctaVar, null, (xt4) P2, rv4Var, 0);
                aw7 z5 = jsc.z(ctaVar.W, rv4Var);
                aw7 z6 = jsc.z(ctaVar.d, rv4Var);
                Object[] objArr = new Object[0];
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new mia(19);
                    rv4Var.o0(P3);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P3, rv4Var, 48);
                rv4Var.e0(98019706);
                if (str2.length() == 0) {
                    str4 = yqe.A((y3b) k2b.b.getValue(), rv4Var);
                } else {
                    str4 = str2;
                }
                rv4Var.q(false);
                boolean z7 = false;
                fxe.h(str4, null, false, jce.E(1377216592, new ri9(cz7Var, 9), rv4Var), jce.E(-670762233, new i64(6, aw7Var, z6), rv4Var), null, jce.E(-213594591, new u32(6, ctaVar, z5), rv4Var), rv4Var, 1600512, 38);
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean f2 = rv4Var.f(aw7Var);
                Object P4 = rv4Var.P();
                if (f2 || P4 == obj) {
                    P4 = new jia(aw7Var, 10);
                    rv4Var.o0(P4);
                }
                xt4 xt4Var = (xt4) P4;
                boolean f3 = rv4Var.f(aw7Var);
                if ((i9 & 7168) == 2048) {
                    z7 = true;
                }
                boolean z8 = z7 | f3;
                Object P5 = rv4Var.P();
                if (z8 || P5 == obj) {
                    P5 = new rp0(cz7Var, aw7Var, 23);
                    rv4Var.o0(P5);
                }
                cae.g(booleanValue, null, str, xt4Var, (vt4) P5, rv4Var, (i9 << 6) & 896);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wq6(str, str2, str3, cz7Var, i, 1);
        }
    }

    public static final void Y(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        rv4Var.g0(1417842467);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            long b2 = rm1.b(r0f.y(rv4Var).h, rv4Var);
            oyb oybVar = r0f.A(rv4Var).l;
            long g = rm1.g(r0f.y(rv4Var), 6.0f);
            v72 v72Var = r0f.z(rv4Var).a;
            kq7 kq7Var2 = kq7.a;
            cvb.c(str, zbe.z(st0.d(nmd.v(kq7Var2, g, v72Var), 1.0f, zl1.b(0.1f, r0f.y(rv4Var).q), r0f.z(rv4Var).a), 6.0f, 1.0f), b2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, i3 & 14, 24576, 114680);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new o7(str, kq7Var, i, 10);
        }
    }

    public static final void Z(pc9 pc9Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        float f;
        float f2;
        String str;
        vt4 vt4Var4 = vt4Var3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(2094070639);
        if (rv4Var2.h(pc9Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var2.h(vt4Var4)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var2).b);
            long g = rm1.g(r0f.y(rv4Var2), 1.0f);
            ba5 ba5Var = lre.g;
            nq7 z2 = zbe.z(lbe.f(15, vt4Var, st0.d(nmd.v(k, g, ba5Var), 1.0f, rm1.g(r0f.y(rv4Var2), 4.0f), r0f.z(rv4Var2).b), null, false), 12.0f, 8.0f);
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            float f3 = Float.MAX_VALUE;
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = Float.MAX_VALUE;
                f3 = 1.0f;
            }
            we6 we6Var = new we6(f3, true);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            kq7 kq7Var = kq7.a;
            nq7 f4 = pna.f(kq7Var, 1.0f);
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f4);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            String str2 = pc9Var.a;
            oyb oybVar = r0f.A(rv4Var2).j;
            long j = r0f.y(rv4Var2).q;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > f) {
                f2 = f;
            } else {
                f2 = 1.0f;
            }
            cvb.c(str2, l0e.u(new we6(f2, false)), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, 0, 24576, 114680);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            int i12 = pc9Var.b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        str = "";
                    } else {
                        str = "ORG";
                    }
                } else {
                    str = "LOC";
                }
            } else {
                str = "PER";
            }
            Y(str, null, rv4Var, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            Y(String.valueOf(pc9Var.c), null, rv4Var, 0);
            rv4Var.q(true);
            String str3 = pc9Var.d;
            if (str3 == null) {
                str3 = "";
            }
            cvb.c(str3, pna.f(kq7Var, 1.0f), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).j, rv4Var, 48, 0, 131064);
            s21.x(rv4Var, true, kq7Var, 8.0f, rv4Var);
            xn1 a5 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, kq7Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a5);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            vt4Var4 = vt4Var3;
            nk5.a(rp5.c((wk3) jk3.H.getValue(), rv4Var, 0), null, zbe.y(lbe.f(15, vt4Var4, a82.g(rv4Var, 2.0f, tte.k(pna.n(kq7Var, 32.0f), uu9.a), ba5Var), null, false), 6.0f), r0f.y(rv4Var).w, rv4Var, 48, 0);
            xbe.i(rv4Var, pna.h(kq7Var, 6.0f));
            cvb.c(yqe.A((y3b) k3b.G0.getValue(), rv4Var), zbe.z(lbe.f(15, vt4Var2, nmd.v(kq7Var, r0f.y(rv4Var).a, r0f.z(rv4Var).b), null, false), 8.0f, 4.0f), r0f.y(rv4Var).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, r0f.A(rv4Var).l, rv4Var, 0, 24576, 114680);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new wp0(pc9Var, nq7Var, vt4Var, vt4Var2, vt4Var4, i, 15);
        }
    }

    public static final isc a0(isc iscVar) {
        iscVar.getClass();
        t76 t76Var = iscVar.b;
        t76Var.getClass();
        t76 t76Var2 = ((w76) t76Var.b().get(0)).b;
        t76Var2.getClass();
        w66 e = t76Var2.e();
        e.getClass();
        return new isc((gi1) e, t76Var2);
    }

    public static byte[] b0(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i;
        int i2;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i3 = i + 32;
        if (uuidArr != null) {
            i3 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.putInt(i3);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i2 = 16777216;
        } else {
            i2 = 0;
        }
        allocate.putInt(i2);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    public static final nq7 c0(rv4 rv4Var, nq7 nq7Var) {
        tza tzaVar = j27.a;
        return zbe.y(nmd.v(tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 16.0f);
    }

    public static boolean d0(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean e0 = e0(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return e0;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean e0(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final String g0(double d2) {
        int i = (int) d2;
        return i + "." + ((int) ((d2 - i) * 10.0d));
    }

    public static File h0(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static MappedByteBuffer i0(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
        FileChannel channel = fileInputStream.getChannel();
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
        fileInputStream.close();
        openFileDescriptor.close();
        return map;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [fz4, java.lang.Object] */
    public static fz4 j0(byte[] bArr) {
        km8 km8Var = new km8(bArr);
        if (km8Var.c < 32) {
            return null;
        }
        km8Var.M(0);
        int a2 = km8Var.a();
        int m = km8Var.m();
        if (m != a2) {
            st0.w("PsshAtomUtil", "Advertised atom size (" + m + ") does not match buffer size: " + a2);
            return null;
        }
        int m2 = km8Var.m();
        if (m2 != 1886614376) {
            a82.y("Atom type is not pssh: ", "PsshAtomUtil", m2);
            return null;
        }
        int e = nu0.e(km8Var.m());
        if (e > 1) {
            a82.y("Unsupported pssh version: ", "PsshAtomUtil", e);
            return null;
        }
        UUID uuid = new UUID(km8Var.t(), km8Var.t());
        if (e == 1) {
            int D = km8Var.D();
            UUID[] uuidArr = new UUID[D];
            for (int i = 0; i < D; i++) {
                uuidArr[i] = new UUID(km8Var.t(), km8Var.t());
            }
        }
        int D2 = km8Var.D();
        int a3 = km8Var.a();
        if (D2 != a3) {
            st0.w("PsshAtomUtil", "Atom data size (" + D2 + ") does not match the bytes left: " + a3);
            return null;
        }
        km8Var.k(new byte[D2], 0, D2);
        ?? obj = new Object();
        obj.a = uuid;
        return obj;
    }

    public static final long k0(int i, int i2) {
        long j = (i * 12) + i2;
        long j2 = j / 12;
        if (-2147483648L <= j2 && j2 <= 2147483647L) {
            return j;
        }
        p1a.k(hl5.i(i, i2, "The total number of years in ", " years and ", " months overflows an Int"));
        return 0L;
    }

    public static void l0(View view, float[] fArr, float[] fArr2, int[] iArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            l0((View) parent, fArr, fArr2, iArr);
            eh.m(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            eh.m(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            eh.m(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            eh.m(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            fre.s(matrix, fArr2);
            eh.x(fArr, fArr2);
        }
    }

    public static e9e m0(Object obj) {
        if (obj == null) {
            return e9e.v;
        }
        if (obj instanceof String) {
            return new p9e((String) obj);
        }
        if (obj instanceof Double) {
            return new g4e((Double) obj);
        }
        if (obj instanceof Long) {
            return new g4e(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new g4e(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new v1e((Boolean) obj);
        }
        if (obj instanceof Map) {
            q7e q7eVar = new q7e();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                e9e m0 = m0(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    q7eVar.c((String) obj2, m0);
                }
            }
            return q7eVar;
        } else if (obj instanceof List) {
            w0e w0eVar = new w0e();
            for (Object obj3 : (List) obj) {
                w0eVar.k(w0eVar.i(), m0(obj3));
            }
            return w0eVar;
        } else {
            vs.m("Invalid value type");
            return null;
        }
    }

    public static e9e n0(ove oveVar) {
        if (oveVar == null) {
            return e9e.u;
        }
        int B = oveVar.B() - 1;
        if (B != 1) {
            if (B != 2) {
                if (B != 3) {
                    if (B == 4) {
                        List<ove> t = oveVar.t();
                        ArrayList arrayList = new ArrayList();
                        for (ove oveVar2 : t) {
                            arrayList.add(n0(oveVar2));
                        }
                        return new j9e(oveVar.u(), arrayList);
                    }
                    vs.m("Unknown type found. Cannot convert entity");
                    return null;
                } else if (oveVar.x()) {
                    return new v1e(Boolean.valueOf(oveVar.y()));
                } else {
                    return new v1e(null);
                }
            } else if (oveVar.z()) {
                return new g4e(Double.valueOf(oveVar.A()));
            } else {
                return new g4e(null);
            }
        } else if (oveVar.v()) {
            return new p9e(oveVar.w());
        } else {
            return e9e.B;
        }
    }

    @Override // defpackage.yq2
    public byte A() {
        f0();
        throw null;
    }

    @Override // defpackage.yq2
    public short B() {
        f0();
        throw null;
    }

    @Override // defpackage.yq2
    public float C() {
        f0();
        throw null;
    }

    @Override // defpackage.fx1
    public long D(o9a o9aVar, int i) {
        o9aVar.getClass();
        return v();
    }

    @Override // defpackage.yq2
    public double E() {
        f0();
        throw null;
    }

    @Override // defpackage.fx1
    public yq2 a(u59 u59Var, int i) {
        u59Var.getClass();
        return p(u59Var.i(i));
    }

    @Override // defpackage.yq2
    public boolean b() {
        f0();
        throw null;
    }

    @Override // defpackage.yq2
    public char c() {
        f0();
        throw null;
    }

    @Override // defpackage.fx1
    public float e(o9a o9aVar, int i) {
        o9aVar.getClass();
        return C();
    }

    public void f0() {
        throw new IllegalArgumentException(cm9.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.fx1
    public double g(u59 u59Var, int i) {
        u59Var.getClass();
        return E();
    }

    @Override // defpackage.fx1
    public char h(u59 u59Var, int i) {
        u59Var.getClass();
        return c();
    }

    @Override // defpackage.fx1
    public byte j(u59 u59Var, int i) {
        u59Var.getClass();
        return A();
    }

    @Override // defpackage.fx1
    public String k(o9a o9aVar, int i) {
        o9aVar.getClass();
        return s();
    }

    @Override // defpackage.yq2
    public int l() {
        f0();
        throw null;
    }

    @Override // defpackage.fx1
    public short m(u59 u59Var, int i) {
        u59Var.getClass();
        return B();
    }

    @Override // defpackage.fx1
    public void n(o9a o9aVar) {
        o9aVar.getClass();
    }

    @Override // defpackage.yq2
    public yq2 p(o9a o9aVar) {
        o9aVar.getClass();
        return this;
    }

    @Override // defpackage.fx1
    public Object q(o9a o9aVar, int i, s76 s76Var, Object obj) {
        o9aVar.getClass();
        s76Var.getClass();
        return d(s76Var);
    }

    @Override // defpackage.fx1
    public int r(o9a o9aVar, int i) {
        o9aVar.getClass();
        return l();
    }

    @Override // defpackage.yq2
    public String s() {
        f0();
        throw null;
    }

    @Override // defpackage.yq2
    public fx1 t(o9a o9aVar) {
        o9aVar.getClass();
        return this;
    }

    @Override // defpackage.yq2
    public int u(o9a o9aVar) {
        o9aVar.getClass();
        f0();
        throw null;
    }

    @Override // defpackage.yq2
    public long v() {
        f0();
        throw null;
    }

    @Override // defpackage.yq2
    public boolean w() {
        return true;
    }

    @Override // defpackage.fx1
    public Object x(o9a o9aVar, int i, s76 s76Var, Object obj) {
        o9aVar.getClass();
        s76Var.getClass();
        if (!s76Var.e().c() && !w()) {
            return null;
        }
        return d(s76Var);
    }

    @Override // defpackage.fx1
    public boolean z(o9a o9aVar, int i) {
        o9aVar.getClass();
        return b();
    }
}
