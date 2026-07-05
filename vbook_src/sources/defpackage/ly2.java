package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ly2  reason: default package */
/* loaded from: classes.dex */
public class ly2 {
    public static final ef8 k = new vs1(new uk(9));
    public q04 a;
    public ys2 b;
    public final Object c;
    public final Context d;
    public final j55 e;
    public gy2 f;
    public Thread g;
    public hwa h;
    public l40 i;
    public Boolean j;

    public ly2(Context context) {
        j55 j55Var = new j55(15);
        gy2 gy2Var = gy2.G;
        this.c = new Object();
        this.d = context.getApplicationContext();
        this.e = j55Var;
        if (gy2Var != null) {
            this.f = gy2Var;
        } else {
            gy2Var.getClass();
            fy2 fy2Var = new fy2(gy2Var);
            fy2Var.c(gy2Var);
            this.f = new gy2(fy2Var);
        }
        this.i = l40.b;
        boolean z = this.f.B;
    }

    public static int a(vq4 vq4Var, qs5 qs5Var) {
        for (int i = 0; i < qs5Var.size(); i++) {
            for (int i2 = 0; i2 < vq4Var.c.size(); i2++) {
                if (((za6) vq4Var.c.get(i2)).b.equals(qs5Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void b(m17 m17Var, gy2 gy2Var, b14[] b14VarArr) {
        int i = m17Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            bjc bjcVar = m17Var.c[i2];
            Map map = (Map) gy2Var.E.get(i2);
            if (map != null && map.containsKey(bjcVar)) {
                Map map2 = (Map) gy2Var.E.get(i2);
                if (map2 != null && map2.get(bjcVar) != null) {
                    vm1.h();
                    return;
                }
                b14VarArr[i2] = null;
            }
        }
    }

    public static void c(m17 m17Var, gy2 gy2Var, b14[] b14VarArr) {
        for (int i = 0; i < m17Var.a; i++) {
            int i2 = m17Var.b[i];
            if (gy2Var.F.get(i) || gy2Var.w.contains(Integer.valueOf(i2))) {
                b14VarArr[i] = null;
            }
        }
    }

    public static void d(m17 m17Var, gy2 gy2Var, b14[] b14VarArr) {
        b14 b14Var;
        int i = m17Var.a;
        bjc[] bjcVarArr = m17Var.c;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            e(bjcVarArr[i2], gy2Var, hashMap);
        }
        e(m17Var.f, gy2Var, hashMap);
        for (int i3 = 0; i3 < i; i3++) {
            hjc hjcVar = (hjc) hashMap.get(Integer.valueOf(m17Var.b[i3]));
            if (hjcVar != null) {
                ajc ajcVar = hjcVar.a;
                qs5 qs5Var = hjcVar.b;
                if (!qs5Var.isEmpty() && bjcVarArr[i3].b(ajcVar) != -1) {
                    b14Var = new b14(0, ajcVar, hc2.s(qs5Var));
                } else {
                    b14Var = null;
                }
                b14VarArr[i3] = b14Var;
            }
        }
    }

    public static void e(bjc bjcVar, kjc kjcVar, HashMap hashMap) {
        for (int i = 0; i < bjcVar.a; i++) {
            hjc hjcVar = (hjc) kjcVar.v.get(bjcVar.a(i));
            if (hjcVar != null) {
                ajc ajcVar = hjcVar.a;
                hjc hjcVar2 = (hjc) hashMap.get(Integer.valueOf(ajcVar.c));
                if (hjcVar2 == null || (hjcVar2.b.isEmpty() && !hjcVar.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(ajcVar.c), hjcVar);
                }
            }
        }
    }

    public static Pair f(b14[] b14VarArr, int i) {
        for (int i2 = 0; i2 < b14VarArr.length; i2++) {
            b14 b14Var = b14VarArr[i2];
            if (b14Var != null && b14Var.a.c == i) {
                return Pair.create(b14Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int g(vq4 vq4Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(vq4Var.d)) {
            return 4;
        }
        String j = j(str);
        String j2 = j(vq4Var.d);
        if (j2 != null && j != null) {
            if (!j2.startsWith(j) && !j.startsWith(j2)) {
                String str2 = a2d.a;
                if (!j2.split("-", 2)[0].equals(j.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z || j2 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String j(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static b14 l(bjc bjcVar, int[][] iArr, gy2 gy2Var) {
        gy2Var.q.getClass();
        ajc ajcVar = null;
        ey2 ey2Var = null;
        int i = 0;
        for (int i2 = 0; i2 < bjcVar.a; i2++) {
            ajc a = bjcVar.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a.a; i3++) {
                if (ei0.n(iArr2[i3], gy2Var.C)) {
                    ey2 ey2Var2 = new ey2(a.d[i3], iArr2[i3]);
                    if (ey2Var != null) {
                        if (ys1.a.c(ey2Var2.b, ey2Var.b).c(ey2Var2.a, ey2Var.a).e() <= 0) {
                        }
                    }
                    ajcVar = a;
                    i = i3;
                    ey2Var = ey2Var2;
                }
            }
        }
        if (ajcVar == null) {
            return null;
        }
        return new b14(0, ajcVar, new int[]{i});
    }

    public static Pair n(int i, m17 m17Var, int[][][] iArr, iy2 iy2Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        m17 m17Var2 = m17Var;
        ArrayList arrayList = new ArrayList();
        int i3 = m17Var2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == m17Var2.b[i4]) {
                bjc bjcVar = m17Var2.c[i4];
                for (int i5 = 0; i5 < bjcVar.a; i5++) {
                    ajc a = bjcVar.a(i5);
                    mm9 c = iy2Var.c(i4, a, iArr[i4][i5]);
                    int i6 = a.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        jy2 jy2Var = (jy2) c.get(i7);
                        int a2 = jy2Var.a();
                        if (zArr[i7] || a2 == 0) {
                            i2 = i3;
                        } else {
                            if (a2 == 1) {
                                randomAccess = qs5.r(jy2Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(jy2Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    jy2 jy2Var2 = (jy2) c.get(i8);
                                    int i9 = i3;
                                    if (jy2Var2.a() == 2 && jy2Var.b(jy2Var2)) {
                                        arrayList2.add(jy2Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccess = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccess);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            m17Var2 = m17Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((jy2) list.get(i10)).c;
        }
        jy2 jy2Var3 = (jy2) list.get(0);
        return Pair.create(new b14(0, jy2Var3.b, iArr2), Integer.valueOf(jy2Var3.a));
    }

    public final gy2 h() {
        gy2 gy2Var;
        synchronized (this.c) {
            gy2Var = this.f;
        }
        return gy2Var;
    }

    public final void i() {
        boolean z;
        q04 q04Var;
        hwa hwaVar;
        synchronized (this.c) {
            try {
                if (this.f.B && Build.VERSION.SDK_INT >= 32 && (hwaVar = this.h) != null && hwaVar.b) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z && (q04Var = this.a) != null) {
            q04Var.D.f(10);
        }
    }

    public final void k() {
        hwa hwaVar;
        boolean z;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    if (thread == Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    wq9.C("DefaultTrackSelector is accessed on the wrong thread.", z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (hwaVar = this.h) != null) {
            hwaVar.e();
            this.h = null;
        }
        this.a = null;
        this.b = null;
    }

    public Pair m(m17 m17Var, int[][][] iArr, gy2 gy2Var, String str) {
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        gy2Var.q.getClass();
        String str2 = null;
        if (gy2Var.t && (context = this.d) != null && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
            String str3 = a2d.a;
            str2 = locale.toLanguageTag();
        }
        return n(3, m17Var, iArr, new ua2(2, gy2Var, str, str2), new uk(13));
    }

    public final void o(kjc kjcVar) {
        if (kjcVar instanceof gy2) {
            p((gy2) kjcVar);
        }
        fy2 fy2Var = new fy2(h());
        fy2Var.c(kjcVar);
        p(new gy2(fy2Var));
    }

    public final void p(gy2 gy2Var) {
        boolean equals;
        synchronized (this.c) {
            equals = this.f.equals(gy2Var);
            this.f = gy2Var;
        }
        if (!equals) {
            if (gy2Var.B && this.d == null) {
                st0.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            q04 q04Var = this.a;
            if (q04Var != null) {
                q04Var.D.f(10);
            }
        }
    }
}
