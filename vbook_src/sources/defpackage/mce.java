package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import org.mozilla.javascript.Token;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mce  reason: default package */
/* loaded from: classes.dex */
public final class mce implements qh0, SuccessContinuation, js6, ry8, a6, e9a, f06, na4 {
    public static volatile mce b;
    public static final hw4 c = new hw4(1);
    public static final rif d = new Object();
    public Object a;

    /* JADX WARN: Type inference failed for: r5v1, types: [m07, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, nt2] */
    public mce(int i) {
        la7 la7Var;
        switch (i) {
            case 1:
                z89 z89Var = z89.c;
                try {
                    la7Var = (la7) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    la7Var = c;
                }
                la7[] la7VarArr = {hw4.b, la7Var};
                ?? obj = new Object();
                obj.a = la7VarArr;
                Charset charset = wz5.a;
                this.a = obj;
                return;
            case 5:
                ?? obj2 = new Object();
                obj2.a = null;
                this.a = obj2;
                return;
            case 16:
                this.a = cqe.f(Looper.getMainLooper());
                return;
            case 26:
                this.a = new gw7(new ah6[16], 0);
                return;
            default:
                this.a = new CopyOnWriteArrayList();
                return;
        }
    }

    public static void r(String str, pif pifVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(pifVar.b / 1000000)));
        sb.append(": logging error [");
        ljf ljfVar = pifVar.d;
        if (ljfVar != null) {
            fre.A(1, ljfVar, sb);
            sb.append("]: ");
            sb.append(str);
            System.err.println(sb);
            System.err.flush();
            return;
        }
        vs.k("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.js6
    public void b() {
        of2 of2Var = (of2) this.a;
        of2Var.A.b();
        IOException iOException = of2Var.C;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override // defpackage.ry8
    public void c(qy8 qy8Var) {
        int ordinal = qy8Var.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                h94.A((h94) this.a);
            } else {
                xk5.o();
            }
        }
    }

    @Override // defpackage.e9a
    public void d(f9a f9aVar) {
        g85 g85Var = (g85) f9aVar;
        h75 h75Var = (h75) this.a;
        h75Var.M.d(h75Var);
    }

    @Override // defpackage.a6
    public void e(Object obj) {
        z5 z5Var = (z5) obj;
        hs4 hs4Var = (hs4) this.a;
        ds4 ds4Var = (ds4) hs4Var.F.pollFirst();
        if (ds4Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = ds4Var.a;
        int i = ds4Var.b;
        rr4 t = hs4Var.c.t(str);
        if (t == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        t.u(i, z5Var.a, z5Var.b);
    }

    @Override // defpackage.qh0
    public void f(jz1 jz1Var) {
        boolean z;
        if (jz1Var.b == 0) {
            z = true;
        } else {
            z = false;
        }
        rh0 rh0Var = (rh0) this.a;
        if (z) {
            rh0Var.j(null, rh0Var.k());
            return;
        }
        ph0 ph0Var = rh0Var.p;
        if (ph0Var != null) {
            ph0Var.a(jz1Var);
        }
    }

    @Override // defpackage.f06
    public int g(char[] cArr, int i, int i2) {
        return ((bd1) this.a).a(cArr, i, i2);
    }

    @Override // defpackage.k99
    public Object get() {
        return new uu6((Context) ((nt2) this.a).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r5, java.lang.String r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.sf4
            if (r0 == 0) goto L13
            r0 = r7
            sf4 r0 = (defpackage.sf4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sf4 r0 = new sf4
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r7)
            goto L55
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r7)
            java.lang.Object r4 = r4.a
            com.google.firebase.auth.FirebaseAuth r4 = (com.google.firebase.auth.FirebaseAuth) r4
            defpackage.am8.p(r5)
            defpackage.am8.p(r6)
            y0f r7 = new y0f
            r1 = 2
            r7.<init>(r4, r5, r6, r1)
            java.lang.String r5 = r4.i
            com.google.android.recaptcha.RecaptchaAction r6 = r4.m
            com.google.android.gms.tasks.Task r4 = r7.B(r4, r5, r6)
            r4.getClass()
            r0.c = r2
            java.lang.Object r7 = defpackage.kve.a(r4, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L55
            return r4
        L55:
            r7.getClass()
            ghf r7 = (defpackage.ghf) r7
            e70 r4 = new e70
            r4.<init>(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mce.h(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    public n66 i() {
        Element documentElement = ((Document) this.a).getDocumentElement();
        if (documentElement != null) {
            return new n66(documentElement);
        }
        return null;
    }

    public ArrayList j(String str) {
        str.getClass();
        NodeList elementsByTagName = ((Document) this.a).getElementsByTagName(str);
        ArrayList arrayList = new ArrayList(elementsByTagName.getLength());
        int length = elementsByTagName.getLength();
        for (int i = 0; i < length; i++) {
            Node item = elementsByTagName.item(i);
            item.getClass();
            arrayList.add(new n66(item));
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        if (r12 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
        if (r12 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Type inference failed for: r12v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, defpackage.n42 r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof defpackage.u60
            if (r0 == 0) goto L13
            r0 = r12
            u60 r0 = (defpackage.u60) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            u60 r0 = new u60
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r12)
            goto La4
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L32:
            int r10 = r0.a
            defpackage.hre.r(r12)
            goto L76
        L38:
            defpackage.hre.r(r12)
            java.lang.Object r6 = r6.a
            re5 r6 = (defpackage.re5) r6
            sl8 r12 = defpackage.tl8.b
            vl8 r12 = new vl8
            r1 = 8
            r12.<init>(r1)
            java.lang.String r1 = "token"
            r12.h(r1, r7)
            java.lang.String r7 = "device_id"
            r12.h(r7, r8)
            java.lang.String r7 = "device_name"
            r12.h(r7, r9)
            java.lang.String r7 = "device_type"
            java.lang.String r8 = java.lang.String.valueOf(r10)
            r12.h(r7, r8)
            java.lang.String r7 = "fcm_token"
            r12.h(r7, r11)
            tl8 r7 = r12.Y()
            r0.a = r10
            r0.d = r3
            java.lang.String r8 = "https://vbookapp.com/api/user/login"
            java.lang.Object r12 = defpackage.cbe.u(r6, r8, r7, r0)
            if (r12 != r5) goto L76
            goto La3
        L76:
            oh5 r12 = (defpackage.oh5) r12
            te5 r6 = r12.y0()
            java.lang.Class<or9> r7 = defpackage.or9.class
            gi1 r8 = defpackage.cm9.a(r7)
            w76 r9 = defpackage.w76.c     // Catch: java.lang.Throwable -> L93
            java.lang.Class<j0d> r9 = defpackage.j0d.class
            nsc r9 = defpackage.cm9.d(r9)     // Catch: java.lang.Throwable -> L93
            w76 r9 = defpackage.v9e.y(r9)     // Catch: java.lang.Throwable -> L93
            nsc r7 = defpackage.cm9.e(r7, r9)     // Catch: java.lang.Throwable -> L93
            goto L94
        L93:
            r7 = r4
        L94:
            isc r9 = new isc
            r9.<init>(r8, r7)
            r0.a = r10
            r0.d = r2
            java.lang.Object r12 = r6.a(r9, r0)
            if (r12 != r5) goto La4
        La3:
            return r5
        La4:
            if (r12 == 0) goto La9
            or9 r12 = (defpackage.or9) r12
            return r12
        La9:
            java.lang.String r6 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.UserLoginDto>"
            defpackage.xk5.k(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mce.k(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, n42):java.lang.Object");
    }

    public void l() {
        g85[] g85VarArr;
        g85[] g85VarArr2;
        h75 h75Var = (h75) this.a;
        int i = h75Var.N - 1;
        h75Var.N = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (g85 g85Var : h75Var.P) {
            g85Var.b();
            i2 += g85Var.e0.a;
        }
        ajc[] ajcVarArr = new ajc[i2];
        int i3 = 0;
        for (g85 g85Var2 : h75Var.P) {
            g85Var2.b();
            int i4 = g85Var2.e0.a;
            int i5 = 0;
            while (i5 < i4) {
                g85Var2.b();
                ajcVarArr[i3] = g85Var2.e0.a(i5);
                i5++;
                i3++;
            }
        }
        h75Var.O = new bjc(ajcVarArr);
        h75Var.M.a(h75Var);
    }

    public JSONObject m() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(fca.D(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        fca.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    fca.f(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            fca.f(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fca.f(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        if (r8 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Type inference failed for: r8v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.v60
            if (r0 == 0) goto L13
            r0 = r8
            v60 r0 = (defpackage.v60) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            v60 r0 = new v60
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r8)
            goto L85
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            defpackage.hre.r(r8)
            goto L59
        L35:
            defpackage.hre.r(r8)
            java.lang.Object r6 = r6.a
            re5 r6 = (defpackage.re5) r6
            sl8 r8 = defpackage.tl8.b
            vl8 r8 = new vl8
            r1 = 8
            r8.<init>(r1)
            java.lang.String r1 = "refresh_token"
            r8.h(r1, r7)
            tl8 r7 = r8.Y()
            r0.c = r3
            java.lang.String r8 = "https://vbookapp.com/api/user/token"
            java.lang.Object r8 = defpackage.cbe.u(r6, r8, r7, r0)
            if (r8 != r5) goto L59
            goto L84
        L59:
            oh5 r8 = (defpackage.oh5) r8
            te5 r6 = r8.y0()
            java.lang.Class<or9> r7 = defpackage.or9.class
            gi1 r8 = defpackage.cm9.a(r7)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> L76
            java.lang.Class<jcc> r1 = defpackage.jcc.class
            nsc r1 = defpackage.cm9.d(r1)     // Catch: java.lang.Throwable -> L76
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> L76
            nsc r7 = defpackage.cm9.e(r7, r1)     // Catch: java.lang.Throwable -> L76
            goto L77
        L76:
            r7 = r4
        L77:
            isc r1 = new isc
            r1.<init>(r8, r7)
            r0.c = r2
            java.lang.Object r8 = r6.a(r1, r0)
            if (r8 != r5) goto L85
        L84:
            return r5
        L85:
            if (r8 == 0) goto L8a
            or9 r8 = (defpackage.or9) r8
            return r8
        L8a:
            java.lang.String r6 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.TokenDto>"
            defpackage.xk5.k(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mce.n(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(defpackage.mu9 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.tf4
            if (r0 == 0) goto L13
            r0 = r6
            tf4 r0 = (defpackage.tf4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tf4 r0 = new tf4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L49
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            java.lang.Object r4 = r4.a
            com.google.firebase.auth.FirebaseAuth r4 = (com.google.firebase.auth.FirebaseAuth) r4
            java.lang.Object r5 = r5.a
            zz4 r5 = (defpackage.zz4) r5
            com.google.android.gms.tasks.Task r4 = r4.b(r5)
            r4.getClass()
            r0.c = r2
            java.lang.Object r6 = defpackage.kve.a(r4, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L49
            return r4
        L49:
            r6.getClass()
            ghf r6 = (defpackage.ghf) r6
            e70 r4 = new e70
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mce.o(mu9, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.String r11, java.lang.String r12, defpackage.n42 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.uf4
            if (r0 == 0) goto L13
            r0 = r13
            uf4 r0 = (defpackage.uf4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uf4 r0 = new uf4
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r13)
            goto L59
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L2c:
            defpackage.hre.r(r13)
            java.lang.Object r10 = r10.a
            r4 = r10
            com.google.firebase.auth.FirebaseAuth r4 = (com.google.firebase.auth.FirebaseAuth) r4
            defpackage.am8.p(r11)
            defpackage.am8.p(r12)
            java.lang.String r9 = r4.i
            hyd r3 = new hyd
            r6 = 0
            r7 = 0
            r5 = r11
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.google.android.recaptcha.RecaptchaAction r10 = r4.l
            com.google.android.gms.tasks.Task r10 = r3.B(r4, r9, r10)
            r10.getClass()
            r0.c = r2
            java.lang.Object r13 = defpackage.kve.a(r10, r0)
            n82 r10 = defpackage.n82.a
            if (r13 != r10) goto L59
            return r10
        L59:
            r13.getClass()
            ghf r13 = (defpackage.ghf) r13
            e70 r10 = new e70
            r10.<init>(r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mce.p(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    public sb2 q() {
        String string;
        Activity activity = (Activity) this.a;
        PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), Token.FOR);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List<String> C0 = sl1.C0(arrayList);
        if (C0.isEmpty()) {
            return null;
        }
        sb2 sb2Var = null;
        for (String str : C0) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(activity);
                newInstance.getClass();
                sb2 sb2Var2 = (sb2) newInstance;
                if (!sb2Var2.isAvailableOnDevice()) {
                    continue;
                } else if (sb2Var != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    sb2Var = sb2Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return sb2Var;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        zda zdaVar = (zda) obj;
        i92 i92Var = ((g92) this.a).e;
        if (zdaVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        return Tasks.whenAll(i92.a(i92Var), i92Var.m.C(null, (wa2) i92Var.e.b));
    }

    public /* synthetic */ mce(Object obj) {
        this.a = obj;
    }

    public mce(rh0 rh0Var) {
        Objects.requireNonNull(rh0Var);
        this.a = rh0Var;
    }
}
