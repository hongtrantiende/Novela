package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.vbook.android.R;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.Request;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zg4  reason: default package */
/* loaded from: classes.dex */
public class zg4 implements na4, iw5, wqa, g4a, av4, t38, ny {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [x88, java.lang.Object] */
    public zg4(String str, qi0 qi0Var) {
        this.a = 12;
        str.getClass();
        this.b = str;
        this.c = qi0Var;
        ye5 ye5Var = new ye5();
        ye5Var.a(ni5.b, new oi5(29));
        j34 j34Var = new j34(9, ye5Var.d, new qi5(null, 0));
        ye5Var.d = j34Var;
        ?? obj = new Object();
        obj.a = new bo7(24);
        j34Var.invoke(obj);
        this.d = new re5(new b98(obj), ye5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r9 == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (r9 == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A(defpackage.zg4 r7, defpackage.xt4 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.i49
            if (r0 == 0) goto L13
            r0 = r9
            i49 r0 = (defpackage.i49) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            i49 r0 = new i49
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r9)
            goto L93
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            xt4 r8 = r0.b
            zg4 r7 = r0.a
            defpackage.hre.r(r9)
            goto L49
        L39:
            defpackage.hre.r(r9)
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.io.Serializable r9 = r7.V(r0)
            if (r9 != r5) goto L49
            goto L92
        L49:
            yk8 r9 = (defpackage.yk8) r9
            java.lang.Object r1 = r9.a
            y60 r1 = (defpackage.y60) r1
            java.lang.Object r9 = r9.b
            vyc r9 = (defpackage.vyc) r9
            java.lang.Object r7 = r7.b
            fw2 r7 = (defpackage.fw2) r7
            r0.a = r4
            r0.b = r4
            r0.e = r2
            r9.getClass()
            tl8 r9 = r9.c
            if (r9 == 0) goto L79
            java.lang.String r2 = "error"
            boolean r6 = r9.contains(r2)
            if (r6 != r3) goto L79
            yc8 r4 = new yc8
            java.lang.String r2 = r9.b(r2)
            if (r2 != 0) goto L76
            java.lang.String r2 = ""
        L76:
            r4.<init>(r2)
        L79:
            if (r4 != 0) goto L96
            java.lang.String r2 = "state"
            java.lang.String r2 = r9.b(r2)
            java.lang.String r3 = "code"
            java.lang.String r9 = r9.b(r3)
            b70 r3 = new b70
            r3.<init>(r9, r2)
            java.lang.Object r9 = defpackage.gue.m(r7, r1, r3, r8, r0)
            if (r9 != r5) goto L93
        L92:
            return r5
        L93:
            f4 r9 = (defpackage.f4) r9
            return r9
        L96:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg4.A(zg4, xt4, n42):java.lang.Object");
    }

    public static String B(String str, HashMap hashMap) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb.append(str3);
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb2 = "&".concat(sb2);
            }
            return str.concat(sb2);
        }
        return eub.o(str, "?", sb2);
    }

    public static final void D(zl9 zl9Var, ArrayList arrayList) {
        if (((qv5) zl9Var.a).a.length() == 0 && ((qv5) zl9Var.a).b.isEmpty()) {
            return;
        }
        qv5 qv5Var = (qv5) zl9Var.a;
        String str = qv5Var.a;
        List list = qv5Var.b;
        str.getClass();
        list.getClass();
        arrayList.add(new xl0(hre.q().toString(), en0.a, new cm0(str, list)));
        zl9Var.a = new qv5("", ks3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (j0(r6, r0) == r5) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object O(defpackage.zg4 r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ok1
            if (r0 == 0) goto L13
            r0 = r7
            ok1 r0 = (defpackage.ok1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ok1 r0 = new ok1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r7)
            return r7
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            zg4 r6 = r0.a
            defpackage.hre.r(r7)
            goto L45
        L37:
            defpackage.hre.r(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = j0(r6, r0)
            if (r7 != r5) goto L45
            goto L52
        L45:
            r0.a = r2
            r0.d = r3
            r6.getClass()
            java.lang.Object r6 = A(r6, r2, r0)
            if (r6 != r5) goto L53
        L52:
            return r5
        L53:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg4.O(zg4, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object j0(defpackage.zg4 r9, defpackage.n42 r10) {
        /*
            java.lang.Object r0 = r9.b
            fw2 r0 = (defpackage.fw2) r0
            boolean r1 = r10 instanceof defpackage.k49
            if (r1 == 0) goto L17
            r1 = r10
            k49 r1 = (defpackage.k49) r1
            int r2 = r1.C
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.C = r2
            goto L1c
        L17:
            k49 r1 = new k49
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.e
            int r2 = r1.C
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            n82 r7 = defpackage.n82.a
            if (r2 == 0) goto L53
            if (r2 == r6) goto L46
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L34
            y60 r9 = r1.b
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            return r9
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r3
        L3a:
            int r9 = r1.d
            int r0 = r1.c
            y60 r2 = r1.b
            zg4 r5 = r1.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            goto L94
        L46:
            int r9 = r1.d
            int r0 = r1.c
            zg4 r2 = r1.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r8 = r2
            r2 = r9
            r9 = r8
            goto L74
        L53:
            defpackage.hre.r(r10)
            rc8 r10 = r0.b     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            java.lang.String r10 = r10.a     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r2 = 0
            if (r10 == 0) goto L73
            int r10 = r10.length()     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            if (r10 != 0) goto L64
            goto L73
        L64:
            r1.a = r9     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.c = r2     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.d = r2     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.C = r6     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            java.lang.Object r10 = r0.d(r1)     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            if (r10 != r7) goto L73
            goto La4
        L73:
            r0 = r2
        L74:
            java.lang.Object r10 = r9.b     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            fw2 r10 = (defpackage.fw2) r10     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            y60 r10 = r10.b(r3)     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            java.lang.Object r6 = r9.c     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            di2 r6 = (defpackage.di2) r6     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.a = r9     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.b = r10     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.c = r0     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.d = r2     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.C = r5     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            java.lang.Object r5 = defpackage.w9e.x(r6, r10, r1)     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            if (r5 != r7) goto L91
            goto La4
        L91:
            r5 = r9
            r9 = r2
            r2 = r10
        L94:
            r1.a = r3     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.b = r2     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.c = r0     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.d = r9     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            r1.C = r4     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            java.lang.Object r9 = r5.k0(r2, r1)     // Catch: java.lang.Throwable -> La6 defpackage.ed8 -> Lb5
            if (r9 != r7) goto La5
        La4:
            return r7
        La5:
            return r2
        La6:
            r9 = move-exception
            bd8 r10 = new bd8
            java.lang.String r0 = r9.getMessage()
            if (r0 != 0) goto Lb1
            java.lang.String r0 = "Unknown error"
        Lb1:
            r10.<init>(r0, r9)
            throw r10
        Lb5:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg4.j0(zg4, n42):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [zl9, java.lang.Object] */
    public ArrayList C(String str, List list) {
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        obj.a = new qv5("", ks3.a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gc5 gc5Var = (gc5) it.next();
            if (gc5Var instanceof fc5) {
                obj.a = kte.b((qv5) obj.a, ((fc5) gc5Var).a);
            } else if (gc5Var instanceof ec5) {
                bkb E = E((ec5) gc5Var, true, str);
                if (E instanceof xjb) {
                    D(obj, arrayList);
                    arrayList.add(((xjb) E).a);
                } else if (E instanceof yjb) {
                    D(obj, arrayList);
                    xl1.P(arrayList, ((yjb) E).a);
                } else if (E instanceof zjb) {
                    zjb zjbVar = (zjb) E;
                    obj.a = kte.d((qv5) obj.a, new qv5(zjbVar.a, zjbVar.b));
                } else if (!E.equals(akb.a)) {
                    xk5.o();
                    return null;
                }
            } else {
                xk5.o();
                return null;
            }
        }
        D(obj, arrayList);
        return arrayList;
    }

    public bkb E(ec5 ec5Var, boolean z, String str) {
        o40 o40Var = new o40(this, ec5Var, z, str);
        String str2 = ec5Var.a;
        try {
            oc5 oc5Var = (oc5) this.c;
            oc5Var.getClass();
            str2.getClass();
            Map map = oc5Var.a;
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            ckb ckbVar = (ckb) map.get(lowerCase);
            if (ckbVar != null) {
                return ckbVar.b(o40Var, ec5Var.b, ec5Var.c);
            }
            return G(ec5Var, o40Var, z);
        } catch (Throwable th) {
            int i = ec5Var.d;
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            ((ArrayList) this.d).add(new va5(str2, message, i));
            return akb.a;
        }
    }

    public qv5 F(String str, List list) {
        ArrayList arrayList = (ArrayList) this.d;
        list.getClass();
        qv5 qv5Var = new qv5("", ks3.a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gc5 gc5Var = (gc5) it.next();
            if (gc5Var instanceof fc5) {
                qv5Var = kte.b(qv5Var, ((fc5) gc5Var).a);
            } else if (gc5Var instanceof ec5) {
                ec5 ec5Var = (ec5) gc5Var;
                int i = ec5Var.d;
                String str2 = ec5Var.a;
                bkb E = E(ec5Var, false, str);
                if (E instanceof zjb) {
                    zjb zjbVar = (zjb) E;
                    qv5Var = kte.d(qv5Var, new qv5(zjbVar.a, zjbVar.b));
                } else if (E instanceof xjb) {
                    arrayList.add(new ua5(str2, i));
                    qv5Var = kte.a(qv5Var, tl1.A(((xjb) E).a));
                } else if (E instanceof yjb) {
                    arrayList.add(new ua5(str2, i));
                    qv5Var = kte.a(qv5Var, ((yjb) E).a);
                } else if (!c16.i(E, akb.a)) {
                    xk5.o();
                    return null;
                }
            } else {
                xk5.o();
                return null;
            }
        }
        return qv5Var;
    }

    public bkb G(ec5 ec5Var, o40 o40Var, boolean z) {
        int i = ec5Var.d;
        String str = ec5Var.a;
        ArrayList arrayList = (ArrayList) this.d;
        ((oc5) this.c).getClass();
        Object obj = gwc.a;
        hwc hwcVar = hwc.a;
        if (hwcVar.equals(obj)) {
            return l0(ec5Var, z);
        }
        if (hwcVar.equals(hwcVar)) {
            arrayList.add(new db5(str, i));
            return l0(ec5Var, z);
        } else if (hwcVar.equals(fwc.a)) {
            if (z) {
                return new xjb(new xl0(hre.q().toString(), e59.a, new am0(o17.s(new yk8("tagName", str), new yk8("rawHtml", ((String) ((zg4) o40Var.b).b).substring(i, ec5Var.e))), "html.preserved")));
            }
            arrayList.add(new db5(str, i));
            return l0(ec5Var, false);
        } else {
            xk5.o();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(java.lang.String r7, defpackage.hn8 r8, defpackage.n42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ua6
            if (r0 == 0) goto L13
            r0 = r9
            ua6 r0 = (defpackage.ua6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ua6 r0 = new ua6
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L6e
            goto L69
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L2c:
            defpackage.hre.r(r9)
            java.lang.Object r9 = r6.d     // Catch: java.lang.Throwable -> L6e
            re5 r9 = (defpackage.re5) r9     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = r6.f0(r7)     // Catch: java.lang.Throwable -> L6e
            gh5 r1 = new gh5     // Catch: java.lang.Throwable -> L6e
            r1.<init>()     // Catch: java.lang.Throwable -> L6e
            h40 r4 = defpackage.hh5.a     // Catch: java.lang.Throwable -> L6e
            xtc r4 = r1.a     // Catch: java.lang.Throwable -> L6e
            defpackage.ytc.b(r4, r7)     // Catch: java.lang.Throwable -> L6e
            o45 r7 = r1.c     // Catch: java.lang.Throwable -> L6e
            r7.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r6.c     // Catch: java.lang.Throwable -> L6e
            qi0 r6 = (defpackage.qi0) r6     // Catch: java.lang.Throwable -> L6e
            r6.a(r7)     // Catch: java.lang.Throwable -> L6e
            pg5 r6 = defpackage.pg5.b     // Catch: java.lang.Throwable -> L6e
            r1.d(r6)     // Catch: java.lang.Throwable -> L6e
            hi5 r6 = new hi5     // Catch: java.lang.Throwable -> L6e
            r6.<init>(r1, r9)     // Catch: java.lang.Throwable -> L6e
            f05 r7 = new f05     // Catch: java.lang.Throwable -> L6e
            r7.<init>(r8, r3, r2)     // Catch: java.lang.Throwable -> L6e
            r0.c = r2     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r9 = r6.b(r7, r0)     // Catch: java.lang.Throwable -> L6e
            n82 r6 = defpackage.n82.a
            if (r9 != r6) goto L69
            return r6
        L69:
            wfd r9 = (defpackage.wfd) r9     // Catch: java.lang.Throwable -> L6e
            return r9
        L6c:
            r3 = r6
            goto L71
        L6e:
            r0 = move-exception
            r6 = r0
            goto L6c
        L71:
            wfd r0 = new wfd
            r4 = 0
            r5 = 10
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg4.H(java.lang.String, hn8, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String I(List list) {
        nb5 nb5Var;
        vr1 vr1Var;
        kb5 kb5Var;
        String str;
        String str2;
        kb5 kb5Var2;
        String i0;
        ArrayList arrayList = (ArrayList) this.d;
        mb5 mb5Var = (mb5) this.c;
        oc5 oc5Var = (oc5) this.b;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < list.size()) {
            xl0 xl0Var = (xl0) list.get(i);
            Iterator it = oc5Var.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    ((sx7) it.next()).getClass();
                    String X = X(xl0Var);
                    if (X != null) {
                        nb5Var = new nb5(X);
                        break;
                    }
                } else {
                    nb5Var = null;
                    break;
                }
            }
            jb5 jb5Var = jb5.a;
            if (nb5Var == null) {
                Map map = oc5Var.c;
                xl0Var.getClass();
                dm0 dm0Var = xl0Var.c;
                hn0 hn0Var = xl0Var.b;
                if ((!(hn0Var instanceof fe2) || (vr1Var = (vr1) map.get(hn0Var.c())) == null) && (!(dm0Var instanceof am0) || (vr1Var = (vr1) map.get(((am0) dm0Var).a)) == null)) {
                    vr1Var = (vr1) oc5Var.b.get(cm9.a(hn0Var.getClass()));
                }
                if (vr1Var != null) {
                    try {
                        kb5Var = vr1Var.a(mb5Var, xl0Var, dm0Var);
                    } catch (Throwable th) {
                        arrayList.add(rte.m(tte.i(xl0Var), th));
                        kb5Var = jb5Var;
                    }
                    if (!kb5Var.equals(jb5Var)) {
                        if (kb5Var instanceof ib5) {
                            str = ((ib5) kb5Var).a;
                        } else if (c16.i(kb5Var, jb5Var)) {
                            str = "";
                        } else {
                            xk5.o();
                            return null;
                        }
                        sb.append(str);
                        i++;
                    }
                }
                str = K(xl0Var);
                sb.append(str);
                i++;
            } else {
                ArrayList C = tl1.C(list.get(i));
                for (int i2 = i + 1; i2 < list.size(); i2++) {
                    xl0 xl0Var2 = (xl0) list.get(i2);
                    if (c16.i(X(xl0Var2), nb5Var.a)) {
                        C.add(xl0Var2);
                    }
                }
                try {
                    kb5Var2 = lh9.v(mb5Var, C);
                } catch (Throwable th2) {
                    xl0 xl0Var3 = (xl0) sl1.e0(C);
                    if (xl0Var3 != null) {
                        str2 = tte.i(xl0Var3);
                    } else {
                        str2 = null;
                    }
                    arrayList.add(rte.m(str2, th2));
                    kb5Var2 = jb5Var;
                }
                if (kb5Var2 instanceof ib5) {
                    i0 = ((ib5) kb5Var2).a;
                } else if (kb5Var2.equals(jb5Var)) {
                    i0 = sl1.i0(C, "", null, null, new fo4(this, 2), 30);
                } else {
                    xk5.o();
                    return null;
                }
                sb.append(i0);
                i += C.size();
            }
        }
        return sb.toString();
    }

    public void J(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.b;
        d99 d99Var = new d99(byteArrayOutputStream, hashMap, (HashMap) this.c, (e78) this.d);
        if (obj == null) {
            return;
        }
        e78 e78Var = (e78) hashMap.get(obj.getClass());
        if (e78Var != null) {
            e78Var.a(obj, d99Var);
            return;
        }
        Class<?> cls = obj.getClass();
        throw new RuntimeException("No encoder for " + cls);
    }

    public String K(xl0 xl0Var) {
        Object obj;
        jb5 jb5Var = jb5.a;
        ((oc5) this.b).getClass();
        try {
            xl0Var.c.getClass();
            String a = ((mb5) this.c).a(xl0Var);
            obj = new ib5("<p>" + a + "</p>");
        } catch (Throwable th) {
            ((ArrayList) this.d).add(rte.m(tte.i(xl0Var), th));
            obj = jb5Var;
        }
        if (obj.equals(jb5Var)) {
            return "";
        }
        if (obj instanceof ib5) {
            return ((ib5) obj).a;
        }
        if (c16.i(obj, jb5Var)) {
            return "";
        }
        xk5.o();
        return null;
    }

    public ph5 L() {
        HttpsURLConnection httpsURLConnection;
        ij1.p();
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            String B = B((String) this.b, (HashMap) this.c);
            String concat = "GET Request URL: ".concat(B);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(B).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new ph5(responseCode, sb);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a A[Catch: all -> 0x016b, TryCatch #0 {all -> 0x016b, blocks: (B:13:0x0031, B:64:0x0122, B:67:0x013d, B:68:0x0144, B:70:0x014a, B:72:0x015b, B:73:0x015d, B:74:0x0161, B:18:0x0040, B:60:0x0106, B:21:0x0048, B:23:0x0071, B:24:0x0076, B:26:0x007a, B:27:0x007f, B:28:0x0089, B:30:0x008f, B:31:0x00a5, B:33:0x00a9, B:36:0x00b0, B:38:0x00b4, B:41:0x00b9, B:43:0x00bd, B:44:0x00c3, B:48:0x00cf, B:49:0x00d8, B:51:0x00dc, B:52:0x00e2, B:56:0x00ee, B:57:0x00f6), top: B:81:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(defpackage.pg5 r13, defpackage.bq9 r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg4.M(pg5, bq9, n42):java.lang.Object");
    }

    public p06 N(float f, float f2) {
        r06 r06Var = (r06) this.c;
        r06 r06Var2 = (r06) this.b;
        if (r06Var != r06Var2 && r06Var != r06Var2) {
            ArrayList arrayList = (ArrayList) this.d;
            arrayList.add(r06Var);
            while (arrayList.size() > 0) {
                r06 r06Var3 = (r06) a82.h(1, arrayList);
                if (r06Var3.a <= f2 && r06Var3.b >= f) {
                    return r06Var3;
                }
                r06 r06Var4 = r06Var3.g;
                if (r06Var4 != r06Var2 && r06Var4.f >= f) {
                    arrayList.add(r06Var4);
                }
                r06 r06Var5 = r06Var3.h;
                if (r06Var5 != r06Var2 && r06Var5.e <= f2) {
                    arrayList.add(r06Var5);
                }
            }
            arrayList.clear();
        }
        return qye.d;
    }

    public int P() {
        if (S().a.isEmpty()) {
            return -1;
        }
        long j = ((f37) sl1.c0(S().a)).a - S().h;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public boolean Q() {
        return !S().a.isEmpty();
    }

    public int R() {
        if (S().a.isEmpty()) {
            return -1;
        }
        long j = ((f37) sl1.j0(S().a)).a + S().h;
        long W = W() - 1;
        if (j > W) {
            j = W;
        }
        return (int) j;
    }

    public ij8 S() {
        ij8 ij8Var = (ij8) this.c;
        if (ij8Var != null) {
            return ij8Var;
        }
        c16.w("layoutInfo");
        throw null;
    }

    public int T() {
        if (S().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((f37) sl1.j0(S().a)).k + S().b) + S().c) - S().g);
    }

    public int U() {
        int i = 0;
        if (S().a.isEmpty()) {
            return 0;
        }
        int i2 = ((f37) sl1.c0(S().a)).k + (-S().f);
        if (i2 <= 0) {
            i = i2;
        }
        return Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r7 == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable V(defpackage.n42 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            di2 r0 = (defpackage.di2) r0
            boolean r1 = r8 instanceof defpackage.j49
            if (r1 == 0) goto L17
            r1 = r8
            j49 r1 = (defpackage.j49) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.e = r2
            goto L1c
        L17:
            j49 r1 = new j49
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r7 = r1.c
            int r8 = r1.e
            r2 = 3
            r3 = 1
            r4 = 2
            n82 r5 = defpackage.n82.a
            if (r8 == 0) goto L46
            if (r8 == r3) goto L42
            if (r8 == r4) goto L3c
            if (r8 != r2) goto L35
            vyc r8 = r1.b
            y60 r0 = r1.a
            defpackage.hre.r(r7)
            goto L77
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L3c:
            y60 r8 = r1.a
            defpackage.hre.r(r7)
            goto L62
        L42:
            defpackage.hre.r(r7)
            goto L52
        L46:
            defpackage.hre.r(r7)
            r1.e = r3
            java.lang.Object r7 = defpackage.w9e.s(r0, r1)
            if (r7 != r5) goto L52
            goto L74
        L52:
            y60 r7 = (defpackage.y60) r7
            r1.a = r7
            r1.e = r4
            java.io.Serializable r8 = defpackage.w9e.t(r0, r1)
            if (r8 != r5) goto L5f
            goto L74
        L5f:
            r6 = r8
            r8 = r7
            r7 = r6
        L62:
            vyc r7 = (defpackage.vyc) r7
            if (r8 == 0) goto L85
            if (r7 == 0) goto L7d
            r1.a = r8
            r1.b = r7
            r1.e = r2
            java.lang.Object r0 = defpackage.w9e.q(r0, r1)
            if (r0 != r5) goto L75
        L74:
            return r5
        L75:
            r0 = r8
            r8 = r7
        L77:
            yk8 r7 = new yk8
            r7.<init>(r0, r8)
            return r7
        L7d:
            yc8 r7 = new yc8
            java.lang.String r8 = "No responseUri present"
            r7.<init>(r8)
            throw r7
        L85:
            yc8 r7 = new yc8
            java.lang.String r8 = "No authRequest present"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg4.V(n42):java.io.Serializable");
    }

    public int W() {
        return ((Number) ((yh6) this.b).invoke()).intValue();
    }

    public String X(xl0 xl0Var) {
        try {
            xl0Var.getClass();
            hn0 hn0Var = xl0Var.b;
            if (!c16.i(hn0Var, zm0.a)) {
                if (!(hn0Var instanceof dn0)) {
                    return null;
                }
                return "listOutline";
            }
            return "listOutline";
        } catch (Throwable th) {
            ((ArrayList) this.d).add(rte.m(tte.i(xl0Var), th));
            return null;
        }
    }

    public boolean Y() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.d) != null) {
            return true;
        }
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.b).readLine();
            this.d = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.d = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    public void Z(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    @Override // defpackage.t38
    public void a(y28 y28Var, int i) {
        if (y28Var instanceof cp3) {
            y((cp3) y28Var, i);
        }
    }

    public void a0(int i) {
        String M;
        bp3 bp3Var = (bp3) this.c;
        bp3Var.b('\n');
        String[] strArr = d4b.a;
        sc3 sc3Var = (sc3) this.d;
        int i2 = i * sc3Var.e;
        int i3 = sc3Var.f;
        if (i2 >= 0) {
            if (i3 >= -1) {
                if (i3 != -1) {
                    i2 = Math.min(i2, i3);
                }
                String[] strArr2 = d4b.a;
                if (i2 < 21) {
                    M = strArr2[i2];
                } else {
                    M = r4b.M(i2, " ");
                }
                bp3Var.c(M);
                return;
            }
            vs.m("Failed requirement.");
            return;
        }
        vs.m("width must be >= 0");
    }

    @Override // defpackage.g4a
    public void b(km8 km8Var) {
        long d;
        long j;
        long j2;
        ((lac) this.c).getClass();
        String str = a2d.a;
        lac lacVar = (lac) this.c;
        synchronized (lacVar) {
            try {
                long j3 = lacVar.c;
                if (j3 != -9223372036854775807L) {
                    d = j3 + lacVar.b;
                } else {
                    d = lacVar.d();
                }
                j = d;
            } finally {
            }
        }
        lac lacVar2 = (lac) this.c;
        synchronized (lacVar2) {
            j2 = lacVar2.b;
        }
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            vq4 vq4Var = (vq4) this.b;
            if (j2 != vq4Var.t) {
                uq4 a = vq4Var.a();
                a.s = j2;
                vq4 vq4Var2 = new vq4(a);
                this.b = vq4Var2;
                ((fjc) this.d).g(vq4Var2);
            }
            int a2 = km8Var.a();
            ((fjc) this.d).e(a2, km8Var);
            ((fjc) this.d).a(j, 1, a2, 0, null);
        }
    }

    public String b0() {
        if (Y()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        xk5.g();
        return null;
    }

    @Override // defpackage.ny
    public void c(int i, Object obj) {
        vu7 vu7Var = (vu7) this.b;
        vu7Var.a(5);
        vu7Var.a(i);
        ((kv7) this.c).a(obj);
    }

    public void c0(f0 f0Var, zm9 zm9Var) {
        Exception exc;
        Exception exc2;
        int i;
        int i2;
        vu7 vu7Var = (vu7) this.b;
        int i3 = vu7Var.b;
        kv7 kv7Var = (kv7) this.c;
        kv7 kv7Var2 = new kv7();
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i4 + 1;
            try {
                try {
                    switch (vu7Var.c(i4)) {
                        case 0:
                            f0Var.n();
                            i4 = i6;
                            break;
                        case 1:
                            int i7 = i5 + 1;
                            f0Var.e(kv7Var.f(i5));
                            i5 = i7;
                            i4 = i6;
                            break;
                        case 2:
                            int i8 = i4 + 2;
                            i4 += 3;
                            f0Var.k(vu7Var.c(i6), vu7Var.c(i8));
                            break;
                        case 3:
                            int i9 = i4 + 2;
                            try {
                                i = i4 + 3;
                            } catch (Exception e) {
                                exc = e;
                                i4 = i9;
                            }
                            try {
                                i4 += 4;
                                f0Var.i(vu7Var.c(i6), vu7Var.c(i9), vu7Var.c(i));
                                break;
                            } catch (Exception e2) {
                                exc = e2;
                                i4 = i;
                                throw new gw1(kv7Var, kv7Var2, vu7Var, i4 - 1, exc);
                            }
                        case 4:
                            f0Var.d();
                            i4 = i6;
                            break;
                        case 5:
                            i4 += 2;
                            i2 = i5 + 1;
                            f0Var.c(vu7Var.c(i6), kv7Var.f(i5));
                            i5 = i2;
                            break;
                        case 6:
                            i4 += 2;
                            try {
                                i2 = i5 + 1;
                                f0Var.p(vu7Var.c(i6), kv7Var.f(i5));
                                i5 = i2;
                                break;
                            } catch (Exception e3) {
                                exc2 = e3;
                                exc = exc2;
                                throw new gw1(kv7Var, kv7Var2, vu7Var, i4 - 1, exc);
                            }
                        case 7:
                            int i10 = i5 + 1;
                            Object f = kv7Var.f(i5);
                            f.getClass();
                            jsc.u(2, f);
                            i5 += 2;
                            f0Var.j(kv7Var.f(i10), (lu4) f);
                            i4 = i6;
                            break;
                        case 8:
                            Object obj = f0Var.b;
                            if (obj instanceof ew1) {
                                ew1 ew1Var = (ew1) obj;
                                if (((gw7) zm9Var.e).j(ew1Var)) {
                                    ew1Var.c();
                                }
                            }
                            kv7Var2.a(obj);
                            f0Var.f();
                            i4 = i6;
                            break;
                        default:
                            i4 = i6;
                            break;
                    }
                } catch (Exception e4) {
                    exc2 = e4;
                    i4 = i6;
                    exc = exc2;
                    throw new gw1(kv7Var, kv7Var2, vu7Var, i4 - 1, exc);
                }
            } catch (Throwable th) {
                f0Var.q();
                throw th;
            }
        }
        if (i5 != kv7Var.b) {
            ex1.a("Applier operation size mismatch");
        }
        kv7Var.d();
        vu7Var.b = 0;
        f0Var.q();
    }

    @Override // defpackage.g4a
    public void d(lac lacVar, t94 t94Var, zc7 zc7Var) {
        this.c = lacVar;
        zc7Var.a();
        zc7Var.b();
        fjc s = t94Var.s(zc7Var.c, 5);
        this.d = s;
        s.g((vq4) this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r4 == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r4 == r7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d0(defpackage.oh5 r5, defpackage.gi1 r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.wa6
            if (r0 == 0) goto L13
            r0 = r7
            wa6 r0 = (defpackage.wa6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wa6 r0 = new wa6
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.a
            int r7 = r0.c
            r1 = 0
            r2 = 2
            r3 = 1
            if (r7 == 0) goto L33
            if (r7 == r3) goto L2f
            if (r7 != r2) goto L29
            defpackage.hre.r(r4)
            goto L77
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r1
        L2f:
            defpackage.hre.r(r4)
            goto L5e
        L33:
            defpackage.hre.r(r4)
            java.lang.Class<pvc> r4 = defpackage.pvc.class
            gi1 r4 = defpackage.cm9.a(r4)
            boolean r4 = defpackage.c16.i(r6, r4)
            if (r4 == 0) goto L45
            pvc r4 = defpackage.pvc.a
            return r4
        L45:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            gi1 r4 = defpackage.cm9.a(r4)
            boolean r4 = defpackage.c16.i(r6, r4)
            n82 r7 = defpackage.n82.a
            if (r4 == 0) goto L62
            r0.c = r3
            java.nio.charset.Charset r4 = defpackage.ed1.a
            java.lang.Object r4 = defpackage.que.o(r5, r4, r0)
            if (r4 != r7) goto L5e
            goto L76
        L5e:
            r4.getClass()
            return r4
        L62:
            java.lang.Class<byte[]> r4 = byte[].class
            gi1 r4 = defpackage.cm9.a(r4)
            boolean r4 = defpackage.c16.i(r6, r4)
            if (r4 == 0) goto L7b
            r0.c = r2
            java.io.Serializable r4 = defpackage.ade.x(r5, r0)
            if (r4 != r7) goto L77
        L76:
            return r7
        L77:
            r4.getClass()
            return r4
        L7b:
            java.lang.String r4 = "Unsupported response type: "
            defpackage.xk5.p(r6, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg4.d0(oh5, gi1, n42):java.lang.Object");
    }

    @Override // defpackage.ny
    public void e(Object obj) {
        ((vu7) this.b).a(1);
        ((kv7) this.c).a(obj);
    }

    public yx5 e0(gi1 gi1Var, nf9 nf9Var, nf9 nf9Var2) {
        gi1Var.getClass();
        nf9Var2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(v66.a(gi1Var));
        sb.append(':');
        sb.append((nf9Var == null || (r3 = nf9Var.getValue()) == null) ? "" : "");
        sb.append(':');
        sb.append(nf9Var2);
        return (yx5) ((ConcurrentHashMap) this.c).get(sb.toString());
    }

    @Override // defpackage.ny
    public void f() {
        ((vu7) this.b).a(8);
    }

    public String f0(String str) {
        if (!r4b.Q(str, "http://", false) && !r4b.Q(str, "https://", false)) {
            return eub.o(k4b.Q0((String) this.b, '/'), "/", k4b.S0(str, '/'));
        }
        return str;
    }

    @Override // defpackage.iw5
    public Uri g() {
        return (Uri) this.b;
    }

    public void g0(r06 r06Var) {
        r06 r06Var2 = r06Var.h;
        r06 r06Var3 = r06Var2.g;
        r06Var.h = r06Var3;
        r06 r06Var4 = (r06) this.b;
        if (r06Var3 != r06Var4) {
            r06Var3.i = r06Var;
        }
        r06Var2.i = r06Var.i;
        r06 r06Var5 = r06Var.i;
        if (r06Var5 == r06Var4) {
            this.c = r06Var2;
        } else if (r06Var5.g == r06Var) {
            r06Var5.g = r06Var2;
        } else {
            r06Var5.h = r06Var2;
        }
        r06Var2.g = r06Var;
        r06Var.i = r06Var2;
        m0(r06Var);
    }

    @Override // defpackage.k99
    public Object get() {
        Context context = (Context) ((nt2) this.b).a;
        d82 d82Var = (d82) ((j99) this.c).get();
        waa waaVar = (waa) ((j99) this.d).get();
        context.getClass();
        d82Var.getClass();
        waaVar.getClass();
        return wg4.a(waaVar, new bp9(new cq2(waaVar, 26), 0), k27.a(d82Var), new vg4(context, 1));
    }

    @Override // defpackage.iw5
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // defpackage.wqa
    public float h(float f, float f2) {
        rj8 rj8Var = (rj8) this.b;
        int o = rj8Var.o();
        hm8 hm8Var = rj8Var.m;
        int i = ((ij8) hm8Var.getValue()).c + o;
        if (i == 0) {
            return nae.e;
        }
        int i2 = (f > nae.e ? 1 : (f == nae.e ? 0 : -1));
        int i3 = rj8Var.e;
        if (i2 < 0) {
            i3++;
        }
        int i4 = 0;
        int n = dce.n(((int) (f2 / i)) + i3, 0, rj8Var.n());
        rj8Var.o();
        int i5 = ((ij8) hm8Var.getValue()).c;
        int abs = Math.abs((dce.n(((kj8) this.d).d(i3, n), 0, rj8Var.n()) - i3) * i) - i;
        if (abs >= 0) {
            i4 = abs;
        }
        if (i4 == 0) {
            return i4;
        }
        return Math.signum(f) * i4;
    }

    public void h0(r06 r06Var) {
        r06 r06Var2 = r06Var.g;
        r06 r06Var3 = r06Var2.h;
        r06Var.g = r06Var3;
        r06 r06Var4 = (r06) this.b;
        if (r06Var3 != r06Var4) {
            r06Var3.i = r06Var;
        }
        r06Var2.i = r06Var.i;
        r06 r06Var5 = r06Var.i;
        if (r06Var5 == r06Var4) {
            this.c = r06Var2;
        } else if (r06Var5.h == r06Var) {
            r06Var5.h = r06Var2;
        } else {
            r06Var5.g = r06Var2;
        }
        r06Var2.h = r06Var;
        r06Var.i = r06Var2;
        m0(r06Var);
    }

    @Override // defpackage.ny
    public void i(int i, int i2, int i3) {
        vu7 vu7Var = (vu7) this.b;
        vu7Var.a(3);
        vu7Var.a(i);
        vu7Var.a(i2);
        vu7Var.a(i3);
    }

    public void i0(ld0 ld0Var, int i, boolean z) {
        Long l;
        dd0 dd0Var = (dd0) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = ld0Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        c69 c69Var = ld0Var.c;
        adler32.update(allocate.putInt(d69.a(c69Var)).array());
        byte[] bArr = ld0Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        mwe.l(ld0Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((hw9) this.c).o().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(d69.a(c69Var))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(dd0Var.a(c69Var, longValue, i));
            Set set = ((ed0) dd0Var.b.get(c69Var)).c;
            if (set.contains(e0a.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e0a.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e0a.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", d69.a(c69Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {ld0Var, Integer.valueOf(value), Long.valueOf(dd0Var.a(c69Var, longValue, i)), l, Integer.valueOf(i)};
            String p = mwe.p("JobInfoScheduler");
            if (Log.isLoggable(p, 3)) {
                Log.d(p, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.ny
    public void j(Object obj, lu4 lu4Var) {
        ((vu7) this.b).a(7);
        kv7 kv7Var = (kv7) this.c;
        kv7Var.a(lu4Var);
        kv7Var.a(obj);
    }

    @Override // defpackage.ny
    public void k(int i, int i2) {
        vu7 vu7Var = (vu7) this.b;
        vu7Var.a(2);
        vu7Var.a(i);
        vu7Var.a(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k0(defpackage.y60 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zw8
            if (r0 == 0) goto L13
            r0 = r6
            zw8 r0 = (defpackage.zw8) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zw8 r0 = new zw8
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L4c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            java.lang.Object r4 = r4.d
            rfd r4 = (defpackage.rfd) r4
            vyc r5 = r5.a
            tl8 r6 = r5.c
            java.lang.String r1 = "redirect_uri"
            java.lang.String r6 = r6.b(r1)
            if (r6 != 0) goto L41
            java.lang.String r6 = ""
        L41:
            r0.c = r2
            java.lang.Object r6 = r4.g(r5, r6, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L4c
            return r4
        L4c:
            ufd r6 = (defpackage.ufd) r6
            r6.getClass()
            boolean r4 = r6 instanceof defpackage.sfd
            if (r4 != 0) goto L58
            pvc r4 = defpackage.pvc.a
            return r4
        L58:
            xc8 r4 = new xc8
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg4.k0(y60, n42):java.lang.Object");
    }

    public bkb l0(ec5 ec5Var, boolean z) {
        String str = ec5Var.a;
        ArrayList arrayList = ec5Var.c;
        if (z) {
            return new yjb(C(str, arrayList));
        }
        qv5 F = F(str, arrayList);
        return new zjb(F.a, F.b);
    }

    @Override // defpackage.iw5
    public Uri m() {
        return (Uri) this.d;
    }

    public void m0(r06 r06Var) {
        while (r06Var != ((r06) this.b)) {
            r06Var.e = Math.min(r06Var.a, Math.min(r06Var.g.e, r06Var.h.e));
            r06Var.f = Math.max(r06Var.b, Math.max(r06Var.g.f, r06Var.h.f));
            r06Var = r06Var.i;
        }
    }

    @Override // defpackage.ny
    public void n() {
        ((vu7) this.b).a(0);
    }

    @Override // defpackage.wqa
    public float o(float f) {
        rj8 rj8Var = (rj8) this.b;
        xqa xqaVar = rj8Var.m().n;
        List list = rj8Var.m().a;
        int size = list.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            f37 f37Var = (f37) list.get(i);
            nxe.w(rj8Var.m());
            int i2 = rj8Var.m().f;
            int i3 = rj8Var.m().d;
            int i4 = rj8Var.m().b;
            float a = f37Var.k - xqaVar.a(f37Var.a, rj8Var.n());
            if (a <= nae.e && a > f2) {
                f2 = a;
            }
            if (a >= nae.e && a < f3) {
                f3 = a;
            }
        }
        if (f2 == Float.NEGATIVE_INFINITY) {
            f2 = f3;
        }
        if (f3 == Float.POSITIVE_INFINITY) {
            f3 = f2;
        }
        if (!rj8Var.c()) {
            if (zxe.r(rj8Var, f)) {
                f2 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
        }
        if (!rj8Var.b()) {
            f2 = 0.0f;
            if (!zxe.r(rj8Var, f)) {
                f3 = 0.0f;
            }
        }
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(f3);
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        float floatValue3 = ((Number) ((em7) this.c).c(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
        if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != nae.e) {
            ov5.c("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
        }
        if (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) {
            return nae.e;
        }
        return floatValue3;
    }

    @Override // defpackage.av4
    public void onSuccess(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = (ViewGroup) this.c;
        View view2 = (View) this.b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            view.setId(R.id.exo_media_route_button_placeholder);
            view.setLayoutParams(layoutParams);
            int indexOfChild = viewGroup.indexOfChild(view2);
            viewGroup.removeView(view2);
            viewGroup.addView(view, indexOfChild);
            view.setVisibility(0);
            ((qz8) this.d).a.h(view, true);
            return;
        }
        vs.k("The media route button placeholder missing layout params.");
    }

    @Override // defpackage.ny
    public void p(int i, Object obj) {
        vu7 vu7Var = (vu7) this.b;
        vu7Var.a(6);
        vu7Var.a(i);
        ((kv7) this.c).a(obj);
    }

    @Override // defpackage.ny
    public Object r() {
        return this.d;
    }

    @Override // defpackage.av4
    public void s(Throwable th) {
        ((View) this.b).setVisibility(8);
    }

    @Override // defpackage.iw5
    public Object t() {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 18:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                eb5 eb5Var = (eb5) ((eb5) this.c).c;
                String str = "";
                while (eb5Var != null) {
                    Object obj = eb5Var.b;
                    sb.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    eb5Var = (eb5) eb5Var.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.t38
    public void v(y28 y28Var, int i) {
        if (y28Var.getClass() == fwb.class) {
            z((fwb) y28Var, 0, i);
        } else if (y28Var instanceof cp3) {
            w((cp3) y28Var, i);
        } else {
            x((al6) y28Var, i);
        }
    }

    public void w(cp3 cp3Var, int i) {
        cp3Var.y((bp3) this.c, (sc3) this.d);
    }

    public void x(al6 al6Var, int i) {
        al6Var.y((bp3) this.c, (sc3) this.d);
    }

    public void y(cp3 cp3Var, int i) {
        cp3Var.U((bp3) this.c, (sc3) this.d);
    }

    public void z(fwb fwbVar, int i, int i2) {
        char[] cArr = hu3.a;
        hu3.c((bp3) this.c, fwbVar.H(), (sc3) this.d, i | 1);
    }

    @Override // defpackage.iw5
    public void l() {
    }

    public zg4(fw2 fw2Var, di2 di2Var, rfd rfdVar) {
        this.a = 23;
        fw2Var.getClass();
        di2Var.getClass();
        this.b = fw2Var;
        this.c = di2Var;
        this.d = rfdVar;
    }

    public zg4(oc5 oc5Var, mb5 mb5Var, ArrayList arrayList) {
        this.a = 4;
        oc5Var.getClass();
        this.b = oc5Var;
        this.c = mb5Var;
        this.d = arrayList;
    }

    public zg4(gk9 gk9Var) {
        this.a = 19;
        this.b = new AtomicInteger(0);
        this.c = new bm1(3);
        this.d = new mm7(10, this, gk9Var);
    }

    public zg4(String str, HashMap hashMap) {
        this.a = 5;
        this.b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public zg4(m96 m96Var) {
        this.a = 9;
        this.b = m96Var;
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    public zg4(String str, oc5 oc5Var, ArrayList arrayList) {
        this.a = 3;
        str.getClass();
        oc5Var.getClass();
        this.b = str;
        this.c = oc5Var;
        this.d = arrayList;
    }

    public zg4(View view) {
        this.a = 8;
        this.b = view;
        this.c = ipe.x(sk6.c, new ik(this, 13));
        this.d = new bp9(view);
    }

    public zg4(yh6 yh6Var) {
        this.a = 20;
        this.b = yh6Var;
    }

    public zg4(qt1 qt1Var) {
        this.a = 16;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = qt1Var;
    }

    public /* synthetic */ zg4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public zg4(int i) {
        this.a = i;
        switch (i) {
            case 25:
                long[] jArr = tz9.a;
                this.b = new tv7();
                return;
            default:
                r06 r06Var = new r06(this, Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
                this.b = r06Var;
                this.c = r06Var;
                this.d = new ArrayList();
                return;
        }
    }

    public zg4(cq9 cq9Var, Request request, w88 w88Var) {
        this.a = 29;
        this.b = request;
        this.c = w88Var;
        Objects.requireNonNull(cq9Var);
        this.d = cq9Var;
    }

    public zg4(String str, int i) {
        this.a = i;
        switch (i) {
            case 22:
                uq4 uq4Var = new uq4();
                uq4Var.m = lc7.p("video/mp2t");
                uq4Var.n = lc7.p(str);
                this.b = new vq4(uq4Var);
                return;
            default:
                eb5 eb5Var = new eb5(8, false);
                this.c = eb5Var;
                this.d = eb5Var;
                this.b = str;
                return;
        }
    }

    public zg4(Object obj) {
        this.a = 28;
        this.b = new vu7();
        this.c = new kv7();
        this.d = obj;
    }

    public zg4(qz8 qz8Var, View view, ViewGroup viewGroup) {
        this.a = 24;
        this.d = qz8Var;
        this.b = view;
        this.c = viewGroup;
    }

    public zg4(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 2;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }
}
