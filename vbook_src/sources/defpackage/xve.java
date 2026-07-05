package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xve  reason: default package */
/* loaded from: classes3.dex */
public abstract class xve {
    public static final tu1 a = new tu1(new ev1(12), false, 486535913);
    public static final qm1 b = qm1.E;
    public static final qm1 c = qm1.e;
    public static final float d = 0.1f;
    public static final qm1 e = qm1.f;
    public static final float f = 0.38f;
    public static final float g = 1.0f;
    public static final qm1 h = qm1.b;
    public static final Object i = new Object();
    public static ar5 j;

    /* JADX WARN: Removed duplicated region for block: B:98:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.s10 r16, defpackage.nq7 r17, defpackage.dc r18, defpackage.w22 r19, defpackage.rv4 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xve.a(s10, nq7, dc, w22, rv4, int, int):void");
    }

    public static final void b(Object obj, io5 io5Var, nq7 nq7Var, w22 w22Var, rv4 rv4Var, int i2, int i3) {
        nk0 nk0Var = kh5.d;
        if ((i3 & 64) != 0) {
            nk0Var = kh5.e;
        }
        int i4 = i2 >> 3;
        nk0 nk0Var2 = nk0Var;
        a(new s10(obj, (g10) rv4Var.j(ct6.a), io5Var), nq7Var, nk0Var2, w22Var, rv4Var, (i4 & 3670016) | (i4 & 896) | 48 | (458752 & i4), 0);
    }

    public static final n07 c(String str) {
        List list;
        Locale locale;
        Pattern compile = Pattern.compile("[-_]");
        compile.getClass();
        k4b.w0(0);
        Matcher matcher = compile.matcher(str);
        if (!matcher.find()) {
            list = tl1.A(str.toString());
        } else {
            ArrayList arrayList = new ArrayList(10);
            int i2 = 0;
            do {
                arrayList.add(str.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(i2, str.length()).toString());
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!k4b.j0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    locale = new Locale((String) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2));
                } else {
                    locale = new Locale((String) arrayList2.get(0), (String) arrayList2.get(1));
                }
            } else {
                locale = new Locale((String) arrayList2.get(0));
            }
        } else {
            locale = new Locale("");
        }
        return new n07(locale, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [ls3] */
    /* JADX WARN: Type inference failed for: r53v0, types: [rv4] */
    public static final void d(xl0 xl0Var, cm0 cm0Var, oyb oybVar, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        List list;
        boolean z2;
        oyb oybVar2;
        LinkedHashSet<String> linkedHashSet;
        int n;
        int n2;
        long q;
        LinkedHashMap linkedHashMap;
        int i4;
        int i5;
        boolean h2;
        int i6;
        int i7;
        rv4Var.g0(-463566390);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(xl0Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h2 = rv4Var.f(cm0Var);
            } else {
                h2 = rv4Var.h(cm0Var);
            }
            if (h2) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(oybVar)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            p71 p71Var = ((e81) rv4Var.j(jt6.a)).a;
            mu4 mu4Var = (mu4) rv4Var.j(iu6.a);
            xt4 xt4Var = (xt4) rv4Var.j(ip6.a);
            if (xl0Var.b.b()) {
                list = cm0Var.b;
            } else {
                list = ks3.a;
            }
            List<iyb> list2 = list;
            String str = cm0Var.a;
            long j2 = p71Var.n;
            long j3 = p71Var.o;
            long j4 = p71Var.a;
            long b2 = zl1.b(0.18f, j4);
            long j5 = p71Var.u;
            boolean f2 = rv4Var.f(str) | rv4Var.f(list2);
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (f2 || P == obj) {
                P = new LinkedHashSet();
                rv4Var.o0(P);
            }
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) P;
            boolean f3 = rv4Var.f(str) | rv4Var.f(list2);
            int i8 = i3 & 896;
            int i9 = i3;
            if (i8 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean e2 = f3 | z2 | rv4Var.e(j2) | rv4Var.e(j3) | rv4Var.e(b2) | rv4Var.e(j4) | rv4Var.e(j5) | rv4Var.f(xt4Var);
            Object P2 = rv4Var.P();
            if (!e2 && P2 != obj) {
                oybVar2 = oybVar;
                linkedHashSet = linkedHashSet2;
            } else {
                linkedHashSet2.clear();
                gpb gpbVar = gva.a;
                str.getClass();
                list2.getClass();
                oybVar.getClass();
                int length = str.length();
                oybVar2 = oybVar;
                List<fva> b3 = gva.b(list2, j2, b2, j4, j5, oybVar2.a.m);
                uva uvaVar = new uva(j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, gpb.c, null, 61438);
                d89 d89Var = null;
                lvb lvbVar = new lvb(uvaVar, null, null, null);
                if (xt4Var != null) {
                    d89Var = new d89(xt4Var, 5);
                }
                ns nsVar = new ns();
                nsVar.f(str);
                for (fva fvaVar : b3) {
                    int n3 = dce.n(fvaVar.a, 0, length);
                    int n4 = dce.n(fvaVar.b, n3, length);
                    if (n3 < n4) {
                        nsVar.b(n3, n4, fvaVar.c);
                    }
                }
                for (iyb iybVar : list2) {
                    tva tvaVar = iybVar.c;
                    int i10 = iybVar.b;
                    int i11 = iybVar.a;
                    if (tvaVar instanceof pva) {
                        int n5 = dce.n(i11, 0, length);
                        int n6 = dce.n(i10, n5, length);
                        if (n5 < n6) {
                            nsVar.c.add(new ms(n5, n6, 8, new ep6(((pva) tvaVar).a, lvbVar, d89Var), null));
                        }
                    } else if ((tvaVar instanceof mva) && n < (n2 = dce.n(i10, (n = dce.n(i11, 0, length)), length)) && str.charAt(n) == 65532) {
                        String str2 = ((mva) tvaVar).a;
                        str2.getClass();
                        linkedHashSet2.add(str2);
                        nsVar.a("androidx.compose.foundation.text.inlineContent", n, n2, "emoji:".concat(str2));
                    }
                }
                linkedHashSet = linkedHashSet2;
                P2 = nsVar.k();
                rv4Var.o0(P2);
            }
            ps psVar = (ps) P2;
            uva uvaVar2 = oybVar2.a;
            pl8 pl8Var = oybVar2.b;
            long j6 = uvaVar2.b;
            long j7 = e4c.c;
            if (!e4c.a(j6, j7)) {
                q = oybVar2.a.b;
            } else if (!e4c.a(pl8Var.c, j7)) {
                q = pl8Var.c;
            } else {
                q = zr1.q(14);
            }
            boolean f4 = rv4Var.f(sl1.C0(linkedHashSet)) | rv4Var.e(q) | rv4Var.f(mu4Var);
            Object P3 = rv4Var.P();
            LinkedHashMap linkedHashMap2 = P3;
            if (f4 || P3 == obj) {
                if (mu4Var == null) {
                    linkedHashMap = ls3.a;
                } else {
                    int k = p17.k(tl1.s(linkedHashSet, 10));
                    if (k < 16) {
                        k = 16;
                    }
                    linkedHashMap = new LinkedHashMap(k);
                    for (String str3 : linkedHashSet) {
                        long j8 = q;
                        linkedHashMap.put(s21.m("emoji:", str3), new uv5(new pw8(j8, q, 4), new tu1(new t81(8, mu4Var, str3), true, -1106476088)));
                        q = j8;
                    }
                }
                rv4Var.o0(linkedHashMap);
                linkedHashMap2 = linkedHashMap;
            }
            qye.a(psVar, nq7Var, oybVar2, null, 0, false, 0, 0, (Map) linkedHashMap2, rv4Var, ((i9 >> 6) & Token.ASSIGN_MOD) | i8, 0, 1784);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90((Object) xl0Var, (Object) cm0Var, (Object) oybVar, (Object) nq7Var, i2, 18, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x034f, code lost:
        if (r10.f(r8) != false) goto L420;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0519 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0569 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0647 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0712 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x074e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x095a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0a1f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0a98 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0b8e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0b96  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.xl0 r77, boolean r78, defpackage.oyb r79, defpackage.nq7 r80, defpackage.zl0 r81, defpackage.rv4 r82, int r83) {
        /*
            Method dump skipped, instructions count: 3254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xve.e(xl0, boolean, oyb, nq7, zl0, rv4, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(qo3 qo3Var, String str, List list, loa loaVar, boolean z, xl0 xl0Var, String str2, ppb ppbVar, zl0 zl0Var, int i2) {
        boolean equals;
        if (!qo3Var.b) {
            return;
        }
        ioa ioaVar = null;
        if (str != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ioa) next).a.equals(str)) {
                    ioaVar = next;
                    break;
                }
            }
            ioaVar = ioaVar;
        }
        if (!z) {
            String str3 = xl0Var.a;
            if (str2 == null) {
                equals = false;
            } else {
                equals = str2.equals(str3);
            }
            if (equals && ioaVar != null && loaVar != null) {
                ppbVar.a();
                loaVar.a(ioaVar);
                return;
            }
        }
        ppbVar.a();
        zl0Var.b(i2, xl0Var.a);
    }

    public static final void g(lhd lhdVar, nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2;
        int i4;
        boolean h2;
        int i5;
        lhdVar.getClass();
        nq7Var.getClass();
        rv4Var.g0(391156106);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = rv4Var.f(lhdVar);
            } else {
                h2 = rv4Var.h(lhdVar);
            }
            if (h2) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i6 = i3 | 384;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            lu4Var = xoe.d;
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            hc2.b(nq7Var2, null, jce.E(356349152, new qo4(lhdVar, 2), rv4Var), rv4Var2, ((i6 >> 3) & 14) | 3072, 6);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new igc(lhdVar, nq7Var2, lu4Var, i2);
        }
    }

    public static Object h(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final boolean i(mza mzaVar, int i2, gu8 gu8Var) {
        boolean z;
        synchronized (i) {
            int i3 = mzaVar.d;
            if (i3 == i2) {
                mzaVar.c = gu8Var;
                z = true;
                mzaVar.d = i3 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static long j(Context context, int i2) {
        return sve.b(context.getResources().getColor(i2, context.getTheme()));
    }

    public static final mza k(tra traVar) {
        mza mzaVar = traVar.a;
        mzaVar.getClass();
        return (mza) dra.t(mzaVar, traVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.te5 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.cy9
            if (r0 == 0) goto L13
            r0 = r5
            cy9 r0 = (defpackage.cy9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cy9 r0 = new cy9
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            te5 r4 = r0.a
            defpackage.hre.r(r5)
            goto L4b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            boolean r5 = r4 instanceof defpackage.dy9
            if (r5 == 0) goto L36
            return r4
        L36:
            oh5 r5 = r4.d()
            s11 r5 = r5.b()
            r0.a = r4
            r0.c = r2
            java.lang.Object r5 = defpackage.v9e.J(r5, r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L4b
            return r0
        L4b:
            psa r5 = (defpackage.psa) r5
            r5.getClass()
            r0 = -1
            byte[] r5 = defpackage.pbe.n(r5, r0)
            dy9 r0 = new dy9
            re5 r1 = r4.a
            fh5 r2 = r4.c()
            oh5 r4 = r4.d()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xve.l(te5, n42):java.lang.Object");
    }
}
