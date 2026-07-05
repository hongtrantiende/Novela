package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z45  reason: default package */
/* loaded from: classes3.dex */
public final class z45 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z45(ymb ymbVar, int i, jwb jwbVar, aw7 aw7Var, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.a = 12;
        this.d = ymbVar;
        this.b = i;
        this.e = jwbVar;
        this.c = aw7Var;
        this.f = aw7Var2;
    }

    private final Object o(Object obj) {
        bo0 bo0Var = (bo0) this.f;
        int i = this.b;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        try {
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.b = 3;
            bo0Var.invoke(message, this);
            if (pvcVar == n82Var) {
            }
        }
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    hre.r(obj);
                } else {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                hre.r(obj);
            }
        } else {
            hre.r(obj);
            URLConnection openConnection = nn9.a((nn9) this.d).openConnection();
            openConnection.getClass();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : ((Map) this.e).entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                this.b = 1;
                if (((z38) this.c).invoke(jSONObject, this) == n82Var) {
                    return n82Var;
                }
            } else {
                this.b = 2;
                bo0Var.invoke("Bad response code: " + responseCode, this);
                if (pvcVar == n82Var) {
                    return n82Var;
                }
            }
        }
        return pvcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            zl9 r0 = (defpackage.zl9) r0
            java.lang.Object r1 = r12.e
            zl9 r1 = (defpackage.zl9) r1
            java.lang.Object r2 = r12.f
            yl9 r2 = (defpackage.yl9) r2
            java.lang.Object r3 = r12.d
            f7a r3 = (defpackage.f7a) r3
            n7a r4 = r3.a
            int r5 = r12.b
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L24
            if (r5 != r7) goto L1e
            defpackage.hre.r(r13)
            goto L42
        L1e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r6
        L24:
            defpackage.hre.r(r13)
            sx8 r13 = r3.Q
            if (r13 == 0) goto L45
            java.lang.Object r5 = r1.a
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.Object r8 = r0.a
            fxb r8 = (defpackage.fxb) r8
            long r8 = r8.a
            r12.b = r7
            xx8 r13 = (defpackage.xx8) r13
            java.lang.Object r13 = r13.f(r5, r8, r12)
            n82 r12 = defpackage.n82.a
            if (r13 != r12) goto L42
            return r12
        L42:
            fxb r13 = (defpackage.fxb) r13
            goto L46
        L45:
            r13 = r6
        L46:
            pvc r12 = defpackage.pvc.a
            if (r13 == 0) goto Lb1
            long r7 = r13.a
            java.lang.Object r13 = r0.a
            boolean r13 = defpackage.fxb.b(r13, r7)
            if (r13 != 0) goto Lb1
            cv7 r13 = r4.c
            long r9 = r2.a
            java.lang.Object r13 = r13.e(r9)
            cu7 r13 = (defpackage.cu7) r13
            if (r13 == 0) goto Lb1
            ps r0 = r13.e()
            java.lang.Object r1 = r1.a
            if (r0 != r1) goto Lb1
            p6a r13 = r13.c
            java.lang.Object r13 = r13.invoke()
            fvb r13 = (defpackage.fvb) r13
            if (r13 != 0) goto L73
            goto Lb1
        L73:
            g6a r0 = new g6a
            f6a r1 = new f6a
            r5 = 32
            long r9 = r7 >> r5
            int r5 = (int) r9
            oq9 r9 = defpackage.lye.n(r13, r5)
            long r10 = r2.a
            r1.<init>(r9, r5, r10)
            f6a r5 = new f6a
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            int r7 = (int) r7
            oq9 r13 = defpackage.lye.n(r13, r7)
            long r8 = r2.a
            r5.<init>(r13, r7, r8)
            r13 = 0
            r0.<init>(r1, r5, r13)
            cv7 r13 = defpackage.zx6.a
            cv7 r13 = new cv7
            r13.<init>()
            r13.i(r0, r8)
            hm8 r1 = r4.k
            r1.setValue(r13)
            xt4 r13 = r3.d
            r13.invoke(r0)
            r3.N = r6
        Lb1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r9 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.e
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            int r1 = r8.b
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1c
            java.lang.Object r8 = r8.c
            nba r8 = (defpackage.nba) r8
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L19
            goto L75
        L19:
            r9 = move-exception
            goto L89
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L22:
            java.lang.Object r1 = r8.c
            nba r1 = (defpackage.nba) r1
            defpackage.hre.r(r9)
            goto L63
        L2a:
            defpackage.hre.r(r9)
            java.lang.Object r9 = r8.c
            m82 r9 = (defpackage.m82) r9
            nba r1 = new nba
            d82 r6 = r9.q()
            w26 r6 = defpackage.k27.r(r6)
            java.lang.Object r7 = r8.d
            xt4 r7 = (defpackage.xt4) r7
            java.lang.Object r9 = r7.invoke(r9)
            r1.<init>(r6, r9)
            java.lang.Object r9 = r0.getAndSet(r1)
            nba r9 = (defpackage.nba) r9
            if (r9 == 0) goto L63
            w26 r9 = r9.a
            r8.c = r1
            r8.b = r4
            r9.cancel(r2)
            java.lang.Object r9 = r9.join(r8)
            if (r9 != r5) goto L5e
            goto L60
        L5e:
            pvc r9 = defpackage.pvc.a
        L60:
            if (r9 != r5) goto L63
            goto L73
        L63:
            java.lang.Object r9 = r8.f     // Catch: java.lang.Throwable -> L86
            lu4 r9 = (defpackage.lu4) r9     // Catch: java.lang.Throwable -> L86
            java.lang.Object r4 = r1.b     // Catch: java.lang.Throwable -> L83
            r8.c = r1     // Catch: java.lang.Throwable -> L83
            r8.b = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r9.invoke(r4, r8)     // Catch: java.lang.Throwable -> L83
            if (r9 != r5) goto L74
        L73:
            return r5
        L74:
            r8 = r1
        L75:
            boolean r1 = r0.compareAndSet(r8, r2)
            if (r1 == 0) goto L7c
            goto L82
        L7c:
            java.lang.Object r1 = r0.get()
            if (r1 == r8) goto L75
        L82:
            return r9
        L83:
            r9 = move-exception
        L84:
            r8 = r1
            goto L89
        L86:
            r8 = move-exception
            r9 = r8
            goto L84
        L89:
            boolean r1 = r0.compareAndSet(r8, r2)
            if (r1 != 0) goto L96
            java.lang.Object r1 = r0.get()
            if (r1 != r8) goto L96
            goto L89
        L96:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010e, code lost:
        if (r0 == r14) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:7:0x0020, B:46:0x0111, B:47:0x0117, B:14:0x0034, B:29:0x0096, B:21:0x0065, B:25:0x0077, B:31:0x009c, B:34:0x00ae, B:37:0x00be, B:39:0x00cd, B:43:0x00de, B:48:0x011d, B:49:0x0124), top: B:66:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:7:0x0020, B:46:0x0111, B:47:0x0117, B:14:0x0034, B:29:0x0096, B:21:0x0065, B:25:0x0077, B:31:0x009c, B:34:0x00ae, B:37:0x00be, B:39:0x00cd, B:43:0x00de, B:48:0x011d, B:49:0x0124), top: B:66:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.e
            uja r0 = (defpackage.uja) r0
            java.util.List r0 = r0.b
            java.lang.Object r1 = r12.d
            sja r1 = (defpackage.sja) r1
            int r2 = r12.b
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L1e
            if (r2 != r5) goto L18
            defpackage.hre.r(r13)
            r11 = r12
            goto L57
        L18:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r3
        L1e:
            defpackage.hre.r(r13)
            cza r13 = r1.e
            if (r13 == 0) goto L38
        L25:
            java.lang.Object r2 = r13.getValue()
            r6 = r2
            uja r6 = (defpackage.uja) r6
            r7 = 255(0xff, float:3.57E-43)
            uja r6 = defpackage.uja.a(r6, r3, r4, r5, r7)
            boolean r2 = r13.l(r2, r6)
            if (r2 == 0) goto L25
        L38:
            int r10 = r0.size()
            java.lang.Object r13 = r12.d
            r6 = r13
            sja r6 = (defpackage.sja) r6
            java.lang.Object r13 = r12.c
            oia r13 = (defpackage.oia) r13
            int r7 = r13.d
            int r8 = r13.e
            r12.b = r5
            r9 = 24
            r11 = r12
            java.util.ArrayList r13 = r6.n(r7, r8, r9, r10, r11)
            n82 r12 = defpackage.n82.a
            if (r13 != r12) goto L57
            return r12
        L57:
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r12 = r11.f
            ilc r12 = (defpackage.ilc) r12
            java.util.ArrayList r12 = defpackage.sja.j(r1, r13, r12)
            java.util.ArrayList r12 = defpackage.sl1.n0(r0, r12)
            cza r13 = r1.e
            if (r13 == 0) goto L8a
        L69:
            java.lang.Object r0 = r13.getValue()
            r2 = r0
            uja r2 = (defpackage.uja) r2
            int r3 = r12.size()
            long r6 = (long) r3
            long r8 = r1.D
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L7d
            r3 = r5
            goto L7e
        L7d:
            r3 = r4
        L7e:
            r6 = 125(0x7d, float:1.75E-43)
            uja r2 = defpackage.uja.a(r2, r12, r3, r4, r6)
            boolean r0 = r13.l(r0, r2)
            if (r0 == 0) goto L69
        L8a:
            pvc r12 = defpackage.pvc.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) {
        int size;
        k2a k2aVar = (k2a) this.f;
        List list = (List) this.e;
        int i = this.b;
        pvc pvcVar = pvc.a;
        Integer num = null;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        if (((vza) this.d) == vza.b && !list.isEmpty()) {
            int i2 = w9c.b;
            String nt6Var = c16.x(by5.a.k(), b16.p()).a().toString();
            Iterator it = list.iterator();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((gd1) it.next()).b.equals(nt6Var)) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            Integer num2 = new Integer(i4);
            if (num2.intValue() >= 0) {
                num = num2;
            }
            if (num != null) {
                size = num.intValue();
            } else {
                size = list.size() - 1;
            }
            int X0 = ((r13) this.c).X0(32.0f) * size;
            int h = k2aVar.f.h();
            if (X0 > h) {
                X0 = h;
            }
            if (X0 >= 0) {
                i3 = X0;
            }
            this.b = 1;
            Object p = jxe.p(k2aVar, i3 - k2aVar.a.h(), this);
            n82 n82Var = n82.a;
            if (p == n82Var) {
                return n82Var;
            }
        }
        return pvcVar;
    }

    private final Object u(Object obj) {
        sq9 sq9Var = (sq9) this.c;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return obj;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.c = null;
        this.b = 1;
        Object x = yqe.x((y3b) this.d, (ArrayList) this.e, (ns2) this.f, sq9Var, this);
        n82 n82Var = n82.a;
        if (x == n82Var) {
            return n82Var;
        }
        return x;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.v(java.lang.Object):java.lang.Object");
    }

    private final Object w(Object obj) {
        Object gs9Var;
        f76 f76Var = (f76) this.e;
        vhb vhbVar = (vhb) this.d;
        s02 s02Var = vhbVar.C;
        m82 m82Var = (m82) this.c;
        int i = this.b;
        pvc pvcVar = pvc.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    hre.r(obj);
                } else {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                hre.r(obj);
                cs9 cs9Var = (cs9) this.f;
                a2c a2cVar = vhbVar.c;
                this.c = null;
                this.b = 1;
                Object r = ((i2c) a2cVar).r(f76Var, cs9Var, this);
                n82 n82Var = n82.a;
                if (r == n82Var) {
                    return n82Var;
                }
            }
            gs9Var = pvcVar;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            pvc pvcVar2 = (pvc) gs9Var;
            vhbVar.h(s02Var, new nhb(f76Var.getName()));
        }
        if (hs9.a(gs9Var) != null) {
            vhbVar.h(s02Var, new mhb(f76Var.getName()));
        }
        return pvcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            m82 r0 = (defpackage.m82) r0
            int r0 = r8.b
            r1 = 3
            r2 = 2
            r3 = 1
            pvc r4 = defpackage.pvc.a
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r0 == 0) goto L36
            if (r0 == r3) goto L2e
            if (r0 == r2) goto L26
            if (r0 != r1) goto L20
            java.lang.Object r8 = r8.d
            af r8 = (defpackage.af) r8
            m82 r8 = (defpackage.m82) r8
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L6b
            return r4
        L20:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r5
        L26:
            java.lang.Object r0 = r8.d
            af r0 = (defpackage.af) r0
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L6b
            goto L5f
        L2e:
            java.lang.Object r0 = r8.d
            af r0 = (defpackage.af) r0
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L6b
            goto L53
        L36:
            defpackage.hre.r(r9)
            java.lang.Object r9 = r8.e
            af r9 = (defpackage.af) r9
            java.lang.Object r0 = r8.f
            java.lang.String r0 = (java.lang.String) r0
            nyc r7 = new nyc     // Catch: java.lang.Throwable -> L6b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            r8.c = r5     // Catch: java.lang.Throwable -> L6b
            r8.d = r9     // Catch: java.lang.Throwable -> L6b
            r8.b = r3     // Catch: java.lang.Throwable -> L6b
            r9.c(r7)     // Catch: java.lang.Throwable -> L6b
            if (r4 != r6) goto L52
            goto L6a
        L52:
            r0 = r9
        L53:
            r8.c = r5     // Catch: java.lang.Throwable -> L6b
            r8.d = r0     // Catch: java.lang.Throwable -> L6b
            r8.b = r2     // Catch: java.lang.Throwable -> L6b
            r0.b()     // Catch: java.lang.Throwable -> L6b
            if (r4 != r6) goto L5f
            goto L6a
        L5f:
            r8.c = r5     // Catch: java.lang.Throwable -> L6b
            r8.d = r5     // Catch: java.lang.Throwable -> L6b
            r8.b = r1     // Catch: java.lang.Throwable -> L6b
            r0.d()     // Catch: java.lang.Throwable -> L6b
            if (r4 != r6) goto L6b
        L6a:
            return r6
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (((defpackage.yld) r8).f(r3, r0, r11, r10) == r9) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.e
            f76 r0 = (defpackage.f76) r0
            java.lang.Object r1 = r10.d
            cqb r1 = (defpackage.cqb) r1
            s02 r2 = r1.f
            java.lang.Object r3 = r10.c
            m82 r3 = (defpackage.m82) r3
            int r3 = r10.b
            pvc r4 = defpackage.pvc.a
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L27
            if (r3 == r6) goto L1b
            if (r3 != r5) goto L21
        L1b:
            defpackage.hre.r(r11)     // Catch: java.lang.Throwable -> L1f
            goto L5e
        L1f:
            r10 = move-exception
            goto L60
        L21:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r7
        L27:
            defpackage.hre.r(r11)
            java.lang.Object r11 = r10.f
            cs9 r11 = (defpackage.cs9) r11
            cza r3 = r1.C     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L1f
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L1f
            nld r8 = r1.d
            n82 r9 = defpackage.n82.a
            if (r3 == 0) goto L4f
            java.lang.String r3 = "general"
            r10.c = r7     // Catch: java.lang.Throwable -> L1f
            r10.b = r6     // Catch: java.lang.Throwable -> L1f
            yld r8 = (defpackage.yld) r8     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r10 = r8.f(r3, r0, r11, r10)     // Catch: java.lang.Throwable -> L1f
            if (r10 != r9) goto L5e
            goto L5d
        L4f:
            java.lang.String r3 = r1.c     // Catch: java.lang.Throwable -> L1f
            r10.c = r7     // Catch: java.lang.Throwable -> L1f
            r10.b = r5     // Catch: java.lang.Throwable -> L1f
            yld r8 = (defpackage.yld) r8     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r10 = r8.f(r3, r0, r11, r10)     // Catch: java.lang.Throwable -> L1f
            if (r10 != r9) goto L5e
        L5d:
            return r9
        L5e:
            r11 = r4
            goto L65
        L60:
            gs9 r11 = new gs9
            r11.<init>(r10)
        L65:
            boolean r10 = r11 instanceof defpackage.gs9
            if (r10 != 0) goto L78
            r10 = r11
            pvc r10 = (defpackage.pvc) r10
            upb r10 = new upb
            java.lang.String r3 = r0.getName()
            r10.<init>(r3)
            r1.h(r2, r10)
        L78:
            java.lang.Throwable r10 = defpackage.hs9.a(r11)
            if (r10 == 0) goto L8a
            tpb r10 = new tpb
            java.lang.String r11 = r0.getName()
            r10.<init>(r11)
            r1.h(r2, r10)
        L8a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.y(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new z45((i55) obj2, m42Var, 0);
            case 1:
                z45 z45Var = new z45((Context) this.d, (je) this.e, (jq) obj2, m42Var, 1);
                z45Var.c = obj;
                return z45Var;
            case 2:
                return new z45((ho5) this.d, (String) this.e, (ip5) this.c, (zl9) obj2, m42Var, 2);
            case 3:
                return new z45((ho5) this.d, (String) this.e, (ip5) this.c, (w5) obj2, m42Var, 3);
            case 4:
                z45 z45Var2 = new z45((wk3) this.d, (sq9) this.e, (ns2) obj2, m42Var, 4);
                z45Var2.c = obj;
                return z45Var2;
            case 5:
                z45 z45Var3 = new z45((aw7) this.e, (av5) obj2, m42Var, 5);
                z45Var3.c = obj;
                return z45Var3;
            case 6:
                return new z45((tb6) obj2, m42Var, 6);
            case 7:
                z45 z45Var4 = new z45((sx6) this.d, (String) this.e, (String) obj2, m42Var, 7);
                z45Var4.c = obj;
                return z45Var4;
            case 8:
                z45 z45Var5 = new z45((zu9) this.e, (t27) obj2, m42Var, 8);
                z45Var5.d = obj;
                return z45Var5;
            case 9:
                return new z45((vt4) this.d, (lq) this.e, (lf4) this.c, (aw7) obj2, m42Var, 9);
            case 10:
                return new z45((k2a) this.d, (aw7) this.e, (aw7) this.c, (aw7) obj2, m42Var, 10);
            case 11:
                z45 z45Var6 = new z45((y4a) this.d, (wz9) this.e, (tkc) obj2, m42Var, 11);
                z45Var6.c = obj;
                return z45Var6;
            case 12:
                return new z45((ymb) this.d, this.b, (jwb) this.e, (aw7) this.c, (aw7) obj2, m42Var);
            case 13:
                return new z45(13, m42Var, (Object) ((ss8) this.c), (Object) ((String) obj2), false);
            case 14:
                return new z45((kj6) this.d, (k97) this.e, (List) this.c, (ho5) obj2, m42Var, 14);
            case 15:
                return new z45((nn9) this.d, (Map) this.e, (z38) this.c, (bo0) obj2, m42Var, 15);
            case 16:
                return new z45(16, m42Var, (Object) ((sw7) this.c), (Object) ((lu4) obj2), false);
            case 17:
                return new z45((List) this.e, (String) this.c, (Object[]) obj2, m42Var);
            case 18:
                return new z45((f7a) this.d, (zl9) this.e, (zl9) this.c, (yl9) obj2, m42Var, 18);
            case 19:
                z45 z45Var7 = new z45((xt4) this.d, (AtomicReference) this.e, (lu4) obj2, m42Var, 19);
                z45Var7.c = obj;
                return z45Var7;
            case 20:
                return new z45((ey) this.d, (Context) this.e, (Throwable) this.c, (jac) obj2, m42Var, 20);
            case 21:
                z45 z45Var8 = new z45((zfa) this.e, (xfa) obj2, m42Var, 21);
                z45Var8.c = obj;
                return z45Var8;
            case 22:
                return new z45((sja) this.d, (uja) this.e, (oia) this.c, (ilc) obj2, m42Var, 22);
            case 23:
                return new z45((vza) this.d, (List) this.e, (r13) this.c, (k2a) obj2, m42Var, 23);
            case 24:
                z45 z45Var9 = new z45((y3b) this.d, (ArrayList) this.e, (ns2) obj2, m42Var, 24);
                z45Var9.c = obj;
                return z45Var9;
            case 25:
                z45 z45Var10 = new z45((web) this.d, (cs9) this.e, (f76) obj2, m42Var, 25);
                z45Var10.c = obj;
                return z45Var10;
            case 26:
                z45 z45Var11 = new z45((vhb) this.d, (f76) this.e, (cs9) obj2, m42Var, 26);
                z45Var11.c = obj;
                return z45Var11;
            case 27:
                z45 z45Var12 = new z45((af) this.e, (String) obj2, m42Var, 27);
                z45Var12.c = obj;
                return z45Var12;
            case 28:
                z45 z45Var13 = new z45((cqb) this.d, (f76) this.e, (cs9) obj2, m42Var, 28);
                z45Var13.c = obj;
                return z45Var13;
            default:
                return new z45((trb) this.d, (ytb) this.e, (d19) this.c, (a0b) obj2, m42Var, 29);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((z45) create((sq9) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82.a;
            case 6:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((z45) create((a06) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 13:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((z45) create((sq9) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((z45) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020d, code lost:
        if (r3 == r10) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026e, code lost:
        if (r0 == r10) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:?, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017f, code lost:
        if (defpackage.k27.p(r2, r21) == r10) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02af A[LOOP:0: B:144:0x02af->B:147:0x02c5, LOOP_START, PHI: r8 
      PHI: (r8v42 java.util.ArrayList) = (r8v41 java.util.ArrayList), (r8v43 java.util.ArrayList) binds: [B:143:0x02ad, B:147:0x02c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0848 A[LOOP:7: B:375:0x0842->B:377:0x0848, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:585:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:602:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v102, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v107, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v126 */
    /* JADX WARN: Type inference failed for: r1v127 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.glance.session.IdleEventBroadcastReceiver, java.lang.Object, android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r2v32, types: [wl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r5v5, types: [aab, lu4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:372:0x082c -> B:366:0x0803). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:421:0x093b -> B:425:0x095a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:423:0x0957 -> B:425:0x095a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0124 -> B:67:0x0127). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 3024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z45.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z45(int i, m42 m42Var, Object obj, Object obj2, boolean z) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z45(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z45(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z45(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z45(Object obj, Object obj2, Object obj3, Object obj4, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z45(List list, String str, Object[] objArr, m42 m42Var) {
        super(2, m42Var);
        this.a = 17;
        this.e = list;
        this.c = str;
        this.f = objArr;
    }
}
