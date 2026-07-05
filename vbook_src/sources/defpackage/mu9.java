package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mu9  reason: default package */
/* loaded from: classes.dex */
public class mu9 implements c2f, ry8, rz6, bd, tu0, SuccessContinuation, mm1, q78, na4, v26, nw6 {
    public static mu9 b;
    public Object a;
    public static final nu9 c = new nu9(0, 0, 0, false, false);
    public static final je8 d = new je8(1);
    public static final je8 e = new je8(0);
    public static final byte[] f = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    public static final byte[] C = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.SecurityManager] */
    public mu9(int i, boolean z) {
        int i2;
        y1d y1dVar;
        Class cls = null;
        switch (i) {
            case 20:
                this.a = null;
                return;
            case 24:
                int i3 = sw6.a;
                pw6 b2 = sw6.b(re5.class.getName());
                if (sw6.d) {
                    y1d y1dVar2 = z1d.a;
                    y1d y1dVar3 = y1dVar2;
                    if (y1dVar2 == null) {
                        if (z1d.b) {
                            y1dVar3 = null;
                        } else {
                            try {
                                y1dVar = new SecurityManager();
                            } catch (SecurityException unused) {
                                y1dVar = null;
                            }
                            z1d.a = y1dVar;
                            z1d.b = true;
                            y1dVar3 = y1dVar;
                        }
                    }
                    if (y1dVar3 != null) {
                        Class[] classContext = y1dVar3.getClassContext();
                        String name = z1d.class.getName();
                        int i4 = 0;
                        while (i4 < classContext.length && !name.equals(classContext[i4].getName())) {
                            i4++;
                        }
                        if (i4 < classContext.length && (i2 = i4 + 2) < classContext.length) {
                            cls = classContext[i2];
                        } else {
                            vs.k("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                            throw null;
                        }
                    }
                    if (cls != null && !cls.isAssignableFrom(re5.class)) {
                        op9.e("Detected logger name mismatch. Given name: \"" + b2.getName() + "\"; computed name: \"" + cls.getName() + "\".");
                        op9.e("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
                    }
                }
                this.a = b2;
                return;
            case 28:
                this.a = new ConcurrentHashMap();
                return;
            case 29:
                this.a = new my6((Object) null);
                return;
            default:
                new ThreadLocal();
                this.a = new InheritableThreadLocal();
                return;
        }
    }

    public static di6 B(mu9 mu9Var, int i) {
        xt4 xt4Var;
        kj6 kj6Var = (kj6) mu9Var.a;
        zqa f2 = pae.f();
        if (f2 != null) {
            xt4Var = f2.e();
        } else {
            xt4Var = null;
        }
        xt4 xt4Var2 = xt4Var;
        zqa h = pae.h(f2);
        try {
            fj6 fj6Var = (fj6) kj6Var.f.getValue();
            pae.n(f2, h, xt4Var2);
            return kj6Var.q.a(i, fj6Var.j, kj6Var.d, new vb6(i, fj6Var));
        } catch (Throwable th) {
            pae.n(f2, h, xt4Var2);
            throw th;
        }
    }

    public static String C(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static /* synthetic */ void E(mu9 mu9Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        mu9Var.D(f2, f3);
    }

    public static mu9 F() {
        Provider C2 = cae.C();
        if (C2 != null) {
            KeyFactory.getInstance("XDH", C2);
            KeyAgreement.getInstance("XDH", C2);
            mu9 mu9Var = new mu9(C2);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", C2);
            keyPairGenerator.initialize(255);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            byte[] encoded = generateKeyPair.getPrivate().getEncoded();
            if (encoded.length == 48) {
                if (k7f.b(f, encoded)) {
                    Arrays.copyOfRange(encoded, 16, encoded.length);
                    byte[] encoded2 = generateKeyPair.getPublic().getEncoded();
                    if (encoded2.length == 44) {
                        if (k7f.b(C, encoded2)) {
                            Arrays.copyOfRange(encoded2, 12, encoded2.length);
                            return mu9Var;
                        }
                        hfd.j("Invalid encoded public key prefix");
                        return null;
                    }
                    hfd.j("Invalid encoded public key length");
                    return null;
                }
                hfd.j("Invalid encoded private key prefix");
                return null;
            }
            hfd.j("Invalid encoded private key length");
            return null;
        }
        hfd.j("Conscrypt is not available.");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [mu9, java.lang.Object] */
    public static synchronized mu9 s() {
        mu9 mu9Var;
        synchronized (mu9.class) {
            try {
                if (b == null) {
                    b = new Object();
                }
                mu9Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mu9Var;
    }

    public void A(float f2, float f3, long j) {
        k61 w = ((ij1) this.a).w();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        w.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        w.c(f2, f3);
        w.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void D(float f2, float f3) {
        ((ij1) this.a).w().p(f2, f3);
    }

    @Override // defpackage.c2f
    public byte[] a(byte[] bArr, byte[] bArr2) {
        Provider provider = (Provider) this.a;
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", provider);
        if (bArr.length == 32) {
            PrivateKey generatePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(yqe.H(f, bArr)));
            if (bArr2.length == 32) {
                PublicKey generatePublic = keyFactory.generatePublic(new X509EncodedKeySpec(yqe.H(C, bArr2)));
                KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", provider);
                keyAgreement.init(generatePrivate);
                keyAgreement.doPhase(generatePublic, true);
                return keyAgreement.generateSecret();
            }
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        throw new InvalidKeyException("Invalid X25519 private key");
    }

    @Override // defpackage.tu0
    public void b(l92 l92Var) {
        this.a = l92Var;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // defpackage.ry8
    public void c(qy8 qy8Var) {
        if (qy8Var == qy8.c) {
            v.z((v) this.a);
        }
    }

    @Override // defpackage.rz6
    public void clear() {
        si0 si0Var = (si0) this.a;
        Map map = (Map) si0Var.get();
        if (map != null) {
            map.clear();
            si0Var.remove();
        }
    }

    @Override // defpackage.mm1
    public long d() {
        z03 z03Var = (z03) this.a;
        long d2 = z03Var.P.d();
        if (d2 != 16) {
            return d2;
        }
        ft9 ft9Var = (ft9) nye.q(z03Var, jt9.b);
        if (ft9Var != null) {
            long j = ft9Var.a;
            if (j != 16) {
                return j;
            }
        }
        return ((zl1) nye.q(z03Var, r12.a)).a;
    }

    @Override // defpackage.rz6
    public void e(Map map) {
        HashMap hashMap;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        ((si0) this.a).set(hashMap);
    }

    @Override // defpackage.q78
    public void f(Object obj) {
        un6 un6Var = (un6) obj;
        v53 v53Var = (v53) this.a;
        if (un6Var != null && v53Var.v0) {
            throw new IllegalStateException("Fragment " + v53Var + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // defpackage.k99
    public Object get() {
        qf4 qf4Var = (qf4) ((nt2) this.a).a;
        qf4Var.getClass();
        bba bbaVar = bba.a;
        return bba.a(qf4Var);
    }

    @Override // defpackage.v26
    public Object h(String str, Object[] objArr) {
        objArr.getClass();
        return z87.C(gs3.a, new r9((List) this.a, str, objArr, (m42) null, 17));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [we2, java.lang.Object] */
    public we2 i() {
        Context context = (Context) this.a;
        if (context != null) {
            ?? obj = new Object();
            obj.a = se3.a(ry3.a);
            u4 u4Var = new u4(context, 3);
            obj.b = u4Var;
            obj.c = se3.a(new eb5(7, u4Var, new n07(u4Var, 11)));
            u4 u4Var2 = obj.b;
            obj.d = new xk9(u4Var2, 3);
            k99 a = se3.a(new s26(18, obj.d, se3.a(new n07(u4Var2, 17))));
            obj.e = a;
            d38 d38Var = new d38(3);
            u4 u4Var3 = obj.b;
            yx9 yx9Var = new yx9(1, u4Var3, a, d38Var);
            k99 k99Var = obj.a;
            k99 k99Var2 = obj.c;
            obj.f = se3.a(new yx9(9, new bm1(k99Var, k99Var2, yx9Var, a, a, 5), new qu1(u4Var3, k99Var2, a, yx9Var, k99Var, a, a), new odd(k99Var, a, yx9Var, a, 3)));
            return obj;
        }
        String canonicalName = Context.class.getCanonicalName();
        throw new IllegalStateException(canonicalName + " must be set");
    }

    @Override // defpackage.bd
    public void j(String str, Bundle bundle) {
        l92 l92Var = (l92) this.a;
        if (l92Var != null) {
            try {
                final String str2 = "$A$:" + C(str, bundle);
                final o92 o92Var = l92Var.a;
                final long currentTimeMillis = System.currentTimeMillis() - o92Var.d;
                ((wa2) o92Var.o.b).b(new Callable() { // from class: m92
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        o92 o92Var2 = o92.this;
                        return ((wa2) o92Var2.o.c).a(new n92(o92Var2, currentTimeMillis, str2));
                    }
                });
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // defpackage.rz6
    public Map k() {
        Map map = (Map) ((si0) this.a).get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public void l() {
        boolean isTerminated;
        for (Object obj : ((ConcurrentHashMap) this.a).values()) {
            obj.getClass();
            kq8 kq8Var = (kq8) obj;
            if (kq8Var instanceof AutoCloseable) {
                kq8Var.close();
            } else if (kq8Var instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) kq8Var;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (kq8Var instanceof TypedArray) {
                ((TypedArray) kq8Var).recycle();
            } else if (kq8Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) kq8Var).release();
            } else if (kq8Var instanceof MediaDrm) {
                ((MediaDrm) kq8Var).release();
            } else {
                p1a.g();
                return;
            }
        }
    }

    @Override // defpackage.nw6
    public void m(String str) {
        str.getClass();
        ((pw6) this.a).g(str);
    }

    public void n(float f2, float f3, float f4, float f5, int i) {
        ((ij1) this.a).w().o(f2, f3, f4, f5, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(defpackage.db1 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.p78
            if (r0 == 0) goto L13
            r0 = r6
            p78 r0 = (defpackage.p78) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p78 r0 = new p78
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return
        L27:
            gt1 r4 = defpackage.a82.e(r6)
            throw r4
        L2c:
            defpackage.hre.r(r6)
            java.lang.Object r4 = r4.a
            cza r4 = (defpackage.cza) r4
            r0.c = r2
            r4.a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu9.o(db1, n42):void");
    }

    public void p() {
        ((px1) this.a).getClass();
    }

    public gt4 q() {
        return null;
    }

    public al3 r() {
        return (al3) this.a;
    }

    public kq8 t(int i, vt4 vt4Var, boolean z) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        if (!z) {
            return (kq8) vt4Var.invoke();
        }
        kq8 kq8Var = (kq8) concurrentHashMap.get(Integer.valueOf(i));
        if (kq8Var == null) {
            kq8 kq8Var2 = (kq8) vt4Var.invoke();
            concurrentHashMap.put(Integer.valueOf(i), kq8Var2);
            return kq8Var2;
        }
        return kq8Var;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        zda zdaVar = (zda) obj;
        kw5 kw5Var = (kw5) this.a;
        if (zdaVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        i92 i92Var = (i92) kw5Var.c;
        i92.a(i92Var);
        i92Var.m.C(null, (wa2) i92Var.e.b);
        i92Var.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public UUID u() {
        return h31.a;
    }

    public int v() {
        return 1;
    }

    public void w(float f2, float f3, float f4, float f5) {
        ij1 ij1Var = (ij1) this.a;
        k61 w = ij1Var.w();
        float intBitsToFloat = Float.intBitsToFloat((int) (ij1Var.G() >> 32)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ij1Var.G() & 4294967295L)) - (f5 + f3)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < nae.e || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < nae.e) {
            kv5.a("Width and height must be greater than or equal to zero");
        }
        ij1Var.Y(floatToRawIntBits);
        w.p(f2, f3);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ejf, java.lang.Object] */
    public ejf x(eb5 eb5Var, rg rgVar) {
        long j;
        boolean z;
        long L;
        my6 my6Var = (my6) this.a;
        List list = (List) eb5Var.b;
        my6 my6Var2 = new my6(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            b19 b19Var = (b19) list.get(i);
            long j2 = b19Var.a;
            a19 a19Var = (a19) my6Var.b(j2);
            if (a19Var == null) {
                j = b19Var.b;
                L = b19Var.d;
                z = false;
            } else {
                long j3 = a19Var.a;
                j = j3;
                z = a19Var.c;
                L = rgVar.L(a19Var.b);
            }
            long j4 = b19Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            my6Var2.d(new z09(j4, b19Var.b, b19Var.d, b19Var.e, b19Var.f, j, L, z, b19Var.g, b19Var.i, b19Var.j, b19Var.k, b19Var.l, b19Var.m), j4);
            boolean z2 = b19Var.e;
            if (z2) {
                my6Var.d(new a19(b19Var.b, b19Var.c, z2), j2);
            } else {
                my6Var.e(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        ?? obj = new Object();
        obj.b = my6Var2;
        obj.c = eb5Var;
        return obj;
    }

    public void z(float f2, long j) {
        k61 w = ((ij1) this.a).w();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        w.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        w.d(f2);
        w.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void g(cl3 cl3Var) {
    }

    public void y(cl3 cl3Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r6 == 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[LOOP:1: B:21:0x0042->B:22:0x0044, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mu9(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r24
            r22.<init>()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            yy[][] r3 = new defpackage.yy[r1]
            r4 = 0
            r6 = r2
            r7 = r6
            r5 = r4
        Le:
            if (r5 >= r1) goto L73
            r8 = r23[r5]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L24
            if (r8 == r2) goto L2d
            if (r8 == r10) goto L2b
            if (r8 == r9) goto L26
            r9 = 4
            if (r8 == r9) goto L24
            r9 = 5
            if (r8 == r9) goto L24
            r12 = r7
            goto L2f
        L24:
            r12 = r9
            goto L2f
        L26:
            if (r6 != r2) goto L2d
            goto L2b
        L29:
            r12 = r6
            goto L2f
        L2b:
            r6 = r10
            goto L29
        L2d:
            r6 = r2
            goto L29
        L2f:
            r7 = r25[r5]
            int r8 = r5 + 1
            r9 = r25[r8]
            r13 = r0[r5]
            r14 = r0[r8]
            int r11 = r7.length
            int r11 = r11 / r10
            int r15 = r7.length
            int r15 = r15 % r10
            int r10 = r15 + r11
            yy[] r11 = new defpackage.yy[r10]
            r15 = r4
        L42:
            if (r15 >= r10) goto L6c
            int r16 = r15 * 2
            r17 = r11
            yy r11 = new yy
            r18 = r15
            r15 = r7[r16]
            int r19 = r16 + 1
            r20 = r16
            r16 = r7[r19]
            r20 = r9[r20]
            r19 = r9[r19]
            r21 = r19
            r19 = r17
            r17 = r20
            r20 = r18
            r18 = r21
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r19[r20] = r11
            int r15 = r20 + 1
            r11 = r19
            goto L42
        L6c:
            r19 = r11
            r3[r5] = r19
            r5 = r8
            r7 = r12
            goto Le
        L73:
            r5 = r22
            r5.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu9.<init>(int[], float[], float[][]):void");
    }

    public /* synthetic */ mu9(Object obj) {
        this.a = obj;
    }
}
