package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uwd  reason: default package */
/* loaded from: classes.dex */
public class uwd implements iw, un5, rb2, es6, qy, t25, a6, g06, xqa, os9 {
    public static uwd c;
    public static final gw4 d = new gw4(1);
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r6v7, types: [l07, java.lang.Object] */
    public uwd(int i) {
        ka7 ka7Var;
        this.a = i;
        switch (i) {
            case 5:
                this.b = new AtomicInteger(0);
                return;
            case 7:
                this.b = new CopyOnWriteArrayList();
                return;
            case 10:
                this.b = new LinkedHashMap();
                return;
            case 17:
                this.b = new TreeSet(kqe.c);
                return;
            case 19:
                this.b = new a72();
                return;
            case 27:
                j07 j07Var = new j07();
                this.b = j07Var;
                if (!j07Var.b) {
                    if (j07Var.c) {
                        f39.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    j07Var.a();
                    j07Var.c = true;
                    return;
                }
                return;
            default:
                try {
                    ka7Var = (ka7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    ka7Var = d;
                }
                ka7[] ka7VarArr = {gw4.b, ka7Var};
                ?? obj = new Object();
                obj.a = ka7VarArr;
                Charset charset = vz5.a;
                this.b = obj;
                return;
        }
    }

    public static synchronized uwd C(Context context) {
        uwd uwdVar;
        synchronized (uwd.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uwd.class) {
                uwdVar = c;
                if (uwdVar == null) {
                    uwdVar = new uwd(applicationContext);
                    c = uwdVar;
                }
            }
            return uwdVar;
        }
        return uwdVar;
    }

    public Object A(int i, n42 n42Var, byte[] bArr) {
        Object f = ((f20) this.b).f(bArr, 0, i, n42Var);
        if (f == n82.a) {
            return f;
        }
        return pvc.a;
    }

    public Object B(int i, zz2 zz2Var) {
        byte[] bArr = new byte[16];
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >>> 8);
        Object f = ((f20) this.b).f(bArr, 0, 2, zz2Var);
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        if (f != n82Var) {
            f = pvcVar;
        }
        if (f == n82Var) {
            return f;
        }
        return pvcVar;
    }

    public synchronized void D() {
        o0b o0bVar = (o0b) this.b;
        ReentrantLock reentrantLock = o0bVar.a;
        reentrantLock.lock();
        o0bVar.b.edit().clear().apply();
        reentrantLock.unlock();
    }

    @Override // defpackage.xqa
    public int a(int i, int i2) {
        return cbe.m((s0b) ((j71) this.b).d.getValue(), i, i2);
    }

    @Override // defpackage.t25
    public String b(Object obj) {
        return (String) obj;
    }

    @Override // defpackage.g06
    public void c(char c2) {
        zpe.q((uj9) this.b, c2);
    }

