package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eb5  reason: default package */
/* loaded from: classes.dex */
public class eb5 implements dy5, f06, l6b, r6b, oa4, Callback, mn3, na4, xf9 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public eb5(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new gw7(new od6[16], 0);
                return;
            case 15:
                this.b = new ArrayList();
                this.c = new ArrayList();
                return;
            case 24:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                return;
            default:
                this.b = new tv7();
                this.c = new tv7();
                return;
        }
    }

    public static void m(od6 od6Var) {
        if (od6Var.m0 > 0) {
            if (od6Var.d0.d == kd6.e && !od6Var.q() && !od6Var.r() && !od6Var.n0 && od6Var.K()) {
                mq7 mq7Var = (mq7) od6Var.c0.C;
                if ((mq7Var.d & 256) != 0) {
                    while (mq7Var != null) {
                        if ((mq7Var.c & 256) != 0) {
                            mq7 mq7Var2 = mq7Var;
                            gw7 gw7Var = null;
                            while (mq7Var2 != null) {
                                if (mq7Var2 instanceof hz4) {
                                    hz4 hz4Var = (hz4) mq7Var2;
                                    hz4Var.t(voe.s(hz4Var, 256));
                                } else if ((mq7Var2.c & 256) != 0 && (mq7Var2 instanceof m03)) {
                                    int i = 0;
                                    for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                        if ((mq7Var3.c & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                mq7Var2 = mq7Var3;
                                            } else {
                                                if (gw7Var == null) {
                                                    gw7Var = new gw7(new mq7[16], 0);
                                                }
                                                if (mq7Var2 != null) {
                                                    gw7Var.b(mq7Var2);
                                                    mq7Var2 = null;
                                                }
                                                gw7Var.b(mq7Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                mq7Var2 = voe.h(gw7Var);
                            }
                        }
                        if ((mq7Var.d & 256) == 0) {
                            break;
                        }
                        mq7Var = mq7Var.f;
                    }
                }
            }
            od6Var.l0 = false;
            gw7 z = od6Var.z();
            Object[] objArr = z.a;
            int i2 = z.c;
            for (int i3 = 0; i3 < i2; i3++) {
                m((od6) objArr[i3]);
            }
        }
    }

    @Override // defpackage.xf9
    public void a(wf9 wf9Var, int i) {
        int[] iArr = (int[]) this.c;
        try {
            wf9Var.read((byte[]) this.b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            wf9Var.close();
        }
    }

    @Override // defpackage.l6b
    public m6b apply() {
        return ((be6) this.b).f(this.c);
    }

    @Override // defpackage.l6b
    public boolean b(iu1 iu1Var) {
        return true;
    }

    @Override // defpackage.r6b
    public void c(q6b q6bVar) {
        int i;
        gv7 gv7Var = (gv7) this.c;
        gv7Var.a();
        lv7 lv7Var = (lv7) q6bVar.b;
        Object[] objArr = lv7Var.b;
        long[] jArr = lv7Var.c;
        int i2 = lv7Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj = objArr[i2];
            Object b = ((sh6) this.b).b(obj);
            int d = gv7Var.d(b);
            if (d >= 0) {
                i = gv7Var.c[d];
            } else {
                i = 0;
            }
            if (i == 7) {
                q6bVar.remove(obj);
            } else {
                gv7Var.g(i + 1, b);
            }
            i2 = i3;
        }
    }

    @Override // okhttp3.Callback
    public void d(Call call, Response response) {
        if (!call.Q()) {
            ((f61) this.c).resumeWith(response);
        }
    }

    @Override // okhttp3.Callback
    public void e(Call call, IOException iOException) {
        Object obj;
        f61 f61Var = (f61) this.c;
        if (f61Var.t() instanceof i61) {
            return;
        }
        oe4 oe4Var = (oe4) this.b;
        if (iOException instanceof t0b) {
            Throwable cause = iOException.getCause();
            if (cause != null) {
                iOException = cause;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            if (message != null && k4b.V(message, "connect", true)) {
                pw6 pw6Var = ni5.a;
                oe4Var.getClass();
                StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                sb.append((vyc) oe4Var.b);
                sb.append(", connect_timeout=");
                li5 li5Var = (li5) oe4Var.b();
                if (li5Var == null || (obj = li5Var.b) == null) {
                    obj = NetworkResponseData.UNKNOWN_CONTENT_TYPE;
                }
                sb.append(obj);
                sb.append(" ms]");
                iOException = new cz1(sb.toString(), iOException);
            } else {
                iOException = ni5.a(oe4Var, iOException);
            }
        }
        f61Var.resumeWith(new gs9(iOException));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02a1, code lost:
        if (java.lang.Math.abs(r3 - r1) > 1.05E-6f) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a5, code lost:
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0301, code lost:
        if (java.lang.Math.abs(r3 - r1) > 1.05E-6f) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x032f, code lost:
        if (java.lang.Math.abs(r3 - r1) > 1.05E-6f) goto L116;
     */
    @Override // defpackage.mn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float f(float r30) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb5.f(float):float");
    }

    @Override // defpackage.f06
    public int g(char[] cArr, int i, int i2) {
        int i3;
        int g;
        psa psaVar = (psa) this.c;
        Character ch = (Character) this.b;
        if (ch != null) {
            cArr[i] = ch.charValue();
            this.b = null;
            i3 = 1;
        } else {
            i3 = 0;
        }
        while (i3 < i2 && !psaVar.k()) {
            if (psaVar instanceof ly0) {
                g = zpe.g((ly0) psaVar);
            } else {
                psaVar.w(1L);
                byte o = psaVar.b().o(0L);
                if ((o & 224) == 192) {
                    psaVar.w(2L);
                } else if ((o & 240) == 224) {
                    psaVar.w(3L);
                } else if ((o & 248) == 240) {
                    psaVar.w(4L);
                }
                g = zpe.g(psaVar.b());
            }
            if (g <= 65535) {
                cArr[i + i3] = (char) g;
                i3++;
            } else {
                char c = (char) ((g & 1023) + 56320);
                cArr[i + i3] = (char) ((g >>> 10) + 55232);
                int i4 = i3 + 1;
                if (i4 < i2) {
                    cArr[i4 + i] = c;
                    i3 += 2;
                } else {
                    this.b = Character.valueOf(c);
                    i3 = i4;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // defpackage.k99
    public Object get() {
        switch (this.a) {
            case 7:
                return new ub7((Context) ((u4) this.b).b, (ij1) ((n07) this.c).get());
            case 20:
                return new n69((Context) ((nt2) this.b).a, (r2d) ((j99) this.c).get());
            default:
                return new wba((fea) ((j99) this.b).get(), (fea) ((j99) this.c).get());
        }
    }

    @Override // defpackage.r6b
    public boolean h(Object obj, Object obj2) {
        sh6 sh6Var = (sh6) this.b;
        return c16.i(sh6Var.b(obj), sh6Var.b(obj2));
    }

    @Override // defpackage.l6b
    public boolean i() {
        return true;
    }

    public void j() {
        uo3 uo3Var = (uo3) this.c;
        uo3Var.getClass();
        so3 e = uo3Var.e();
        e.getClass();
        uo3Var.j(so3.a(e, null, null, null, null, null, 15).b());
        uo3Var.c(uo3Var.e().a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(android.net.Uri r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mx9
            if (r0 == 0) goto L13
            r0 = r6
            mx9 r0 = (defpackage.mx9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mx9 r0 = new mx9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            lr8 r4 = r0.a
            defpackage.hre.r(r6)
            return r4
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            lr8 r6 = new lr8
            java.lang.Object r4 = r4.c
            android.content.Context r4 = (android.content.Context) r4
            r4.getClass()
            r6.<init>(r4)
            cza r4 = r6.b
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r4 instanceof defpackage.dz1
            if (r4 != 0) goto L54
            r0.a = r6
            r0.d = r2
            java.lang.Object r4 = r6.a(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L54
            return r5
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb5.k(android.net.Uri, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3 < r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            gw7 r0 = (defpackage.gw7) r0
            kn4 r1 = defpackage.kn4.e
            java.lang.Object[] r2 = r0.a
            int r3 = r0.c
            r4 = 0
            java.util.Arrays.sort(r2, r4, r3, r1)
            int r1 = r0.c
            java.lang.Object r2 = r6.c
            od6[] r2 = (defpackage.od6[]) r2
            if (r2 == 0) goto L19
            int r3 = r2.length
            if (r3 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            od6[] r2 = new defpackage.od6[r2]
        L21:
            r3 = 0
            r6.c = r3
        L24:
            if (r4 >= r1) goto L2f
            java.lang.Object[] r5 = r0.a
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L24
        L2f:
            r0.g()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L48
            r0 = r2[r1]
            r0.getClass()
            boolean r4 = r0.l0
            if (r4 == 0) goto L43
            m(r0)
        L43:
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L34
        L48:
            r6.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb5.l():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(defpackage.vyc r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.wc8
            if (r0 == 0) goto L13
            r0 = r9
            wc8 r0 = (defpackage.wc8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wc8 r0 = new wc8
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            s46 r7 = r0.a
            defpackage.hre.r(r9)
            goto L95
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L33:
            s46 r8 = r0.a
            re5 r8 = (defpackage.re5) r8
            defpackage.hre.r(r9)
            goto L5d
        L3b:
            defpackage.hre.r(r9)
            java.lang.Object r9 = r7.b
            re5 r9 = (defpackage.re5) r9
            gh5 r1 = new gh5
            r1.<init>()
            xtc r6 = r1.a
            defpackage.obe.C(r6, r8)
            pg5 r8 = defpackage.pg5.b
            hi5 r8 = defpackage.rs8.c(r1, r8, r1, r9)
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r5) goto L5d
            goto L94
        L5d:
            oh5 r9 = (defpackage.oh5) r9
            java.lang.Object r7 = r7.c
            s46 r7 = (defpackage.s46) r7
            te5 r8 = r9.y0()
            oh5 r8 = r8.d()
            ii5 r8 = r8.e()
            boolean r8 = defpackage.uue.B(r8)
            if (r8 == 0) goto Lb1
            te5 r8 = r9.y0()
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            gi1 r1 = defpackage.cm9.a(r9)
            nsc r9 = defpackage.cm9.d(r9)     // Catch: java.lang.Throwable -> L84
            goto L85
        L84:
            r9 = r4
        L85:
            isc r3 = new isc
            r3.<init>(r1, r9)
            r0.a = r7
            r0.d = r2
            java.lang.Object r9 = r8.a(r3, r0)
            if (r9 != r5) goto L95
        L94:
            return r5
        L95:
            if (r9 == 0) goto Lab
            java.lang.String r9 = (java.lang.String) r9
            r7.getClass()
            uc8 r8 = defpackage.vc8.Companion
            s76 r8 = r8.serializer()
            s76 r8 = (defpackage.s76) r8
            java.lang.Object r7 = r7.a(r8, r9)
            vc8 r7 = (defpackage.vc8) r7
            return r7
        Lab:
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            defpackage.xk5.k(r7)
            return r4
        Lb1:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not download discovery document: "
            r8.<init>(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb5.n(vyc, n42):java.lang.Object");
    }

    public void o(String str, PrintWriter printWriter) {
        boolean z;
        ls6 ls6Var = (ls6) this.c;
        if (ls6Var.b.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String concat = str.concat("    ");
            int i = 0;
            while (true) {
                bwa bwaVar = ls6Var.b;
                if (i < bwaVar.c) {
                    ks6 ks6Var = (ks6) bwaVar.e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(ls6Var.b.c(i));
                    printWriter.print(": ");
                    printWriter.println(ks6Var.toString());
                    printWriter.print(concat);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(concat);
                    printWriter.print("mLoader=");
                    printWriter.println(ks6Var.l);
                    awd awdVar = ks6Var.l;
                    String concat2 = concat.concat("  ");
                    awdVar.getClass();
                    printWriter.print(concat2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(awdVar.a);
                    if (awdVar.b || awdVar.e) {
                        printWriter.print(concat2);
                        printWriter.print("mStarted=");
                        printWriter.print(awdVar.b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(awdVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (awdVar.c || awdVar.d) {
                        printWriter.print(concat2);
                        printWriter.print("mAbandoned=");
                        printWriter.print(awdVar.c);
                        printWriter.print(" mReset=");
                        printWriter.println(awdVar.d);
                    }
                    if (awdVar.g != null) {
                        printWriter.print(concat2);
                        printWriter.print("mTask=");
                        printWriter.print(awdVar.g);
                        printWriter.print(" waiting=");
                        awdVar.g.getClass();
                        printWriter.println(false);
                    }
                    if (awdVar.h != null) {
                        printWriter.print(concat2);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(awdVar.h);
                        printWriter.print(" waiting=");
                        awdVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (ks6Var.n != null) {
                        printWriter.print(concat);
                        printWriter.print("mCallbacks=");
                        printWriter.println(ks6Var.n);
                        ih1 ih1Var = ks6Var.n;
                        String concat3 = concat.concat("  ");
                        ih1Var.getClass();
                        printWriter.print(concat3);
                        printWriter.print("mDeliveredData=");
                        printWriter.println(ih1Var.b);
                    }
                    printWriter.print(concat);
                    printWriter.print("mData=");
                    awd awdVar2 = ks6Var.l;
                    Object obj2 = ks6Var.e;
                    if (obj2 != zu7.k) {
                        obj = obj2;
                    }
                    awdVar2.getClass();
                    StringBuilder sb = new StringBuilder(64);
                    if (obj == null) {
                        sb.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb.append(cls.getSimpleName());
                        sb.append("{");
                        sb.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb.append("}");
                    }
                    printWriter.println(sb.toString());
                    printWriter.print(concat);
                    printWriter.print("mStarted=");
                    if (ks6Var.c > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    printWriter.println(z);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public File p() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        String str = "PersistedInstallation." + ((qf4) this.c).f() + ".json";
                        qf4 qf4Var = (qf4) this.c;
                        qf4Var.a();
                        File file = new File(qf4Var.a.getNoBackupFilesDir(), str);
                        this.b = file;
                        if (file.exists()) {
                            return (File) this.b;
                        }
                        qf4 qf4Var2 = (qf4) this.c;
                        qf4Var2.a();
                        File file2 = new File(qf4Var2.a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    public void q(ad0 ad0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ad0Var.a);
            jSONObject.put("Status", a82.C(ad0Var.b));
            jSONObject.put("AuthToken", ad0Var.c);
            jSONObject.put("RefreshToken", ad0Var.d);
            jSONObject.put("TokenCreationEpochInSecs", ad0Var.f);
            jSONObject.put("ExpiresInSecs", ad0Var.e);
            jSONObject.put("FisError", ad0Var.g);
            qf4 qf4Var = (qf4) this.c;
            qf4Var.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", qf4Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(p())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r15 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(android.net.Uri r14, defpackage.n42 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.nx9
            if (r0 == 0) goto L13
            r0 = r15
            nx9 r0 = (defpackage.nx9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            nx9 r0 = new nx9
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L38
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r15)
            return r15
        L2b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r13)
            return r2
        L31:
            android.net.Uri r14 = r0.a
            defpackage.hre.r(r15)
        L36:
            r8 = r14
            goto L46
        L38:
            defpackage.hre.r(r15)
            r0.a = r14
            r0.d = r4
            java.lang.Object r15 = r13.k(r14, r0)
            if (r15 != r5) goto L36
            goto L78
        L46:
            r10 = r15
            kr8 r10 = (defpackage.kr8) r10
            java.lang.Object r14 = r13.b
            d82 r14 = (defpackage.d82) r14
            r0f r15 = defpackage.r0f.I
            b82 r15 = r14.get(r15)
            if (r15 != 0) goto L7a
            abf r15 = defpackage.abf.d
            b82 r15 = r14.get(r15)
            if (r15 != 0) goto L65
            sw2 r15 = defpackage.ab3.a
            ru2 r15 = defpackage.ru2.c
            d82 r14 = r14.plus(r15)
        L65:
            ca r6 = new ca
            r11 = 0
            r12 = 5
            r9 = 0
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.a = r2
            r0.d = r3
            java.lang.Object r13 = defpackage.z87.E(r14, r6, r0)
            if (r13 != r5) goto L79
        L78:
            return r5
        L79:
            return r13
        L7a:
            java.lang.String r13 = "coroutineContext may not contain a Job"
            defpackage.vs.k(r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb5.r(android.net.Uri, n42):java.lang.Object");
    }

    public void s(Bundle bundle) {
        sy9 sy9Var = (sy9) this.b;
        ty9 ty9Var = sy9Var.a;
        if (!sy9Var.e) {
            sy9Var.a();
        }
        if (ty9Var.k().h.compareTo(kn6.d) < 0) {
            if (!sy9Var.g) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    bundle2 = cwe.j("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
                }
                sy9Var.f = bundle2;
                sy9Var.g = true;
                return;
            }
            vs.k("SavedStateRegistry was already restored.");
            return;
        }
        cy7.c(ty9Var.k().h, "performRestore cannot be called when owner is ");
    }

    public void t(Bundle bundle) {
        sy9 sy9Var = (sy9) this.b;
        Bundle v = jsc.v((yk8[]) Arrays.copyOf(new yk8[0], 0));
        Bundle bundle2 = sy9Var.f;
        if (bundle2 != null) {
            v.putAll(bundle2);
        }
        synchronized (sy9Var.c) {
            for (Map.Entry entry : sy9Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((ry9) entry.getValue()).a();
                str.getClass();
                v.putBundle(str, a);
            }
        }
        if (!v.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", v);
        }
    }

    @Override // defpackage.dy5
    public zx5 toInstant() {
        throw new IllegalArgumentException(((String) this.b) + " when parsing an Instant from \"" + pye.t((CharSequence) this.c, 64) + '\"');
    }

    public String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb = new StringBuilder((int) Token.CASE);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((un6) this.b).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ad0 u() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(p());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = ad0.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = a82.D(5)[optInt];
        if (i2 != 0) {
            byte b2 = (byte) (((byte) (b | 2)) | 1);
            if (b2 == 3 && i2 != 0) {
                return new ad0(i2, optLong2, optLong, optString, optString2, optString3, optString4);
            }
            StringBuilder sb = new StringBuilder();
            if (i2 == 0) {
                sb.append(" registrationStatus");
            }
            if ((b2 & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((b2 & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            vs.k(s21.o("Missing required properties:", sb));
            return null;
        }
        xk5.k("Null registrationStatus");
        return null;
    }

    public void v(ls7 ls7Var) {
        tv7 tv7Var = (tv7) this.b;
        Object g = ((tv7) this.c).g(ls7Var);
        if (g != null) {
            if (g instanceof kv7) {
                kv7 kv7Var = (kv7) g;
                Object[] objArr = kv7Var.a;
                int i = kv7Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj = objArr[i2];
                    obj.getClass();
                    bu7.c(tv7Var, (js7) obj, new cl7(ls7Var, 9));
                }
                return;
            }
            bu7.c(tv7Var, (js7) g, new cl7(ls7Var, 9));
        }
    }

    @Override // defpackage.l6b
    public void cancel() {
    }

    public /* synthetic */ eb5(int i, boolean z) {
        this.a = i;
    }

    public eb5(String str, apa apaVar, uo3 uo3Var, ym0 ym0Var, wm0 wm0Var) {
        this.a = 29;
        str.getClass();
        apaVar.getClass();
        uo3Var.getClass();
        ym0Var.getClass();
        wm0Var.getClass();
        this.b = str;
        this.c = uo3Var;
    }

    public eb5(re5 re5Var) {
        this.a = 14;
        re5Var.getClass();
        this.b = re5Var;
        this.c = wq9.d(new bo7(27));
    }

    public eb5(sy9 sy9Var) {
        this.a = 26;
        this.b = sy9Var;
        this.c = new s26(sy9Var);
    }

    public eb5(oe4 oe4Var, f61 f61Var) {
        this.a = 12;
        oe4Var.getClass();
        this.b = oe4Var;
        this.c = f61Var;
    }

    public eb5(un6 un6Var, qdd qddVar) {
        this.a = 5;
        this.b = un6Var;
        qddVar.getClass();
        ob2 ob2Var = ob2.b;
        ob2Var.getClass();
        odd oddVar = new odd(qddVar, ls6.d, ob2Var);
        gi1 a = cm9.a(ls6.class);
        String f = a.f();
        if (f != null) {
            this.c = (ls6) oddVar.a(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        } else {
            vs.m("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public eb5(psa psaVar) {
        this.a = 2;
        psaVar.getClass();
        this.c = psaVar;
    }

    public eb5(yj yjVar) {
        this.a = 16;
        this.b = yjVar;
    }

    public eb5(Context context) {
        this.a = 25;
        this.b = gs3.a;
        this.c = context.getApplicationContext();
    }

    public eb5(qf4 qf4Var) {
        this.a = 18;
        this.c = qf4Var;
    }

    public eb5(sh6 sh6Var) {
        this.a = 4;
        this.b = sh6Var;
        gv7 gv7Var = h78.a;
        this.c = new gv7();
    }

    public eb5(mm9 mm9Var, int[] iArr) {
        this.a = 10;
        this.b = qs5.l(mm9Var);
        this.c = iArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb5(int i, Integer num, String str) {
        this(23, (i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
        this.a = 23;
    }

    public eb5(CharSequence charSequence, String str) {
        this.a = 1;
        charSequence.getClass();
        this.b = str;
        this.c = charSequence;
    }

    public /* synthetic */ eb5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
