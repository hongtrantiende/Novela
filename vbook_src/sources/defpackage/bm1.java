package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.media.MediaBrowserServiceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bm1  reason: default package */
/* loaded from: classes.dex */
public class bm1 implements oa4, zc4, nl8, na4, x7b, ye6, a2e {
    public static final bl8 C = new bl8(0);
    public static final al8 D = new Object();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    public bm1(ps psVar, oyb oybVar, List list, r13 r13Var, do4 do4Var) {
        List list2;
        int i;
        String str;
        ks3 ks3Var;
        String str2;
        ps psVar2 = psVar;
        oyb oybVar2 = oybVar;
        this.a = 15;
        this.b = psVar2;
        this.c = list;
        int i2 = 0;
        vt4 vt4Var = new vt4(this) { // from class: jt7
            public final /* synthetic */ bm1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.vt4
            public final Object invoke() {
                int i3 = r2;
                float f = nae.e;
                ml8 ml8Var = null;
                int i4 = 1;
                bm1 bm1Var = this.b;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) bm1Var.f;
                        if (!arrayList.isEmpty()) {
                            Object obj = arrayList.get(0);
                            float h = ((ml8) obj).a.h();
                            int size = arrayList.size() - 1;
                            Object obj2 = obj;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i4);
                                    float h2 = ((ml8) obj3).a.h();
                                    obj = obj2;
                                    if (Float.compare(h, h2) < 0) {
                                        obj = obj3;
                                        h = h2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                        obj2 = obj;
                                    }
                                }
                            }
                            ml8Var = obj;
                        }
                        ml8 ml8Var2 = ml8Var;
                        if (ml8Var2 != null) {
                            f = ml8Var2.a.h();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) bm1Var.f;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float c = ((ml8) obj4).a.E.c();
                            int size2 = arrayList2.size() - 1;
                            Object obj5 = obj4;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i4);
                                    float c2 = ((ml8) obj6).a.E.c();
                                    obj4 = obj5;
                                    if (Float.compare(c, c2) < 0) {
                                        obj4 = obj6;
                                        c = c2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                        obj5 = obj4;
                                    }
                                }
                            }
                            ml8Var = obj4;
                        }
                        ml8 ml8Var3 = ml8Var;
                        if (ml8Var3 != null) {
                            f = ml8Var3.a.E.c();
                        }
                        return Float.valueOf(f);
                }
            }
        };
        sk6 sk6Var = sk6.c;
        this.d = ipe.x(sk6Var, vt4Var);
        this.e = ipe.x(sk6Var, new vt4(this) { // from class: jt7
            public final /* synthetic */ bm1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.vt4
            public final Object invoke() {
                int i3 = r2;
                float f = nae.e;
                ml8 ml8Var = null;
                int i4 = 1;
                bm1 bm1Var = this.b;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) bm1Var.f;
                        if (!arrayList.isEmpty()) {
                            Object obj = arrayList.get(0);
                            float h = ((ml8) obj).a.h();
                            int size = arrayList.size() - 1;
                            Object obj2 = obj;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i4);
                                    float h2 = ((ml8) obj3).a.h();
                                    obj = obj2;
                                    if (Float.compare(h, h2) < 0) {
                                        obj = obj3;
                                        h = h2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                        obj2 = obj;
                                    }
                                }
                            }
                            ml8Var = obj;
                        }
                        ml8 ml8Var2 = ml8Var;
                        if (ml8Var2 != null) {
                            f = ml8Var2.a.h();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) bm1Var.f;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float c = ((ml8) obj4).a.E.c();
                            int size2 = arrayList2.size() - 1;
                            Object obj5 = obj4;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i4);
                                    float c2 = ((ml8) obj6).a.E.c();
                                    obj4 = obj5;
                                    if (Float.compare(c, c2) < 0) {
                                        obj4 = obj6;
                                        c = c2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                        obj5 = obj4;
                                    }
                                }
                            }
                            ml8Var = obj4;
                        }
                        ml8 ml8Var3 = ml8Var;
                        if (ml8Var3 != null) {
                            f = ml8Var3.a.E.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        pl8 pl8Var = oybVar2.b;
        ps psVar3 = qs.a;
        ArrayList arrayList = psVar2.d;
        String str3 = psVar2.b;
        ks3 ks3Var2 = ks3.a;
        if (arrayList != null) {
            list2 = sl1.u0(arrayList, new kn4(11));
        } else {
            list2 = ks3Var2;
        }
        ArrayList arrayList2 = new ArrayList();
        rz rzVar = new rz();
        int size = list2.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            os osVar = (os) list2.get(i3);
            os a = os.a(osVar, pl8Var.b((pl8) osVar.a), i2, i2, 14);
            Object obj = a.a;
            int i5 = a.c;
            int i6 = a.b;
            while (i4 < i6 && !rzVar.isEmpty()) {
                os osVar2 = (os) rzVar.last();
                List list3 = list2;
                int i7 = osVar2.c;
                ks3 ks3Var3 = ks3Var2;
                Object obj2 = osVar2.a;
                if (i6 < i7) {
                    arrayList2.add(new os(obj2, i4, i6));
                    i4 = i6;
                    list2 = list3;
                    ks3Var2 = ks3Var3;
                } else {
                    int i8 = size;
                    arrayList2.add(new os(obj2, i4, i7));
                    i4 = osVar2.c;
                    while (!rzVar.isEmpty() && i4 == ((os) rzVar.last()).c) {
                        rzVar.removeLast();
                    }
                    list2 = list3;
                    ks3Var2 = ks3Var3;
                    size = i8;
                }
            }
            List list4 = list2;
            ks3 ks3Var4 = ks3Var2;
            int i9 = size;
            if (i4 < i6) {
                arrayList2.add(new os(pl8Var, i4, i6));
                i4 = i6;
            }
            os osVar3 = (os) rzVar.g();
            if (osVar3 != null) {
                int i10 = osVar3.c;
                Object obj3 = osVar3.a;
                int i11 = osVar3.b;
                if (i11 == i6 && i10 == i5) {
                    rzVar.removeLast();
                    rzVar.addLast(new os(((pl8) obj3).b((pl8) obj), i6, i5));
                } else if (i11 == i10) {
                    arrayList2.add(new os(obj3, i11, i10));
                    rzVar.removeLast();
                    rzVar.addLast(new os(obj, i6, i5));
                } else if (i10 >= i5) {
                    rzVar.addLast(new os(((pl8) obj3).b((pl8) obj), i6, i5));
                } else {
                    p1a.g();
                    throw null;
                }
            } else {
                rzVar.addLast(new os(obj, i6, i5));
            }
            i3++;
            list2 = list4;
            ks3Var2 = ks3Var4;
            size = i9;
            i2 = 0;
        }
        ks3 ks3Var5 = ks3Var2;
        while (i4 <= str3.length() && !rzVar.isEmpty()) {
            os osVar4 = (os) rzVar.last();
            Object obj4 = osVar4.a;
            int i12 = osVar4.c;
            arrayList2.add(new os(obj4, i4, i12));
            while (!rzVar.isEmpty() && i12 == ((os) rzVar.last()).c) {
                rzVar.removeLast();
            }
            i4 = i12;
        }
        if (i4 < str3.length()) {
            arrayList2.add(new os(pl8Var, i4, str3.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new os(pl8Var, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i13 = i;
        while (i13 < size2) {
            os osVar5 = (os) arrayList2.get(i13);
            int i14 = osVar5.b;
            int i15 = osVar5.c;
            if (i14 != i15) {
                str = str3.substring(i14, i15);
            } else {
                str = "";
            }
            List a2 = qs.a(psVar2, i14, i15, new y4(16));
            ps psVar4 = new ps(str, a2 == null ? ks3Var5 : a2);
            pl8 pl8Var2 = (pl8) osVar5.a;
            if (pl8Var2.b == 0) {
                pl8Var2 = pl8.a(pl8Var2, 0, pl8Var.b, 0L, null, null, 509);
            }
            oyb oybVar3 = new oyb(oybVar2.a, pl8Var.b(pl8Var2));
            ?? r1 = psVar4.a;
            if (r1 == 0) {
                ks3Var = ks3Var5;
            } else {
                ks3Var = r1;
            }
            List list5 = (List) this.c;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i16 = 0;
            while (i16 < size3) {
                List list6 = list5;
                os osVar6 = (os) list5.get(i16);
                int i17 = i16;
                int i18 = osVar6.b;
                pl8 pl8Var3 = pl8Var;
                int i19 = osVar6.c;
                if (qs.b(i14, i15, i18, i19)) {
                    if (i14 > i18 || i19 > i15) {
                        mv5.a("placeholder can not overlap with paragraph.");
                    }
                    str2 = str3;
                    arrayList4.add(new os(osVar6.a, i18 - i14, i19 - i14));
                } else {
                    str2 = str3;
                }
                i16 = i17 + 1;
                list5 = list6;
                pl8Var = pl8Var3;
                str3 = str2;
            }
            arrayList3.add(new ml8(new wj(str, oybVar3, ks3Var, arrayList4, do4Var, r13Var), i14, i15));
            i13++;
            psVar2 = psVar;
            oybVar2 = oybVar;
        }
        this.f = arrayList3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:111|112|113|114|115) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d9, code lost:
        if (r3 == r14) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02c6, code lost:
        r30 = r4;
        r31 = r8;
        r32 = r9;
        r34 = r10;
        r33 = r11;
        r29 = r13;
        r35 = r15;
        r0 = defpackage.hn8.f(r7, "c" + r14 + ".html");
        r2 = defpackage.pe4.a;
        r2.getClass();
        r2 = new defpackage.lj9(r2.g1(r0, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02f6, code lost:
        r2.write(defpackage.r4b.H(r3.a0().x()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0305, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0308, code lost:
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x030b, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x030d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x030f, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0313, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0314, code lost:
        defpackage.pye.e(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0317, code lost:
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03a6  */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r15v13, types: [d76] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List, hn8, java.util.Iterator, ad7, cd7, hd7, java.lang.String, mu4, hk2] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v11, types: [lj9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x03ba -> B:101:0x03b7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0457 -> B:117:0x0473). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0389 -> B:97:0x039c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object H(java.lang.String r52, java.util.Map r53, defpackage.n42 r54) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.H(java.lang.String, java.util.Map, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:58|59|60|61|62) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:34|(1:36)|37|38|39|40|41|42|(1:54)(2:44|(9:53|22|(0)(0)|25|(0)(0)|28|29|30|(6:68|(1:70)(2:83|(2:85|(4:86|(1:88)|89|(1:92)(1:91)))(0))|71|(1:73)(1:82)|74|(2:76|(1:79)(3:78|12|13))(2:80|81))(0))(2:48|(2:50|51)(12:52|18|(0)|21|22|(0)(0)|25|(0)(0)|28|29|30|(0)(0))))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0164, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0166, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0168, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016d, code lost:
        defpackage.pye.e(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0170, code lost:
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e7  */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [uuc, java.util.List, hn8, java.util.Iterator, java.lang.String, mu4, hk2] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01c0 -> B:52:0x01cb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01e4 -> B:57:0x01f0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object I(java.lang.String r43, java.util.Map r44, defpackage.n42 r45) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.I(java.lang.String, java.util.Map, n42):java.lang.Object");
    }

    public static Object P(ad7 ad7Var) {
        Object obj;
        String str = "";
        String str2 = null;
        int i = 0;
        if (ad7Var instanceof y66) {
            y66 y66Var = (y66) ad7Var;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = y66Var.n;
            if (linkedHashMap != null) {
                if (linkedHashMap.get(new Integer(0)) == null) {
                    ArrayList arrayList2 = y66Var.m;
                    if (arrayList2 != null) {
                        z66 z66Var = (z66) sl1.e0(arrayList2);
                        if (z66Var != null) {
                            cd7 cd7Var = new cd7();
                            String h = y66Var.h(z66Var);
                            qa5 qa5Var = qa5.a;
                            cp3 cp3Var = (cp3) qa5.f(h).Q().b();
                            if (cp3Var != null) {
                                str2 = cp3Var.Z();
                            }
                            if (str2 != null) {
                                str = str2;
                            }
                            cd7Var.b = str;
                            cd7Var.a = "0:".concat(z66Var.e);
                            arrayList.add(cd7Var);
                        }
                    } else {
                        c16.w("sections");
                        throw null;
                    }
                }
                ArrayList arrayList3 = y66Var.k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i < size) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        Q(arrayList, (xgb) obj2);
                    }
                }
                return arrayList;
            }
            c16.w("sectionIdMap");
            throw null;
        } else if (ad7Var instanceof a76) {
            a76 a76Var = (a76) ad7Var;
            ArrayList arrayList4 = new ArrayList();
            LinkedHashMap linkedHashMap2 = a76Var.s;
            if (linkedHashMap2 != null) {
                if (linkedHashMap2.get(new Integer(0)) == null) {
                    ArrayList arrayList5 = a76Var.r;
                    if (arrayList5 != null) {
                        int size2 = arrayList5.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                obj = arrayList5.get(i2);
                                i2++;
                                if (((e76) obj).g.length() > 0) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        e76 e76Var = (e76) obj;
                        if (e76Var != null) {
                            cd7 cd7Var2 = new cd7();
                            String h2 = a76Var.h(e76Var);
                            qa5 qa5Var2 = qa5.a;
                            cp3 cp3Var2 = (cp3) qa5.f(h2).Q().b();
                            if (cp3Var2 != null) {
                                str2 = cp3Var2.Z();
                            }
                            if (str2 != null) {
                                str = str2;
                            }
                            cd7Var2.b = str;
                            cd7Var2.a = "0:".concat(e76Var.g);
                            arrayList4.add(cd7Var2);
                        }
                    } else {
                        c16.w("sections");
                        throw null;
                    }
                }
                ArrayList arrayList6 = a76Var.k;
                if (arrayList6 != null) {
                    int size3 = arrayList6.size();
                    while (i < size3) {
                        Object obj3 = arrayList6.get(i);
                        i++;
                        R(arrayList4, (xgb) obj3);
                    }
                }
                return arrayList4;
            }
            c16.w("sectionIdMap");
            throw null;
        } else {
            return ks3.a;
        }
    }

    public static final void Q(ArrayList arrayList, xgb xgbVar) {
        boolean z;
        cd7 cd7Var = new cd7();
        cd7Var.b = xgbVar.a;
        int size = arrayList.size();
        String str = xgbVar.b;
        cd7Var.a = size + ":" + str;
        List<xgb> list = xgbVar.c;
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        cd7Var.c = z;
        cd7 cd7Var2 = (cd7) sl1.k0(arrayList);
        if (cd7Var2 != null && cd7Var2.c) {
            String str2 = cd7Var2.a;
            String D0 = k4b.D0(str2, ":", str2);
            String str3 = cd7Var.a;
            if (D0.equals(k4b.D0(str3, ":", str3))) {
                cd7Var2.a = "skip:".concat(cd7Var2.a);
            }
        }
        if (cd7Var2 != null) {
            cd7Var2.d = cd7Var.a;
        }
        arrayList.add(cd7Var);
        if (list != null) {
            for (xgb xgbVar2 : list) {
                Q(arrayList, xgbVar2);
            }
        }
    }

    public static final void R(ArrayList arrayList, xgb xgbVar) {
        boolean z;
        cd7 cd7Var = new cd7();
        cd7Var.b = xgbVar.a;
        int size = arrayList.size();
        String str = xgbVar.b;
        cd7Var.a = size + ":" + str;
        List<xgb> list = xgbVar.c;
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        cd7Var.c = z;
        cd7 cd7Var2 = (cd7) sl1.k0(arrayList);
        if (cd7Var2 != null && cd7Var2.c) {
            String str2 = cd7Var2.a;
            String D0 = k4b.D0(str2, ":", str2);
            String str3 = cd7Var.a;
            if (D0.equals(k4b.D0(str3, ":", str3))) {
                cd7Var2.a = "skip:".concat(cd7Var2.a);
            }
        }
        if (cd7Var2 != null) {
            cd7Var2.d = cd7Var.a;
        }
        arrayList.add(cd7Var);
        if (list != null) {
            for (xgb xgbVar2 : list) {
                R(arrayList, xgbVar2);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(1:(1:(1:(1:(7:13|14|15|16|d0|24|25)(2:42|43))(6:44|45|46|a1|24|25))(6:56|57|58|(1:60)|46|a1))(2:61|62))(3:67|68|(2:70|71))|63|(2:65|66)|58|(0)|46|a1))|81|6|7|(0)(0)|63|(0)|58|(0)|46|a1|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
        r13 = new defpackage.lad(r11);
        r0.a = r10;
        r0.b = null;
        r0.c = r12;
        r0.f = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
        if (r9.p(r12, r13, r0) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
        r11 = r10;
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ea, code lost:
        r11 = r10;
        r10 = r12;
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f7, code lost:
        if (r10.a.isEmpty() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f9, code lost:
        ((java.util.LinkedHashMap) r9.c).remove(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0104, code lost:
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.bm1 r9, java.lang.String r10, defpackage.fad r11, defpackage.x5 r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.m(bm1, java.lang.String, fad, x5, n42):java.lang.Object");
    }

    public static bm1 s(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        bm1 bm1Var = new bm1(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) bm1Var.e)) {
            try {
                ((ArrayDeque) bm1Var.e).clear();
                String string = ((SharedPreferences) bm1Var.b).getString((String) bm1Var.c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) bm1Var.d)) {
                    String[] split = string.split((String) bm1Var.d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) bm1Var.e).add(str);
                        }
                    }
                    return bm1Var;
                }
                return bm1Var;
            } finally {
            }
        }
    }

    public static ArrayList w(String str, List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                vv3 vv3Var = (vv3) obj;
                arrayList.add(new ji4(str, vv3Var.a, vv3Var.b));
                List list2 = vv3Var.c;
                arrayList.addAll(w(str + "#" + i, list2));
                i = i2;
            } else {
                tl1.M();
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0233 A[EDGE_INSN: B:156:0x0233->B:123:0x0233 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String y(defpackage.ad7 r29, defpackage.cd7 r30) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.y(ad7, cd7):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:18:0x0043, B:20:0x0049, B:23:0x0057, B:27:0x0061, B:28:0x0066), top: B:31:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #0 {all -> 0x0055, blocks: (B:18:0x0043, B:20:0x0049, B:23:0x0057, B:27:0x0061, B:28:0x0066), top: B:31:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qv3
            if (r0 == 0) goto L13
            r0 = r5
            qv3 r0 = (defpackage.qv3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qv3 r0 = new qv3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            sw7 r0 = r0.a
            defpackage.hre.r(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2e:
            defpackage.hre.r(r5)
            java.lang.Object r5 = r4.e
            sw7 r5 = (defpackage.sw7) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L55
            ov3 r5 = (defpackage.ov3) r5     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L57
            ov3 r5 = new ov3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L55
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L55
            r4.f = r5     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r4 = move-exception
            goto L67
        L57:
            java.lang.Object r4 = r4.f     // Catch: java.lang.Throwable -> L55
            ov3 r4 = (defpackage.ov3) r4     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L61
            r0.q(r3)
            return r4
        L61:
            java.lang.String r4 = "epubFile"
            defpackage.c16.w(r4)     // Catch: java.lang.Throwable -> L55
            throw r3     // Catch: java.lang.Throwable -> L55
        L67:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.A(n42):java.lang.Object");
    }

    public float B(int i, boolean z, boolean z2) {
        boolean z3;
        Bidi bidi;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        Layout layout = (Layout) this.b;
        if (!z2) {
            return z(i, z);
        }
        int n = lbe.n(layout, i, z2);
        int lineStart = layout.getLineStart(n);
        int lineEnd = layout.getLineEnd(n);
        if (i != lineStart && i != lineEnd) {
            return z(i, z);
        }
        if (i != 0 && i != layout.getText().length()) {
            int D2 = D(i, z2);
            if (layout.getParagraphDirection(layout.getLineForOffset(E(D2))) == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            int K = K(lineEnd, lineStart);
            int E = E(D2);
            int i5 = lineStart - E;
            int i6 = K - E;
            Bidi o = o(D2);
            if (o != null) {
                bidi = o.createLineBidi(i5, i6);
            } else {
                bidi = null;
            }
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                vc6[] vc6VarArr = new vc6[runCount];
                for (int i7 = 0; i7 < runCount; i7++) {
                    int runStart = bidi.getRunStart(i7) + lineStart;
                    int runLimit = bidi.getRunLimit(i7) + lineStart;
                    if (bidi.getRunLevel(i7) % 2 == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    vc6VarArr[i7] = new vc6(runStart, runLimit, z7);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i8 = 0; i8 < runCount2; i8++) {
                    bArr[i8] = (byte) bidi.getRunLevel(i8);
                }
                Bidi.reorderVisually(bArr, 0, vc6VarArr, 0, runCount);
                if (i == lineStart) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < runCount) {
                            if (vc6VarArr[i9].a == i) {
                                i4 = i9;
                                break;
                            }
                            i9++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    vc6 vc6Var = vc6VarArr[i4];
                    if (!z && z3 != vc6Var.c) {
                        z6 = z3;
                    } else if (!z3) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i4 == 0 && z6) {
                        return layout.getLineLeft(n);
                    }
                    if (i4 == runCount - 1 && !z6) {
                        return layout.getLineRight(n);
                    }
                    if (z6) {
                        return layout.getPrimaryHorizontal(vc6VarArr[i4 - 1].a);
                    }
                    return layout.getPrimaryHorizontal(vc6VarArr[i4 + 1].a);
                }
                if (i > K) {
                    i2 = K(i, lineStart);
                } else {
                    i2 = i;
                }
                int i10 = 0;
                while (true) {
                    if (i10 < runCount) {
                        if (vc6VarArr[i10].b == i2) {
                            i3 = i10;
                            break;
                        }
                        i10++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                vc6 vc6Var2 = vc6VarArr[i3];
                if (!z && z3 != vc6Var2.c) {
                    if (!z3) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = z3;
                }
                if (i3 == 0 && z5) {
                    return layout.getLineLeft(n);
                }
                if (i3 == runCount - 1 && !z5) {
                    return layout.getLineRight(n);
                }
                if (z5) {
                    return layout.getPrimaryHorizontal(vc6VarArr[i3 - 1].b);
                }
                return layout.getPrimaryHorizontal(vc6VarArr[i3 + 1].b);
            }
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                if (!z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (i == lineStart) {
                z4 = z3;
            } else if (!z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return layout.getLineLeft(n);
            }
            return layout.getLineRight(n);
        }
        return z(i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:18:0x0043, B:20:0x0049, B:23:0x006c, B:27:0x0076, B:28:0x007b), top: B:31:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #0 {all -> 0x006a, blocks: (B:18:0x0043, B:20:0x0049, B:23:0x006c, B:27:0x0076, B:28:0x007b), top: B:31:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ed7
            if (r0 == 0) goto L13
            r0 = r5
            ed7 r0 = (defpackage.ed7) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ed7 r0 = new ed7
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            sw7 r0 = r0.a
            defpackage.hre.r(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2e:
            defpackage.hre.r(r5)
            java.lang.Object r5 = r4.e
            sw7 r5 = (defpackage.sw7) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L6a
            ad7 r5 = (defpackage.ad7) r5     // Catch: java.lang.Throwable -> L6a
            if (r5 != 0) goto L6c
            id7 r5 = new id7     // Catch: java.lang.Throwable -> L6a
            m66 r5 = defpackage.pe4.a     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = defpackage.hn8.b     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6a
            r2 = 0
            hn8 r1 = defpackage.fn8.d(r1, r2)     // Catch: java.lang.Throwable -> L6a
            r5.getClass()     // Catch: java.lang.Throwable -> L6a
            java.io.File r5 = r1.toFile()     // Catch: java.lang.Throwable -> L6a
            qw5 r5 = defpackage.tl1.J(r5)     // Catch: java.lang.Throwable -> L6a
            ad7 r5 = defpackage.id7.a(r5)     // Catch: java.lang.Throwable -> L6a
            r4.f = r5     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r4 = move-exception
            goto L7c
        L6c:
            java.lang.Object r4 = r4.f     // Catch: java.lang.Throwable -> L6a
            ad7 r4 = (defpackage.ad7) r4     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L76
            r0.q(r3)
            return r4
        L76:
            java.lang.String r4 = "mobiBook"
            defpackage.c16.w(r4)     // Catch: java.lang.Throwable -> L6a
            throw r3     // Catch: java.lang.Throwable -> L6a
        L7c:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.C(n42):java.lang.Object");
    }

    public int D(int i, boolean z) {
        int i2;
        ArrayList arrayList = (ArrayList) this.f;
        int o = tl1.o(arrayList, Integer.valueOf(i));
        if (o < 0) {
            i2 = -(o + 1);
        } else {
            i2 = o + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int E(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f).get(i - 1)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r4 == r6) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(defpackage.hk2 r32, java.util.Map r33, defpackage.n42 r34) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.F(hk2, java.util.Map, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01ba -> B:44:0x01c1). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(defpackage.hk2 r41, java.util.Map r42, defpackage.n42 r43) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.G(hk2, java.util.Map, n42):java.lang.Object");
    }

    public boolean J() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        qf4 qf4Var = (qf4) this.c;
        qf4Var.a();
        Context context = qf4Var.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Token.CASE)).metaData) != null && bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public int K(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.b).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((c16.l(charAt, 8192) < 0 || c16.l(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, i7] */
    public i7 L(int i, int i2, int i3) {
        i7 i7Var = (i7) ((jt1) this.b).a();
        if (i7Var == null) {
            ?? obj = new Object();
            obj.a = i;
            obj.b = i2;
            obj.c = i3;
            return obj;
        }
        i7Var.a = i;
        i7Var.b = i2;
        i7Var.c = i3;
        return i7Var;
    }

    public void M() {
        v37 v37Var = new v37(this, (MediaBrowserServiceCompat) this.e);
        this.b = v37Var;
        v37Var.onCreate();
    }

    public void N(int i, int i2) {
        String str = (String) this.c;
        xf3 xf3Var = (xf3) this.b;
        vf9 vf9Var = (vf9) this.e;
        vf9Var.b = i;
        vf9Var.c = i2;
        vl9 vl9Var = (vl9) this.f;
        if (!vl9Var.a) {
            vl9Var.a = true;
            xf3Var.b.F.P0(1, str);
        }
        xf3.d((yl9) this.d, xf3Var, vf9Var, str, false);
    }

    public void O(int i, int i2) {
        vf9 vf9Var = (vf9) this.e;
        vf9Var.b = i;
        vf9Var.c = i2;
        xf3 xf3Var = (xf3) this.b;
        String str = (String) this.c;
        xf3.a(xf3Var, str);
        xf3.d((yl9) this.d, xf3Var, vf9Var, str, true);
        xf3Var.b.F.P0(4, str);
    }

    public void S(i7 i7Var) {
        xk9 xk9Var = (xk9) this.d;
        ((ArrayList) this.c).add(i7Var);
        int i = i7Var.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        xk9Var.o(i7Var.b, i7Var.c);
                        return;
                    } else {
                        cp8.s(i7Var, "Unknown update op type for ");
                        return;
                    }
                }
                xk9Var.i(i7Var.b, i7Var.c);
                return;
            }
            int i2 = i7Var.b;
            int i3 = i7Var.c;
            RecyclerView recyclerView = (RecyclerView) xk9Var.b;
            recyclerView.K(i2, i3, false);
            recyclerView.C0 = true;
            return;
        }
        xk9Var.m(i7Var.b, i7Var.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #4 {all -> 0x0090, blocks: (B:18:0x0043, B:20:0x0049, B:33:0x0087, B:36:0x0092, B:21:0x0066), top: B:41:0x0043 }] */
    /* JADX WARN: Type inference failed for: r1v6, types: [my0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object T(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ac5
            if (r0 == 0) goto L13
            r0 = r5
            ac5 r0 = (defpackage.ac5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ac5 r0 = new ac5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            sw7 r0 = r0.a
            defpackage.hre.r(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2e:
            defpackage.hre.r(r5)
            java.lang.Object r5 = r4.e
            sw7 r5 = (defpackage.sw7) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L90
            uc3 r5 = (defpackage.uc3) r5     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto L93
            m66 r5 = defpackage.pe4.a     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = defpackage.hn8.b     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L90
            r2 = 0
            hn8 r1 = defpackage.fn8.d(r1, r2)     // Catch: java.lang.Throwable -> L90
            r5.getClass()     // Catch: java.lang.Throwable -> L90
            java.io.File r5 = r1.toFile()     // Catch: java.lang.Throwable -> L90
            qw5 r5 = defpackage.tl1.J(r5)     // Catch: java.lang.Throwable -> L90
            my0 r1 = new my0     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r1.J(r5)     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = r1.N0()     // Catch: java.lang.Throwable -> L77
            r5.close()     // Catch: java.lang.Throwable -> L75
            r1.o()     // Catch: java.lang.Throwable -> L75
            r5 = r3
            goto L85
        L75:
            r5 = move-exception
            goto L85
        L77:
            r2 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L7f
            r1.o()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            r5 = move-exception
            defpackage.pye.e(r2, r5)     // Catch: java.lang.Throwable -> L90
        L83:
            r5 = r2
            r2 = r3
        L85:
            if (r5 != 0) goto L92
            qa5 r5 = defpackage.qa5.a     // Catch: java.lang.Throwable -> L90
            uc3 r5 = defpackage.qa5.f(r2)     // Catch: java.lang.Throwable -> L90
            r4.f = r5     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            r4 = move-exception
            goto L97
        L92:
            throw r5     // Catch: java.lang.Throwable -> L90
        L93:
            r0.q(r3)
            return r5
        L97:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.T(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:18:0x0043, B:20:0x0049), top: B:28:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ba4
            if (r0 == 0) goto L13
            r0 = r5
            ba4 r0 = (defpackage.ba4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ba4 r0 = new ba4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            sw7 r0 = r0.a
            defpackage.hre.r(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2e:
            defpackage.hre.r(r5)
            java.lang.Object r5 = r4.e
            sw7 r5 = (defpackage.sw7) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L55
            wb4 r5 = (defpackage.wb4) r5     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L57
            wb4 r5 = new wb4     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L55
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L55
            r4.f = r5     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r4 = move-exception
            goto L5b
        L57:
            r0.q(r3)
            return r5
        L5b:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.U(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #3 {all -> 0x0087, blocks: (B:18:0x0043, B:20:0x0049, B:34:0x0086, B:21:0x0066), top: B:43:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.zuc
            if (r0 == 0) goto L13
            r0 = r6
            zuc r0 = (defpackage.zuc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zuc r0 = new zuc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            sw7 r0 = r0.a
            defpackage.hre.r(r6)
            goto L43
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L2e:
            defpackage.hre.r(r6)
            java.lang.Object r6 = r5.e
            sw7 r6 = (defpackage.sw7) r6
            r0.a = r6
            r0.d = r2
            java.lang.Object r0 = r6.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r6
        L43:
            java.lang.Object r6 = r5.f     // Catch: java.lang.Throwable -> L87
            uuc r6 = (defpackage.uuc) r6     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L89
            m66 r6 = defpackage.pe4.a     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = defpackage.hn8.b     // Catch: java.lang.Throwable -> L87
            java.lang.Object r1 = r5.b     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L87
            r2 = 0
            hn8 r1 = defpackage.fn8.d(r1, r2)     // Catch: java.lang.Throwable -> L87
            r6.getClass()     // Catch: java.lang.Throwable -> L87
            java.io.File r6 = r1.toFile()     // Catch: java.lang.Throwable -> L87
            qw5 r6 = defpackage.tl1.J(r6)     // Catch: java.lang.Throwable -> L87
            mj9 r1 = new mj9     // Catch: java.lang.Throwable -> L87
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L87
            r95 r6 = new r95     // Catch: java.lang.Throwable -> L79
            r4 = 7
            r6.<init>(r4, r2)     // Catch: java.lang.Throwable -> L79
            uuc r6 = r6.q(r1)     // Catch: java.lang.Throwable -> L79
            r5.f = r6     // Catch: java.lang.Throwable -> L79
            r1.close()     // Catch: java.lang.Throwable -> L77
            r5 = r3
            goto L83
        L77:
            r5 = move-exception
            goto L83
        L79:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r6 = move-exception
            defpackage.pye.e(r5, r6)     // Catch: java.lang.Throwable -> L87
        L82:
            r6 = r3
        L83:
            if (r5 != 0) goto L86
            goto L89
        L86:
            throw r5     // Catch: java.lang.Throwable -> L87
        L87:
            r5 = move-exception
            goto L8d
        L89:
            r0.q(r3)
            return r6
        L8d:
            r0.q(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.V(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r8.o(r0) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v9, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v5, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object W(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.eqd
            if (r0 == 0) goto L13
            r0 = r8
            eqd r0 = (defpackage.eqd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eqd r0 = new eqd
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 2
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L35
            if (r1 != r3) goto L2f
            qw7 r0 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2d
            goto L6b
        L2d:
            r7 = move-exception
            goto L75
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L35:
            qw7 r1 = r0.a
            defpackage.hre.r(r8)
            r8 = r1
            goto L55
        L3c:
            defpackage.hre.r(r8)
            java.lang.Object r8 = r7.f
            j6d r8 = (defpackage.j6d) r8
            if (r8 == 0) goto L46
            return r8
        L46:
            java.lang.Object r8 = r7.e
            sw7 r8 = (defpackage.sw7) r8
            r0.a = r8
            r0.d = r2
            java.lang.Object r1 = r8.o(r0)
            if (r1 != r5) goto L55
            goto L67
        L55:
            java.lang.Object r1 = r7.b     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L73
            j6d r1 = defpackage.d6d.b(r1)     // Catch: java.lang.Throwable -> L73
            r0.a = r8     // Catch: java.lang.Throwable -> L73
            r0.d = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = defpackage.jye.s(r1, r2, r2, r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r5) goto L68
        L67:
            return r5
        L68:
            r6 = r0
            r0 = r8
            r8 = r6
        L6b:
            j6d r8 = (defpackage.j6d) r8     // Catch: java.lang.Throwable -> L2d
            r7.f = r8     // Catch: java.lang.Throwable -> L2d
            r0.q(r4)
            return r8
        L73:
            r7 = move-exception
            r0 = r8
        L75:
            r0.q(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.W(n42):java.lang.Object");
    }

    public void X(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i7 i7Var = (i7) arrayList.get(i);
            i7Var.getClass();
            ((jt1) this.b).l(i7Var);
        }
        arrayList.clear();
    }

    public void Y(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.b).put(str, obj);
        bw7 bw7Var = (bw7) ((LinkedHashMap) this.d).get(str);
        if (bw7Var != null) {
            ((cza) bw7Var).m(obj);
        }
        bw7 bw7Var2 = (bw7) ((LinkedHashMap) this.e).get(str);
        if (bw7Var2 != null) {
            ((cza) bw7Var2).m(obj);
        }
    }

    public boolean Z(float[] fArr) {
        al8[] al8VarArr = (al8[]) this.d;
        if (al8VarArr != null && al8VarArr.length != 0) {
            for (al8 al8Var : al8VarArr) {
                al8Var.getClass();
                fArr.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (10.0f > f2 || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.x7b
    public int a(long j) {
        long[] jArr = (long[]) this.c;
        int b = a2d.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    public int a0(int i, int i2) {
        int i3;
        int i4;
        jt1 jt1Var = (jt1) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i7 i7Var = (i7) arrayList.get(size);
            int i5 = i7Var.a;
            int i6 = i7Var.b;
            if (i5 == 8) {
                int i7 = i7Var.c;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i >= i3 && i <= i4) {
                    if (i3 == i6) {
                        if (i2 == 1) {
                            i7Var.c = i7 + 1;
                        } else if (i2 == 2) {
                            i7Var.c = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            i7Var.b = i6 + 1;
                        } else if (i2 == 2) {
                            i7Var.b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        i7Var.b = i6 + 1;
                        i7Var.c = i7 + 1;
                    } else if (i2 == 2) {
                        i7Var.b = i6 - 1;
                        i7Var.c = i7 - 1;
                    }
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= i7Var.c;
                } else if (i5 == 2) {
                    i += i7Var.c;
                }
            } else if (i2 == 1) {
                i7Var.b = i6 + 1;
            } else if (i2 == 2) {
                i7Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            i7 i7Var2 = (i7) arrayList.get(size2);
            int i8 = i7Var2.a;
            int i9 = i7Var2.c;
            if (i8 == 8) {
                if (i9 == i7Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    jt1Var.l(i7Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                jt1Var.l(i7Var2);
            }
        }
        return i;
    }

    @Override // defpackage.nl8
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ml8) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b0(java.net.HttpURLConnection r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            qf4 r0 = (defpackage.qf4) r0
            java.lang.Object r1 = r7.d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "/FirebaseCore-Android"
            java.lang.String r1 = defpackage.nk2.u(r1, r2)
            java.lang.Object r2 = r7.c
            k53 r2 = (defpackage.k53) r2
            if (r2 != 0) goto L1f
            k53 r2 = new k53
            java.lang.Object r3 = r7.b
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            r7.c = r2
        L1f:
            java.lang.Object r2 = r7.c
            k53 r2 = (defpackage.k53) r2
            java.lang.String r2 = r2.b
            java.lang.String r3 = "X-Android-Package"
            r8.setRequestProperty(r3, r2)
            java.lang.Object r2 = r7.c
            k53 r2 = (defpackage.k53) r2
            java.lang.String r2 = r2.c
            java.lang.String r3 = "X-Android-Cert"
            r8.setRequestProperty(r3, r2)
            java.lang.String r2 = "Accept-Language"
            java.lang.String r3 = defpackage.eg0.B()
            r8.setRequestProperty(r2, r3)
            java.lang.String r2 = "X-Client-Version"
            r8.setRequestProperty(r2, r1)
            java.lang.Object r1 = r7.f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "X-Firebase-Locale"
            r8.setRequestProperty(r2, r1)
            r0.a()
            sg4 r1 = r0.c
            java.lang.String r1 = r1.b
            java.lang.String r2 = "X-Firebase-GMPID"
            r8.setRequestProperty(r2, r1)
            java.lang.Class<e0e> r1 = defpackage.e0e.class
            java.lang.Object r2 = r0.b(r1)
            e0e r2 = (defpackage.e0e) r2
            r3 = 0
            if (r2 != 0) goto L65
        L63:
            r2 = r3
            goto Lae
        L65:
            l99 r2 = r2.c
            java.lang.Object r2 = r2.get()
            k55 r2 = (defpackage.k55) r2
            if (r2 == 0) goto L63
            cu2 r2 = (defpackage.cu2) r2     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
            android.content.Context r4 = r2.b     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
            boolean r4 = defpackage.dpe.r(r4)     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
            if (r4 != 0) goto L80
            java.lang.String r2 = ""
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forResult(r2)     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
            goto L8c
        L80:
            java.util.concurrent.Executor r4 = r2.e     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
            bu2 r5 = new bu2     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
            r6 = 0
            r5.<init>(r2, r6)     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.call(r4, r5)     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
        L8c:
            java.lang.Object r2 = com.google.android.gms.tasks.Tasks.await(r2)     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95
            goto Lae
        L93:
            r2 = move-exception
            goto L96
        L95:
            r2 = move-exception
        L96:
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to get heartbeats: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "LocalRequestInterceptor"
            android.util.Log.w(r4, r2)
            goto L63
        Lae:
            java.lang.String r4 = "X-Firebase-Client"
            r8.setRequestProperty(r4, r2)
            java.lang.Object r0 = r0.b(r1)
            e0e r0 = (defpackage.e0e) r0
            if (r0 != 0) goto Lbc
            goto Lc4
        Lbc:
            l99 r0 = r0.b
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Ld2
        Lc4:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lcf
            java.lang.String r0 = "X-Firebase-AppCheck"
            r8.setRequestProperty(r0, r3)
        Lcf:
            r7.f = r3
            return
        Ld2:
            defpackage.vm1.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.b0(java.net.HttpURLConnection):void");
    }

    @Override // defpackage.x7b
    public long c(int i) {
        return ((long[]) this.c)[i];
    }

    @Override // defpackage.ye6
    public boolean d() {
        if (((gdd) this.f) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b A[SYNTHETIC] */
    @Override // defpackage.zc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.util.Map r10, defpackage.m42 r11) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.e(java.util.Map, m42):java.lang.Object");
    }

    @Override // defpackage.x7b
    public List f(long j) {
        k13[] k13VarArr;
        woc wocVar = (woc) this.b;
        HashMap hashMap = (HashMap) this.e;
        HashMap hashMap2 = (HashMap) this.f;
        ArrayList arrayList = new ArrayList();
        wocVar.g(j, wocVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        wocVar.i(j, false, wocVar.h, treeMap);
        wocVar.h(j, (Map) this.d, hashMap, wocVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zoc zocVar = (zoc) hashMap.get(pair.first);
                zocVar.getClass();
                arrayList2.add(new td2(null, null, null, decodeByteArray, zocVar.c, 0, zocVar.e, zocVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, zocVar.f, zocVar.g, false, -16777216, zocVar.j, nae.e, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zoc zocVar2 = (zoc) hashMap.get(entry.getKey());
            zocVar2.getClass();
            sd2 sd2Var = (sd2) entry.getValue();
            CharSequence charSequence = sd2Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (k13 k13Var : (k13[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), k13.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(k13Var), spannableStringBuilder.getSpanEnd(k13Var), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = zocVar2.c;
            int i10 = zocVar2.d;
            sd2Var.e = f;
            sd2Var.f = i10;
            sd2Var.g = zocVar2.e;
            sd2Var.h = zocVar2.b;
            sd2Var.l = zocVar2.f;
            float f2 = zocVar2.i;
            int i11 = zocVar2.h;
            sd2Var.k = f2;
            sd2Var.j = i11;
            sd2Var.p = zocVar2.j;
            arrayList2.add(sd2Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.x7b
    public int g() {
        return ((long[]) this.c).length;
    }

    @Override // defpackage.k99
    public Object get() {
        switch (this.a) {
            case 5:
                return new tw2((Executor) ((k99) this.b).get(), (ub7) ((k99) this.c).get(), (zg4) ((yx9) this.d).get(), (hw9) ((k99) this.e).get(), (hw9) ((k99) this.f).get());
            case 16:
                return new mn9((t9c) ((j99) this.b).get(), (ig4) ((j99) this.c).get(), (ky) ((j99) this.d).get(), (nn9) ((j99) this.e).get(), (dea) ((j99) this.f).get());
            default:
                return new dba((qf4) ((nt2) this.b).a, (ig4) ((j99) this.c).get(), (wba) ((j99) this.d).get(), (jx3) ((j99) this.e).get(), (d82) ((j99) this.f).get());
        }
    }

    @Override // defpackage.ye6
    public Object getValue() {
        gdd gddVar = (gdd) this.f;
        if (gddVar == null) {
            qdd i = ((th9) this.c).b.i();
            ldd e = ((th9) this.d).b.e();
            ru7 f = ((th9) this.e).b.f();
            e.getClass();
            odd oddVar = new odd(i, e, f);
            gi1 gi1Var = (gi1) this.b;
            String f2 = gi1Var.f();
            if (f2 != null) {
                gdd a = oddVar.a(gi1Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f2));
                this.f = a;
                return a;
            }
            vs.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        return gddVar;
    }

    @Override // defpackage.nl8
    public float h() {
        return ((Number) ((ye6) this.d).getValue()).floatValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:31|32|(1:34)|35|36|37|(1:39)(2:123|(2:124|(2:127|128)(1:126)))|40|(1:42)(1:122)|43|44|45|46|47|48|49|(5:51|52|(2:54|(2:56|(2:58|(1:60)(17:63|32|(0)|35|36|37|(0)(0)|40|(0)(0)|43|44|45|46|47|48|49|(1:110)(0)))(14:64|36|37|(0)(0)|40|(0)(0)|43|44|45|46|47|48|49|(0)(0)))(2:65|66))(8:67|(1:69)(2:100|(2:102|(4:103|(1:105)|106|(1:109)(1:108))))|70|(1:72)(1:99)|73|(8:75|76|77|(1:79)|81|82|83|(1:85))|96|(3:98|27|28))|61|62)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:114|115|116|117|118) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:227|228|229|230|231) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:208|(1:209)|210|211|212|213|(2:215|(2:217|(17:219|184|185|(1:187)|188|189|190|(1:192)(4:264|(1:265)|267|268)|193|(1:195)(1:263)|196|197|198|(1:200)(1:262)|201|202|(6:238|(1:240)(2:252|(2:254|(4:255|(1:257)|258|(1:261)(1:260))))|241|(1:243)(1:251)|244|(2:246|(3:248|181|182))(2:249|250))(0)))(13:222|189|190|(0)(0)|193|(0)(0)|196|197|198|(0)(0)|201|202|(0)(0)))(1:223)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x044e, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0452, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0453, code lost:
        defpackage.pye.e(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0456, code lost:
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x074d, code lost:
        if (r3 == r11) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x08d0, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x08d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x08d9, code lost:
        defpackage.pye.e(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0db4, code lost:
        if (r3 == r12) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0dcb, code lost:
        if (r14 == r12) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x044a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x044c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0d52  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0d94  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0e64  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0eb7  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0eba  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0ef4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0f08  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0f0c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x1053  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x1100  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x1107  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x1117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x11ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x115a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0414  */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v205, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v207, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v208, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v209, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v311, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v312, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v313, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12, types: [xl9] */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x0944 -> B:169:0x06c2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:244:0x096d -> B:243:0x096a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:259:0x0a11 -> B:257:0x0a0b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:333:0x0ef4 -> B:334:0x0f04). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:369:0x10ed -> B:370:0x10f8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0347 -> B:75:0x0352). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x037b -> B:79:0x0377). Please submit an issue!!! */
    @Override // defpackage.zc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.String r55, java.util.Map r56, defpackage.n42 r57) {
        /*
            Method dump skipped, instructions count: 4750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.i(java.lang.String, java.util.Map, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:265:0x05a9, code lost:
        if (r3 != null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05ea, code lost:
        if (r4 == null) goto L285;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[LOOP:1: B:31:0x00ab->B:33:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:450:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:453:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:463:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:466:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:467:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:472:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb  */
    /* JADX WARN: Type inference failed for: r28v0, types: [bm1] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0307 -> B:136:0x0309). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x04aa -> B:212:0x04ab). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:339:0x071a -> B:341:0x071e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:404:0x08b4 -> B:413:0x08fb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:406:0x08ca -> B:413:0x08fb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:408:0x08e8 -> B:410:0x08ec). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01d4 -> B:83:0x01d8). Please submit an issue!!! */
    @Override // defpackage.zc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.m42 r29) {
        /*
            Method dump skipped, instructions count: 2474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.j(m42):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [l1e, java.lang.Object] */
    @Override // defpackage.a2e
    public void k(l1e l1eVar) {
        String encodeToString;
        switch (this.a) {
            case 27:
                x3e x3eVar = (x3e) this.c;
                g5e g5eVar = (g5e) l1eVar;
                w2e w2eVar = (w2e) this.b;
                List list = null;
                if (w2eVar.a("EMAIL")) {
                    x3eVar.b = null;
                }
                if (w2eVar.a("DISPLAY_NAME")) {
                    x3eVar.d = null;
                } else {
                    String str = (String) w2eVar.c;
                    if (str != null) {
                        x3eVar.d = str;
                    }
                }
                if (w2eVar.a("PHOTO_URL")) {
                    x3eVar.e = null;
                } else {
                    String str2 = (String) w2eVar.d;
                    if (str2 != null) {
                        x3eVar.e = str2;
                    }
                }
                if (!TextUtils.isEmpty(null)) {
                    byte[] bytes = "redacted".getBytes();
                    if (bytes == null) {
                        encodeToString = null;
                    } else {
                        encodeToString = Base64.encodeToString(bytes, 0);
                    }
                    am8.p(encodeToString);
                }
                if (w2eVar.a("delete_passkey")) {
                    l6e l6eVar = f4e.C;
                    o9e o9eVar = o9e.F;
                    am8.s(o9eVar);
                    x3eVar.m = o9eVar;
                }
                x47 x47Var = g5eVar.a;
                if (x47Var != null) {
                    list = x47Var.a;
                }
                if (list == null) {
                    list = new ArrayList();
                }
                x47 x47Var2 = new x47(1);
                x3eVar.f = x47Var2;
                x47Var2.a.addAll(list);
                rwa rwaVar = (rwa) this.d;
                p4e p4eVar = (p4e) this.e;
                am8.s(p4eVar);
                String str3 = g5eVar.b;
                String str4 = g5eVar.c;
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    p4eVar = new p4e(str4, str3, Long.valueOf(g5eVar.d), p4eVar.d);
                }
                rwaVar.f(p4eVar, x3eVar);
                return;
            default:
                yx9 yx9Var = (yx9) this.b;
                List list2 = (List) ((r3e) l1eVar).a.b;
                if (list2 != null && !list2.isEmpty()) {
                    k57 k57Var = (k57) this.f;
                    rwa rwaVar2 = (rwa) this.c;
                    p4e p4eVar2 = (p4e) this.d;
                    x3e x3eVar2 = (x3e) list2.get(0);
                    w2e w2eVar2 = (w2e) this.e;
                    am8.s(p4eVar2);
                    am8.s(x3eVar2);
                    qu1 qu1Var = (qu1) k57Var.b;
                    bm1 bm1Var = new bm1(k57Var, w2eVar2, x3eVar2, rwaVar2, p4eVar2, yx9Var);
                    qu1Var.getClass();
                    h1e h1eVar = (h1e) qu1Var.a;
                    ch0.w(h1eVar.f("/setAccountInfo", (String) qu1Var.f), w2eVar2, bm1Var, new Object(), (bm1) h1eVar.c);
                    return;
                }
                yx9Var.mo0zza("No users");
                return;
        }
    }

    @Override // defpackage.nl8
    public float l() {
        return ((Number) ((ye6) this.e).getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xl9, java.lang.Object] */
    public h61 n(te0 te0Var, vt4 vt4Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        ?? obj = new Object();
        obj.a = -1;
        synchronized (this.b) {
            Throwable th = (Throwable) this.c;
            if (th != null) {
                te0Var.b(th);
                return hq7.F;
            }
            z30 z30Var = (z30) this.d;
            do {
                i = z30Var.get();
                i2 = i + 1;
            } while (!z30Var.compareAndSet(i, i2));
            if ((134217727 & i2) == 1) {
                z = true;
            } else {
                z = false;
            }
            obj.a = (i2 >>> 27) & 15;
            ((kv7) this.e).a(te0Var);
            if (z && vt4Var != null) {
                try {
                    vt4Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.b) {
                        try {
                            if (((Throwable) this.c) == null) {
                                this.c = th2;
                                kv7 kv7Var = (kv7) this.e;
                                Object[] objArr = kv7Var.a;
                                int i4 = kv7Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((te0) objArr[i5]).b(th2);
                                }
                                ((kv7) this.e).d();
                                z30 z30Var2 = (z30) this.d;
                                do {
                                    i3 = z30Var2.get();
                                } while (!z30Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new s26(new se0(0, te0Var, this, (Object) obj));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r6.getRunCount() == 1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi o(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.b
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.E(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.o(int):java.text.Bidi");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(defpackage.x5 r5, defpackage.oad r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.g9d
            if (r0 == 0) goto L13
            r0 = r7
            g9d r0 = (defpackage.g9d) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            g9d r0 = new g9d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.c
            n82 r1 = defpackage.n82.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            java.util.Iterator r4 = r0.b
            java.util.Iterator r4 = (java.util.Iterator) r4
            oad r5 = r0.a
            defpackage.hre.r(r7)
            r6 = r5
            goto L4c
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L35:
            defpackage.hre.r(r7)
            java.lang.Object r4 = r4.e
            monitor-enter(r4)
            java.util.LinkedHashMap r5 = r5.a     // Catch: java.lang.Throwable -> L6b
            java.util.Collection r5 = r5.values()     // Catch: java.lang.Throwable -> L6b
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L6b
            java.util.List r5 = defpackage.sl1.C0(r5)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r4)
            java.util.Iterator r4 = r5.iterator()
        L4c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r4.next()
            xv7 r5 = (defpackage.xv7) r5
            r0.a = r6
            r7 = r4
            java.util.Iterator r7 = (java.util.Iterator) r7
            r0.b = r7
            r0.e = r3
            java.lang.Object r5 = r5.b(r6, r0)
            if (r5 != r1) goto L4c
            return r1
        L68:
            pvc r4 = defpackage.pvc.a
            return r4
        L6b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.p(x5, oad, n42):java.lang.Object");
    }

    public boolean q(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i7 i7Var = (i7) arrayList.get(i2);
            int i3 = i7Var.a;
            if (i3 == 8) {
                if (v(i7Var.c, i2 + 1) == i) {
                    return true;
                }
            } else {
                if (i3 == 1) {
                    int i4 = i7Var.b;
                    int i5 = i7Var.c + i4;
                    while (i4 < i5) {
                        if (v(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void r() {
        xk9 xk9Var = (xk9) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xk9) this.d).c((i7) arrayList.get(i));
        }
        X(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            i7 i7Var = (i7) arrayList2.get(i2);
            int i3 = i7Var.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        if (i3 == 8) {
                            xk9Var.c(i7Var);
                            xk9Var.o(i7Var.b, i7Var.c);
                        }
                    } else {
                        xk9Var.c(i7Var);
                        xk9Var.i(i7Var.b, i7Var.c);
                    }
                } else {
                    xk9Var.c(i7Var);
                    int i4 = i7Var.b;
                    int i5 = i7Var.c;
                    RecyclerView recyclerView = (RecyclerView) xk9Var.b;
                    recyclerView.K(i4, i5, true);
                    recyclerView.C0 = true;
                    recyclerView.z0.b += i5;
                }
            } else {
                xk9Var.c(i7Var);
                xk9Var.m(i7Var.b, i7Var.c);
            }
        }
        X(arrayList2);
    }

    public void t(i7 i7Var) {
        int i;
        jt1 jt1Var = (jt1) this.b;
        int i2 = i7Var.a;
        if (i2 != 1 && i2 != 8) {
            int a0 = a0(i7Var.b, i2);
            int i3 = i7Var.b;
            int i4 = i7Var.a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    cp8.s(i7Var, "op should be remove or update.");
                    return;
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < i7Var.c; i6++) {
                int a02 = a0((i * i6) + i7Var.b, i7Var.a);
                int i7 = i7Var.a;
                if (i7 == 2 ? a02 == a0 : !(i7 != 4 || a02 != a0 + 1)) {
                    i5++;
                } else {
                    i7 L = L(i7, a0, i5);
                    u(L, i3);
                    jt1Var.l(L);
                    if (i7Var.a == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    a0 = a02;
                }
            }
            jt1Var.l(i7Var);
            if (i5 > 0) {
                i7 L2 = L(i7Var.a, a0, i5);
                u(L2, i3);
                jt1Var.l(L2);
                return;
            }
            return;
        }
        vs.m("should not dispatch add or move for pre layout");
    }

    public void u(i7 i7Var, int i) {
        xk9 xk9Var = (xk9) this.d;
        xk9Var.c(i7Var);
        int i2 = i7Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                xk9Var.i(i, i7Var.c);
                return;
            } else {
                vs.m("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = i7Var.c;
        RecyclerView recyclerView = (RecyclerView) xk9Var.b;
        recyclerView.K(i, i3, true);
        recyclerView.C0 = true;
        recyclerView.z0.b += i3;
    }

    public int v(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        while (i2 < size) {
            i7 i7Var = (i7) arrayList.get(i2);
            int i3 = i7Var.a;
            int i4 = i7Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = i7Var.c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (i7Var.c <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = i7Var.c;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += i7Var.c;
            }
            i2++;
        }
        return i;
    }

    public void x(xt4 xt4Var) {
        int i;
        synchronized (this.b) {
            try {
                kv7 kv7Var = (kv7) this.e;
                this.e = (kv7) this.f;
                this.f = kv7Var;
                z30 z30Var = (z30) this.d;
                do {
                    i = z30Var.get();
                } while (!z30Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = kv7Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    xt4Var.invoke(kv7Var.f(i3));
                }
                kv7Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float z(int i, boolean z) {
        Layout layout = (Layout) this.b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        if (z) {
            return layout.getPrimaryHorizontal(i);
        }
        return layout.getSecondaryHorizontal(i);
    }

    @Override // defpackage.a2e
    /* renamed from: zza */
    public void mo0zza(String str) {
        switch (this.a) {
            case 27:
                ((yx9) this.f).mo0zza(str);
                return;
            default:
                ((yx9) this.b).mo0zza(str);
                return;
        }
    }

    public bm1(k57 k57Var, yx9 yx9Var, rwa rwaVar, p4e p4eVar, w2e w2eVar) {
        this.a = 28;
        this.b = yx9Var;
        this.c = rwaVar;
        this.d = p4eVar;
        this.e = w2eVar;
        Objects.requireNonNull(k57Var);
        this.f = k57Var;
    }

    public bm1(k57 k57Var, w2e w2eVar, x3e x3eVar, rwa rwaVar, p4e p4eVar, yx9 yx9Var) {
        this.a = 27;
        this.b = w2eVar;
        this.c = x3eVar;
        this.d = rwaVar;
        this.e = p4eVar;
        this.f = yx9Var;
        Objects.requireNonNull(k57Var);
    }

    public bm1(Context context, qf4 qf4Var, ig4 ig4Var, yv yvVar, ui5 ui5Var) {
        this.a = 9;
        this.b = new tz4(context, null, xb4.o, xs.g, sz4.c);
        this.c = qf4Var;
        this.d = ig4Var;
        this.e = yvVar;
        this.f = ui5Var;
    }

    public bm1(xk9 xk9Var, byte b) {
        this.a = 23;
        this.b = xk9Var;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new Object();
        b9b b2 = rse.b();
        sw2 sw2Var = ab3.a;
        this.f = k27.a(nq2.C(b2, ru2.c));
    }

    public bm1(Map map) {
        this.a = 18;
        map.getClass();
        this.b = new LinkedHashMap(map);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new ut1(this, 4);
    }

    public bm1(String str, ii2 ii2Var, uz6 uz6Var, int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = str;
                this.c = ii2Var;
                this.d = uz6Var;
                this.e = new sw7();
                return;
            case 10:
                this.b = str;
                this.c = ii2Var;
                this.d = uz6Var;
                this.e = new sw7();
                return;
            case 14:
                this.b = str;
                this.c = ii2Var;
                this.d = uz6Var;
                this.e = new sw7();
                return;
            case 22:
                this.b = str;
                this.c = ii2Var;
                this.d = uz6Var;
                this.e = new sw7();
                return;
            case 26:
                this.b = str;
                this.c = ii2Var;
                this.d = uz6Var;
                this.e = new sw7();
                return;
            default:
                this.b = str;
                this.c = ii2Var;
                this.d = uz6Var;
                this.e = new sw7();
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm1(zj1 zj1Var, q0a q0aVar, gi1 gi1Var) {
        this(zj1Var, q0aVar, gi1Var, (nf9) null, (wl8) null);
        this.a = 17;
    }

    public bm1(zj1 zj1Var, q0a q0aVar, gi1 gi1Var, nf9 nf9Var, wl8 wl8Var) {
        this.a = 17;
        zj1Var.getClass();
        q0aVar.getClass();
        gi1Var.getClass();
        this.b = zj1Var;
        this.c = q0aVar;
        this.d = gi1Var;
        this.e = nf9Var;
        this.f = wl8Var;
        v66.a(gi1Var);
        Objects.toString(nf9Var);
    }

    public bm1(Context context, qf4 qf4Var, String str) {
        this.a = 29;
        am8.s(context);
        this.b = context;
        am8.s(qf4Var);
        this.e = qf4Var;
        this.d = "Android/Fallback/".concat(str);
    }

    public bm1(int i) {
        this.a = i;
        switch (i) {
            case 4:
                return;
            case 11:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                this.d = new LinkedHashMap();
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                return;
            default:
                this.b = new Object();
                this.d = new AtomicInteger(0);
                this.e = new kv7();
                this.f = new kv7();
                return;
        }
    }

    public bm1(Layout layout) {
        this.a = 12;
        this.b = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int f0 = k4b.f0(((Layout) this.b).getText(), '\n', i, 4);
            i = f0 < 0 ? ((Layout) this.b).getText().length() : f0 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.b).getText().length());
        this.f = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.f).size()];
        ((ArrayList) this.f).size();
    }

    public bm1(gi1 gi1Var, th9 th9Var, th9 th9Var2, th9 th9Var3) {
        this.a = 24;
        this.b = gi1Var;
        this.c = th9Var;
        this.d = th9Var2;
        this.e = th9Var3;
    }

    public bm1(woc wocVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 21;
        this.b = wocVar;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        wocVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x019d, code lost:
        r2 = new java.util.ArrayList();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a5, code lost:
        if (r3 >= r1.b) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a7, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a9, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01aa, code lost:
        if (r4 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ac, code lost:
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ae, code lost:
        if (r4 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b2, code lost:
        if (r3 >= r1.b) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b5, code lost:
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b6, code lost:
        if (r4 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b8, code lost:
        r6 = r3 + 1;
        r3 = (defpackage.am1) r4[r3];
        r4 = r3.j;
        r11 = (int[]) r4.b;
        r4 = (int[]) r4.c;
        r12 = r3.a;
        r3 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cc, code lost:
        if (r12 > r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ce, code lost:
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d3, code lost:
        r17 = r11[r12];
        r18 = r4[r17];
        r13 = r13 + r18;
        r14 = (((r17 >> 10) & 31) * r18) + r14;
        r15 = (((r17 >> 5) & 31) * r18) + r15;
        r16 = (r18 * (r17 & 31)) + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ef, code lost:
        if (r12 == r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f1, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f4, code lost:
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f7, code lost:
        r3 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fb, code lost:
        r11 = r13;
        r21 = r5;
        r6 = new defpackage.cl8(defpackage.zj1.m((int) java.lang.Math.rint(r3 / r11), 5, 8) | (((defpackage.zj1.m((int) java.lang.Math.rint(r14 / r11), 5, 8) << 16) | (-16777216)) | (defpackage.zj1.m((int) java.lang.Math.rint(r15 / r11), 5, 8) << 8)), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0238, code lost:
        if (Z(r6.c) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023a, code lost:
        r2.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023d, code lost:
        r5 = r21;
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0243, code lost:
        r21 = r5;
        defpackage.xk5.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0248, code lost:
        throw r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0249, code lost:
        r20.f = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [e69, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bm1(int[] r21, int r22, defpackage.al8[] r23) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.<init>(int[], int, al8[]):void");
    }

    public /* synthetic */ bm1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public bm1(List list, ArrayList arrayList) {
        Object obj;
        this.a = 1;
        list.getClass();
        arrayList.getClass();
        this.b = list;
        this.c = arrayList;
        this.d = new HashMap();
        this.e = new HashMap();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i = ((cl8) next).b;
                do {
                    Object next2 = it.next();
                    int i2 = ((cl8) next2).b;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
                obj = next;
            } else {
                obj = next;
            }
        } else {
            obj = null;
        }
        this.f = (cl8) obj;
    }

    public bm1(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 20;
        this.e = new ArrayDeque();
        this.b = sharedPreferences;
        this.c = "topic_operation_queue";
        this.d = ",";
        this.f = scheduledThreadPoolExecutor;
    }

    public bm1(xk9 xk9Var) {
        this.a = 2;
        this.b = new jt1(30, 9);
        this.f = new ArrayList();
        this.c = new ArrayList();
        this.d = xk9Var;
        this.e = new fz4(this);
    }

    public bm1(bm1 bm1Var, ArrayList arrayList, Integer num, yx9 yx9Var) {
        this.a = 25;
        this.b = bm1Var;
        this.f = arrayList;
        this.c = num;
        this.d = yx9Var;
        this.e = null;
    }

    public bm1(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.a = 13;
        this.e = mediaBrowserServiceCompat;
        this.d = mediaBrowserServiceCompat;
        this.f = new ArrayList();
    }
}