    @Override // defpackage.a6
    public void e(Object obj) {
        z5 z5Var = (z5) obj;
        hs4 hs4Var = (hs4) this.b;
        ds4 ds4Var = (ds4) hs4Var.F.pollLast();
        if (ds4Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = ds4Var.a;
        int i = ds4Var.b;
        rr4 t = hs4Var.c.t(str);
        if (t == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        t.u(i, z5Var.a, z5Var.b);
    }

    @Override // defpackage.es6
    public void f(gs6 gs6Var, long j, long j2, boolean z) {
        ((of2) this.b).v((bn8) gs6Var, j, j2);
    }

    @Override // defpackage.g06
    public void g(String str) {
        str.getClass();
        uj9 uj9Var = (uj9) this.b;
        zpe.q(uj9Var, 34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = w3b.a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                zpe.r(uj9Var, str, i, i2);
                String str2 = strArr[charAt];
                str2.getClass();
                zpe.r(uj9Var, str2, 0, str2.length());
                i = i2 + 1;
            }
        }
        zpe.r(uj9Var, str, i, str.length());
        zpe.q(uj9Var, 34);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, an8] */
    @Override // defpackage.es6
    public void i(gs6 gs6Var, long j, long j2) {
        int size;
        bn8 bn8Var = (bn8) gs6Var;
        of2 of2Var = (of2) this.b;
        long j3 = bn8Var.a;
        mg2 mg2Var = bn8Var.b;
        h0b h0bVar = bn8Var.d;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        of2Var.m.getClass();
        of2Var.q.d(cs6Var, bn8Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        ff2 ff2Var = (ff2) bn8Var.f;
        ff2 ff2Var2 = of2Var.G;
        if (ff2Var2 == null) {
            size = 0;
        } else {
            size = ff2Var2.m.size();
        }
        long j4 = ff2Var.b(0).b;
        int i = 0;
        while (i < size && of2Var.G.b(i).b < j4) {
            i++;
        }
        if (ff2Var.d) {
            if (size - i > ff2Var.m.size()) {
                st0.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = of2Var.M;
                if (j5 != -9223372036854775807L && ff2Var.h * 1000 <= j5) {
                    st0.w("DashMediaSource", "Loaded stale dynamic manifest: " + ff2Var.h + ", " + of2Var.M);
                } else {
                    of2Var.L = 0;
                }
            }
            int i2 = of2Var.L;
            of2Var.L = i2 + 1;
            if (i2 < of2Var.m.r(bn8Var.c)) {
                of2Var.D.postDelayed(of2Var.v, Math.min((of2Var.L - 1) * 1000, 5000));
                return;
            }
            of2Var.C = new IOException();
            return;
        }
        of2Var.G = ff2Var;
        of2Var.H = ff2Var.d & of2Var.H;
        of2Var.I = j - j2;
        of2Var.J = j;
        of2Var.N += i;
        synchronized (of2Var.t) {
            try {
                if (bn8Var.b.a.equals(of2Var.E)) {
                    Uri uri = of2Var.G.k;
                    if (uri == null) {
                        uri = hud.r(bn8Var.d.c);
                    }
                    of2Var.E = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ff2 ff2Var3 = of2Var.G;
        if (ff2Var3.d && of2Var.K == -9223372036854775807L) {
            k53 k53Var = ff2Var3.i;
            if (k53Var != null) {
                String str = k53Var.b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                of2Var.w(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                of2Var.u();
                                return;
                            }
                        }
                        of2Var.y(k53Var, new tn3(21));
                        return;
                    }
                    of2Var.y(k53Var, new Object());
                    return;
                }
                try {
                    of2Var.K = a2d.T(k53Var.c) - of2Var.J;
                    of2Var.x(true);
                    return;
                } catch (xm8 e) {
                    of2Var.w(e);
                    return;
                }
            }
            of2Var.u();
            return;
        }
        of2Var.x(true);
    }

    @Override // defpackage.g06
    public void j(String str) {
        str.getClass();
        zpe.r((uj9) this.b, str, 0, str.length());
    }

    @Override // defpackage.t25
    public Iterator l() {
        return ((Iterable) this.b).iterator();
    }

    public void m(jh1 jh1Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jh1Var.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jh1Var.e[0]), jh1Var);
        }
    }

    public void n(od6 od6Var) {
        if (!od6Var.J()) {
            lv5.c("DepthSortedSet.add called on an unattached node");
        }
        ((msa) this.b).add(od6Var);
    }

    @Override // defpackage.es6
    public void o(gs6 gs6Var, long j, long j2, int i) {
        cs6 cs6Var;
        bn8 bn8Var = (bn8) gs6Var;
        of2 of2Var = (of2) this.b;
        if (i == 0) {
            long j3 = bn8Var.a;
            cs6Var = new cs6(bn8Var.b, j);
        } else {
            long j4 = bn8Var.a;
            mg2 mg2Var = bn8Var.b;
            h0b h0bVar = bn8Var.d;
            cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        }
        of2Var.q.g(cs6Var, bn8Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public jh1 p() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (jh1 jh1Var : ((LinkedHashMap) this.b).values()) {
            arrayList.add(jh1Var.b);
            arrayList2.add(jh1Var.c);
            arrayList3.add(jh1Var.d);
            arrayList4.add(jh1Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        if (j == i) {
            z = true;
        } else {
            z = false;
        }
        wq9.q("the total number of elements (%s) in the arrays must fit in an int", j, z);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new jh1(iArr3, axe.g((long[][]) arrayList2.toArray(new long[arrayList2.size()])), axe.g((long[][]) arrayList3.toArray(new long[arrayList3.size()])), axe.g((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    public void q(Exception exc) {
        st0.i("MediaCodecAudioRenderer", "Audio sink error", exc);
        b60 b60Var = ((e47) this.b).f1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new z50(b60Var, exc, 8));
        }
    }

    public void r(Object obj) {
        px4 px4Var = (px4) obj;
        px4Var.getClass();
        f61 f61Var = (f61) this.b;
        if (f61Var.t() instanceof f48) {
            f61Var.resumeWith(new gs9(px4Var));
        }
    }

    public void s(Object obj) {
        rx4 rx4Var = (rx4) obj;
        rx4Var.getClass();
        f61 f61Var = (f61) this.b;
        if (f61Var.t() instanceof f48) {
            f61Var.resumeWith(rx4Var);
        }
    }

    public void t(tc0 tc0Var, Thread thread, Throwable th) {
        i92 i92Var = (i92) this.b;
        synchronized (i92Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            z87.w();
            try {
                b2d.a(((wa2) i92Var.e.b).b(new g92(i92Var, System.currentTimeMillis(), th, thread, tc0Var)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 17:
                return ((msa) this.b).toString();
            default:
                return super.toString();
        }
    }

    public void u(hq7 hq7Var) {
        hq7Var.getClass();
        a82.x(((a72) this.b).a(hq7Var));
    }

    @Override // defpackage.qy
    public Object v(i2a i2aVar, Float f, Float f2, xt4 xt4Var, rqa rqaVar) {
        Object e = nae.e(i2aVar, f.floatValue(), yte.a(nae.e, f2.floatValue(), 28), (pq2) this.b, xt4Var, rqaVar);
        if (e == n82.a) {
            return e;
        }
        return (ur) e;
    }

    @Override // defpackage.es6
    public cy5 w(gs6 gs6Var, long j, long j2, IOException iOException, int i) {
        long min;
        cy5 cy5Var;
        bn8 bn8Var = (bn8) gs6Var;
        of2 of2Var = (of2) this.b;
        long j3 = bn8Var.a;
        mg2 mg2Var = bn8Var.b;
        h0b h0bVar = bn8Var.d;
        cs6 cs6Var = new cs6(mg2Var, h0bVar.c, h0bVar.d, j, j2, h0bVar.b);
        int i2 = bn8Var.c;
        of2Var.m.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof xm8) || (th instanceof FileNotFoundException) || (th instanceof mf5) || (th instanceof is6) || ((th instanceof kg2) && ((kg2) th).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            cy5Var = ij1.H;
        } else {
            cy5Var = new cy5(min, 0, false);
        }
        of2Var.q.f(cs6Var, i2, iOException, !cy5Var.a());
        return cy5Var;
    }

    @Override // defpackage.g06
    public void writeLong(long j) {
        uj9 uj9Var = (uj9) this.b;
        byte[] bArr = ana.a;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            uj9Var.P((byte) 48);
            return;
        }
        int i2 = 0;
        int i3 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                zpe.r(uj9Var, "-9223372036854775808", 0, 20);
                return;
            }
            i2 = 1;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i3 = 2;
                    }
                } else if (j < 1000) {
                    i3 = 3;
                } else {
                    i3 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i3 = 5;
                } else {
                    i3 = 6;
                }
            } else if (j < 10000000) {
                i3 = 7;
            } else {
                i3 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i3 = 9;
                } else {
                    i3 = 10;
                }
            } else if (j < 100000000000L) {
                i3 = 11;
            } else {
                i3 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i3 = 13;
            } else if (j < 100000000000000L) {
                i3 = 14;
            } else {
                i3 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i3 = 16;
            } else {
                i3 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i3 = 18;
        } else {
            i3 = 19;
        }
        if (i2 != 0) {
            i3++;
        }
        ly0 ly0Var = uj9Var.c;
        d5a g0 = ly0Var.g0(i3);
        byte[] bArr2 = g0.a;
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                bArr2[g0.c + i4] = ana.a[(byte) (j % 10)];
                j /= 10;
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        if (i2 != 0) {
            bArr2[g0.c] = 45;
        }
        g0.c += i3;
        ly0Var.c += i3;
        uj9Var.C0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Type inference failed for: r11v20, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c7 -> B:47:0x00ca). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00cd -> B:51:0x00d6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d0 -> B:51:0x00d6). Please submit an issue!!! */
    @Override // defpackage.un5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable x(defpackage.xq5 r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwd.x(xq5, n42):java.io.Serializable");
    }

    public boolean y(od6 od6Var) {
        if (!od6Var.J()) {
            lv5.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((msa) this.b).remove(od6Var);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [xl9, java.lang.Object] */
    public ArrayList z(int i) {
        xt4 xt4Var;
        eg6 eg6Var;
        ArrayList arrayList = new ArrayList();
        qg6 qg6Var = (qg6) this.b;
        zqa f = pae.f();
        if (f != null) {
            xt4Var = f.e();
        } else {
            xt4Var = null;
        }
        zqa h = pae.h(f);
        try {
            if (qg6Var.b) {
                eg6Var = qg6Var.c;
            } else {
                eg6Var = (eg6) qg6Var.e.getValue();
            }
            eg6 eg6Var2 = eg6Var;
            if (eg6Var2 != null) {
                ?? obj = new Object();
                obj.a = 1;
                List list = (List) eg6Var2.k.invoke(Integer.valueOf(i));
                int size = list.size();
                int i2 = 0;
                xl9 xl9Var = obj;
                while (i2 < size) {
                    yk8 yk8Var = (yk8) list.get(i2);
                    ei6 ei6Var = qg6Var.o;
                    int intValue = ((Number) yk8Var.a).intValue();
                    long j = ((x02) yk8Var.b).a;
                    yy9 yy9Var = qg6.w;
                    xl9 xl9Var2 = xl9Var;
                    arrayList.add(ei6Var.a(intValue, j, false, new hq((ArrayList) null, xl9Var2, list, i, eg6Var2)));
                    i2++;
                    xl9Var = xl9Var2;
                }
            }
            pae.n(f, h, xt4Var);
            return arrayList;
        } catch (Throwable th) {
            pae.n(f, h, xt4Var);
            throw th;
        }
    }

    @Override // defpackage.iw
    public void d(int i) {
    }

    @Override // defpackage.iw
    public void h(int i) {
    }

    @Override // defpackage.iw
    public void k(int i, float f) {
    }

    public uwd(Context context) {
        String e;
        this.a = 0;
        o0b a = o0b.a(context);
        this.b = a;
        a.b();
        String e2 = a.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e2) || (e = a.e(o0b.f("googleSignInOptions", e2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.c(e);
        } catch (JSONException unused) {
        }
    }

    public /* synthetic */ uwd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public uwd(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = 22;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new hw5(uri, clipDescription, uri2);
        } else {
            this.b = new zg4(7, uri, clipDescription, uri2);
        }
    }
}
